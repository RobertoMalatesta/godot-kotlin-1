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

open class Light internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  companion object {
    val BakeAll: Int = 2

    val BakeDisabled: Int = 0

    val BakeIndirect: Int = 1

    val ParamAttenuation: Int = 4

    val ParamContactShadowSize: Int = 7

    val ParamEnergy: Int = 0

    val ParamIndirectEnergy: Int = 1

    val ParamMax: Int = 15

    val ParamRange: Int = 3

    val ParamShadowBias: Int = 13

    val ParamShadowBiasSplitScale: Int = 14

    val ParamShadowMaxDistance: Int = 8

    val ParamShadowNormalBias: Int = 12

    val ParamShadowSplit1Offset: Int = 9

    val ParamShadowSplit2Offset: Int = 10

    val ParamShadowSplit3Offset: Int = 11

    val ParamSpecular: Int = 2

    val ParamSpotAngle: Int = 5

    val ParamSpotAttenuation: Int = 6
  }
}
