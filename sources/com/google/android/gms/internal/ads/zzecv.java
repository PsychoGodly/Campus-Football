package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzecv implements zzfnj {
    public final /* synthetic */ zzecx zza;
    public final /* synthetic */ zzcei zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ zzdcw zzd;

    public /* synthetic */ zzecv(zzecx zzecx, zzcei zzcei, zzeyc zzeyc, zzdcw zzdcw) {
        this.zza = zzecx;
        this.zzb = zzcei;
        this.zzc = zzeyc;
        this.zzd = zzdcw;
    }

    public final Object apply(Object obj) {
        zzcei zzcei = this.zzb;
        zzeyc zzeyc = this.zzc;
        zzdcw zzdcw = this.zzd;
        if (zzeyc.zzN) {
            zzcei.zzae();
        }
        zzcei.zzY();
        zzcei.onPause();
        return zzdcw.zzg();
    }
}
