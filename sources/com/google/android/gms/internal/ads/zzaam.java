package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaam implements zzaax {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzaam(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdl.zzd(length == length2);
        boolean z10 = length2 > 0;
        this.zzd = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.zza = jArr3;
            long[] jArr4 = new long[i10];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j10;
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaav zzg(long j10) {
        if (!this.zzd) {
            zzaay zzaay = zzaay.zza;
            return new zzaav(zzaay, zzaay);
        }
        int zzd2 = zzew.zzd(this.zzb, j10, true, true);
        zzaay zzaay2 = new zzaay(this.zzb[zzd2], this.zza[zzd2]);
        if (zzaay2.zzb != j10) {
            long[] jArr = this.zzb;
            if (zzd2 != jArr.length - 1) {
                int i10 = zzd2 + 1;
                return new zzaav(zzaay2, new zzaay(jArr[i10], this.zza[i10]));
            }
        }
        return new zzaav(zzaay2, zzaay2);
    }

    public final boolean zzh() {
        return this.zzd;
    }
}
