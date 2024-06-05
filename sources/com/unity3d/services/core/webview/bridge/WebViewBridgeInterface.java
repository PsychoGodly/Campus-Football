package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.log.DeviceLog;
import j1.b;
import j1.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebViewBridgeInterface.kt */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this((IWebViewBridge) null, (IInvocationCallbackInvoker) null, 3, (h) null);
    }

    public WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        m.e(iWebViewBridge, "webViewBridge");
        m.e(iInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = iWebViewBridge;
        this.webViewAppInvocationCallbackInvoker = iInvocationCallbackInvoker;
    }

    @JavascriptInterface
    public final void handleCallback(String str, String str2, String str3) {
        m.e(str, "callbackId");
        m.e(str2, "callbackStatus");
        m.e(str3, "rawParameters");
        DeviceLog.debug("handleCallback " + str + ' ' + str2 + ' ' + str3);
        this.webViewBridge.handleCallback(str, str2, JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3)));
    }

    @JavascriptInterface
    public final void handleInvocation(String str) {
        m.e(str, JsonStorageKeyNames.DATA_KEY);
        DeviceLog.debug("handleInvocation " + str);
        JSONArray jSONArray = new JSONArray(str);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            m.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            m.c(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            m.c(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            m.c(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView webView, l lVar, Uri uri, boolean z10, b bVar) {
        m.e(webView, "view");
        m.e(lVar, "message");
        m.e(uri, "sourceOrigin");
        m.e(bVar, "replyProxy");
        String c10 = lVar.c();
        if (z10) {
            if (!(c10 == null || o.m(c10))) {
                JSONObject jSONObject = new JSONObject(c10);
                String string = jSONObject.getString("id");
                String string2 = jSONObject.getString("status");
                String string3 = jSONObject.getString("parameters");
                m.d(string, "callbackId");
                m.d(string2, "callbackStatus");
                m.d(string3, "rawParameters");
                handleCallback(string, string2, string3);
            }
        }
    }

    public final void onHandleInvocation(WebView webView, l lVar, Uri uri, boolean z10, b bVar) {
        m.e(webView, "view");
        m.e(lVar, "message");
        m.e(uri, "sourceOrigin");
        m.e(bVar, "replyProxy");
        String c10 = lVar.c();
        if (z10) {
            if (!(c10 == null || o.m(c10))) {
                handleInvocation(c10);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, h hVar) {
        this((i10 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}
