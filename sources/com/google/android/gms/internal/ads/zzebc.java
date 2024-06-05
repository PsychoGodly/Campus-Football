package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzebc implements zzfnj {
    public final /* synthetic */ zzebf zza;
    public final /* synthetic */ zzcei zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ zzcnv zzd;

    public /* synthetic */ zzebc(zzebf zzebf, zzcei zzcei, zzeyc zzeyc, zzcnv zzcnv) {
        this.zza = zzebf;
        this.zzb = zzcei;
        this.zzc = zzeyc;
        this.zzd = zzcnv;
    }

    public final Object apply(Object obj) {
        zzcei zzcei = this.zzb;
        zzeyc zzeyc = this.zzc;
        zzcnv zzcnv = this.zzd;
        if (zzeyc.zzN) {
            zzcei.zzae();
        }
        zzcei.zzY();
        zzcei.onPause();
        return zzcnv.zza();
    }
}
