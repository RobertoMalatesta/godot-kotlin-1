// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ViewportContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var stretch: Boolean
    get() {
       return isStretchEnabled() 
    }
    set(value) {
      setStretch(value)
    }

  var stretchShrink: Int
    get() {
       return getStretchShrink() 
    }
    set(value) {
      setStretchShrink(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getStretchShrink(): Int {
    val _ret = __method_bind.getStretchShrink.call(this._handle)
    return _ret.asInt()
  }

  fun isStretchEnabled(): Boolean {
    val _ret = __method_bind.isStretchEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setStretch(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setStretch.call(this._handle, listOf(_arg))
  }

  fun setStretchShrink(amount: Int) {
    val _arg = Variant(amount)
    __method_bind.setStretchShrink.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ViewportContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ViewportContainer
     */
    private object __method_bind {
      val getStretchShrink: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "get_stretch_shrink".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_shrink" }
        }
      val isStretchEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "is_stretch_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stretch_enabled" }
        }
      val setStretch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "set_stretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch" }
        }
      val setStretchShrink: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "set_stretch_shrink".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_shrink" }
        }}
  }
}
