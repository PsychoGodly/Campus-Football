package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggs {
    private final zzggl zza;
    private final List zzb;
    private final Integer zzc;

    /* synthetic */ zzggs(zzggl zzggl, List list, Integer num, zzggr zzggr) {
        this.zza = zzggl;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggs)) {
            return false;
        }
        zzggs zzggs = (zzggs) obj;
        if (this.zza.equals(zzggs.zza) && this.zzb.equals(zzggs.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzggs.zzc;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }
}
