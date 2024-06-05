package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeeg implements zzfuf {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzeyc zzc;
    final /* synthetic */ zzeyf zzd;
    final /* synthetic */ zzffb zze;
    final /* synthetic */ zzeyo zzf;
    final /* synthetic */ zzeeh zzg;

    zzeeg(zzeeh zzeeh, long j10, String str, zzeyc zzeyc, zzeyf zzeyf, zzffb zzffb, zzeyo zzeyo) {
        this.zzg = zzeeh;
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzeyc;
        this.zzd = zzeyf;
        this.zze = zzffb;
        this.zzf = zzeyo;
    }

    public final void zza(Throwable th) {
        Integer num;
        c3 c3Var;
        c3 zzb2;
        long b10 = this.zzg.zza.b() - this.zza;
        int i10 = 6;
        if (th instanceof TimeoutException) {
            num = null;
            i10 = 2;
        } else if (th instanceof zzedw) {
            num = null;
            i10 = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            i10 = 4;
        } else if (th instanceof zzezc) {
            num = null;
            i10 = 5;
        } else {
            if (th instanceof zzdtf) {
                if (zzezx.zza(th).f14427a == 3) {
                    i10 = 1;
                }
                if (((Boolean) a0.c().zzb(zzbar.zzbv)).booleanValue() && (th instanceof zzeax) && (zzb2 = ((zzeax) th).zzb()) != null) {
                    num = Integer.valueOf(zzb2.f14427a);
                }
            }
            num = null;
        }
        zzeeh.zzg(this.zzg, this.zzb, i10, b10, this.zzc.zzag, num);
        zzeeh zzeeh = this.zzg;
        if (zzeeh.zze) {
            zzeeh.zzb.zza(this.zzd, this.zzc, i10, th instanceof zzeax ? (zzeax) th : null, b10);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzhI)).booleanValue()) {
            zzfff zzc2 = this.zzg.zzc;
            zzffb zzffb = this.zze;
            zzeyo zzeyo = this.zzf;
            zzeyc zzeyc = this.zzc;
            zzc2.zzd(zzffb.zzc(zzeyo, zzeyc, zzeyc.zzo));
        }
        c3 zza2 = zzezx.zza(th);
        int i11 = zza2.f14427a;
        if ((i11 == 3 || i11 == 0) && (c3Var = zza2.f14430d) != null && !c3Var.f14429c.equals(MobileAds.ERROR_DOMAIN)) {
            zza2 = zzezx.zza(new zzeax(13, zza2.f14430d));
        }
        this.zzg.zzf.zze(this.zzc, b10, zza2);
    }

    public final void zzb(Object obj) {
        long b10 = this.zzg.zza.b() - this.zza;
        zzeeh.zzg(this.zzg, this.zzb, 0, b10, this.zzc.zzag, (Integer) null);
        zzeeh zzeeh = this.zzg;
        if (zzeeh.zze) {
            zzeeh.zzb.zza(this.zzd, this.zzc, 0, (zzeax) null, b10);
        }
        this.zzg.zzf.zzf(this.zzc, b10, (c3) null);
    }
}
