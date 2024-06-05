package n2;

import i4.b0;
import i4.c0;
import i4.s;
import j4.b;
import k4.a;
import k4.r;
import p3.d;
import p3.n;
import p3.q0;
import p3.u;
import p3.x;
import p3.z0;

/* compiled from: MediaPeriodHolder */
final class f2 {

    /* renamed from: a  reason: collision with root package name */
    public final u f20365a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20366b;

    /* renamed from: c  reason: collision with root package name */
    public final q0[] f20367c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20368d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20369e;

    /* renamed from: f  reason: collision with root package name */
    public g2 f20370f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20371g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f20372h;

    /* renamed from: i  reason: collision with root package name */
    private final r3[] f20373i;

    /* renamed from: j  reason: collision with root package name */
    private final b0 f20374j;

    /* renamed from: k  reason: collision with root package name */
    private final x2 f20375k;

    /* renamed from: l  reason: collision with root package name */
    private f2 f20376l;

    /* renamed from: m  reason: collision with root package name */
    private z0 f20377m = z0.f21693d;

    /* renamed from: n  reason: collision with root package name */
    private c0 f20378n;

    /* renamed from: o  reason: collision with root package name */
    private long f20379o;

    public f2(r3[] r3VarArr, long j10, b0 b0Var, b bVar, x2 x2Var, g2 g2Var, c0 c0Var) {
        this.f20373i = r3VarArr;
        this.f20379o = j10;
        this.f20374j = b0Var;
        this.f20375k = x2Var;
        x.b bVar2 = g2Var.f20388a;
        this.f20366b = bVar2.f21677a;
        this.f20370f = g2Var;
        this.f20378n = c0Var;
        this.f20367c = new q0[r3VarArr.length];
        this.f20372h = new boolean[r3VarArr.length];
        this.f20365a = e(bVar2, x2Var, bVar, g2Var.f20389b, g2Var.f20391d);
    }

    private void c(q0[] q0VarArr) {
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.f20373i;
            if (i10 < r3VarArr.length) {
                if (r3VarArr[i10].f() == -2 && this.f20378n.c(i10)) {
                    q0VarArr[i10] = new n();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private static u e(x.b bVar, x2 x2Var, b bVar2, long j10, long j11) {
        u h10 = x2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new d(h10, true, 0, j11) : h10;
    }

    private void f() {
        if (r()) {
            int i10 = 0;
            while (true) {
                c0 c0Var = this.f20378n;
                if (i10 < c0Var.f18963a) {
                    boolean c10 = c0Var.c(i10);
                    s sVar = this.f20378n.f18965c[i10];
                    if (c10 && sVar != null) {
                        sVar.d();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void g(q0[] q0VarArr) {
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.f20373i;
            if (i10 < r3VarArr.length) {
                if (r3VarArr[i10].f() == -2) {
                    q0VarArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void h() {
        if (r()) {
            int i10 = 0;
            while (true) {
                c0 c0Var = this.f20378n;
                if (i10 < c0Var.f18963a) {
                    boolean c10 = c0Var.c(i10);
                    s sVar = this.f20378n.f18965c[i10];
                    if (c10 && sVar != null) {
                        sVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean r() {
        return this.f20376l == null;
    }

    private static void u(x2 x2Var, u uVar) {
        try {
            if (uVar instanceof d) {
                x2Var.z(((d) uVar).f21410a);
            } else {
                x2Var.z(uVar);
            }
        } catch (RuntimeException e10) {
            r.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        u uVar = this.f20365a;
        if (uVar instanceof d) {
            long j10 = this.f20370f.f20391d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((d) uVar).u(0, j10);
        }
    }

    public long a(c0 c0Var, long j10, boolean z10) {
        return b(c0Var, j10, z10, new boolean[this.f20373i.length]);
    }

    public long b(c0 c0Var, long j10, boolean z10, boolean[] zArr) {
        c0 c0Var2 = c0Var;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c0Var2.f18963a) {
                break;
            }
            boolean[] zArr2 = this.f20372h;
            if (z10 || !c0Var.b(this.f20378n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f20367c);
        f();
        this.f20378n = c0Var2;
        h();
        long p10 = this.f20365a.p(c0Var2.f18965c, this.f20372h, this.f20367c, zArr, j10);
        c(this.f20367c);
        this.f20369e = false;
        int i11 = 0;
        while (true) {
            q0[] q0VarArr = this.f20367c;
            if (i11 >= q0VarArr.length) {
                return p10;
            }
            if (q0VarArr[i11] != null) {
                a.f(c0Var.c(i11));
                if (this.f20373i[i11].f() != -2) {
                    this.f20369e = true;
                }
            } else {
                a.f(c0Var2.f18965c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        a.f(r());
        this.f20365a.c(y(j10));
    }

    public long i() {
        if (!this.f20368d) {
            return this.f20370f.f20389b;
        }
        long f10 = this.f20369e ? this.f20365a.f() : Long.MIN_VALUE;
        return f10 == Long.MIN_VALUE ? this.f20370f.f20392e : f10;
    }

    public f2 j() {
        return this.f20376l;
    }

    public long k() {
        if (!this.f20368d) {
            return 0;
        }
        return this.f20365a.b();
    }

    public long l() {
        return this.f20379o;
    }

    public long m() {
        return this.f20370f.f20389b + this.f20379o;
    }

    public z0 n() {
        return this.f20377m;
    }

    public c0 o() {
        return this.f20378n;
    }

    public void p(float f10, c4 c4Var) throws q {
        this.f20368d = true;
        this.f20377m = this.f20365a.s();
        c0 v10 = v(f10, c4Var);
        g2 g2Var = this.f20370f;
        long j10 = g2Var.f20389b;
        long j11 = g2Var.f20392e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f20379o;
        g2 g2Var2 = this.f20370f;
        this.f20379o = j12 + (g2Var2.f20389b - a10);
        this.f20370f = g2Var2.b(a10);
    }

    public boolean q() {
        return this.f20368d && (!this.f20369e || this.f20365a.f() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        a.f(r());
        if (this.f20368d) {
            this.f20365a.g(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f20375k, this.f20365a);
    }

    public c0 v(float f10, c4 c4Var) throws q {
        c0 g10 = this.f20374j.g(this.f20373i, n(), this.f20370f.f20388a, c4Var);
        for (s sVar : g10.f18965c) {
            if (sVar != null) {
                sVar.q(f10);
            }
        }
        return g10;
    }

    public void w(f2 f2Var) {
        if (f2Var != this.f20376l) {
            f();
            this.f20376l = f2Var;
            h();
        }
    }

    public void x(long j10) {
        this.f20379o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
