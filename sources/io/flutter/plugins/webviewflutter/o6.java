package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;
import lc.c;

/* compiled from: WebViewFlutterApiImpl */
public class o6 {

    /* renamed from: a  reason: collision with root package name */
    private final c f34392a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34393b;

    /* renamed from: c  reason: collision with root package name */
    private n.j0 f34394c;

    public o6(c cVar, d4 d4Var) {
        this.f34392a = cVar;
        this.f34393b = d4Var;
        this.f34394c = new n.j0(cVar);
    }

    public void a(WebView webView, n.j0.a<Void> aVar) {
        if (!this.f34393b.f(webView)) {
            this.f34394c.c(Long.valueOf(this.f34393b.c(webView)), aVar);
        }
    }

    public void b(WebView webView, Long l10, Long l11, Long l12, Long l13, n.j0.a<Void> aVar) {
        n.j0 j0Var = this.f34394c;
        Long h10 = this.f34393b.h(webView);
        Objects.requireNonNull(h10);
        j0Var.g(h10, l10, l11, l12, l13, aVar);
    }
}
