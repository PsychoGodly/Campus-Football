package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f14764a;

    a(b0 b0Var) {
        this.f14764a = b0Var;
    }

    public final void run() {
        this.f14764a.zzb = Thread.currentThread();
        this.f14764a.zza();
    }
}
