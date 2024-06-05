package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgcf implements zzgbt {
    private final zzgbo zza;

    zzgcf(zzgbo zzgbo) {
        this.zza = zzgbo;
    }

    public final zzgbu zza(byte[] bArr) throws GeneralSecurityException {
        byte[] zzb = zzgoh.zzb();
        byte[] zza2 = zzgoh.zza(zzb, bArr);
        byte[] zzc = zzgoh.zzc(zzb);
        byte[] zzb2 = zzgmv.zzb(zzc, bArr);
        byte[] zzd = zzgcc.zzd(zzgcc.zzb);
        zzgbo zzgbo = this.zza;
        return new zzgbu(zzgbo.zzb((byte[]) null, zza2, "eae_prk", zzb2, "shared_secret", zzd, zzgbo.zza()), zzc);
    }

    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzgcc.zzf)) {
            return zzgcc.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
