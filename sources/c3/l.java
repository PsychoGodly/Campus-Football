package c3;

import c3.i0;
import java.util.Collections;
import java.util.List;
import k4.a0;
import n2.r1;
import s2.e0;
import s2.n;

/* compiled from: DvbSubtitleReader */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0.a> f5779a;

    /* renamed from: b  reason: collision with root package name */
    private final e0[] f5780b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5781c;

    /* renamed from: d  reason: collision with root package name */
    private int f5782d;

    /* renamed from: e  reason: collision with root package name */
    private int f5783e;

    /* renamed from: f  reason: collision with root package name */
    private long f5784f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f5779a = list;
        this.f5780b = new e0[list.size()];
    }

    private boolean a(a0 a0Var, int i10) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.G() != i10) {
            this.f5781c = false;
        }
        this.f5782d--;
        return this.f5781c;
    }

    public void b() {
        this.f5781c = false;
        this.f5784f = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        if (!this.f5781c) {
            return;
        }
        if (this.f5782d != 2 || a(a0Var, 32)) {
            if (this.f5782d != 1 || a(a0Var, 0)) {
                int f10 = a0Var.f();
                int a10 = a0Var.a();
                for (e0 d10 : this.f5780b) {
                    a0Var.T(f10);
                    d10.d(a0Var, a10);
                }
                this.f5783e += a10;
            }
        }
    }

    public void d() {
        if (this.f5781c) {
            if (this.f5784f != -9223372036854775807L) {
                for (e0 b10 : this.f5780b) {
                    b10.b(this.f5784f, 1, this.f5783e, 0, (e0.a) null);
                }
            }
            this.f5781c = false;
        }
    }

    public void e(n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f5780b.length; i10++) {
            i0.a aVar = this.f5779a.get(i10);
            dVar.a();
            e0 e10 = nVar.e(dVar.c(), 3);
            e10.a(new r1.b().U(dVar.b()).g0("application/dvbsubs").V(Collections.singletonList(aVar.f5754c)).X(aVar.f5752a).G());
            this.f5780b[i10] = e10;
        }
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f5781c = true;
            if (j10 != -9223372036854775807L) {
                this.f5784f = j10;
            }
            this.f5783e = 0;
            this.f5782d = 2;
        }
    }
}
