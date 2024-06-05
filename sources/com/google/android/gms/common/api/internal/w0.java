package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.j0;
import com.google.android.gms.common.internal.q;
import com.unity3d.services.UnityAdsConstants;
import h5.b;
import h5.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import u5.f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class w0 extends GoogleApiClient implements r1 {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f15294b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f15295c;

    /* renamed from: d  reason: collision with root package name */
    private t1 f15296d = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f15297e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f15298f;

    /* renamed from: g  reason: collision with root package name */
    private final Looper f15299g;

    /* renamed from: h  reason: collision with root package name */
    final Queue<d<?, ?>> f15300h = new LinkedList();

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f15301i;

    /* renamed from: j  reason: collision with root package name */
    private long f15302j;

    /* renamed from: k  reason: collision with root package name */
    private long f15303k;

    /* renamed from: l  reason: collision with root package name */
    private final u0 f15304l;

    /* renamed from: m  reason: collision with root package name */
    private final e f15305m;

    /* renamed from: n  reason: collision with root package name */
    p1 f15306n;

    /* renamed from: o  reason: collision with root package name */
    final Map<a.c<?>, a.f> f15307o;

    /* renamed from: p  reason: collision with root package name */
    Set<Scope> f15308p;

    /* renamed from: q  reason: collision with root package name */
    final d f15309q;

    /* renamed from: r  reason: collision with root package name */
    final Map<a<?>, Boolean> f15310r;

    /* renamed from: s  reason: collision with root package name */
    final a.C0154a<? extends f, u5.a> f15311s;

    /* renamed from: t  reason: collision with root package name */
    private final k f15312t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<b3> f15313u;

    /* renamed from: v  reason: collision with root package name */
    private Integer f15314v;

    /* renamed from: w  reason: collision with root package name */
    Set<k2> f15315w;

    /* renamed from: x  reason: collision with root package name */
    final m2 f15316x;

    /* renamed from: y  reason: collision with root package name */
    private final i0 f15317y;

    public w0(Context context, Lock lock, Looper looper, d dVar, e eVar, a.C0154a<? extends f, u5.a> aVar, Map<a<?>, Boolean> map, List<GoogleApiClient.b> list, List<GoogleApiClient.c> list2, Map<a.c<?>, a.f> map2, int i10, int i11, ArrayList<b3> arrayList) {
        Looper looper2 = looper;
        int i12 = i10;
        this.f15302j = true != m5.d.a() ? 120000 : UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        this.f15303k = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
        this.f15308p = new HashSet();
        this.f15312t = new k();
        this.f15314v = null;
        this.f15315w = null;
        t0 t0Var = new t0(this);
        this.f15317y = t0Var;
        this.f15298f = context;
        this.f15294b = lock;
        this.f15295c = new j0(looper, t0Var);
        this.f15299g = looper2;
        this.f15304l = new u0(this, looper);
        this.f15305m = eVar;
        this.f15297e = i12;
        if (i12 >= 0) {
            this.f15314v = Integer.valueOf(i11);
        }
        this.f15310r = map;
        this.f15307o = map2;
        this.f15313u = arrayList;
        this.f15316x = new m2();
        for (GoogleApiClient.b f10 : list) {
            this.f15295c.f(f10);
        }
        for (GoogleApiClient.c g10 : list2) {
            this.f15295c.g(g10);
        }
        this.f15309q = dVar;
        this.f15311s = aVar;
    }

    public static int l(Iterable<a.f> iterable, boolean z10) {
        boolean z11 = false;
        boolean z12 = false;
        for (a.f next : iterable) {
            z11 |= next.requiresSignIn();
            z12 |= next.providesSignIn();
        }
        if (z11) {
            return (!z12 || !z10) ? 1 : 2;
        }
        return 3;
    }

    static String n(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void o(w0 w0Var) {
        w0Var.f15294b.lock();
        try {
            if (w0Var.f15301i) {
                w0Var.s();
            }
        } finally {
            w0Var.f15294b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void p(w0 w0Var) {
        w0Var.f15294b.lock();
        try {
            if (w0Var.q()) {
                w0Var.s();
            }
        } finally {
            w0Var.f15294b.unlock();
        }
    }

    private final void r(int i10) {
        Integer num = this.f15314v;
        if (num == null) {
            this.f15314v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            String n10 = n(i10);
            String n11 = n(this.f15314v.intValue());
            StringBuilder sb2 = new StringBuilder(n10.length() + 51 + n11.length());
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(n10);
            sb2.append(". Mode was already set to ");
            sb2.append(n11);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f15296d == null) {
            boolean z10 = false;
            boolean z11 = false;
            for (a.f next : this.f15307o.values()) {
                z10 |= next.requiresSignIn();
                z11 |= next.providesSignIn();
            }
            int intValue = this.f15314v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z10) {
                    this.f15296d = v.m(this.f15298f, this, this.f15294b, this.f15299g, this.f15305m, this.f15307o, this.f15309q, this.f15310r, this.f15311s, this.f15313u);
                    return;
                }
            } else if (!z10) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f15296d = new a1(this.f15298f, this, this.f15294b, this.f15299g, this.f15305m, this.f15307o, this.f15309q, this.f15310r, this.f15311s, this.f15313u, this);
        }
    }

    private final void s() {
        this.f15295c.b();
        ((t1) q.k(this.f15296d)).a();
    }

    public final void a(b bVar) {
        if (!this.f15305m.k(this.f15298f, bVar.v())) {
            q();
        }
        if (!this.f15301i) {
            this.f15295c.c(bVar);
            this.f15295c.a();
        }
    }

    public final void b(Bundle bundle) {
        while (!this.f15300h.isEmpty()) {
            e(this.f15300h.remove());
        }
        this.f15295c.d(bundle);
    }

    public final void c(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f15301i) {
                this.f15301i = true;
                if (this.f15306n == null && !m5.d.a()) {
                    try {
                        this.f15306n = this.f15305m.v(this.f15298f.getApplicationContext(), new v0(this));
                    } catch (SecurityException unused) {
                    }
                }
                u0 u0Var = this.f15304l;
                u0Var.sendMessageDelayed(u0Var.obtainMessage(1), this.f15302j);
                u0 u0Var2 = this.f15304l;
                u0Var2.sendMessageDelayed(u0Var2.obtainMessage(2), this.f15303k);
            }
            i10 = 1;
        }
        for (BasePendingResult d10 : (BasePendingResult[]) this.f15316x.f15210a.toArray(new BasePendingResult[0])) {
            d10.d(m2.f15209c);
        }
        this.f15295c.e(i10);
        this.f15295c.a();
        if (i10 == 2) {
            s();
        }
    }

    public final void connect() {
        this.f15294b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f15297e >= 0) {
                q.o(this.f15314v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f15314v;
                if (num == null) {
                    this.f15314v = Integer.valueOf(l(this.f15307o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) q.k(this.f15314v)).intValue();
            this.f15294b.lock();
            if (intValue == 3 || intValue == 1) {
                i10 = intValue;
            } else if (intValue != 2) {
                i10 = intValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i10);
                q.b(z10, sb2.toString());
                r(i10);
                s();
            }
            z10 = true;
            StringBuilder sb22 = new StringBuilder(33);
            sb22.append("Illegal sign-in mode: ");
            sb22.append(i10);
            q.b(z10, sb22.toString());
            r(i10);
            s();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f15294b.unlock();
        }
    }

    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f15298f);
        printWriter.append(str).append("mResuming=").print(this.f15301i);
        printWriter.append(" mWorkQueue.size()=").print(this.f15300h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f15316x.f15210a.size());
        t1 t1Var = this.f15296d;
        if (t1Var != null) {
            t1Var.f(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void disconnect() {
        Lock lock;
        this.f15294b.lock();
        try {
            this.f15316x.b();
            t1 t1Var = this.f15296d;
            if (t1Var != null) {
                t1Var.e();
            }
            this.f15312t.b();
            for (d dVar : this.f15300h) {
                dVar.n((l2) null);
                dVar.b();
            }
            this.f15300h.clear();
            if (this.f15296d == null) {
                lock = this.f15294b;
            } else {
                q();
                this.f15295c.a();
                lock = this.f15294b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f15294b.unlock();
            throw th;
        }
    }

    public final <A extends a.b, T extends d<? extends i, A>> T e(T t10) {
        Lock lock;
        a<?> p10 = t10.p();
        boolean containsKey = this.f15307o.containsKey(t10.q());
        String d10 = p10 != null ? p10.d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d10);
        sb2.append(" required for this call.");
        q.b(containsKey, sb2.toString());
        this.f15294b.lock();
        try {
            t1 t1Var = this.f15296d;
            if (t1Var != null) {
                if (this.f15301i) {
                    this.f15300h.add(t10);
                    while (!this.f15300h.isEmpty()) {
                        d remove = this.f15300h.remove();
                        this.f15316x.a(remove);
                        remove.u(Status.f15011j);
                    }
                    lock = this.f15294b;
                } else {
                    t10 = t1Var.c(t10);
                    lock = this.f15294b;
                }
                lock.unlock();
                return t10;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f15294b.unlock();
            throw th;
        }
    }

    public final Looper f() {
        return this.f15299g;
    }

    public final boolean g() {
        t1 t1Var = this.f15296d;
        return t1Var != null && t1Var.b();
    }

    public final void h(GoogleApiClient.c cVar) {
        this.f15295c.g(cVar);
    }

    public final void i(GoogleApiClient.c cVar) {
        this.f15295c.h(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(com.google.android.gms.common.api.internal.k2 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f15294b
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.k2> r0 = r2.f15315w     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x0027
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0027:
            java.util.concurrent.locks.Lock r3 = r2.f15294b     // Catch:{ all -> 0x0057 }
            r3.lock()     // Catch:{ all -> 0x0057 }
            java.util.Set<com.google.android.gms.common.api.internal.k2> r3 = r2.f15315w     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.locks.Lock r3 = r2.f15294b     // Catch:{ all -> 0x0057 }
            r3.unlock()     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0036:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f15294b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            com.google.android.gms.common.api.internal.t1 r3 = r2.f15296d     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x004a
            r3.d()     // Catch:{ all -> 0x0057 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f15294b
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f15294b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f15294b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.w0.j(com.google.android.gms.common.api.internal.k2):void");
    }

    /* access modifiers changed from: package-private */
    public final String m() {
        StringWriter stringWriter = new StringWriter();
        d(MaxReward.DEFAULT_LABEL, (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        if (!this.f15301i) {
            return false;
        }
        this.f15301i = false;
        this.f15304l.removeMessages(2);
        this.f15304l.removeMessages(1);
        p1 p1Var = this.f15306n;
        if (p1Var != null) {
            p1Var.b();
            this.f15306n = null;
        }
        return true;
    }
}
