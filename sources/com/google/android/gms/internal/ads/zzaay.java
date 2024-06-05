package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaay {
    public static final zzaay zza = new zzaay(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaay(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaay.class == obj.getClass()) {
            zzaay zzaay = (zzaay) obj;
            return this.zzb == zzaay.zzb && this.zzc == zzaay.zzc;
        }
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        long j11 = this.zzc;
        return "[timeUs=" + j10 + ", position=" + j11 + "]";
    }
}
