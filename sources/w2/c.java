package w2;

import java.io.IOException;
import k4.a;
import k4.a0;
import s2.b0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: FlvExtractor */
public final class c implements l {

    /* renamed from: q  reason: collision with root package name */
    public static final r f23521q = b.f39188b;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f23522a = new a0(4);

    /* renamed from: b  reason: collision with root package name */
    private final a0 f23523b = new a0(9);

    /* renamed from: c  reason: collision with root package name */
    private final a0 f23524c = new a0(11);

    /* renamed from: d  reason: collision with root package name */
    private final a0 f23525d = new a0();

    /* renamed from: e  reason: collision with root package name */
    private final d f23526e = new d();

    /* renamed from: f  reason: collision with root package name */
    private n f23527f;

    /* renamed from: g  reason: collision with root package name */
    private int f23528g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23529h;

    /* renamed from: i  reason: collision with root package name */
    private long f23530i;

    /* renamed from: j  reason: collision with root package name */
    private int f23531j;

    /* renamed from: k  reason: collision with root package name */
    private int f23532k;

    /* renamed from: l  reason: collision with root package name */
    private int f23533l;

    /* renamed from: m  reason: collision with root package name */
    private long f23534m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f23535n;

    /* renamed from: o  reason: collision with root package name */
    private a f23536o;

    /* renamed from: p  reason: collision with root package name */
    private f f23537p;

    private void d() {
        if (!this.f23535n) {
            this.f23527f.j(new b0.b(-9223372036854775807L));
            this.f23535n = true;
        }
    }

    private long f() {
        if (this.f23529h) {
            return this.f23530i + this.f23534m;
        }
        if (this.f23526e.d() == -9223372036854775807L) {
            return 0;
        }
        return this.f23534m;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] h() {
        return new l[]{new c()};
    }

    private a0 i(m mVar) throws IOException {
        if (this.f23533l > this.f23525d.b()) {
            a0 a0Var = this.f23525d;
            a0Var.R(new byte[Math.max(a0Var.b() * 2, this.f23533l)], 0);
        } else {
            this.f23525d.T(0);
        }
        this.f23525d.S(this.f23533l);
        mVar.readFully(this.f23525d.e(), 0, this.f23533l);
        return this.f23525d;
    }

    private boolean j(m mVar) throws IOException {
        boolean z10 = false;
        if (!mVar.d(this.f23523b.e(), 0, 9, true)) {
            return false;
        }
        this.f23523b.T(0);
        this.f23523b.U(4);
        int G = this.f23523b.G();
        boolean z11 = (G & 4) != 0;
        if ((G & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f23536o == null) {
            this.f23536o = new a(this.f23527f.e(8, 1));
        }
        if (z10 && this.f23537p == null) {
            this.f23537p = new f(this.f23527f.e(9, 2));
        }
        this.f23527f.q();
        this.f23531j = (this.f23523b.p() - 9) + 4;
        this.f23528g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(s2.m r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f23532k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            w2.a r7 = r9.f23536o
            if (r7 == 0) goto L_0x0024
            r9.d()
            w2.a r2 = r9.f23536o
            k4.a0 r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0075
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x003a
            w2.f r7 = r9.f23537p
            if (r7 == 0) goto L_0x003a
            r9.d()
            w2.f r2 = r9.f23537p
            k4.a0 r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            goto L_0x0022
        L_0x003a:
            r7 = 18
            if (r2 != r7) goto L_0x006f
            boolean r2 = r9.f23535n
            if (r2 != 0) goto L_0x006f
            w2.d r2 = r9.f23526e
            k4.a0 r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            w2.d r10 = r9.f23526e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            s2.n r10 = r9.f23527f
            s2.z r2 = new s2.z
            w2.d r7 = r9.f23526e
            long[] r7 = r7.e()
            w2.d r8 = r9.f23526e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.j(r2)
            r9.f23535n = r6
            goto L_0x0022
        L_0x006f:
            int r0 = r9.f23533l
            r10.m(r0)
            r10 = 0
        L_0x0075:
            boolean r0 = r9.f23529h
            if (r0 != 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            r9.f23529h = r6
            w2.d r0 = r9.f23526e
            long r0 = r0.d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008b
            long r0 = r9.f23534m
            long r0 = -r0
            goto L_0x008d
        L_0x008b:
            r0 = 0
        L_0x008d:
            r9.f23530i = r0
        L_0x008f:
            r0 = 4
            r9.f23531j = r0
            r0 = 2
            r9.f23528g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.c.k(s2.m):boolean");
    }

    private boolean l(m mVar) throws IOException {
        if (!mVar.d(this.f23524c.e(), 0, 11, true)) {
            return false;
        }
        this.f23524c.T(0);
        this.f23532k = this.f23524c.G();
        this.f23533l = this.f23524c.J();
        this.f23534m = (long) this.f23524c.J();
        this.f23534m = (((long) (this.f23524c.G() << 24)) | this.f23534m) * 1000;
        this.f23524c.U(3);
        this.f23528g = 4;
        return true;
    }

    private void m(m mVar) throws IOException {
        mVar.m(this.f23531j);
        this.f23531j = 0;
        this.f23528g = 3;
    }

    public void b(n nVar) {
        this.f23527f = nVar;
    }

    public void c(long j10, long j11) {
        if (j10 == 0) {
            this.f23528g = 1;
            this.f23529h = false;
        } else {
            this.f23528g = 3;
        }
        this.f23531j = 0;
    }

    public boolean e(m mVar) throws IOException {
        mVar.p(this.f23522a.e(), 0, 3);
        this.f23522a.T(0);
        if (this.f23522a.J() != 4607062) {
            return false;
        }
        mVar.p(this.f23522a.e(), 0, 2);
        this.f23522a.T(0);
        if ((this.f23522a.M() & 250) != 0) {
            return false;
        }
        mVar.p(this.f23522a.e(), 0, 4);
        this.f23522a.T(0);
        int p10 = this.f23522a.p();
        mVar.l();
        mVar.i(p10);
        mVar.p(this.f23522a.e(), 0, 4);
        this.f23522a.T(0);
        if (this.f23522a.p() == 0) {
            return true;
        }
        return false;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        a.h(this.f23527f);
        while (true) {
            int i10 = this.f23528g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(mVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    } else if (k(mVar)) {
                        return 0;
                    }
                } else if (!l(mVar)) {
                    return -1;
                }
            } else if (!j(mVar)) {
                return -1;
            }
        }
    }

    public void release() {
    }
}
