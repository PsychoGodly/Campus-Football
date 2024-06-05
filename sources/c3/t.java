package c3;

import c3.i0;
import k4.a;
import k4.a0;
import n2.r1;
import p2.h0;
import s2.e0;
import s2.n;

/* compiled from: MpegAudioReader */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f5936a;

    /* renamed from: b  reason: collision with root package name */
    private final h0.a f5937b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5938c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f5939d;

    /* renamed from: e  reason: collision with root package name */
    private String f5940e;

    /* renamed from: f  reason: collision with root package name */
    private int f5941f;

    /* renamed from: g  reason: collision with root package name */
    private int f5942g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5943h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5944i;

    /* renamed from: j  reason: collision with root package name */
    private long f5945j;

    /* renamed from: k  reason: collision with root package name */
    private int f5946k;

    /* renamed from: l  reason: collision with root package name */
    private long f5947l;

    public t() {
        this((String) null);
    }

    private void a(a0 a0Var) {
        byte[] e10 = a0Var.e();
        int g10 = a0Var.g();
        for (int f10 = a0Var.f(); f10 < g10; f10++) {
            boolean z10 = (e10[f10] & 255) == 255;
            boolean z11 = this.f5944i && (e10[f10] & 224) == 224;
            this.f5944i = z10;
            if (z11) {
                a0Var.T(f10 + 1);
                this.f5944i = false;
                this.f5936a.e()[1] = e10[f10];
                this.f5942g = 2;
                this.f5941f = 1;
                return;
            }
        }
        a0Var.T(g10);
    }

    private void g(a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f5946k - this.f5942g);
        this.f5939d.d(a0Var, min);
        int i10 = this.f5942g + min;
        this.f5942g = i10;
        int i11 = this.f5946k;
        if (i10 >= i11) {
            long j10 = this.f5947l;
            if (j10 != -9223372036854775807L) {
                this.f5939d.b(j10, 1, i11, 0, (e0.a) null);
                this.f5947l += this.f5945j;
            }
            this.f5942g = 0;
            this.f5941f = 0;
        }
    }

    private void h(a0 a0Var) {
        int min = Math.min(a0Var.a(), 4 - this.f5942g);
        a0Var.l(this.f5936a.e(), this.f5942g, min);
        int i10 = this.f5942g + min;
        this.f5942g = i10;
        if (i10 >= 4) {
            this.f5936a.T(0);
            if (!this.f5937b.a(this.f5936a.p())) {
                this.f5942g = 0;
                this.f5941f = 1;
                return;
            }
            h0.a aVar = this.f5937b;
            this.f5946k = aVar.f21279c;
            if (!this.f5943h) {
                this.f5945j = (((long) aVar.f21283g) * 1000000) / ((long) aVar.f21280d);
                this.f5939d.a(new r1.b().U(this.f5940e).g0(this.f5937b.f21278b).Y(4096).J(this.f5937b.f21281e).h0(this.f5937b.f21280d).X(this.f5938c).G());
                this.f5943h = true;
            }
            this.f5936a.T(0);
            this.f5939d.d(this.f5936a, 4);
            this.f5941f = 2;
        }
    }

    public void b() {
        this.f5941f = 0;
        this.f5942g = 0;
        this.f5944i = false;
        this.f5947l = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        a.h(this.f5939d);
        while (a0Var.a() > 0) {
            int i10 = this.f5941f;
            if (i10 == 0) {
                a(a0Var);
            } else if (i10 == 1) {
                h(a0Var);
            } else if (i10 == 2) {
                g(a0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5940e = dVar.b();
        this.f5939d = nVar.e(dVar.c(), 1);
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5947l = j10;
        }
    }

    public t(String str) {
        this.f5941f = 0;
        a0 a0Var = new a0(4);
        this.f5936a = a0Var;
        a0Var.e()[0] = -1;
        this.f5937b = new h0.a();
        this.f5947l = -9223372036854775807L;
        this.f5938c = str;
    }
}
