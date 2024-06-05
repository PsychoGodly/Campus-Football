package d3;

import k4.n0;
import s2.b0;
import s2.c0;

/* compiled from: WavSeekMap */
final class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final c f17698a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17699b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17700c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17701d;

    /* renamed from: e  reason: collision with root package name */
    private final long f17702e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f17698a = cVar;
        this.f17699b = i10;
        this.f17700c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f17693e);
        this.f17701d = j12;
        this.f17702e = b(j12);
    }

    private long b(long j10) {
        return n0.O0(j10 * ((long) this.f17699b), 1000000, (long) this.f17698a.f17691c);
    }

    public boolean f() {
        return true;
    }

    public b0.a h(long j10) {
        long r10 = n0.r((((long) this.f17698a.f17691c) * j10) / (((long) this.f17699b) * 1000000), 0, this.f17701d - 1);
        long j11 = this.f17700c + (((long) this.f17698a.f17693e) * r10);
        long b10 = b(r10);
        c0 c0Var = new c0(b10, j11);
        if (b10 >= j10 || r10 == this.f17701d - 1) {
            return new b0.a(c0Var);
        }
        long j12 = r10 + 1;
        return new b0.a(c0Var, new c0(b(j12), this.f17700c + (((long) this.f17698a.f17693e) * j12)));
    }

    public long i() {
        return this.f17702e;
    }
}
