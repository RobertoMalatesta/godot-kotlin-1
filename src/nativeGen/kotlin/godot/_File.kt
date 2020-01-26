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

open class _File internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class CompressionMode(
    val value: Int
  ) {
    COMPRESSION_FASTLZ(0),

    COMPRESSION_DEFLATE(1),

    COMPRESSION_ZSTD(2),

    COMPRESSION_GZIP(3);
  }

  enum class ModeFlags(
    val value: Int
  ) {
    READ(1),

    WRITE(2),

    READ_WRITE(3),

    WRITE_READ(7);
  }

  companion object {
    val COMPRESSION_DEFLATE: Int = 1

    val COMPRESSION_FASTLZ: Int = 0

    val COMPRESSION_GZIP: Int = 3

    val COMPRESSION_ZSTD: Int = 2

    val READ: Int = 1

    val READ_WRITE: Int = 3

    val WRITE: Int = 2

    val WRITE_READ: Int = 7

    fun new(): _File = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_File".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton _File" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _File(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for _File
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val eof_reached: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "eof_reached".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method eof_reached" }
            }
          }

      val file_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "file_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method file_exists" }
            }
          }

      val get_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_16" }
            }
          }

      val get_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_32" }
            }
          }

      val get_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_64" }
            }
          }

      val get_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_8" }
            }
          }

      val get_as_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_as_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_as_text" }
            }
          }

      val get_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffer" }
            }
          }

      val get_csv_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_csv_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_csv_line" }
            }
          }

      val get_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_double" }
            }
          }

      val get_endian_swap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_endian_swap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_endian_swap" }
            }
          }

      val get_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_error" }
            }
          }

      val get_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_float" }
            }
          }

      val get_len: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_len".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_len" }
            }
          }

      val get_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line" }
            }
          }

      val get_md5: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_md5".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_md5" }
            }
          }

      val get_modified_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_modified_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modified_time" }
            }
          }

      val get_pascal_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_pascal_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pascal_string" }
            }
          }

      val get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path" }
            }
          }

      val get_path_absolute: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_path_absolute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path_absolute" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_real: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_real".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_real" }
            }
          }

      val get_sha256: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_sha256".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sha256" }
            }
          }

      val get_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var" }
            }
          }

      val is_open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "is_open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_open" }
            }
          }

      val open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open" }
            }
          }

      val open_compressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_compressed" }
            }
          }

      val open_encrypted: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open_encrypted".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_encrypted" }
            }
          }

      val open_encrypted_with_pass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open_encrypted_with_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_encrypted_with_pass" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val seek_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "seek_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek_end" }
            }
          }

      val set_endian_swap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "set_endian_swap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_endian_swap" }
            }
          }

      val store_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_16" }
            }
          }

      val store_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_32" }
            }
          }

      val store_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_64" }
            }
          }

      val store_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_8" }
            }
          }

      val store_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_buffer" }
            }
          }

      val store_csv_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_csv_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_csv_line" }
            }
          }

      val store_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_double" }
            }
          }

      val store_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_float" }
            }
          }

      val store_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_line" }
            }
          }

      val store_pascal_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_pascal_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_pascal_string" }
            }
          }

      val store_real: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_real".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_real" }
            }
          }

      val store_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_string" }
            }
          }

      val store_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_var" }
            }
          }
    }
  }
}
