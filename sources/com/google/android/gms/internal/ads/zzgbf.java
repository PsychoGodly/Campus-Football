package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgbf {
    @Deprecated
    public static final zzgmh zza = zzgmh.zzc();
    @Deprecated
    public static final zzgmh zzb = zzgmh.zzc();
    @Deprecated
    public static final zzgmh zzc = zzgmh.zzc();

    static {
        new zzgbe();
        new zzgbc();
        try {
            zzgbh.zzd();
            zzgbj.zzd();
            zzfxi.zza();
            if (!zzgat.zzb()) {
                zzfxf.zzm(new zzgbc(), new zzgbe(), true);
                zzfxf.zzm(new zzgbz(), new zzgcb(), true);
            }
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
