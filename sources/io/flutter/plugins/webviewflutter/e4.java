package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import io.flutter.plugins.webviewflutter.w6;

/* compiled from: JavaObjectHostApiImpl */
public class e4 implements n.r {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34235a;

    public e4(d4 d4Var) {
        this.f34235a = d4Var;
    }

    public void a(Long l10) {
        Object i10 = this.f34235a.i(l10.longValue());
        if (i10 instanceof w6.a) {
            ((w6.a) i10).destroy();
        }
        this.f34235a.m(l10.longValue());
    }
}
