package df;

import bf.a0;
import bf.q;
import bf.s;
import bf.v;
import bf.x;
import bf.z;
import com.unity3d.services.UnityAdsConstants;
import df.c;
import ff.f;
import ff.h;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import lf.c;
import lf.d;
import lf.e;
import lf.l;
import lf.r;
import lf.t;

/* compiled from: CacheInterceptor */
public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    final d f32435a;

    /* renamed from: df.a$a  reason: collision with other inner class name */
    /* compiled from: CacheInterceptor */
    class C0364a implements lf.s {

        /* renamed from: a  reason: collision with root package name */
        boolean f32436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f32437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f32438c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f32439d;

        C0364a(e eVar, b bVar, d dVar) {
            this.f32437b = eVar;
            this.f32438c = bVar;
            this.f32439d = dVar;
        }

        public long P(c cVar, long j10) throws IOException {
            try {
                long P = this.f32437b.P(cVar, j10);
                if (P == -1) {
                    if (!this.f32436a) {
                        this.f32436a = true;
                        this.f32439d.close();
                    }
                    return -1;
                }
                cVar.J(this.f32439d.c(), cVar.v0() - P, P);
                this.f32439d.K();
                return P;
            } catch (IOException e10) {
                if (!this.f32436a) {
                    this.f32436a = true;
                    this.f32438c.a();
                }
                throw e10;
            }
        }

        public void close() throws IOException {
            if (!this.f32436a && !cf.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f32436a = true;
                this.f32438c.a();
            }
            this.f32437b.close();
        }

        public t e() {
            return this.f32437b.e();
        }
    }

    public a(d dVar) {
        this.f32435a = dVar;
    }

    private z b(b bVar, z zVar) throws IOException {
        r b10;
        if (bVar == null || (b10 = bVar.b()) == null) {
            return zVar;
        }
        C0364a aVar = new C0364a(zVar.h().u(), bVar, l.a(b10));
        return zVar.B().b(new h(zVar.q("Content-Type"), zVar.h().i(), l.b(aVar))).c();
    }

    private static q c(q qVar, q qVar2) {
        q.a aVar = new q.a();
        int g10 = qVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            String e10 = qVar.e(i10);
            String i11 = qVar.i(i10);
            if ((!"Warning".equalsIgnoreCase(e10) || !i11.startsWith(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) && (d(e10) || !e(e10) || qVar2.c(e10) == null)) {
                cf.a.f31981a.b(aVar, e10, i11);
            }
        }
        int g11 = qVar2.g();
        for (int i12 = 0; i12 < g11; i12++) {
            String e11 = qVar2.e(i12);
            if (!d(e11) && e(e11)) {
                cf.a.f31981a.b(aVar, e11, qVar2.i(i12));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static z f(z zVar) {
        return (zVar == null || zVar.h() == null) ? zVar : zVar.B().b((a0) null).c();
    }

    public z a(s.a aVar) throws IOException {
        d dVar = this.f32435a;
        z e10 = dVar != null ? dVar.e(aVar.h()) : null;
        c c10 = new c.a(System.currentTimeMillis(), aVar.h(), e10).c();
        x xVar = c10.f32441a;
        z zVar = c10.f32442b;
        d dVar2 = this.f32435a;
        if (dVar2 != null) {
            dVar2.c(c10);
        }
        if (e10 != null && zVar == null) {
            cf.c.g(e10.h());
        }
        if (xVar == null && zVar == null) {
            return new z.a().p(aVar.h()).n(v.HTTP_1_1).g(504).k("Unsatisfiable Request (only-if-cached)").b(cf.c.f31985c).q(-1).o(System.currentTimeMillis()).c();
        }
        if (xVar == null) {
            return zVar.B().d(f(zVar)).c();
        }
        try {
            z d10 = aVar.d(xVar);
            if (d10 == null && e10 != null) {
            }
            if (zVar != null) {
                if (d10.j() == 304) {
                    z c11 = zVar.B().j(c(zVar.A(), d10.A())).q(d10.e0()).o(d10.R()).d(f(zVar)).l(f(d10)).c();
                    d10.h().close();
                    this.f32435a.b();
                    this.f32435a.a(zVar, c11);
                    return c11;
                }
                cf.c.g(zVar.h());
            }
            z c12 = d10.B().d(f(zVar)).l(f(d10)).c();
            if (this.f32435a != null) {
                if (ff.e.c(c12) && c.a(c12, xVar)) {
                    return b(this.f32435a.f(c12), c12);
                }
                if (f.a(xVar.f())) {
                    try {
                        this.f32435a.d(xVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c12;
        } finally {
            if (e10 != null) {
                cf.c.g(e10.h());
            }
        }
    }
}
