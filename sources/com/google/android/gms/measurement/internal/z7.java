package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class z7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f25319a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f25320b;

    z7(b7 b7Var, AtomicReference atomicReference) {
        this.f25320b = b7Var;
        this.f25319a = atomicReference;
    }

    public final void run() {
        synchronized (this.f25319a) {
            try {
                this.f25319a.set(Integer.valueOf(this.f25320b.a().p(this.f25320b.k().A(), e0.P)));
                this.f25319a.notify();
            } catch (Throwable th) {
                this.f25319a.notify();
                throw th;
            }
        }
    }
}
