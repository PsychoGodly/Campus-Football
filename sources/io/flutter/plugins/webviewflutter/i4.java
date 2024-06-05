package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import lc.c;

/* compiled from: JavaScriptChannelFlutterApiImpl */
public class i4 extends n.s {

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34274b;

    public i4(c cVar, d4 d4Var) {
        super(cVar);
        this.f34274b = d4Var;
    }

    private long e(h4 h4Var) {
        Long h10 = this.f34274b.h(h4Var);
        if (h10 != null) {
            return h10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    public void f(h4 h4Var, String str, n.s.a<Void> aVar) {
        super.d(Long.valueOf(e(h4Var)), str, aVar);
    }
}
