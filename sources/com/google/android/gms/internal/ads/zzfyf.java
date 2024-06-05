package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfyf extends zzfxk {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzfyd zzd;

    /* synthetic */ zzfyf(int i10, int i11, int i12, zzfyd zzfyd, zzfye zzfye) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzfyd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfyf)) {
            return false;
        }
        zzfyf zzfyf = (zzfyf) obj;
        if (zzfyf.zza == this.zza && zzfyf.zzb == this.zzb && zzfyf.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        return "AesEax Parameters (variant: " + valueOf + ", " + i10 + "-byte IV, " + 16 + "-byte tag, and " + i11 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfyd zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzfyd.zzc;
    }
}
