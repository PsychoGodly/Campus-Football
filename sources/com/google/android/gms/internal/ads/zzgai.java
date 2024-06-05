package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgai {
    private static final ThreadLocal zza = new zzgah();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzgai(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (zzgas.zza(2)) {
            zzgog.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            this.zzc = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec zzc(byte[] bArr, int i10, int i11) throws GeneralSecurityException {
        if (!zzgof.zza() || zzgek.zzc().intValue() > 19) {
            return new GCMParameterSpec(128, bArr, 0, 12);
        }
        return new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i10 = 12;
        if (bArr.length == 12) {
            boolean z10 = this.zzc;
            int i11 = true != z10 ? 16 : 28;
            int length = bArr2.length;
            if (length < i11) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z10 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                AlgorithmParameterSpec zzc2 = zzc(bArr, 0, 12);
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(2, this.zzb, zzc2);
                if (!(bArr3 == null || bArr3.length == 0)) {
                    ((Cipher) threadLocal.get()).updateAAD(bArr3);
                }
                boolean z11 = this.zzc;
                if (true != z11) {
                    i10 = 0;
                }
                if (z11) {
                    length -= 12;
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, i10, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z10 = this.zzc;
                byte[] bArr4 = new byte[(z10 ? length + 28 : length + 16)];
                if (z10) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec zzc2 = zzc(bArr, 0, 12);
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(1, this.zzb, zzc2);
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.zzc ? 0 : 12);
                if (doFinal == length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
