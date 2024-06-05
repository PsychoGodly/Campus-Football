package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgay implements zzfvu {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    public zzgay(zzfxb zzfxb) {
        zzggm zzggm;
        this.zza = zzfxb;
        if (zzfxb.zzf()) {
            zzggn zzb2 = zzgdd.zza().zzb();
            zzggs zza2 = zzgda.zza(zzfxb);
            this.zzb = zzb2.zza(zza2, "daead", "encrypt");
            zzggm = zzb2.zza(zza2, "daead", "decrypt");
        } else {
            zzggm = zzgda.zza;
            this.zzb = zzggm;
        }
        this.zzc = zzggm;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb2 = zzgmv.zzb(this.zza.zza().zzg(), ((zzfvu) this.zza.zza().zze()).zza(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzb2;
        } catch (GeneralSecurityException e10) {
            throw e10;
        }
    }
}
