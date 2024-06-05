package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeth implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzetj zzd;
    final /* synthetic */ zzetk zze;

    zzeth(zzetk zzetk, zzeiq zzeiq, zzfen zzfen, zzfec zzfec, zzetj zzetj) {
        this.zze = zzetk;
        this.zza = zzeiq;
        this.zzb = zzfen;
        this.zzc = zzfec;
        this.zzd = zzetj;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [com.google.android.gms.internal.ads.zzctw, java.lang.Object] */
    public final void zza(Throwable th) {
        c3 c3Var;
        zzfen zzfen;
        zzcnu zzcnu = (zzcnu) this.zze.zze.zzd();
        if (zzcnu == null) {
            c3Var = zzezx.zzb(th, (zzeay) null);
        } else {
            c3Var = zzcnu.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcnu != null) {
                zzcnu.zzc().zza(c3Var);
                if (((Boolean) a0.c().zzb(zzbar.zzhz)).booleanValue()) {
                    this.zze.zzc.execute(new zzetg(this, c3Var));
                }
            } else {
                this.zze.zzd.zza(c3Var);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzd();
            }
            zzezr.zzb(c3Var.f14427a, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zzh = this.zze.zzh;
                zzfec zzfec = this.zzc;
                zzfec.zza(c3Var);
                zzfec.zzg(th);
                zzfec.zzf(false);
                zzh.zzb(zzfec.zzl());
            } else {
                zzfen.zzc(c3Var);
                zzfec zzfec2 = this.zzc;
                zzfec2.zzg(th);
                zzfec2.zzf(false);
                zzfen.zza(zzfec2);
                zzfen.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfen zzfen;
        zzcqm zzcqm = (zzcqm) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) a0.c().zzb(zzbar.zzhz)).booleanValue()) {
                zzcqm.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcqm);
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zzh = this.zze.zzh;
                zzfec zzfec = this.zzc;
                zzfec.zzb(zzcqm.zzp().zzb);
                zzfec.zzd(zzcqm.zzl().zzg());
                zzfec.zzf(true);
                zzh.zzb(zzfec.zzl());
            } else {
                zzfen.zzf(zzcqm.zzp().zzb);
                zzfen.zze(zzcqm.zzl().zzg());
                zzfec zzfec2 = this.zzc;
                zzfec2.zzf(true);
                zzfen.zza(zzfec2);
                zzfen.zzg();
            }
        }
    }
}
