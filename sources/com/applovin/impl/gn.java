package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

public class gn extends hn {

    /* renamed from: h  reason: collision with root package name */
    private final de f8048h;

    public gn(de deVar, k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f8048h = deVar;
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        super.a(i10);
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Failed to report reward for mediated ad: " + this.f8048h + " - error code: " + i10);
        }
    }

    /* access modifiers changed from: protected */
    public void b(JSONObject jSONObject) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Reported reward successfully for mediated ad: " + this.f8048h);
        }
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "2.0/mcr";
    }

    /* access modifiers changed from: protected */
    public ch h() {
        return this.f8048h.h0();
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.b(str, "No reward result was found for mediated ad: " + this.f8048h);
        }
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f8048h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f8048h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f8048h.e());
        String l02 = this.f8048h.l0();
        if (!StringUtils.isValidString(l02)) {
            l02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", l02);
        String A = this.f8048h.A();
        if (!StringUtils.isValidString(A)) {
            A = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", A);
    }
}
