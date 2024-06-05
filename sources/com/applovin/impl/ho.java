package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.Timer;
import java.util.TimerTask;

public class ho {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f8336a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Timer f8337b;

    /* renamed from: c  reason: collision with root package name */
    private long f8338c;

    /* renamed from: d  reason: collision with root package name */
    private long f8339d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f8340e;

    /* renamed from: f  reason: collision with root package name */
    private long f8341f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f8342g = new Object();

    class a extends TimerTask {
        a() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                r0 = 0
                com.applovin.impl.ho r1 = com.applovin.impl.ho.this     // Catch:{ all -> 0x001b }
                java.lang.Runnable r1 = r1.f8340e     // Catch:{ all -> 0x001b }
                r1.run()     // Catch:{ all -> 0x001b }
                com.applovin.impl.ho r1 = com.applovin.impl.ho.this
                java.lang.Object r1 = r1.f8342g
                monitor-enter(r1)
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0018 }
                java.util.Timer unused = r2.f8337b = r0     // Catch:{ all -> 0x0018 }
                monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                goto L_0x0062
            L_0x0018:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                throw r0
            L_0x001b:
                r1 = move-exception
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0066 }
                com.applovin.impl.sdk.k r2 = r2.f8336a     // Catch:{ all -> 0x0066 }
                if (r2 == 0) goto L_0x0055
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0066 }
                com.applovin.impl.sdk.k r2 = r2.f8336a     // Catch:{ all -> 0x0066 }
                r2.L()     // Catch:{ all -> 0x0066 }
                boolean r2 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0066 }
                if (r2 == 0) goto L_0x0044
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0066 }
                com.applovin.impl.sdk.k r2 = r2.f8336a     // Catch:{ all -> 0x0066 }
                com.applovin.impl.sdk.t r2 = r2.L()     // Catch:{ all -> 0x0066 }
                java.lang.String r3 = "Timer"
                java.lang.String r4 = "Encountered error while executing timed task"
                r2.a(r3, r4, r1)     // Catch:{ all -> 0x0066 }
            L_0x0044:
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0066 }
                com.applovin.impl.sdk.k r2 = r2.f8336a     // Catch:{ all -> 0x0066 }
                com.applovin.impl.sdk.o r2 = r2.B()     // Catch:{ all -> 0x0066 }
                java.lang.String r3 = "Timer"
                java.lang.String r4 = "executingTimedTask"
                r2.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0066 }
            L_0x0055:
                com.applovin.impl.ho r1 = com.applovin.impl.ho.this
                java.lang.Object r1 = r1.f8342g
                monitor-enter(r1)
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0063 }
                java.util.Timer unused = r2.f8337b = r0     // Catch:{ all -> 0x0063 }
                monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            L_0x0062:
                return
            L_0x0063:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0063 }
                throw r0
            L_0x0066:
                r1 = move-exception
                com.applovin.impl.ho r2 = com.applovin.impl.ho.this
                java.lang.Object r2 = r2.f8342g
                monitor-enter(r2)
                com.applovin.impl.ho r3 = com.applovin.impl.ho.this     // Catch:{ all -> 0x0075 }
                java.util.Timer unused = r3.f8337b = r0     // Catch:{ all -> 0x0075 }
                monitor-exit(r2)     // Catch:{ all -> 0x0075 }
                throw r1
            L_0x0075:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0075 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ho.a.run():void");
        }
    }

    private ho(k kVar, Runnable runnable) {
        this.f8336a = kVar;
        this.f8340e = runnable;
    }

    /* JADX INFO: finally extract failed */
    public void d() {
        synchronized (this.f8342g) {
            Timer timer = this.f8337b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8341f = Math.max(1, System.currentTimeMillis() - this.f8338c);
                    this.f8337b = null;
                } catch (Throwable th) {
                    this.f8337b = null;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void e() {
        synchronized (this.f8342g) {
            long j10 = this.f8341f;
            if (j10 > 0) {
                try {
                    long j11 = this.f8339d - j10;
                    this.f8339d = j11;
                    if (j11 < 0) {
                        this.f8339d = 0;
                    }
                    Timer timer = new Timer();
                    this.f8337b = timer;
                    timer.schedule(b(), this.f8339d);
                    this.f8338c = System.currentTimeMillis();
                    this.f8341f = 0;
                } catch (Throwable th) {
                    this.f8341f = 0;
                    throw th;
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public long c() {
        if (this.f8337b == null) {
            return this.f8339d - this.f8341f;
        }
        return this.f8339d - (System.currentTimeMillis() - this.f8338c);
    }

    public void a() {
        synchronized (this.f8342g) {
            Timer timer = this.f8337b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8337b = null;
                } catch (Throwable th) {
                    this.f8337b = null;
                    this.f8341f = 0;
                    throw th;
                }
                this.f8341f = 0;
            }
        }
    }

    public static ho a(long j10, k kVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        } else if (runnable != null) {
            ho hoVar = new ho(kVar, runnable);
            hoVar.f8338c = System.currentTimeMillis();
            hoVar.f8339d = j10;
            try {
                Timer timer = new Timer();
                hoVar.f8337b = timer;
                timer.schedule(hoVar.b(), j10);
            } catch (OutOfMemoryError e10) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("Timer", "Failed to create timer due to OOM error", e10);
                }
            }
            return hoVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }
}
