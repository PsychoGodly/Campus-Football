package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* compiled from: WebStorageHostApiImpl */
public class i5 implements n.f0 {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34275a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34276b;

    /* compiled from: WebStorageHostApiImpl */
    public static class a {
        public WebStorage a() {
            return WebStorage.getInstance();
        }
    }

    public i5(d4 d4Var, a aVar) {
        this.f34275a = d4Var;
        this.f34276b = aVar;
    }

    public void a(Long l10) {
        this.f34275a.b(this.f34276b.a(), l10.longValue());
    }

    public void b(Long l10) {
        WebStorage webStorage = (WebStorage) this.f34275a.i(l10.longValue());
        Objects.requireNonNull(webStorage);
        WebStorage webStorage2 = webStorage;
        webStorage.deleteAllData();
    }
}
