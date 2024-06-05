package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class ea implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f24564a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ da f24565b;

    ea(da daVar, long j10) {
        this.f24565b = daVar;
        this.f24564a = j10;
    }

    public final void run() {
        da.x(this.f24565b, this.f24564a);
    }
}
