package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class m7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f24827a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24828b;

    m7(b7 b7Var, long j10) {
        this.f24828b = b7Var;
        this.f24827a = j10;
    }

    public final void run() {
        this.f24828b.e().f25273k.b(this.f24827a);
        this.f24828b.zzj().A().b("Session timeout duration set", Long.valueOf(this.f24827a));
    }
}
