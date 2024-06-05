package com.applovin.impl;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

public class ln extends nn {

    /* renamed from: h  reason: collision with root package name */
    private final b f9255h;

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinAdRewardListener f9256i;

    public ln(b bVar, AppLovinAdRewardListener appLovinAdRewardListener, k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f9255h = bVar;
        this.f9256i = appLovinAdRewardListener;
    }

    /* access modifiers changed from: protected */
    public void a(ch chVar) {
        this.f9255h.a(chVar);
        String b10 = chVar.b();
        Map a10 = chVar.a();
        if (b10.equals("accepted")) {
            this.f9256i.userRewardVerified(this.f9255h, a10);
        } else if (b10.equals("quota_exceeded")) {
            this.f9256i.userOverQuota(this.f9255h, a10);
        } else if (b10.equals("rejected")) {
            this.f9256i.userRewardRejected(this.f9255h, a10);
        } else {
            this.f9256i.validationRequestFailed(this.f9255h, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    public String f() {
        return "2.0/vr";
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.f9255h.O0();
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 < 400 || i10 >= 500) {
            this.f9256i.validationRequestFailed(this.f9255h, i10);
            str = "network_timeout";
        } else {
            this.f9256i.userRewardRejected(this.f9255h, Collections.emptyMap());
            str = "rejected";
        }
        this.f9255h.a(ch.a(str));
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f9255h.getAdZone().e());
        String clCode = this.f9255h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
