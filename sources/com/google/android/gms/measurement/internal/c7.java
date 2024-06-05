package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class c7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ b7 f24434a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f24435b;

    public /* synthetic */ c7(b7 b7Var, AtomicReference atomicReference) {
        this.f24434a = b7Var;
        this.f24435b = atomicReference;
    }

    public final void run() {
        b7 b7Var = this.f24434a;
        AtomicReference atomicReference = this.f24435b;
        Bundle a10 = b7Var.e().f25276n.a();
        v8 o10 = b7Var.o();
        if (a10 == null) {
            a10 = new Bundle();
        }
        o10.K(atomicReference, a10);
    }
}
