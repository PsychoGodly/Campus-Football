package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import h5.b;
import h5.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a1 implements t1, c3 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Lock f15049a;

    /* renamed from: b  reason: collision with root package name */
    private final Condition f15050b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15051c;

    /* renamed from: d  reason: collision with root package name */
    private final f f15052d;

    /* renamed from: f  reason: collision with root package name */
    private final z0 f15053f;

    /* renamed from: g  reason: collision with root package name */
    final Map<a.c<?>, a.f> f15054g;

    /* renamed from: h  reason: collision with root package name */
    final Map<a.c<?>, b> f15055h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    final d f15056i;

    /* renamed from: j  reason: collision with root package name */
    final Map<a<?>, Boolean> f15057j;

    /* renamed from: k  reason: collision with root package name */
    final a.C0154a<? extends u5.f, u5.a> f15058k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public volatile x0 f15059l;

    /* renamed from: m  reason: collision with root package name */
    private b f15060m = null;

    /* renamed from: n  reason: collision with root package name */
    int f15061n;

    /* renamed from: o  reason: collision with root package name */
    final w0 f15062o;

    /* renamed from: p  reason: collision with root package name */
    final r1 f15063p;

    public a1(Context context, w0 w0Var, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, d dVar, Map<a<?>, Boolean> map2, a.C0154a<? extends u5.f, u5.a> aVar, ArrayList<b3> arrayList, r1 r1Var) {
        this.f15051c = context;
        this.f15049a = lock;
        this.f15052d = fVar;
        this.f15054g = map;
        this.f15056i = dVar;
        this.f15057j = map2;
        this.f15058k = aVar;
        this.f15062o = w0Var;
        this.f15063p = r1Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this);
        }
        this.f15053f = new z0(this, looper);
        this.f15050b = lock.newCondition();
        this.f15059l = new s0(this);
    }

    public final void M0(b bVar, a<?> aVar, boolean z10) {
        this.f15049a.lock();
        try {
            this.f15059l.c(bVar, aVar, z10);
        } finally {
            this.f15049a.unlock();
        }
    }

    public final void a() {
        this.f15059l.b();
    }

    public final boolean b() {
        return this.f15059l instanceof e0;
    }

    public final <A extends a.b, T extends d<? extends i, A>> T c(T t10) {
        t10.k();
        return this.f15059l.g(t10);
    }

    public final void d() {
        if (this.f15059l instanceof e0) {
            ((e0) this.f15059l).i();
        }
    }

    public final void e() {
        if (this.f15059l.f()) {
            this.f15055h.clear();
        }
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f15059l);
        for (a next : this.f15057j.keySet()) {
            printWriter.append(str).append(next.d()).println(":");
            ((a.f) q.k(this.f15054g.get(next.b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f15049a.lock();
        try {
            this.f15062o.q();
            this.f15059l = new e0(this);
            this.f15059l.e();
            this.f15050b.signalAll();
        } finally {
            this.f15049a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.f15049a.lock();
        try {
            this.f15059l = new r0(this, this.f15056i, this.f15057j, this.f15052d, this.f15058k, this.f15049a, this.f15051c);
            this.f15059l.e();
            this.f15050b.signalAll();
        } finally {
            this.f15049a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(b bVar) {
        this.f15049a.lock();
        try {
            this.f15060m = bVar;
            this.f15059l = new s0(this);
            this.f15059l.e();
            this.f15050b.signalAll();
        } finally {
            this.f15049a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void l(y0 y0Var) {
        this.f15053f.sendMessage(this.f15053f.obtainMessage(1, y0Var));
    }

    /* access modifiers changed from: package-private */
    public final void m(RuntimeException runtimeException) {
        this.f15053f.sendMessage(this.f15053f.obtainMessage(2, runtimeException));
    }

    public final void onConnected(Bundle bundle) {
        this.f15049a.lock();
        try {
            this.f15059l.a(bundle);
        } finally {
            this.f15049a.unlock();
        }
    }

    public final void onConnectionSuspended(int i10) {
        this.f15049a.lock();
        try {
            this.f15059l.d(i10);
        } finally {
            this.f15049a.unlock();
        }
    }
}
