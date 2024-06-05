package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
final class h8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcv f24631a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ d0 f24632b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24633c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f24634d;

    h8(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcv, d0 d0Var, String str) {
        this.f24634d = appMeasurementDynamiteService;
        this.f24631a = zzcv;
        this.f24632b = d0Var;
        this.f24633c = str;
    }

    public final void run() {
        this.f24634d.f24328a.E().z(this.f24631a, this.f24632b, this.f24633c);
    }
}
