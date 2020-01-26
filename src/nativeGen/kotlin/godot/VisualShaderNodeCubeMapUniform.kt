// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeCubeMapUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    fun new(): VisualShaderNodeCubeMapUniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeCubeMapUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeCubeMapUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeCubeMapUniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeCubeMapUniform =
        VisualShaderNodeCubeMapUniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeCubeMapUniform
     */
    private object __method_bind
  }
}
