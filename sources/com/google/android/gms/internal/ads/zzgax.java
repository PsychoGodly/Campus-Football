package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgax {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzgmh zzb = zzgmh.zzc();
    @Deprecated
    public static final zzgmh zzc = zzgmh.zzc();

    static {
        new zzgaw();
        try {
            zzgaz.zzd();
            if (!zzgat.zzb()) {
                zzfxf.zzo(new zzgaw(), true);
            }
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
