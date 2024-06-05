package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfym {
    private zzfyw zza = null;
    private zzgok zzb = null;
    private Integer zzc = null;

    private zzfym() {
    }

    /* synthetic */ zzfym(zzfyl zzfyl) {
    }

    public final zzfym zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfym zzb(zzgok zzgok) {
        this.zzb = zzgok;
        return this;
    }

    public final zzfym zzc(zzfyw zzfyw) {
        this.zza = zzfyw;
        return this;
    }

    public final zzfyo zzd() throws GeneralSecurityException {
        zzgok zzgok;
        zzgoj zzb2;
        zzfyw zzfyw = this.zza;
        if (zzfyw == null || (zzgok = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzfyw.zza() != zzgok.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzfyw.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzc() || this.zzc == null) {
            if (this.zza.zzb() == zzfyu.zzc) {
                zzb2 = zzgoj.zzb(new byte[0]);
            } else if (this.zza.zzb() == zzfyu.zzb) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzb() == zzfyu.zza) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
            }
            return new zzfyo(this.zza, this.zzb, zzb2, this.zzc, (zzfyn) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
