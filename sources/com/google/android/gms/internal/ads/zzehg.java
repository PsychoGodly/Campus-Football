package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzehg implements zzeiq {
    final /* synthetic */ zzehh zza;

    zzehg(zzehh zzehh) {
        this.zza = zzehh;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcok zzcok = (zzcok) obj;
        synchronized (this.zza) {
            zzehh zzehh = this.zza;
            if (zzehh.zzh != null) {
                zzehh.zzh.zzb();
            }
            this.zza.zzh = zzcok;
            this.zza.zzh.zzj();
        }
    }
}
