package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class r7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f25024a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f25025b;

    r7(b7 b7Var, AtomicReference atomicReference) {
        this.f25025b = b7Var;
        this.f25024a = atomicReference;
    }

    public final void run() {
        synchronized (this.f25024a) {
            try {
                this.f25024a.set(this.f25025b.a().C(this.f25025b.k().A()));
                this.f25024a.notify();
            } catch (Throwable th) {
                this.f25024a.notify();
                throw th;
            }
        }
    }
}
