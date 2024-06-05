package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgms implements zzfvo {
    private static final ThreadLocal zza = new zzgmq();
    private static final ThreadLocal zzb = new zzgmr();
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    public zzgms(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!zzgas.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i10 == 12 || i10 == 16) {
            this.zzf = i10;
            zzgog.zza(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.zze = secretKeySpec;
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, secretKeySpec);
            byte[] zzc2 = zzc(cipher.doFinal(new byte[16]));
            this.zzc = zzc2;
            this.zzd = zzc(zzc2);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    private static byte[] zzc(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    private final byte[] zzd(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(zze(bArr3, this.zzc));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                doFinal[i15] = (byte) (doFinal[i15] ^ bArr[(i11 + i14) + i15]);
            }
            doFinal = cipher.doFinal(doFinal);
            i14 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = zze(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = copyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
                i13++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zze(doFinal, bArr2));
    }

    private static byte[] zze(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = (length - this.zzf) - 16;
        if (i10 >= 0) {
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, this.zze);
            byte[] zzd2 = zzd(cipher, 0, bArr, 0, this.zzf);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] zzd3 = zzd(cipher, 1, bArr3, 0, bArr3.length);
            byte[] zzd4 = zzd(cipher, 2, bArr, this.zzf, i10);
            int i11 = length - 16;
            byte b10 = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                b10 = (byte) (b10 | (((bArr[i11 + i12] ^ zzd3[i12]) ^ zzd2[i12]) ^ zzd4[i12]));
            }
            if (b10 == 0) {
                Cipher cipher2 = (Cipher) zzb.get();
                cipher2.init(1, this.zze, new IvParameterSpec(zzd2));
                return cipher2.doFinal(bArr, this.zzf, i10);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzf;
        if (length <= (a.e.API_PRIORITY_OTHER - i10) - 16) {
            byte[] bArr3 = new byte[(i10 + length + 16)];
            byte[] zza2 = zzgoe.zza(i10);
            System.arraycopy(zza2, 0, bArr3, 0, this.zzf);
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, this.zze);
            Cipher cipher2 = cipher;
            byte[] zzd2 = zzd(cipher2, 0, zza2, 0, zza2.length);
            byte[] zzd3 = zzd(cipher2, 1, bArr2, 0, 0);
            Cipher cipher3 = (Cipher) zzb.get();
            cipher3.init(1, this.zze, new IvParameterSpec(zzd2));
            cipher3.doFinal(bArr, 0, length, bArr3, this.zzf);
            byte[] zzd4 = zzd(cipher, 2, bArr3, this.zzf, length);
            int i11 = length + this.zzf;
            for (int i12 = 0; i12 < 16; i12++) {
                bArr3[i11 + i12] = (byte) ((zzd3[i12] ^ zzd2[i12]) ^ zzd4[i12]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
