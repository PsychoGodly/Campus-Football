package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzexm implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzexo zzd;
    final /* synthetic */ zzexp zze;

    zzexm(zzexp zzexp, zzeiq zzeiq, zzfen zzfen, zzfec zzfec, zzexo zzexo) {
        this.zze = zzexp;
        this.zza = zzeiq;
        this.zzb = zzfen;
        this.zzc = zzfec;
        this.zzd = zzexo;
    }

    public final void zza(Throwable th) {
        c3 c3Var;
        zzfen zzfen;
        zzdlz zzdlz = (zzdlz) this.zze.zze.zzd();
        if (zzdlz == null) {
            c3Var = zzezx.zzb(th, (zzeay) null);
        } else {
            c3Var = zzdlz.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdlz != null) {
                zzdlz.zza().zza(c3Var);
                this.zze.zzb.execute(new zzexl(this, c3Var));
            } else {
                this.zze.zzd.zza(c3Var);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzd();
            }
            zzezr.zzb(c3Var.f14427a, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zzg = this.zze.zzg;
                zzfec zzfec = this.zzc;
                zzfec.zza(c3Var);
                zzfec.zzg(th);
                zzfec.zzf(false);
                zzg.zzb(zzfec.zzl());
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
        zzdlu zzdlu = (zzdlu) obj;
        synchronized (this.zze) {
            zzdlu.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdlu);
            zzexp zzexp = this.zze;
            Executor zzh = zzexp.zzb;
            zzexf zzf = zzexp.zzd;
            zzf.getClass();
            zzh.execute(new zzexk(zzf));
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zzg = this.zze.zzg;
                zzfec zzfec = this.zzc;
                zzfec.zzb(zzdlu.zzp().zzb);
                zzfec.zzd(zzdlu.zzl().zzg());
                zzfec.zzf(true);
                zzg.zzb(zzfec.zzl());
            } else {
                zzfen.zzf(zzdlu.zzp().zzb);
                zzfen.zze(zzdlu.zzl().zzg());
                zzfec zzfec2 = this.zzc;
                zzfec2.zzf(true);
                zzfen.zza(zzfec2);
                zzfen.zzg();
            }
        }
    }
}
