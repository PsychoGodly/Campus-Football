package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class j0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f15410a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.b> f15411b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<GoogleApiClient.b> f15412c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.c> f15413d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f15414f = false;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f15415g = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    private boolean f15416h = false;

    /* renamed from: i  reason: collision with root package name */
    private final Handler f15417i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f15418j = new Object();

    public j0(Looper looper, i0 i0Var) {
        this.f15410a = i0Var;
        this.f15417i = new zaq(looper, this);
    }

    public final void a() {
        this.f15414f = false;
        this.f15415g.incrementAndGet();
    }

    public final void b() {
        this.f15414f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(h5.b r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f15417i
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.q.e(r0, r1)
            android.os.Handler r0 = r5.f15417i
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f15418j
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r2 = r5.f15413d     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f15415g     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.GoogleApiClient$c r3 = (com.google.android.gms.common.api.GoogleApiClient.c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f15414f     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f15415g     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r4 = r5.f15413d     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.onConnectionFailed(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.j0.c(h5.b):void");
    }

    public final void d(Bundle bundle) {
        q.e(this.f15417i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f15418j) {
            q.n(!this.f15416h);
            this.f15417i.removeMessages(1);
            this.f15416h = true;
            q.n(this.f15412c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f15411b);
            int i10 = this.f15415g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
                if (!this.f15414f || !this.f15410a.isConnected()) {
                    break;
                } else if (this.f15415g.get() != i10) {
                    break;
                } else if (!this.f15412c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f15412c.clear();
            this.f15416h = false;
        }
    }

    public final void e(int i10) {
        q.e(this.f15417i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f15417i.removeMessages(1);
        synchronized (this.f15418j) {
            this.f15416h = true;
            ArrayList arrayList = new ArrayList(this.f15411b);
            int i11 = this.f15415g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
                if (!this.f15414f) {
                    break;
                } else if (this.f15415g.get() != i11) {
                    break;
                } else if (this.f15411b.contains(bVar)) {
                    bVar.onConnectionSuspended(i10);
                }
            }
            this.f15412c.clear();
            this.f15416h = false;
        }
    }

    public final void f(GoogleApiClient.b bVar) {
        q.k(bVar);
        synchronized (this.f15418j) {
            if (this.f15411b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f15411b.add(bVar);
            }
        }
        if (this.f15410a.isConnected()) {
            Handler handler = this.f15417i;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(GoogleApiClient.c cVar) {
        q.k(cVar);
        synchronized (this.f15418j) {
            if (this.f15413d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f15413d.add(cVar);
            }
        }
    }

    public final void h(GoogleApiClient.c cVar) {
        q.k(cVar);
        synchronized (this.f15418j) {
            if (!this.f15413d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 57);
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            GoogleApiClient.b bVar = (GoogleApiClient.b) message.obj;
            synchronized (this.f15418j) {
                if (this.f15414f && this.f15410a.isConnected() && this.f15411b.contains(bVar)) {
                    bVar.onConnected((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i10);
        Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
        return false;
    }
}
