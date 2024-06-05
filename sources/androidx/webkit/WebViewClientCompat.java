package androidx.webkit;

import android.app.PendingIntent;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.b;
import androidx.webkit.internal.d0;
import androidx.webkit.internal.g0;
import androidx.webkit.internal.r;
import j1.e;
import j1.n;
import j1.s;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, (n) new d0(invocationHandler));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, (e) new r(invocationHandler));
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return shouldOverrideUrlLoading(webView, b.a(webResourceRequest).toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            onReceivedError(webView, webResourceRequest, (n) new d0(webResourceError));
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, (e) new r(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, e eVar) {
        if (s.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            eVar.c(true);
            return;
        }
        throw g0.a();
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, n nVar) {
        if (Build.VERSION.SDK_INT >= 21 && s.a("WEB_RESOURCE_ERROR_GET_CODE") && s.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && b.b(webResourceRequest)) {
            onReceivedError(webView, nVar.b(), nVar.a().toString(), b.a(webResourceRequest).toString());
        }
    }
}
