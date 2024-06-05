package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
final class r6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcv f25022a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f25023b;

    r6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcv) {
        this.f25023b = appMeasurementDynamiteService;
        this.f25022a = zzcv;
    }

    public final void run() {
        this.f25023b.f24328a.E().y(this.f25022a);
    }
}
