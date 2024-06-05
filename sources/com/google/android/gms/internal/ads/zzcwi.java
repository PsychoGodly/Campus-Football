package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcwi extends zzczy implements zzbgi {
    private final Bundle zzb = new Bundle();

    zzcwi(Set set) {
        super(set);
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzp(zzcwh.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
