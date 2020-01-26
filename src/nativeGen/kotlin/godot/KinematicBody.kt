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

open class KinematicBody internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  companion object {
    fun new(): KinematicBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton KinematicBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicBody(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for KinematicBody
     */
    private object __method_bind {
      val get_axis_lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "get_axis_lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis_lock" }
            }
          }

      val get_floor_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "get_floor_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
            }
          }

      val get_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "get_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
            }
          }

      val get_slide_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "get_slide_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
            }
          }

      val get_slide_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "get_slide_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
            }
          }

      val is_on_ceiling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "is_on_ceiling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
            }
          }

      val is_on_floor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "is_on_floor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
            }
          }

      val is_on_wall: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "is_on_wall".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
            }
          }

      val move_and_collide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "move_and_collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
            }
          }

      val move_and_slide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "move_and_slide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
            }
          }

      val move_and_slide_with_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "move_and_slide_with_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
            }
          }

      val set_axis_lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "set_axis_lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis_lock" }
            }
          }

      val set_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "set_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
            }
          }

      val test_move: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
              "test_move".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_move" }
            }
          }
    }
  }
}
