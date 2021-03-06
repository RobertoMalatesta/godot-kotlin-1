package godot

import gdnative.godot_instance_create_func
import gdnative.godot_instance_destroy_func
import godot.core.Godot
import kotlinx.cinterop.*

@PublishedApi
internal class ClassHandle<S: Object, T: S>(
  handle: COpaquePointer,
  className: String,
  val superClassName: String,
  val info: GodotClass<S, T>,
  val isTool: Boolean
) : ClassMemberRegistry<T>(handle, className) {
  fun create(instance: COpaquePointer): T {
    val ret = Godot.noInitZone {
      info.factory()
    }
    ret._handle = instance
    return ret
  }

  fun init() {
    memScoped {
      val methodData = StableRef.create(this@ClassHandle).asCPointer()
      // register constructor and destructor
      val create = cValue<godot_instance_create_func> {
        create_func = staticCFunction(::createInstance)
        free_func = staticCFunction(::disposeClassHandle)
        method_data = methodData
      }
      val destroy = cValue<godot_instance_destroy_func> {
        destroy_func = staticCFunction(::destroyInstance)
        method_data = methodData
      }
      val registerMethod = if (isTool) {
        Godot.nativescript.godot_nativescript_register_tool_class
      } else {
        Godot.nativescript.godot_nativescript_register_class
      }
      checkNotNull(registerMethod)(
        handle,
        className.cstr.ptr,
        superClassName.cstr.ptr,
        create,
        destroy
      )
    }

    TagDB.registerType(handle, className, info.factory)
    info.setup(this)
  }
}