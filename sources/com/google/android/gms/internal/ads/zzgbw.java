package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbw {
    static zzgbp zza(zzgkn zzgkn) throws GeneralSecurityException {
        if (zzgkn.zze() == 3) {
            return new zzgbm(16);
        }
        if (zzgkn.zze() == 4) {
            return new zzgbm(32);
        }
        if (zzgkn.zze() == 5) {
            return new zzgbn();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static zzgbt zzb(zzgkn zzgkn) throws GeneralSecurityException {
        if (zzgkn.zzg() == 3) {
            return new zzgcf(new zzgbo("HmacSha256"));
        }
        if (zzgkn.zzg() == 4) {
            return zzgcd.zzc(1);
        }
        if (zzgkn.zzg() == 5) {
            return zzgcd.zzc(2);
        }
        if (zzgkn.zzg() == 6) {
            return zzgcd.zzc(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static zzgbo zzc(zzgkn zzgkn) {
        if (zzgkn.zzf() == 3) {
            return new zzgbo("HmacSha256");
        }
        if (zzgkn.zzf() == 4) {
            return new zzgbo("HmacSha384");
        }
        if (zzgkn.zzf() == 5) {
            return new zzgbo("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
