package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f11916a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f11917b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11918c;

    /* renamed from: d  reason: collision with root package name */
    private final c f11919d;

    /* renamed from: f  reason: collision with root package name */
    private final Object f11920f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final List f11921g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f11922h;

    /* renamed from: i  reason: collision with root package name */
    private final List f11923i;

    class a implements AppLovinPostbackListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11924a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f11925b;

        a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f11924a = dVar;
            this.f11925b = appLovinPostbackListener;
        }

        public void onPostbackFailure(String str, int i10) {
            t unused = b.this.f11917b;
            if (t.a()) {
                t a10 = b.this.f11917b;
                a10.d("PersistentPostbackManager", "Failed to submit postback: " + this.f11924a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f11924a);
            bc.a(this.f11925b, str, i10);
            if (this.f11924a.c() == 1) {
                b.this.f11916a.B().a("dispatchPostback", str, i10);
            }
        }

        public void onPostbackSuccess(String str) {
            b.this.a(this.f11924a);
            t unused = b.this.f11917b;
            if (t.a()) {
                t a10 = b.this.f11917b;
                a10.a("PersistentPostbackManager", "Successfully submit postback: " + this.f11924a);
            }
            b.this.c();
            bc.a(this.f11925b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f11921g = arrayList;
        this.f11922h = new HashSet();
        this.f11923i = new ArrayList();
        if (kVar != null) {
            this.f11916a = kVar;
            this.f11917b = kVar.L();
            int intValue = ((Integer) kVar.a(oj.W2)).intValue();
            this.f11918c = intValue;
            if (((Boolean) kVar.a(oj.Z2)).booleanValue()) {
                c cVar = new c(this, kVar);
                this.f11919d = cVar;
                if (!zp.a(oj.f10361n1, kVar) || !zp.h()) {
                    arrayList.addAll(cVar.a(intValue));
                } else {
                    a((Runnable) new f(this), true, true);
                }
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                return;
            }
            this.f11919d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        synchronized (this.f11920f) {
            this.f11921g.addAll(0, this.f11919d.a(this.f11918c));
        }
    }

    /* access modifiers changed from: protected */
    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f11920f) {
            if (((Boolean) this.f11916a.a(oj.Y2)).booleanValue()) {
                arrayList.ensureCapacity(this.f11923i.size());
                arrayList.addAll(this.f11923i);
            } else {
                arrayList.ensureCapacity(this.f11921g.size());
                arrayList.addAll(this.f11921g);
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    public void onReceive(Intent intent, Map map) {
        this.f11916a.l0().a((xl) this.f11919d, sm.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f11920f) {
            while (this.f11921g.size() > this.f11918c) {
                this.f11921g.remove(0);
            }
            this.f11921g.add(dVar);
        }
        if (t.a()) {
            t tVar = this.f11917b;
            tVar.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f11920f) {
            Iterator it = new ArrayList(this.f11921g).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f11920f) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z10, AppLovinPostbackListener appLovinPostbackListener) {
        if (!TextUtils.isEmpty(dVar.k())) {
            if (z10) {
                dVar.a();
            }
            a((Runnable) new h(this, dVar, appLovinPostbackListener), zp.h(), dVar.m());
        } else if (t.a()) {
            this.f11917b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
        }
    }

    public void b() {
        a((Runnable) new g(this), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* access modifiers changed from: private */
    public void c() {
        synchronized (this.f11920f) {
            for (d b10 : this.f11923i) {
                b(b10);
            }
            this.f11923i.clear();
        }
    }

    /* access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f11920f) {
            this.f11922h.remove(dVar);
            this.f11923i.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f11920f) {
            this.f11921g.clear();
            this.f11923i.clear();
        }
        this.f11916a.l0().a((xl) this.f11919d, sm.b.OTHER);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        r0 = (java.lang.Integer) r4.f11916a.a(com.applovin.impl.oj.V2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (r5.c() <= r0.intValue()) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (com.applovin.impl.sdk.t.a() == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r6 = r4.f11917b;
        r6.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + r0 + ". Dequeuing postback: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        r1 = r4.f11920f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.f11922h.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (r5.j() == null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        r0 = new org.json.JSONObject(r5.j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        r0 = com.applovin.impl.sdk.network.e.b(r4.f11916a).b(r5.k()).a(r5.d()).b(r5.i()).c(r5.h()).a(r5.g()).a(r0).b(r5.o()).a(r5.n()).a(r5.f()).h(r5.p()).e(r5.e()).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0143, code lost:
        if (com.applovin.impl.sdk.t.a() == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        r1 = r4.f11917b;
        r1.a("PersistentPostbackManager", "Submitting postback: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015d, code lost:
        r4.f11916a.a0().dispatchPostbackRequest(r0, new com.applovin.impl.sdk.network.b.a(r4, r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.impl.sdk.network.d r5, com.applovin.sdk.AppLovinPostbackListener r6) {
        /*
            r4 = this;
            boolean r0 = com.applovin.impl.sdk.t.a()
            if (r0 == 0) goto L_0x001e
            com.applovin.impl.sdk.t r0 = r4.f11917b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Preparing to submit postback: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "PersistentPostbackManager"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x001e:
            com.applovin.impl.sdk.k r0 = r4.f11916a
            boolean r0 = r0.A0()
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.m()
            if (r0 != 0) goto L_0x003c
            boolean r5 = com.applovin.impl.sdk.t.a()
            if (r5 == 0) goto L_0x003b
            com.applovin.impl.sdk.t r5 = r4.f11917b
            java.lang.String r6 = "PersistentPostbackManager"
            java.lang.String r0 = "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards"
            r5.a((java.lang.String) r6, (java.lang.String) r0)
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r0 = r5.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0056
            boolean r5 = com.applovin.impl.sdk.t.a()
            if (r5 == 0) goto L_0x0055
            com.applovin.impl.sdk.t r5 = r4.f11917b
            java.lang.String r6 = "PersistentPostbackManager"
            java.lang.String r0 = "Skipping empty postback dispatch..."
            r5.b(r6, r0)
        L_0x0055:
            return
        L_0x0056:
            java.lang.Object r0 = r4.f11920f
            monitor-enter(r0)
            java.util.Set r1 = r4.f11922h     // Catch:{ all -> 0x016f }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x016f }
            if (r1 == 0) goto L_0x0085
            boolean r6 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x016f }
            if (r6 == 0) goto L_0x0083
            com.applovin.impl.sdk.t r6 = r4.f11917b     // Catch:{ all -> 0x016f }
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x016f }
            r2.<init>()     // Catch:{ all -> 0x016f }
            java.lang.String r3 = "Skipping in progress postback: "
            r2.append(r3)     // Catch:{ all -> 0x016f }
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x016f }
            r2.append(r5)     // Catch:{ all -> 0x016f }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x016f }
            r6.a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x016f }
        L_0x0083:
            monitor-exit(r0)     // Catch:{ all -> 0x016f }
            return
        L_0x0085:
            r5.l()     // Catch:{ all -> 0x016f }
            monitor-exit(r0)     // Catch:{ all -> 0x016f }
            com.applovin.impl.sdk.k r0 = r4.f11916a
            com.applovin.impl.oj r1 = com.applovin.impl.oj.V2
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r5.c()
            int r2 = r0.intValue()
            if (r1 <= r2) goto L_0x00c7
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto L_0x00c3
            com.applovin.impl.sdk.t r6 = r4.f11917b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exceeded maximum persisted attempt count of "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ". Dequeuing postback: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PersistentPostbackManager"
            r6.k(r1, r0)
        L_0x00c3:
            r4.a((com.applovin.impl.sdk.network.d) r5)
            return
        L_0x00c7:
            java.lang.Object r1 = r4.f11920f
            monitor-enter(r1)
            java.util.Set r0 = r4.f11922h     // Catch:{ all -> 0x016c }
            r0.add(r5)     // Catch:{ all -> 0x016c }
            monitor-exit(r1)     // Catch:{ all -> 0x016c }
            java.util.Map r0 = r5.j()
            if (r0 == 0) goto L_0x00e0
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r5.j()
            r0.<init>(r1)
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            com.applovin.impl.sdk.k r1 = r4.f11916a
            com.applovin.impl.sdk.network.e$a r1 = com.applovin.impl.sdk.network.e.b(r1)
            java.lang.String r2 = r5.k()
            com.applovin.impl.sdk.network.e$a r1 = r1.b((java.lang.String) r2)
            java.lang.String r2 = r5.d()
            com.applovin.impl.sdk.network.e$a r1 = r1.a((java.lang.String) r2)
            java.util.Map r2 = r5.i()
            com.applovin.impl.sdk.network.e$a r1 = r1.b((java.util.Map) r2)
            java.lang.String r2 = r5.h()
            com.applovin.impl.sdk.network.e$a r1 = r1.c((java.lang.String) r2)
            java.util.Map r2 = r5.g()
            com.applovin.impl.sdk.network.e$a r1 = r1.a((java.util.Map) r2)
            com.applovin.impl.sdk.network.e$a r0 = r1.a((org.json.JSONObject) r0)
            boolean r1 = r5.o()
            com.applovin.impl.sdk.network.e$a r0 = r0.b(r1)
            boolean r1 = r5.n()
            com.applovin.impl.sdk.network.e$a r0 = r0.a((boolean) r1)
            com.applovin.impl.qi$a r1 = r5.f()
            com.applovin.impl.sdk.network.e$a r0 = r0.a((com.applovin.impl.qi.a) r1)
            boolean r1 = r5.p()
            com.applovin.impl.sdk.network.e$a r0 = r0.h(r1)
            java.lang.String r1 = r5.e()
            com.applovin.impl.sdk.network.e$a r0 = r0.e((java.lang.String) r1)
            com.applovin.impl.sdk.network.e r0 = r0.a()
            boolean r1 = com.applovin.impl.sdk.t.a()
            if (r1 == 0) goto L_0x015d
            com.applovin.impl.sdk.t r1 = r4.f11917b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Submitting postback: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "PersistentPostbackManager"
            r1.a((java.lang.String) r3, (java.lang.String) r2)
        L_0x015d:
            com.applovin.impl.sdk.k r1 = r4.f11916a
            com.applovin.impl.sdk.network.PostbackServiceImpl r1 = r1.a0()
            com.applovin.impl.sdk.network.b$a r2 = new com.applovin.impl.sdk.network.b$a
            r2.<init>(r5, r6)
            r1.dispatchPostbackRequest(r0, r2)
            return
        L_0x016c:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016c }
            throw r5
        L_0x016f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.b.a(com.applovin.impl.sdk.network.d, com.applovin.sdk.AppLovinPostbackListener):void");
    }

    /* access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f11920f) {
            this.f11922h.remove(dVar);
            this.f11921g.remove(dVar);
        }
        if (t.a()) {
            t tVar = this.f11917b;
            tVar.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f11916a.l0().a((xl) new kn(this.f11916a, z11, "runPostbackTask", runnable), sm.b.OTHER);
            return;
        }
        runnable.run();
    }
}
