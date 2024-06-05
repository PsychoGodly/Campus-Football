package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzekc implements zzepm {
    private final Bundle zza;

    /* synthetic */ zzekc(Bundle bundle, zzekb zzekb) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.zza);
        }
    }
}
