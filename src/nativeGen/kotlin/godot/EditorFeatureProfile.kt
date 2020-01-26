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

open class EditorFeatureProfile internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class Feature(
    val value: Int
  ) {
    FEATURE_3D(0),

    FEATURE_SCRIPT(1),

    FEATURE_ASSET_LIB(2),

    FEATURE_SCENE_TREE(3),

    FEATURE_IMPORT_DOCK(4),

    FEATURE_NODE_DOCK(5),

    FEATURE_FILESYSTEM_DOCK(6),

    FEATURE_MAX(7);
  }

  companion object {
    val FEATURE_3D: Int = 0

    val FEATURE_ASSET_LIB: Int = 2

    val FEATURE_FILESYSTEM_DOCK: Int = 6

    val FEATURE_IMPORT_DOCK: Int = 4

    val FEATURE_MAX: Int = 7

    val FEATURE_NODE_DOCK: Int = 5

    val FEATURE_SCENE_TREE: Int = 3

    val FEATURE_SCRIPT: Int = 1

    fun new(): EditorFeatureProfile = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFeatureProfile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorFeatureProfile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorFeatureProfile(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorFeatureProfile
     */
    private object __method_bind {
      val get_feature_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "get_feature_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feature_name" }
            }
          }

      val is_class_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "is_class_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_class_disabled" }
            }
          }

      val is_class_editor_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "is_class_editor_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_class_editor_disabled" }
            }
          }

      val is_class_property_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "is_class_property_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_class_property_disabled" }
            }
          }

      val is_feature_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "is_feature_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_feature_disabled" }
            }
          }

      val load_from_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "load_from_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_from_file" }
            }
          }

      val save_to_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "save_to_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_to_file" }
            }
          }

      val set_disable_class: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "set_disable_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_class" }
            }
          }

      val set_disable_class_editor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "set_disable_class_editor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_class_editor" }
            }
          }

      val set_disable_class_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "set_disable_class_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_class_property" }
            }
          }

      val set_disable_feature: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
              "set_disable_feature".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_feature" }
            }
          }
    }
  }
}
