package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzdd implements zzbg {
    private final zzcg<zzbg> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    private zzdd(zzcg<zzbg> zzcg) {
        this.zza = zzcg;
        if (zzcg.zzf()) {
            zzro zzb2 = zznn.zza().zzb();
            zzrq zza2 = zznh.zza(zzcg);
            this.zzb = zzb2.zza(zza2, "aead", "encrypt");
            this.zzc = zzb2.zza(zza2, "aead", "decrypt");
            return;
        }
        zzrr zzrr = zznh.zza;
        this.zzb = zzrr;
        this.zzc = zzrr;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl next : this.zza.zza(copyOf)) {
                try {
                    byte[] zza2 = ((zzbg) next.zzf()).zza(copyOfRange, bArr2);
                    this.zzc.zza(next.zza(), (long) copyOfRange.length);
                    return zza2;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl next2 : this.zza.zze()) {
            try {
                byte[] zza3 = ((zzbg) next2.zzf()).zza(bArr, bArr2);
                this.zzc.zza(next2.zza(), (long) bArr.length);
                return zza3;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zza2 = zzwg.zza(this.zza.zza().zzh(), this.zza.zza().zzf().zzb(bArr, bArr2));
            this.zzb.zza(this.zza.zza().zza(), (long) bArr.length);
            return zza2;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
