package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfyc {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzfyd zzd;

    private zzfyc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzfyc(zzfyb zzfyb) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfyd.zzc;
    }

    public final zzfyc zza(int i10) throws GeneralSecurityException {
        if (i10 == 12 || i10 == 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzfyc zzb(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzfyc zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzfyc zzd(zzfyd zzfyd) {
        this.zzd = zzfyd;
        return this;
    }

    public final zzfyf zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        } else if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        } else if (this.zzc != null) {
            int intValue = num.intValue();
            int intValue2 = this.zzb.intValue();
            this.zzc.intValue();
            return new zzfyf(intValue, intValue2, 16, this.zzd, (zzfye) null);
        } else {
            throw new GeneralSecurityException("Tag size is not set");
        }
    }
}
