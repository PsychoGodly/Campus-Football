package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugins.webviewflutter.n;
import java.util.Arrays;
import lc.c;

/* compiled from: PermissionRequestFlutterApiImpl */
public class k4 {

    /* renamed from: a  reason: collision with root package name */
    private final c f34294a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34295b;

    /* renamed from: c  reason: collision with root package name */
    private n.u f34296c;

    public k4(c cVar, d4 d4Var) {
        this.f34294a = cVar;
        this.f34295b = d4Var;
        this.f34296c = new n.u(cVar);
    }

    public void a(PermissionRequest permissionRequest, String[] strArr, n.u.a<Void> aVar) {
        if (!this.f34295b.f(permissionRequest)) {
            this.f34296c.b(Long.valueOf(this.f34295b.c(permissionRequest)), Arrays.asList(strArr), aVar);
        }
    }
}
