package x2;

import k4.a;
import s2.m;
import s2.w;

/* compiled from: StartOffsetExtractorInput */
final class c extends w {

    /* renamed from: b  reason: collision with root package name */
    private final long f23612b;

    public c(m mVar, long j10) {
        super(mVar);
        a.a(mVar.c() >= j10);
        this.f23612b = j10;
    }

    public long b() {
        return super.b() - this.f23612b;
    }

    public long c() {
        return super.c() - this.f23612b;
    }

    public long h() {
        return super.h() - this.f23612b;
    }
}
