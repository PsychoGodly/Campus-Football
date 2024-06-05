package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzefk implements Runnable {
    public final /* synthetic */ zzefl zza;
    public final /* synthetic */ zzeyo zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ zzeaw zzd;

    public /* synthetic */ zzefk(zzefl zzefl, zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) {
        this.zza = zzefl;
        this.zzb = zzeyo;
        this.zzc = zzeyc;
        this.zzd = zzeaw;
    }

    public final void run() {
        zzefl zzefl = this.zza;
        zzefn.zze(this.zzb, this.zzc, this.zzd);
    }
}
