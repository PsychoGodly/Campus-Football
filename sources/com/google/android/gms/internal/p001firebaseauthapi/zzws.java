package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzws<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzws(zzxb<JcePrimitiveT> zzxb) {
        this.zza = zzxb;
    }

    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider zza2 : zzwt.zza("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.zza.zza(str, (Provider) null);
    }
}
