package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggh implements zzgfd {
    private final zzgeo zza;

    public zzggh(zzgeo zzgeo) throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            this.zza = zzgeo;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
