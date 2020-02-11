// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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

open class BackBufferCopy(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var copyMode: CopyMode
    get() {
       return getCopyMode() 
    }
    set(value) {
      setCopyMode(value.value)
    }

  var rect: Rect2
    get() {
       return getRect() 
    }
    set(value) {
      setRect(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for rect
   */
  fun rect(cb: Rect2.() -> Unit) {
    val _p = rect
    cb(_p)
    rect = _p
  }

  fun getCopyMode(): CopyMode {
    val _ret = __method_bind.getCopyMode.call(this._handle)
    return BackBufferCopy.CopyMode.from(_ret.asInt())
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.getRect.call(this._handle)
    return _ret.asRect2()
  }

  fun setCopyMode(copyMode: Int) {
    val _arg = Variant(copyMode)
    __method_bind.setCopyMode.call(this._handle, listOf(_arg))
  }

  fun setRect(rect: Rect2) {
    val _arg = Variant(rect)
    __method_bind.setRect.call(this._handle, listOf(_arg))
  }

  enum class CopyMode(
    val value: Int
  ) {
    DISABLED(0),

    RECT(1),

    VIEWPORT(2);

    companion object {
      fun from(value: Int): CopyMode {
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
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BackBufferCopy".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BackBufferCopy" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BackBufferCopy
     */
    private object __method_bind {
      val getCopyMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "get_copy_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_copy_mode" }
        }
      val getRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val setCopyMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "set_copy_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_copy_mode" }
        }
      val setRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "set_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rect" }
        }}
  }
}
