// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasModulate internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getColor(): Color {
    TODO()
  }

  fun setColor(color: Color) {
    TODO()
  }

  companion object {
    fun new(): CanvasModulate = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasModulate".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CanvasModulate" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasModulate(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CanvasModulate = CanvasModulate(ptr)
    /**
     * Container for method_bind pointers for CanvasModulate
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasModulate".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasModulate".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }
    }
  }
}
