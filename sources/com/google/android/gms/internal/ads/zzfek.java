package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfek implements zzfuf {
    final /* synthetic */ zzfen zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ boolean zzc;

    zzfek(zzfen zzfen, zzfec zzfec, boolean z10) {
        this.zza = zzfen;
        this.zzb = zzfec;
        this.zzc = z10;
    }

    public final void zza(Throwable th) {
        zzfec zzfec = this.zzb;
        if (zzfec.zzj()) {
            zzfen zzfen = this.zza;
            zzfec.zzg(th);
            zzfec.zzf(false);
            zzfen.zza(zzfec);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfen zzfen = this.zza;
        zzfec zzfec = this.zzb;
        zzfec.zzf(true);
        zzfen.zza(zzfec);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
