package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzww  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzww<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzww(zzxb<JcePrimitiveT> zzxb) {
        this.zza = zzxb;
    }

    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider zza2 : zzwt.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
