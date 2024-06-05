package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzefd implements zzfnj {
    public final /* synthetic */ zzefh zza;
    public final /* synthetic */ zzcei zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ zzdlv zzd;

    public /* synthetic */ zzefd(zzefh zzefh, zzcei zzcei, zzeyc zzeyc, zzdlv zzdlv) {
        this.zza = zzefh;
        this.zzb = zzcei;
        this.zzc = zzeyc;
        this.zzd = zzdlv;
    }

    public final Object apply(Object obj) {
        zzcei zzcei = this.zzb;
        zzeyc zzeyc = this.zzc;
        zzdlv zzdlv = this.zzd;
        if (zzeyc.zzN) {
            zzcei.zzae();
        }
        zzcei.zzY();
        zzcei.onPause();
        return zzdlv.zzk();
    }
}
