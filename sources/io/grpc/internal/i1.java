package io.grpc.internal;

import dd.u0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: ManagedChannelOrphanWrapper */
final class i1 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    private static final ReferenceQueue<i1> f35092c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<a, a> f35093d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f35094e = Logger.getLogger(i1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final a f35095b;

    /* compiled from: ManagedChannelOrphanWrapper */
    static final class a extends WeakReference<i1> {

        /* renamed from: f  reason: collision with root package name */
        private static final boolean f35096f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g  reason: collision with root package name */
        private static final RuntimeException f35097g = e();

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<i1> f35098a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<a, a> f35099b;

        /* renamed from: c  reason: collision with root package name */
        private final String f35100c;

        /* renamed from: d  reason: collision with root package name */
        private final Reference<RuntimeException> f35101d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicBoolean f35102e = new AtomicBoolean();

        a(i1 i1Var, u0 u0Var, ReferenceQueue<i1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(i1Var, referenceQueue);
            RuntimeException runtimeException;
            if (f35096f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f35097g;
            }
            this.f35101d = new SoftReference(runtimeException);
            this.f35100c = u0Var.toString();
            this.f35098a = referenceQueue;
            this.f35099b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue<i1> referenceQueue) {
            int i10 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i10;
                }
                RuntimeException runtimeException = aVar.f35101d.get();
                aVar.c();
                if (!aVar.f35102e.get()) {
                    i10++;
                    Level level = Level.SEVERE;
                    if (i1.f35094e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(i1.f35094e.getName());
                        logRecord.setParameters(new Object[]{aVar.f35100c});
                        logRecord.setThrown(runtimeException);
                        i1.f35094e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f35099b.remove(this);
            this.f35101d.clear();
        }

        /* access modifiers changed from: private */
        public void d() {
            if (!this.f35102e.getAndSet(true)) {
                clear();
            }
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        public void clear() {
            c();
            b(this.f35098a);
        }
    }

    i1(u0 u0Var) {
        this(u0Var, f35092c, f35093d);
    }

    public u0 m() {
        this.f35095b.d();
        return super.m();
    }

    public u0 n() {
        this.f35095b.d();
        return super.n();
    }

    i1(u0 u0Var, ReferenceQueue<i1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(u0Var);
        this.f35095b = new a(this, u0Var, referenceQueue, concurrentMap);
    }
}
