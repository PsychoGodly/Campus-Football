package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzele implements zzepm {
    public final double zza;
    public final boolean zzb;

    public zzele(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzezi.zza(bundle, "device");
        bundle.putBundle("device", zza2);
        Bundle zza3 = zzezi.zza(zza2, "battery");
        zza2.putBundle("battery", zza3);
        zza3.putBoolean("is_charging", this.zzb);
        zza3.putDouble("battery_level", this.zza);
    }
}
