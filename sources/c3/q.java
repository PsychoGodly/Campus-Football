package c3;

import c3.i0;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;
import k4.a0;
import k4.e;
import k4.n0;
import k4.w;
import n2.r1;
import s2.e0;
import s2.n;

/* compiled from: H265Reader */
public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f5882a;

    /* renamed from: b  reason: collision with root package name */
    private String f5883b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f5884c;

    /* renamed from: d  reason: collision with root package name */
    private a f5885d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5886e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f5887f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f5888g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f5889h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f5890i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f5891j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f5892k = new u(40, 128);

    /* renamed from: l  reason: collision with root package name */
    private long f5893l;

    /* renamed from: m  reason: collision with root package name */
    private long f5894m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f5895n = new a0();

    /* compiled from: H265Reader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e0 f5896a;

        /* renamed from: b  reason: collision with root package name */
        private long f5897b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5898c;

        /* renamed from: d  reason: collision with root package name */
        private int f5899d;

        /* renamed from: e  reason: collision with root package name */
        private long f5900e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5901f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f5902g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f5903h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f5904i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f5905j;

        /* renamed from: k  reason: collision with root package name */
        private long f5906k;

        /* renamed from: l  reason: collision with root package name */
        private long f5907l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5908m;

        public a(e0 e0Var) {
            this.f5896a = e0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f5907l;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f5908m;
                this.f5896a.b(j10, z10 ? 1 : 0, (int) (this.f5897b - this.f5906k), i10, (e0.a) null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f5905j && this.f5902g) {
                this.f5908m = this.f5898c;
                this.f5905j = false;
            } else if (this.f5903h || this.f5902g) {
                if (z10 && this.f5904i) {
                    d(i10 + ((int) (j10 - this.f5897b)));
                }
                this.f5906k = this.f5897b;
                this.f5907l = this.f5900e;
                this.f5908m = this.f5898c;
                this.f5904i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f5901f) {
                int i12 = this.f5899d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f5902g = (bArr[i13] & 128) != 0;
                    this.f5901f = false;
                    return;
                }
                this.f5899d = i12 + (i11 - i10);
            }
        }

        public void f() {
            this.f5901f = false;
            this.f5902g = false;
            this.f5903h = false;
            this.f5904i = false;
            this.f5905j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f5902g = false;
            this.f5903h = false;
            this.f5900e = j11;
            this.f5899d = 0;
            this.f5897b = j10;
            if (!c(i11)) {
                if (this.f5904i && !this.f5905j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f5904i = false;
                }
                if (b(i11)) {
                    this.f5903h = !this.f5905j;
                    this.f5905j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f5898c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f5901f = z11;
        }
    }

    public q(d0 d0Var) {
        this.f5882a = d0Var;
    }

    private void a() {
        k4.a.h(this.f5884c);
        n0.j(this.f5885d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f5885d.a(j10, i10, this.f5886e);
        if (!this.f5886e) {
            this.f5888g.b(i11);
            this.f5889h.b(i11);
            this.f5890i.b(i11);
            if (this.f5888g.c() && this.f5889h.c() && this.f5890i.c()) {
                this.f5884c.a(i(this.f5883b, this.f5888g, this.f5889h, this.f5890i));
                this.f5886e = true;
            }
        }
        if (this.f5891j.b(i11)) {
            u uVar = this.f5891j;
            this.f5895n.R(this.f5891j.f5951d, w.q(uVar.f5951d, uVar.f5952e));
            this.f5895n.U(5);
            this.f5882a.a(j11, this.f5895n);
        }
        if (this.f5892k.b(i11)) {
            u uVar2 = this.f5892k;
            this.f5895n.R(this.f5892k.f5951d, w.q(uVar2.f5951d, uVar2.f5952e));
            this.f5895n.U(5);
            this.f5882a.a(j11, this.f5895n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f5885d.e(bArr, i10, i11);
        if (!this.f5886e) {
            this.f5888g.a(bArr, i10, i11);
            this.f5889h.a(bArr, i10, i11);
            this.f5890i.a(bArr, i10, i11);
        }
        this.f5891j.a(bArr, i10, i11);
        this.f5892k.a(bArr, i10, i11);
    }

    private static r1 i(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f5952e;
        byte[] bArr = new byte[(uVar2.f5952e + i10 + uVar3.f5952e)];
        System.arraycopy(uVar.f5951d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f5951d, 0, bArr, uVar.f5952e, uVar2.f5952e);
        System.arraycopy(uVar3.f5951d, 0, bArr, uVar.f5952e + uVar2.f5952e, uVar3.f5952e);
        w.a h10 = w.h(uVar2.f5951d, 3, uVar2.f5952e);
        return new r1.b().U(str).g0(MimeTypes.VIDEO_H265).K(e.c(h10.f19784a, h10.f19785b, h10.f19786c, h10.f19787d, h10.f19788e, h10.f19789f)).n0(h10.f19791h).S(h10.f19792i).c0(h10.f19793j).V(Collections.singletonList(bArr)).G();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f5885d.g(j10, i10, i11, j11, this.f5886e);
        if (!this.f5886e) {
            this.f5888g.e(i11);
            this.f5889h.e(i11);
            this.f5890i.e(i11);
        }
        this.f5891j.e(i11);
        this.f5892k.e(i11);
    }

    public void b() {
        this.f5893l = 0;
        this.f5894m = -9223372036854775807L;
        w.a(this.f5887f);
        this.f5888g.d();
        this.f5889h.d();
        this.f5890i.d();
        this.f5891j.d();
        this.f5892k.d();
        a aVar = this.f5885d;
        if (aVar != null) {
            aVar.f();
        }
    }

    public void c(a0 a0Var) {
        a();
        while (a0Var.a() > 0) {
            int f10 = a0Var.f();
            int g10 = a0Var.g();
            byte[] e10 = a0Var.e();
            this.f5893l += (long) a0Var.a();
            this.f5884c.d(a0Var, a0Var.a());
            while (true) {
                if (f10 < g10) {
                    int c10 = w.c(e10, f10, g10, this.f5887f);
                    if (c10 == g10) {
                        h(e10, f10, g10);
                        return;
                    }
                    int e11 = w.e(e10, c10);
                    int i10 = c10 - f10;
                    if (i10 > 0) {
                        h(e10, f10, c10);
                    }
                    int i11 = g10 - c10;
                    long j10 = this.f5893l - ((long) i11);
                    int i12 = i10 < 0 ? -i10 : 0;
                    long j11 = j10;
                    int i13 = i11;
                    g(j11, i13, i12, this.f5894m);
                    j(j11, i13, e11, this.f5894m);
                    f10 = c10 + 3;
                }
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5883b = dVar.b();
        e0 e10 = nVar.e(dVar.c(), 2);
        this.f5884c = e10;
        this.f5885d = new a(e10);
        this.f5882a.b(nVar, dVar);
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5894m = j10;
        }
    }
}
