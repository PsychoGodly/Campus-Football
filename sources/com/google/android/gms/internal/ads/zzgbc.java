package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgbc extends zzgdy {
    /* access modifiers changed from: private */
    public static final byte[] zza = new byte[0];

    zzgbc() {
        super(zzgjm.class, zzgjp.class, new zzgba(zzfvv.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzh(int i10, int i11, int i12, zzfwh zzfwh, byte[] bArr, int i13) {
        zzgme zzgme;
        zzgjf zza2 = zzgjg.zza();
        zzgjr zza3 = zzgjs.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgpe.zzv(bArr));
        zzgjs zzgjs = (zzgjs) zza3.zzal();
        zzglc zza4 = zzgld.zza();
        zza4.zzb(zzfwh.zzb());
        zza4.zzc(zzgpe.zzv(zzfwh.zzc()));
        int zzd = zzfwh.zzd() - 1;
        if (zzd == 0) {
            zzgme = zzgme.TINK;
        } else if (zzd == 1) {
            zzgme = zzgme.LEGACY;
        } else if (zzd != 2) {
            zzgme = zzgme.CRUNCHY;
        } else {
            zzgme = zzgme.RAW;
        }
        zza4.zza(zzgme);
        zzgjc zza5 = zzgjd.zza();
        zza5.zza((zzgld) zza4.zzal());
        zzgji zzc = zzgjj.zzc();
        zzc.zzb(zzgjs);
        zzc.zza((zzgjd) zza5.zzal());
        zzc.zzc(i12);
        zza2.zza((zzgjj) zzc.zzal());
        return new zzgcs((zzgjg) zza2.zzal(), i13);
    }

    public final zzgct zza() {
        return new zzgbb(this, zzgjg.class);
    }

    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgjm.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgjm zzgjm = (zzgjm) zzgrw;
        if (!zzgjm.zzg().zzD()) {
            zzgog.zzb(zzgjm.zza(), 0);
            zzgbk.zza(zzgjm.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
