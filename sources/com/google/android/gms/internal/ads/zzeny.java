package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeny implements zzepm {
    private final Bundle zza;

    public zzeny(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
