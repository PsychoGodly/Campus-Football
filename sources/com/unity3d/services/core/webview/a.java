package com.unity3d.services.core.webview;

import android.net.Uri;
import android.webkit.WebView;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import j1.b;
import j1.l;
import j1.r;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements r.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewBridgeInterface f32081a;

    public /* synthetic */ a(WebViewBridgeInterface webViewBridgeInterface) {
        this.f32081a = webViewBridgeInterface;
    }

    public final void onPostMessage(WebView webView, l lVar, Uri uri, boolean z10, b bVar) {
        this.f32081a.onHandleCallback(webView, lVar, uri, z10, bVar);
    }
}
