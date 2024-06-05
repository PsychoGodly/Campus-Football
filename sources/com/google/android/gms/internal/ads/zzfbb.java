package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfbb implements zzfuf {
    final /* synthetic */ zzfbe zza;
    final /* synthetic */ zzfbf zzb;

    zzfbb(zzfbf zzfbf, zzfbe zzfbe) {
        this.zzb = zzfbf;
        this.zza = zzfbe;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfbf zzfbf = this.zzb;
            if (zzfbf.zzf == 1) {
                zzfbf.zzh();
            }
        }
    }
}
