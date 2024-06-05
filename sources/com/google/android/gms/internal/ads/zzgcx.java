package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgcx extends zzfwu {
    private final zzgea zza;

    public zzgcx(zzgea zzgea) {
        this.zza = zzgea;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcx)) {
            return false;
        }
        zzgea zzgea = ((zzgcx) obj).zza;
        if (!this.zza.zzb().zze().equals(zzgea.zzb().zze()) || !this.zza.zzb().zzg().equals(zzgea.zzb().zzg()) || !this.zza.zzb().zzf().equals(zzgea.zzb().zzf())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgea zzgea = this.zza;
        return Arrays.hashCode(new Object[]{zzgea.zzb(), zzgea.zzd()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzb().zzg();
        zzgme zze = this.zza.zzb().zze();
        zzgme zzgme = zzgme.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzgea zza() {
        return this.zza;
    }
}
