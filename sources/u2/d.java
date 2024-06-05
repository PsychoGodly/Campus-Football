package u2;

import k4.a0;
import k4.n0;
import k4.r;

/* compiled from: AviStreamHeaderChunk */
final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f22818a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22819b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22820c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22821d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22822e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22823f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f22818a = i10;
        this.f22819b = i11;
        this.f22820c = i12;
        this.f22821d = i13;
        this.f22822e = i14;
        this.f22823f = i15;
    }

    public static d c(a0 a0Var) {
        int t10 = a0Var.t();
        a0Var.U(12);
        int t11 = a0Var.t();
        int t12 = a0Var.t();
        int t13 = a0Var.t();
        a0Var.U(4);
        int t14 = a0Var.t();
        int t15 = a0Var.t();
        a0Var.U(8);
        return new d(t10, t11, t12, t13, t14, t15);
    }

    public long a() {
        return n0.O0((long) this.f22822e, ((long) this.f22820c) * 1000000, (long) this.f22821d);
    }

    public int b() {
        int i10 = this.f22818a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        r.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f22818a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
