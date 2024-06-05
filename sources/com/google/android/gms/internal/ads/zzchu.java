package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzchu extends zzeqw {
    private final zzeqk zza;
    private final zzchy zzb;
    private final zzchu zzc = this;
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

    /* synthetic */ zzchu(zzchy zzchy, zzeqk zzeqk, zzcht zzcht) {
        this.zzb = zzchy;
        this.zza = zzeqk;
        this.zzd = zzgwx.zzc(new zzfeo(zzchy.zzH));
        zzeqs zzeqs = new zzeqs(zzeqk);
        this.zze = zzeqs;
        zzgxl zzc2 = zzgwx.zzc(zzdoh.zza());
        this.zzf = zzc2;
        zzgxl zzc3 = zzgwx.zzc(zzdof.zza());
        this.zzg = zzc3;
        zzgxl zzc4 = zzgwx.zzc(zzdoj.zza());
        this.zzh = zzc4;
        zzgxl zzc5 = zzgwx.zzc(zzdol.zza());
        this.zzi = zzc5;
        zzgxb zzc6 = zzgxc.zzc(4);
        zzc6.zzb(zzfcu.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfcu.BUILD_URL, zzc3);
        zzc6.zzb(zzfcu.HTTP, zzc4);
        zzc6.zzb(zzfcu.PRE_PROCESS, zzc5);
        zzgxc zzc7 = zzc6.zzc();
        this.zzj = zzc7;
        zzgxl zzc8 = zzgwx.zzc(new zzdom(zzeqs, zzchy.zzh, zzfbv.zza(), zzc7));
        this.zzk = zzc8;
        zzgxi zza2 = zzgxj.zza(0, 1);
        zza2.zza(zzc8);
        zzgxj zzc9 = zza2.zzc();
        this.zzl = zzc9;
        zzfdd zzfdd = new zzfdd(zzc9);
        this.zzm = zzfdd;
        this.zzn = zzgwx.zzc(new zzfdc(zzfbv.zza(), zzchy.zzn, zzfdd));
    }

    public final zzepq zza() {
        Context zza2 = this.zzb.zza.zza();
        zzgxg.zzb(zza2);
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        zzbxx zzbxx = new zzbxx();
        zzgxg.zzb(zzfuu);
        zzepn zza3 = zzesq.zza(new zzeru(zzbxx, zzfuu, zzeql.zza(this.zza), (byte[]) null), zzenn.zza(), (ScheduledExecutorService) this.zzb.zzn.zzb(), 0);
        Context zza4 = this.zzb.zza.zza();
        zzgxg.zzb(zza4);
        zzepn zzb2 = zzesq.zzb(new zzese(new zzbrg(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zza4, (byte[]) null), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzbya zzbya = new zzbya();
        Context zza5 = this.zzb.zza.zza();
        zzgxg.zzb(zza5);
        zzgxg.zzb(zzfuu);
        zzepn zza6 = zzesr.zza(zzeqe.zza(zzbya, zza5, (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfuu, zzeqm.zza(this.zza), zzeqo.zza(this.zza), zzeqp.zza(this.zza)), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzgxg.zzb(zzfuu);
        zzepn zzc2 = zzesq.zzc(new zzesz(zzfuu), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzeso zzeso = zzeso.zza;
        Context zza7 = this.zzb.zza.zza();
        zzgxg.zzb(zza7);
        String zza8 = zzeql.zza(this.zza);
        zzgxg.zzb(zzfuu);
        zzeqy zzeqy = new zzeqy((zzbtp) null, zza7, zza8, zzfuu);
        zzepn[] zzepnArr = new zzepn[6];
        zzavt zzavt = new zzavt();
        zzgxg.zzb(zzfuu);
        Context zza9 = this.zzb.zza.zza();
        zzgxg.zzb(zza9);
        zzepnArr[0] = new zzern(zzavt, zzfuu, zza9, (byte[]) null);
        zzbac zzbac = new zzbac();
        zzgxg.zzb(zzfuu);
        zzepnArr[1] = new zzery(zzbac, zzfuu, zzeqn.zza(this.zza), (byte[]) null);
        zzbya zzbya2 = new zzbya();
        zzgxg.zzb(zzfuu);
        zzepn[] zzepnArr2 = zzepnArr;
        zzeqy zzeqy2 = zzeqy;
        zzepnArr2[2] = new zzeqi(zzbya2, zzfuu, zzeqq.zza(this.zza), zzeqr.zza(this.zza), zzeqm.zza(this.zza), (byte[]) null);
        zzbya zzbya3 = new zzbya();
        int zza10 = zzeqm.zza(this.zza);
        Context zza11 = this.zzb.zza.zza();
        zzgxg.zzb(zza11);
        zzgxg.zzb(zzfuu);
        zzepnArr2[3] = new zzerj(zzbya3, zza10, zza11, (zzbyj) this.zzb.zzag.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfuu, zzeql.zza(this.zza), (byte[]) null);
        zzepnArr2[4] = (zzepn) this.zzb.zzaI.zzb();
        zzgxg.zzb(zzfuu);
        zzepnArr2[5] = zzerf.zza(zzeql.zza(this.zza), new zzavh(), (zzbyj) this.zzb.zzag.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfuu);
        return new zzepq(zza2, zzfuu, zzfqp.zzp(zza3, zzb2, zza6, zzc2, zzeso, zzeqy2, zzepnArr2), (zzfen) this.zzd.zzb(), (zzdpi) this.zzb.zzZ.zzb());
    }

    public final zzfda zzb() {
        return (zzfda) this.zzn.zzb();
    }
}
