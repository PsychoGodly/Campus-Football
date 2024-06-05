package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafg implements zzafe {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzafg(long j10, int i10, long j11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = j12;
        this.zze = j12 != -1 ? j10 + j12 : -1;
    }

    public static zzafg zza(long j10, long j11, zzaan zzaan, zzen zzen) {
        int zzn;
        long j12 = j10;
        zzaan zzaan2 = zzaan;
        int i10 = zzaan2.zzg;
        int i11 = zzaan2.zzd;
        int zze2 = zzen.zze();
        if ((zze2 & 1) != 1 || (zzn = zzen.zzn()) == 0) {
            return null;
        }
        int i12 = zze2 & 6;
        long zzw = zzew.zzw((long) zzn, ((long) i10) * 1000000, (long) i11);
        if (i12 != 6) {
            return new zzafg(j11, zzaan2.zzc, zzw, -1, (long[]) null);
        }
        long zzs = zzen.zzs();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = (long) zzen.zzk();
        }
        if (j12 != -1) {
            long j13 = j11 + zzs;
            if (j12 != j13) {
                zzee.zze("XingSeeker", "XING data size mismatch: " + j12 + ", " + j13);
            }
        }
        return new zzafg(j11, zzaan2.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i10) {
        return (this.zzc * ((long) i10)) / 100;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc(long j10) {
        long j11;
        long j12 = j10 - this.zza;
        if (!zzh() || j12 <= ((long) this.zzb)) {
            return 0;
        }
        long[] jArr = (long[]) zzdl.zzb(this.zzf);
        double d10 = (((double) j12) * 256.0d) / ((double) this.zzd);
        int zzd2 = zzew.zzd(jArr, (long) d10, true, true);
        long zzd3 = zzd(zzd2);
        long j13 = jArr[zzd2];
        int i10 = zzd2 + 1;
        long zzd4 = zzd(i10);
        if (zzd2 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i10];
        }
        return zzd3 + Math.round((j13 == j11 ? 0.0d : (d10 - ((double) j13)) / ((double) (j11 - j13))) * ((double) (zzd4 - zzd3)));
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaav zzg(long j10) {
        double d10;
        if (!zzh()) {
            zzaay zzaay = new zzaay(0, this.zza + ((long) this.zzb));
            return new zzaav(zzaay, zzaay);
        }
        long zzr = zzew.zzr(j10, 0, this.zzc);
        double d11 = (((double) zzr) * 100.0d) / ((double) this.zzc);
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) zzdl.zzb(this.zzf);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        zzaay zzaay2 = new zzaay(zzr, this.zza + zzew.zzr(Math.round((d12 / 256.0d) * ((double) this.zzd)), (long) this.zzb, this.zzd - 1));
        return new zzaav(zzaay2, zzaay2);
    }

    public final boolean zzh() {
        return this.zzf != null;
    }
}
