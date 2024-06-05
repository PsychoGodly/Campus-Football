package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzewf implements zzeir {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcgd zzc;
    /* access modifiers changed from: private */
    public final zzeib zzd;
    /* access modifiers changed from: private */
    public final zzexf zze;
    private zzbbp zzf;
    /* access modifiers changed from: private */
    public final zzfep zzg;
    private final zzeyv zzh;
    /* access modifiers changed from: private */
    public zzfut zzi;

    public zzewf(Context context, Executor executor, zzcgd zzcgd, zzeib zzeib, zzexf zzexf, zzeyv zzeyv) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgd;
        this.zzd = zzeib;
        this.zzh = zzeyv;
        this.zze = zzexf;
        this.zzg = zzcgd.zzy();
    }

    public final boolean zza() {
        zzfut zzfut = this.zzi;
        return zzfut != null && !zzfut.isDone();
    }

    public final boolean zzb(u4 u4Var, String str, zzeip zzeip, zzeiq zzeiq) {
        zzddw zzf2;
        zzfen zzfen;
        if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzevz(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue() && u4Var.f14556g) {
                this.zzc.zzj().zzm(true);
            }
            z4 z4Var = ((zzevy) zzeip).zza;
            zzeyv zzeyv = this.zzh;
            zzeyv.zzs(str);
            zzeyv.zzr(z4Var);
            zzeyv.zzE(u4Var);
            zzeyx zzG = zzeyv.zzG();
            zzfec zzb2 = zzfeb.zzb(this.zza, zzfem.zzf(zzG), 4, u4Var);
            if (((Boolean) a0.c().zzb(zzbar.zzhA)).booleanValue()) {
                zzddv zzf3 = this.zzc.zzf();
                zzctx zzctx = new zzctx();
                zzctx.zzd(this.zza);
                zzctx.zzh(zzG);
                zzf3.zze(zzctx.zzi());
                zzczz zzczz = new zzczz();
                zzczz.zzj(this.zzd, this.zzb);
                zzczz.zzk(this.zzd, this.zzb);
                zzf3.zzd(zzczz.zzn());
                zzf3.zzc(new zzegk(this.zzf));
                zzf2 = zzf3.zzf();
            } else {
                zzczz zzczz2 = new zzczz();
                zzexf zzexf = this.zze;
                if (zzexf != null) {
                    zzczz2.zze(zzexf, this.zzb);
                    zzczz2.zzf(this.zze, this.zzb);
                    zzczz2.zzb(this.zze, this.zzb);
                }
                zzddv zzf4 = this.zzc.zzf();
                zzctx zzctx2 = new zzctx();
                zzctx2.zzd(this.zza);
                zzctx2.zzh(zzG);
                zzf4.zze(zzctx2.zzi());
                zzczz2.zzj(this.zzd, this.zzb);
                zzczz2.zze(this.zzd, this.zzb);
                zzczz2.zzf(this.zzd, this.zzb);
                zzczz2.zzb(this.zzd, this.zzb);
                zzczz2.zza(this.zzd, this.zzb);
                zzczz2.zzl(this.zzd, this.zzb);
                zzczz2.zzk(this.zzd, this.zzb);
                zzczz2.zzi(this.zzd, this.zzb);
                zzczz2.zzc(this.zzd, this.zzb);
                zzf4.zzd(zzczz2.zzn());
                zzf4.zzc(new zzegk(this.zzf));
                zzf2 = zzf4.zzf();
            }
            zzddw zzddw = zzf2;
            if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                zzfen zzf5 = zzddw.zzf();
                zzf5.zzh(4);
                zzf5.zzb(u4Var.f14566q);
                zzfen = zzf5;
            } else {
                zzfen = null;
            }
            zzcrt zza2 = zzddw.zza();
            zzfut zzi2 = zza2.zzi(zza2.zzj());
            this.zzi = zzi2;
            zzfuj.zzq(zzi2, new zzewe(this, zzeiq, zzfen, zzb2, zzddw), this.zzb);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzezx.zzd(6, (String) null, (c3) null));
    }

    public final void zzi(zzbbp zzbbp) {
        this.zzf = zzbbp;
    }
}
