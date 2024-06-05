package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgaw extends zzgcu {
    zzgaw() {
        super(zzgip.class, new zzgau(zzfvu.class));
    }

    public final zzgct zza() {
        return new zzgav(this, zzgis.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgip.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgip zzgip = (zzgip) zzgrw;
        zzgog.zzb(zzgip.zza(), 0);
        if (zzgip.zzf().zzd() != 64) {
            int zzd = zzgip.zzf().zzd();
            throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
        }
    }
}
