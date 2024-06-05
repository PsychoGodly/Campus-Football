package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwd implements zzbg {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_NOT_FIPS;
    private static final ThreadLocal<Cipher> zzb = new zzwc();
    private static final ThreadLocal<Cipher> zzc = new zzwf();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    public zzwd(byte[] bArr, int i10) throws GeneralSecurityException {
        this(bArr, i10, new byte[0]);
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.zzh) - 16;
        if (length >= 0) {
            Cipher cipher = zzb.get();
            cipher.init(1, this.zzg);
            byte[] zza2 = zza(cipher, 0, bArr, 0, this.zzh);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] zza3 = zza(cipher, 1, bArr3, 0, bArr3.length);
            byte[] zza4 = zza(cipher, 2, bArr, this.zzh, length);
            int length2 = bArr.length - 16;
            byte b10 = 0;
            for (int i10 = 0; i10 < 16; i10++) {
                b10 = (byte) (b10 | (((bArr[length2 + i10] ^ zza3[i10]) ^ zza2[i10]) ^ zza4[i10]));
            }
            if (b10 == 0) {
                Cipher cipher2 = zzc.get();
                cipher2.init(1, this.zzg, new IvParameterSpec(zza2));
                return cipher2.doFinal(bArr, this.zzh, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private static byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpf.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzf.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i10 = this.zzh;
        if (length <= (a.e.API_PRIORITY_OTHER - i10) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i10 + 16)];
            byte[] zza2 = zzou.zza(i10);
            System.arraycopy(zza2, 0, bArr4, 0, this.zzh);
            Cipher cipher = zzb.get();
            cipher.init(1, this.zzg);
            byte[] zza3 = zza(cipher, 0, zza2, 0, zza2.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] zza4 = zza(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = zzc.get();
            cipher2.init(1, this.zzg, new IvParameterSpec(zza3));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.zzh);
            byte[] zza5 = zza(cipher, 2, bArr4, this.zzh, bArr3.length);
            int length2 = bArr3.length + this.zzh;
            for (int i11 = 0; i11 < 16; i11++) {
                bArr4[length2 + i11] = (byte) ((zza4[i11] ^ zza3[i11]) ^ zza5[i11]);
            }
            byte[] bArr6 = this.zzf;
            if (bArr6.length == 0) {
                return bArr4;
            }
            return zzwg.zza(bArr6, bArr4);
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private zzwd(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i10 == 12 || i10 == 16) {
            this.zzh = i10;
            zzxo.zza(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.zzg = secretKeySpec;
            Cipher cipher = zzb.get();
            cipher.init(1, secretKeySpec);
            byte[] zza2 = zza(cipher.doFinal(new byte[16]));
            this.zzd = zza2;
            this.zze = zza(zza2);
            this.zzf = bArr2;
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) ((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7));
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private final byte[] zza(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(zzd(bArr3, this.zzd));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = zzd(copyOfRange, this.zzd);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zze, 16);
            for (int i15 = 0; i15 < copyOfRange.length; i15++) {
                copyOf[i15] = (byte) (copyOf[i15] ^ copyOfRange[i15]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzd(doFinal, bArr2));
    }
}
