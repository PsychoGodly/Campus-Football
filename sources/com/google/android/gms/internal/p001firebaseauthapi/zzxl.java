package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxl implements zzrx {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_NOT_FIPS;
    private final SecretKey zzb;
    private byte[] zzc;
    private byte[] zzd;

    public zzxl(byte[] bArr) throws GeneralSecurityException {
        zzxo.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb2 = zzrd.zzb(zza2.doFinal(new byte[16]));
        this.zzc = zzb2;
        this.zzd = zzrd.zzb(zzb2);
    }

    private static Cipher zza() throws GeneralSecurityException {
        if (zza.zza()) {
            return zzwt.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArr2;
        if (i10 <= 16) {
            Cipher zza2 = zza();
            zza2.init(1, this.zzb);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if ((max << 4) == bArr.length) {
                bArr2 = zzwg.zza(bArr, (max - 1) << 4, this.zzc, 0, 16);
            } else {
                bArr2 = zzwg.zza(zzrd.zza(Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length)), this.zzd);
            }
            byte[] bArr3 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr3 = zza2.doFinal(zzwg.zza(bArr3, 0, bArr, i11 << 4, 16));
            }
            return Arrays.copyOf(zza2.doFinal(zzwg.zza(bArr2, bArr3)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
