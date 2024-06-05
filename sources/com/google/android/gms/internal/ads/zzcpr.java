package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcpr implements Runnable {
    public final /* synthetic */ zzcps zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcpr(zzcps zzcps, Runnable runnable) {
        this.zza = zzcps;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
