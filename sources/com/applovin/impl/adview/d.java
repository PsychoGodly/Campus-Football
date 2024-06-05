package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;

class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f6449a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewRenderProcessClient f6450b = new a();

    class a extends WebViewRenderProcessClient {
        a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                b currentAd = ((b) webView).getCurrentAd();
                d.this.f6449a.L();
                if (t.a()) {
                    t L = d.this.f6449a.L();
                    L.b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(k kVar) {
        this.f6449a = kVar;
    }

    /* access modifiers changed from: package-private */
    public WebViewRenderProcessClient a() {
        return this.f6450b;
    }
}
