package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class i1<O extends a.d> implements GoogleApiClient.b, GoogleApiClient.c, c3 {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<q2> f15141a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a.f f15142b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b<O> f15143c;

    /* renamed from: d  reason: collision with root package name */
    private final y f15144d;

    /* renamed from: f  reason: collision with root package name */
    private final Set<t2> f15145f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Map<j.a<?>, z1> f15146g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final int f15147h;

    /* renamed from: i  reason: collision with root package name */
    private final e2 f15148i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15149j;

    /* renamed from: k  reason: collision with root package name */
    private final List<k1> f15150k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private b f15151l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f15152m = 0;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ f f15153n;

    public i1(f fVar, e<O> eVar) {
        this.f15153n = fVar;
        a.f zab = eVar.zab(fVar.f15120q.getLooper(), this);
        this.f15142b = zab;
        this.f15143c = eVar.getApiKey();
        this.f15144d = new y();
        this.f15147h = eVar.zaa();
        if (zab.requiresSignIn()) {
            this.f15148i = eVar.zac(fVar.f15111h, fVar.f15120q);
        } else {
            this.f15148i = null;
        }
    }

    private final h5.d b(h5.d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            h5.d[] availableFeatures = this.f15142b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new h5.d[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(r3);
            for (h5.d dVar : availableFeatures) {
                aVar.put(dVar.v(), Long.valueOf(dVar.w()));
            }
            for (h5.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.v());
                if (l10 == null || l10.longValue() < dVar2.w()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void c(b bVar) {
        for (t2 b10 : this.f15145f) {
            b10.b(this.f15143c, bVar, p.a(bVar, b.f18803f) ? this.f15142b.getEndpointPackageName() : null);
        }
        this.f15145f.clear();
    }

    /* access modifiers changed from: private */
    public final void d(Status status) {
        q.d(this.f15153n.f15120q);
        e(status, (Exception) null, false);
    }

    private final void e(Status status, Exception exc, boolean z10) {
        q.d(this.f15153n.f15120q);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator it = this.f15141a.iterator();
            while (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                if (!z10 || q2Var.f15222a == 2) {
                    if (status != null) {
                        q2Var.a(status);
                    } else {
                        q2Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.f15141a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q2 q2Var = (q2) arrayList.get(i10);
            if (this.f15142b.isConnected()) {
                if (l(q2Var)) {
                    this.f15141a.remove(q2Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void g() {
        A();
        c(b.f18803f);
        k();
        Iterator<z1> it = this.f15146g.values().iterator();
        if (!it.hasNext()) {
            f();
            i();
            return;
        }
        n<a.b, ?> nVar = it.next().f15338a;
        throw null;
    }

    /* access modifiers changed from: private */
    public final void h(int i10) {
        A();
        this.f15149j = true;
        this.f15144d.e(i10, this.f15142b.getLastDisconnectMessage());
        f fVar = this.f15153n;
        fVar.f15120q.sendMessageDelayed(Message.obtain(fVar.f15120q, 9, this.f15143c), this.f15153n.f15105a);
        f fVar2 = this.f15153n;
        fVar2.f15120q.sendMessageDelayed(Message.obtain(fVar2.f15120q, 11, this.f15143c), this.f15153n.f15106b);
        this.f15153n.f15113j.c();
        for (z1 z1Var : this.f15146g.values()) {
            z1Var.f15339b.run();
        }
    }

    private final void i() {
        this.f15153n.f15120q.removeMessages(12, this.f15143c);
        f fVar = this.f15153n;
        fVar.f15120q.sendMessageDelayed(fVar.f15120q.obtainMessage(12, this.f15143c), this.f15153n.f15107c);
    }

    private final void j(q2 q2Var) {
        q2Var.d(this.f15144d, M());
        try {
            q2Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f15142b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        if (this.f15149j) {
            this.f15153n.f15120q.removeMessages(11, this.f15143c);
            this.f15153n.f15120q.removeMessages(9, this.f15143c);
            this.f15149j = false;
        }
    }

    private final boolean l(q2 q2Var) {
        if (!(q2Var instanceof s1)) {
            j(q2Var);
            return true;
        }
        s1 s1Var = (s1) q2Var;
        h5.d b10 = b(s1Var.g(this));
        if (b10 == null) {
            j(q2Var);
            return true;
        }
        String name = this.f15142b.getClass().getName();
        String v10 = b10.v();
        long w10 = b10.w();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(v10).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(v10);
        sb2.append(", ");
        sb2.append(w10);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (!this.f15153n.f15121r || !s1Var.f(this)) {
            s1Var.b(new n(b10));
            return true;
        }
        k1 k1Var = new k1(this.f15143c, b10, (j1) null);
        int indexOf = this.f15150k.indexOf(k1Var);
        if (indexOf >= 0) {
            k1 k1Var2 = this.f15150k.get(indexOf);
            this.f15153n.f15120q.removeMessages(15, k1Var2);
            f fVar = this.f15153n;
            fVar.f15120q.sendMessageDelayed(Message.obtain(fVar.f15120q, 15, k1Var2), this.f15153n.f15105a);
            return false;
        }
        this.f15150k.add(k1Var);
        f fVar2 = this.f15153n;
        fVar2.f15120q.sendMessageDelayed(Message.obtain(fVar2.f15120q, 15, k1Var), this.f15153n.f15105a);
        f fVar3 = this.f15153n;
        fVar3.f15120q.sendMessageDelayed(Message.obtain(fVar3.f15120q, 16, k1Var), this.f15153n.f15106b);
        b bVar = new b(2, (PendingIntent) null);
        if (m(bVar)) {
            return false;
        }
        this.f15153n.g(bVar, this.f15147h);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m(h5.b r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.f.f15103u
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.f r1 = r3.f15153n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.z r2 = r1.f15117n     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f15118o     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.b<O> r2 = r3.f15143c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.f r1 = r3.f15153n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.z r1 = r1.f15117n     // Catch:{ all -> 0x002a }
            int r2 = r3.f15147h     // Catch:{ all -> 0x002a }
            r1.h(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.i1.m(h5.b):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean n(boolean z10) {
        q.d(this.f15153n.f15120q);
        if (!this.f15142b.isConnected() || this.f15146g.size() != 0) {
            return false;
        }
        if (this.f15144d.g()) {
            if (z10) {
                i();
            }
            return false;
        }
        this.f15142b.disconnect("Timing out service connection.");
        return true;
    }

    static /* bridge */ /* synthetic */ void y(i1 i1Var, k1 k1Var) {
        if (!i1Var.f15150k.contains(k1Var) || i1Var.f15149j) {
            return;
        }
        if (!i1Var.f15142b.isConnected()) {
            i1Var.B();
        } else {
            i1Var.f();
        }
    }

    static /* bridge */ /* synthetic */ void z(i1 i1Var, k1 k1Var) {
        h5.d[] g10;
        if (i1Var.f15150k.remove(k1Var)) {
            i1Var.f15153n.f15120q.removeMessages(15, k1Var);
            i1Var.f15153n.f15120q.removeMessages(16, k1Var);
            h5.d a10 = k1Var.f15173b;
            ArrayList arrayList = new ArrayList(i1Var.f15141a.size());
            for (q2 q2Var : i1Var.f15141a) {
                if ((q2Var instanceof s1) && (g10 = ((s1) q2Var).g(i1Var)) != null && m5.b.b(g10, a10)) {
                    arrayList.add(q2Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q2 q2Var2 = (q2) arrayList.get(i10);
                i1Var.f15141a.remove(q2Var2);
                q2Var2.b(new n(a10));
            }
        }
    }

    public final void A() {
        q.d(this.f15153n.f15120q);
        this.f15151l = null;
    }

    public final void B() {
        q.d(this.f15153n.f15120q);
        if (!this.f15142b.isConnected() && !this.f15142b.isConnecting()) {
            try {
                f fVar = this.f15153n;
                int b10 = fVar.f15113j.b(fVar.f15111h, this.f15142b);
                if (b10 != 0) {
                    b bVar = new b(b10, (PendingIntent) null);
                    String name = this.f15142b.getClass().getName();
                    String obj = bVar.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(obj);
                    Log.w("GoogleApiManager", sb2.toString());
                    E(bVar, (Exception) null);
                    return;
                }
                f fVar2 = this.f15153n;
                a.f fVar3 = this.f15142b;
                m1 m1Var = new m1(fVar2, fVar3, this.f15143c);
                if (fVar3.requiresSignIn()) {
                    ((e2) q.k(this.f15148i)).C1(m1Var);
                }
                try {
                    this.f15142b.connect(m1Var);
                } catch (SecurityException e10) {
                    E(new b(10), e10);
                }
            } catch (IllegalStateException e11) {
                E(new b(10), e11);
            }
        }
    }

    public final void C(q2 q2Var) {
        q.d(this.f15153n.f15120q);
        if (!this.f15142b.isConnected()) {
            this.f15141a.add(q2Var);
            b bVar = this.f15151l;
            if (bVar == null || !bVar.y()) {
                B();
            } else {
                E(this.f15151l, (Exception) null);
            }
        } else if (l(q2Var)) {
            i();
        } else {
            this.f15141a.add(q2Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        this.f15152m++;
    }

    public final void E(b bVar, Exception exc) {
        q.d(this.f15153n.f15120q);
        e2 e2Var = this.f15148i;
        if (e2Var != null) {
            e2Var.D1();
        }
        A();
        this.f15153n.f15113j.c();
        c(bVar);
        if ((this.f15142b instanceof j5.e) && bVar.v() != 24) {
            this.f15153n.f15108d = true;
            f fVar = this.f15153n;
            fVar.f15120q.sendMessageDelayed(fVar.f15120q.obtainMessage(19), 300000);
        }
        if (bVar.v() == 4) {
            d(f.f15102t);
        } else if (this.f15141a.isEmpty()) {
            this.f15151l = bVar;
        } else if (exc != null) {
            q.d(this.f15153n.f15120q);
            e((Status) null, exc, false);
        } else if (this.f15153n.f15121r) {
            e(f.h(this.f15143c, bVar), (Exception) null, true);
            if (!this.f15141a.isEmpty() && !m(bVar) && !this.f15153n.g(bVar, this.f15147h)) {
                if (bVar.v() == 18) {
                    this.f15149j = true;
                }
                if (this.f15149j) {
                    f fVar2 = this.f15153n;
                    fVar2.f15120q.sendMessageDelayed(Message.obtain(fVar2.f15120q, 9, this.f15143c), this.f15153n.f15105a);
                    return;
                }
                d(f.h(this.f15143c, bVar));
            }
        } else {
            d(f.h(this.f15143c, bVar));
        }
    }

    public final void F(b bVar) {
        q.d(this.f15153n.f15120q);
        a.f fVar = this.f15142b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.disconnect(sb2.toString());
        E(bVar, (Exception) null);
    }

    public final void G(t2 t2Var) {
        q.d(this.f15153n.f15120q);
        this.f15145f.add(t2Var);
    }

    public final void H() {
        q.d(this.f15153n.f15120q);
        if (this.f15149j) {
            B();
        }
    }

    public final void I() {
        q.d(this.f15153n.f15120q);
        d(f.f15101s);
        this.f15144d.f();
        for (j.a p2Var : (j.a[]) this.f15146g.keySet().toArray(new j.a[0])) {
            C(new p2(p2Var, new TaskCompletionSource()));
        }
        c(new b(4));
        if (this.f15142b.isConnected()) {
            this.f15142b.onUserSignOut(new h1(this));
        }
    }

    public final void J() {
        Status status;
        q.d(this.f15153n.f15120q);
        if (this.f15149j) {
            k();
            f fVar = this.f15153n;
            if (fVar.f15112i.i(fVar.f15111h) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            d(status);
            this.f15142b.disconnect("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean L() {
        return this.f15142b.isConnected();
    }

    public final boolean M() {
        return this.f15142b.requiresSignIn();
    }

    public final void M0(b bVar, a<?> aVar, boolean z10) {
        throw null;
    }

    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.f15147h;
    }

    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f15153n.f15120q.getLooper()) {
            g();
        } else {
            this.f15153n.f15120q.post(new e1(this));
        }
    }

    public final void onConnectionFailed(b bVar) {
        E(bVar, (Exception) null);
    }

    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f15153n.f15120q.getLooper()) {
            h(i10);
        } else {
            this.f15153n.f15120q.post(new f1(this, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public final int p() {
        return this.f15152m;
    }

    public final b q() {
        q.d(this.f15153n.f15120q);
        return this.f15151l;
    }

    public final a.f s() {
        return this.f15142b;
    }

    public final Map<j.a<?>, z1> u() {
        return this.f15146g;
    }
}
