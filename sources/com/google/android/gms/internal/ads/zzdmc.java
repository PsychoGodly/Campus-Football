package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdmc implements zzgwy {
    private final zzgxl zza;

    public zzdmc(zzgxl zzgxl) {
        this.zza = zzgxl;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzawo zzawo;
        if (((zzcuf) this.zza).zza().zzo.zza == 3) {
            zzawo = zzawo.REWARDED_INTERSTITIAL;
        } else {
            zzawo = zzawo.REWARD_BASED_VIDEO_AD;
        }
        zzgxg.zzb(zzawo);
        return zzawo;
    }
}
