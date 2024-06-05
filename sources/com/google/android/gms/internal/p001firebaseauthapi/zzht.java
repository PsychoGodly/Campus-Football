package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzht  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzht {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final ThreadLocal<Cipher> zzb = new zzhw();
    private final SecretKey zzc;
    private final boolean zzd;

    public zzht(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (zza.zza()) {
            zzxo.zza(bArr.length);
            this.zzc = new SecretKeySpec(bArr, "AES");
            this.zzd = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        Integer zzb2 = zzpf.zzb();
        if (zzb2 == null || zzb2.intValue() > 19) {
            return new GCMParameterSpec(128, bArr, 0, length);
        }
        return new IvParameterSpec(bArr, 0, length);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i10;
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        } else if (bArr2.length <= 2147483619) {
            boolean z10 = this.zzd;
            if (z10) {
                i10 = bArr2.length + 12;
            } else {
                i10 = bArr2.length;
            }
            byte[] bArr4 = new byte[(i10 + 16)];
            if (z10) {
                System.arraycopy(bArr, 0, bArr4, 0, 12);
            }
            AlgorithmParameterSpec zza2 = zza(bArr);
            ThreadLocal<Cipher> threadLocal = zzb;
            threadLocal.get().init(1, this.zzc, zza2);
            if (!(bArr3 == null || bArr3.length == 0)) {
                threadLocal.get().updateAAD(bArr3);
            }
            int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, this.zzd ? 12 : 0);
            if (doFinal == bArr2.length + 16) {
                return bArr4;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr2.length)}));
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length == 12) {
            boolean z10 = this.zzd;
            if (bArr2.length >= (z10 ? 28 : 16)) {
                int i10 = 0;
                if (!z10 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    AlgorithmParameterSpec zza2 = zza(bArr);
                    ThreadLocal<Cipher> threadLocal = zzb;
                    threadLocal.get().init(2, this.zzc, zza2);
                    if (!(bArr3 == null || bArr3.length == 0)) {
                        threadLocal.get().updateAAD(bArr3);
                    }
                    boolean z11 = this.zzd;
                    if (z11) {
                        i10 = 12;
                    }
                    return threadLocal.get().doFinal(bArr2, i10, z11 ? bArr2.length - 12 : bArr2.length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
