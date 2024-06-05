package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbr implements zzfvv {
    private final zzgbv zza;
    private final zzgbt zzb;
    private final zzgbp zzc;
    private final zzgbo zzd;

    private zzgbr(zzgbv zzgbv, zzgbt zzgbt, zzgbo zzgbo, zzgbp zzgbp, int i10, byte[] bArr) {
        this.zza = zzgbv;
        this.zzb = zzgbt;
        this.zzd = zzgbo;
        this.zzc = zzgbp;
    }

    static zzgbr zza(zzgkq zzgkq) throws GeneralSecurityException {
        int i10;
        zzgbv zzgbv;
        if (!zzgkq.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzgkq.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzgkq.zzg().zzD()) {
            zzgkn zzc2 = zzgkq.zzf().zzc();
            zzgbt zzb2 = zzgbw.zzb(zzc2);
            zzgbo zzc3 = zzgbw.zzc(zzc2);
            zzgbp zza2 = zzgbw.zza(zzc2);
            int zzg = zzc2.zzg();
            int i11 = zzg - 2;
            if (i11 == 1) {
                i10 = 32;
            } else if (i11 == 2) {
                i10 = 65;
            } else if (i11 == 3) {
                i10 = 97;
            } else if (i11 == 4) {
                i10 = 133;
            } else {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgkh.zza(zzg)));
            }
            int zzg2 = zzgkq.zzf().zzc().zzg() - 2;
            if (zzg2 == 1) {
                zzgbv = zzgcg.zza(zzgkq.zzg().zzE());
            } else if (zzg2 == 2 || zzg2 == 3 || zzg2 == 4) {
                zzgbv = zzgce.zza(zzgkq.zzg().zzE(), zzgkq.zzf().zzh().zzE(), zzgcc.zzg(zzgkq.zzf().zzc().zzg()));
            } else {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return new zzgbr(zzgbv, zzb2, zzc3, zza2, i10, (byte[]) null);
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
