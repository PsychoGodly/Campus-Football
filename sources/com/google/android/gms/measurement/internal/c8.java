package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class c8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f24436a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24437b;

    c8(b7 b7Var, AtomicReference atomicReference) {
        this.f24437b = b7Var;
        this.f24436a = atomicReference;
    }

    public final void run() {
        synchronized (this.f24436a) {
            try {
                this.f24436a.set(Double.valueOf(this.f24437b.a().j(this.f24437b.k().A(), e0.Q)));
                this.f24436a.notify();
            } catch (Throwable th) {
                this.f24436a.notify();
                throw th;
            }
        }
    }
}
