package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import j1.u;
import java.util.concurrent.Executor;

/* compiled from: ApiHelperForQ */
public class h {
    @Deprecated
    public static int a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    public static void e(WebView webView, u uVar) {
        webView.setWebViewRenderProcessClient(uVar != null ? new m0(uVar) : null);
    }

    public static void f(WebView webView, Executor executor, u uVar) {
        webView.setWebViewRenderProcessClient(executor, uVar != null ? new m0(uVar) : null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
