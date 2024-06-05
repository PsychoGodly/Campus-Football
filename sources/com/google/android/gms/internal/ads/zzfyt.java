package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfyt {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzfyu zzd;

    private zzfyt() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzfyt(zzfys zzfys) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfyu.zzc;
    }

    public final zzfyt zza(int i10) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzfyt zzb(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzfyt zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzfyt zzd(zzfyu zzfyu) {
        this.zzd = zzfyu;
        return this;
    }

    public final zzfyw zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        } else if (this.zzc != null) {
            int intValue = num.intValue();
            this.zzb.intValue();
            this.zzc.intValue();
            return new zzfyw(intValue, 12, 16, this.zzd, (zzfyv) null);
        } else {
            throw new GeneralSecurityException("Tag size is not set");
        }
    }
}
