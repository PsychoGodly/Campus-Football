package pe;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ThreadPoolDispatcher.kt */
public final class d3 {
    public static final s1 b(int i10, String str) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            return u1.c(Executors.newScheduledThreadPool(i10, new c3(i10, str, new AtomicInteger())));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i10 + " specified").toString());
    }

    /* access modifiers changed from: private */
    public static final Thread c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    public static final s1 d(String str) {
        return b(1, str);
    }
}
