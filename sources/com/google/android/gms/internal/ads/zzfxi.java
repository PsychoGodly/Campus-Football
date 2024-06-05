package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfxi {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final zzgmh zzc;
    @Deprecated
    public static final zzgmh zzd;
    @Deprecated
    public static final zzgmh zze;

    static {
        new zzfxq();
        new zzfyr();
        new zzfzi();
        new zzfya();
        new zzfzy();
        new zzgac();
        new zzfzv();
        new zzgaf();
        zzgmh zzc2 = zzgmh.zzc();
        zzc = zzc2;
        zzd = zzc2;
        zze = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxn.zze();
        zzgga.zza();
        zzfxf.zzo(new zzfxq(), true);
        zzfxf.zzo(new zzfyr(), true);
        zzfzb.zza();
        if (!zzgat.zzb()) {
            zzfxf.zzo(new zzfya(), true);
            zzfyk.zza();
            zzfzi.zzg(true);
            zzfxf.zzo(new zzfzv(), true);
            zzfxf.zzo(new zzfzy(), true);
            zzfxf.zzo(new zzgac(), true);
            zzfxf.zzo(new zzgaf(), true);
        }
    }
}
