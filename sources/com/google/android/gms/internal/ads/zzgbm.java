package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbm implements zzgbp {
    private final int zza;

    zzgbm(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    public final int zza() {
        return this.zza;
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzgcc.zzi;
        }
        if (i10 == 32) {
            return zzgcc.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzgai(bArr, false).zzb(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}
