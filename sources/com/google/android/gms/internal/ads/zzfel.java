package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfel implements zzfuf {
    final /* synthetic */ zzfen zza;
    final /* synthetic */ zzfec zzb;

    zzfel(zzfen zzfen, zzfec zzfec) {
        this.zza = zzfen;
        this.zzb = zzfec;
    }

    public final void zza(Throwable th) {
        zzfen zzfen = this.zza;
        zzfec zzfec = this.zzb;
        zzfec.zzg(th);
        zzfec.zzf(false);
        zzfen.zza(zzfec);
    }

    public final void zzb(Object obj) {
    }
}
