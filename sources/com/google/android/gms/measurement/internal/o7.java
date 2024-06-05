package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class o7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24886a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24887b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f24888c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f24889d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ b7 f24890f;

    o7(b7 b7Var, String str, String str2, Object obj, long j10) {
        this.f24890f = b7Var;
        this.f24886a = str;
        this.f24887b = str2;
        this.f24888c = obj;
        this.f24889d = j10;
    }

    public final void run() {
        this.f24890f.T(this.f24886a, this.f24887b, this.f24888c, this.f24889d);
    }
}
