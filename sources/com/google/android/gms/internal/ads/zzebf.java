package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzebf implements zzeat {
    private final zzcny zza;
    private final Context zzb;
    private final zzdmq zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzbzg zzf;
    private final zzbhr zzg;
    private final boolean zzh = ((Boolean) a0.c().zzb(zzbar.zzie)).booleanValue();

    public zzebf(zzcny zzcny, Context context, Executor executor, zzdmq zzdmq, zzeyx zzeyx, zzbzg zzbzg, zzbhr zzbhr) {
        this.zzb = context;
        this.zza = zzcny;
        this.zze = executor;
        this.zzc = zzdmq;
        this.zzd = zzeyx;
        this.zzf = zzbzg;
        this.zzg = zzbhr;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        zzdmu zzdmu = new zzdmu();
        zzfut zzm = zzfuj.zzm(zzfuj.zzh((Object) null), new zzebd(this, zzeyc, zzeyo, zzdmu), this.zze);
        zzm.zzc(new zzebe(zzdmu), this.zze);
        return zzm;
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        zzeyh zzeyh = zzeyc.zzt;
        return (zzeyh == null || zzeyh.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(zzeyc zzeyc, zzeyo zzeyo, zzdmu zzdmu, Object obj) throws Exception {
        zzeyc zzeyc2 = zzeyc;
        zzeyo zzeyo2 = zzeyo;
        zzcei zza2 = this.zzc.zza(this.zzd.zze, zzeyc2, zzeyo2.zzb.zzb);
        zza2.zzZ(zzeyc2.zzX);
        zzdmu.zza(this.zzb, (View) zza2);
        zzbzs zzbzs = new zzbzs();
        zzcny zzcny = this.zza;
        zzcrb zzcrb = new zzcrb(zzeyo2, zzeyc2, (String) null);
        zzebh zzebh = r1;
        zzebh zzebh2 = new zzebh(this.zzf, zzbzs, zzeyc, zza2, this.zzd, this.zzh, this.zzg);
        zzcnv zza3 = zzcny.zza(zzcrb, new zzdcz(zzebh, zza2), new zzcnw(zzeyc2.zzab));
        zza3.zzh().zzi(zza2, false, this.zzh ? this.zzg : null);
        zzbzs.zzd(zza3);
        zza3.zzc().zzm(new zzebb(zza2), zzbzn.zzf);
        zza3.zzh();
        zzeyh zzeyh = zzeyc2.zzt;
        return zzfuj.zzl(zzdmp.zzj(zza2, zzeyh.zzb, zzeyh.zza), new zzebc(this, zza2, zzeyc2, zza3), this.zze);
    }
}
