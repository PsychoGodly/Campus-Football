package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeun implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzcph zzd;
    final /* synthetic */ zzeuo zze;

    zzeun(zzeuo zzeuo, zzeiq zzeiq, zzfen zzfen, zzfec zzfec, zzcph zzcph) {
        this.zze = zzeuo;
        this.zza = zzeiq;
        this.zzb = zzfen;
        this.zzc = zzfec;
        this.zzd = zzcph;
    }

    public final void zza(Throwable th) {
        zzfen zzfen;
        c3 zza2 = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza2);
            if (((Boolean) a0.c().zzb(zzbar.zzhy)).booleanValue()) {
                this.zze.zzb.execute(new zzeum(this, zza2));
            }
            zzeuo zzeuo = this.zze;
            zzeuo.zzh.zzd(zzeuo.zzj.zzc());
            zzezr.zzb(zza2.f14427a, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zzj = this.zze.zzi;
                zzfec zzfec = this.zzc;
                zzfec.zza(zza2);
                zzfec.zzg(th);
                zzfec.zzf(false);
                zzj.zzb(zzfec.zzl());
            } else {
                zzfen.zzc(zza2);
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
        zzcok zzcok = (zzcok) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcok.zzc() != null) {
                ViewParent parent = zzcok.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = MaxReward.DEFAULT_LABEL;
                    if (zzcok.zzl() != null) {
                        str = zzcok.zzl().zzg();
                    }
                    zzbza.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcok.zzc());
                }
            }
            zzbaj zzbaj = zzbar.zzhy;
            if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                zzcyt zzn = zzcok.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcok.zzc());
            this.zza.zzb(zzcok);
            if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                zzeuo zzeuo = this.zze;
                Executor zzk = zzeuo.zzb;
                zzeib zzg = zzeuo.zzd;
                zzg.getClass();
                zzk.execute(new zzeul(zzg));
            }
            this.zze.zzh.zzd(zzcok.zza());
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zzj = this.zze.zzi;
                zzfec zzfec = this.zzc;
                zzfec.zzb(zzcok.zzp().zzb);
                zzfec.zzd(zzcok.zzl().zzg());
                zzfec.zzf(true);
                zzj.zzb(zzfec.zzl());
            } else {
                zzfen.zzf(zzcok.zzp().zzb);
                zzfen.zze(zzcok.zzl().zzg());
                zzfec zzfec2 = this.zzc;
                zzfec2.zzf(true);
                zzfen.zza(zzfec2);
                zzfen.zzg();
            }
        }
    }
}
