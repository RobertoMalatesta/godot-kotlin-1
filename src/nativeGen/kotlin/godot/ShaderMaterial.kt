// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ShaderMaterial(
  _handle: COpaquePointer
) : Material(_handle) {
  fun getShader(): Shader {
    val _ret = __method_bind.get_shader.call(this._handle)
    return _ret.asObject(::Shader)!!
  }

  fun getShaderParam(param: String): Variant {
    val _arg = Variant.new(param)
    val _ret = __method_bind.get_shader_param.call(this._handle, _arg, 1)
    return _ret
  }

  fun propertyCanRevert(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.property_can_revert.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun propertyGetRevert(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.property_get_revert.call(this._handle, _arg, 1)
    return _ret
  }

  fun setShader(shader: Shader) {
    val _arg = Variant.new(shader)
    __method_bind.set_shader.call(this._handle, _arg, 1)
  }

  fun setShaderParam(param: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.set_shader_param.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): ShaderMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShaderMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ShaderMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ShaderMaterial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ShaderMaterial = ShaderMaterial(ptr)
    /**
     * Container for method_bind pointers for ShaderMaterial
     */
    private object __method_bind {
      val get_shader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "get_shader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shader" }
        }
      val get_shader_param: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "get_shader_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shader_param" }
        }
      val property_can_revert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "property_can_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
        }
      val property_get_revert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "property_get_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
        }
      val set_shader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "set_shader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shader" }
        }
      val set_shader_param: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "set_shader_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shader_param" }
        }}
  }
}
