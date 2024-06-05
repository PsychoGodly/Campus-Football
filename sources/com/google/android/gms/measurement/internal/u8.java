package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class u8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f25100a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ o8 f25101b;

    u8(o8 o8Var, long j10) {
        this.f25101b = o8Var;
        this.f25100a = j10;
    }

    public final void run() {
        this.f25101b.j().q(this.f25100a);
        this.f25101b.f24893e = null;
    }
}
