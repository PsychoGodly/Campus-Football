package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrf implements zzpz {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final zzqc zzb;

    public zzrf(zzqc zzqc) throws GeneralSecurityException {
        if (zza.zza()) {
            this.zzb = zzqc;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
