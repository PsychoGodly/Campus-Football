package lf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout */
public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final t f36294d = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f36295a;

    /* renamed from: b  reason: collision with root package name */
    private long f36296b;

    /* renamed from: c  reason: collision with root package name */
    private long f36297c;

    /* compiled from: Timeout */
    class a extends t {
        a() {
        }

        public t d(long j10) {
            return this;
        }

        public void f() throws IOException {
        }

        public t g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a() {
        this.f36295a = false;
        return this;
    }

    public t b() {
        this.f36297c = 0;
        return this;
    }

    public long c() {
        if (this.f36295a) {
            return this.f36296b;
        }
        throw new IllegalStateException("No deadline");
    }

    public t d(long j10) {
        this.f36295a = true;
        this.f36296b = j10;
        return this;
    }

    public boolean e() {
        return this.f36295a;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f36295a && this.f36296b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public t g(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j10);
        } else if (timeUnit != null) {
            this.f36297c = timeUnit.toNanos(j10);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long h() {
        return this.f36297c;
    }
}
