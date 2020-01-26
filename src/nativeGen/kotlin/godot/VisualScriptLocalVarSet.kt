// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptLocalVarSet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getVarName(): String {
    TODO()
  }

  fun getVarType(): Variant.Type {
    TODO()
  }

  fun setVarName(name: String) {
    TODO()
  }

  fun setVarType(type: Int) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptLocalVarSet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptLocalVarSet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptLocalVarSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptLocalVarSet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptLocalVarSet = VisualScriptLocalVarSet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptLocalVarSet
     */
    private object __method_bind {
      val get_var_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
              "get_var_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var_name" }
            }
          }

      val get_var_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
              "get_var_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var_type" }
            }
          }

      val set_var_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
              "set_var_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_var_name" }
            }
          }

      val set_var_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
              "set_var_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_var_type" }
            }
          }
    }
  }
}
