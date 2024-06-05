package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggi implements zzgfd {
    private final zzgfk zza;

    public zzggi(zzgfk zzgfk) throws GeneralSecurityException {
        if (zzgas.zza(2)) {
            this.zza = zzgfk;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
