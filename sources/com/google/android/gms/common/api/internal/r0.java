package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.q;
import h5.b;
import h5.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import v5.l;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class r0 implements x0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a1 f15223a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Lock f15224b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f15225c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final f f15226d;

    /* renamed from: e  reason: collision with root package name */
    private b f15227e;

    /* renamed from: f  reason: collision with root package name */
    private int f15228f;

    /* renamed from: g  reason: collision with root package name */
    private int f15229g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f15230h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f15231i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    private final Set<a.c> f15232j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public u5.f f15233k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15234l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f15235m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15236n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public j f15237o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15238p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15239q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final d f15240r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<a<?>, Boolean> f15241s;

    /* renamed from: t  reason: collision with root package name */
    private final a.C0154a<? extends u5.f, u5.a> f15242t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<Future<?>> f15243u = new ArrayList<>();

    public r0(a1 a1Var, d dVar, Map<a<?>, Boolean> map, f fVar, a.C0154a<? extends u5.f, u5.a> aVar, Lock lock, Context context) {
        this.f15223a = a1Var;
        this.f15240r = dVar;
        this.f15241s = map;
        this.f15226d = fVar;
        this.f15242t = aVar;
        this.f15224b = lock;
        this.f15225c = context;
    }

    static /* bridge */ /* synthetic */ void A(r0 r0Var, l lVar) {
        if (r0Var.n(0)) {
            b v10 = lVar.v();
            if (v10.z()) {
                o0 o0Var = (o0) q.k(lVar.w());
                b v11 = o0Var.v();
                if (!v11.z()) {
                    String valueOf = String.valueOf(v11);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    r0Var.k(v11);
                    return;
                }
                r0Var.f15236n = true;
                r0Var.f15237o = (j) q.k(o0Var.w());
                r0Var.f15238p = o0Var.x();
                r0Var.f15239q = o0Var.y();
                r0Var.m();
            } else if (r0Var.p(v10)) {
                r0Var.h();
                r0Var.m();
            } else {
                r0Var.k(v10);
            }
        }
    }

    private final void I() {
        ArrayList<Future<?>> arrayList = this.f15243u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).cancel(true);
        }
        this.f15243u.clear();
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.f15235m = false;
        this.f15223a.f15062o.f15308p = Collections.emptySet();
        for (a.c next : this.f15232j) {
            if (!this.f15223a.f15055h.containsKey(next)) {
                this.f15223a.f15055h.put(next, new b(17, (PendingIntent) null));
            }
        }
    }

    private final void i(boolean z10) {
        u5.f fVar = this.f15233k;
        if (fVar != null) {
            if (fVar.isConnected() && z10) {
                fVar.c();
            }
            fVar.disconnect();
            d dVar = (d) q.k(this.f15240r);
            this.f15237o = null;
        }
    }

    private final void j() {
        Bundle bundle;
        this.f15223a.i();
        b1.a().execute(new f0(this));
        u5.f fVar = this.f15233k;
        if (fVar != null) {
            if (this.f15238p) {
                fVar.b((j) q.k(this.f15237o), this.f15239q);
            }
            i(false);
        }
        for (a.c<?> cVar : this.f15223a.f15055h.keySet()) {
            ((a.f) q.k(this.f15223a.f15054g.get(cVar))).disconnect();
        }
        if (this.f15231i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f15231i;
        }
        this.f15223a.f15063p.b(bundle);
    }

    /* access modifiers changed from: private */
    public final void k(b bVar) {
        I();
        i(!bVar.y());
        this.f15223a.k(bVar);
        this.f15223a.f15063p.a(bVar);
    }

    /* access modifiers changed from: private */
    public final void l(b bVar, a<?> aVar, boolean z10) {
        int priority = aVar.c().getPriority();
        if ((!z10 || bVar.y() || this.f15226d.c(bVar.v()) != null) && (this.f15227e == null || priority < this.f15228f)) {
            this.f15227e = bVar;
            this.f15228f = priority;
        }
        this.f15223a.f15055h.put(aVar.b(), bVar);
    }

    /* access modifiers changed from: private */
    public final void m() {
        if (this.f15230h == 0) {
            if (!this.f15235m || this.f15236n) {
                ArrayList arrayList = new ArrayList();
                this.f15229g = 1;
                this.f15230h = this.f15223a.f15054g.size();
                for (a.c next : this.f15223a.f15054g.keySet()) {
                    if (!this.f15223a.f15055h.containsKey(next)) {
                        arrayList.add(this.f15223a.f15054g.get(next));
                    } else if (o()) {
                        j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f15243u.add(b1.a().submit(new k0(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean n(int i10) {
        if (this.f15229g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f15223a.f15062o.m());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i11 = this.f15230h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i11);
        Log.w("GACConnecting", sb2.toString());
        String q10 = q(this.f15229g);
        String q11 = q(i10);
        StringBuilder sb3 = new StringBuilder(q10.length() + 70 + q11.length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(q10);
        sb3.append(" but received callback for step ");
        sb3.append(q11);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        k(new b(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean o() {
        int i10 = this.f15230h - 1;
        this.f15230h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f15223a.f15062o.m());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            k(new b(8, (PendingIntent) null));
            return false;
        }
        b bVar = this.f15227e;
        if (bVar == null) {
            return true;
        }
        this.f15223a.f15061n = this.f15228f;
        k(bVar);
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean p(b bVar) {
        return this.f15234l && !bVar.y();
    }

    private static final String q(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set x(r0 r0Var) {
        d dVar = r0Var.f15240r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.e());
        Map<a<?>, b0> i10 = r0Var.f15240r.i();
        for (a next : i10.keySet()) {
            if (!r0Var.f15223a.f15055h.containsKey(next.b())) {
                hashSet.addAll(i10.get(next).f15344a);
            }
        }
        return hashSet;
    }

    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f15231i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    public final void b() {
    }

    public final void c(b bVar, a<?> aVar, boolean z10) {
        if (n(1)) {
            l(bVar, aVar, z10);
            if (o()) {
                j();
            }
        }
    }

    public final void d(int i10) {
        k(new b(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, u5.f] */
    public final void e() {
        this.f15223a.f15055h.clear();
        this.f15235m = false;
        this.f15227e = null;
        this.f15229g = 0;
        this.f15234l = true;
        this.f15236n = false;
        this.f15238p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (a next : this.f15241s.keySet()) {
            a.f fVar = (a.f) q.k(this.f15223a.f15054g.get(next.b()));
            z10 |= next.c().getPriority() == 1;
            boolean booleanValue = this.f15241s.get(next).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f15235m = true;
                if (booleanValue) {
                    this.f15232j.add(next.b());
                } else {
                    this.f15234l = false;
                }
            }
            hashMap.put(fVar, new g0(this, next, booleanValue));
        }
        if (z10) {
            this.f15235m = false;
        }
        if (this.f15235m) {
            q.k(this.f15240r);
            q.k(this.f15242t);
            this.f15240r.j(Integer.valueOf(System.identityHashCode(this.f15223a.f15062o)));
            o0 o0Var = new o0(this, (n0) null);
            a.C0154a aVar = this.f15242t;
            Context context = this.f15225c;
            Looper f10 = this.f15223a.f15062o.f();
            d dVar = this.f15240r;
            this.f15233k = aVar.buildClient(context, f10, dVar, dVar.f(), (GoogleApiClient.b) o0Var, (GoogleApiClient.c) o0Var);
        }
        this.f15230h = this.f15223a.f15054g.size();
        this.f15243u.add(b1.a().submit(new j0(this, hashMap)));
    }

    public final boolean f() {
        I();
        i(true);
        this.f15223a.k((b) null);
        return true;
    }

    public final <A extends a.b, T extends d<? extends i, A>> T g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
