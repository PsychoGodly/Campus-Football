package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajl implements zzaax {
    private final zzaji zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzajl(zzaji zzaji, int i10, long j10, long j11) {
        this.zza = zzaji;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzaji.zzd);
        this.zzd = j12;
        this.zze = zza(j12);
    }

    private final long zza(long j10) {
        return zzew.zzw(j10 * ((long) this.zzb), 1000000, (long) this.zza.zzc);
    }

    public final long zze() {
        return this.zze;
    }

    public final zzaav zzg(long j10) {
        long zzr = zzew.zzr((((long) this.zza.zzc) * j10) / (((long) this.zzb) * 1000000), 0, this.zzd - 1);
        long j11 = this.zzc + (((long) this.zza.zzd) * zzr);
        long zza2 = zza(zzr);
        zzaay zzaay = new zzaay(zza2, j11);
        if (zza2 >= j10 || zzr == this.zzd - 1) {
            return new zzaav(zzaay, zzaay);
        }
        long j12 = zzr + 1;
        return new zzaav(zzaay, new zzaay(zza(j12), this.zzc + (((long) this.zza.zzd) * j12)));
    }

    public final boolean zzh() {
        return true;
    }
}
