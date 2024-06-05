package oe;

import oe.j;

/* compiled from: MonoTimeSource.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f36784a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final long f36785b = System.nanoTime();

    private h() {
    }

    private final long d() {
        return System.nanoTime() - f36785b;
    }

    public final long a(long j10, long j11) {
        return g.c(j10, j11);
    }

    public final long b(long j10) {
        return g.a(d(), j10);
    }

    public long c() {
        return j.a.e(d());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
