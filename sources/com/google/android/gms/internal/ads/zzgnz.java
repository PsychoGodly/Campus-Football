package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgnz implements zzggt {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgnz(byte[] bArr) throws GeneralSecurityException {
        zzgog.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb2 = zzb();
        zzb2.init(1, secretKeySpec);
        byte[] zzb3 = zzggg.zzb(zzb2.doFinal(new byte[16]));
        this.zzb = zzb3;
        this.zzc = zzggg.zzb(zzb3);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            return (Cipher) zzgnn.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArr2;
        if (i10 <= 16) {
            Cipher zzb2 = zzb();
            zzb2.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = zzgmv.zzd(bArr, (max - 1) * 16, this.zzb, 0, 16);
            } else {
                bArr2 = zzgmv.zzc(zzggg.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
            }
            byte[] bArr3 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr3 = zzb2.doFinal(zzgmv.zzd(bArr3, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(zzb2.doFinal(zzgmv.zzc(bArr2, bArr3)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
