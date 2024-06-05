package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import j1.n;
import j1.q;
import j1.s;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.x;
import pe.x0;
import pe.z;
import se.g;
import se.i0;
import se.k0;
import se.v;

/* compiled from: AndroidWebViewClient.kt */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion((h) null);
    private final v<Boolean> _isRenderProcessGone;
    private final x<List<WebViewClientError>> _onLoadFinished;
    private final q adAssetLoader;
    private final GetCachedAsset getCachedAsset;
    private final i0<Boolean> isRenderProcessGone;
    private final v<List<WebViewClientError>> loadErrors = k0.a(q.d());
    private final x0<List<WebViewClientError>> onLoadFinished;
    private final q webViewAssetLoader;

    /* compiled from: AndroidWebViewClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AndroidWebViewClient(GetWebViewCacheAssetLoader getWebViewCacheAssetLoader, GetAdAssetLoader getAdAssetLoader, GetCachedAsset getCachedAsset2) {
        m.e(getWebViewCacheAssetLoader, "getWebViewAssetLoader");
        m.e(getAdAssetLoader, "getAdAssetLoader");
        m.e(getCachedAsset2, "getCachedAsset");
        this.getCachedAsset = getCachedAsset2;
        this.webViewAssetLoader = (q) getWebViewCacheAssetLoader.invoke();
        this.adAssetLoader = (q) getAdAssetLoader.invoke();
        x<List<WebViewClientError>> b10 = z.b((c2) null, 1, (Object) null);
        this._onLoadFinished = b10;
        this.onLoadFinished = b10;
        v<Boolean> a10 = k0.a(Boolean.FALSE);
        this._isRenderProcessGone = a10;
        this.isRenderProcessGone = g.b(a10);
    }

    public final x0<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final i0<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    public void onPageFinished(WebView webView, String str) {
        List<WebViewClientError> value;
        m.e(webView, "view");
        m.e(str, "url");
        if (m.a(str, BLANK_PAGE)) {
            v<List<WebViewClientError>> vVar = this.loadErrors;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, y.D(value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, (Integer) null, 4, (h) null))));
        }
        super.onPageFinished(webView, str);
        this._onLoadFinished.n0(this.loadErrors.getValue());
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, n nVar) {
        ErrorReason errorReason;
        List<WebViewClientError> value;
        m.e(webView, "view");
        m.e(webResourceRequest, "request");
        m.e(nVar, "error");
        super.onReceivedError(webView, webResourceRequest, nVar);
        if (s.a("WEB_RESOURCE_ERROR_GET_CODE")) {
            errorReason = IntExtensionKt.webResourceToErrorReason(nVar.b());
        } else {
            errorReason = ErrorReason.REASON_UNKNOWN;
        }
        v<List<WebViewClientError>> vVar = this.loadErrors;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, y.D(value, new WebViewClientError(webResourceRequest.getUrl().toString(), errorReason, (Integer) null, 4, (h) null))));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClientError webViewClientError;
        List<WebViewClientError> value;
        m.e(webView, "view");
        m.e(webResourceRequest, "request");
        m.e(webResourceResponse, "errorResponse");
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21) {
            webViewClientError = new WebViewClientError(webResourceRequest.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(webResourceResponse.getStatusCode()));
        } else {
            webViewClientError = new WebViewClientError((String) null, ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, (Integer) null, 5, (h) null);
        }
        v<List<WebViewClientError>> vVar = this.loadErrors;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, y.D(value, webViewClientError)));
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        List<WebViewClientError> value;
        m.e(webView, "view");
        m.e(renderProcessGoneDetail, "detail");
        ViewExtensionsKt.removeViewFromParent(webView);
        webView.destroy();
        if (!this._onLoadFinished.h()) {
            v<List<WebViewClientError>> vVar = this.loadErrors;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, y.D(value, new WebViewClientError(String.valueOf(webView.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, (Integer) null, 4, (h) null))));
            this._onLoadFinished.n0(this.loadErrors.getValue());
            return true;
        }
        this._isRenderProcessGone.setValue(Boolean.TRUE);
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        m.e(webView, "view");
        m.e(webResourceRequest, "request");
        if (Build.VERSION.SDK_INT < 21) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (m.a(url.getLastPathSegment(), "favicon.ico")) {
            return new WebResourceResponse("image/png", (String) null, (InputStream) null);
        }
        if (m.a(url.getScheme(), UnityAdsConstants.Cache.CACHE_SCHEME)) {
            GetCachedAsset getCachedAsset2 = this.getCachedAsset;
            Uri url2 = webResourceRequest.getUrl();
            m.d(url2, "request.url");
            return getCachedAsset2.invoke(url2);
        }
        String host = url.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -598289184) {
                if (hashCode == 380656434 && host.equals(UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN)) {
                    return this.webViewAssetLoader.a(url);
                }
            } else if (host.equals("cdn-creatives-cf-prd.acquire.unity3dusercontent.com")) {
                return this.adAssetLoader.a(url);
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
