package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public WebView f27421g;

    /* renamed from: h  reason: collision with root package name */
    private Long f27422h = null;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f27423i;

    /* renamed from: j  reason: collision with root package name */
    private final String f27424j;

    class a extends WebViewClient {
        a() {
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b  reason: collision with other inner class name */
    class C0286b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f27426a;

        C0286b() {
            this.f27426a = b.this.f27421g;
        }

        public void run() {
            this.f27426a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f27423i = map;
        this.f27424j = str2;
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new C0286b(), Math.max(4000 - (this.f27422h == null ? 4000 : TimeUnit.MILLISECONDS.convert(f.b() - this.f27422h.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f27421g = null;
    }

    public void i() {
        super.i();
        j();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f27421g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f27421g.getSettings().setAllowContentAccess(false);
        this.f27421g.getSettings().setAllowFileAccess(false);
        this.f27421g.setWebViewClient(new a());
        a(this.f27421g);
        h.a().c(this.f27421g, this.f27424j);
        for (String next : this.f27423i.keySet()) {
            h.a().c(this.f27421g, this.f27423i.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f27422h = Long.valueOf(f.b());
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            c.a(jSONObject, next, injectedResourcesMap.get(next).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
