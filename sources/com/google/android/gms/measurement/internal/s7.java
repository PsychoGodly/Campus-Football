package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class s7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f25048a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f25049b;

    s7(b7 b7Var, long j10) {
        this.f25049b = b7Var;
        this.f25048a = j10;
    }

    public final void run() {
        this.f25049b.z(this.f25048a, true);
        this.f25049b.o().J(new AtomicReference());
    }
}
