package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
final class i7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcv f24682a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24683b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24684c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f24685d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f24686f;

    i7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcv, String str, String str2, boolean z10) {
        this.f24686f = appMeasurementDynamiteService;
        this.f24682a = zzcv;
        this.f24683b = str;
        this.f24684c = str2;
        this.f24685d = z10;
    }

    public final void run() {
        this.f24686f.f24328a.E().B(this.f24682a, this.f24683b, this.f24684c, this.f24685d);
    }
}
