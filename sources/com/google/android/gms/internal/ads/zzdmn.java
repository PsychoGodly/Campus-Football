package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdmn implements zzcft {
    public final /* synthetic */ zzbzs zza;

    public /* synthetic */ zzdmn(zzbzs zzbzs) {
        this.zza = zzbzs;
    }

    public final void zza(boolean z10) {
        zzbzs zzbzs = this.zza;
        if (z10) {
            zzbzs.zzd((Object) null);
        } else {
            zzbzs.zze(new Exception("Ad Web View failed to load."));
        }
    }
}
