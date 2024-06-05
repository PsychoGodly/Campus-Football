package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0 f15221a;

    /* synthetic */ q0(r0 r0Var, p0 p0Var) {
        this.f15221a = r0Var;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Lock y10;
        this.f15221a.f15224b.lock();
        try {
            if (Thread.interrupted()) {
                y10 = this.f15221a.f15224b;
            } else {
                a();
                y10 = this.f15221a.f15224b;
            }
        } catch (RuntimeException e10) {
            this.f15221a.f15223a.m(e10);
            y10 = this.f15221a.f15224b;
        } catch (Throwable th) {
            this.f15221a.f15224b.unlock();
            throw th;
        }
        y10.unlock();
    }
}
