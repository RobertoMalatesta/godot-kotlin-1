// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class PacketPeerUDP(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun close() {
    __method_bind.close.call(this._handle)
  }

  fun getPacketIp(): String {
    val _ret = __method_bind.get_packet_ip.call(this._handle)
    return _ret.asString()
  }

  fun getPacketPort(): Int {
    val _ret = __method_bind.get_packet_port.call(this._handle)
    return _ret.asInt()
  }

  fun isListening(): Boolean {
    val _ret = __method_bind.is_listening.call(this._handle)
    return _ret.asBoolean()
  }

  fun listen(
    port: Int,
    bindAddress: String,
    recvBufSize: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(bindAddress)
    _args.append(recvBufSize)
    val _ret = __method_bind.listen.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun setDestAddress(host: String, port: Int): GDError {
    val _args = VariantArray.new()
    _args.append(host)
    _args.append(port)
    val _ret = __method_bind.set_dest_address.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun wait(): GDError {
    val _ret = __method_bind.wait.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): PacketPeerUDP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerUDP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PacketPeerUDP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PacketPeerUDP(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PacketPeerUDP = PacketPeerUDP(ptr)
    /**
     * Container for method_bind pointers for PacketPeerUDP
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val get_packet_ip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "get_packet_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_ip" }
        }
      val get_packet_port: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "get_packet_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_port" }
        }
      val is_listening: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "is_listening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_listening" }
        }
      val listen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val set_dest_address: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "set_dest_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dest_address" }
        }
      val wait: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "wait".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wait" }
        }}
  }
}
