package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzzj implements zzaax {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzzj(long j10, long j11, int i10, int i11, boolean z10) {
        long zzb2;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1;
            zzb2 = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            zzb2 = zzb(j10, j11, i10);
        }
        this.zzf = zzb2;
    }

    private static long zzb(long j10, long j11, int i10) {
        return (Math.max(0, j10 - j11) * 8000000) / ((long) i10);
    }

    public final long zza(long j10) {
        return zzb(j10, this.zzb, this.zze);
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzaav zzg(long j10) {
        long j11 = this.zzd;
        int i10 = (j11 > -1 ? 1 : (j11 == -1 ? 0 : -1));
        if (i10 != 0) {
            long j12 = (long) this.zzc;
            long j13 = (((((long) this.zze) * j10) / 8000000) / j12) * j12;
            if (i10 != 0) {
                j13 = Math.min(j13, j11 - j12);
            }
            long max = this.zzb + Math.max(j13, 0);
            long zza2 = zza(max);
            zzaay zzaay = new zzaay(zza2, max);
            if (this.zzd != -1 && zza2 < j10) {
                long j14 = max + ((long) this.zzc);
                if (j14 < this.zza) {
                    return new zzaav(zzaay, new zzaay(zza(j14), j14));
                }
            }
            return new zzaav(zzaay, zzaay);
        }
        zzaay zzaay2 = new zzaay(0, this.zzb);
        return new zzaav(zzaay2, zzaay2);
    }

    public final boolean zzh() {
        return this.zzd != -1;
    }
}
