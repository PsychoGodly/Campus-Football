package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzexs implements zzeiq {
    final /* synthetic */ zzext zza;

    zzexs(zzext zzext) {
        this.zza = zzext;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzh = (zzdlu) obj;
            if (((Boolean) a0.c().zzb(zzbar.zzdb)).booleanValue()) {
                ((zzdlu) obj).zzd().zza = this.zza.zzd;
            }
            this.zza.zzh.zzj();
        }
    }
}
