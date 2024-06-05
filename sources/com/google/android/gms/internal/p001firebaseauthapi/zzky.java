package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzky  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzky implements zzld {
    private final int zza;

    zzky(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return 12;
    }

    public final byte[] zzc() throws GeneralSecurityException {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzlt.zzi;
        }
        if (i10 == 32) {
            return zzlt.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.zza) {
            return new zzht(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        int length = bArr.length;
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}
