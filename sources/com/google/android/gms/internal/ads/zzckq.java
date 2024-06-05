package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzckq implements Runnable {
    public final /* synthetic */ zzcks zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzckq(zzcks zzcks, Runnable runnable) {
        this.zza = zzcks;
        this.zzb = runnable;
    }

    public final void run() {
        zzbzn.zze.execute(new zzckr(this.zza, this.zzb));
    }
}
