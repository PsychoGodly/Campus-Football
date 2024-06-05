package com.startapp;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;

/* compiled from: Sta */
public class ya extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ va f17569a;

    public ya(va vaVar) {
        this.f17569a = vaVar;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        va vaVar = this.f17569a;
        vaVar.getClass();
        if (webResourceRequest != null) {
            try {
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders != null) {
                    str = j9.d(requestHeaders.get("User-Agent"));
                    vaVar.f17433c.a().execute(new za(vaVar, str, webView));
                    return null;
                }
            } catch (Throwable th) {
                if (vaVar.a(64)) {
                    i3.a(th);
                }
            }
        }
        str = null;
        vaVar.f17433c.a().execute(new za(vaVar, str, webView));
        return null;
    }
}
