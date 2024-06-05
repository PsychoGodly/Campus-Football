package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfrq extends zzfrs implements Serializable {
    static final zzfrq zza = new zzfrq();

    private zzfrq() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    public final zzfrs zza() {
        return zzfsa.zza;
    }
}
