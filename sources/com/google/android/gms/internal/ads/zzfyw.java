package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfyw extends zzfxk {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzfyu zzd;

    /* synthetic */ zzfyw(int i10, int i11, int i12, zzfyu zzfyu, zzfyv zzfyv) {
        this.zza = i10;
        this.zzd = zzfyu;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfyw)) {
            return false;
        }
        zzfyw zzfyw = (zzfyw) obj;
        if (zzfyw.zza == this.zza && zzfyw.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i10 = this.zza;
        return "AesGcm Parameters (variant: " + valueOf + ", " + 12 + "-byte IV, " + 16 + "-byte tag, and " + i10 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfyu zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzfyu.zzc;
    }
}
