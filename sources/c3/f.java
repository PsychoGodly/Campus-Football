package c3;

import c3.i0;
import k4.a;
import k4.a0;
import k4.z;
import n2.r1;
import p2.c;
import s2.e0;
import s2.n;

/* compiled from: Ac4Reader */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final z f5666a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5667b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5668c;

    /* renamed from: d  reason: collision with root package name */
    private String f5669d;

    /* renamed from: e  reason: collision with root package name */
    private e0 f5670e;

    /* renamed from: f  reason: collision with root package name */
    private int f5671f;

    /* renamed from: g  reason: collision with root package name */
    private int f5672g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5673h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5674i;

    /* renamed from: j  reason: collision with root package name */
    private long f5675j;

    /* renamed from: k  reason: collision with root package name */
    private r1 f5676k;

    /* renamed from: l  reason: collision with root package name */
    private int f5677l;

    /* renamed from: m  reason: collision with root package name */
    private long f5678m;

    public f() {
        this((String) null);
    }

    private boolean a(a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f5672g);
        a0Var.l(bArr, this.f5672g, min);
        int i11 = this.f5672g + min;
        this.f5672g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f5666a.p(0);
        c.b d10 = c.d(this.f5666a);
        r1 r1Var = this.f5676k;
        if (r1Var == null || d10.f21151c != r1Var.f20667z || d10.f21150b != r1Var.A || !"audio/ac4".equals(r1Var.f20654m)) {
            r1 G = new r1.b().U(this.f5669d).g0("audio/ac4").J(d10.f21151c).h0(d10.f21150b).X(this.f5668c).G();
            this.f5676k = G;
            this.f5670e.a(G);
        }
        this.f5677l = d10.f21152d;
        this.f5675j = (((long) d10.f21153e) * 1000000) / ((long) this.f5676k.A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(k4.a0 r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f5673h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.G()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f5673h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.G()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f5673h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.f5674i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.f.h(k4.a0):boolean");
    }

    public void b() {
        this.f5671f = 0;
        this.f5672g = 0;
        this.f5673h = false;
        this.f5674i = false;
        this.f5678m = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        a.h(this.f5670e);
        while (a0Var.a() > 0) {
            int i10 = this.f5671f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f5677l - this.f5672g);
                        this.f5670e.d(a0Var, min);
                        int i11 = this.f5672g + min;
                        this.f5672g = i11;
                        int i12 = this.f5677l;
                        if (i11 == i12) {
                            long j10 = this.f5678m;
                            if (j10 != -9223372036854775807L) {
                                this.f5670e.b(j10, 1, i12, 0, (e0.a) null);
                                this.f5678m += this.f5675j;
                            }
                            this.f5671f = 0;
                        }
                    }
                } else if (a(a0Var, this.f5667b.e(), 16)) {
                    g();
                    this.f5667b.T(0);
                    this.f5670e.d(this.f5667b, 16);
                    this.f5671f = 2;
                }
            } else if (h(a0Var)) {
                this.f5671f = 1;
                this.f5667b.e()[0] = -84;
                this.f5667b.e()[1] = (byte) (this.f5674i ? 65 : 64);
                this.f5672g = 2;
            }
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5669d = dVar.b();
        this.f5670e = nVar.e(dVar.c(), 1);
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5678m = j10;
        }
    }

    public f(String str) {
        z zVar = new z(new byte[16]);
        this.f5666a = zVar;
        this.f5667b = new a0(zVar.f19821a);
        this.f5671f = 0;
        this.f5672g = 0;
        this.f5673h = false;
        this.f5674i = false;
        this.f5678m = -9223372036854775807L;
        this.f5668c = str;
    }
}
