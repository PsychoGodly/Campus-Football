package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzchq extends zzequ {
    private final zzesa zza;
    private final zzchy zzb;
    private final zzchq zzc = this;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;
    private final zzgxl zzl;
    private final zzgxl zzm;
    private final zzgxl zzn;

    /* synthetic */ zzchq(zzchy zzchy, zzesa zzesa, zzchp zzchp) {
        this.zzb = zzchy;
        this.zza = zzesa;
        zzesc zzesc = new zzesc(zzesa);
        this.zzd = zzesc;
        zzgxl zzc2 = zzgwx.zzc(zzdoh.zza());
        this.zze = zzc2;
        zzgxl zzc3 = zzgwx.zzc(zzdof.zza());
        this.zzf = zzc3;
        zzgxl zzc4 = zzgwx.zzc(zzdoj.zza());
        this.zzg = zzc4;
        zzgxl zzc5 = zzgwx.zzc(zzdol.zza());
        this.zzh = zzc5;
        zzgxb zzc6 = zzgxc.zzc(4);
        zzc6.zzb(zzfcu.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfcu.BUILD_URL, zzc3);
        zzc6.zzb(zzfcu.HTTP, zzc4);
        zzc6.zzb(zzfcu.PRE_PROCESS, zzc5);
        zzgxc zzc7 = zzc6.zzc();
        this.zzi = zzc7;
        zzgxl zzc8 = zzgwx.zzc(new zzdom(zzesc, zzchy.zzh, zzfbv.zza(), zzc7));
        this.zzj = zzc8;
        zzgxi zza2 = zzgxj.zza(0, 1);
        zza2.zza(zzc8);
        zzgxj zzc9 = zza2.zzc();
        this.zzk = zzc9;
        zzfdd zzfdd = new zzfdd(zzc9);
        this.zzl = zzfdd;
        this.zzm = zzgwx.zzc(new zzfdc(zzfbv.zza(), zzchy.zzn, zzfdd));
        this.zzn = zzgwx.zzc(new zzfeo(zzchy.zzH));
    }

    public final zzepq zza() {
        Context zza2 = this.zzb.zza.zza();
        zzgxg.zzb(zza2);
        zzbxx zzbxx = new zzbxx();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        zzeru zzeru = new zzeru(zzbxx, zzfuu, zzesb.zza(this.zza), (byte[]) null);
        zzgxg.zzb(zzfuu);
        HashSet hashSet = new HashSet();
        hashSet.add(new zzent(zzeru, 0, (ScheduledExecutorService) this.zzb.zzn.zzb()));
        return new zzepq(zza2, zzfuu, hashSet, (zzfen) this.zzn.zzb(), (zzdpi) this.zzb.zzZ.zzb());
    }

    public final zzfda zzb() {
        return (zzfda) this.zzm.zzb();
    }
}
