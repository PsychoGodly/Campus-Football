package io.grpc.internal;

import io.grpc.internal.k;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import r6.o;

/* compiled from: ExponentialBackoffPolicy */
public final class e0 implements k {

    /* renamed from: a  reason: collision with root package name */
    private Random f34870a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private long f34871b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c  reason: collision with root package name */
    private long f34872c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d  reason: collision with root package name */
    private double f34873d = 1.6d;

    /* renamed from: e  reason: collision with root package name */
    private double f34874e = 0.2d;

    /* renamed from: f  reason: collision with root package name */
    private long f34875f = this.f34871b;

    /* compiled from: ExponentialBackoffPolicy */
    public static final class a implements k.a {
        public k get() {
            return new e0();
        }
    }

    private long b(double d10, double d11) {
        o.d(d11 >= d10);
        return (long) ((this.f34870a.nextDouble() * (d11 - d10)) + d10);
    }

    public long a() {
        long j10 = this.f34875f;
        double d10 = (double) j10;
        this.f34875f = Math.min((long) (this.f34873d * d10), this.f34872c);
        double d11 = this.f34874e;
        return j10 + b((-d11) * d10, d11 * d10);
    }
}
