package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.q;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class q5 extends u6 {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f24963l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public t5 f24964c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public t5 f24965d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue<u5<?>> f24966e = new PriorityBlockingQueue<>();

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<u5<?>> f24967f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f24968g = new s5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f24969h = new s5(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Object f24970i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f24971j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f24972k;

    q5(w5 w5Var) {
        super(w5Var);
    }

    private final void t(u5<?> u5Var) {
        synchronized (this.f24970i) {
            this.f24966e.add(u5Var);
            t5 t5Var = this.f24964c;
            if (t5Var == null) {
                t5 t5Var2 = new t5(this, "Measurement Worker", this.f24966e);
                this.f24964c = t5Var2;
                t5Var2.setUncaughtExceptionHandler(this.f24968g);
                this.f24964c.start();
            } else {
                t5Var.a();
            }
        }
    }

    public final void B(Runnable runnable) throws IllegalStateException {
        j();
        q.k(runnable);
        t(new u5(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean E() {
        return Thread.currentThread() == this.f24964c;
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final void g() {
        if (Thread.currentThread() != this.f24965d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final void i() {
        if (Thread.currentThread() != this.f24964c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = zzj().G();
        r3.a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = zzj().G();
        r3.a("Timed out waiting for " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T q(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.q5 r0 = r1.zzl()     // Catch:{ all -> 0x0048 }
            r0.y(r6)     // Catch:{ all -> 0x0048 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.n4 r3 = r1.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Timed out waiting for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.a(r4)
        L_0x002b:
            return r2
        L_0x002c:
            com.google.android.gms.measurement.internal.n4 r3 = r1.zzj()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.<init>(r6)     // Catch:{ all -> 0x0048 }
            r4.append(r5)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0048 }
            r3.a(r4)     // Catch:{ all -> 0x0048 }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x0048:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.q(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> r(Callable<V> callable) throws IllegalStateException {
        j();
        q.k(callable);
        u5 u5Var = new u5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f24964c) {
            if (!this.f24966e.isEmpty()) {
                zzj().G().a("Callable skipped the worker queue.");
            }
            u5Var.run();
        } else {
            t(u5Var);
        }
        return u5Var;
    }

    public final void u(Runnable runnable) throws IllegalStateException {
        j();
        q.k(runnable);
        u5 u5Var = new u5(this, runnable, false, "Task exception on network thread");
        synchronized (this.f24970i) {
            this.f24967f.add(u5Var);
            t5 t5Var = this.f24965d;
            if (t5Var == null) {
                t5 t5Var2 = new t5(this, "Measurement Network", this.f24967f);
                this.f24965d = t5Var2;
                t5Var2.setUncaughtExceptionHandler(this.f24969h);
                this.f24965d.start();
            } else {
                t5Var.a();
            }
        }
    }

    public final <V> Future<V> w(Callable<V> callable) throws IllegalStateException {
        j();
        q.k(callable);
        u5 u5Var = new u5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f24964c) {
            u5Var.run();
        } else {
            t(u5Var);
        }
        return u5Var;
    }

    public final void y(Runnable runnable) throws IllegalStateException {
        j();
        q.k(runnable);
        t(new u5(this, runnable, false, "Task exception on worker thread"));
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
