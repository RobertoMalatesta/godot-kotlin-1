// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AnimationNodeTransition(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AnimationNode(null) {
  var input0AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(0) 
    }
    set(value) {
      setInputAsAutoAdvance(0, value)
    }

  var input0Name: String
    get() {
       return getInputCaption(0) 
    }
    set(value) {
      setInputCaption(0, value)
    }

  var input1AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(1) 
    }
    set(value) {
      setInputAsAutoAdvance(1, value)
    }

  var input1Name: String
    get() {
       return getInputCaption(1) 
    }
    set(value) {
      setInputCaption(1, value)
    }

  var input10AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(10) 
    }
    set(value) {
      setInputAsAutoAdvance(10, value)
    }

  var input10Name: String
    get() {
       return getInputCaption(10) 
    }
    set(value) {
      setInputCaption(10, value)
    }

  var input11AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(11) 
    }
    set(value) {
      setInputAsAutoAdvance(11, value)
    }

  var input11Name: String
    get() {
       return getInputCaption(11) 
    }
    set(value) {
      setInputCaption(11, value)
    }

  var input12AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(12) 
    }
    set(value) {
      setInputAsAutoAdvance(12, value)
    }

  var input12Name: String
    get() {
       return getInputCaption(12) 
    }
    set(value) {
      setInputCaption(12, value)
    }

  var input13AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(13) 
    }
    set(value) {
      setInputAsAutoAdvance(13, value)
    }

  var input13Name: String
    get() {
       return getInputCaption(13) 
    }
    set(value) {
      setInputCaption(13, value)
    }

  var input14AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(14) 
    }
    set(value) {
      setInputAsAutoAdvance(14, value)
    }

  var input14Name: String
    get() {
       return getInputCaption(14) 
    }
    set(value) {
      setInputCaption(14, value)
    }

  var input15AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(15) 
    }
    set(value) {
      setInputAsAutoAdvance(15, value)
    }

  var input15Name: String
    get() {
       return getInputCaption(15) 
    }
    set(value) {
      setInputCaption(15, value)
    }

  var input16AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(16) 
    }
    set(value) {
      setInputAsAutoAdvance(16, value)
    }

  var input16Name: String
    get() {
       return getInputCaption(16) 
    }
    set(value) {
      setInputCaption(16, value)
    }

  var input17AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(17) 
    }
    set(value) {
      setInputAsAutoAdvance(17, value)
    }

  var input17Name: String
    get() {
       return getInputCaption(17) 
    }
    set(value) {
      setInputCaption(17, value)
    }

  var input18AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(18) 
    }
    set(value) {
      setInputAsAutoAdvance(18, value)
    }

  var input18Name: String
    get() {
       return getInputCaption(18) 
    }
    set(value) {
      setInputCaption(18, value)
    }

  var input19AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(19) 
    }
    set(value) {
      setInputAsAutoAdvance(19, value)
    }

  var input19Name: String
    get() {
       return getInputCaption(19) 
    }
    set(value) {
      setInputCaption(19, value)
    }

  var input2AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(2) 
    }
    set(value) {
      setInputAsAutoAdvance(2, value)
    }

  var input2Name: String
    get() {
       return getInputCaption(2) 
    }
    set(value) {
      setInputCaption(2, value)
    }

  var input20AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(20) 
    }
    set(value) {
      setInputAsAutoAdvance(20, value)
    }

  var input20Name: String
    get() {
       return getInputCaption(20) 
    }
    set(value) {
      setInputCaption(20, value)
    }

  var input21AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(21) 
    }
    set(value) {
      setInputAsAutoAdvance(21, value)
    }

  var input21Name: String
    get() {
       return getInputCaption(21) 
    }
    set(value) {
      setInputCaption(21, value)
    }

  var input22AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(22) 
    }
    set(value) {
      setInputAsAutoAdvance(22, value)
    }

  var input22Name: String
    get() {
       return getInputCaption(22) 
    }
    set(value) {
      setInputCaption(22, value)
    }

  var input23AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(23) 
    }
    set(value) {
      setInputAsAutoAdvance(23, value)
    }

  var input23Name: String
    get() {
       return getInputCaption(23) 
    }
    set(value) {
      setInputCaption(23, value)
    }

  var input24AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(24) 
    }
    set(value) {
      setInputAsAutoAdvance(24, value)
    }

  var input24Name: String
    get() {
       return getInputCaption(24) 
    }
    set(value) {
      setInputCaption(24, value)
    }

  var input25AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(25) 
    }
    set(value) {
      setInputAsAutoAdvance(25, value)
    }

  var input25Name: String
    get() {
       return getInputCaption(25) 
    }
    set(value) {
      setInputCaption(25, value)
    }

  var input26AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(26) 
    }
    set(value) {
      setInputAsAutoAdvance(26, value)
    }

  var input26Name: String
    get() {
       return getInputCaption(26) 
    }
    set(value) {
      setInputCaption(26, value)
    }

  var input27AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(27) 
    }
    set(value) {
      setInputAsAutoAdvance(27, value)
    }

  var input27Name: String
    get() {
       return getInputCaption(27) 
    }
    set(value) {
      setInputCaption(27, value)
    }

  var input28AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(28) 
    }
    set(value) {
      setInputAsAutoAdvance(28, value)
    }

  var input28Name: String
    get() {
       return getInputCaption(28) 
    }
    set(value) {
      setInputCaption(28, value)
    }

  var input29AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(29) 
    }
    set(value) {
      setInputAsAutoAdvance(29, value)
    }

  var input29Name: String
    get() {
       return getInputCaption(29) 
    }
    set(value) {
      setInputCaption(29, value)
    }

  var input3AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(3) 
    }
    set(value) {
      setInputAsAutoAdvance(3, value)
    }

  var input3Name: String
    get() {
       return getInputCaption(3) 
    }
    set(value) {
      setInputCaption(3, value)
    }

  var input30AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(30) 
    }
    set(value) {
      setInputAsAutoAdvance(30, value)
    }

  var input30Name: String
    get() {
       return getInputCaption(30) 
    }
    set(value) {
      setInputCaption(30, value)
    }

  var input31AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(31) 
    }
    set(value) {
      setInputAsAutoAdvance(31, value)
    }

  var input31Name: String
    get() {
       return getInputCaption(31) 
    }
    set(value) {
      setInputCaption(31, value)
    }

  var input4AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(4) 
    }
    set(value) {
      setInputAsAutoAdvance(4, value)
    }

  var input4Name: String
    get() {
       return getInputCaption(4) 
    }
    set(value) {
      setInputCaption(4, value)
    }

  var input5AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(5) 
    }
    set(value) {
      setInputAsAutoAdvance(5, value)
    }

  var input5Name: String
    get() {
       return getInputCaption(5) 
    }
    set(value) {
      setInputCaption(5, value)
    }

  var input6AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(6) 
    }
    set(value) {
      setInputAsAutoAdvance(6, value)
    }

  var input6Name: String
    get() {
       return getInputCaption(6) 
    }
    set(value) {
      setInputCaption(6, value)
    }

  var input7AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(7) 
    }
    set(value) {
      setInputAsAutoAdvance(7, value)
    }

  var input7Name: String
    get() {
       return getInputCaption(7) 
    }
    set(value) {
      setInputCaption(7, value)
    }

  var input8AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(8) 
    }
    set(value) {
      setInputAsAutoAdvance(8, value)
    }

  var input8Name: String
    get() {
       return getInputCaption(8) 
    }
    set(value) {
      setInputCaption(8, value)
    }

  var input9AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(9) 
    }
    set(value) {
      setInputAsAutoAdvance(9, value)
    }

  var input9Name: String
    get() {
       return getInputCaption(9) 
    }
    set(value) {
      setInputCaption(9, value)
    }

  var inputCount: Int
    get() {
       return getEnabledInputs() 
    }
    set(value) {
      setEnabledInputs(value)
    }

  var xfadeTime: Float
    get() {
       return getCrossFadeTime() 
    }
    set(value) {
      setCrossFadeTime(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCrossFadeTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCrossFadeTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEnabledInputs(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEnabledInputs.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInputCaption(input: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getInputCaption.call(self._handle, listOf(input), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isInputSetAsAutoAdvance(input: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInputSetAsAutoAdvance.call(self._handle, listOf(input), _retPtr)
      _ret.value
    }
  }

  fun setCrossFadeTime(time: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCrossFadeTime.call(self._handle, listOf(time), null)
    }
  }

  fun setEnabledInputs(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnabledInputs.call(self._handle, listOf(amount), null)
    }
  }

  fun setInputAsAutoAdvance(input: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(input)
      _args.add(enable)
      __method_bind.setInputAsAutoAdvance.call(self._handle, _args, null)
    }
  }

  fun setInputCaption(input: Int, caption: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(input)
      _args.add(caption)
      __method_bind.setInputCaption.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeTransition".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeTransition" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNodeTransition
     */
    private object __method_bind {
      val getCrossFadeTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "get_cross_fade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cross_fade_time" }
        }
      val getEnabledInputs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "get_enabled_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_enabled_inputs" }
        }
      val getInputCaption: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "get_input_caption".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_caption" }
        }
      val isInputSetAsAutoAdvance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "is_input_set_as_auto_advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_input_set_as_auto_advance" }
        }
      val setCrossFadeTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_cross_fade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cross_fade_time" }
        }
      val setEnabledInputs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_enabled_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled_inputs" }
        }
      val setInputAsAutoAdvance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_input_as_auto_advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_as_auto_advance" }
        }
      val setInputCaption: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_input_caption".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_caption" }
        }}
  }
}
