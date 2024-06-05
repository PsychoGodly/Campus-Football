package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

public class sn {

    /* renamed from: a  reason: collision with root package name */
    private final a f12149a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f12150b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12151c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12152d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f12153e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* access modifiers changed from: private */
        public static a b(int i10) {
            if (i10 == 0) {
                return TCF_VENDOR;
            }
            if (i10 != 1) {
                return OTHER;
            }
            return ATP_NETWORK;
        }
    }

    public sn(JSONObject jSONObject, String str) {
        this.f12152d = str;
        this.f12149a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f12150b = JsonUtils.getInteger(jSONObject, "id", (Integer) null);
        this.f12151c = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, (String) null);
    }

    public Boolean a() {
        return this.f12153e;
    }

    public String b() {
        return this.f12152d;
    }

    public String c() {
        return this.f12151c;
    }

    public Integer d() {
        return this.f12150b;
    }

    public String e() {
        Boolean bool = this.f12153e;
        String valueOf = bool != null ? String.valueOf(bool) : y3.b().a(k.k());
        return "\n" + this.f12152d + " - " + valueOf;
    }

    public a f() {
        return this.f12149a;
    }

    public void a(Boolean bool) {
        this.f12153e = bool;
    }
}
