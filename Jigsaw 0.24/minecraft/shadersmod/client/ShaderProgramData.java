package shadersmod.client;

import org.lwjgl.opengl.ARBShaderObjects;

public class ShaderProgramData {
	public int programIDGL;
	public int uniform_texture;
	public int uniform_lightmap;
	public int uniform_normals;
	public int uniform_specular;
	public int uniform_shadow;
	public int uniform_watershadow;
	public int uniform_shadowtex0;
	public int uniform_shadowtex1;
	public int uniform_depthtex0;
	public int uniform_depthtex1;
	public int uniform_shadowcolor;
	public int uniform_shadowcolor0;
	public int uniform_shadowcolor1;
	public int uniform_noisetex;
	public int uniform_gcolor;
	public int uniform_gdepth;
	public int uniform_gnormal;
	public int uniform_composite;
	public int uniform_gaux1;
	public int uniform_gaux2;
	public int uniform_gaux3;
	public int uniform_gaux4;
	public int uniform_colortex0;
	public int uniform_colortex1;
	public int uniform_colortex2;
	public int uniform_colortex3;
	public int uniform_colortex4;
	public int uniform_colortex5;
	public int uniform_colortex6;
	public int uniform_colortex7;
	public int uniform_gdepthtex;
	public int uniform_depthtex2;
	public int uniform_tex;
	public int uniform_heldItemId;
	public int uniform_heldBlockLightValue;
	public int uniform_fogMode;
	public int uniform_fogColor;
	public int uniform_skyColor;
	public int uniform_worldTime;
	public int uniform_moonPhase;
	public int uniform_frameTimeCounter;
	public int uniform_sunAngle;
	public int uniform_shadowAngle;
	public int uniform_rainStrength;
	public int uniform_aspectRatio;
	public int uniform_viewWidth;
	public int uniform_viewHeight;
	public int uniform_near;
	public int uniform_far;
	public int uniform_sunPosition;
	public int uniform_moonPosition;
	public int uniform_upPosition;
	public int uniform_previousCameraPosition;
	public int uniform_cameraPosition;
	public int uniform_gbufferModelView;
	public int uniform_gbufferModelViewInverse;
	public int uniform_gbufferPreviousProjection;
	public int uniform_gbufferProjection;
	public int uniform_gbufferProjectionInverse;
	public int uniform_gbufferPreviousModelView;
	public int uniform_shadowProjection;
	public int uniform_shadowProjectionInverse;
	public int uniform_shadowModelView;
	public int uniform_shadowModelViewInverse;
	public int uniform_wetness;
	public int uniform_eyeAltitude;
	public int uniform_eyeBrightness;
	public int uniform_eyeBrightnessSmooth;
	public int uniform_terrainTextureSize;
	public int uniform_terrainIconSize;
	public int uniform_isEyeInWater;
	public int uniform_hideGUI;
	public int uniform_centerDepthSmooth;
	public int uniform_atlasSize;

	public ShaderProgramData(int programID) {
		this.programIDGL = programID;
		this.uniform_texture = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "texture");
		this.uniform_lightmap = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "lightmap");
		this.uniform_normals = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "normals");
		this.uniform_specular = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "specular");
		this.uniform_shadow = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadow");
		this.uniform_watershadow = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "watershadow");
		this.uniform_shadowtex0 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadowtex0");
		this.uniform_shadowtex1 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadowtex1");
		this.uniform_depthtex0 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "depthtex0");
		this.uniform_depthtex1 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "depthtex1");
		this.uniform_shadowcolor = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadowcolor");
		this.uniform_shadowcolor0 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadowcolor0");
		this.uniform_shadowcolor1 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadowcolor1");
		this.uniform_noisetex = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "noisetex");
		this.uniform_gcolor = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gcolor");
		this.uniform_gdepth = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gdepth");
		this.uniform_gnormal = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gnormal");
		this.uniform_composite = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "composite");
		this.uniform_gaux1 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gaux1");
		this.uniform_gaux2 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gaux2");
		this.uniform_gaux3 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gaux3");
		this.uniform_gaux4 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gaux4");
		this.uniform_colortex0 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex0");
		this.uniform_colortex1 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex1");
		this.uniform_colortex2 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex2");
		this.uniform_colortex3 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex3");
		this.uniform_colortex4 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex4");
		this.uniform_colortex5 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex5");
		this.uniform_colortex6 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex6");
		this.uniform_colortex7 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "colortex7");
		this.uniform_gdepthtex = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "gdepthtex");
		this.uniform_depthtex2 = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "depthtex2");
		this.uniform_tex = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "tex");
		this.uniform_heldItemId = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "heldItemId");
		this.uniform_heldBlockLightValue = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "heldBlockLightValue");
		this.uniform_fogMode = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "fogMode");
		this.uniform_fogColor = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "fogColor");
		this.uniform_skyColor = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "skyColor");
		this.uniform_worldTime = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "worldTime");
		this.uniform_moonPhase = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "moonPhase");
		this.uniform_frameTimeCounter = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "frameTimeCounter");
		this.uniform_sunAngle = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "sunAngle");
		this.uniform_shadowAngle = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "shadowAngle");
		this.uniform_rainStrength = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "rainStrength");
		this.uniform_aspectRatio = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "aspectRatio");
		this.uniform_viewWidth = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "viewWidth");
		this.uniform_viewHeight = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "viewHeight");
		this.uniform_near = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "near");
		this.uniform_far = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "far");
		this.uniform_sunPosition = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "sunPosition");
		this.uniform_moonPosition = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "moonPosition");
		this.uniform_upPosition = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "upPosition");
		this.uniform_previousCameraPosition = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "previousCameraPosition");
		this.uniform_cameraPosition = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "cameraPosition");
		this.uniform_gbufferModelView = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "gbufferModelView");
		this.uniform_gbufferModelViewInverse = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "gbufferModelViewInverse");
		this.uniform_gbufferPreviousProjection = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "gbufferPreviousProjection");
		this.uniform_gbufferProjection = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "gbufferProjection");
		this.uniform_gbufferProjectionInverse = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "gbufferProjectionInverse");
		this.uniform_gbufferPreviousModelView = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "gbufferPreviousModelView");
		this.uniform_shadowProjection = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "shadowProjection");
		this.uniform_shadowProjectionInverse = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "shadowProjectionInverse");
		this.uniform_shadowModelView = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "shadowModelView");
		this.uniform_shadowModelViewInverse = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "shadowModelViewInverse");
		this.uniform_wetness = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "wetness");
		this.uniform_eyeAltitude = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "eyeAltitude");
		this.uniform_eyeBrightness = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "eyeBrightness");
		this.uniform_eyeBrightnessSmooth = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "eyeBrightnessSmooth");
		this.uniform_terrainTextureSize = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "terrainTextureSize");
		this.uniform_terrainIconSize = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "terrainIconSize");
		this.uniform_isEyeInWater = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "isEyeInWater");
		this.uniform_hideGUI = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "hideGUI");
		this.uniform_centerDepthSmooth = ARBShaderObjects.glGetUniformLocationARB(programID,
				(CharSequence) "centerDepthSmooth");
		this.uniform_atlasSize = ARBShaderObjects.glGetUniformLocationARB(programID, (CharSequence) "atlasSize");
	}
}
