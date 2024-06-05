package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbi implements zzfvw {
    final zzfxb zza;
    private final zzggm zzb;

    public zzgbi(zzfxb zzfxb) {
        this.zza = zzfxb;
        this.zzb = zzfxb.zzf() ? zzgdd.zza().zzb().zza(zzgda.zza(zzfxb), "hybrid_encrypt", "encrypt") : zzgda.zza;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfxb zzfxb = this.zza;
        if (zzfxb.zza() != null) {
            try {
                byte[] zzb2 = zzgmv.zzb(zzfxb.zza().zzg(), ((zzfvw) this.zza.zza().zze()).zza(bArr, bArr2));
                this.zza.zza().zza();
                int length = bArr.length;
                return zzb2;
            } catch (GeneralSecurityException e10) {
                throw e10;
            }
        } else {
            throw new GeneralSecurityException("keyset without primary key");
        }
    }
}
