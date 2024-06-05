package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfzn extends zzfxk {
    private final int zza;
    private final zzfzl zzb;

    /* synthetic */ zzfzn(int i10, zzfzl zzfzl, zzfzm zzfzm) {
        this.zza = i10;
        this.zzb = zzfzl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfzn)) {
            return false;
        }
        zzfzn zzfzn = (zzfzn) obj;
        if (zzfzn.zza == this.zza && zzfzn.zzb == this.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        int i10 = this.zza;
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + i10 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfzl zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzfzl.zzc;
    }
}
