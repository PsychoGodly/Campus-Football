package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugins.webviewflutter.n;
import lc.c;

/* compiled from: CustomViewCallbackFlutterApiImpl */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f34205a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34206b;

    /* renamed from: c  reason: collision with root package name */
    private n.d f34207c;

    public d(c cVar, d4 d4Var) {
        this.f34205a = cVar;
        this.f34206b = d4Var;
        this.f34207c = new n.d(cVar);
    }

    public void a(WebChromeClient.CustomViewCallback customViewCallback, n.d.a<Void> aVar) {
        if (!this.f34206b.f(customViewCallback)) {
            this.f34207c.b(Long.valueOf(this.f34206b.c(customViewCallback)), aVar);
        }
    }
}
