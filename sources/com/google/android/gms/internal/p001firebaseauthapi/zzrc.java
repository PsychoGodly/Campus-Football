package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrc implements zzpz {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_NOT_FIPS;
    private final zzph zzb;

    public zzrc(zzph zzph) throws GeneralSecurityException {
        if (zza.zza()) {
            this.zzb = zzph;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
