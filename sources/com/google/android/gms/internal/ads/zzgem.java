package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgem {
    private zzgex zza = null;
    private zzgok zzb = null;
    private Integer zzc = null;

    private zzgem() {
    }

    /* synthetic */ zzgem(zzgel zzgel) {
    }

    public final zzgem zza(zzgok zzgok) throws GeneralSecurityException {
        this.zzb = zzgok;
        return this;
    }

    public final zzgem zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgem zzc(zzgex zzgex) {
        this.zza = zzgex;
        return this;
    }

    public final zzgeo zzd() throws GeneralSecurityException {
        zzgok zzgok;
        zzgoj zzb2;
        zzgex zzgex = this.zza;
        if (zzgex == null || (zzgok = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgex.zza() != zzgok.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgex.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzd() || this.zzc == null) {
            if (this.zza.zzc() == zzgev.zzd) {
                zzb2 = zzgoj.zzb(new byte[0]);
            } else if (this.zza.zzc() == zzgev.zzc || this.zza.zzc() == zzgev.zzb) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzc() == zzgev.zza) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
            }
            return new zzgeo(this.zza, this.zzb, zzb2, this.zzc, (zzgen) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
