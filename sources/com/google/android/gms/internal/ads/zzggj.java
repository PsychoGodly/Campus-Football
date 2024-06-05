package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggj {
    private HashMap zza = new HashMap();

    public final zzggl zza() {
        if (this.zza != null) {
            zzggl zzggl = new zzggl(Collections.unmodifiableMap(this.zza), (zzggk) null);
            this.zza = null;
            return zzggl;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
