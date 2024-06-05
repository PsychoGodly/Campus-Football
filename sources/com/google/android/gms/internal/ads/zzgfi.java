package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgfi {
    private zzgfu zza = null;
    private zzgok zzb = null;
    private Integer zzc = null;

    private zzgfi() {
    }

    /* synthetic */ zzgfi(zzgfh zzgfh) {
    }

    public final zzgfi zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfi zzb(zzgok zzgok) {
        this.zzb = zzgok;
        return this;
    }

    public final zzgfi zzc(zzgfu zzgfu) {
        this.zza = zzgfu;
        return this;
    }

    public final zzgfk zzd() throws GeneralSecurityException {
        zzgok zzgok;
        zzgoj zzb2;
        zzgfu zzgfu = this.zza;
        if (zzgfu == null || (zzgok = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgfu.zza() != zzgok.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgfu.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzd() || this.zzc == null) {
            if (this.zza.zzc() == zzgfs.zzd) {
                zzb2 = zzgoj.zzb(new byte[0]);
            } else if (this.zza.zzc() == zzgfs.zzc || this.zza.zzc() == zzgfs.zzb) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzc() == zzgfs.zza) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
            }
            return new zzgfk(this.zza, this.zzb, zzb2, this.zzc, (zzgfj) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
