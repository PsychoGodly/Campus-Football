package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeoz implements zzepm {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzeoz(String str, String str2, String str3, String str4, Long l10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzezi.zzc(bundle, "gmp_app_id", this.zza);
        zzezi.zzc(bundle, "fbs_aiid", this.zzb);
        zzezi.zzc(bundle, "fbs_aeid", this.zzc);
        zzezi.zzc(bundle, "apm_id_origin", this.zzd);
        Long l10 = this.zze;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
