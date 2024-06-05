package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeoo implements zzepm {
    private final String zza;
    private final Bundle zzb;

    public zzeoo(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (!this.zzb.isEmpty()) {
            bundle.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}
