package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.t;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzebv implements zzeat {
    private final zzcph zza;
    private final Context zzb;
    private final zzdmq zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzfnj zzf;

    public zzebv(zzcph zzcph, Context context, Executor executor, zzdmq zzdmq, zzeyx zzeyx, zzfnj zzfnj) {
        this.zzb = context;
        this.zza = zzcph;
        this.zze = executor;
        this.zzc = zzdmq;
        this.zzd = zzeyx;
        this.zzf = zzfnj;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        return zzfuj.zzm(zzfuj.zzh((Object) null), new zzebp(this, zzeyo, zzeyc), this.zze);
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        zzeyh zzeyh = zzeyc.zzt;
        return (zzeyh == null || zzeyh.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(zzeyo zzeyo, zzeyc zzeyc, Object obj) throws Exception {
        View view;
        z4 zza2 = zzezb.zza(this.zzb, zzeyc.zzv);
        zzcei zza3 = this.zzc.zza(zza2, zzeyc, zzeyo.zzb.zzb);
        zza3.zzZ(zzeyc.zzX);
        if (!((Boolean) a0.c().zzb(zzbar.zzhh)).booleanValue() || !zzeyc.zzah) {
            view = new zzdmt(this.zzb, (View) zza3, (t) this.zzf.apply(zzeyc));
        } else {
            view = zzcpy.zza(this.zzb, (View) zza3, zzeyc);
        }
        zzcol zza4 = this.zza.zza(new zzcrb(zzeyo, zzeyc, (String) null), new zzcor(view, zza3, new zzebq(zza3), zzezb.zzb(zza2)));
        zza4.zzh().zzi(zza3, false, (zzbhr) null);
        zzcvg zzc2 = zza4.zzc();
        zzebr zzebr = new zzebr(zza3);
        zzfuu zzfuu = zzbzn.zzf;
        zzc2.zzm(zzebr, zzfuu);
        zza4.zzh();
        zzeyh zzeyh = zzeyc.zzt;
        zzfut zzj = zzdmp.zzj(zza3, zzeyh.zzb, zzeyh.zza);
        if (zzeyc.zzN) {
            zzj.zzc(new zzebs(zza3), this.zze);
        }
        zzj.zzc(new zzebt(this, zza3), this.zze);
        return zzfuj.zzl(zzj, new zzebu(zza4), zzfuu);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcei zzcei) {
        zzcei.zzY();
        zzcfe zzq = zzcei.zzq();
        n4 n4Var = this.zzd.zza;
        if (n4Var != null && zzq != null) {
            zzq.zzs(n4Var);
        }
    }
}
