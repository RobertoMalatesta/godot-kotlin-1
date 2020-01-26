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

open class CanvasItem internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val BlendModeAdd: Int = 1

    val BlendModeDisabled: Int = 5

    val BlendModeMix: Int = 0

    val BlendModeMul: Int = 3

    val BlendModePremultAlpha: Int = 4

    val BlendModeSub: Int = 2

    val NotificationDraw: Int = 30

    val NotificationEnterCanvas: Int = 32

    val NotificationExitCanvas: Int = 33

    val NotificationTransformChanged: Int = 2000

    val NotificationVisibilityChanged: Int = 31
  }
}
