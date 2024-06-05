package v2;

import f3.a;
import java.io.IOException;
import k4.a0;
import k4.n0;
import s2.b0;
import s2.e0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;
import s2.s;
import s2.t;
import s2.u;
import s2.v;

/* compiled from: FlacExtractor */
public final class d implements l {

    /* renamed from: o  reason: collision with root package name */
    public static final r f23169o = c.f38873b;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f23170a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f23171b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23172c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f23173d;

    /* renamed from: e  reason: collision with root package name */
    private n f23174e;

    /* renamed from: f  reason: collision with root package name */
    private e0 f23175f;

    /* renamed from: g  reason: collision with root package name */
    private int f23176g;

    /* renamed from: h  reason: collision with root package name */
    private a f23177h;

    /* renamed from: i  reason: collision with root package name */
    private v f23178i;

    /* renamed from: j  reason: collision with root package name */
    private int f23179j;

    /* renamed from: k  reason: collision with root package name */
    private int f23180k;

    /* renamed from: l  reason: collision with root package name */
    private b f23181l;

    /* renamed from: m  reason: collision with root package name */
    private int f23182m;

    /* renamed from: n  reason: collision with root package name */
    private long f23183n;

    public d() {
        this(0);
    }

    private long d(a0 a0Var, boolean z10) {
        boolean z11;
        k4.a.e(this.f23178i);
        int f10 = a0Var.f();
        while (f10 <= a0Var.g() - 16) {
            a0Var.T(f10);
            if (s.d(a0Var, this.f23178i, this.f23180k, this.f23173d)) {
                a0Var.T(f10);
                return this.f23173d.f22464a;
            }
            f10++;
        }
        if (z10) {
            while (f10 <= a0Var.g() - this.f23179j) {
                a0Var.T(f10);
                boolean z12 = false;
                try {
                    z11 = s.d(a0Var, this.f23178i, this.f23180k, this.f23173d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (a0Var.f() <= a0Var.g()) {
                    z12 = z11;
                }
                if (z12) {
                    a0Var.T(f10);
                    return this.f23173d.f22464a;
                }
                f10++;
            }
            a0Var.T(a0Var.g());
            return -1;
        }
        a0Var.T(f10);
        return -1;
    }

    private void f(m mVar) throws IOException {
        this.f23180k = t.b(mVar);
        ((n) n0.j(this.f23174e)).j(h(mVar.c(), mVar.b()));
        this.f23176g = 5;
    }

    private b0 h(long j10, long j11) {
        k4.a.e(this.f23178i);
        v vVar = this.f23178i;
        if (vVar.f22478k != null) {
            return new u(vVar, j10);
        }
        if (j11 == -1 || vVar.f22477j <= 0) {
            return new b0.b(vVar.f());
        }
        b bVar = new b(vVar, this.f23180k, j10, j11);
        this.f23181l = bVar;
        return bVar.b();
    }

    private void i(m mVar) throws IOException {
        byte[] bArr = this.f23170a;
        mVar.p(bArr, 0, bArr.length);
        mVar.l();
        this.f23176g = 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] j() {
        return new l[]{new d()};
    }

    private void k() {
        ((e0) n0.j(this.f23175f)).b((this.f23183n * 1000000) / ((long) ((v) n0.j(this.f23178i)).f22472e), 1, this.f23182m, 0, (e0.a) null);
    }

    private int l(m mVar, s2.a0 a0Var) throws IOException {
        boolean z10;
        k4.a.e(this.f23175f);
        k4.a.e(this.f23178i);
        b bVar = this.f23181l;
        if (bVar != null && bVar.d()) {
            return this.f23181l.c(mVar, a0Var);
        }
        if (this.f23183n == -1) {
            this.f23183n = s.i(mVar, this.f23178i);
            return 0;
        }
        int g10 = this.f23171b.g();
        if (g10 < 32768) {
            int read = mVar.read(this.f23171b.e(), g10, 32768 - g10);
            z10 = read == -1;
            if (!z10) {
                this.f23171b.S(g10 + read);
            } else if (this.f23171b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int f10 = this.f23171b.f();
        int i10 = this.f23182m;
        int i11 = this.f23179j;
        if (i10 < i11) {
            a0 a0Var2 = this.f23171b;
            a0Var2.U(Math.min(i11 - i10, a0Var2.a()));
        }
        long d10 = d(this.f23171b, z10);
        int f11 = this.f23171b.f() - f10;
        this.f23171b.T(f10);
        this.f23175f.d(this.f23171b, f11);
        this.f23182m += f11;
        if (d10 != -1) {
            k();
            this.f23182m = 0;
            this.f23183n = d10;
        }
        if (this.f23171b.a() < 16) {
            int a10 = this.f23171b.a();
            System.arraycopy(this.f23171b.e(), this.f23171b.f(), this.f23171b.e(), 0, a10);
            this.f23171b.T(0);
            this.f23171b.S(a10);
        }
        return 0;
    }

    private void m(m mVar) throws IOException {
        this.f23177h = t.d(mVar, !this.f23172c);
        this.f23176g = 1;
    }

    private void n(m mVar) throws IOException {
        t.a aVar = new t.a(this.f23178i);
        boolean z10 = false;
        while (!z10) {
            z10 = t.e(mVar, aVar);
            this.f23178i = (v) n0.j(aVar.f22465a);
        }
        k4.a.e(this.f23178i);
        this.f23179j = Math.max(this.f23178i.f22470c, 6);
        ((e0) n0.j(this.f23175f)).a(this.f23178i.g(this.f23170a, this.f23177h));
        this.f23176g = 4;
    }

    private void o(m mVar) throws IOException {
        t.i(mVar);
        this.f23176g = 3;
    }

    public void b(n nVar) {
        this.f23174e = nVar;
        this.f23175f = nVar.e(0, 1);
        nVar.q();
    }

    public void c(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f23176g = 0;
        } else {
            b bVar = this.f23181l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f23183n = j12;
        this.f23182m = 0;
        this.f23171b.P(0);
    }

    public boolean e(m mVar) throws IOException {
        t.c(mVar, false);
        return t.a(mVar);
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        int i10 = this.f23176g;
        if (i10 == 0) {
            m(mVar);
            return 0;
        } else if (i10 == 1) {
            i(mVar);
            return 0;
        } else if (i10 == 2) {
            o(mVar);
            return 0;
        } else if (i10 == 3) {
            n(mVar);
            return 0;
        } else if (i10 == 4) {
            f(mVar);
            return 0;
        } else if (i10 == 5) {
            return l(mVar, a0Var);
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }

    public d(int i10) {
        this.f23170a = new byte[42];
        this.f23171b = new a0(new byte[32768], 0);
        this.f23172c = (i10 & 1) == 0 ? false : true;
        this.f23173d = new s.a();
        this.f23176g = 0;
    }
}
