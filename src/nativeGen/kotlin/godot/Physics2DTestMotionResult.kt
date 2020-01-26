// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DTestMotionResult internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getCollider(): Object {
    TODO()
  }

  fun getColliderId(): Int {
    TODO()
  }

  fun getColliderRid(): RID {
    TODO()
  }

  fun getColliderShape(): Int {
    TODO()
  }

  fun getColliderVelocity(): Vector2 {
    TODO()
  }

  fun getCollisionNormal(): Vector2 {
    TODO()
  }

  fun getCollisionPoint(): Vector2 {
    TODO()
  }

  fun getMotion(): Vector2 {
    TODO()
  }

  fun getMotionRemainder(): Vector2 {
    TODO()
  }

  companion object {
    fun new(): Physics2DTestMotionResult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Physics2DTestMotionResult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Physics2DTestMotionResult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Physics2DTestMotionResult(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Physics2DTestMotionResult = Physics2DTestMotionResult(ptr)
    /**
     * Container for method_bind pointers for Physics2DTestMotionResult
     */
    private object __method_bind {
      val get_collider: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider" }
            }
          }

      val get_collider_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collider_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_id" }
            }
          }

      val get_collider_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collider_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_rid" }
            }
          }

      val get_collider_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
            }
          }

      val get_collider_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collider_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_velocity" }
            }
          }

      val get_collision_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collision_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
            }
          }

      val get_collision_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_collision_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
            }
          }

      val get_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_motion" }
            }
          }

      val get_motion_remainder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
              "get_motion_remainder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_motion_remainder" }
            }
          }
    }
  }
}
