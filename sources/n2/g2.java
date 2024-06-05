package n2;

import k4.a;
import k4.n0;
import p3.x;

/* compiled from: MediaPeriodInfo */
final class g2 {

    /* renamed from: a  reason: collision with root package name */
    public final x.b f20388a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20389b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20390c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20391d;

    /* renamed from: e  reason: collision with root package name */
    public final long f20392e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20393f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f20394g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f20395h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f20396i;

    g2(x.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = z10;
        boolean z15 = z11;
        boolean z16 = z12;
        boolean z17 = z13;
        boolean z18 = false;
        a.a(!z17 || z15);
        a.a(!z16 || z15);
        if (!z14 || (!z15 && !z16 && !z17)) {
            z18 = true;
        }
        a.a(z18);
        this.f20388a = bVar;
        this.f20389b = j10;
        this.f20390c = j11;
        this.f20391d = j12;
        this.f20392e = j13;
        this.f20393f = z14;
        this.f20394g = z15;
        this.f20395h = z16;
        this.f20396i = z17;
    }

    public g2 a(long j10) {
        if (j10 == this.f20390c) {
            return this;
        }
        return new g2(this.f20388a, this.f20389b, j10, this.f20391d, this.f20392e, this.f20393f, this.f20394g, this.f20395h, this.f20396i);
    }

    public g2 b(long j10) {
        if (j10 == this.f20389b) {
            return this;
        }
        return new g2(this.f20388a, j10, this.f20390c, this.f20391d, this.f20392e, this.f20393f, this.f20394g, this.f20395h, this.f20396i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        if (this.f20389b == g2Var.f20389b && this.f20390c == g2Var.f20390c && this.f20391d == g2Var.f20391d && this.f20392e == g2Var.f20392e && this.f20393f == g2Var.f20393f && this.f20394g == g2Var.f20394g && this.f20395h == g2Var.f20395h && this.f20396i == g2Var.f20396i && n0.c(this.f20388a, g2Var.f20388a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f20388a.hashCode()) * 31) + ((int) this.f20389b)) * 31) + ((int) this.f20390c)) * 31) + ((int) this.f20391d)) * 31) + ((int) this.f20392e)) * 31) + (this.f20393f ? 1 : 0)) * 31) + (this.f20394g ? 1 : 0)) * 31) + (this.f20395h ? 1 : 0)) * 31) + (this.f20396i ? 1 : 0);
    }
}
