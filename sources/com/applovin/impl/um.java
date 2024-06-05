package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.adview.c;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.ue;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

public class um extends xl implements ue.a {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.a f12621h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public AppLovinAdLoadListener f12622i;

    /* renamed from: j  reason: collision with root package name */
    private com.applovin.impl.adview.b f12623j;

    public um(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskProcessJavaScriptTagAd", kVar);
        this.f12621h = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, kVar);
        this.f12622i = appLovinAdLoadListener;
        kVar.U().a((ue.a) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f13421a, a());
            this.f12623j = bVar;
            bVar.a((c) new b(this.f13421a));
            this.f12623j.loadDataWithBaseURL(this.f12621h.h(), this.f12621h.e1(), "text/html", (String) null, MaxReward.DEFAULT_LABEL);
        } catch (Throwable th) {
            this.f13421a.U().b(this);
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Failed to initialize WebView", th);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f12622i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.f12622i = null;
            }
        }
    }

    public void run() {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Rendering AppLovin ad #" + this.f12621h.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new a60(this));
    }

    private class b extends c {
        private b(k kVar) {
            super((com.applovin.impl.adview.a) null, kVar);
        }

        private boolean a(String str, oj ojVar) {
            for (String equalsIgnoreCase : um.this.f13421a.c(ojVar)) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public boolean a(WebView webView, String str) {
            t tVar = um.this.f13423c;
            if (t.a()) {
                um umVar = um.this;
                t tVar2 = umVar.f13423c;
                String str2 = umVar.f13422b;
                tVar2.d(str2, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.b)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!a(scheme, oj.Z1)) {
                return true;
            }
            if (a(host, oj.f10260a2)) {
                t tVar3 = um.this.f13423c;
                if (t.a()) {
                    um umVar2 = um.this;
                    umVar2.f13423c.a(umVar2.f13422b, "Ad load succeeded");
                }
                if (um.this.f12622i == null) {
                    return true;
                }
                um.this.f12622i.adReceived(um.this.f12621h);
                AppLovinAdLoadListener unused = um.this.f12622i = null;
                return true;
            } else if (a(host, oj.f10267b2)) {
                t tVar4 = um.this.f13423c;
                if (t.a()) {
                    um umVar3 = um.this;
                    umVar3.f13423c.a(umVar3.f13422b, "Ad load failed");
                }
                if (um.this.f12622i == null) {
                    return true;
                }
                um.this.f12622i.failedToReceiveAd(204);
                AppLovinAdLoadListener unused2 = um.this.f12622i = null;
                return true;
            } else {
                t tVar5 = um.this.f13423c;
                if (!t.a()) {
                    return true;
                }
                um umVar4 = um.this;
                umVar4.f13423c.b(umVar4.f13422b, "Unrecognized webview event");
                return true;
            }
        }
    }

    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.f12621h.H())) {
            this.f13421a.U().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f12622i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f12621h);
                this.f12622i = null;
            }
        }
    }
}
