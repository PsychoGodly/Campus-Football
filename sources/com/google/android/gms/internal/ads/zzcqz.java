package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcqz implements zzfuf {
    final /* synthetic */ zzfuf zza;
    final /* synthetic */ zzcra zzb;

    zzcqz(zzcra zzcra, zzfuf zzfuf) {
        this.zzb = zzcra;
        this.zza = zzfuf;
    }

    public final void zza(Throwable th) {
        zzbzn.zze.execute(new zzcqx(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzn.zze.execute(new zzcqx(this.zzb));
        this.zza.zzb((zzcqm) obj);
    }
}
