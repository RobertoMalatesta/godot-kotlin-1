// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptDeconstruct internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getDeconstructType(): Variant.Type {
    TODO()
  }

  fun setDeconstructType(type: Int) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptDeconstruct = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptDeconstruct".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptDeconstruct" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptDeconstruct(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptDeconstruct = VisualScriptDeconstruct(ptr)
    /**
     * Container for method_bind pointers for VisualScriptDeconstruct
     */
    private object __method_bind {
      val get_deconstruct_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptDeconstruct".cstr.ptr,
              "get_deconstruct_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_deconstruct_type" }
            }
          }

      val set_deconstruct_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptDeconstruct".cstr.ptr,
              "set_deconstruct_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_deconstruct_type" }
            }
          }
    }
  }
}
