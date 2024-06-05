package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcqy implements zzfuf {
    final /* synthetic */ zzfuf zza;
    final /* synthetic */ zzcra zzb;

    zzcqy(zzcra zzcra, zzfuf zzfuf) {
        this.zzb = zzcra;
        this.zza = zzfuf;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzbzn.zze.execute(new zzcqx(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcra.zzb(this.zzb, ((zzcqt) obj).zza, this.zza);
    }
}
