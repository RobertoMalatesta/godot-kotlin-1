// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getLength(): Float {
    TODO()
  }

  fun getSlipsOnSlope(): Boolean {
    TODO()
  }

  fun setLength(length: Float) {
    TODO()
  }

  fun setSlipsOnSlope(active: Boolean) {
    TODO()
  }

  companion object {
    fun new(): RayShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RayShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RayShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RayShape = RayShape(ptr)
    /**
     * Container for method_bind pointers for RayShape
     */
    private object __method_bind {
      val get_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape".cstr.ptr,
              "get_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_length" }
            }
          }

      val get_slips_on_slope: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape".cstr.ptr,
              "get_slips_on_slope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slips_on_slope" }
            }
          }

      val set_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape".cstr.ptr,
              "set_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_length" }
            }
          }

      val set_slips_on_slope: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape".cstr.ptr,
              "set_slips_on_slope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_slips_on_slope" }
            }
          }
    }
  }
}
