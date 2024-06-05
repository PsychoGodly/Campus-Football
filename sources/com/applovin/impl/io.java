package com.applovin.impl;

public final class io {

    /* renamed from: a  reason: collision with root package name */
    private long f8573a;

    /* renamed from: b  reason: collision with root package name */
    private long f8574b;

    /* renamed from: c  reason: collision with root package name */
    private long f8575c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal f8576d = new ThreadLocal();

    public io(long j10) {
        d(j10);
    }

    public static long e(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f8574b == -9223372036854775807L) {
            long j11 = this.f8573a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) a1.a((Object) (Long) this.f8576d.get())).longValue();
            }
            this.f8574b = j11 - j10;
            notifyAll();
        }
        this.f8575c = j10;
        return j10 + this.f8574b;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f8575c;
        if (j11 != -9223372036854775807L) {
            long e10 = e(j11);
            long j12 = (4294967296L + e10) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - e10) < Math.abs(j10 - e10)) {
                j10 = j13;
            }
        }
        return a(c(j10));
    }

    public synchronized long c() {
        return this.f8574b;
    }

    public synchronized void d(long j10) {
        this.f8573a = j10;
        this.f8574b = j10 == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f8575c = -9223372036854775807L;
    }

    public static long c(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public synchronized long b() {
        long j10;
        long j11 = this.f8575c;
        if (j11 != -9223372036854775807L) {
            j10 = j11 + this.f8574b;
        } else {
            j10 = a();
        }
        return j10;
    }

    public synchronized long a() {
        long j10;
        j10 = this.f8573a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }
}
