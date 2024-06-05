package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgeu {
    private Integer zza;
    private Integer zzb;
    private zzgev zzc;

    private zzgeu() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    /* synthetic */ zzgeu(zzget zzget) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgev.zzd;
    }

    public final zzgeu zza(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 * 8)}));
    }

    public final zzgeu zzb(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgeu zzc(zzgev zzgev) {
        this.zzc = zzgev;
        return this;
    }

    public final zzgex zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        } else if (this.zzc != null) {
            return new zzgex(num.intValue(), this.zzb.intValue(), this.zzc, (zzgew) null);
        } else {
            throw new GeneralSecurityException("variant not set");
        }
    }
}
