package c3;

import c3.i0;
import java.util.Collections;
import k4.a0;
import k4.z;
import n2.r1;
import n2.y2;
import p2.a;
import s2.e0;
import s2.n;

/* compiled from: LatmReader */
public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f5915a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5916b;

    /* renamed from: c  reason: collision with root package name */
    private final z f5917c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f5918d;

    /* renamed from: e  reason: collision with root package name */
    private String f5919e;

    /* renamed from: f  reason: collision with root package name */
    private r1 f5920f;

    /* renamed from: g  reason: collision with root package name */
    private int f5921g;

    /* renamed from: h  reason: collision with root package name */
    private int f5922h;

    /* renamed from: i  reason: collision with root package name */
    private int f5923i;

    /* renamed from: j  reason: collision with root package name */
    private int f5924j;

    /* renamed from: k  reason: collision with root package name */
    private long f5925k = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5926l;

    /* renamed from: m  reason: collision with root package name */
    private int f5927m;

    /* renamed from: n  reason: collision with root package name */
    private int f5928n;

    /* renamed from: o  reason: collision with root package name */
    private int f5929o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5930p;

    /* renamed from: q  reason: collision with root package name */
    private long f5931q;

    /* renamed from: r  reason: collision with root package name */
    private int f5932r;

    /* renamed from: s  reason: collision with root package name */
    private long f5933s;

    /* renamed from: t  reason: collision with root package name */
    private int f5934t;

    /* renamed from: u  reason: collision with root package name */
    private String f5935u;

    public s(String str) {
        this.f5915a = str;
        a0 a0Var = new a0(1024);
        this.f5916b = a0Var;
        this.f5917c = new z(a0Var.e());
    }

    private static long a(z zVar) {
        return (long) zVar.h((zVar.h(2) + 1) * 8);
    }

    private void g(z zVar) throws y2 {
        if (!zVar.g()) {
            this.f5926l = true;
            l(zVar);
        } else if (!this.f5926l) {
            return;
        }
        if (this.f5927m != 0) {
            throw y2.a((String) null, (Throwable) null);
        } else if (this.f5928n == 0) {
            k(zVar, j(zVar));
            if (this.f5930p) {
                zVar.r((int) this.f5931q);
            }
        } else {
            throw y2.a((String) null, (Throwable) null);
        }
    }

    private int h(z zVar) throws y2 {
        int b10 = zVar.b();
        a.b e10 = a.e(zVar, true);
        this.f5935u = e10.f21132c;
        this.f5932r = e10.f21130a;
        this.f5934t = e10.f21131b;
        return b10 - zVar.b();
    }

    private void i(z zVar) {
        int h10 = zVar.h(3);
        this.f5929o = h10;
        if (h10 == 0) {
            zVar.r(8);
        } else if (h10 == 1) {
            zVar.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            zVar.r(6);
        } else if (h10 == 6 || h10 == 7) {
            zVar.r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int j(z zVar) throws y2 {
        int h10;
        if (this.f5929o == 0) {
            int i10 = 0;
            do {
                h10 = zVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw y2.a((String) null, (Throwable) null);
    }

    private void k(z zVar, int i10) {
        int e10 = zVar.e();
        if ((e10 & 7) == 0) {
            this.f5916b.T(e10 >> 3);
        } else {
            zVar.i(this.f5916b.e(), 0, i10 * 8);
            this.f5916b.T(0);
        }
        this.f5918d.d(this.f5916b, i10);
        long j10 = this.f5925k;
        if (j10 != -9223372036854775807L) {
            this.f5918d.b(j10, 1, i10, 0, (e0.a) null);
            this.f5925k += this.f5933s;
        }
    }

    private void l(z zVar) throws y2 {
        boolean g10;
        int h10 = zVar.h(1);
        int h11 = h10 == 1 ? zVar.h(1) : 0;
        this.f5927m = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                a(zVar);
            }
            if (zVar.g()) {
                this.f5928n = zVar.h(6);
                int h12 = zVar.h(4);
                int h13 = zVar.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e10 = zVar.e();
                        int h14 = h(zVar);
                        zVar.p(e10);
                        byte[] bArr = new byte[((h14 + 7) / 8)];
                        zVar.i(bArr, 0, h14);
                        r1 G = new r1.b().U(this.f5919e).g0("audio/mp4a-latm").K(this.f5935u).J(this.f5934t).h0(this.f5932r).V(Collections.singletonList(bArr)).X(this.f5915a).G();
                        if (!G.equals(this.f5920f)) {
                            this.f5920f = G;
                            this.f5933s = 1024000000 / ((long) G.A);
                            this.f5918d.a(G);
                        }
                    } else {
                        zVar.r(((int) a(zVar)) - h(zVar));
                    }
                    i(zVar);
                    boolean g11 = zVar.g();
                    this.f5930p = g11;
                    this.f5931q = 0;
                    if (g11) {
                        if (h10 == 1) {
                            this.f5931q = a(zVar);
                        } else {
                            do {
                                g10 = zVar.g();
                                this.f5931q = (this.f5931q << 8) + ((long) zVar.h(8));
                            } while (g10);
                        }
                    }
                    if (zVar.g()) {
                        zVar.r(8);
                        return;
                    }
                    return;
                }
                throw y2.a((String) null, (Throwable) null);
            }
            throw y2.a((String) null, (Throwable) null);
        }
        throw y2.a((String) null, (Throwable) null);
    }

    private void m(int i10) {
        this.f5916b.P(i10);
        this.f5917c.n(this.f5916b.e());
    }

    public void b() {
        this.f5921g = 0;
        this.f5925k = -9223372036854775807L;
        this.f5926l = false;
    }

    public void c(a0 a0Var) throws y2 {
        k4.a.h(this.f5918d);
        while (a0Var.a() > 0) {
            int i10 = this.f5921g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int G = a0Var.G();
                    if ((G & 224) == 224) {
                        this.f5924j = G;
                        this.f5921g = 2;
                    } else if (G != 86) {
                        this.f5921g = 0;
                    }
                } else if (i10 == 2) {
                    int G2 = ((this.f5924j & -225) << 8) | a0Var.G();
                    this.f5923i = G2;
                    if (G2 > this.f5916b.e().length) {
                        m(this.f5923i);
                    }
                    this.f5922h = 0;
                    this.f5921g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(a0Var.a(), this.f5923i - this.f5922h);
                    a0Var.l(this.f5917c.f19821a, this.f5922h, min);
                    int i11 = this.f5922h + min;
                    this.f5922h = i11;
                    if (i11 == this.f5923i) {
                        this.f5917c.p(0);
                        g(this.f5917c);
                        this.f5921g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (a0Var.G() == 86) {
                this.f5921g = 1;
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5918d = nVar.e(dVar.c(), 1);
        this.f5919e = dVar.b();
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5925k = j10;
        }
    }
}
