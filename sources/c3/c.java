package c3;

import c3.i0;
import com.applovin.exoplayer2.common.base.Ascii;
import k4.a;
import k4.a0;
import k4.n0;
import k4.z;
import n2.r1;
import p2.b;
import s2.e0;
import s2.n;

/* compiled from: Ac3Reader */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final z f5637a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5638b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5639c;

    /* renamed from: d  reason: collision with root package name */
    private String f5640d;

    /* renamed from: e  reason: collision with root package name */
    private e0 f5641e;

    /* renamed from: f  reason: collision with root package name */
    private int f5642f;

    /* renamed from: g  reason: collision with root package name */
    private int f5643g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5644h;

    /* renamed from: i  reason: collision with root package name */
    private long f5645i;

    /* renamed from: j  reason: collision with root package name */
    private r1 f5646j;

    /* renamed from: k  reason: collision with root package name */
    private int f5647k;

    /* renamed from: l  reason: collision with root package name */
    private long f5648l;

    public c() {
        this((String) null);
    }

    private boolean a(a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f5643g);
        a0Var.l(bArr, this.f5643g, min);
        int i11 = this.f5643g + min;
        this.f5643g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f5637a.p(0);
        b.C0222b f10 = b.f(this.f5637a);
        r1 r1Var = this.f5646j;
        if (r1Var == null || f10.f21144d != r1Var.f20667z || f10.f21143c != r1Var.A || !n0.c(f10.f21141a, r1Var.f20654m)) {
            r1.b b02 = new r1.b().U(this.f5640d).g0(f10.f21141a).J(f10.f21144d).h0(f10.f21143c).X(this.f5639c).b0(f10.f21147g);
            if ("audio/ac3".equals(f10.f21141a)) {
                b02.I(f10.f21147g);
            }
            r1 G = b02.G();
            this.f5646j = G;
            this.f5641e.a(G);
        }
        this.f5647k = f10.f21145e;
        this.f5645i = (((long) f10.f21146f) * 1000000) / ((long) this.f5646j.A);
    }

    private boolean h(a0 a0Var) {
        while (true) {
            boolean z10 = false;
            if (a0Var.a() <= 0) {
                return false;
            }
            if (!this.f5644h) {
                if (a0Var.G() == 11) {
                    z10 = true;
                }
                this.f5644h = z10;
            } else {
                int G = a0Var.G();
                if (G == 119) {
                    this.f5644h = false;
                    return true;
                }
                if (G == 11) {
                    z10 = true;
                }
                this.f5644h = z10;
            }
        }
    }

    public void b() {
        this.f5642f = 0;
        this.f5643g = 0;
        this.f5644h = false;
        this.f5648l = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        a.h(this.f5641e);
        while (a0Var.a() > 0) {
            int i10 = this.f5642f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f5647k - this.f5643g);
                        this.f5641e.d(a0Var, min);
                        int i11 = this.f5643g + min;
                        this.f5643g = i11;
                        int i12 = this.f5647k;
                        if (i11 == i12) {
                            long j10 = this.f5648l;
                            if (j10 != -9223372036854775807L) {
                                this.f5641e.b(j10, 1, i12, 0, (e0.a) null);
                                this.f5648l += this.f5645i;
                            }
                            this.f5642f = 0;
                        }
                    }
                } else if (a(a0Var, this.f5638b.e(), 128)) {
                    g();
                    this.f5638b.T(0);
                    this.f5641e.d(this.f5638b, 128);
                    this.f5642f = 2;
                }
            } else if (h(a0Var)) {
                this.f5642f = 1;
                this.f5638b.e()[0] = Ascii.VT;
                this.f5638b.e()[1] = 119;
                this.f5643g = 2;
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5640d = dVar.b();
        this.f5641e = nVar.e(dVar.c(), 1);
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5648l = j10;
        }
    }

    public c(String str) {
        z zVar = new z(new byte[128]);
        this.f5637a = zVar;
        this.f5638b = new a0(zVar.f19821a);
        this.f5642f = 0;
        this.f5648l = -9223372036854775807L;
        this.f5639c = str;
    }
}
