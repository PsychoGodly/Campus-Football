package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzuw {
    public final long zza;
    public final long zzb;

    public zzuw(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuw)) {
            return false;
        }
        zzuw zzuw = (zzuw) obj;
        return this.zza == zzuw.zza && this.zzb == zzuw.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
