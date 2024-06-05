package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgnl implements zzgnm {
    private final zzgnv zza;

    /* synthetic */ zzgnl(zzgnv zzgnv, zzgnk zzgnk) {
        this.zza = zzgnv;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider zza2 : zzgnn.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
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
