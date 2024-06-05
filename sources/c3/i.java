package c3;

import c3.i0;
import java.util.Arrays;
import java.util.Collections;
import k4.a;
import k4.a0;
import k4.n0;
import k4.r;
import k4.z;
import n2.r1;
import n2.y2;
import p2.a;
import s2.e0;
import s2.k;
import s2.n;

/* compiled from: AdtsReader */
public final class i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f5730v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5731a;

    /* renamed from: b  reason: collision with root package name */
    private final z f5732b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f5733c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5734d;

    /* renamed from: e  reason: collision with root package name */
    private String f5735e;

    /* renamed from: f  reason: collision with root package name */
    private e0 f5736f;

    /* renamed from: g  reason: collision with root package name */
    private e0 f5737g;

    /* renamed from: h  reason: collision with root package name */
    private int f5738h;

    /* renamed from: i  reason: collision with root package name */
    private int f5739i;

    /* renamed from: j  reason: collision with root package name */
    private int f5740j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5741k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5742l;

    /* renamed from: m  reason: collision with root package name */
    private int f5743m;

    /* renamed from: n  reason: collision with root package name */
    private int f5744n;

    /* renamed from: o  reason: collision with root package name */
    private int f5745o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5746p;

    /* renamed from: q  reason: collision with root package name */
    private long f5747q;

    /* renamed from: r  reason: collision with root package name */
    private int f5748r;

    /* renamed from: s  reason: collision with root package name */
    private long f5749s;

    /* renamed from: t  reason: collision with root package name */
    private e0 f5750t;

    /* renamed from: u  reason: collision with root package name */
    private long f5751u;

    public i(boolean z10) {
        this(z10, (String) null);
    }

    private void a() {
        a.e(this.f5736f);
        n0.j(this.f5750t);
        n0.j(this.f5737g);
    }

    private void g(a0 a0Var) {
        if (a0Var.a() != 0) {
            this.f5732b.f19821a[0] = a0Var.e()[a0Var.f()];
            this.f5732b.p(2);
            int h10 = this.f5732b.h(4);
            int i10 = this.f5744n;
            if (i10 == -1 || h10 == i10) {
                if (!this.f5742l) {
                    this.f5742l = true;
                    this.f5743m = this.f5745o;
                    this.f5744n = h10;
                }
                t();
                return;
            }
            q();
        }
    }

    private boolean h(a0 a0Var, int i10) {
        a0Var.T(i10 + 1);
        if (!w(a0Var, this.f5732b.f19821a, 1)) {
            return false;
        }
        this.f5732b.p(4);
        int h10 = this.f5732b.h(1);
        int i11 = this.f5743m;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f5744n != -1) {
            if (!w(a0Var, this.f5732b.f19821a, 1)) {
                return true;
            }
            this.f5732b.p(2);
            if (this.f5732b.h(4) != this.f5744n) {
                return false;
            }
            a0Var.T(i10 + 2);
        }
        if (!w(a0Var, this.f5732b.f19821a, 4)) {
            return true;
        }
        this.f5732b.p(14);
        int h11 = this.f5732b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] e10 = a0Var.e();
        int g10 = a0Var.g();
        int i12 = i10 + h11;
        if (i12 >= g10) {
            return true;
        }
        if (e10[i12] == -1) {
            int i13 = i12 + 1;
            if (i13 == g10) {
                return true;
            }
            if (!l((byte) -1, e10[i13]) || ((e10[i13] & 8) >> 3) != h10) {
                return false;
            }
            return true;
        } else if (e10[i12] != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == g10) {
                return true;
            }
            if (e10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            if (i15 == g10 || e10[i15] == 51) {
                return true;
            }
            return false;
        }
    }

    private boolean i(a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f5739i);
        a0Var.l(bArr, this.f5739i, min);
        int i11 = this.f5739i + min;
        this.f5739i = i11;
        return i11 == i10;
    }

    private void j(a0 a0Var) {
        byte[] e10 = a0Var.e();
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        while (f10 < g10) {
            int i10 = f10 + 1;
            byte b10 = e10[f10] & 255;
            if (this.f5740j != 512 || !l((byte) -1, (byte) b10) || (!this.f5742l && !h(a0Var, i10 - 2))) {
                int i11 = this.f5740j;
                byte b11 = b10 | i11;
                if (b11 == 329) {
                    this.f5740j = 768;
                } else if (b11 == 511) {
                    this.f5740j = 512;
                } else if (b11 == 836) {
                    this.f5740j = 1024;
                } else if (b11 == 1075) {
                    u();
                    a0Var.T(i10);
                    return;
                } else if (i11 != 256) {
                    this.f5740j = 256;
                    i10--;
                }
                f10 = i10;
            } else {
                this.f5745o = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f5741k = z10;
                if (!this.f5742l) {
                    r();
                } else {
                    t();
                }
                a0Var.T(i10);
                return;
            }
        }
        a0Var.T(f10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() throws y2 {
        this.f5732b.p(0);
        if (!this.f5746p) {
            int h10 = this.f5732b.h(2) + 1;
            if (h10 != 2) {
                r.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
                h10 = 2;
            }
            this.f5732b.r(5);
            byte[] b10 = p2.a.b(h10, this.f5744n, this.f5732b.h(3));
            a.b f10 = p2.a.f(b10);
            r1 G = new r1.b().U(this.f5735e).g0("audio/mp4a-latm").K(f10.f21132c).J(f10.f21131b).h0(f10.f21130a).V(Collections.singletonList(b10)).X(this.f5734d).G();
            this.f5747q = 1024000000 / ((long) G.A);
            this.f5736f.a(G);
            this.f5746p = true;
        } else {
            this.f5732b.r(10);
        }
        this.f5732b.r(4);
        int h11 = (this.f5732b.h(13) - 2) - 5;
        if (this.f5741k) {
            h11 -= 2;
        }
        v(this.f5736f, this.f5747q, 0, h11);
    }

    private void o() {
        this.f5737g.d(this.f5733c, 10);
        this.f5733c.T(6);
        v(this.f5737g, 0, 10, this.f5733c.F() + 10);
    }

    private void p(a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f5748r - this.f5739i);
        this.f5750t.d(a0Var, min);
        int i10 = this.f5739i + min;
        this.f5739i = i10;
        int i11 = this.f5748r;
        if (i10 == i11) {
            long j10 = this.f5749s;
            if (j10 != -9223372036854775807L) {
                this.f5750t.b(j10, 1, i11, 0, (e0.a) null);
                this.f5749s += this.f5751u;
            }
            s();
        }
    }

    private void q() {
        this.f5742l = false;
        s();
    }

    private void r() {
        this.f5738h = 1;
        this.f5739i = 0;
    }

    private void s() {
        this.f5738h = 0;
        this.f5739i = 0;
        this.f5740j = 256;
    }

    private void t() {
        this.f5738h = 3;
        this.f5739i = 0;
    }

    private void u() {
        this.f5738h = 2;
        this.f5739i = f5730v.length;
        this.f5748r = 0;
        this.f5733c.T(0);
    }

    private void v(e0 e0Var, long j10, int i10, int i11) {
        this.f5738h = 4;
        this.f5739i = i10;
        this.f5750t = e0Var;
        this.f5751u = j10;
        this.f5748r = i11;
    }

    private boolean w(a0 a0Var, byte[] bArr, int i10) {
        if (a0Var.a() < i10) {
            return false;
        }
        a0Var.l(bArr, 0, i10);
        return true;
    }

    public void b() {
        this.f5749s = -9223372036854775807L;
        q();
    }

    public void c(a0 a0Var) throws y2 {
        a();
        while (a0Var.a() > 0) {
            int i10 = this.f5738h;
            if (i10 == 0) {
                j(a0Var);
            } else if (i10 == 1) {
                g(a0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(a0Var, this.f5732b.f19821a, this.f5741k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 == 4) {
                    p(a0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(a0Var, this.f5733c.e(), 10)) {
                o();
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5735e = dVar.b();
        e0 e10 = nVar.e(dVar.c(), 1);
        this.f5736f = e10;
        this.f5750t = e10;
        if (this.f5731a) {
            dVar.a();
            e0 e11 = nVar.e(dVar.c(), 5);
            this.f5737g = e11;
            e11.a(new r1.b().U(dVar.b()).g0("application/id3").G());
            return;
        }
        this.f5737g = new k();
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5749s = j10;
        }
    }

    public long k() {
        return this.f5747q;
    }

    public i(boolean z10, String str) {
        this.f5732b = new z(new byte[7]);
        this.f5733c = new a0(Arrays.copyOf(f5730v, 10));
        s();
        this.f5743m = -1;
        this.f5744n = -1;
        this.f5747q = -9223372036854775807L;
        this.f5749s = -9223372036854775807L;
        this.f5731a = z10;
        this.f5734d = str;
    }
}
