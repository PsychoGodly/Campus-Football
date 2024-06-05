package ba;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ca.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import x9.d;
import x9.n;
import x9.o;
import z9.g;

public class c extends a {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WebView f24301f;

    /* renamed from: g  reason: collision with root package name */
    private Long f24302g = null;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, n> f24303h;

    /* renamed from: i  reason: collision with root package name */
    private final String f24304i;

    class a extends WebViewClient {
        a() {
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (c.this.r() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                c.this.c((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f24306a;

        b() {
            this.f24306a = c.this.f24301f;
        }

        public void run() {
            this.f24306a.destroy();
        }
    }

    public c(String str, Map<String, n> map, String str2) {
        super(str);
        this.f24303h = map;
        this.f24304i = str2;
    }

    public void i(o oVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, n> f10 = dVar.f();
        for (String next : f10.keySet()) {
            ca.c.h(jSONObject, next, f10.get(next).d());
        }
        j(oVar, dVar, jSONObject);
    }

    public void l() {
        super.l();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f24302g == null ? 4000 : TimeUnit.MILLISECONDS.convert(f.b() - this.f24302g.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f24301f = null;
    }

    public void t() {
        super.t();
        v();
    }

    /* access modifiers changed from: package-private */
    public void v() {
        WebView webView = new WebView(z9.f.c().a());
        this.f24301f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f24301f.getSettings().setAllowContentAccess(false);
        this.f24301f.getSettings().setAllowFileAccess(false);
        this.f24301f.setWebViewClient(new a());
        c(this.f24301f);
        g.a().o(this.f24301f, this.f24304i);
        for (String next : this.f24303h.keySet()) {
            g.a().n(this.f24301f, this.f24303h.get(next).a().toExternalForm(), next);
        }
        this.f24302g = Long.valueOf(f.b());
    }
}
