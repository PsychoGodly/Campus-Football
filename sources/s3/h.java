package s3;

import s2.d;
import t3.i;

/* compiled from: DashWrappingSegmentIndex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f22495a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22496b;

    public h(d dVar, long j10) {
        this.f22495a = dVar;
        this.f22496b = j10;
    }

    public long a(long j10) {
        return this.f22495a.f22390e[(int) j10] - this.f22496b;
    }

    public long b(long j10, long j11) {
        return this.f22495a.f22389d[(int) j10];
    }

    public long c(long j10, long j11) {
        return 0;
    }

    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    public i e(long j10) {
        d dVar = this.f22495a;
        int i10 = (int) j10;
        return new i((String) null, dVar.f22388c[i10], (long) dVar.f22387b[i10]);
    }

    public long f(long j10, long j11) {
        return (long) this.f22495a.b(j10 + this.f22496b);
    }

    public boolean g() {
        return true;
    }

    public long h() {
        return 0;
    }

    public long i(long j10) {
        return (long) this.f22495a.f22386a;
    }

    public long j(long j10, long j11) {
        return (long) this.f22495a.f22386a;
    }
}
