package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgcb extends zzgcu {
    public zzgcb() {
        super(zzgkt.class, new zzgca(zzfvw.class));
    }

    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgkt.zzg(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgkt zzgkt = (zzgkt) zzgrw;
        zzgog.zzb(zzgkt.zza(), 0);
        if (zzgkt.zzl()) {
            zzgcc.zza(zzgkt.zzc());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
