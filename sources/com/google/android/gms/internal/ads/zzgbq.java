package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbq {
    private static final byte[] zza = new byte[0];
    private final zzgbp zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgbq(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgbp zzgbp) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgbp;
    }

    static zzgbq zzc(byte[] bArr, byte[] bArr2, zzgbt zzgbt, zzgbo zzgbo, zzgbp zzgbp, byte[] bArr3) throws GeneralSecurityException {
        zzgbo zzgbo2 = zzgbo;
        byte[] zzb2 = zzgcc.zzb(zzgbt.zzb(), zzgbo.zzc(), zzgbp.zzb());
        byte[] bArr4 = zzgcc.zzl;
        byte[] bArr5 = zza;
        byte[] zzb3 = zzgmv.zzb(zzgcc.zza, zzgbo2.zze(bArr4, bArr5, "psk_id_hash", zzb2), zzgbo2.zze(bArr4, bArr3, "info_hash", zzb2));
        zzgbo zzgbo3 = zzgbo;
        byte[] zze2 = zzgbo2.zze(bArr2, bArr5, "secret", zzb2);
        byte[] bArr6 = zzb3;
        byte[] bArr7 = zzb2;
        byte[] zzd2 = zzgbo3.zzd(zze2, bArr6, "key", bArr7, zzgbp.zza());
        byte[] zzd3 = zzgbo3.zzd(zze2, bArr6, "base_nonce", bArr7, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zzgbq(bArr, zzd2, zzd3, bigInteger.shiftLeft(96).subtract(bigInteger), zzgbp);
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzc2;
        byte[] bArr = this.zze;
        BigInteger bigInteger = this.zzg;
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length > 13) {
                    throw new GeneralSecurityException("integer too large");
                } else if (length != 13) {
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                    byteArray = bArr2;
                } else if (byteArray[0] == 0) {
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                } else {
                    throw new GeneralSecurityException("integer too large");
                }
            }
            zzc2 = zzgmv.zzc(bArr, byteArray);
            if (this.zzg.compareTo(this.zzc) < 0) {
                this.zzg = this.zzg.add(BigInteger.ONE);
            } else {
                throw new GeneralSecurityException("message limit reached");
            }
        } else {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        return zzc2;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zza() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
