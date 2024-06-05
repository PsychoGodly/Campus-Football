package com.applovin.impl;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

public class fn extends hn {

    /* renamed from: h  reason: collision with root package name */
    private final b f7836h;

    public fn(b bVar, k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f7836h = bVar;
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        super.a(i10);
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.b(str, "Failed to report reward for ad: " + this.f7836h + " - error code: " + i10);
        }
    }

    /* access modifiers changed from: protected */
    public void b(JSONObject jSONObject) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Reported reward successfully for ad: " + this.f7836h);
        }
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "2.0/cr";
    }

    /* access modifiers changed from: protected */
    public ch h() {
        return this.f7836h.f();
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.b(str, "No reward result was found for ad: " + this.f7836h);
        }
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f7836h.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f7836h.V());
        String clCode = this.f7836h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
