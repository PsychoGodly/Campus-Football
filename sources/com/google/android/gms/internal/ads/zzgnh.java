package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgnh implements zzgnm {
    private final zzgnv zza;

    /* synthetic */ zzgnh(zzgnv zzgnv, zzgng zzgng) {
        this.zza = zzgnv;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider zza2 : zzgnn.zzb("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, (Provider) null);
    }
}
