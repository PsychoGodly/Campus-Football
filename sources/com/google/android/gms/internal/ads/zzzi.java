package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzi implements zzaax {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzzi(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
            return;
        }
        this.zzf = 0;
    }

    public final String toString() {
        int i10 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        return "ChunkIndex(length=" + i10 + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzaav zzg(long j10) {
        int zzd2 = zzew.zzd(this.zze, j10, true, true);
        zzaay zzaay = new zzaay(this.zze[zzd2], this.zzc[zzd2]);
        if (zzaay.zzb >= j10 || zzd2 == this.zza - 1) {
            return new zzaav(zzaay, zzaay);
        }
        int i10 = zzd2 + 1;
        return new zzaav(zzaay, new zzaay(this.zze[i10], this.zzc[i10]));
    }

    public final boolean zzh() {
        return true;
    }
}
