package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggl {
    public static final zzggl zza = new zzggj().zza();
    private final Map zzb;

    /* synthetic */ zzggl(Map map, zzggk zzggk) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggl)) {
            return false;
        }
        return this.zzb.equals(((zzggl) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
