package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;
import lc.c;

/* compiled from: GeolocationPermissionsCallbackHostApiImpl */
public class z3 implements n.m {

    /* renamed from: a  reason: collision with root package name */
    private final c f34500a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34501b;

    public z3(c cVar, d4 d4Var) {
        this.f34500a = cVar;
        this.f34501b = d4Var;
    }

    private GeolocationPermissions.Callback b(Long l10) {
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) this.f34501b.i(l10.longValue());
        Objects.requireNonNull(callback);
        return callback;
    }

    public void a(Long l10, String str, Boolean bool, Boolean bool2) {
        b(l10).invoke(str, bool.booleanValue(), bool2.booleanValue());
    }
}
