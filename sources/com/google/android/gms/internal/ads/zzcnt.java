package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcnt {
    private final zzfdk zza;
    private final zzdpi zzb;
    private final zzeyo zzc;

    public zzcnt(zzdpi zzdpi, zzeyo zzeyo, zzfdk zzfdk) {
        this.zza = zzfdk;
        this.zzb = zzdpi;
        this.zzc = zzeyo;
    }

    private static String zzb(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j10, int i10) {
        if (((Boolean) a0.c().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdk zzfdk = this.zza;
            zzfdj zzb2 = zzfdj.zzb("ad_closed");
            zzb2.zzg(this.zzc.zzb.zzb);
            zzb2.zza("show_time", String.valueOf(j10));
            zzb2.zza("ad_format", "app_open_ad");
            zzb2.zza("acr", zzb(i10));
            zzfdk.zzb(zzb2);
            return;
        }
        zzdph zza2 = this.zzb.zza();
        zza2.zze(this.zzc.zzb.zzb);
        zza2.zzb("action", "ad_closed");
        zza2.zzb("show_time", String.valueOf(j10));
        zza2.zzb("ad_format", "app_open_ad");
        zza2.zzb("acr", zzb(i10));
        zza2.zzg();
    }
}
