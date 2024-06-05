package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdlr implements zzbie {
    private final zzcvv zza;
    private final zzbup zzb;
    private final String zzc;
    private final String zzd;

    public zzdlr(zzcvv zzcvv, zzeyc zzeyc) {
        this.zza = zzcvv;
        this.zzb = zzeyc.zzm;
        this.zzc = zzeyc.zzk;
        this.zzd = zzeyc.zzl;
    }

    public final void zza(zzbup zzbup) {
        int i10;
        String str;
        zzbup zzbup2 = this.zzb;
        if (zzbup2 != null) {
            zzbup = zzbup2;
        }
        if (zzbup != null) {
            str = zzbup.zza;
            i10 = zzbup.zzb;
        } else {
            i10 = 1;
            str = MaxReward.DEFAULT_LABEL;
        }
        this.zza.zzd(new zzbua(str, i10), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
