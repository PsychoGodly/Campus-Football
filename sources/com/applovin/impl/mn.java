package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

public class mn extends nn {

    /* renamed from: h  reason: collision with root package name */
    private final de f9808h;

    public mn(de deVar, k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f9808h = deVar;
    }

    /* access modifiers changed from: protected */
    public void a(ch chVar) {
        this.f9808h.a(chVar);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "2.0/mvr";
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.f9808h.o0();
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        super.a(i10);
        this.f9808h.a(ch.a((i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected"));
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9808h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9808h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9808h.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f9808h.getFormat().getLabel());
        String l02 = this.f9808h.l0();
        if (!StringUtils.isValidString(l02)) {
            l02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", l02);
        String A = this.f9808h.A();
        if (!StringUtils.isValidString(A)) {
            A = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", A);
    }
}
