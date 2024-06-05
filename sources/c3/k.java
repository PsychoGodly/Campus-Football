package c3;

import c3.i0;
import k4.a;
import k4.a0;
import n2.r1;
import r2.m;
import s2.e0;
import s2.n;

/* compiled from: DtsReader */
public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f5766a = new a0(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    private final String f5767b;

    /* renamed from: c  reason: collision with root package name */
    private String f5768c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f5769d;

    /* renamed from: e  reason: collision with root package name */
    private int f5770e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f5771f;

    /* renamed from: g  reason: collision with root package name */
    private int f5772g;

    /* renamed from: h  reason: collision with root package name */
    private long f5773h;

    /* renamed from: i  reason: collision with root package name */
    private r1 f5774i;

    /* renamed from: j  reason: collision with root package name */
    private int f5775j;

    /* renamed from: k  reason: collision with root package name */
    private long f5776k = -9223372036854775807L;

    public k(String str) {
        this.f5767b = str;
    }

    private boolean a(a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f5771f);
        a0Var.l(bArr, this.f5771f, min);
        int i11 = this.f5771f + min;
        this.f5771f = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] e10 = this.f5766a.e();
        if (this.f5774i == null) {
            r1 g10 = p2.e0.g(e10, this.f5768c, this.f5767b, (m) null);
            this.f5774i = g10;
            this.f5769d.a(g10);
        }
        this.f5775j = p2.e0.a(e10);
        this.f5773h = (long) ((int) ((((long) p2.e0.f(e10)) * 1000000) / ((long) this.f5774i.A)));
    }

    private boolean h(a0 a0Var) {
        while (a0Var.a() > 0) {
            int i10 = this.f5772g << 8;
            this.f5772g = i10;
            int G = i10 | a0Var.G();
            this.f5772g = G;
            if (p2.e0.d(G)) {
                byte[] e10 = this.f5766a.e();
                int i11 = this.f5772g;
                e10[0] = (byte) ((i11 >> 24) & 255);
                e10[1] = (byte) ((i11 >> 16) & 255);
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                this.f5771f = 4;
                this.f5772g = 0;
                return true;
            }
        }
        return false;
    }

    public void b() {
        this.f5770e = 0;
        this.f5771f = 0;
        this.f5772g = 0;
        this.f5776k = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        a.h(this.f5769d);
        while (a0Var.a() > 0) {
            int i10 = this.f5770e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f5775j - this.f5771f);
                        this.f5769d.d(a0Var, min);
                        int i11 = this.f5771f + min;
                        this.f5771f = i11;
                        int i12 = this.f5775j;
                        if (i11 == i12) {
                            long j10 = this.f5776k;
                            if (j10 != -9223372036854775807L) {
                                this.f5769d.b(j10, 1, i12, 0, (e0.a) null);
                                this.f5776k += this.f5773h;
                            }
                            this.f5770e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(a0Var, this.f5766a.e(), 18)) {
                    g();
                    this.f5766a.T(0);
                    this.f5769d.d(this.f5766a, 18);
                    this.f5770e = 2;
                }
            } else if (h(a0Var)) {
                this.f5770e = 1;
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5768c = dVar.b();
        this.f5769d = nVar.e(dVar.c(), 1);
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5776k = j10;
        }
    }
}
