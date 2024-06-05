package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdrb implements Runnable {
    public final /* synthetic */ zzdrk zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzbzs zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfec zzf;

    public /* synthetic */ zzdrb(zzdrk zzdrk, Object obj, zzbzs zzbzs, String str, long j10, zzfec zzfec) {
        this.zza = zzdrk;
        this.zzb = obj;
        this.zzc = zzbzs;
        this.zzd = str;
        this.zze = j10;
        this.zzf = zzfec;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
