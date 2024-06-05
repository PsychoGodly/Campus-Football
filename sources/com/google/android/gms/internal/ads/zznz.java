package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zznz implements Runnable {
    public final /* synthetic */ zzob zza;
    public final /* synthetic */ zzaf zzb;
    public final /* synthetic */ zzhc zzc;

    public /* synthetic */ zznz(zzob zzob, zzaf zzaf, zzhc zzhc) {
        this.zza = zzob;
        this.zzb = zzaf;
        this.zzc = zzhc;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
