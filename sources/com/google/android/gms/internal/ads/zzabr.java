package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzabr {
    protected final zzabb zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzabr(int i10, int i11, long j10, int i12, zzabb zzabb) {
        i11 = i11 != 1 ? 2 : i11;
        this.zzd = j10;
        this.zze = i12;
        this.zza = zzabb;
        this.zzb = zzi(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.zzc = i11 == 2 ? zzi(i10, 1650720768) : -1;
        this.zzk = new long[512];
        this.zzl = new int[512];
    }

    private static int zzi(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzj(int i10) {
        return (this.zzd * ((long) i10)) / ((long) this.zze);
    }

    private final zzaay zzk(int i10) {
        return new zzaay(((long) this.zzl[i10]) * zzj(1), this.zzk[i10]);
    }

    public final zzaav zza(long j10) {
        int zzj2 = (int) (j10 / zzj(1));
        int zzc2 = zzew.zzc(this.zzl, zzj2, true, true);
        if (this.zzl[zzc2] == zzj2) {
            zzaay zzk2 = zzk(zzc2);
            return new zzaav(zzk2, zzk2);
        }
        zzaay zzk3 = zzk(zzc2);
        int i10 = zzc2 + 1;
        return i10 < this.zzk.length ? new zzaav(zzk3, zzk(i10)) : new zzaav(zzk3, zzk3);
    }

    public final void zzb(long j10) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i10 = this.zzj;
        jArr2[i10] = j10;
        this.zzl[i10] = this.zzi;
        this.zzj = i10 + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i10) {
        this.zzf = i10;
        this.zzg = i10;
    }

    public final void zzf(long j10) {
        if (this.zzj == 0) {
            this.zzh = 0;
            return;
        }
        this.zzh = this.zzl[zzew.zzd(this.zzk, j10, true, true)];
    }

    public final boolean zzg(int i10) {
        return this.zzb == i10 || this.zzc == i10;
    }

    public final boolean zzh(zzzv zzzv) throws IOException {
        int i10 = this.zzg;
        int zze2 = i10 - this.zza.zze(zzzv, i10, false);
        this.zzg = zze2;
        boolean z10 = zze2 == 0;
        if (z10) {
            if (this.zzf > 0) {
                this.zza.zzs(zzj(this.zzh), Arrays.binarySearch(this.zzl, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, (zzaba) null);
            }
            this.zzh++;
        }
        return z10;
    }
}
