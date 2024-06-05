package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.weakreference.b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private String f27411a;

    /* renamed from: b  reason: collision with root package name */
    private b f27412b = new b((WebView) null);

    /* renamed from: c  reason: collision with root package name */
    private AdEvents f27413c;

    /* renamed from: d  reason: collision with root package name */
    private MediaEvents f27414d;

    /* renamed from: e  reason: collision with root package name */
    private a f27415e;

    /* renamed from: f  reason: collision with root package name */
    private long f27416f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f27411a = str;
    }

    public void a() {
        this.f27416f = f.b();
        this.f27415e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f27412b.clear();
    }

    public AdEvents c() {
        return this.f27413c;
    }

    public MediaEvents d() {
        return this.f27414d;
    }

    public boolean e() {
        return this.f27412b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f27411a);
    }

    public void g() {
        h.a().b(getWebView(), this.f27411a);
    }

    public WebView getWebView() {
        return (WebView) this.f27412b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f27411a, f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f27416f) {
            this.f27415e = a.AD_STATE_VISIBLE;
            h.a().a(getWebView(), this.f27411a, str);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(WebView webView) {
        this.f27412b = new b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f27413c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f27411a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f27411a, errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.12-Applovin");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        h.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f27414d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        a aVar;
        if (j10 >= this.f27416f && this.f27415e != (aVar = a.AD_STATE_NOTVISIBLE)) {
            this.f27415e = aVar;
            h.a().a(getWebView(), this.f27411a, str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f27411a, str, jSONObject);
    }

    public void a(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
            h.a().a(getWebView(), jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f27411a, jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().b(getWebView(), this.f27411a, z10 ? "foregrounded" : "backgrounded");
        }
    }
}
