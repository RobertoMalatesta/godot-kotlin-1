// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class _VisualScriptEditorInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * _VisualScriptEditor::custom_nodes_updated signal
   */
  val signalCustomNodesUpdated: Signal0 = Signal0("custom_nodes_updated")

  fun addCustomNode(
    name: String,
    category: String,
    script: Script
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(category))
    _args.add(Variant.fromAny(script))
    __method_bind.addCustomNode.call(this._handle, _args)
  }

  fun removeCustomNode(name: String, category: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(category))
    __method_bind.removeCustomNode.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for _VisualScriptEditor
     */
    private object __method_bind {
      val addCustomNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_VisualScriptEditor".cstr.ptr,
            "add_custom_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_node" }
        }
      val removeCustomNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_VisualScriptEditor".cstr.ptr,
            "remove_custom_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_custom_node" }
        }}
  }
}

object _VisualScriptEditor : _VisualScriptEditorInternal(null) {
  init {
    memScoped {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("_VisualScriptEditor".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton _VisualScriptEditor" }
      _handle = handle
    }
  }
}
