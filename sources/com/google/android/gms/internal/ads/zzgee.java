package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgee {
    private final Class zza;
    private final zzgoj zzb;

    /* synthetic */ zzgee(Class cls, zzgoj zzgoj, zzged zzged) {
        this.zza = cls;
        this.zzb = zzgoj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgee)) {
            return false;
        }
        zzgee zzgee = (zzgee) obj;
        if (!zzgee.zza.equals(this.zza) || !zzgee.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(this.zzb);
        return simpleName + ", object identifier: " + valueOf;
    }
}
