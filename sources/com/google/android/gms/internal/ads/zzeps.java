package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeps implements zzepm {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;

    public zzeps(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z15, String str6, long j10, boolean z16) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = z13;
        this.zzf = z14;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z15;
        this.zzm = str6;
        this.zzn = j10;
        this.zzo = z16;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        if (!((Boolean) a0.c().zzb(zzbar.zzjp)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle zza2 = zzezi.zza(bundle, "device");
        bundle.putBundle("device", zza2);
        zza2.putString("build", this.zzk);
        zza2.putLong("remaining_data_partition_space", this.zzn);
        Bundle zza3 = zzezi.zza(zza2, "browser");
        zza2.putBundle("browser", zza3);
        zza3.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle zza4 = zzezi.zza(zza2, "play_store");
            zza2.putBundle("play_store", zza4);
            zza4.putString("package_version", this.zzj);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzjB)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzjz)).booleanValue()) {
            zzezi.zzg(bundle, "gotmt_l", true, ((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue());
            zzezi.zzg(bundle, "gotmt_i", true, ((Boolean) a0.c().zzb(zzbar.zzjv)).booleanValue());
        }
    }
}
