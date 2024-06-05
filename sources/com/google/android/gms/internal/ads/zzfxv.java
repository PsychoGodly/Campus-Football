package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfxv {
    private zzfyf zza = null;
    private zzgok zzb = null;
    private Integer zzc = null;

    private zzfxv() {
    }

    /* synthetic */ zzfxv(zzfxu zzfxu) {
    }

    public final zzfxv zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfxv zzb(zzgok zzgok) {
        this.zzb = zzgok;
        return this;
    }

    public final zzfxv zzc(zzfyf zzfyf) {
        this.zza = zzfyf;
        return this;
    }

    public final zzfxx zzd() throws GeneralSecurityException {
        zzgok zzgok;
        zzgoj zzb2;
        zzfyf zzfyf = this.zza;
        if (zzfyf == null || (zzgok = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzfyf.zza() != zzgok.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzfyf.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzc() || this.zzc == null) {
            if (this.zza.zzb() == zzfyd.zzc) {
                zzb2 = zzgoj.zzb(new byte[0]);
            } else if (this.zza.zzb() == zzfyd.zzb) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzb() == zzfyd.zza) {
                zzb2 = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
            }
            return new zzfxx(this.zza, this.zzb, zzb2, this.zzc, (zzfxw) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
