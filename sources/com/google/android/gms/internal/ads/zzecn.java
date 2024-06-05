package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzecn implements zzfuf {
    final /* synthetic */ zzeco zza;

    zzecn(zzeco zzeco) {
        this.zza = zzeco;
    }

    public final void zza(Throwable th) {
        c3 zza2 = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zza(zza2);
        zzezr.zzb(zza2.f14427a, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object obj) {
        ((zzcok) obj).zzj();
    }
}
