// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform2D
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

open class KinematicBody2D internal constructor(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  fun getFloorVelocity(): Vector2 {
    TODO()
  }

  fun getSafeMargin(): Float {
    TODO()
  }

  fun getSlideCollision(slide_idx: Int): KinematicCollision2D {
    TODO()
  }

  fun getSlideCount(): Int {
    TODO()
  }

  fun isOnCeiling(): Boolean {
    TODO()
  }

  fun isOnFloor(): Boolean {
    TODO()
  }

  fun isOnWall(): Boolean {
    TODO()
  }

  fun isSyncToPhysicsEnabled(): Boolean {
    TODO()
  }

  fun moveAndCollide(
    rel_vec: Vector2,
    infinite_inertia: Boolean,
    exclude_raycast_shapes: Boolean,
    test_only: Boolean
  ): KinematicCollision2D {
    TODO()
  }

  fun moveAndSlide(
    linear_velocity: Vector2,
    floor_normal: Vector2,
    stop_on_slope: Boolean,
    max_slides: Int,
    floor_max_angle: Float,
    infinite_inertia: Boolean
  ): Vector2 {
    TODO()
  }

  fun moveAndSlideWithSnap(
    linear_velocity: Vector2,
    snap: Vector2,
    floor_normal: Vector2,
    stop_on_slope: Boolean,
    max_slides: Int,
    floor_max_angle: Float,
    infinite_inertia: Boolean
  ): Vector2 {
    TODO()
  }

  fun setSafeMargin(pixels: Float) {
    TODO()
  }

  fun setSyncToPhysics(enable: Boolean) {
    TODO()
  }

  fun testMove(
    from: Transform2D,
    rel_vec: Vector2,
    infinite_inertia: Boolean
  ): Boolean {
    TODO()
  }

  companion object {
    fun new(): KinematicBody2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton KinematicBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicBody2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): KinematicBody2D = KinematicBody2D(ptr)
    /**
     * Container for method_bind pointers for KinematicBody2D
     */
    private object __method_bind {
      val get_floor_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_floor_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
            }
          }

      val get_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
            }
          }

      val get_slide_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_slide_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
            }
          }

      val get_slide_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_slide_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
            }
          }

      val is_on_ceiling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_ceiling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
            }
          }

      val is_on_floor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_floor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
            }
          }

      val is_on_wall: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_wall".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
            }
          }

      val is_sync_to_physics_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_sync_to_physics_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sync_to_physics_enabled" }
            }
          }

      val move_and_collide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
            }
          }

      val move_and_slide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_slide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
            }
          }

      val move_and_slide_with_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_slide_with_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
            }
          }

      val set_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "set_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
            }
          }

      val set_sync_to_physics: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "set_sync_to_physics".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sync_to_physics" }
            }
          }

      val test_move: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "test_move".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_move" }
            }
          }
    }
  }
}
