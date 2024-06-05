package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzqv implements zzce {
    private final zzcg<zzce> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    private zzqv(zzcg<zzce> zzcg) {
        this.zza = zzcg;
        if (zzcg.zzf()) {
            zzro zzb2 = zznn.zza().zzb();
            zzrq zza2 = zznh.zza(zzcg);
            this.zzb = zzb2.zza(zza2, "mac", "compute");
            this.zzc = zzb2.zza(zza2, "mac", "verify");
            return;
        }
        zzrr zzrr = zznh.zza;
        this.zzb = zzrr;
        this.zzc = zzrr;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzcl next : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    ((zzce) next.zze()).zza(bArr, bArr2);
                    this.zzc.zza(next.zza(), (long) bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (zzcl next2 : this.zza.zze()) {
                try {
                    ((zzce) next2.zze()).zza(bArr, bArr2);
                    this.zzc.zza(next2.zza(), (long) bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.zzc.zza();
            throw new GeneralSecurityException("invalid MAC");
        }
        this.zzc.zza();
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        try {
            byte[] zza2 = this.zza.zza().zze().zza(bArr);
            this.zzb.zza(this.zza.zza().zza(), (long) bArr.length);
            return zza2;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
