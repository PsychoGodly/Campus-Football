package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class u9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ComponentName f25102a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s9 f25103b;

    u9(s9 s9Var, ComponentName componentName) {
        this.f25103b = s9Var;
        this.f25102a = componentName;
    }

    public final void run() {
        v8.F(this.f25103b.f25057c, this.f25102a);
    }
}
