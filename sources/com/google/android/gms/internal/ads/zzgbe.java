package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbe extends zzgcu {
    public zzgbe() {
        super(zzgjp.class, new zzgbd(zzfvw.class));
    }

    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgjp.zzg(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgjp zzgjp = (zzgjp) zzgrw;
        zzgog.zzb(zzgjp.zza(), 0);
        zzgbk.zza(zzgjp.zzc());
    }
}
