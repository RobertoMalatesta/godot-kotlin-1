// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DDirectSpaceState(
  _handle: COpaquePointer
) : Object(_handle) {
  fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.castMotion.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Int = 32): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(maxResults)
    val _ret = __method_bind.collideShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.getRestInfo.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun intersectPoint(
    point: Vector2,
    maxResults: Int = 32,
    exclude: VariantArray,
    collisionLayer: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(maxResults)
    _args.append(exclude)
    _args.append(collisionLayer)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersectPoint.call(this._handle, _args.toVariant(), 6)
    return _ret.asVariantArray()
  }

  fun intersectPointOnCanvas(
    point: Vector2,
    canvasInstanceId: Int,
    maxResults: Int = 32,
    exclude: VariantArray,
    collisionLayer: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(canvasInstanceId)
    _args.append(maxResults)
    _args.append(exclude)
    _args.append(collisionLayer)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersectPointOnCanvas.call(this._handle, _args.toVariant(), 7)
    return _ret.asVariantArray()
  }

  fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray,
    collisionLayer: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(exclude)
    _args.append(collisionLayer)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersectRay.call(this._handle, _args.toVariant(), 6)
    return _ret.asDictionary()
  }

  fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Int = 32): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(maxResults)
    val _ret = __method_bind.intersectShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectSpaceState
     */
    private object __method_bind {
      val castMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "cast_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cast_motion" }
        }
      val collideShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "collide_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method collide_shape" }
        }
      val getRestInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "get_rest_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
        }
      val intersectPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "intersect_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_point" }
        }
      val intersectPointOnCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "intersect_point_on_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_point_on_canvas" }
        }
      val intersectRay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "intersect_ray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
        }
      val intersectShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
            "intersect_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
        }}
  }
}
