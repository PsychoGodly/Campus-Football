package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwn {
    private ECPrivateKey zza;

    public zzwn(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, zzwr zzwr) throws GeneralSecurityException {
        int i11 = 1;
        byte[] zza2 = zzwg.zza(bArr, zzwp.zza(this.zza, zzwp.zza(this.zza.getParams(), zzwr, bArr)));
        Mac zza3 = zzwt.zzb.zza(str);
        if (i10 <= zza3.getMacLength() * 255) {
            if (bArr2 == null || bArr2.length == 0) {
                zza3.init(new SecretKeySpec(new byte[zza3.getMacLength()], str));
            } else {
                zza3.init(new SecretKeySpec(bArr2, str));
            }
            byte[] doFinal = zza3.doFinal(zza2);
            byte[] bArr4 = new byte[i10];
            zza3.init(new SecretKeySpec(doFinal, str));
            byte[] bArr5 = new byte[0];
            int i12 = 0;
            while (true) {
                zza3.update(bArr5);
                zza3.update(bArr3);
                zza3.update((byte) i11);
                bArr5 = zza3.doFinal();
                if (bArr5.length + i12 < i10) {
                    System.arraycopy(bArr5, 0, bArr4, i12, bArr5.length);
                    i12 += bArr5.length;
                    i11++;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i12, i10 - i12);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
