package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;
import lc.c;

/* compiled from: HttpAuthHandlerHostApiImpl */
public class b4 implements n.o {

    /* renamed from: a  reason: collision with root package name */
    private final c f34191a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34192b;

    public b4(c cVar, d4 d4Var) {
        this.f34191a = cVar;
        this.f34192b = d4Var;
    }

    private HttpAuthHandler d(Long l10) {
        HttpAuthHandler httpAuthHandler = (HttpAuthHandler) this.f34192b.i(l10.longValue());
        Objects.requireNonNull(httpAuthHandler);
        HttpAuthHandler httpAuthHandler2 = httpAuthHandler;
        return httpAuthHandler;
    }

    public void a(Long l10) {
        d(l10).cancel();
    }

    public Boolean b(Long l10) {
        return Boolean.valueOf(d(l10).useHttpAuthUsernamePassword());
    }

    public void c(Long l10, String str, String str2) {
        d(l10).proceed(str, str2);
    }
}
