package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzko  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzko implements zzbo {
    private final zzcg<zzbo> zza;
    private final zzrr zzb;

    public zzko(zzcg<zzbo> zzcg) {
        this.zza = zzcg;
        if (zzcg.zzf()) {
            this.zzb = zznn.zza().zzb().zza(zznh.zza(zzcg), "hybrid_decrypt", "decrypt");
        } else {
            this.zzb = zznh.zza;
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl next : this.zza.zza(copyOfRange)) {
                try {
                    byte[] zza2 = ((zzbo) next.zzf()).zza(copyOfRange2, bArr2);
                    this.zzb.zza(next.zza(), (long) copyOfRange2.length);
                    return zza2;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl next2 : this.zza.zze()) {
            try {
                byte[] zza3 = ((zzbo) next2.zzf()).zza(bArr, bArr2);
                this.zzb.zza(next2.zza(), (long) bArr.length);
                return zza3;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
