// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SceneTree internal constructor(
  _handle: COpaquePointer
) : MainLoop(_handle) {
  enum class StretchAspect(
    val value: Int
  ) {
    STRETCH_ASPECT_IGNORE(0),

    STRETCH_ASPECT_KEEP(1),

    STRETCH_ASPECT_KEEP_WIDTH(2),

    STRETCH_ASPECT_KEEP_HEIGHT(3),

    STRETCH_ASPECT_EXPAND(4);
  }

  enum class GroupCallFlags(
    val value: Int
  ) {
    GROUP_CALL_DEFAULT(0),

    GROUP_CALL_REVERSE(1),

    GROUP_CALL_REALTIME(2),

    GROUP_CALL_UNIQUE(4);
  }

  enum class StretchMode(
    val value: Int
  ) {
    STRETCH_MODE_DISABLED(0),

    STRETCH_MODE_2D(1),

    STRETCH_MODE_VIEWPORT(2);
  }

  companion object {
    val GROUP_CALL_DEFAULT: Int = 0

    val GROUP_CALL_REALTIME: Int = 2

    val GROUP_CALL_REVERSE: Int = 1

    val GROUP_CALL_UNIQUE: Int = 4

    val STRETCH_ASPECT_EXPAND: Int = 4

    val STRETCH_ASPECT_IGNORE: Int = 0

    val STRETCH_ASPECT_KEEP: Int = 1

    val STRETCH_ASPECT_KEEP_HEIGHT: Int = 3

    val STRETCH_ASPECT_KEEP_WIDTH: Int = 2

    val STRETCH_MODE_2D: Int = 1

    val STRETCH_MODE_DISABLED: Int = 0

    val STRETCH_MODE_VIEWPORT: Int = 2

    fun new(): SceneTree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SceneTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SceneTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SceneTree(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for SceneTree
     */
    private object __method_bind {
      val _change_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "_change_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _change_scene" }
            }
          }

      val _connected_to_server: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "_connected_to_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _connected_to_server" }
            }
          }

      val _connection_failed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "_connection_failed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _connection_failed" }
            }
          }

      val _network_peer_connected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "_network_peer_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _network_peer_connected" }
            }
          }

      val _network_peer_disconnected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "_network_peer_disconnected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _network_peer_disconnected" }
            }
          }

      val _server_disconnected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "_server_disconnected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _server_disconnected" }
            }
          }

      val call_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "call_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_group" }
            }
          }

      val call_group_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "call_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_group_flags" }
            }
          }

      val change_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "change_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_scene" }
            }
          }

      val change_scene_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "change_scene_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_scene_to" }
            }
          }

      val create_timer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "create_timer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_timer" }
            }
          }

      val get_current_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_scene" }
            }
          }

      val get_edited_scene_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
            }
          }

      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
            }
          }

      val get_network_connected_peers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_connected_peers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
            }
          }

      val get_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
            }
          }

      val get_network_unique_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_unique_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
            }
          }

      val get_node_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_node_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_count" }
            }
          }

      val get_nodes_in_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_nodes_in_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_nodes_in_group" }
            }
          }

      val get_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root" }
            }
          }

      val get_rpc_sender_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_rpc_sender_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
            }
          }

      val has_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "has_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_group" }
            }
          }

      val has_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "has_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
            }
          }

      val is_debugging_collisions_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_debugging_collisions_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_debugging_collisions_hint" }
            }
          }

      val is_debugging_navigation_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_debugging_navigation_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_debugging_navigation_hint" }
            }
          }

      val is_input_handled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_input_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_input_handled" }
            }
          }

      val is_multiplayer_poll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_multiplayer_poll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_multiplayer_poll_enabled" }
            }
          }

      val is_network_server: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_network_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_network_server" }
            }
          }

      val is_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val is_refusing_new_network_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_refusing_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_refusing_new_network_connections" }
            }
          }

      val is_using_font_oversampling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_using_font_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_font_oversampling" }
            }
          }

      val notify_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "notify_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notify_group" }
            }
          }

      val notify_group_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "notify_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notify_group_flags" }
            }
          }

      val queue_delete: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "queue_delete".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_delete" }
            }
          }

      val quit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "quit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method quit" }
            }
          }

      val reload_current_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "reload_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reload_current_scene" }
            }
          }

      val set_auto_accept_quit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_auto_accept_quit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_accept_quit" }
            }
          }

      val set_current_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_scene" }
            }
          }

      val set_debug_collisions_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_debug_collisions_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_collisions_hint" }
            }
          }

      val set_debug_navigation_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_debug_navigation_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_navigation_hint" }
            }
          }

      val set_edited_scene_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edited_scene_root" }
            }
          }

      val set_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group" }
            }
          }

      val set_group_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group_flags" }
            }
          }

      val set_input_as_handled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_input_as_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_as_handled" }
            }
          }

      val set_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multiplayer" }
            }
          }

      val set_multiplayer_poll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_multiplayer_poll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multiplayer_poll_enabled" }
            }
          }

      val set_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
            }
          }

      val set_pause: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_pause".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pause" }
            }
          }

      val set_quit_on_go_back: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_quit_on_go_back".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_quit_on_go_back" }
            }
          }

      val set_refuse_new_network_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_refuse_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_refuse_new_network_connections" }
            }
          }

      val set_screen_stretch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_screen_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_screen_stretch" }
            }
          }

      val set_use_font_oversampling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_use_font_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_font_oversampling" }
            }
          }
    }
  }
}
