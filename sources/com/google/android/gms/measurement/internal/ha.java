package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    long f24636a;

    /* renamed from: b  reason: collision with root package name */
    long f24637b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ia f24638c;

    ha(ia iaVar, long j10, long j11) {
        this.f24638c = iaVar;
        this.f24636a = j10;
        this.f24637b = j11;
    }

    public final void run() {
        this.f24638c.f24696b.zzl().y(new ka(this));
    }
}
