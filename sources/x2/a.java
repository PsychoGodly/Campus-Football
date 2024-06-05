package x2;

import a3.k;
import f3.a;
import java.io.IOException;
import k4.a0;
import l3.b;
import n2.r1;
import s2.b0;
import s2.l;
import s2.m;
import s2.n;

/* compiled from: JpegExtractor */
public final class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f23596a = new a0(6);

    /* renamed from: b  reason: collision with root package name */
    private n f23597b;

    /* renamed from: c  reason: collision with root package name */
    private int f23598c;

    /* renamed from: d  reason: collision with root package name */
    private int f23599d;

    /* renamed from: e  reason: collision with root package name */
    private int f23600e;

    /* renamed from: f  reason: collision with root package name */
    private long f23601f = -1;

    /* renamed from: g  reason: collision with root package name */
    private b f23602g;

    /* renamed from: h  reason: collision with root package name */
    private m f23603h;

    /* renamed from: i  reason: collision with root package name */
    private c f23604i;

    /* renamed from: j  reason: collision with root package name */
    private k f23605j;

    private void a(m mVar) throws IOException {
        this.f23596a.P(2);
        mVar.p(this.f23596a.e(), 0, 2);
        mVar.i(this.f23596a.M() - 2);
    }

    private void d() {
        h(new a.b[0]);
        ((n) k4.a.e(this.f23597b)).q();
        this.f23597b.j(new b0.b(-9223372036854775807L));
        this.f23598c = 6;
    }

    private static b f(String str, long j10) throws IOException {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void h(a.b... bVarArr) {
        ((n) k4.a.e(this.f23597b)).e(1024, 4).a(new r1.b().M("image/jpeg").Z(new f3.a(bVarArr)).G());
    }

    private int i(m mVar) throws IOException {
        this.f23596a.P(2);
        mVar.p(this.f23596a.e(), 0, 2);
        return this.f23596a.M();
    }

    private void j(m mVar) throws IOException {
        this.f23596a.P(2);
        mVar.readFully(this.f23596a.e(), 0, 2);
        int M = this.f23596a.M();
        this.f23599d = M;
        if (M == 65498) {
            if (this.f23601f != -1) {
                this.f23598c = 4;
            } else {
                d();
            }
        } else if ((M < 65488 || M > 65497) && M != 65281) {
            this.f23598c = 1;
        }
    }

    private void k(m mVar) throws IOException {
        String A;
        if (this.f23599d == 65505) {
            a0 a0Var = new a0(this.f23600e);
            mVar.readFully(a0Var.e(), 0, this.f23600e);
            if (this.f23602g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.A()) && (A = a0Var.A()) != null) {
                b f10 = f(A, mVar.b());
                this.f23602g = f10;
                if (f10 != null) {
                    this.f23601f = f10.f19884d;
                }
            }
        } else {
            mVar.m(this.f23600e);
        }
        this.f23598c = 0;
    }

    private void l(m mVar) throws IOException {
        this.f23596a.P(2);
        mVar.readFully(this.f23596a.e(), 0, 2);
        this.f23600e = this.f23596a.M() - 2;
        this.f23598c = 2;
    }

    private void m(m mVar) throws IOException {
        if (!mVar.g(this.f23596a.e(), 0, 1, true)) {
            d();
            return;
        }
        mVar.l();
        if (this.f23605j == null) {
            this.f23605j = new k();
        }
        c cVar = new c(mVar, this.f23601f);
        this.f23604i = cVar;
        if (this.f23605j.e(cVar)) {
            this.f23605j.b(new d(this.f23601f, (n) k4.a.e(this.f23597b)));
            n();
            return;
        }
        d();
    }

    private void n() {
        h((a.b) k4.a.e(this.f23602g));
        this.f23598c = 5;
    }

    public void b(n nVar) {
        this.f23597b = nVar;
    }

    public void c(long j10, long j11) {
        if (j10 == 0) {
            this.f23598c = 0;
            this.f23605j = null;
        } else if (this.f23598c == 5) {
            ((k) k4.a.e(this.f23605j)).c(j10, j11);
        }
    }

    public boolean e(m mVar) throws IOException {
        if (i(mVar) != 65496) {
            return false;
        }
        int i10 = i(mVar);
        this.f23599d = i10;
        if (i10 == 65504) {
            a(mVar);
            this.f23599d = i(mVar);
        }
        if (this.f23599d != 65505) {
            return false;
        }
        mVar.i(2);
        this.f23596a.P(6);
        mVar.p(this.f23596a.e(), 0, 6);
        if (this.f23596a.I() == 1165519206 && this.f23596a.M() == 0) {
            return true;
        }
        return false;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        int i10 = this.f23598c;
        if (i10 == 0) {
            j(mVar);
            return 0;
        } else if (i10 == 1) {
            l(mVar);
            return 0;
        } else if (i10 == 2) {
            k(mVar);
            return 0;
        } else if (i10 == 4) {
            long c10 = mVar.c();
            long j10 = this.f23601f;
            if (c10 != j10) {
                a0Var.f22378a = j10;
                return 1;
            }
            m(mVar);
            return 0;
        } else if (i10 == 5) {
            if (this.f23604i == null || mVar != this.f23603h) {
                this.f23603h = mVar;
                this.f23604i = new c(mVar, this.f23601f);
            }
            int g10 = ((k) k4.a.e(this.f23605j)).g(this.f23604i, a0Var);
            if (g10 == 1) {
                a0Var.f22378a += this.f23601f;
            }
            return g10;
        } else if (i10 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
        k kVar = this.f23605j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
