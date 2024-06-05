package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgoc implements zzfws {
    private final zzggt zza;
    private final int zzb;

    public zzgoc(zzggt zzggt, int i10) throws GeneralSecurityException {
        this.zza = zzggt;
        this.zzb = i10;
        if (i10 >= 10) {
            zzggt.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(zzb(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }
}
