package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeix implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzdes zzd;
    final /* synthetic */ zzeiy zze;

    zzeix(zzeiy zzeiy, zzeiq zzeiq, zzfen zzfen, zzfec zzfec, zzdes zzdes) {
        this.zze = zzeiy;
        this.zza = zzeiq;
        this.zzb = zzfen;
        this.zzc = zzfec;
        this.zzd = zzdes;
    }

    public final void zza(Throwable th) {
        zzfen zzfen;
        c3 zza2 = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza2);
        this.zze.zzb.zzA().execute(new zzeiw(this, zza2));
        zzezr.zzb(zza2.f14427a, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
            zzfep zze2 = this.zze.zze;
            zzfec zzfec = this.zzc;
            zzfec.zza(zza2);
            zzfec.zzg(th);
            zzfec.zzf(false);
            zze2.zzb(zzfec.zzl());
            return;
        }
        zzfen.zzc(zza2);
        zzfec zzfec2 = this.zzc;
        zzfec2.zzg(th);
        zzfec2.zzf(false);
        zzfen.zza(zzfec2);
        zzfen.zzg();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfen zzfen;
        zzcqm zzcqm = (zzcqm) obj;
        synchronized (this.zze) {
            zzcqm.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcqm);
            this.zze.zzb.zzA().execute(new zzeiv(this));
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfen = this.zzb) == null) {
                zzfep zze2 = this.zze.zze;
                zzfec zzfec = this.zzc;
                zzfec.zzb(zzcqm.zzp().zzb);
                zzfec.zzd(zzcqm.zzl().zzg());
                zzfec.zzf(true);
                zze2.zzb(zzfec.zzl());
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
