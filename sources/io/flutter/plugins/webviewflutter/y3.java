package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import io.flutter.plugins.webviewflutter.n;
import lc.c;

/* compiled from: GeolocationPermissionsCallbackFlutterApiImpl */
public class y3 {

    /* renamed from: a  reason: collision with root package name */
    private final c f34491a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34492b;

    /* renamed from: c  reason: collision with root package name */
    private n.l f34493c;

    public y3(c cVar, d4 d4Var) {
        this.f34491a = cVar;
        this.f34492b = d4Var;
        this.f34493c = new n.l(cVar);
    }

    public void a(GeolocationPermissions.Callback callback, n.l.a<Void> aVar) {
        if (!this.f34492b.f(callback)) {
            this.f34493c.b(Long.valueOf(this.f34492b.c(callback)), aVar);
        }
    }
}
