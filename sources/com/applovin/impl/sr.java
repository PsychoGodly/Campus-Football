package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.applovin.impl.adview.l;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.x;
import java.lang.ref.WeakReference;

public class sr extends x {

    /* renamed from: a  reason: collision with root package name */
    private final t f12182a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f12183b;

    public interface a {
        void a(Uri uri, l lVar);

        void a(l lVar);

        void a(l lVar, Bundle bundle);

        void b(Uri uri, l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);
    }

    public sr(k kVar) {
        this.f12182a = kVar.L();
    }

    public void a(WeakReference weakReference) {
        this.f12183b = weakReference;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    private void a(WebView webView, String str) {
        if (t.a()) {
            t tVar = this.f12182a;
            tVar.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof l)) {
            l lVar = (l) webView;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            a aVar = (a) this.f12183b.get();
            if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
                if ("/track_click".equals(path)) {
                    aVar.b(lVar);
                } else if ("/close_ad".equals(path)) {
                    aVar.a(lVar);
                } else if ("/skip_ad".equals(path)) {
                    aVar.d(lVar);
                } else if ("/direct_download".equals(path)) {
                    aVar.a(lVar, up.a(parse));
                } else if ("/load_url".equals(path)) {
                    aVar.a(parse, lVar);
                } else if ("/template_error".equals(path)) {
                    aVar.b(parse, lVar);
                } else if ("/fully_watched".equals(path)) {
                    aVar.c(lVar);
                } else {
                    if (t.a()) {
                        t tVar2 = this.f12182a;
                        tVar2.k("WebViewButtonClient", "Unknown URL: " + str);
                    }
                    if (t.a()) {
                        t tVar3 = this.f12182a;
                        tVar3.k("WebViewButtonClient", "Path: " + path);
                    }
                }
            }
        }
    }
}
