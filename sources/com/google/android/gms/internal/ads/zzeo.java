package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeo {
    public static final zzeo zza = new zzeo(-1, -1);
    public static final zzeo zzb = new zzeo(0, 0);
    private final int zzc;
    private final int zzd;

    public zzeo(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzdl.zzd(z10);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeo) {
            zzeo zzeo = (zzeo) obj;
            return this.zzc == zzeo.zzc && this.zzd == zzeo.zzd;
        }
    }

    public final int hashCode() {
        int i10 = this.zzd;
        int i11 = this.zzc;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public final String toString() {
        int i10 = this.zzc;
        int i11 = this.zzd;
        return i10 + "x" + i11;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
