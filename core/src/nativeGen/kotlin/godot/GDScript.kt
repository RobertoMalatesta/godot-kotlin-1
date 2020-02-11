// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
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

open class GDScript(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Script(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAsByteCode(): PoolByteArray {
    val _ret = __method_bind.getAsByteCode.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun new(vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.new.call(this._handle, _args)
    return _ret
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GDScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GDScript
     */
    private object __method_bind {
      val getAsByteCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScript".cstr.ptr,
            "get_as_byte_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_byte_code" }
        }
      val new: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScript".cstr.ptr,
            "new".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method new" }
        }}
  }
}
