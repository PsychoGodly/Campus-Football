package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeuh implements zzeiq {
    final /* synthetic */ zzeui zza;

    zzeuh(zzeui zzeui) {
        this.zza = zzeui;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcoe zzcoe = (zzcoe) obj;
        synchronized (this.zza) {
            zzcoe zzcoe2 = this.zza.zza;
            if (zzcoe2 != null) {
                zzcoe2.zzb();
            }
            zzeui zzeui = this.zza;
            zzeui.zza = zzcoe;
            zzcoe.zzc(zzeui);
            zzeui zzeui2 = this.zza;
            zzeui2.zzg.zzl(new zzcof(zzcoe, zzeui2, zzeui2.zzg));
            zzcoe.zzj();
        }
    }
}
