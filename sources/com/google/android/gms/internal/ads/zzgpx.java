package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpx {
    private final Object zza;
    private final int zzb;

    zzgpx(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpx)) {
            return false;
        }
        zzgpx zzgpx = (zzgpx) obj;
        if (this.zza == zzgpx.zza && this.zzb == zzgpx.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
