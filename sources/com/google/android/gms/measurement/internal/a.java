package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24334a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f24335b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ x f24336c;

    a(x xVar, String str, long j10) {
        this.f24336c = xVar;
        this.f24334a = str;
        this.f24335b = j10;
    }

    public final void run() {
        x.t(this.f24336c, this.f24334a, this.f24335b);
    }
}
