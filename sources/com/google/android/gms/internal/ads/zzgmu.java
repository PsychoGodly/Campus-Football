package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgmu implements zzfvu {
    private static final Collection zza = Arrays.asList(new Integer[]{64});
    private static final byte[] zzb = new byte[16];
    private final zzgnz zzc;
    private final byte[] zzd;

    public zzgmu(byte[] bArr) throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            Collection collection = zza;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i10 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
                this.zzd = Arrays.copyOfRange(bArr, i10, length);
                this.zzc = new zzgnz(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) zzgnn.zza.zza("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] zza2 = this.zzc.zza(zzb, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr5 = bArr4[i10];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                zza2 = zzgmv.zzc(zzggg.zzb(zza2), this.zzc.zza(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = zza2.length;
                if (length >= length2) {
                    bArr3 = Arrays.copyOf(bArr6, length);
                    for (int i11 = 0; i11 < zza2.length; i11++) {
                        int i12 = (length - length2) + i11;
                        bArr3[i12] = (byte) (bArr3[i12] ^ zza2[i11]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = zzgmv.zzc(zzggg.zza(bArr6), zzggg.zzb(zza2));
            }
            byte[] zza3 = this.zzc.zza(bArr3, 16);
            byte[] bArr7 = (byte[]) zza3.clone();
            bArr7[8] = (byte) (bArr7[8] & Ascii.DEL);
            bArr7[12] = (byte) (bArr7[12] & Ascii.DEL);
            cipher.init(1, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr7));
            return zzgmv.zzb(zza3, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
