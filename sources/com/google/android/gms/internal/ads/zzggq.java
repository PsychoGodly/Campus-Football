package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggq {
    private final zzfwg zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzggq(zzfwg zzfwg, int i10, String str, String str2, zzggp zzggp) {
        this.zza = zzfwg;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggq)) {
            return false;
        }
        zzggq zzggq = (zzggq) obj;
        if (this.zza != zzggq.zza || this.zzb != zzggq.zzb || !this.zzc.equals(zzggq.zzc) || !this.zzd.equals(zzggq.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final int zza() {
        return this.zzb;
    }
}
