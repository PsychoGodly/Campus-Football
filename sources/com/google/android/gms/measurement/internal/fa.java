package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
final class fa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f24590a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f24591b;

    fa(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f24591b = appMeasurementDynamiteService;
        this.f24590a = aVar;
    }

    public final void run() {
        this.f24591b.f24328a.C().Y(this.f24590a);
    }
}
