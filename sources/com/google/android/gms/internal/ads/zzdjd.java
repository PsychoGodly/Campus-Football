package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdjd implements zzcft {
    public final /* synthetic */ zzbzr zza;

    public /* synthetic */ zzdjd(zzbzr zzbzr) {
        this.zza = zzbzr;
    }

    public final void zza(boolean z10) {
        zzbzr zzbzr = this.zza;
        if (z10) {
            zzbzr.zzb();
        } else {
            zzbzr.zze(new zzeek(1, "Image Web View failed to load."));
        }
    }
}
