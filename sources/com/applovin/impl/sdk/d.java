package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.ho;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private ho f11568a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f11569b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f11570c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private boolean f11571d;

    /* renamed from: f  reason: collision with root package name */
    private final k f11572f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference f11573g;

    /* renamed from: h  reason: collision with root package name */
    private long f11574h;

    public interface a {
        void onAdRefresh();
    }

    public d(k kVar, a aVar) {
        this.f11573g = new WeakReference(aVar);
        this.f11572f = kVar;
    }

    private void e() {
        if (((Boolean) this.f11572f.a(qe.X6)).booleanValue()) {
            k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r4 = this;
            com.applovin.impl.sdk.k r0 = r4.f11572f
            com.applovin.impl.oj r1 = com.applovin.impl.qe.X6
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r4.f11569b
            monitor-enter(r0)
            boolean r1 = r4.f11571d     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0031
            com.applovin.impl.sdk.k r1 = r4.f11572f     // Catch:{ all -> 0x0060 }
            r1.L()     // Catch:{ all -> 0x0060 }
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x002f
            com.applovin.impl.sdk.k r1 = r4.f11572f     // Catch:{ all -> 0x0060 }
            com.applovin.impl.sdk.t r1 = r1.L()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0060 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0031:
            com.applovin.impl.sdk.k r1 = r4.f11572f     // Catch:{ all -> 0x0060 }
            com.applovin.impl.sdk.SessionTracker r1 = r1.f0()     // Catch:{ all -> 0x0060 }
            boolean r1 = r1.isApplicationPaused()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0057
            com.applovin.impl.sdk.k r1 = r4.f11572f     // Catch:{ all -> 0x0060 }
            r1.L()     // Catch:{ all -> 0x0060 }
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0055
            com.applovin.impl.sdk.k r1 = r4.f11572f     // Catch:{ all -> 0x0060 }
            com.applovin.impl.sdk.t r1 = r1.L()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the application to enter foreground to resume the timer."
            r1.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0060 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0057:
            com.applovin.impl.ho r1 = r4.f11568a     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005e
            r1.e()     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0063
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.d.f():void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f11573g.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f11569b) {
            ho hoVar = this.f11568a;
            if (hoVar != null) {
                hoVar.d();
            } else {
                this.f11572f.L();
                if (t.a()) {
                    this.f11572f.L().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f11570c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.f11569b) {
            this.f11568a = null;
            if (!((Boolean) this.f11572f.a(qe.Y6)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.f11569b) {
            ho hoVar = this.f11568a;
            if (hoVar != null) {
                hoVar.e();
            } else {
                this.f11570c.set(false);
            }
        }
    }

    public void a(long j10) {
        synchronized (this.f11569b) {
            a();
            this.f11574h = j10;
            this.f11568a = ho.a(j10, this.f11572f, new e0(this));
            if (!((Boolean) this.f11572f.a(qe.Y6)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f11572f.a(qe.X6)).booleanValue() && (this.f11572f.E().c() || this.f11572f.f0().isApplicationPaused())) {
                this.f11568a.d();
            }
            if (this.f11570c.compareAndSet(true, false) && ((Boolean) this.f11572f.a(qe.Z6)).booleanValue()) {
                this.f11572f.L();
                if (t.a()) {
                    this.f11572f.L().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f11568a.d();
            }
        }
    }

    public long b() {
        long c10;
        synchronized (this.f11569b) {
            ho hoVar = this.f11568a;
            c10 = hoVar != null ? hoVar.c() : -1;
        }
        return c10;
    }

    public void c() {
        if (((Boolean) this.f11572f.a(qe.W6)).booleanValue()) {
            k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r0 = (com.applovin.impl.sdk.d.a) r8.f11573g.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r0.onAdRefresh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r8 = this;
            com.applovin.impl.sdk.k r0 = r8.f11572f
            com.applovin.impl.oj r1 = com.applovin.impl.qe.W6
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r8.f11569b
            monitor-enter(r0)
            boolean r1 = r8.f11571d     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0031
            com.applovin.impl.sdk.k r1 = r8.f11572f     // Catch:{ all -> 0x0096 }
            r1.L()     // Catch:{ all -> 0x0096 }
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x002f
            com.applovin.impl.sdk.k r1 = r8.f11572f     // Catch:{ all -> 0x0096 }
            com.applovin.impl.sdk.t r1 = r1.L()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0096 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0031:
            com.applovin.impl.sdk.k r1 = r8.f11572f     // Catch:{ all -> 0x0096 }
            com.applovin.impl.sdk.q r1 = r1.E()     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0057
            com.applovin.impl.sdk.k r1 = r8.f11572f     // Catch:{ all -> 0x0096 }
            r1.L()     // Catch:{ all -> 0x0096 }
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0055
            com.applovin.impl.sdk.k r1 = r8.f11572f     // Catch:{ all -> 0x0096 }
            com.applovin.impl.sdk.t r1 = r1.L()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the full screen ad to be dismissed to resume the timer."
            r1.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0096 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0057:
            com.applovin.impl.ho r1 = r8.f11568a     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0084
            long r1 = r8.f11574h     // Catch:{ all -> 0x0096 }
            long r3 = r8.b()     // Catch:{ all -> 0x0096 }
            long r1 = r1 - r3
            com.applovin.impl.sdk.k r3 = r8.f11572f     // Catch:{ all -> 0x0096 }
            com.applovin.impl.oj r4 = com.applovin.impl.qe.V6     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)     // Catch:{ all -> 0x0096 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0096 }
            long r3 = r3.longValue()     // Catch:{ all -> 0x0096 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x007f
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x007f
            r8.a()     // Catch:{ all -> 0x0096 }
            r1 = 1
            goto L_0x0085
        L_0x007f:
            com.applovin.impl.ho r1 = r8.f11568a     // Catch:{ all -> 0x0096 }
            r1.e()     // Catch:{ all -> 0x0096 }
        L_0x0084:
            r1 = 0
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0099
            java.lang.ref.WeakReference r0 = r8.f11573g
            java.lang.Object r0 = r0.get()
            com.applovin.impl.sdk.d$a r0 = (com.applovin.impl.sdk.d.a) r0
            if (r0 == 0) goto L_0x0099
            r0.onAdRefresh()
            goto L_0x0099
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r1
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.d.d():void");
    }

    public boolean g() {
        return this.f11571d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f11569b) {
            z10 = this.f11568a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f11569b) {
            k();
            this.f11571d = true;
        }
    }

    public void m() {
        synchronized (this.f11569b) {
            n();
            this.f11571d = false;
        }
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.f11569b) {
            ho hoVar = this.f11568a;
            if (hoVar != null) {
                hoVar.a();
                l();
            }
        }
    }
}
