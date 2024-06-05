package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzjs {
    public final zzss zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzjs(zzss zzss, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzdl.zzd(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzdl.zzd(z14);
        this.zza = zzss;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjs.class == obj.getClass()) {
            zzjs zzjs = (zzjs) obj;
            return this.zzb == zzjs.zzb && this.zzc == zzjs.zzc && this.zzd == zzjs.zzd && this.zze == zzjs.zze && this.zzg == zzjs.zzg && this.zzh == zzjs.zzh && this.zzi == zzjs.zzi && zzew.zzU(this.zza, zzjs.zza);
        }
    }

    public final int hashCode() {
        int i10 = (int) this.zzb;
        int i11 = (int) this.zzc;
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + i10) * 31) + i11) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzjs zza(long j10) {
        if (j10 == this.zzc) {
            return this;
        }
        return new zzjs(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzjs zzb(long j10) {
        if (j10 == this.zzb) {
            return this;
        }
        return new zzjs(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
