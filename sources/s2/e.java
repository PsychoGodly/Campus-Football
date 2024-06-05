package s2;

import s2.b0;

/* compiled from: ConstantBitrateSeekMap */
public class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f22392a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22393b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22394c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22395d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22396e;

    /* renamed from: f  reason: collision with root package name */
    private final long f22397f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f22398g;

    public e(long j10, long j11, int i10, int i11, boolean z10) {
        this.f22392a = j10;
        this.f22393b = j11;
        this.f22394c = i11 == -1 ? 1 : i11;
        this.f22396e = i10;
        this.f22398g = z10;
        if (j10 == -1) {
            this.f22395d = -1;
            this.f22397f = -9223372036854775807L;
            return;
        }
        this.f22395d = j10 - j11;
        this.f22397f = e(j10, j11, i10);
    }

    private long b(long j10) {
        int i10 = this.f22394c;
        long j11 = (((j10 * ((long) this.f22396e)) / 8000000) / ((long) i10)) * ((long) i10);
        long j12 = this.f22395d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - ((long) i10));
        }
        return this.f22393b + Math.max(j11, 0);
    }

    private static long e(long j10, long j11, int i10) {
        return ((Math.max(0, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public long c(long j10) {
        return e(j10, this.f22393b, this.f22396e);
    }

    public boolean f() {
        return this.f22395d != -1 || this.f22398g;
    }

    public b0.a h(long j10) {
        if (this.f22395d == -1 && !this.f22398g) {
            return new b0.a(new c0(0, this.f22393b));
        }
        long b10 = b(j10);
        long c10 = c(b10);
        c0 c0Var = new c0(c10, b10);
        if (this.f22395d != -1 && c10 < j10) {
            int i10 = this.f22394c;
            if (((long) i10) + b10 < this.f22392a) {
                long j11 = b10 + ((long) i10);
                return new b0.a(c0Var, new c0(c(j11), j11));
            }
        }
        return new b0.a(c0Var);
    }

    public long i() {
        return this.f22397f;
    }
}
