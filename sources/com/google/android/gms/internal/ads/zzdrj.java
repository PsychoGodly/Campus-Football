package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdrj extends zzbjo {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfec zzd;
    final /* synthetic */ zzbzs zze;
    final /* synthetic */ zzdrk zzf;

    zzdrj(zzdrk zzdrk, Object obj, String str, long j10, zzfec zzfec, zzbzs zzbzs) {
        this.zzf = zzdrk;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzfec;
        this.zze = zzbzs;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (t.b().b() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfep zze2 = this.zzf.zzp;
            zzfec zzfec = this.zzd;
            zzfec.zzc(str);
            zzfec.zzf(false);
            zze2.zzb(zzfec.zzl());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, MaxReward.DEFAULT_LABEL, (int) (t.b().b() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfep zze2 = this.zzf.zzp;
            zzfec zzfec = this.zzd;
            zzfec.zzf(true);
            zze2.zzb(zzfec.zzl());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
