// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BakedLightmap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualInstance(null) {
  var bakeCellSize: Float
    get() {
       return getBakeCellSize() 
    }
    set(value) {
      setBakeCellSize(value)
    }

  var bakeDefaultTexelsPerUnit: Float
    get() {
       return getBakeDefaultTexelsPerUnit() 
    }
    set(value) {
      setBakeDefaultTexelsPerUnit(value)
    }

  var bakeEnergy: Float
    get() {
       return getEnergy() 
    }
    set(value) {
      setEnergy(value)
    }

  var bakeExtents: Vector3
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  var bakeHdr: Boolean
    get() {
       return isHdr() 
    }
    set(value) {
      setHdr(value)
    }

  var bakeMode: BakeMode
    get() {
       return getBakeMode() 
    }
    set(value) {
      setBakeMode(value.value)
    }

  var bakePropagation: Float
    get() {
       return getPropagation() 
    }
    set(value) {
      setPropagation(value)
    }

  var bakeQuality: BakeQuality
    get() {
       return getBakeQuality() 
    }
    set(value) {
      setBakeQuality(value.value)
    }

  var captureCellSize: Float
    get() {
       return getCaptureCellSize() 
    }
    set(value) {
      setCaptureCellSize(value)
    }

  var imagePath: String
    get() {
       return getImagePath() 
    }
    set(value) {
      setImagePath(value)
    }

  var lightData: BakedLightmapData
    get() {
       return getLightData() 
    }
    set(value) {
      setLightData(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for bakeExtents
   */
  fun bakeExtents(cb: Vector3.() -> Unit) {
    val _p = bakeExtents
    cb(_p)
    bakeExtents = _p
  }

  fun bake(fromNode: Node, createVisualDebug: Boolean = false): BakeError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(createVisualDebug))
    val _ret = __method_bind.bake.call(this._handle, _args)
    return BakedLightmap.BakeError.from(_ret.asInt())
  }

  fun debugBake() {
    __method_bind.debugBake.call(this._handle)
  }

  fun getBakeCellSize(): Float {
    val _ret = __method_bind.getBakeCellSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getBakeDefaultTexelsPerUnit(): Float {
    val _ret = __method_bind.getBakeDefaultTexelsPerUnit.call(this._handle)
    return _ret.asFloat()
  }

  fun getBakeMode(): BakeMode {
    val _ret = __method_bind.getBakeMode.call(this._handle)
    return BakedLightmap.BakeMode.from(_ret.asInt())
  }

  fun getBakeQuality(): BakeQuality {
    val _ret = __method_bind.getBakeQuality.call(this._handle)
    return BakedLightmap.BakeQuality.from(_ret.asInt())
  }

  fun getCaptureCellSize(): Float {
    val _ret = __method_bind.getCaptureCellSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.getEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getExtents(): Vector3 {
    val _ret = __method_bind.getExtents.call(this._handle)
    return _ret.asVector3()
  }

  fun getImagePath(): String {
    val _ret = __method_bind.getImagePath.call(this._handle)
    return _ret.asString()
  }

  fun getLightData(): BakedLightmapData {
    val _ret = __method_bind.getLightData.call(this._handle)
    return _ret.toAny() as BakedLightmapData
  }

  fun getPropagation(): Float {
    val _ret = __method_bind.getPropagation.call(this._handle)
    return _ret.asFloat()
  }

  fun isHdr(): Boolean {
    val _ret = __method_bind.isHdr.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBakeCellSize(bakeCellSize: Float) {
    val _arg = Variant(bakeCellSize)
    __method_bind.setBakeCellSize.call(this._handle, listOf(_arg))
  }

  fun setBakeDefaultTexelsPerUnit(texels: Float) {
    val _arg = Variant(texels)
    __method_bind.setBakeDefaultTexelsPerUnit.call(this._handle, listOf(_arg))
  }

  fun setBakeMode(bakeMode: Int) {
    val _arg = Variant(bakeMode)
    __method_bind.setBakeMode.call(this._handle, listOf(_arg))
  }

  fun setBakeQuality(bakeQuality: Int) {
    val _arg = Variant(bakeQuality)
    __method_bind.setBakeQuality.call(this._handle, listOf(_arg))
  }

  fun setCaptureCellSize(captureCellSize: Float) {
    val _arg = Variant(captureCellSize)
    __method_bind.setCaptureCellSize.call(this._handle, listOf(_arg))
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant(energy)
    __method_bind.setEnergy.call(this._handle, listOf(_arg))
  }

  fun setExtents(extents: Vector3) {
    val _arg = Variant(extents)
    __method_bind.setExtents.call(this._handle, listOf(_arg))
  }

  fun setHdr(hdr: Boolean) {
    val _arg = Variant(hdr)
    __method_bind.setHdr.call(this._handle, listOf(_arg))
  }

  fun setImagePath(imagePath: String) {
    val _arg = Variant(imagePath)
    __method_bind.setImagePath.call(this._handle, listOf(_arg))
  }

  fun setLightData(data: BakedLightmapData) {
    val _arg = Variant(data)
    __method_bind.setLightData.call(this._handle, listOf(_arg))
  }

  fun setPropagation(propagation: Float) {
    val _arg = Variant(propagation)
    __method_bind.setPropagation.call(this._handle, listOf(_arg))
  }

  enum class BakeQuality(
    val value: Int
  ) {
    LOW(0),

    MEDIUM(1),

    HIGH(2);

    companion object {
      fun from(value: Int): BakeQuality {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BakeError(
    val value: Int
  ) {
    OK(0),

    NO_SAVE_PATH(1),

    NO_MESHES(2),

    CANT_CREATE_IMAGE(3),

    USER_ABORTED(4);

    companion object {
      fun from(value: Int): BakeError {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BakeMode(
    val value: Int
  ) {
    CONE_TRACE(0),

    RAY_TRACE(1);

    companion object {
      fun from(value: Int): BakeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BakedLightmap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BakedLightmap
     */
    private object __method_bind {
      val bake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val debugBake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "debug_bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method debug_bake" }
        }
      val getBakeCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_bake_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_cell_size" }
        }
      val getBakeDefaultTexelsPerUnit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_bake_default_texels_per_unit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_default_texels_per_unit" }
        }
      val getBakeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_bake_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_mode" }
        }
      val getBakeQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_bake_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_quality" }
        }
      val getCaptureCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_capture_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_capture_cell_size" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extents" }
        }
      val getImagePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_image_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_image_path" }
        }
      val getLightData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_light_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_light_data" }
        }
      val getPropagation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "get_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_propagation" }
        }
      val isHdr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "is_hdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hdr" }
        }
      val setBakeCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_bake_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_cell_size" }
        }
      val setBakeDefaultTexelsPerUnit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_bake_default_texels_per_unit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_default_texels_per_unit" }
        }
      val setBakeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_bake_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_mode" }
        }
      val setBakeQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_bake_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_quality" }
        }
      val setCaptureCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_capture_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_capture_cell_size" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extents" }
        }
      val setHdr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_hdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hdr" }
        }
      val setImagePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_image_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_image_path" }
        }
      val setLightData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_light_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_light_data" }
        }
      val setPropagation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
            "set_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_propagation" }
        }}
  }
}
