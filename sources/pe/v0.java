package pe;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.m;
import pe.n1;
import xd.g;

/* compiled from: DefaultExecutor.kt */
public final class v0 extends n1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i  reason: collision with root package name */
    public static final v0 f37406i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f37407j;

    static {
        Long l10;
        v0 v0Var = new v0();
        f37406i = v0Var;
        m1.h1(v0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f37407j = timeUnit.toNanos(l10.longValue());
    }

    private v0() {
    }

    private final synchronized void D1() {
        if (G1()) {
            debugStatus = 3;
            x1();
            m.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread E1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean F1() {
        return debugStatus == 4;
    }

    private final boolean G1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean H1() {
        if (G1()) {
            return false;
        }
        debugStatus = 1;
        m.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void I1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public i1 C0(long j10, Runnable runnable, g gVar) {
        return A1(j10, runnable);
    }

    /* access modifiers changed from: protected */
    public Thread n1() {
        Thread thread = _thread;
        return thread == null ? E1() : thread;
    }

    /* access modifiers changed from: protected */
    public void o1(long j10, n1.c cVar) {
        I1();
    }

    public void run() {
        b3.f37276a.d(this);
        c.a();
        try {
            if (H1()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long k12 = k1();
                    if (k12 == Long.MAX_VALUE) {
                        c.a();
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f37407j + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            D1();
                            c.a();
                            if (!v1()) {
                                n1();
                                return;
                            }
                            return;
                        }
                        k12 = i.d(k12, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (k12 > 0) {
                        if (G1()) {
                            _thread = null;
                            D1();
                            c.a();
                            if (!v1()) {
                                n1();
                                return;
                            }
                            return;
                        }
                        c.a();
                        LockSupport.parkNanos(this, k12);
                    }
                }
            }
        } finally {
            _thread = null;
            D1();
            c.a();
            if (!v1()) {
                n1();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public void t1(Runnable runnable) {
        if (F1()) {
            I1();
        }
        super.t1(runnable);
    }
}
