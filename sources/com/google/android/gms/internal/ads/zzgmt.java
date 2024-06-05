package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgmt implements zzfvo {
    private final zzgai zza;

    public zzgmt(byte[] bArr) throws GeneralSecurityException {
        if (zzgas.zza(2)) {
            this.zza = new zzgai(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zza.zzb(zzgoe.zza(12), bArr, bArr2);
    }
}
