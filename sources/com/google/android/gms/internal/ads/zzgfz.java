package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgfz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        Class<zzgdz> cls = zzgdz.class;
        Class<zzgea> cls2 = zzgea.class;
        zzgoj zzb2 = zzgek.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzc = zzgdn.zza(zzgfv.zza, zzgfu.class, cls2);
        zzd = zzgdj.zza(zzgfw.zza, zzb2, cls2);
        zze = zzgcr.zza(zzgfx.zza, zzgfk.class, cls);
        zzf = zzgcn.zzb(zzgfy.zza, zzb2, cls);
    }

    public static void zza() throws GeneralSecurityException {
        zzgdf zzb2 = zzgdf.zzb();
        zzb2.zzf(zzc);
        zzb2.zze(zzd);
        zzb2.zzd(zze);
        zzb2.zzc(zzf);
    }
}
