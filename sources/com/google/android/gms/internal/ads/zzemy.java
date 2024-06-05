package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzemy implements zzepm {
    public final Bundle zza;

    public zzemy(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzezi.zza(bundle, "device");
        zza2.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza2);
    }
}
