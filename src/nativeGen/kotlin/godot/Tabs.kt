// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Tabs internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addTab(title: String, icon: Texture) {
    TODO()
  }

  fun ensureTabVisible(idx: Int) {
    TODO()
  }

  fun getCurrentTab(): Int {
    TODO()
  }

  fun getDragToRearrangeEnabled(): Boolean {
    TODO()
  }

  fun getOffsetButtonsVisible(): Boolean {
    TODO()
  }

  fun getScrollingEnabled(): Boolean {
    TODO()
  }

  fun getSelectWithRmb(): Boolean {
    TODO()
  }

  fun getTabAlign(): TabAlign {
    TODO()
  }

  fun getTabCloseDisplayPolicy(): CloseButtonDisplayPolicy {
    TODO()
  }

  fun getTabCount(): Int {
    TODO()
  }

  fun getTabDisabled(tab_idx: Int): Boolean {
    TODO()
  }

  fun getTabIcon(tab_idx: Int): Texture {
    TODO()
  }

  fun getTabOffset(): Int {
    TODO()
  }

  fun getTabRect(tab_idx: Int): Rect2 {
    TODO()
  }

  fun getTabTitle(tab_idx: Int): String {
    TODO()
  }

  fun getTabsRearrangeGroup(): Int {
    TODO()
  }

  fun moveTab(from: Int, to: Int) {
    TODO()
  }

  fun removeTab(tab_idx: Int) {
    TODO()
  }

  fun setCurrentTab(tab_idx: Int) {
    TODO()
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    TODO()
  }

  fun setScrollingEnabled(enabled: Boolean) {
    TODO()
  }

  fun setSelectWithRmb(enabled: Boolean) {
    TODO()
  }

  fun setTabAlign(align: Int) {
    TODO()
  }

  fun setTabCloseDisplayPolicy(policy: Int) {
    TODO()
  }

  fun setTabDisabled(tab_idx: Int, disabled: Boolean) {
    TODO()
  }

  fun setTabIcon(tab_idx: Int, icon: Texture) {
    TODO()
  }

  fun setTabTitle(tab_idx: Int, title: String) {
    TODO()
  }

  fun setTabsRearrangeGroup(group_id: Int) {
    TODO()
  }

  enum class CloseButtonDisplayPolicy(
    val value: Int
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),

    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    CLOSE_BUTTON_SHOW_ALWAYS(2),

    CLOSE_BUTTON_MAX(3);

    companion object {
      fun from(value: Int): CloseButtonDisplayPolicy {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TabAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_MAX(3);

    companion object {
      fun from(value: Int): TabAlign {
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
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_MAX: Int = 3

    val ALIGN_RIGHT: Int = 2

    val CLOSE_BUTTON_MAX: Int = 3

    val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Int = 1

    val CLOSE_BUTTON_SHOW_ALWAYS: Int = 2

    val CLOSE_BUTTON_SHOW_NEVER: Int = 0

    fun new(): Tabs = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tabs".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Tabs" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tabs(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Tabs = Tabs(ptr)
    /**
     * Container for method_bind pointers for Tabs
     */
    private object __method_bind {
      val add_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "add_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_tab" }
            }
          }

      val ensure_tab_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "ensure_tab_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ensure_tab_visible" }
            }
          }

      val get_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
            }
          }

      val get_drag_to_rearrange_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_drag_to_rearrange_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled"
              }
            }
          }

      val get_offset_buttons_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_offset_buttons_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset_buttons_visible" }
            }
          }

      val get_scrolling_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_scrolling_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scrolling_enabled" }
            }
          }

      val get_select_with_rmb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_select_with_rmb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_select_with_rmb" }
            }
          }

      val get_tab_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
            }
          }

      val get_tab_close_display_policy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_close_display_policy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_close_display_policy" }
            }
          }

      val get_tab_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
            }
          }

      val get_tab_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
            }
          }

      val get_tab_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
            }
          }

      val get_tab_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_offset" }
            }
          }

      val get_tab_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_rect" }
            }
          }

      val get_tab_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
            }
          }

      val get_tabs_rearrange_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tabs_rearrange_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
            }
          }

      val move_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "move_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_tab" }
            }
          }

      val remove_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "remove_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_tab" }
            }
          }

      val set_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
            }
          }

      val set_drag_to_rearrange_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_drag_to_rearrange_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled"
              }
            }
          }

      val set_scrolling_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_scrolling_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scrolling_enabled" }
            }
          }

      val set_select_with_rmb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_select_with_rmb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_select_with_rmb" }
            }
          }

      val set_tab_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
            }
          }

      val set_tab_close_display_policy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_close_display_policy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_close_display_policy" }
            }
          }

      val set_tab_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
            }
          }

      val set_tab_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
            }
          }

      val set_tab_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
            }
          }

      val set_tabs_rearrange_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tabs_rearrange_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
            }
          }
    }
  }
}
