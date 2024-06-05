package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpw extends zzfrs implements Serializable {
    final Comparator zza;

    zzfpw(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.zza = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpw) {
            return this.zza.equals(((zzfpw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
