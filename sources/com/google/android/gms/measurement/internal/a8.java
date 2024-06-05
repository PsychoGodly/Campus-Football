package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class a8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f24369a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24370b;

    a8(b7 b7Var, AtomicReference atomicReference) {
        this.f24370b = b7Var;
        this.f24369a = atomicReference;
    }

    public final void run() {
        synchronized (this.f24369a) {
            try {
                this.f24369a.set(Long.valueOf(this.f24370b.a().s(this.f24370b.k().A(), e0.O)));
                this.f24369a.notify();
            } catch (Throwable th) {
                this.f24369a.notify();
                throw th;
            }
        }
    }
}
