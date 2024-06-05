package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgge implements zzfws {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    /* synthetic */ zzgge(zzfxb zzfxb, zzggd zzggd) {
        zzggm zzggm;
        this.zza = zzfxb;
        if (zzfxb.zzf()) {
            zzggn zzb2 = zzgdd.zza().zzb();
            zzggs zza2 = zzgda.zza(zzfxb);
            this.zzb = zzb2.zza(zza2, "mac", "compute");
            zzggm = zzb2.zza(zza2, "mac", "verify");
        } else {
            zzggm = zzgda.zza;
            this.zzb = zzggm;
        }
        this.zzc = zzggm;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwx : this.zza.zze(copyOf)) {
                if (zzfwx.zzc().equals(zzgme.LEGACY)) {
                    bArr3 = zzgmv.zzb(bArr2, zzggf.zzb);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzfws) zzfwx.zze()).zza(copyOfRange, bArr3);
                    zzfwx.zza();
                    return;
                } catch (GeneralSecurityException e10) {
                    zzggf.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (zzfwx zzfwx2 : this.zza.zze(zzfvt.zza)) {
                try {
                    ((zzfws) zzfwx2.zze()).zza(bArr, bArr2);
                    zzfwx2.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zza().zzc().equals(zzgme.LEGACY)) {
            bArr = zzgmv.zzb(bArr, zzggf.zzb);
        }
        try {
            byte[] zzb2 = zzgmv.zzb(this.zza.zza().zzg(), ((zzfws) this.zza.zza().zze()).zzb(bArr));
            this.zza.zza().zza();
            return zzb2;
        } catch (GeneralSecurityException e10) {
            throw e10;
        }
    }
}
