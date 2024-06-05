package u2;

import java.io.IOException;
import java.util.ArrayList;
import k4.a0;
import k4.r;
import k4.v;
import n2.r1;
import n2.y2;
import s2.b0;
import s2.e0;
import s2.j;
import s2.l;
import s2.m;
import s2.n;
import s6.d1;

/* compiled from: AviExtractor */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22795a = new a0(12);

    /* renamed from: b  reason: collision with root package name */
    private final c f22796b = new c();

    /* renamed from: c  reason: collision with root package name */
    private int f22797c;

    /* renamed from: d  reason: collision with root package name */
    private n f22798d = new j();

    /* renamed from: e  reason: collision with root package name */
    private c f22799e;

    /* renamed from: f  reason: collision with root package name */
    private long f22800f = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public e[] f22801g = new e[0];

    /* renamed from: h  reason: collision with root package name */
    private long f22802h;

    /* renamed from: i  reason: collision with root package name */
    private e f22803i;

    /* renamed from: j  reason: collision with root package name */
    private int f22804j = -1;

    /* renamed from: k  reason: collision with root package name */
    private long f22805k = -1;

    /* renamed from: l  reason: collision with root package name */
    private long f22806l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f22807m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22808n;

    /* renamed from: u2.b$b  reason: collision with other inner class name */
    /* compiled from: AviExtractor */
    private class C0237b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f22809a;

        public C0237b(long j10) {
            this.f22809a = j10;
        }

        public boolean f() {
            return true;
        }

        public b0.a h(long j10) {
            b0.a i10 = b.this.f22801g[0].i(j10);
            for (int i11 = 1; i11 < b.this.f22801g.length; i11++) {
                b0.a i12 = b.this.f22801g[i11].i(j10);
                if (i12.f22379a.f22385b < i10.f22379a.f22385b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        public long i() {
            return this.f22809a;
        }
    }

    /* compiled from: AviExtractor */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f22811a;

        /* renamed from: b  reason: collision with root package name */
        public int f22812b;

        /* renamed from: c  reason: collision with root package name */
        public int f22813c;

        private c() {
        }

        public void a(a0 a0Var) {
            this.f22811a = a0Var.t();
            this.f22812b = a0Var.t();
            this.f22813c = 0;
        }

        public void b(a0 a0Var) throws y2 {
            a(a0Var);
            if (this.f22811a == 1414744396) {
                this.f22813c = a0Var.t();
                return;
            }
            throw y2.a("LIST expected, found: " + this.f22811a, (Throwable) null);
        }
    }

    private static void d(m mVar) throws IOException {
        if ((mVar.c() & 1) == 1) {
            mVar.m(1);
        }
    }

    private e f(int i10) {
        for (e eVar : this.f22801g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void h(a0 a0Var) throws IOException {
        f c10 = f.c(1819436136, a0Var);
        if (c10.getType() == 1819436136) {
            c cVar = (c) c10.b(c.class);
            if (cVar != null) {
                this.f22799e = cVar;
                this.f22800f = ((long) cVar.f22816c) * ((long) cVar.f22814a);
                ArrayList arrayList = new ArrayList();
                d1<a> m10 = c10.f22836a.iterator();
                int i10 = 0;
                while (m10.hasNext()) {
                    a next = m10.next();
                    if (next.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        e k10 = k((f) next, i10);
                        if (k10 != null) {
                            arrayList.add(k10);
                        }
                        i10 = i11;
                    }
                }
                this.f22801g = (e[]) arrayList.toArray(new e[0]);
                this.f22798d.q();
                return;
            }
            throw y2.a("AviHeader not found", (Throwable) null);
        }
        throw y2.a("Unexpected header list type " + c10.getType(), (Throwable) null);
    }

    private void i(a0 a0Var) {
        long j10 = j(a0Var);
        while (a0Var.a() >= 16) {
            int t10 = a0Var.t();
            int t11 = a0Var.t();
            long t12 = ((long) a0Var.t()) + j10;
            a0Var.t();
            e f10 = f(t10);
            if (f10 != null) {
                if ((t11 & 16) == 16) {
                    f10.b(t12);
                }
                f10.k();
            }
        }
        for (e c10 : this.f22801g) {
            c10.c();
        }
        this.f22808n = true;
        this.f22798d.j(new C0237b(this.f22800f));
    }

    private long j(a0 a0Var) {
        long j10 = 0;
        if (a0Var.a() < 16) {
            return 0;
        }
        int f10 = a0Var.f();
        a0Var.U(8);
        long j11 = this.f22805k;
        if (((long) a0Var.t()) <= j11) {
            j10 = 8 + j11;
        }
        a0Var.T(f10);
        return j10;
    }

    private e k(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            r.i("AviExtractor", "Missing Stream Header");
            return null;
        } else if (gVar == null) {
            r.i("AviExtractor", "Missing Stream Format");
            return null;
        } else {
            long a10 = dVar.a();
            r1 r1Var = gVar.f22838a;
            r1.b b10 = r1Var.b();
            b10.T(i10);
            int i11 = dVar.f22823f;
            if (i11 != 0) {
                b10.Y(i11);
            }
            h hVar = (h) fVar.b(h.class);
            if (hVar != null) {
                b10.W(hVar.f22839a);
            }
            int k10 = v.k(r1Var.f20654m);
            if (k10 != 1 && k10 != 2) {
                return null;
            }
            e0 e10 = this.f22798d.e(i10, k10);
            e10.a(b10.G());
            e eVar = new e(i10, k10, a10, dVar.f22822e, e10);
            this.f22800f = a10;
            return eVar;
        }
    }

    private int l(m mVar) throws IOException {
        if (mVar.c() >= this.f22806l) {
            return -1;
        }
        e eVar = this.f22803i;
        if (eVar == null) {
            d(mVar);
            int i10 = 12;
            mVar.p(this.f22795a.e(), 0, 12);
            this.f22795a.T(0);
            int t10 = this.f22795a.t();
            if (t10 == 1414744396) {
                this.f22795a.T(8);
                if (this.f22795a.t() != 1769369453) {
                    i10 = 8;
                }
                mVar.m(i10);
                mVar.l();
                return 0;
            }
            int t11 = this.f22795a.t();
            if (t10 == 1263424842) {
                this.f22802h = mVar.c() + ((long) t11) + 8;
                return 0;
            }
            mVar.m(8);
            mVar.l();
            e f10 = f(t10);
            if (f10 == null) {
                this.f22802h = mVar.c() + ((long) t11);
                return 0;
            }
            f10.n(t11);
            this.f22803i = f10;
        } else if (eVar.m(mVar)) {
            this.f22803i = null;
        }
        return 0;
    }

    private boolean m(m mVar, s2.a0 a0Var) throws IOException {
        boolean z10;
        if (this.f22802h != -1) {
            long c10 = mVar.c();
            long j10 = this.f22802h;
            if (j10 < c10 || j10 > 262144 + c10) {
                a0Var.f22378a = j10;
                z10 = true;
                this.f22802h = -1;
                return z10;
            }
            mVar.m((int) (j10 - c10));
        }
        z10 = false;
        this.f22802h = -1;
        return z10;
    }

    public void b(n nVar) {
        this.f22797c = 0;
        this.f22798d = nVar;
        this.f22802h = -1;
    }

    public void c(long j10, long j11) {
        this.f22802h = -1;
        this.f22803i = null;
        for (e o10 : this.f22801g) {
            o10.o(j10);
        }
        if (j10 != 0) {
            this.f22797c = 6;
        } else if (this.f22801g.length == 0) {
            this.f22797c = 0;
        } else {
            this.f22797c = 3;
        }
    }

    public boolean e(m mVar) throws IOException {
        mVar.p(this.f22795a.e(), 0, 12);
        this.f22795a.T(0);
        if (this.f22795a.t() != 1179011410) {
            return false;
        }
        this.f22795a.U(4);
        if (this.f22795a.t() == 541677121) {
            return true;
        }
        return false;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        if (m(mVar, a0Var)) {
            return 1;
        }
        switch (this.f22797c) {
            case 0:
                if (e(mVar)) {
                    mVar.m(12);
                    this.f22797c = 1;
                    return 0;
                }
                throw y2.a("AVI Header List not found", (Throwable) null);
            case 1:
                mVar.readFully(this.f22795a.e(), 0, 12);
                this.f22795a.T(0);
                this.f22796b.b(this.f22795a);
                c cVar = this.f22796b;
                if (cVar.f22813c == 1819436136) {
                    this.f22804j = cVar.f22812b;
                    this.f22797c = 2;
                    return 0;
                }
                throw y2.a("hdrl expected, found: " + this.f22796b.f22813c, (Throwable) null);
            case 2:
                int i10 = this.f22804j - 4;
                a0 a0Var2 = new a0(i10);
                mVar.readFully(a0Var2.e(), 0, i10);
                h(a0Var2);
                this.f22797c = 3;
                return 0;
            case 3:
                if (this.f22805k != -1) {
                    long c10 = mVar.c();
                    long j10 = this.f22805k;
                    if (c10 != j10) {
                        this.f22802h = j10;
                        return 0;
                    }
                }
                mVar.p(this.f22795a.e(), 0, 12);
                mVar.l();
                this.f22795a.T(0);
                this.f22796b.a(this.f22795a);
                int t10 = this.f22795a.t();
                int i11 = this.f22796b.f22811a;
                if (i11 == 1179011410) {
                    mVar.m(12);
                    return 0;
                } else if (i11 == 1414744396 && t10 == 1769369453) {
                    long c11 = mVar.c();
                    this.f22805k = c11;
                    this.f22806l = c11 + ((long) this.f22796b.f22812b) + 8;
                    if (!this.f22808n) {
                        if (((c) k4.a.e(this.f22799e)).a()) {
                            this.f22797c = 4;
                            this.f22802h = this.f22806l;
                            return 0;
                        }
                        this.f22798d.j(new b0.b(this.f22800f));
                        this.f22808n = true;
                    }
                    this.f22802h = mVar.c() + 12;
                    this.f22797c = 6;
                    return 0;
                } else {
                    this.f22802h = mVar.c() + ((long) this.f22796b.f22812b) + 8;
                    return 0;
                }
            case 4:
                mVar.readFully(this.f22795a.e(), 0, 8);
                this.f22795a.T(0);
                int t11 = this.f22795a.t();
                int t12 = this.f22795a.t();
                if (t11 == 829973609) {
                    this.f22797c = 5;
                    this.f22807m = t12;
                } else {
                    this.f22802h = mVar.c() + ((long) t12);
                }
                return 0;
            case 5:
                a0 a0Var3 = new a0(this.f22807m);
                mVar.readFully(a0Var3.e(), 0, this.f22807m);
                i(a0Var3);
                this.f22797c = 6;
                this.f22802h = this.f22805k;
                return 0;
            case 6:
                return l(mVar);
            default:
                throw new AssertionError();
        }
    }

    public void release() {
    }
}
