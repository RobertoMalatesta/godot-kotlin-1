// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PluginScript internal constructor(
  _handle: COpaquePointer
) : Script(_handle) {
  companion object {
    fun new(): PluginScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PluginScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PluginScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PluginScript(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PluginScript
     */
    private object __method_bind {
      val new: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PluginScript".cstr.ptr,
              "new".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method new" }
            }
          }
    }
  }
}
