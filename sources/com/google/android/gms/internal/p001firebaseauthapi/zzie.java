package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzie  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzie implements zzbg {
    private static final ThreadLocal<Cipher> zza = new zzid();
    private static final boolean zzb = zza();
    private final SecretKey zzc;
    private final byte[] zzd;

    public zzie(byte[] bArr) throws GeneralSecurityException {
        this(bArr, new byte[0]);
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i10, int i11) throws GeneralSecurityException {
        if (zzb) {
            return new GCMParameterSpec(128, bArr, 0, i11);
        }
        if (zzxp.zza()) {
            return new IvParameterSpec(bArr, 0, i11);
        }
        throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec zza2 = zza(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = zza;
            threadLocal.get().init(2, this.zzc, zza2);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] zza2 = zzou.zza(12);
            System.arraycopy(zza2, 0, bArr3, 0, 12);
            AlgorithmParameterSpec zza3 = zza(zza2, 0, zza2.length);
            ThreadLocal<Cipher> threadLocal = zza;
            threadLocal.get().init(1, this.zzc, zza3);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                byte[] bArr4 = this.zzd;
                if (bArr4.length == 0) {
                    return bArr3;
                }
                return zzwg.zza(bArr4, bArr3);
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private zzie(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zzd = bArr2;
        zzxo.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
    }

    private static boolean zza() {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpf.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzd.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
