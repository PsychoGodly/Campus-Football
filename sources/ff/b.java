package ff;

import bf.s;
import bf.x;
import bf.z;
import java.io.IOException;
import java.net.ProtocolException;
import lf.c;
import lf.d;
import lf.g;
import lf.l;
import lf.r;

/* compiled from: CallServerInterceptor */
public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32773a;

    /* compiled from: CallServerInterceptor */
    static final class a extends g {

        /* renamed from: b  reason: collision with root package name */
        long f32774b;

        a(r rVar) {
            super(rVar);
        }

        public void V0(c cVar, long j10) throws IOException {
            super.V0(cVar, j10);
            this.f32774b += j10;
        }
    }

    public b(boolean z10) {
        this.f32773a = z10;
    }

    public z a(s.a aVar) throws IOException {
        z zVar;
        g gVar = (g) aVar;
        c i10 = gVar.i();
        ef.g k10 = gVar.k();
        ef.c cVar = (ef.c) gVar.f();
        x h10 = gVar.h();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.g().o(gVar.e());
        i10.c(h10);
        gVar.g().n(gVar.e(), h10);
        z.a aVar2 = null;
        if (f.b(h10.f()) && h10.a() != null) {
            if ("100-continue".equalsIgnoreCase(h10.c("Expect"))) {
                i10.f();
                gVar.g().s(gVar.e());
                aVar2 = i10.e(true);
            }
            if (aVar2 == null) {
                gVar.g().m(gVar.e());
                a aVar3 = new a(i10.d(h10, h10.a().a()));
                d a10 = l.a(aVar3);
                h10.a().f(a10);
                a10.close();
                gVar.g().l(gVar.e(), aVar3.f32774b);
            } else if (!cVar.n()) {
                k10.j();
            }
        }
        i10.a();
        if (aVar2 == null) {
            gVar.g().s(gVar.e());
            aVar2 = i10.e(false);
        }
        z c10 = aVar2.p(h10).h(k10.d().k()).q(currentTimeMillis).o(System.currentTimeMillis()).c();
        int j10 = c10.j();
        if (j10 == 100) {
            c10 = i10.e(false).p(h10).h(k10.d().k()).q(currentTimeMillis).o(System.currentTimeMillis()).c();
            j10 = c10.j();
        }
        gVar.g().r(gVar.e(), c10);
        if (!this.f32773a || j10 != 101) {
            zVar = c10.B().b(i10.b(c10)).c();
        } else {
            zVar = c10.B().b(cf.c.f31985c).c();
        }
        if ("close".equalsIgnoreCase(zVar.Z().c("Connection")) || "close".equalsIgnoreCase(zVar.q("Connection"))) {
            k10.j();
        }
        if ((j10 != 204 && j10 != 205) || zVar.h().i() <= 0) {
            return zVar;
        }
        throw new ProtocolException("HTTP " + j10 + " had non-zero Content-Length: " + zVar.h().i());
    }
}
