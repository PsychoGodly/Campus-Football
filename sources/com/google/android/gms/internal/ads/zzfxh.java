package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfxh {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzglq zza(zzgll zzgll) {
        zzgln zza2 = zzglq.zza();
        zza2.zzb(zzgll.zzc());
        for (zzglk zzglk : zzgll.zzi()) {
            zzglo zza3 = zzglp.zza();
            zza3.zzc(zzglk.zzc().zzg());
            zza3.zzd(zzglk.zzk());
            zza3.zzb(zzglk.zzf());
            zza3.zza(zzglk.zza());
            zza2.zza((zzglp) zza3.zzal());
        }
        return (zzglq) zza2.zzal();
    }

    public static void zzb(zzgll zzgll) throws GeneralSecurityException {
        int zzc = zzgll.zzc();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzglk zzglk : zzgll.zzi()) {
            if (zzglk.zzk() == 3) {
                if (!zzglk.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzglk.zza())}));
                } else if (zzglk.zzf() == zzgme.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzglk.zza())}));
                } else if (zzglk.zzk() != 2) {
                    if (zzglk.zza() == zzc) {
                        if (!z10) {
                            z10 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z11 &= zzglk.zzc().zzc() == zzgkx.ASYMMETRIC_PUBLIC;
                    i10++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzglk.zza())}));
                }
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
