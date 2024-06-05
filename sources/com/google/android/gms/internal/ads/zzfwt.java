package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwt {
    @Deprecated
    public static final zzfwp zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgll zzh = zzgll.zzh(bArr, zzgpy.zza());
            for (zzglk zzglk : zzh.zzi()) {
                if (zzglk.zzc().zzc() == zzgkx.UNKNOWN_KEYMATERIAL || zzglk.zzc().zzc() == zzgkx.SYMMETRIC || zzglk.zzc().zzc() == zzgkx.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwp.zza(zzh);
        } catch (zzgqy unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
