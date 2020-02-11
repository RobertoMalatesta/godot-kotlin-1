// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class ProgressBar(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var percentVisible: Boolean
    get() {
       return isPercentVisible() 
    }
    set(value) {
      setPercentVisible(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun isPercentVisible(): Boolean {
    val _ret = __method_bind.isPercentVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun setPercentVisible(visible: Boolean) {
    val _arg = Variant(visible)
    __method_bind.setPercentVisible.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProgressBar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProgressBar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ProgressBar
     */
    private object __method_bind {
      val isPercentVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProgressBar".cstr.ptr,
            "is_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_percent_visible" }
        }
      val setPercentVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProgressBar".cstr.ptr,
            "set_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
        }}
  }
}
