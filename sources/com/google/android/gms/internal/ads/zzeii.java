package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeii implements zzeiq {
    final /* synthetic */ zzeij zza;

    zzeii(zzeij zzeij) {
        this.zza = zzeij;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdcv zzdcv = (zzdcv) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdcv;
            this.zza.zzi.zzj();
        }
    }
}
