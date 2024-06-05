package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* compiled from: CookieManagerHostApiImpl */
public class c implements n.c {

    /* renamed from: a  reason: collision with root package name */
    private final lc.c f34195a;

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34196b;

    /* renamed from: c  reason: collision with root package name */
    private final b f34197c;

    /* renamed from: d  reason: collision with root package name */
    private final a f34198d;

    /* compiled from: CookieManagerHostApiImpl */
    interface a {
        boolean a(int i10);
    }

    /* compiled from: CookieManagerHostApiImpl */
    static class b {
        b() {
        }

        public CookieManager a() {
            return CookieManager.getInstance();
        }
    }

    public c(lc.c cVar, d4 d4Var) {
        this(cVar, d4Var, new b());
    }

    private CookieManager f(Long l10) {
        CookieManager cookieManager = (CookieManager) this.f34196b.i(l10.longValue());
        Objects.requireNonNull(cookieManager);
        CookieManager cookieManager2 = cookieManager;
        return cookieManager;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean g(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    private boolean h(CookieManager cookieManager) {
        boolean hasCookies = cookieManager.hasCookies();
        if (hasCookies) {
            cookieManager.removeAllCookie();
        }
        return hasCookies;
    }

    public void a(Long l10, n.w<Boolean> wVar) {
        if (this.f34198d.a(21)) {
            CookieManager f10 = f(l10);
            Objects.requireNonNull(wVar);
            f10.removeAllCookies(new a(wVar));
            return;
        }
        wVar.success(Boolean.valueOf(h(f(l10))));
    }

    public void b(Long l10) {
        this.f34196b.b(this.f34197c.a(), l10.longValue());
    }

    public void c(Long l10, Long l11, Boolean bool) {
        if (this.f34198d.a(21)) {
            CookieManager f10 = f(l10);
            WebView webView = (WebView) this.f34196b.i(l11.longValue());
            Objects.requireNonNull(webView);
            WebView webView2 = webView;
            f10.setAcceptThirdPartyCookies(webView, bool.booleanValue());
            return;
        }
        throw new UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
    }

    public void d(Long l10, String str, String str2) {
        f(l10).setCookie(str, str2);
    }

    c(lc.c cVar, d4 d4Var, b bVar) {
        this(cVar, d4Var, bVar, b.f34186a);
    }

    c(lc.c cVar, d4 d4Var, b bVar, a aVar) {
        this.f34195a = cVar;
        this.f34196b = d4Var;
        this.f34197c = bVar;
        this.f34198d = aVar;
    }
}
