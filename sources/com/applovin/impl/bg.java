package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.vi;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class bg extends vi {

    /* renamed from: e  reason: collision with root package name */
    private final String f6703e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6704f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6705g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f6706h = UUID.randomUUID().toString().toLowerCase(Locale.US);

    class a extends en {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ MaxAdapterResponseParameters f6707n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f6708o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ AppLovinAdLoadListener f6709p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
            super(aVar, kVar);
            this.f6707n = maxAdapterResponseParameters;
            this.f6708o = maxAdFormat;
            this.f6709p = appLovinAdLoadListener;
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (jSONObject != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject, "message", (String) null))) {
                Object object = JsonUtils.getObject(jSONObject, "nbr", (Object) null);
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str3 = this.f13422b;
                    tVar.b(str3, "Nimbus request for " + this.f6707n.getThirdPartyAdPlacementId() + " returned with no fill code: " + object);
                }
                this.f6709p.failedToReceiveAd(204);
            }
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str4 = this.f13422b;
                tVar2.b(str4, "Unable to fetch " + this.f6707n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i10);
            }
            this.f6709p.failedToReceiveAd(i10);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200 || jSONObject == null) {
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str2 = this.f13422b;
                    tVar.b(str2, "Unable to fetch " + this.f6707n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i10);
                }
                this.f6709p.failedToReceiveAd(i10);
                return;
            }
            this.f13421a.l0().a((xl) new ym(jSONObject, this.f6707n, this.f6708o, bg.this.f6706h, this.f6709p, this.f13421a));
        }
    }

    public bg(String str, String str2, String str3, k kVar) {
        super("NimbusApiService", kVar);
        this.f6703e = str;
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            String str4 = this.f12751b;
            L.a(str4, "Initializing Nimbus with apiKey=" + str + ", pubId=" + str2 + ", sessionId=" + this.f6706h);
        }
        str3 = !StringUtils.isValidString(str3) ? "adsbynimbus.com/rta/v1" : str3;
        this.f6704f = "https://" + str2 + "." + str3;
        rj rjVar = rj.S;
        String str5 = (String) kVar.a((qj) rjVar, (Object) null, this.f12752c);
        if (TextUtils.isEmpty(str5)) {
            str5 = UUID.randomUUID().toString();
            kVar.b(rjVar, str5, this.f12752c);
        }
        this.f6705g = str5;
        kVar.L();
        if (t.a()) {
            t L2 = kVar.L();
            String str6 = this.f12751b;
            L2.a(str6, "Setting Nimbus instanceId=" + str5);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
        Map map;
        this.f12750a.L();
        if (t.a()) {
            t L = this.f12750a.L();
            String str = this.f12751b;
            L.a(str, "Loading Nimbus " + maxAdFormat.getLabel() + " ad with position: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        }
        a((MaxAdapterParameters) maxAdapterResponseParameters);
        if (this.f12750a.y() != null) {
            map = this.f12750a.y().d();
        } else {
            map = this.f12750a.x().l();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-openrtb-version", "2.5");
        hashMap.put("Nimbus-Api-Key", this.f6703e);
        hashMap.put("Nimbus-Sdkv", "2.0.0");
        hashMap.put("Nimbus-Instance-Id", this.f6705g);
        hashMap.put("User-Agent", String.valueOf(map.get("ua")));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session_id", this.f6706h);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "position", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        vi.a a10 = vi.a.a().a(jSONObject).c(a()).b(jSONObject2).d(b()).a();
        this.f12750a.l0().a((xl) new a(a(this.f6704f, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, a10, hashMap, true, this.f12750a), this.f12750a, maxAdapterResponseParameters, maxAdFormat, appLovinAdLoadListener));
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("session_id");
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.f12750a.L();
                if (t.a()) {
                    t L = this.f12750a.L();
                    String str2 = this.f12751b;
                    L.a(str2, "Updating Nimbus sessionId to " + obj);
                }
                this.f6706h = str;
            }
        }
    }
}
