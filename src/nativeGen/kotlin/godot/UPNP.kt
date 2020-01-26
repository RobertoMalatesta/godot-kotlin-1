// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class UPNP internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val UpnpResultActionFailed: Int = 5

    val UpnpResultConflictWithOtherMapping: Int = 13

    val UpnpResultConflictWithOtherMechanism: Int = 12

    val UpnpResultExtPortMustBeWildcard: Int = 10

    val UpnpResultExtPortWildcardNotPermitted: Int = 7

    val UpnpResultHttpError: Int = 23

    val UpnpResultInconsistentParameters: Int = 3

    val UpnpResultIntPortWildcardNotPermitted: Int = 8

    val UpnpResultInvalidArgs: Int = 20

    val UpnpResultInvalidDuration: Int = 19

    val UpnpResultInvalidGateway: Int = 16

    val UpnpResultInvalidParam: Int = 22

    val UpnpResultInvalidPort: Int = 17

    val UpnpResultInvalidProtocol: Int = 18

    val UpnpResultInvalidResponse: Int = 21

    val UpnpResultMemAllocError: Int = 25

    val UpnpResultNotAuthorized: Int = 1

    val UpnpResultNoDevices: Int = 27

    val UpnpResultNoGateway: Int = 26

    val UpnpResultNoPortMapsAvailable: Int = 11

    val UpnpResultNoSuchEntryInArray: Int = 4

    val UpnpResultOnlyPermanentLeaseSupported: Int = 15

    val UpnpResultPortMappingNotFound: Int = 2

    val UpnpResultRemoteHostMustBeWildcard: Int = 9

    val UpnpResultSamePortValuesRequired: Int = 14

    val UpnpResultSocketError: Int = 24

    val UpnpResultSrcIpWildcardNotPermitted: Int = 6

    val UpnpResultSuccess: Int = 0

    val UpnpResultUnknownError: Int = 28

    fun new(): UPNP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNP".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for UPNP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      UPNP(
        fn()
      )
    }}
}
