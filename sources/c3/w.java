package c3;

import c3.i0;
import k4.a;
import k4.a0;
import k4.j0;
import k4.r;
import k4.z;
import n2.y2;
import s2.n;

/* compiled from: PesReader */
public final class w implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f5956a;

    /* renamed from: b  reason: collision with root package name */
    private final z f5957b = new z(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f5958c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f5959d;

    /* renamed from: e  reason: collision with root package name */
    private j0 f5960e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5961f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5962g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5963h;

    /* renamed from: i  reason: collision with root package name */
    private int f5964i;

    /* renamed from: j  reason: collision with root package name */
    private int f5965j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5966k;

    /* renamed from: l  reason: collision with root package name */
    private long f5967l;

    public w(m mVar) {
        this.f5956a = mVar;
    }

    private boolean d(a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f5959d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.U(min);
        } else {
            a0Var.l(bArr, this.f5959d, min);
        }
        int i11 = this.f5959d + min;
        this.f5959d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean e() {
        this.f5957b.p(0);
        int h10 = this.f5957b.h(24);
        if (h10 != 1) {
            r.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f5965j = -1;
            return false;
        }
        this.f5957b.r(8);
        int h11 = this.f5957b.h(16);
        this.f5957b.r(5);
        this.f5966k = this.f5957b.g();
        this.f5957b.r(2);
        this.f5961f = this.f5957b.g();
        this.f5962g = this.f5957b.g();
        this.f5957b.r(6);
        int h12 = this.f5957b.h(8);
        this.f5964i = h12;
        if (h11 == 0) {
            this.f5965j = -1;
        } else {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f5965j = i10;
            if (i10 < 0) {
                r.i("PesReader", "Found negative packet payload size: " + this.f5965j);
                this.f5965j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f5957b.p(0);
        this.f5967l = -9223372036854775807L;
        if (this.f5961f) {
            this.f5957b.r(4);
            this.f5957b.r(1);
            this.f5957b.r(1);
            long h10 = (((long) this.f5957b.h(3)) << 30) | ((long) (this.f5957b.h(15) << 15)) | ((long) this.f5957b.h(15));
            this.f5957b.r(1);
            if (!this.f5963h && this.f5962g) {
                this.f5957b.r(4);
                this.f5957b.r(1);
                this.f5957b.r(1);
                this.f5957b.r(1);
                this.f5960e.b((((long) this.f5957b.h(3)) << 30) | ((long) (this.f5957b.h(15) << 15)) | ((long) this.f5957b.h(15)));
                this.f5963h = true;
            }
            this.f5967l = this.f5960e.b(h10);
        }
    }

    private void g(int i10) {
        this.f5958c = i10;
        this.f5959d = 0;
    }

    public void a(j0 j0Var, n nVar, i0.d dVar) {
        this.f5960e = j0Var;
        this.f5956a.e(nVar, dVar);
    }

    public final void b() {
        this.f5958c = 0;
        this.f5959d = 0;
        this.f5963h = false;
        this.f5956a.b();
    }

    public final void c(a0 a0Var, int i10) throws y2 {
        a.h(this.f5960e);
        if ((i10 & 1) != 0) {
            int i11 = this.f5958c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    r.i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f5965j != -1) {
                        r.i("PesReader", "Unexpected start indicator: expected " + this.f5965j + " more bytes");
                    }
                    this.f5956a.d();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (a0Var.a() > 0) {
            int i12 = this.f5958c;
            if (i12 != 0) {
                int i13 = 0;
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (d(a0Var, this.f5957b.f19821a, Math.min(10, this.f5964i)) && d(a0Var, (byte[]) null, this.f5964i)) {
                            f();
                            if (this.f5966k) {
                                i13 = 4;
                            }
                            i10 |= i13;
                            this.f5956a.f(this.f5967l, i10);
                            g(3);
                        }
                    } else if (i12 == 3) {
                        int a10 = a0Var.a();
                        int i14 = this.f5965j;
                        if (i14 != -1) {
                            i13 = a10 - i14;
                        }
                        if (i13 > 0) {
                            a10 -= i13;
                            a0Var.S(a0Var.f() + a10);
                        }
                        this.f5956a.c(a0Var);
                        int i15 = this.f5965j;
                        if (i15 != -1) {
                            int i16 = i15 - a10;
                            this.f5965j = i16;
                            if (i16 == 0) {
                                this.f5956a.d();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(a0Var, this.f5957b.f19821a, 9)) {
                    if (e()) {
                        i13 = 2;
                    }
                    g(i13);
                }
            } else {
                a0Var.U(a0Var.a());
            }
        }
    }
}
