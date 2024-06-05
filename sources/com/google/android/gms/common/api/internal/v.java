package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.base.zal;
import h5.b;
import h5.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class v implements t1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15271a;

    /* renamed from: b  reason: collision with root package name */
    private final w0 f15272b;

    /* renamed from: c  reason: collision with root package name */
    private final Looper f15273c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a1 f15274d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a1 f15275f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<a.c<?>, a1> f15276g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<q> f15277h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i  reason: collision with root package name */
    private final a.f f15278i;

    /* renamed from: j  reason: collision with root package name */
    private Bundle f15279j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public b f15280k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public b f15281l = null;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f15282m = false;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Lock f15283n;

    /* renamed from: o  reason: collision with root package name */
    private int f15284o = 0;

    private v(Context context, w0 w0Var, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, d dVar, a.C0154a<? extends u5.f, u5.a> aVar, a.f fVar2, ArrayList<b3> arrayList, ArrayList<b3> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.f15271a = context;
        this.f15272b = w0Var;
        this.f15283n = lock;
        this.f15273c = looper;
        this.f15278i = fVar2;
        Context context2 = context;
        w0 w0Var2 = w0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        f fVar3 = fVar;
        a1 a1Var = r3;
        a1 a1Var2 = new a1(context2, w0Var2, lock2, looper2, fVar3, map2, (d) null, map4, (a.C0154a<? extends u5.f, u5.a>) null, arrayList2, new e3(this, (d3) null));
        this.f15274d = a1Var;
        this.f15275f = new a1(context2, w0Var2, lock2, looper2, fVar3, map, dVar, map3, aVar, arrayList, new g3(this, (f3) null));
        androidx.collection.a aVar2 = new androidx.collection.a();
        for (a.c<?> put : map2.keySet()) {
            aVar2.put(put, this.f15274d);
        }
        for (a.c<?> put2 : map.keySet()) {
            aVar2.put(put2, this.f15275f);
        }
        this.f15276g = Collections.unmodifiableMap(aVar2);
    }

    private final void g(b bVar) {
        int i10 = this.f15284o;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f15284o = 0;
            }
            this.f15272b.a(bVar);
        }
        h();
        this.f15284o = 0;
    }

    private final void h() {
        for (q a10 : this.f15277h) {
            a10.a();
        }
        this.f15277h.clear();
    }

    private final boolean i() {
        b bVar = this.f15281l;
        return bVar != null && bVar.v() == 4;
    }

    private final boolean j(d<? extends i, ? extends a.b> dVar) {
        a1 a1Var = this.f15276g.get(dVar.q());
        q.l(a1Var, "GoogleApiClient is not configured to use the API required for this call.");
        return a1Var.equals(this.f15275f);
    }

    private static boolean k(b bVar) {
        return bVar != null && bVar.z();
    }

    public static v m(Context context, w0 w0Var, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, d dVar, Map<a<?>, Boolean> map2, a.C0154a<? extends u5.f, u5.a> aVar, ArrayList<b3> arrayList) {
        Map<a<?>, Boolean> map3 = map2;
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        a.f fVar2 = null;
        for (Map.Entry next : map.entrySet()) {
            a.f fVar3 = (a.f) next.getValue();
            if (true == fVar3.providesSignIn()) {
                fVar2 = fVar3;
            }
            if (fVar3.requiresSignIn()) {
                aVar2.put((a.c) next.getKey(), fVar3);
            } else {
                aVar3.put((a.c) next.getKey(), fVar3);
            }
        }
        q.o(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.a aVar4 = new androidx.collection.a();
        androidx.collection.a aVar5 = new androidx.collection.a();
        for (a next2 : map2.keySet()) {
            a.c<?> b10 = next2.b();
            if (aVar2.containsKey(b10)) {
                aVar4.put(next2, map3.get(next2));
            } else if (aVar3.containsKey(b10)) {
                aVar5.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b3 b3Var = arrayList.get(i10);
            if (aVar4.containsKey(b3Var.f15073a)) {
                arrayList2.add(b3Var);
            } else if (aVar5.containsKey(b3Var.f15073a)) {
                arrayList3.add(b3Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new v(context, w0Var, lock, looper, fVar, aVar2, aVar3, dVar, aVar, fVar2, arrayList2, arrayList3, aVar4, aVar5);
    }

    static /* bridge */ /* synthetic */ void t(v vVar, int i10, boolean z10) {
        vVar.f15272b.c(i10, z10);
        vVar.f15281l = null;
        vVar.f15280k = null;
    }

    static /* bridge */ /* synthetic */ void u(v vVar, Bundle bundle) {
        Bundle bundle2 = vVar.f15279j;
        if (bundle2 == null) {
            vVar.f15279j = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void v(v vVar) {
        b bVar;
        if (k(vVar.f15280k)) {
            if (k(vVar.f15281l) || vVar.i()) {
                int i10 = vVar.f15284o;
                if (i10 != 1) {
                    if (i10 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        vVar.f15284o = 0;
                        return;
                    }
                    ((w0) q.k(vVar.f15272b)).b(vVar.f15279j);
                }
                vVar.h();
                vVar.f15284o = 0;
                return;
            }
            b bVar2 = vVar.f15281l;
            if (bVar2 == null) {
                return;
            }
            if (vVar.f15284o == 1) {
                vVar.h();
                return;
            }
            vVar.g(bVar2);
            vVar.f15274d.e();
        } else if (vVar.f15280k == null || !k(vVar.f15281l)) {
            b bVar3 = vVar.f15280k;
            if (bVar3 != null && (bVar = vVar.f15281l) != null) {
                if (vVar.f15275f.f15061n < vVar.f15274d.f15061n) {
                    bVar3 = bVar;
                }
                vVar.g(bVar3);
            }
        } else {
            vVar.f15275f.e();
            vVar.g((b) q.k(vVar.f15280k));
        }
    }

    private final PendingIntent x() {
        if (this.f15278i == null) {
            return null;
        }
        return zal.zaa(this.f15271a, System.identityHashCode(this.f15272b), this.f15278i.getSignInIntent(), zal.zaa | 134217728);
    }

    public final void a() {
        this.f15284o = 2;
        this.f15282m = false;
        this.f15281l = null;
        this.f15280k = null;
        this.f15274d.a();
        this.f15275f.a();
    }

    public final boolean b() {
        this.f15283n.lock();
        try {
            boolean z10 = false;
            if (this.f15274d.b() && (this.f15275f.b() || i() || this.f15284o == 1)) {
                z10 = true;
            }
            return z10;
        } finally {
            this.f15283n.unlock();
        }
    }

    public final <A extends a.b, T extends d<? extends i, A>> T c(T t10) {
        if (!j(t10)) {
            return this.f15274d.c(t10);
        }
        if (!i()) {
            return this.f15275f.c(t10);
        }
        t10.u(new Status(4, (String) null, x()));
        return t10;
    }

    public final void d() {
        this.f15274d.d();
        this.f15275f.d();
    }

    public final void e() {
        this.f15281l = null;
        this.f15280k = null;
        this.f15284o = 0;
        this.f15274d.e();
        this.f15275f.e();
        h();
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f15275f.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f15274d.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
