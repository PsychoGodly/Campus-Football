package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgga {
    @Deprecated
    public static final zzgmh zza;
    @Deprecated
    public static final zzgmh zzb;
    @Deprecated
    public static final zzgmh zzc;

    static {
        new zzgfo();
        zzgmh zzc2 = zzgmh.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzggf.zze();
        zzgfg.zzd();
        zzgfo.zzh(true);
        if (!zzgat.zzb()) {
            zzges.zzm(true);
        }
    }
}
