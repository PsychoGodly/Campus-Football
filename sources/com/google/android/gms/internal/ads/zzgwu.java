package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzgwu implements zzgwy {
    private final Map zza;

    zzgwu(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
