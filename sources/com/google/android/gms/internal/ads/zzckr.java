package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzckr implements Runnable {
    public final /* synthetic */ zzcks zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzckr(zzcks zzcks, Runnable runnable) {
        this.zza = zzcks;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
