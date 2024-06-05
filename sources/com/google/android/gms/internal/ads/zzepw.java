package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzepw implements zzepm {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzepw(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = z10;
        this.zzf = i13;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        boolean z10 = true;
        zzezi.zzf(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i10 = this.zzb;
        if (i10 == -2) {
            z10 = false;
        }
        zzezi.zze(bundle, "cnt", i10, z10);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza2 = zzezi.zza(bundle, "device");
        bundle.putBundle("device", zza2);
        Bundle zza3 = zzezi.zza(zza2, "network");
        zza2.putBundle("network", zza3);
        zza3.putInt("active_network_state", this.zzf);
        zza3.putBoolean("active_network_metered", this.zze);
    }
}
