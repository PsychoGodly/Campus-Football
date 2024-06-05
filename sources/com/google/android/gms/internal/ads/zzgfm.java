package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgfm extends zzgds {
    zzgfm(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgjz zzgjz = (zzgjz) zzgrw;
        int zzg = zzgjz.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgjz.zzh().zzE(), "HMAC");
        int zza = zzgjz.zzg().zza();
        int i10 = zzg - 2;
        if (i10 == 1) {
            return new zzgoc(new zzgob("HMACSHA1", secretKeySpec), zza);
        }
        if (i10 == 2) {
            return new zzgoc(new zzgob("HMACSHA384", secretKeySpec), zza);
        }
        if (i10 == 3) {
            return new zzgoc(new zzgob("HMACSHA256", secretKeySpec), zza);
        }
        if (i10 == 4) {
            return new zzgoc(new zzgob("HMACSHA512", secretKeySpec), zza);
        }
        if (i10 == 5) {
            return new zzgoc(new zzgob("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
