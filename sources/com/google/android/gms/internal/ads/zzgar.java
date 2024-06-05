package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgar implements zzfvo {
    private static final ThreadLocal zza = new zzgaq();
    private final SecretKey zzb;

    public zzgar(byte[] bArr) throws GeneralSecurityException {
        zzgog.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec zzc(byte[] bArr, int i10, int i11) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i11);
        } catch (ClassNotFoundException unused) {
            if (zzgof.zza()) {
                return new IvParameterSpec(bArr, 0, i11);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec zzc = zzc(bArr, 0, 12);
            ThreadLocal threadLocal = zza;
            ((Cipher) threadLocal.get()).init(2, this.zzb, zzc);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) threadLocal.get()).updateAAD(bArr2);
            }
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] zza2 = zzgoe.zza(12);
            System.arraycopy(zza2, 0, bArr3, 0, 12);
            AlgorithmParameterSpec zzc = zzc(zza2, 0, zza2.length);
            ThreadLocal threadLocal = zza;
            ((Cipher) threadLocal.get()).init(1, this.zzb, zzc);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
