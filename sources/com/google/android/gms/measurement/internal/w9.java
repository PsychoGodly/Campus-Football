package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class w9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ s9 f25219a;

    w9(s9 s9Var) {
        this.f25219a = s9Var;
    }

    public final void run() {
        v8.F(this.f25219a.f25057c, new ComponentName(this.f25219a.f25057c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
