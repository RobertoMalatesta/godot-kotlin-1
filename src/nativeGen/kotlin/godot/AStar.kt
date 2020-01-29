// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class AStar(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addPoint(
    id: Int,
    position: Vector3,
    weightScale: Float = 1.0f
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(position)
    _args.append(weightScale)
    __method_bind.addPoint.call(this._handle, _args.toVariant(), 3)
  }

  fun arePointsConnected(id: Int, toId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    val _ret = __method_bind.arePointsConnected.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun connectPoints(
    id: Int,
    toId: Int,
    bidirectional: Boolean = true
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    _args.append(bidirectional)
    __method_bind.connectPoints.call(this._handle, _args.toVariant(), 3)
  }

  fun disconnectPoints(id: Int, toId: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    __method_bind.disconnectPoints.call(this._handle, _args.toVariant(), 2)
  }

  fun getAvailablePointId(): Int {
    val _ret = __method_bind.getAvailablePointId.call(this._handle)
    return _ret.asInt()
  }

  fun getClosestPoint(toPosition: Vector3): Int {
    val _arg = Variant.new(toPosition)
    val _ret = __method_bind.getClosestPoint.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    val _arg = Variant.new(toPosition)
    val _ret = __method_bind.getClosestPositionInSegment.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getIdPath(fromId: Int, toId: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(fromId)
    _args.append(toId)
    val _ret = __method_bind.getIdPath.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolIntArray()
  }

  fun getPointConnections(id: Int): PoolIntArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPointConnections.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getPointPath(fromId: Int, toId: Int): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(fromId)
    _args.append(toId)
    val _ret = __method_bind.getPointPath.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolVector3Array()
  }

  fun getPointPosition(id: Int): Vector3 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPointPosition.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getPointWeightScale(id: Int): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPointWeightScale.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getPoints(): VariantArray {
    val _ret = __method_bind.getPoints.call(this._handle)
    return _ret.asVariantArray()
  }

  fun hasPoint(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.hasPoint.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isPointDisabled(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.isPointDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removePoint(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removePoint.call(this._handle, _arg, 1)
  }

  fun setPointDisabled(id: Int, disabled: Boolean = true) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(disabled)
    __method_bind.setPointDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointPosition(id: Int, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(position)
    __method_bind.setPointPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointWeightScale(id: Int, weightScale: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(weightScale)
    __method_bind.setPointWeightScale.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): AStar = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AStar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AStar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AStar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AStar = AStar(ptr)
    /**
     * Container for method_bind pointers for AStar
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val arePointsConnected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "are_points_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_points_connected" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val connectPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "connect_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_points" }
        }
      val disconnectPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "disconnect_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_points" }
        }
      val getAvailablePointId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_available_point_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_point_id" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getClosestPositionInSegment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_closest_position_in_segment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_position_in_segment" }
        }
      val getIdPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_id_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_id_path" }
        }
      val getPointConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_point_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_connections" }
        }
      val getPointPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_point_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_path" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val getPointWeightScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_point_weight_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_weight_scale" }
        }
      val getPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "get_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_points" }
        }
      val hasPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "has_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_point" }
        }
      val isPointDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "is_point_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_point_disabled" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setPointDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "set_point_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_disabled" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "set_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_position" }
        }
      val setPointWeightScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "set_point_weight_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_weight_scale" }
        }}
  }
}
