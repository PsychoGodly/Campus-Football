package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzefh implements zzeat {
    private final Context zza;
    private final zzdmq zzb;
    private final zzdlz zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzbzg zzf;
    private final zzbhr zzg;
    private final boolean zzh = ((Boolean) a0.c().zzb(zzbar.zzie)).booleanValue();

    public zzefh(Context context, zzbzg zzbzg, zzeyx zzeyx, Executor executor, zzdlz zzdlz, zzdmq zzdmq, zzbhr zzbhr) {
        this.zza = context;
        this.zzd = zzeyx;
        this.zzc = zzdlz;
        this.zze = executor;
        this.zzf = zzbzg;
        this.zzb = zzdmq;
        this.zzg = zzbhr;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        zzdmu zzdmu = new zzdmu();
        zzfut zzm = zzfuj.zzm(zzfuj.zzh((Object) null), new zzefa(this, zzeyc, zzeyo, zzdmu), this.zze);
        zzm.zzc(new zzefb(zzdmu), this.zze);
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
        zzcei zza2 = this.zzb.zza(this.zzd.zze, zzeyc2, zzeyo2.zzb.zzb);
        zza2.zzZ(zzeyc2.zzX);
        zzdmu.zza(this.zza, (View) zza2);
        zzbzs zzbzs = new zzbzs();
        zzdlz zzdlz = this.zzc;
        zzcrb zzcrb = new zzcrb(zzeyo2, zzeyc2, (String) null);
        zzefg zzefg = r1;
        zzefg zzefg2 = new zzefg(this.zza, this.zzb, this.zzd, this.zzf, zzeyc, zzbzs, zza2, this.zzg, this.zzh);
        zzdlv zze2 = zzdlz.zze(zzcrb, new zzdlw(zzefg, zza2));
        zzbzs.zzd(zze2);
        zzbif.zzb(zza2, zze2.zzg());
        zze2.zzc().zzm(new zzefc(zza2), zzbzn.zzf);
        zze2.zzl().zzi(zza2, true, this.zzh ? this.zzg : null);
        zze2.zzl();
        zzeyc zzeyc3 = zzeyc;
        zzeyh zzeyh = zzeyc3.zzt;
        return zzfuj.zzl(zzdmp.zzj(zza2, zzeyh.zzb, zzeyh.zza), new zzefd(this, zza2, zzeyc3, zze2), this.zze);
    }
}
