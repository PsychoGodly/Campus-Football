package j1;

import android.webkit.WebSettings;
import androidx.webkit.internal.a;
import androidx.webkit.internal.c;
import androidx.webkit.internal.d;
import androidx.webkit.internal.e;
import androidx.webkit.internal.f0;
import androidx.webkit.internal.g0;
import androidx.webkit.internal.h;
import androidx.webkit.internal.h0;
import java.util.Set;

/* compiled from: WebSettingsCompat */
public class p {
    private static f0 a(WebSettings webSettings) {
        return h0.c().f(webSettings);
    }

    public static int b(WebSettings webSettings) {
        a.c cVar = g0.f5001d;
        if (cVar.b()) {
            return d.f(webSettings);
        }
        if (cVar.c()) {
            return a(webSettings).a();
        }
        throw g0.a();
    }

    public static boolean c(WebSettings webSettings) {
        if (g0.Z.c()) {
            return a(webSettings).b();
        }
        throw g0.a();
    }

    @Deprecated
    public static int d(WebSettings webSettings) {
        a.h hVar = g0.T;
        if (hVar.b()) {
            return h.a(webSettings);
        }
        if (hVar.c()) {
            return a(webSettings).c();
        }
        throw g0.a();
    }

    @Deprecated
    public static int e(WebSettings webSettings) {
        if (g0.U.c()) {
            return a(webSettings).c();
        }
        throw g0.a();
    }

    public static boolean f(WebSettings webSettings) {
        a.b bVar = g0.f4998b;
        if (bVar.b()) {
            return c.g(webSettings);
        }
        if (bVar.c()) {
            return a(webSettings).d();
        }
        throw g0.a();
    }

    public static Set<String> g(WebSettings webSettings) {
        if (g0.f4999b0.c()) {
            return a(webSettings).e();
        }
        throw g0.a();
    }

    public static boolean h(WebSettings webSettings) {
        a.e eVar = g0.f5000c;
        if (eVar.b()) {
            return e.b(webSettings);
        }
        if (eVar.c()) {
            return a(webSettings).f();
        }
        throw g0.a();
    }

    public static boolean i(WebSettings webSettings) {
        if (g0.P.c()) {
            return a(webSettings).g();
        }
        throw g0.a();
    }

    public static void j(WebSettings webSettings, boolean z10) {
        if (g0.P.c()) {
            a(webSettings).h(z10);
            return;
        }
        throw g0.a();
    }

    public static void k(WebSettings webSettings, int i10) {
        a.c cVar = g0.f5001d;
        if (cVar.b()) {
            d.o(webSettings, i10);
        } else if (cVar.c()) {
            a(webSettings).i(i10);
        } else {
            throw g0.a();
        }
    }

    public static void l(WebSettings webSettings, boolean z10) {
        if (g0.Z.c()) {
            a(webSettings).j(z10);
            return;
        }
        throw g0.a();
    }

    @Deprecated
    public static void m(WebSettings webSettings, int i10) {
        a.h hVar = g0.T;
        if (hVar.b()) {
            h.d(webSettings, i10);
        } else if (hVar.c()) {
            a(webSettings).k(i10);
        } else {
            throw g0.a();
        }
    }

    @Deprecated
    public static void n(WebSettings webSettings, int i10) {
        if (g0.U.c()) {
            a(webSettings).l(i10);
            return;
        }
        throw g0.a();
    }

    public static void o(WebSettings webSettings, boolean z10) {
        a.b bVar = g0.f4998b;
        if (bVar.b()) {
            c.k(webSettings, z10);
        } else if (bVar.c()) {
            a(webSettings).m(z10);
        } else {
            throw g0.a();
        }
    }

    public static void p(WebSettings webSettings, Set<String> set) {
        if (g0.f4999b0.c()) {
            a(webSettings).n(set);
            return;
        }
        throw g0.a();
    }

    public static void q(WebSettings webSettings, boolean z10) {
        a.e eVar = g0.f5000c;
        if (eVar.b()) {
            e.e(webSettings, z10);
        } else if (eVar.c()) {
            a(webSettings).o(z10);
        } else {
            throw g0.a();
        }
    }

    @Deprecated
    public static void r(WebSettings webSettings, boolean z10) {
        if (g0.R.c()) {
            a(webSettings).p(z10);
            return;
        }
        throw g0.a();
    }

    @Deprecated
    public static boolean s(WebSettings webSettings) {
        if (g0.R.c()) {
            return a(webSettings).q();
        }
        throw g0.a();
    }
}
