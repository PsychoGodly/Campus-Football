package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzblg implements zzbzw {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ zzblr zzc;

    zzblg(zzblr zzblr, zzblq zzblq, zzfec zzfec) {
        this.zzc = zzblr;
        this.zza = zzblq;
        this.zzb = zzfec;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbkm zzbkm = (zzbkm) obj;
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzblr zzblr = this.zzc;
            if (!(zzblr.zzh == null || this.zza == zzblr.zzh)) {
                n1.a("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
                zzblr zzblr2 = this.zzc;
                if (zzblr2.zze != null) {
                    zzfep zze = zzblr2.zze;
                    zzfec zzfec = this.zzb;
                    zzfec.zzf(true);
                    zze.zzb(zzfec.zzl());
                }
            }
        }
    }
}
