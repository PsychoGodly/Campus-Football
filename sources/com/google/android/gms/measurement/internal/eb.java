package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
final class eb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcv f24566a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f24567b;

    eb(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcv) {
        this.f24567b = appMeasurementDynamiteService;
        this.f24566a = zzcv;
    }

    public final void run() {
        this.f24567b.f24328a.G().O(this.f24566a, this.f24567b.f24328a.j());
    }
}
