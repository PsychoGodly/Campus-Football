package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzmb implements zzbg {
    private static final String zza = "zzmb";
    private final SecretKey zzb;

    zzmb(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.zzb = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }
    }

    private static void zza() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.zzb, gCMParameterSpec);
        instance.updateAAD(bArr2);
        return instance.doFinal(bArr, 12, bArr.length - 12);
    }

    private final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.zzb);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return zzd(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            zza();
            return zzd(bArr, bArr2);
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            try {
                return zzc(bArr, bArr2);
            } catch (AEADBadTagException e10) {
                throw e10;
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e11);
                zza();
                return zzc(bArr, bArr2);
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
