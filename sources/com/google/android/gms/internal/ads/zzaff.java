package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaff implements zzafe {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaff(long[] jArr, long[] jArr2, long j10, long j11) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzaff zza(long j10, long j11, zzaan zzaan, zzen zzen) {
        int i10;
        long j12 = j10;
        zzaan zzaan2 = zzaan;
        zzen zzen2 = zzen;
        zzen2.zzG(10);
        int zze = zzen.zze();
        if (zze <= 0) {
            return null;
        }
        int i11 = zzaan2.zzd;
        long zzw = zzew.zzw((long) zze, ((long) (i11 >= 32000 ? 1152 : 576)) * 1000000, (long) i11);
        int zzo = zzen.zzo();
        int zzo2 = zzen.zzo();
        int zzo3 = zzen.zzo();
        zzen2.zzG(2);
        long j13 = j11 + ((long) zzaan2.zzc);
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i12 = 0;
        long j14 = j11;
        while (i12 < zzo) {
            int i13 = zzo2;
            jArr[i12] = (((long) i12) * zzw) / ((long) zzo);
            long j15 = j13;
            jArr2[i12] = Math.max(j14, j15);
            if (zzo3 == 1) {
                i10 = zzen.zzk();
            } else if (zzo3 == 2) {
                i10 = zzen.zzo();
            } else if (zzo3 == 3) {
                i10 = zzen.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                i10 = zzen.zzn();
            }
            int i14 = i13;
            j14 += ((long) i10) * ((long) i14);
            i12++;
            zzen zzen3 = zzen;
            j13 = j15;
            zzo2 = i14;
            zzo = zzo;
        }
        if (!(j12 == -1 || j12 == j14)) {
            zzee.zze("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + j14);
        }
        return new zzaff(jArr, jArr2, zzw, j14);
    }

    public final long zzb() {
        return this.zzd;
    }

    public final long zzc(long j10) {
        return this.zza[zzew.zzd(this.zzb, j10, true, true)];
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaav zzg(long j10) {
        int zzd2 = zzew.zzd(this.zza, j10, true, true);
        zzaay zzaay = new zzaay(this.zza[zzd2], this.zzb[zzd2]);
        if (zzaay.zzb < j10) {
            long[] jArr = this.zza;
            if (zzd2 != jArr.length - 1) {
                int i10 = zzd2 + 1;
                return new zzaav(zzaay, new zzaay(jArr[i10], this.zzb[i10]));
            }
        }
        return new zzaav(zzaay, zzaay);
    }

    public final boolean zzh() {
        return true;
    }
}
