package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfzd {
    private zzfzn zza = null;
    private zzgok zzb = null;
    private Integer zzc = null;

    private zzfzd() {
    }

    /* synthetic */ zzfzd(zzfzc zzfzc) {
    }

    public final zzfzd zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfzd zzb(zzgok zzgok) {
        this.zzb = zzgok;
        return this;
    }

    public final zzfzd zzc(zzfzn zzfzn) {
        this.zza = zzfzn;
        return this;
    }

    public final zzfzf zzd() throws GeneralSecurityException {
        zzgok zzgok;
        zzgoj zzb2;
        zzfzn zzfzn = this.zza;
        if (zzfzn == null || (zzgok = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzfzn.zza() != zzgok.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzfzn.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzc() || this.zzc == null) {
            if (this.zza.zzb() == zzfzl.zzc) {
                zzb2 = zzgoj.zzb(new byte[0]);
            } else if (this.zza.zzb() == zzfzl.zzb) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzb() == zzfzl.zza) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
            }
            return new zzfzf(this.zza, this.zzb, zzb2, this.zzc, (zzfze) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
