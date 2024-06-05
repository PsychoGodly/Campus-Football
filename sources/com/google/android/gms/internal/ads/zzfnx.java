package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzfnx implements Serializable, zzfnv {
    private final List zza;

    /* synthetic */ zzfnx(List list, zzfnw zzfnw) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfnx) {
            return this.zza.equals(((zzfnx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object next : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(next);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (!((zzfnv) this.zza.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
