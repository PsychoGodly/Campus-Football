package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzewe implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzddw zzd;
    final /* synthetic */ zzewf zze;

    zzewe(zzewf zzewf, zzeiq zzeiq, zzfen zzfen, zzfec zzfec, zzddw zzddw) {
        this.zze = zzewf;
        this.zza = zzeiq;
        this.zzb = zzfen;
        this.zzc = zzfec;
        this.zzd = zzddw;
    }

    public final void zza(Throwable th) {
        zzfen zzfen;
        c3 zza2 = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza2);
            if (((Boolean) a0.c().zzb(zzbar.zzhA)).booleanValue()) {
                this.zze.zzb.execute(new zzewc(this, zza2));
                this.zze.zzb.execute(new zzewd(this, zza2));
            }
            zzezr.zzb(zza2.f14427a, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zze2 = this.zze.zzg;
                zzfec zzfec = this.zzc;
                zzfec.zza(zza2);
                zzfec.zzg(th);
                zzfec.zzf(false);
                zze2.zzb(zzfec.zzl());
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
        zzdcv zzdcv = (zzdcv) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbaj zzbaj = zzbar.zzhA;
            if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                zzcyt zzn = zzdcv.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdcv);
            if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                this.zze.zzb.execute(new zzewa(this));
                this.zze.zzb.execute(new zzewb(this));
            }
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zze2 = this.zze.zzg;
                zzfec zzfec = this.zzc;
                zzfec.zzb(zzdcv.zzp().zzb);
                zzfec.zzd(zzdcv.zzl().zzg());
                zzfec.zzf(true);
                zze2.zzb(zzfec.zzl());
            } else {
                zzfen.zzf(zzdcv.zzp().zzb);
                zzfen.zze(zzdcv.zzl().zzg());
                zzfec zzfec2 = this.zzc;
                zzfec2.zzf(true);
                zzfen.zza(zzfec2);
                zzfen.zzg();
            }
        }
    }
}
