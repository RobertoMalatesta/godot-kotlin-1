// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Popup internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun isExclusive(): Boolean {
    TODO()
  }

  fun popup(bounds: Rect2) {
    TODO()
  }

  fun popupCentered(size: Vector2) {
    TODO()
  }

  fun popupCenteredClamped(size: Vector2, fallback_ratio: Float) {
    TODO()
  }

  fun popupCenteredMinsize(minsize: Vector2) {
    TODO()
  }

  fun popupCenteredRatio(ratio: Float) {
    TODO()
  }

  fun setExclusive(enable: Boolean) {
    TODO()
  }

  companion object {
    val NOTIFICATION_POPUP_HIDE: Int = 81

    val NOTIFICATION_POST_POPUP: Int = 80

    fun new(): Popup = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Popup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Popup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Popup(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Popup = Popup(ptr)
    /**
     * Container for method_bind pointers for Popup
     */
    private object __method_bind {
      val is_exclusive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "is_exclusive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_exclusive" }
            }
          }

      val popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup" }
            }
          }

      val popup_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered" }
            }
          }

      val popup_centered_clamped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered_clamped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered_clamped" }
            }
          }

      val popup_centered_minsize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered_minsize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered_minsize" }
            }
          }

      val popup_centered_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered_ratio" }
            }
          }

      val set_exclusive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "set_exclusive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exclusive" }
            }
          }
    }
  }
}
