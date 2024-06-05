package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdri implements zzfuf {
    final /* synthetic */ zzdrk zza;

    zzdri(zzdrk zzdrk) {
        this.zza = zzdrk;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (t.b().b() - this.zza.zzd));
            this.zza.zze.zze(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, MaxReward.DEFAULT_LABEL, (int) (t.b().b() - this.zza.zzd));
            this.zza.zzi.execute(new zzdrh(this, str));
        }
    }
}
