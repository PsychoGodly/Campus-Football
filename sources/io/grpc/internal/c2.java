package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: SerializeReentrantCallsDirectExecutor */
class c2 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f34848c = Logger.getLogger(c2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private boolean f34849a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayDeque<Runnable> f34850b;

    c2() {
    }

    private void a() {
        while (true) {
            Runnable poll = this.f34850b.poll();
            if (poll != null) {
                try {
                    poll.run();
                } catch (Throwable th) {
                    Logger logger = f34848c;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + poll, th);
                }
            } else {
                return;
            }
        }
    }

    private void b(Runnable runnable) {
        if (this.f34850b == null) {
            this.f34850b = new ArrayDeque<>(4);
        }
        this.f34850b.add(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r6.f34850b == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r6.f34850b != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r6.f34849a = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "'task' must not be null."
            r6.o.p(r7, r0)
            boolean r0 = r6.f34849a
            if (r0 != 0) goto L_0x0043
            r0 = 1
            r6.f34849a = r0
            r0 = 0
            r7.run()     // Catch:{ all -> 0x001a }
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f34850b
            if (r7 == 0) goto L_0x0017
        L_0x0014:
            r6.a()
        L_0x0017:
            r6.f34849a = r0
            goto L_0x0046
        L_0x001a:
            r1 = move-exception
            java.util.logging.Logger r2 = f34848c     // Catch:{ all -> 0x0038 }
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r4.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch:{ all -> 0x0038 }
            r4.append(r7)     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0038 }
            r2.log(r3, r7, r1)     // Catch:{ all -> 0x0038 }
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f34850b
            if (r7 == 0) goto L_0x0017
            goto L_0x0014
        L_0x0038:
            r7 = move-exception
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.f34850b
            if (r1 == 0) goto L_0x0040
            r6.a()
        L_0x0040:
            r6.f34849a = r0
            throw r7
        L_0x0043:
            r6.b(r7)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c2.execute(java.lang.Runnable):void");
    }
}
