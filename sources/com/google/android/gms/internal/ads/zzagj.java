package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzagj {
    public final zzagg zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzagj(zzagg zzagg, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z10 = true;
        zzdl.zzd(length == length2);
        int length3 = jArr.length;
        zzdl.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdl.zzd(length4 != length2 ? false : z10);
        this.zza = zzagg;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j10;
        this.zzb = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j10) {
        for (int zzd2 = zzew.zzd(this.zzf, j10, true, false); zzd2 >= 0; zzd2--) {
            if ((this.zzg[zzd2] & 1) != 0) {
                return zzd2;
            }
        }
        return -1;
    }

    public final int zzb(long j10) {
        for (int zzb2 = zzew.zzb(this.zzf, j10, true, false); zzb2 < this.zzf.length; zzb2++) {
            if ((this.zzg[zzb2] & 1) != 0) {
                return zzb2;
            }
        }
        return -1;
    }
}
