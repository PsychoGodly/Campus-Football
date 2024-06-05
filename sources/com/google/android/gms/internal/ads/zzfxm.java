package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfxm implements zzfvo {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    /* synthetic */ zzfxm(zzfxb zzfxb, zzfxl zzfxl) {
        zzggm zzggm;
        this.zza = zzfxb;
        if (zzfxb.zzf()) {
            zzggn zzb2 = zzgdd.zza().zzb();
            zzggs zza2 = zzgda.zza(zzfxb);
            this.zzb = zzb2.zza(zza2, "aead", "encrypt");
            zzggm = zzb2.zza(zza2, "aead", "decrypt");
        } else {
            zzggm = zzgda.zza;
            this.zzb = zzggm;
        }
        this.zzc = zzggm;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwx : this.zza.zze(copyOf)) {
                try {
                    byte[] zza2 = ((zzfvo) zzfwx.zze()).zza(copyOfRange, bArr2);
                    zzfwx.zza();
                    int length2 = copyOfRange.length;
                    return zza2;
                } catch (GeneralSecurityException e10) {
                    zzfxn.zza.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (zzfwx zzfwx2 : this.zza.zze(zzfvt.zza)) {
            try {
                byte[] zza3 = ((zzfvo) zzfwx2.zze()).zza(bArr, bArr2);
                zzfwx2.zza();
                return zza3;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb2 = zzgmv.zzb(this.zza.zza().zzg(), ((zzfvo) this.zza.zza().zze()).zzb(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzb2;
        } catch (GeneralSecurityException e10) {
            throw e10;
        }
    }
}
