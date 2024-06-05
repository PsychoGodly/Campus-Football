package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class ga implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f24609a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ da f24610b;

    ga(da daVar, long j10) {
        this.f24610b = daVar;
        this.f24609a = j10;
    }

    public final void run() {
        da.D(this.f24610b, this.f24609a);
    }
}
