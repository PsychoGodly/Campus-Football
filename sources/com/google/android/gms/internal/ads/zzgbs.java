package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbs implements zzfvw {
    private static final byte[] zza = new byte[0];
    private final zzgkt zzb;
    private final zzgbt zzc;
    private final zzgbp zzd;
    private final zzgbo zze;

    private zzgbs(zzgkt zzgkt, zzgbt zzgbt, zzgbo zzgbo, zzgbp zzgbp, byte[] bArr) {
        this.zzb = zzgkt;
        this.zzc = zzgbt;
        this.zze = zzgbo;
        this.zzd = zzgbp;
    }

    static zzgbs zzb(zzgkt zzgkt) throws GeneralSecurityException {
        if (!zzgkt.zzh().zzD()) {
            zzgkn zzc2 = zzgkt.zzc();
            return new zzgbs(zzgkt, zzgbw.zzb(zzc2), zzgbw.zzc(zzc2), zzgbw.zza(zzc2), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgkt zzgkt = this.zzb;
        zzgbt zzgbt = this.zzc;
        zzgbo zzgbo = this.zze;
        zzgbp zzgbp = this.zzd;
        zzgbu zza2 = zzgbt.zza(zzgkt.zzh().zzE());
        zzgbq zzc2 = zzgbq.zzc(zza2.zza(), zza2.zzb(), zzgbt, zzgbo, zzgbp, bArr3);
        return zzgmv.zzb(zzc2.zza(), zzc2.zzb(bArr, zza));
    }
}
