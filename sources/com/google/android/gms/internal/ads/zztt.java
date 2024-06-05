package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zztt {
    public final int zza;
    public final boolean zzb;

    public zztt(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztt.class == obj.getClass()) {
            zztt zztt = (zztt) obj;
            return this.zza == zztt.zza && this.zzb == zztt.zzb;
        }
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
