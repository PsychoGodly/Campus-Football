package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;

/* compiled from: AtomicBackoff */
public final class h {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f35057c = Logger.getLogger(h.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f35058a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f35059b;

    /* compiled from: AtomicBackoff */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f35060a;

        public void a() {
            long j10 = this.f35060a;
            long max = Math.max(2 * j10, j10);
            if (h.this.f35059b.compareAndSet(this.f35060a, max)) {
                h.f35057c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{h.this.f35058a, Long.valueOf(max)});
            }
        }

        public long b() {
            return this.f35060a;
        }

        private b(long j10) {
            this.f35060a = j10;
        }
    }

    public h(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f35059b = atomicLong;
        o.e(j10 > 0, "value must be positive");
        this.f35058a = str;
        atomicLong.set(j10);
    }

    public b d() {
        return new b(this.f35059b.get());
    }
}
