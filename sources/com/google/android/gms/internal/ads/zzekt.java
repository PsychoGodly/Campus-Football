package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzekt implements zzepm {
    final String zza;
    final int zzb;

    public zzekt(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle zza2 = zzezi.zza(bundle, "pii");
            bundle.putBundle("pii", zza2);
            zza2.putString("pvid", this.zza);
            zza2.putInt("pvid_s", this.zzb);
        }
    }
}
