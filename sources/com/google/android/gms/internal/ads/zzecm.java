package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzecm implements Runnable {
    public final /* synthetic */ zzeco zza;
    public final /* synthetic */ zzeyo zzb;
    public final /* synthetic */ zzeyc zzc;

    public /* synthetic */ zzecm(zzeco zzeco, zzeyo zzeyo, zzeyc zzeyc) {
        this.zza = zzeco;
        this.zzb = zzeyo;
        this.zzc = zzeyc;
    }

    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}
