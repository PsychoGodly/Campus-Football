package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzkq {
    public static final zzkq zza;
    public static final zzkq zzb = new zzkq(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final zzkq zzc = new zzkq(Long.MAX_VALUE, 0);
    public static final zzkq zzd = new zzkq(0, Long.MAX_VALUE);
    public static final zzkq zze;
    public final long zzf;
    public final long zzg;

    static {
        zzkq zzkq = new zzkq(0, 0);
        zza = zzkq;
        zze = zzkq;
    }

    public zzkq(long j10, long j11) {
        boolean z10 = true;
        zzdl.zzd(j10 >= 0);
        zzdl.zzd(j11 < 0 ? false : z10);
        this.zzf = j10;
        this.zzg = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkq.class == obj.getClass()) {
            zzkq zzkq = (zzkq) obj;
            return this.zzf == zzkq.zzf && this.zzg == zzkq.zzg;
        }
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
