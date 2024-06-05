package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzblo implements Runnable {
    public final /* synthetic */ zzblp zza;
    public final /* synthetic */ zzbkm zzb;

    public /* synthetic */ zzblo(zzblp zzblp, zzbkm zzbkm) {
        this.zza = zzblp;
        this.zzb = zzbkm;
    }

    public final void run() {
        zzbkm zzbkm = this.zzb;
        zzbkm.zzr("/result", zzbho.zzo);
        zzbkm.zzc();
    }
}
