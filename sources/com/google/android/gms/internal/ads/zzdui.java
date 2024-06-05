package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdui implements zzfuf {
    final /* synthetic */ zzduj zza;

    zzdui(zzduj zzduj) {
        this.zza = zzduj;
    }

    public final void zza(Throwable th) {
        if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue()) {
            Matcher matcher = zzduj.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeyo zzeyo = (zzeyo) obj;
        if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue()) {
            this.zza.zzf.zzi(zzeyo.zzb.zzb.zze);
            this.zza.zzf.zzj(zzeyo.zzb.zzb.zzf);
        }
    }
}
