package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfsa extends zzfrs implements Serializable {
    static final zzfsa zza = new zzfsa();

    private zzfsa() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final zzfrs zza() {
        return zzfrq.zza;
    }
}
