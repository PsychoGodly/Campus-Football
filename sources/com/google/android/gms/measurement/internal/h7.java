package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class h7 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b7 f24630a;

    h7(b7 b7Var) {
        this.f24630a = b7Var;
    }

    public final void execute(Runnable runnable) {
        this.f24630a.zzl().y(runnable);
    }
}
