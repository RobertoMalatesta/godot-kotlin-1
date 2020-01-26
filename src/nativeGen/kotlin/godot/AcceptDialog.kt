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

open class AcceptDialog internal constructor(
  _handle: COpaquePointer
) : WindowDialog(_handle) {
  companion object {
    fun new(): AcceptDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AcceptDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AcceptDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AcceptDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AcceptDialog
     */
    private object __method_bind {
      val _builtin_text_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "_builtin_text_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _builtin_text_entered" }
            }
          }

      val _custom_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "_custom_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _custom_action" }
            }
          }

      val _ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _ok" }
            }
          }

      val add_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "add_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_button" }
            }
          }

      val add_cancel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "add_cancel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_cancel" }
            }
          }

      val get_hide_on_ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_hide_on_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hide_on_ok" }
            }
          }

      val get_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_label" }
            }
          }

      val get_ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ok" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val register_text_enter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "register_text_enter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method register_text_enter" }
            }
          }

      val set_hide_on_ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "set_hide_on_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_on_ok" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }
    }
  }
}
