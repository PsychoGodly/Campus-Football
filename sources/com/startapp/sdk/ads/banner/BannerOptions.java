package com.startapp.sdk.ads.banner;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BannerOptions implements Serializable {
    private static final long serialVersionUID = -5495602901437914475L;
    private int adsNumber = 4;
    private boolean checkAlpha = true;
    private boolean checkCoverage = true;
    private boolean checkFocus;
    private boolean checkVisibility = true;
    private int delayFaceTime = UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;
    @d9(type = Effect.class)
    private Effect effect = Effect.ROTATE_3D;
    private int height = 50;
    private float heightRatio = 1.0f;
    private int htmlAdsNumber = 10;
    private float minScale = 0.88f;
    private int minViewabilityPercentage = 50;
    private boolean preCheck;
    private int refreshRate = 60000;
    private int refreshRate3D = 60000;
    private boolean rotateThroughOnStart = true;
    private int rotateThroughSpeedMult = 2;
    private int scalePower = 4;
    private int stepSize = 5;
    private int timeBetweenFrames = 25;
    private int width = 300;
    private float widthRatio = 1.0f;

    /* compiled from: Sta */
    public enum Effect {
        ROTATE_3D(1),
        EXCHANGE(2),
        FLY_IN(3);
        
        private int index;

        private Effect(int i10) {
            this.index = i10;
        }

        public int getRotationMultiplier() {
            return (int) Math.pow(2.0d, (double) (this.index - 1));
        }
    }

    public BannerOptions() {
    }

    public void a(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public int b() {
        return this.delayFaceTime;
    }

    public Effect c() {
        return this.effect;
    }

    public int d() {
        return this.height;
    }

    public float e() {
        return this.heightRatio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerOptions bannerOptions = (BannerOptions) obj;
        if (this.width == bannerOptions.width && this.height == bannerOptions.height && this.minViewabilityPercentage == bannerOptions.minViewabilityPercentage && this.preCheck == bannerOptions.preCheck && this.checkFocus == bannerOptions.checkFocus && this.checkCoverage == bannerOptions.checkCoverage && this.checkVisibility == bannerOptions.checkVisibility && this.checkAlpha == bannerOptions.checkAlpha && this.timeBetweenFrames == bannerOptions.timeBetweenFrames && this.stepSize == bannerOptions.stepSize && this.delayFaceTime == bannerOptions.delayFaceTime && this.adsNumber == bannerOptions.adsNumber && this.htmlAdsNumber == bannerOptions.htmlAdsNumber && this.refreshRate3D == bannerOptions.refreshRate3D && Float.compare(this.widthRatio, bannerOptions.widthRatio) == 0 && Float.compare(this.heightRatio, bannerOptions.heightRatio) == 0 && Float.compare(this.minScale, bannerOptions.minScale) == 0 && this.scalePower == bannerOptions.scalePower && this.rotateThroughOnStart == bannerOptions.rotateThroughOnStart && this.rotateThroughSpeedMult == bannerOptions.rotateThroughSpeedMult && this.refreshRate == bannerOptions.refreshRate && this.effect == bannerOptions.effect) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.htmlAdsNumber;
    }

    public float g() {
        return this.minScale;
    }

    public int h() {
        return this.minViewabilityPercentage;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.minViewabilityPercentage), Boolean.valueOf(this.preCheck), Boolean.valueOf(this.checkFocus), Boolean.valueOf(this.checkCoverage), Boolean.valueOf(this.checkVisibility), Boolean.valueOf(this.checkAlpha), Integer.valueOf(this.timeBetweenFrames), Integer.valueOf(this.stepSize), Integer.valueOf(this.delayFaceTime), Integer.valueOf(this.adsNumber), Integer.valueOf(this.htmlAdsNumber), Integer.valueOf(this.refreshRate3D), Float.valueOf(this.widthRatio), Float.valueOf(this.heightRatio), Float.valueOf(this.minScale), Integer.valueOf(this.scalePower), this.effect, Boolean.valueOf(this.rotateThroughOnStart), Integer.valueOf(this.rotateThroughSpeedMult), Integer.valueOf(this.refreshRate)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public int i() {
        return this.refreshRate;
    }

    public int j() {
        return this.refreshRate3D;
    }

    public int k() {
        return this.rotateThroughSpeedMult;
    }

    public int l() {
        return this.scalePower;
    }

    public int m() {
        return this.stepSize;
    }

    public int n() {
        return this.timeBetweenFrames;
    }

    public int o() {
        return this.width;
    }

    public float p() {
        return this.widthRatio;
    }

    public boolean q() {
        return this.checkAlpha;
    }

    public boolean r() {
        return this.checkCoverage;
    }

    public boolean s() {
        return this.checkFocus;
    }

    public boolean t() {
        return this.checkVisibility;
    }

    public boolean u() {
        return this.preCheck;
    }

    public boolean v() {
        return this.rotateThroughOnStart;
    }

    public int a() {
        return this.adsNumber;
    }

    public BannerOptions(BannerOptions bannerOptions) {
        this.width = bannerOptions.width;
        this.height = bannerOptions.height;
        this.timeBetweenFrames = bannerOptions.timeBetweenFrames;
        this.stepSize = bannerOptions.stepSize;
        this.delayFaceTime = bannerOptions.delayFaceTime;
        this.adsNumber = bannerOptions.adsNumber;
        this.htmlAdsNumber = bannerOptions.htmlAdsNumber;
        this.refreshRate3D = bannerOptions.refreshRate3D;
        this.widthRatio = bannerOptions.widthRatio;
        this.heightRatio = bannerOptions.heightRatio;
        this.minScale = bannerOptions.minScale;
        this.scalePower = bannerOptions.scalePower;
        this.effect = bannerOptions.effect;
        this.rotateThroughOnStart = bannerOptions.rotateThroughOnStart;
        this.rotateThroughSpeedMult = bannerOptions.rotateThroughSpeedMult;
        this.refreshRate = bannerOptions.refreshRate;
        this.minViewabilityPercentage = bannerOptions.minViewabilityPercentage;
        this.checkFocus = bannerOptions.checkFocus;
        this.checkCoverage = bannerOptions.checkCoverage;
    }
}
