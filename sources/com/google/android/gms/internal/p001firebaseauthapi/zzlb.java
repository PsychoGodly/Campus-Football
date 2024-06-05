package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlb implements zzld {
    zzlb() {
    }

    public final int zza() {
        return 32;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new zzhx(bArr).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + 32);
    }

    public final int zzb() {
        return 12;
    }

    public final byte[] zzc() {
        return zzlt.zzk;
    }
}
