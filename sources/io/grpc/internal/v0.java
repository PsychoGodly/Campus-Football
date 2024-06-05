package io.grpc.internal;

import io.grpc.internal.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.t;

/* compiled from: Http2Ping */
public class v0 {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f35413g = Logger.getLogger(v0.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final long f35414a;

    /* renamed from: b  reason: collision with root package name */
    private final t f35415b;

    /* renamed from: c  reason: collision with root package name */
    private Map<s.a, Executor> f35416c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f35417d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f35418e;

    /* renamed from: f  reason: collision with root package name */
    private long f35419f;

    /* compiled from: Http2Ping */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.a f35420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f35421b;

        a(s.a aVar, long j10) {
            this.f35420a = aVar;
            this.f35421b = j10;
        }

        public void run() {
            this.f35420a.b(this.f35421b);
        }
    }

    /* compiled from: Http2Ping */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.a f35422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f35423b;

        b(s.a aVar, Throwable th) {
            this.f35422a = aVar;
            this.f35423b = th;
        }

        public void run() {
            this.f35422a.a(this.f35423b);
        }
    }

    public v0(long j10, t tVar) {
        this.f35414a = j10;
        this.f35415b = tVar;
    }

    private static Runnable b(s.a aVar, long j10) {
        return new a(aVar, j10);
    }

    private static Runnable c(s.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f35413g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void g(s.a aVar, Executor executor, Throwable th) {
        e(executor, c(aVar, th));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        e(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(io.grpc.internal.s.a r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f35417d     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x000c
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r2.f35416c     // Catch:{ all -> 0x0020 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x000c:
            java.lang.Throwable r0 = r2.f35418e     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0015
            java.lang.Runnable r3 = c(r3, r0)     // Catch:{ all -> 0x0020 }
            goto L_0x001b
        L_0x0015:
            long r0 = r2.f35419f     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r3 = b(r3, r0)     // Catch:{ all -> 0x0020 }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            e(r4, r3)
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.v0.a(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = r3.next();
        e((java.util.concurrent.Executor) r4.getValue(), b((io.grpc.internal.s.a) r4.getKey(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = r3.entrySet().iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f35417d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            return r0
        L_0x0008:
            r0 = 1
            r6.f35417d = r0     // Catch:{ all -> 0x0044 }
            r6.t r1 = r6.f35415b     // Catch:{ all -> 0x0044 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0044 }
            long r1 = r1.d(r2)     // Catch:{ all -> 0x0044 }
            r6.f35419f = r1     // Catch:{ all -> 0x0044 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r3 = r6.f35416c     // Catch:{ all -> 0x0044 }
            r4 = 0
            r6.f35416c = r4     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.Object r4 = r4.getKey()
            io.grpc.internal.s$a r4 = (io.grpc.internal.s.a) r4
            java.lang.Runnable r4 = b(r4, r1)
            e(r5, r4)
            goto L_0x0023
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.v0.d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r0.next();
        g((io.grpc.internal.s.a) r1.getKey(), (java.util.concurrent.Executor) r1.getValue(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r0.entrySet().iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.lang.Throwable r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f35417d     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0007:
            r0 = 1
            r3.f35417d = r0     // Catch:{ all -> 0x0037 }
            r3.f35418e = r4     // Catch:{ all -> 0x0037 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r3.f35416c     // Catch:{ all -> 0x0037 }
            r1 = 0
            r3.f35416c = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            io.grpc.internal.s$a r2 = (io.grpc.internal.s.a) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            g(r2, r1, r4)
            goto L_0x001a
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.v0.f(java.lang.Throwable):void");
    }

    public long h() {
        return this.f35414a;
    }
}
