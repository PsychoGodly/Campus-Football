package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugins.webviewflutter.n;
import java.util.List;
import java.util.Objects;
import lc.c;

/* compiled from: PermissionRequestHostApiImpl */
public class l4 implements n.v {

    /* renamed from: a  reason: collision with root package name */
    private final c f34304a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34305b;

    public l4(c cVar, d4 d4Var) {
        this.f34304a = cVar;
        this.f34305b = d4Var;
    }

    private PermissionRequest c(Long l10) {
        PermissionRequest permissionRequest = (PermissionRequest) this.f34305b.i(l10.longValue());
        Objects.requireNonNull(permissionRequest);
        PermissionRequest permissionRequest2 = permissionRequest;
        return permissionRequest;
    }

    public void a(Long l10, List<String> list) {
        c(l10).grant((String[]) list.toArray(new String[0]));
    }

    public void b(Long l10) {
        c(l10).deny();
    }
}
