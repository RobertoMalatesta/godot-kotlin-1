// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventScreenDrag internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  fun getIndex(): Int {
    TODO()
  }

  fun getPosition(): Vector2 {
    TODO()
  }

  fun getRelative(): Vector2 {
    TODO()
  }

  fun getSpeed(): Vector2 {
    TODO()
  }

  fun setIndex(index: Int) {
    TODO()
  }

  fun setPosition(position: Vector2) {
    TODO()
  }

  fun setRelative(relative: Vector2) {
    TODO()
  }

  fun setSpeed(speed: Vector2) {
    TODO()
  }

  companion object {
    fun new(): InputEventScreenDrag = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventScreenDrag".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventScreenDrag" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventScreenDrag(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventScreenDrag = InputEventScreenDrag(ptr)
    /**
     * Container for method_bind pointers for InputEventScreenDrag
     */
    private object __method_bind {
      val get_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "get_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_relative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "get_relative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_relative" }
            }
          }

      val get_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "get_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed" }
            }
          }

      val set_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "set_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_index" }
            }
          }

      val set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_position" }
            }
          }

      val set_relative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "set_relative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_relative" }
            }
          }

      val set_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
              "set_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed" }
            }
          }
    }
  }
}
