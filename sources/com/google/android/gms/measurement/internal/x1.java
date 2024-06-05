package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class x1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f25226a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f25227b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ x f25228c;

    x1(x xVar, String str, long j10) {
        this.f25228c = xVar;
        this.f25226a = str;
        this.f25227b = j10;
    }

    public final void run() {
        x.x(this.f25228c, this.f25226a, this.f25227b);
    }
}
