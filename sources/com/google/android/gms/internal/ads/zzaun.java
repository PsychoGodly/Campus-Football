package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaun {
    final long zza;
    final String zzb;
    final int zzc;

    zzaun(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaun)) {
            zzaun zzaun = (zzaun) obj;
            if (zzaun.zza == this.zza && zzaun.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
