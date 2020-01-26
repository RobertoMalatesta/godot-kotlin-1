// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Basis
import godot.core.Color
import godot.core.Godot
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Environment internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getAdjustmentBrightness(): Float {
    TODO()
  }

  fun getAdjustmentColorCorrection(): Texture {
    TODO()
  }

  fun getAdjustmentContrast(): Float {
    TODO()
  }

  fun getAdjustmentSaturation(): Float {
    TODO()
  }

  fun getAmbientLightColor(): Color {
    TODO()
  }

  fun getAmbientLightEnergy(): Float {
    TODO()
  }

  fun getAmbientLightSkyContribution(): Float {
    TODO()
  }

  fun getBackground(): BGMode {
    TODO()
  }

  fun getBgColor(): Color {
    TODO()
  }

  fun getBgEnergy(): Float {
    TODO()
  }

  fun getCameraFeedId(): Int {
    TODO()
  }

  fun getCanvasMaxLayer(): Int {
    TODO()
  }

  fun getDofBlurFarAmount(): Float {
    TODO()
  }

  fun getDofBlurFarDistance(): Float {
    TODO()
  }

  fun getDofBlurFarQuality(): DOFBlurQuality {
    TODO()
  }

  fun getDofBlurFarTransition(): Float {
    TODO()
  }

  fun getDofBlurNearAmount(): Float {
    TODO()
  }

  fun getDofBlurNearDistance(): Float {
    TODO()
  }

  fun getDofBlurNearQuality(): DOFBlurQuality {
    TODO()
  }

  fun getDofBlurNearTransition(): Float {
    TODO()
  }

  fun getFogColor(): Color {
    TODO()
  }

  fun getFogDepthBegin(): Float {
    TODO()
  }

  fun getFogDepthCurve(): Float {
    TODO()
  }

  fun getFogDepthEnd(): Float {
    TODO()
  }

  fun getFogHeightCurve(): Float {
    TODO()
  }

  fun getFogHeightMax(): Float {
    TODO()
  }

  fun getFogHeightMin(): Float {
    TODO()
  }

  fun getFogSunAmount(): Float {
    TODO()
  }

  fun getFogSunColor(): Color {
    TODO()
  }

  fun getFogTransmitCurve(): Float {
    TODO()
  }

  fun getGlowBlendMode(): GlowBlendMode {
    TODO()
  }

  fun getGlowBloom(): Float {
    TODO()
  }

  fun getGlowHdrBleedScale(): Float {
    TODO()
  }

  fun getGlowHdrBleedThreshold(): Float {
    TODO()
  }

  fun getGlowHdrLuminanceCap(): Float {
    TODO()
  }

  fun getGlowIntensity(): Float {
    TODO()
  }

  fun getGlowStrength(): Float {
    TODO()
  }

  fun getSky(): Sky {
    TODO()
  }

  fun getSkyCustomFov(): Float {
    TODO()
  }

  fun getSkyOrientation(): Basis {
    TODO()
  }

  fun getSkyRotation(): Vector3 {
    TODO()
  }

  fun getSkyRotationDegrees(): Vector3 {
    TODO()
  }

  fun getSsaoAoChannelAffect(): Float {
    TODO()
  }

  fun getSsaoBias(): Float {
    TODO()
  }

  fun getSsaoBlur(): SSAOBlur {
    TODO()
  }

  fun getSsaoColor(): Color {
    TODO()
  }

  fun getSsaoDirectLightAffect(): Float {
    TODO()
  }

  fun getSsaoEdgeSharpness(): Float {
    TODO()
  }

  fun getSsaoIntensity(): Float {
    TODO()
  }

  fun getSsaoIntensity2(): Float {
    TODO()
  }

  fun getSsaoQuality(): SSAOQuality {
    TODO()
  }

  fun getSsaoRadius(): Float {
    TODO()
  }

  fun getSsaoRadius2(): Float {
    TODO()
  }

  fun getSsrDepthTolerance(): Float {
    TODO()
  }

  fun getSsrFadeIn(): Float {
    TODO()
  }

  fun getSsrFadeOut(): Float {
    TODO()
  }

  fun getSsrMaxSteps(): Int {
    TODO()
  }

  fun getTonemapAutoExposure(): Boolean {
    TODO()
  }

  fun getTonemapAutoExposureGrey(): Float {
    TODO()
  }

  fun getTonemapAutoExposureMax(): Float {
    TODO()
  }

  fun getTonemapAutoExposureMin(): Float {
    TODO()
  }

  fun getTonemapAutoExposureSpeed(): Float {
    TODO()
  }

  fun getTonemapExposure(): Float {
    TODO()
  }

  fun getTonemapWhite(): Float {
    TODO()
  }

  fun getTonemapper(): ToneMapper {
    TODO()
  }

  fun isAdjustmentEnabled(): Boolean {
    TODO()
  }

  fun isDofBlurFarEnabled(): Boolean {
    TODO()
  }

  fun isDofBlurNearEnabled(): Boolean {
    TODO()
  }

  fun isFogDepthEnabled(): Boolean {
    TODO()
  }

  fun isFogEnabled(): Boolean {
    TODO()
  }

  fun isFogHeightEnabled(): Boolean {
    TODO()
  }

  fun isFogTransmitEnabled(): Boolean {
    TODO()
  }

  fun isGlowBicubicUpscaleEnabled(): Boolean {
    TODO()
  }

  fun isGlowEnabled(): Boolean {
    TODO()
  }

  fun isGlowLevelEnabled(idx: Int): Boolean {
    TODO()
  }

  fun isSsaoEnabled(): Boolean {
    TODO()
  }

  fun isSsrEnabled(): Boolean {
    TODO()
  }

  fun isSsrRough(): Boolean {
    TODO()
  }

  fun setAdjustmentBrightness(brightness: Float) {
    TODO()
  }

  fun setAdjustmentColorCorrection(color_correction: Texture) {
    TODO()
  }

  fun setAdjustmentContrast(contrast: Float) {
    TODO()
  }

  fun setAdjustmentEnable(enabled: Boolean) {
    TODO()
  }

  fun setAdjustmentSaturation(saturation: Float) {
    TODO()
  }

  fun setAmbientLightColor(color: Color) {
    TODO()
  }

  fun setAmbientLightEnergy(energy: Float) {
    TODO()
  }

  fun setAmbientLightSkyContribution(energy: Float) {
    TODO()
  }

  fun setBackground(mode: Int) {
    TODO()
  }

  fun setBgColor(color: Color) {
    TODO()
  }

  fun setBgEnergy(energy: Float) {
    TODO()
  }

  fun setCameraFeedId(camera_feed_id: Int) {
    TODO()
  }

  fun setCanvasMaxLayer(layer: Int) {
    TODO()
  }

  fun setDofBlurFarAmount(intensity: Float) {
    TODO()
  }

  fun setDofBlurFarDistance(intensity: Float) {
    TODO()
  }

  fun setDofBlurFarEnabled(enabled: Boolean) {
    TODO()
  }

  fun setDofBlurFarQuality(intensity: Int) {
    TODO()
  }

  fun setDofBlurFarTransition(intensity: Float) {
    TODO()
  }

  fun setDofBlurNearAmount(intensity: Float) {
    TODO()
  }

  fun setDofBlurNearDistance(intensity: Float) {
    TODO()
  }

  fun setDofBlurNearEnabled(enabled: Boolean) {
    TODO()
  }

  fun setDofBlurNearQuality(level: Int) {
    TODO()
  }

  fun setDofBlurNearTransition(intensity: Float) {
    TODO()
  }

  fun setFogColor(color: Color) {
    TODO()
  }

  fun setFogDepthBegin(distance: Float) {
    TODO()
  }

  fun setFogDepthCurve(curve: Float) {
    TODO()
  }

  fun setFogDepthEnabled(enabled: Boolean) {
    TODO()
  }

  fun setFogDepthEnd(distance: Float) {
    TODO()
  }

  fun setFogEnabled(enabled: Boolean) {
    TODO()
  }

  fun setFogHeightCurve(curve: Float) {
    TODO()
  }

  fun setFogHeightEnabled(enabled: Boolean) {
    TODO()
  }

  fun setFogHeightMax(height: Float) {
    TODO()
  }

  fun setFogHeightMin(height: Float) {
    TODO()
  }

  fun setFogSunAmount(amount: Float) {
    TODO()
  }

  fun setFogSunColor(color: Color) {
    TODO()
  }

  fun setFogTransmitCurve(curve: Float) {
    TODO()
  }

  fun setFogTransmitEnabled(enabled: Boolean) {
    TODO()
  }

  fun setGlowBicubicUpscale(enabled: Boolean) {
    TODO()
  }

  fun setGlowBlendMode(mode: Int) {
    TODO()
  }

  fun setGlowBloom(amount: Float) {
    TODO()
  }

  fun setGlowEnabled(enabled: Boolean) {
    TODO()
  }

  fun setGlowHdrBleedScale(scale: Float) {
    TODO()
  }

  fun setGlowHdrBleedThreshold(threshold: Float) {
    TODO()
  }

  fun setGlowHdrLuminanceCap(amount: Float) {
    TODO()
  }

  fun setGlowIntensity(intensity: Float) {
    TODO()
  }

  fun setGlowLevel(idx: Int, enabled: Boolean) {
    TODO()
  }

  fun setGlowStrength(strength: Float) {
    TODO()
  }

  fun setSky(sky: Sky) {
    TODO()
  }

  fun setSkyCustomFov(scale: Float) {
    TODO()
  }

  fun setSkyOrientation(orientation: Basis) {
    TODO()
  }

  fun setSkyRotation(euler_radians: Vector3) {
    TODO()
  }

  fun setSkyRotationDegrees(euler_degrees: Vector3) {
    TODO()
  }

  fun setSsaoAoChannelAffect(amount: Float) {
    TODO()
  }

  fun setSsaoBias(bias: Float) {
    TODO()
  }

  fun setSsaoBlur(mode: Int) {
    TODO()
  }

  fun setSsaoColor(color: Color) {
    TODO()
  }

  fun setSsaoDirectLightAffect(amount: Float) {
    TODO()
  }

  fun setSsaoEdgeSharpness(edge_sharpness: Float) {
    TODO()
  }

  fun setSsaoEnabled(enabled: Boolean) {
    TODO()
  }

  fun setSsaoIntensity(intensity: Float) {
    TODO()
  }

  fun setSsaoIntensity2(intensity: Float) {
    TODO()
  }

  fun setSsaoQuality(quality: Int) {
    TODO()
  }

  fun setSsaoRadius(radius: Float) {
    TODO()
  }

  fun setSsaoRadius2(radius: Float) {
    TODO()
  }

  fun setSsrDepthTolerance(depth_tolerance: Float) {
    TODO()
  }

  fun setSsrEnabled(enabled: Boolean) {
    TODO()
  }

  fun setSsrFadeIn(fade_in: Float) {
    TODO()
  }

  fun setSsrFadeOut(fade_out: Float) {
    TODO()
  }

  fun setSsrMaxSteps(max_steps: Int) {
    TODO()
  }

  fun setSsrRough(rough: Boolean) {
    TODO()
  }

  fun setTonemapAutoExposure(auto_exposure: Boolean) {
    TODO()
  }

  fun setTonemapAutoExposureGrey(exposure_grey: Float) {
    TODO()
  }

  fun setTonemapAutoExposureMax(exposure_max: Float) {
    TODO()
  }

  fun setTonemapAutoExposureMin(exposure_min: Float) {
    TODO()
  }

  fun setTonemapAutoExposureSpeed(exposure_speed: Float) {
    TODO()
  }

  fun setTonemapExposure(exposure: Float) {
    TODO()
  }

  fun setTonemapWhite(white: Float) {
    TODO()
  }

  fun setTonemapper(mode: Int) {
    TODO()
  }

  enum class SSAOBlur(
    val value: Int
  ) {
    SSAO_BLUR_DISABLED(0),

    SSAO_BLUR_1x1(1),

    SSAO_BLUR_2x2(2),

    SSAO_BLUR_3x3(3);

    companion object {
      fun from(value: Int): SSAOBlur {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ToneMapper(
    val value: Int
  ) {
    TONE_MAPPER_LINEAR(0),

    TONE_MAPPER_REINHARDT(1),

    TONE_MAPPER_FILMIC(2),

    TONE_MAPPER_ACES(3);

    companion object {
      fun from(value: Int): ToneMapper {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class GlowBlendMode(
    val value: Int
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);

    companion object {
      fun from(value: Int): GlowBlendMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BGMode(
    val value: Int
  ) {
    BG_CLEAR_COLOR(0),

    BG_COLOR(1),

    BG_SKY(2),

    BG_COLOR_SKY(3),

    BG_CANVAS(4),

    BG_KEEP(5),

    BG_CAMERA_FEED(6),

    BG_MAX(7);

    companion object {
      fun from(value: Int): BGMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SSAOQuality(
    val value: Int
  ) {
    SSAO_QUALITY_LOW(0),

    SSAO_QUALITY_MEDIUM(1),

    SSAO_QUALITY_HIGH(2);

    companion object {
      fun from(value: Int): SSAOQuality {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DOFBlurQuality(
    val value: Int
  ) {
    DOF_BLUR_QUALITY_LOW(0),

    DOF_BLUR_QUALITY_MEDIUM(1),

    DOF_BLUR_QUALITY_HIGH(2);

    companion object {
      fun from(value: Int): DOFBlurQuality {
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
    val BG_CAMERA_FEED: Int = 6

    val BG_CANVAS: Int = 4

    val BG_CLEAR_COLOR: Int = 0

    val BG_COLOR: Int = 1

    val BG_COLOR_SKY: Int = 3

    val BG_KEEP: Int = 5

    val BG_MAX: Int = 7

    val BG_SKY: Int = 2

    val DOF_BLUR_QUALITY_HIGH: Int = 2

    val DOF_BLUR_QUALITY_LOW: Int = 0

    val DOF_BLUR_QUALITY_MEDIUM: Int = 1

    val GLOW_BLEND_MODE_ADDITIVE: Int = 0

    val GLOW_BLEND_MODE_REPLACE: Int = 3

    val GLOW_BLEND_MODE_SCREEN: Int = 1

    val GLOW_BLEND_MODE_SOFTLIGHT: Int = 2

    val SSAO_BLUR_1x1: Int = 1

    val SSAO_BLUR_2x2: Int = 2

    val SSAO_BLUR_3x3: Int = 3

    val SSAO_BLUR_DISABLED: Int = 0

    val SSAO_QUALITY_HIGH: Int = 2

    val SSAO_QUALITY_LOW: Int = 0

    val SSAO_QUALITY_MEDIUM: Int = 1

    val TONE_MAPPER_ACES: Int = 3

    val TONE_MAPPER_FILMIC: Int = 2

    val TONE_MAPPER_LINEAR: Int = 0

    val TONE_MAPPER_REINHARDT: Int = 1

    fun new(): Environment = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Environment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Environment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Environment(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Environment = Environment(ptr)
    /**
     * Container for method_bind pointers for Environment
     */
    private object __method_bind {
      val get_adjustment_brightness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_brightness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_adjustment_brightness" }
            }
          }

      val get_adjustment_color_correction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_color_correction".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_adjustment_color_correction" }
            }
          }

      val get_adjustment_contrast: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_contrast".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_adjustment_contrast" }
            }
          }

      val get_adjustment_saturation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_saturation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_adjustment_saturation" }
            }
          }

      val get_ambient_light_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ambient_light_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ambient_light_color" }
            }
          }

      val get_ambient_light_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ambient_light_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ambient_light_energy" }
            }
          }

      val get_ambient_light_sky_contribution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ambient_light_sky_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_ambient_light_sky_contribution" }
            }
          }

      val get_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_background" }
            }
          }

      val get_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
            }
          }

      val get_bg_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_bg_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bg_energy" }
            }
          }

      val get_camera_feed_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_camera_feed_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
            }
          }

      val get_canvas_max_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_canvas_max_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_max_layer" }
            }
          }

      val get_dof_blur_far_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_amount" }
            }
          }

      val get_dof_blur_far_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_distance" }
            }
          }

      val get_dof_blur_far_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_quality" }
            }
          }

      val get_dof_blur_far_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_transition" }
            }
          }

      val get_dof_blur_near_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_amount" }
            }
          }

      val get_dof_blur_near_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_distance" }
            }
          }

      val get_dof_blur_near_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_quality" }
            }
          }

      val get_dof_blur_near_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_transition" }
            }
          }

      val get_fog_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_color" }
            }
          }

      val get_fog_depth_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_depth_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_depth_begin" }
            }
          }

      val get_fog_depth_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_depth_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_depth_curve" }
            }
          }

      val get_fog_depth_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_depth_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_depth_end" }
            }
          }

      val get_fog_height_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_height_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_height_curve" }
            }
          }

      val get_fog_height_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_height_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_height_max" }
            }
          }

      val get_fog_height_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_height_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_height_min" }
            }
          }

      val get_fog_sun_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_sun_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_sun_amount" }
            }
          }

      val get_fog_sun_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_sun_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_sun_color" }
            }
          }

      val get_fog_transmit_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_transmit_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_transmit_curve" }
            }
          }

      val get_glow_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_blend_mode" }
            }
          }

      val get_glow_bloom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_bloom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_bloom" }
            }
          }

      val get_glow_hdr_bleed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_hdr_bleed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_scale" }
            }
          }

      val get_glow_hdr_bleed_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_hdr_bleed_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_threshold" }
            }
          }

      val get_glow_hdr_luminance_cap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_hdr_luminance_cap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_luminance_cap" }
            }
          }

      val get_glow_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_intensity" }
            }
          }

      val get_glow_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_strength" }
            }
          }

      val get_sky: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky" }
            }
          }

      val get_sky_custom_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_custom_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_custom_fov" }
            }
          }

      val get_sky_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_orientation" }
            }
          }

      val get_sky_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_rotation" }
            }
          }

      val get_sky_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_rotation_degrees" }
            }
          }

      val get_ssao_ao_channel_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_ao_channel_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_ao_channel_affect" }
            }
          }

      val get_ssao_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_bias" }
            }
          }

      val get_ssao_blur: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_blur".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_blur" }
            }
          }

      val get_ssao_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_color" }
            }
          }

      val get_ssao_direct_light_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_direct_light_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_direct_light_affect" }
            }
          }

      val get_ssao_edge_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_edge_sharpness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_edge_sharpness" }
            }
          }

      val get_ssao_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity" }
            }
          }

      val get_ssao_intensity2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_intensity2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity2" }
            }
          }

      val get_ssao_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_quality" }
            }
          }

      val get_ssao_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_radius" }
            }
          }

      val get_ssao_radius2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_radius2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_radius2" }
            }
          }

      val get_ssr_depth_tolerance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_depth_tolerance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_depth_tolerance" }
            }
          }

      val get_ssr_fade_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_fade_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_in" }
            }
          }

      val get_ssr_fade_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_fade_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_out" }
            }
          }

      val get_ssr_max_steps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_max_steps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_max_steps" }
            }
          }

      val get_tonemap_auto_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure" }
            }
          }

      val get_tonemap_auto_exposure_grey: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_grey".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_grey"
              }
            }
          }

      val get_tonemap_auto_exposure_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_max"
              }
            }
          }

      val get_tonemap_auto_exposure_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_min"
              }
            }
          }

      val get_tonemap_auto_exposure_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_speed".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_tonemap_auto_exposure_speed" }
            }
          }

      val get_tonemap_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_exposure" }
            }
          }

      val get_tonemap_white: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_white".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_white" }
            }
          }

      val get_tonemapper: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemapper".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemapper" }
            }
          }

      val is_adjustment_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_adjustment_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_adjustment_enabled" }
            }
          }

      val is_dof_blur_far_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_dof_blur_far_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_dof_blur_far_enabled" }
            }
          }

      val is_dof_blur_near_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_dof_blur_near_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_dof_blur_near_enabled" }
            }
          }

      val is_fog_depth_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_depth_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_depth_enabled" }
            }
          }

      val is_fog_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_enabled" }
            }
          }

      val is_fog_height_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_height_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_height_enabled" }
            }
          }

      val is_fog_transmit_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_transmit_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_transmit_enabled" }
            }
          }

      val is_glow_bicubic_upscale_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_glow_bicubic_upscale_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_glow_bicubic_upscale_enabled" }
            }
          }

      val is_glow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_glow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_glow_enabled" }
            }
          }

      val is_glow_level_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_glow_level_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_glow_level_enabled" }
            }
          }

      val is_ssao_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_ssao_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ssao_enabled" }
            }
          }

      val is_ssr_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_ssr_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ssr_enabled" }
            }
          }

      val is_ssr_rough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_ssr_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ssr_rough" }
            }
          }

      val set_adjustment_brightness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_brightness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_brightness" }
            }
          }

      val set_adjustment_color_correction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_color_correction".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_adjustment_color_correction" }
            }
          }

      val set_adjustment_contrast: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_contrast".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_contrast" }
            }
          }

      val set_adjustment_enable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_enable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_enable" }
            }
          }

      val set_adjustment_saturation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_saturation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_saturation" }
            }
          }

      val set_ambient_light_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ambient_light_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ambient_light_color" }
            }
          }

      val set_ambient_light_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ambient_light_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ambient_light_energy" }
            }
          }

      val set_ambient_light_sky_contribution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ambient_light_sky_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_ambient_light_sky_contribution" }
            }
          }

      val set_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_background" }
            }
          }

      val set_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
            }
          }

      val set_bg_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_bg_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bg_energy" }
            }
          }

      val set_camera_feed_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_camera_feed_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
            }
          }

      val set_canvas_max_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_canvas_max_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_canvas_max_layer" }
            }
          }

      val set_dof_blur_far_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_amount" }
            }
          }

      val set_dof_blur_far_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_distance" }
            }
          }

      val set_dof_blur_far_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_enabled" }
            }
          }

      val set_dof_blur_far_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_quality" }
            }
          }

      val set_dof_blur_far_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_transition" }
            }
          }

      val set_dof_blur_near_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_amount" }
            }
          }

      val set_dof_blur_near_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_distance" }
            }
          }

      val set_dof_blur_near_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_enabled" }
            }
          }

      val set_dof_blur_near_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_quality" }
            }
          }

      val set_dof_blur_near_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_transition" }
            }
          }

      val set_fog_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_color" }
            }
          }

      val set_fog_depth_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_begin" }
            }
          }

      val set_fog_depth_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_curve" }
            }
          }

      val set_fog_depth_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_enabled" }
            }
          }

      val set_fog_depth_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_end" }
            }
          }

      val set_fog_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_enabled" }
            }
          }

      val set_fog_height_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_curve" }
            }
          }

      val set_fog_height_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_enabled" }
            }
          }

      val set_fog_height_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_max" }
            }
          }

      val set_fog_height_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_min" }
            }
          }

      val set_fog_sun_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_sun_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_sun_amount" }
            }
          }

      val set_fog_sun_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_sun_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_sun_color" }
            }
          }

      val set_fog_transmit_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_transmit_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_curve" }
            }
          }

      val set_fog_transmit_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_transmit_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_enabled" }
            }
          }

      val set_glow_bicubic_upscale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_bicubic_upscale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_bicubic_upscale" }
            }
          }

      val set_glow_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_blend_mode" }
            }
          }

      val set_glow_bloom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_bloom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_bloom" }
            }
          }

      val set_glow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_enabled" }
            }
          }

      val set_glow_hdr_bleed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_hdr_bleed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_scale" }
            }
          }

      val set_glow_hdr_bleed_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_hdr_bleed_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_threshold" }
            }
          }

      val set_glow_hdr_luminance_cap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_hdr_luminance_cap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_luminance_cap" }
            }
          }

      val set_glow_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_intensity" }
            }
          }

      val set_glow_level: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_level".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_level" }
            }
          }

      val set_glow_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_strength" }
            }
          }

      val set_sky: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky" }
            }
          }

      val set_sky_custom_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_custom_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_custom_fov" }
            }
          }

      val set_sky_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_orientation" }
            }
          }

      val set_sky_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_rotation" }
            }
          }

      val set_sky_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_rotation_degrees" }
            }
          }

      val set_ssao_ao_channel_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_ao_channel_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_ao_channel_affect" }
            }
          }

      val set_ssao_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_bias" }
            }
          }

      val set_ssao_blur: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_blur".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_blur" }
            }
          }

      val set_ssao_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_color" }
            }
          }

      val set_ssao_direct_light_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_direct_light_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_direct_light_affect" }
            }
          }

      val set_ssao_edge_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_edge_sharpness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_edge_sharpness" }
            }
          }

      val set_ssao_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_enabled" }
            }
          }

      val set_ssao_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity" }
            }
          }

      val set_ssao_intensity2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_intensity2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity2" }
            }
          }

      val set_ssao_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_quality" }
            }
          }

      val set_ssao_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_radius" }
            }
          }

      val set_ssao_radius2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_radius2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_radius2" }
            }
          }

      val set_ssr_depth_tolerance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_depth_tolerance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_depth_tolerance" }
            }
          }

      val set_ssr_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_enabled" }
            }
          }

      val set_ssr_fade_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_fade_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_in" }
            }
          }

      val set_ssr_fade_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_fade_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_out" }
            }
          }

      val set_ssr_max_steps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_max_steps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_max_steps" }
            }
          }

      val set_ssr_rough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_rough" }
            }
          }

      val set_tonemap_auto_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure" }
            }
          }

      val set_tonemap_auto_exposure_grey: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_grey".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_grey"
              }
            }
          }

      val set_tonemap_auto_exposure_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_max"
              }
            }
          }

      val set_tonemap_auto_exposure_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_min"
              }
            }
          }

      val set_tonemap_auto_exposure_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_speed".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_tonemap_auto_exposure_speed" }
            }
          }

      val set_tonemap_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_exposure" }
            }
          }

      val set_tonemap_white: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_white".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_white" }
            }
          }

      val set_tonemapper: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemapper".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemapper" }
            }
          }
    }
  }
}
