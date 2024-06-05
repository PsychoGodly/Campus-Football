package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import io.flutter.plugins.webviewflutter.n;
import lc.c;

/* compiled from: HttpAuthHandlerFlutterApiImpl */
public class a4 {

    /* renamed from: a  reason: collision with root package name */
    private final c f34180a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34181b;

    /* renamed from: c  reason: collision with root package name */
    private final n.C0390n f34182c;

    public a4(c cVar, d4 d4Var) {
        this.f34180a = cVar;
        this.f34181b = d4Var;
        this.f34182c = new n.C0390n(cVar);
    }

    public void a(HttpAuthHandler httpAuthHandler, n.C0390n.a<Void> aVar) {
        if (!this.f34181b.f(httpAuthHandler)) {
            this.f34182c.b(Long.valueOf(this.f34181b.c(httpAuthHandler)), aVar);
        }
    }
}
