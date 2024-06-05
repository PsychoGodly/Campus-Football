package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfsb extends zzfrs implements Serializable {
    final zzfrs zza;

    zzfsb(zzfrs zzfrs) {
        this.zza = zzfrs;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsb) {
            return this.zza.equals(((zzfsb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        zzfrs zzfrs = this.zza;
        Objects.toString(zzfrs);
        return zzfrs.toString().concat(".reverse()");
    }

    public final zzfrs zza() {
        return this.zza;
    }
}
