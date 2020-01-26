// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class YSort internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): YSort = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("YSort".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton YSort" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      YSort(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for YSort
     */
    private object __method_bind {
      val is_sort_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("YSort".cstr.ptr,
              "is_sort_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sort_enabled" }
            }
          }

      val set_sort_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("YSort".cstr.ptr,
              "set_sort_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sort_enabled" }
            }
          }
    }
  }
}
