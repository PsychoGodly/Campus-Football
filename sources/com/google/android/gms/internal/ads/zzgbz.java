package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgbz extends zzgdy {
    public zzgbz() {
        super(zzgkq.class, zzgkt.class, new zzgbx(zzfvv.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i10, int i11, int i12, int i13) {
        zzgkm zza = zzgkn.zza();
        zza.zzc(i10);
        zza.zzb(i11);
        zza.zza(i12);
        zzgkj zza2 = zzgkk.zza();
        zza2.zza((zzgkn) zza.zzal());
        return new zzgcs((zzgkk) zza2.zzal(), i13);
    }

    public final zzgct zza() {
        return new zzgby(this, zzgkk.class);
    }

    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgkq.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgkq zzgkq = (zzgkq) zzgrw;
        if (zzgkq.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzgkq.zzk()) {
            zzgog.zzb(zzgkq.zza(), 0);
            zzgcc.zza(zzgkq.zzf().zzc());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }
}
