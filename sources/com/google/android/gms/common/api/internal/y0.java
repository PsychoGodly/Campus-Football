package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final x0 f15331a;

    protected y0(x0 x0Var) {
        this.f15331a = x0Var;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void b(a1 a1Var) {
        Lock h10;
        a1Var.f15049a.lock();
        try {
            if (a1Var.f15059l != this.f15331a) {
                h10 = a1Var.f15049a;
            } else {
                a();
                h10 = a1Var.f15049a;
            }
            h10.unlock();
        } catch (Throwable th) {
            a1Var.f15049a.unlock();
            throw th;
        }
    }
}
