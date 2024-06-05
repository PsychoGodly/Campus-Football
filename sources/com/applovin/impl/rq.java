package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

public class rq {

    /* renamed from: a  reason: collision with root package name */
    private final int f11221a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11222b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11223c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11224d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11225e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11226f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11227g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11228h;

    /* renamed from: i  reason: collision with root package name */
    private final float f11229i;

    /* renamed from: j  reason: collision with root package name */
    private final float f11230j;

    public rq(JSONObject jSONObject, k kVar) {
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            L.d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f11221a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f11222b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f11223c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f11224d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f11225e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f11226f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f11227g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f11228h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f11229i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f11230j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f11229i;
    }

    public long b() {
        return (long) this.f11227g;
    }

    public float c() {
        return this.f11230j;
    }

    public long d() {
        return (long) this.f11228h;
    }

    public int e() {
        return this.f11224d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rq rqVar = (rq) obj;
        if (this.f11221a == rqVar.f11221a && this.f11222b == rqVar.f11222b && this.f11223c == rqVar.f11223c && this.f11224d == rqVar.f11224d && this.f11225e == rqVar.f11225e && this.f11226f == rqVar.f11226f && this.f11227g == rqVar.f11227g && this.f11228h == rqVar.f11228h && Float.compare(rqVar.f11229i, this.f11229i) == 0 && Float.compare(rqVar.f11230j, this.f11230j) == 0) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f11222b;
    }

    public int g() {
        return this.f11223c;
    }

    public long h() {
        return (long) this.f11226f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f11221a * 31) + this.f11222b) * 31) + this.f11223c) * 31) + this.f11224d) * 31) + (this.f11225e ? 1 : 0)) * 31) + this.f11226f) * 31) + this.f11227g) * 31) + this.f11228h) * 31;
        float f10 = this.f11229i;
        int i11 = 0;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f11230j;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return floatToIntBits + i11;
    }

    public int i() {
        return this.f11221a;
    }

    public boolean j() {
        return this.f11225e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f11221a + ", heightPercentOfScreen=" + this.f11222b + ", margin=" + this.f11223c + ", gravity=" + this.f11224d + ", tapToFade=" + this.f11225e + ", tapToFadeDurationMillis=" + this.f11226f + ", fadeInDurationMillis=" + this.f11227g + ", fadeOutDurationMillis=" + this.f11228h + ", fadeInDelay=" + this.f11229i + ", fadeOutDelay=" + this.f11230j + '}';
    }
}
