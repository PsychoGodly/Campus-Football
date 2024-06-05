package com.applovin.impl.sdk;

import android.content.Intent;
import com.applovin.impl.h8;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: f  reason: collision with root package name */
    private static final long f11472f = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a  reason: collision with root package name */
    private final k f11473a;

    /* renamed from: b  reason: collision with root package name */
    private final t f11474b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet f11475c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final Object f11476d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a  reason: collision with other inner class name */
    public interface C0136a {
        void onAdExpired(h8 h8Var);
    }

    public a(k kVar) {
        this.f11473a = kVar;
        this.f11474b = kVar.L();
    }

    private b b(h8 h8Var) {
        synchronized (this.f11476d) {
            if (h8Var == null) {
                return null;
            }
            Iterator it = this.f11475c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (h8Var == bVar.b()) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public void a(h8 h8Var) {
        synchronized (this.f11476d) {
            b b10 = b(h8Var);
            if (b10 != null) {
                if (t.a()) {
                    t tVar = this.f11474b;
                    tVar.a("AdExpirationManager", "Cancelling expiration timer for ad: " + h8Var);
                }
                b10.a();
                a(b10);
            }
        }
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f11476d) {
            Iterator it = this.f11475c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                h8 b10 = bVar.b();
                if (b10 == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = b10.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (t.a()) {
                            t tVar = this.f11474b;
                            tVar.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b10);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (t.a()) {
                            t tVar2 = this.f11474b;
                            tVar2.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b10);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.applovin.impl.h8 r9, com.applovin.impl.sdk.a.C0136a r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f11476d
            monitor-enter(r0)
            com.applovin.impl.sdk.b r1 = r8.b(r9)     // Catch:{ all -> 0x00b6 }
            r2 = 1
            if (r1 == 0) goto L_0x002a
            boolean r10 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00b6 }
            if (r10 == 0) goto L_0x0028
            com.applovin.impl.sdk.t r10 = r8.f11474b     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "AdExpirationManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r3.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "Ad expiration already scheduled for ad: "
            r3.append(r4)     // Catch:{ all -> 0x00b6 }
            r3.append(r9)     // Catch:{ all -> 0x00b6 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x00b6 }
            r10.a((java.lang.String) r1, (java.lang.String) r9)     // Catch:{ all -> 0x00b6 }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r2
        L_0x002a:
            long r3 = r9.getTimeToLiveMillis()     // Catch:{ all -> 0x00b6 }
            long r5 = f11472f     // Catch:{ all -> 0x00b6 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0058
            boolean r10 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00b6 }
            if (r10 == 0) goto L_0x0052
            com.applovin.impl.sdk.t r10 = r8.f11474b     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "AdExpirationManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r2.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "Ad has already expired: "
            r2.append(r3)     // Catch:{ all -> 0x00b6 }
            r2.append(r9)     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b6 }
            r10.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x00b6 }
        L_0x0052:
            r9.setExpired()     // Catch:{ all -> 0x00b6 }
            r9 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r9
        L_0x0058:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x008d
            com.applovin.impl.sdk.t r1 = r8.f11474b     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "AdExpirationManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r4.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r5 = "Scheduling ad expiration "
            r4.append(r5)     // Catch:{ all -> 0x00b6 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00b6 }
            long r6 = r9.getTimeToLiveMillis()     // Catch:{ all -> 0x00b6 }
            long r5 = r5.toSeconds(r6)     // Catch:{ all -> 0x00b6 }
            r4.append(r5)     // Catch:{ all -> 0x00b6 }
            java.lang.String r5 = " seconds from now for "
            r4.append(r5)     // Catch:{ all -> 0x00b6 }
            r4.append(r9)     // Catch:{ all -> 0x00b6 }
            java.lang.String r5 = "..."
            r4.append(r5)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b6 }
            r1.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00b6 }
        L_0x008d:
            java.util.HashSet r1 = r8.f11475c     // Catch:{ all -> 0x00b6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x00a9
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "com.applovin.application_paused"
            r1.<init>(r3)     // Catch:{ all -> 0x00b6 }
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(r8, r1)     // Catch:{ all -> 0x00b6 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "com.applovin.application_resumed"
            r1.<init>(r3)     // Catch:{ all -> 0x00b6 }
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(r8, r1)     // Catch:{ all -> 0x00b6 }
        L_0x00a9:
            com.applovin.impl.sdk.k r1 = r8.f11473a     // Catch:{ all -> 0x00b6 }
            com.applovin.impl.sdk.b r9 = com.applovin.impl.sdk.b.a(r9, r10, r1)     // Catch:{ all -> 0x00b6 }
            java.util.HashSet r10 = r8.f11475c     // Catch:{ all -> 0x00b6 }
            r10.add(r9)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r2
        L_0x00b6:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.a.a(com.applovin.impl.h8, com.applovin.impl.sdk.a$a):boolean");
    }

    public void a(b bVar) {
        synchronized (this.f11476d) {
            this.f11475c.remove(bVar);
            if (this.f11475c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.f11476d) {
            Iterator it = this.f11475c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
