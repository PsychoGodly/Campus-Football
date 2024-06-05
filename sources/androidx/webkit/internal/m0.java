package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import j1.u;

/* compiled from: WebViewRenderProcessClientFrameworkAdapter */
public class m0 extends WebViewRenderProcessClient {

    /* renamed from: a  reason: collision with root package name */
    private u f5043a;

    public m0(u uVar) {
        this.f5043a = uVar;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f5043a.onRenderProcessResponsive(webView, n0.b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f5043a.onRenderProcessUnresponsive(webView, n0.b(webViewRenderProcess));
    }
}
