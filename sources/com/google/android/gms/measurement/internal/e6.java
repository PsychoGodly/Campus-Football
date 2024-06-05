package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class e6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24553a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24554b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24555c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f24556d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ a6 f24557f;

    e6(a6 a6Var, String str, String str2, String str3, long j10) {
        this.f24557f = a6Var;
        this.f24553a = str;
        this.f24554b = str2;
        this.f24555c = str3;
        this.f24556d = j10;
    }

    public final void run() {
        String str = this.f24553a;
        if (str == null) {
            this.f24557f.f24356a.y(this.f24554b, (p8) null);
            return;
        }
        this.f24557f.f24356a.y(this.f24554b, new p8(this.f24555c, str, this.f24556d));
    }
}
