package c3;

import android.util.SparseArray;
import c3.i0;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import k4.j0;
import k4.z;
import n2.y2;
import s2.b0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: PsExtractor */
public final class a0 implements l {

    /* renamed from: l  reason: collision with root package name */
    public static final r f5613l = z.f5978b;

    /* renamed from: a  reason: collision with root package name */
    private final j0 f5614a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f5615b;

    /* renamed from: c  reason: collision with root package name */
    private final k4.a0 f5616c;

    /* renamed from: d  reason: collision with root package name */
    private final y f5617d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5618e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5619f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5620g;

    /* renamed from: h  reason: collision with root package name */
    private long f5621h;

    /* renamed from: i  reason: collision with root package name */
    private x f5622i;

    /* renamed from: j  reason: collision with root package name */
    private n f5623j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5624k;

    /* compiled from: PsExtractor */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m f5625a;

        /* renamed from: b  reason: collision with root package name */
        private final j0 f5626b;

        /* renamed from: c  reason: collision with root package name */
        private final z f5627c = new z(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f5628d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f5629e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5630f;

        /* renamed from: g  reason: collision with root package name */
        private int f5631g;

        /* renamed from: h  reason: collision with root package name */
        private long f5632h;

        public a(m mVar, j0 j0Var) {
            this.f5625a = mVar;
            this.f5626b = j0Var;
        }

        private void b() {
            this.f5627c.r(8);
            this.f5628d = this.f5627c.g();
            this.f5629e = this.f5627c.g();
            this.f5627c.r(6);
            this.f5631g = this.f5627c.h(8);
        }

        private void c() {
            this.f5632h = 0;
            if (this.f5628d) {
                this.f5627c.r(4);
                this.f5627c.r(1);
                this.f5627c.r(1);
                long h10 = (((long) this.f5627c.h(3)) << 30) | ((long) (this.f5627c.h(15) << 15)) | ((long) this.f5627c.h(15));
                this.f5627c.r(1);
                if (!this.f5630f && this.f5629e) {
                    this.f5627c.r(4);
                    this.f5627c.r(1);
                    this.f5627c.r(1);
                    this.f5627c.r(1);
                    this.f5626b.b((((long) this.f5627c.h(3)) << 30) | ((long) (this.f5627c.h(15) << 15)) | ((long) this.f5627c.h(15)));
                    this.f5630f = true;
                }
                this.f5632h = this.f5626b.b(h10);
            }
        }

        public void a(k4.a0 a0Var) throws y2 {
            a0Var.l(this.f5627c.f19821a, 0, 3);
            this.f5627c.p(0);
            b();
            a0Var.l(this.f5627c.f19821a, 0, this.f5631g);
            this.f5627c.p(0);
            c();
            this.f5625a.f(this.f5632h, 4);
            this.f5625a.c(a0Var);
            this.f5625a.d();
        }

        public void d() {
            this.f5630f = false;
            this.f5625a.b();
        }
    }

    public a0() {
        this(new j0(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] d() {
        return new l[]{new a0()};
    }

    private void f(long j10) {
        if (!this.f5624k) {
            this.f5624k = true;
            if (this.f5617d.c() != -9223372036854775807L) {
                x xVar = new x(this.f5617d.d(), this.f5617d.c(), j10);
                this.f5622i = xVar;
                this.f5623j.j(xVar.b());
                return;
            }
            this.f5623j.j(new b0.b(this.f5617d.c()));
        }
    }

    public void b(n nVar) {
        this.f5623j = nVar;
    }

    public void c(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f5614a.e() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f5614a.c();
            if (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            this.f5614a.g(j11);
        }
        x xVar = this.f5622i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f5615b.size(); i10++) {
            this.f5615b.valueAt(i10).d();
        }
    }

    public boolean e(m mVar) throws IOException {
        byte[] bArr = new byte[14];
        mVar.p(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        mVar.i(bArr[13] & 7);
        mVar.p(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        k4.a.h(this.f5623j);
        long b10 = mVar.b();
        int i10 = (b10 > -1 ? 1 : (b10 == -1 ? 0 : -1));
        if ((i10 != 0) && !this.f5617d.e()) {
            return this.f5617d.g(mVar, a0Var);
        }
        f(b10);
        x xVar = this.f5622i;
        if (xVar != null && xVar.d()) {
            return this.f5622i.c(mVar, a0Var);
        }
        mVar.l();
        long h10 = i10 != 0 ? b10 - mVar.h() : -1;
        if ((h10 != -1 && h10 < 4) || !mVar.g(this.f5616c.e(), 0, 4, true)) {
            return -1;
        }
        this.f5616c.T(0);
        int p10 = this.f5616c.p();
        if (p10 == 441) {
            return -1;
        }
        if (p10 == 442) {
            mVar.p(this.f5616c.e(), 0, 10);
            this.f5616c.T(9);
            mVar.m((this.f5616c.G() & 7) + 14);
            return 0;
        } else if (p10 == 443) {
            mVar.p(this.f5616c.e(), 0, 2);
            this.f5616c.T(0);
            mVar.m(this.f5616c.M() + 6);
            return 0;
        } else if (((p10 & -256) >> 8) != 1) {
            mVar.m(1);
            return 0;
        } else {
            int i11 = p10 & 255;
            a aVar = this.f5615b.get(i11);
            if (!this.f5618e) {
                if (aVar == null) {
                    m mVar2 = null;
                    if (i11 == 189) {
                        mVar2 = new c();
                        this.f5619f = true;
                        this.f5621h = mVar.c();
                    } else if ((i11 & 224) == 192) {
                        mVar2 = new t();
                        this.f5619f = true;
                        this.f5621h = mVar.c();
                    } else if ((i11 & 240) == 224) {
                        mVar2 = new n();
                        this.f5620g = true;
                        this.f5621h = mVar.c();
                    }
                    if (mVar2 != null) {
                        mVar2.e(this.f5623j, new i0.d(i11, 256));
                        aVar = new a(mVar2, this.f5614a);
                        this.f5615b.put(i11, aVar);
                    }
                }
                if (mVar.c() > ((!this.f5619f || !this.f5620g) ? 1048576 : this.f5621h + 8192)) {
                    this.f5618e = true;
                    this.f5623j.q();
                }
            }
            mVar.p(this.f5616c.e(), 0, 2);
            this.f5616c.T(0);
            int M = this.f5616c.M() + 6;
            if (aVar == null) {
                mVar.m(M);
            } else {
                this.f5616c.P(M);
                mVar.readFully(this.f5616c.e(), 0, M);
                this.f5616c.T(6);
                aVar.a(this.f5616c);
                k4.a0 a0Var2 = this.f5616c;
                a0Var2.S(a0Var2.b());
            }
            return 0;
        }
    }

    public void release() {
    }

    public a0(j0 j0Var) {
        this.f5614a = j0Var;
        this.f5616c = new k4.a0(4096);
        this.f5615b = new SparseArray<>();
        this.f5617d = new y();
    }
}
