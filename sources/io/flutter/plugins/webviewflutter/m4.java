package io.flutter.plugins.webviewflutter;

import android.view.View;
import io.flutter.plugins.webviewflutter.n;
import lc.c;

/* compiled from: ViewFlutterApiImpl */
public class m4 {

    /* renamed from: a  reason: collision with root package name */
    private final c f34314a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34315b;

    /* renamed from: c  reason: collision with root package name */
    private n.x f34316c;

    public m4(c cVar, d4 d4Var) {
        this.f34314a = cVar;
        this.f34315b = d4Var;
        this.f34316c = new n.x(cVar);
    }

    public void a(View view, n.x.a<Void> aVar) {
        if (!this.f34315b.f(view)) {
            this.f34316c.b(Long.valueOf(this.f34315b.c(view)), aVar);
        }
    }
}
