package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgeg {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgeg(Class cls, Class cls2, zzgef zzgef) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgeg)) {
            return false;
        }
        zzgeg zzgeg = (zzgeg) obj;
        if (!zzgeg.zza.equals(this.zza) || !zzgeg.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = this.zzb.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
