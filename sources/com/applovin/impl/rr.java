package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class rr extends x {

    /* renamed from: a  reason: collision with root package name */
    private final k f11231a;

    /* renamed from: b  reason: collision with root package name */
    private final t f11232b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f11233c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f11234d = Collections.synchronizedSet(new HashSet());

    public rr(k kVar) {
        this.f11231a = kVar;
        this.f11232b = kVar.L();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(WebView webView) {
        if (webView != null && this.f11234d.remove(webView)) {
            AppLovinSdkUtils.runOnUiThread(new k40(webView));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        WebView a10 = a(str);
        if (a10 != null) {
            this.f11234d.add(a10);
            AppLovinSdkUtils.runOnUiThreadDelayed(new m40(this, a10), (long) ((Integer) this.f11231a.a(oj.X2)).intValue());
        } else if (t.a()) {
            this.f11232b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (t.a()) {
                this.f11232b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else if (str.startsWith("<script")) {
            AppLovinSdkUtils.runOnUiThread(new o40(this, str));
        } else if (t.a()) {
            this.f11232b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f11233c) {
            AppLovinSdkUtils.runOnUiThread(new l40(this));
        } else {
            b(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void a(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new n40(this, eVar, appLovinPostbackListener));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f11233c.destroy();
        this.f11233c = null;
    }

    private WebView a(String str) {
        zp.b();
        WebView b10 = zp.b(k.k(), "web tracker");
        if (b10 == null) {
            return null;
        }
        b10.getSettings().setJavaScriptEnabled(true);
        b10.setWebViewClient(this);
        b10.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return b10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f11231a.a(oj.f10395r3)).booleanValue());
        if (this.f11233c == null) {
            WebView a10 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>");
            this.f11233c = a10;
            if (a10 == null) {
                if (t.a()) {
                    this.f11232b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        String str = "al_firePostback('" + appendQueryParameters + "')";
        if (x3.e()) {
            this.f11233c.evaluateJavascript(str, (ValueCallback) null);
        } else {
            this.f11233c.loadUrl("javascript:" + str);
        }
        appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
    }
}
