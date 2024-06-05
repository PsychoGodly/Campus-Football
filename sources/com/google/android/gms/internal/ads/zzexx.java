package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzexx implements zzeiq {
    final /* synthetic */ zzexz zza;

    zzexx(zzexz zzexz) {
        this.zza = zzexz;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzd = (zzdlu) obj;
            if (((Boolean) a0.c().zzb(zzbar.zzdb)).booleanValue()) {
                ((zzdlu) obj).zzd().zza = this.zza.zzc;
            }
            this.zza.zzd.zzj();
        }
    }
}
