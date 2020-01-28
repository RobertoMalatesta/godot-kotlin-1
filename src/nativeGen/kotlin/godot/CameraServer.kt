// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addFeed(feed: CameraFeed) {
    val _arg = Variant.new(feed)
    __method_bind.add_feed.call(this._handle, _arg, 1)
  }

  fun feeds(): VariantArray {
    val _ret = __method_bind.feeds.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getFeed(index: Int): CameraFeed {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_feed.call(this._handle, _arg, 1)
    return _ret.asObject(::CameraFeed)!!
  }

  fun getFeedCount(): Int {
    val _ret = __method_bind.get_feed_count.call(this._handle)
    return _ret.asInt()
  }

  fun removeFeed(feed: CameraFeed) {
    val _arg = Variant.new(feed)
    __method_bind.remove_feed.call(this._handle, _arg, 1)
  }

  enum class FeedImage(
    val value: Int
  ) {
    FEED_RGBA_IMAGE(0),

    FEED_YCbCr_IMAGE(0),

    FEED_Y_IMAGE(0),

    FEED_CbCr_IMAGE(1);

    companion object {
      fun from(value: Int): FeedImage {
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
    val Instance: CameraServer
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("CameraServer".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton CameraServer" }
        CameraServer(
          handle
        )
      }
    val FEED_CbCr_IMAGE: Int = 1

    val FEED_RGBA_IMAGE: Int = 0

    val FEED_YCbCr_IMAGE: Int = 0

    val FEED_Y_IMAGE: Int = 0

    /**
     * Container for method_bind pointers for CameraServer
     */
    private object __method_bind {
      val add_feed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "add_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_feed" }
        }
      val feeds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "feeds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method feeds" }
        }
      val get_feed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "get_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feed" }
        }
      val get_feed_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "get_feed_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feed_count" }
        }
      val remove_feed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "remove_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_feed" }
        }}
  }
}
