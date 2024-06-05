package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzblh implements zzbzu {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ zzblr zzc;

    zzblh(zzblr zzblr, zzblq zzblq, zzfec zzfec) {
        this.zzc = zzblr;
        this.zza = zzblq;
        this.zzb = zzfec;
    }

    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            n1.a("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
                zzblr zzblr = this.zzc;
                if (zzblr.zze != null) {
                    zzfep zze = zzblr.zze;
                    zzfec zzfec = this.zzb;
                    zzfec.zzf(false);
                    zze.zzb(zzfec.zzl());
                }
            }
        }
    }
}
