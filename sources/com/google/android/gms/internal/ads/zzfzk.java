package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfzk {
    private Integer zza;
    private zzfzl zzb;

    private zzfzk() {
        this.zza = null;
        throw null;
    }

    /* synthetic */ zzfzk(zzfzj zzfzj) {
        this.zza = null;
        this.zzb = zzfzl.zzc;
    }

    public final zzfzk zza(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzfzk zzb(zzfzl zzfzl) {
        this.zzb = zzfzl;
        return this;
    }

    public final zzfzn zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzb != null) {
            return new zzfzn(num.intValue(), this.zzb, (zzfzm) null);
        } else {
            throw new GeneralSecurityException("Variant is not set");
        }
    }
}
