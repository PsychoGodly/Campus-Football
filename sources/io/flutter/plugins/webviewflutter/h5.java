package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* compiled from: WebSettingsHostApiImpl */
public class h5 implements n.e0 {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34267a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34268b;

    /* compiled from: WebSettingsHostApiImpl */
    public static class a {
        public WebSettings a(WebView webView) {
            return webView.getSettings();
        }
    }

    public h5(d4 d4Var, a aVar) {
        this.f34267a = d4Var;
        this.f34268b = aVar;
    }

    public String a(Long l10) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        return webSettings.getUserAgentString();
    }

    public void b(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setDomStorageEnabled(bool.booleanValue());
    }

    public void c(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setDisplayZoomControls(bool.booleanValue());
    }

    public void d(Long l10, Long l11) {
        WebView webView = (WebView) this.f34267a.i(l11.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        this.f34267a.b(this.f34268b.a(webView), l10.longValue());
    }

    public void e(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setSupportMultipleWindows(bool.booleanValue());
    }

    public void f(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setAllowFileAccess(bool.booleanValue());
    }

    public void g(Long l10, Long l11) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setTextZoom(l11.intValue());
    }

    public void h(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setLoadWithOverviewMode(bool.booleanValue());
    }

    public void i(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setUseWideViewPort(bool.booleanValue());
    }

    public void j(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setJavaScriptEnabled(bool.booleanValue());
    }

    public void k(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    public void l(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setSupportZoom(bool.booleanValue());
    }

    public void m(Long l10, String str) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setUserAgentString(str);
    }

    public void n(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    public void o(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.f34267a.i(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setBuiltInZoomControls(bool.booleanValue());
    }
}
