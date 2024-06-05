package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlw implements zzlj {
    private final zzla zza;

    zzlw(zzla zzla) {
        this.zza = zzla;
    }

    public final byte[] zza(byte[] bArr, zzll zzll) throws GeneralSecurityException {
        byte[] zza2 = zzxr.zza(zzll.zza().zzb(), bArr);
        byte[] zza3 = zzwg.zza(bArr, zzll.zzb().zzb());
        byte[] zza4 = zzlt.zza(zzlt.zzb);
        zzla zzla = this.zza;
        return zzla.zza((byte[]) null, zza2, "eae_prk", zza3, "shared_secret", zza4, zzla.zza());
    }

    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzlt.zzf)) {
            return zzlt.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
