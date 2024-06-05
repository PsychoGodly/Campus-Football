package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class j7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f24723a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24724b;

    j7(b7 b7Var, AtomicReference atomicReference) {
        this.f24724b = b7Var;
        this.f24723a = atomicReference;
    }

    public final void run() {
        synchronized (this.f24723a) {
            try {
                this.f24723a.set(Boolean.valueOf(this.f24724b.a().E(this.f24724b.k().A())));
                this.f24723a.notify();
            } catch (Throwable th) {
                this.f24723a.notify();
                throw th;
            }
        }
    }
}
