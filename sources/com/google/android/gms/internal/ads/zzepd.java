package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzepd implements zzepm {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    zzepd(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) a0.c().zzb(zzbar.zzdk));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) a0.c().zzb(zzbar.zzfx)).booleanValue()) {
            bundle.putString("ev", "22.0.0");
        }
        Bundle zza2 = zzezi.zza(bundle, "sdk_env");
        zza2.putBoolean("mf", ((Boolean) zzbck.zza.zze()).booleanValue());
        zza2.putBoolean("instant_app", this.zza);
        zza2.putBoolean("lite", this.zzb);
        zza2.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza2);
        Bundle zza3 = zzezi.zza(zza2, "build_meta");
        zza3.putString("cl", "513548808");
        zza3.putString("rapid_rc", "dev");
        zza3.putString("rapid_rollup", "HEAD");
        zza2.putBundle("build_meta", zza3);
    }
}
