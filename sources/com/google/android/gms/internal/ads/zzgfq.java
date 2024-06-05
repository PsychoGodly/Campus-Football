package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgfq {
    private Integer zza;
    private Integer zzb;
    private zzgfr zzc;
    private zzgfs zzd;

    private zzgfq() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzgfq(zzgfp zzgfp) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgfs.zzd;
    }

    public final zzgfq zza(zzgfr zzgfr) {
        this.zzc = zzgfr;
        return this;
    }

    public final zzgfq zzb(int i10) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgfq zzc(int i10) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgfq zzd(zzgfs zzgfs) {
        this.zzd = zzgfs;
        return this;
    }

    public final zzgfu zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.zzb.intValue();
            zzgfr zzgfr = this.zzc;
            if (intValue >= 10) {
                if (zzgfr == zzgfr.zza) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgfr == zzgfr.zzb) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgfr == zzgfr.zzc) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgfr == zzgfr.zzd) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgfr != zzgfr.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new zzgfu(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, (zzgft) null);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.zza}));
        }
    }
}
