package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgnd {
    private final ECPublicKey zza;

    public zzgnd(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzgnc zza(String str, byte[] bArr, byte[] bArr2, int i10, int i11) throws GeneralSecurityException {
        KeyPair zzb = zzgne.zzb(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zzb.getPublic();
        byte[] zze = zzgne.zze((ECPrivateKey) zzb.getPrivate(), this.zza);
        byte[] zzj = zzgne.zzj(eCPublicKey.getParams().getCurve(), i11, eCPublicKey.getW());
        int i12 = 1;
        byte[] zzb2 = zzgmv.zzb(zzj, zze);
        Mac mac = (Mac) zzgnn.zzb.zza(str);
        if (i10 <= mac.getMacLength() * 255) {
            if (bArr == null || bArr.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = mac.doFinal(zzb2);
            byte[] bArr3 = new byte[i10];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr4 = new byte[0];
            int i13 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i12);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i14 = i13 + length;
                if (i14 < i10) {
                    System.arraycopy(bArr4, 0, bArr3, i13, length);
                    i12++;
                    i13 = i14;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i13, i10 - i13);
                    return new zzgnc(zzj, bArr3);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
