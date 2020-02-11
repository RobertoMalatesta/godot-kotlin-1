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

open class VisibilityEnabler2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisibilityNotifier2D(null) {
  var freezeBodies: Boolean
    get() {
       return isEnablerEnabled(1) 
    }
    set(value) {
      setEnabler(1, value)
    }

  var pauseAnimatedSprites: Boolean
    get() {
       return isEnablerEnabled(5) 
    }
    set(value) {
      setEnabler(5, value)
    }

  var pauseAnimations: Boolean
    get() {
       return isEnablerEnabled(0) 
    }
    set(value) {
      setEnabler(0, value)
    }

  var pauseParticles: Boolean
    get() {
       return isEnablerEnabled(2) 
    }
    set(value) {
      setEnabler(2, value)
    }

  var physicsProcessParent: Boolean
    get() {
       return isEnablerEnabled(4) 
    }
    set(value) {
      setEnabler(4, value)
    }

  var processParent: Boolean
    get() {
       return isEnablerEnabled(3) 
    }
    set(value) {
      setEnabler(3, value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun isEnablerEnabled(enabler: Int): Boolean {
    val _arg = Variant(enabler)
    val _ret = __method_bind.isEnablerEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setEnabler(enabler: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(enabler))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setEnabler.call(this._handle, _args)
  }

  enum class Enabler(
    val value: Int
  ) {
    PAUSE_ANIMATIONS(0),

    FREEZE_BODIES(1),

    PAUSE_PARTICLES(2),

    PARENT_PROCESS(3),

    PARENT_PHYSICS_PROCESS(4),

    PAUSE_ANIMATED_SPRITES(5),

    MAX(6);

    companion object {
      fun from(value: Int): Enabler {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityEnabler2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisibilityEnabler2D
     */
    private object __method_bind {
      val isEnablerEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler2D".cstr.ptr,
            "is_enabler_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabler_enabled" }
        }
      val setEnabler: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler2D".cstr.ptr,
            "set_enabler".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabler" }
        }}
  }
}
