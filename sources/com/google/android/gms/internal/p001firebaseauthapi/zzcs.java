package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcs {
    private static final zzcs zza = new zzcs();

    private zzcs() {
    }

    static zzcs zza() {
        return zza;
    }

    public static zzcs zza(zzcs zzcs) throws GeneralSecurityException {
        if (zzcs != null) {
            return zzcs;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
