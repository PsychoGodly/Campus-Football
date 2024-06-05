package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzc {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    /* access modifiers changed from: private */
    public long zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public long zzh;

    protected zzzc(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.zza = j10;
        long j17 = j11;
        this.zzb = j17;
        long j18 = j13;
        this.zze = j18;
        long j19 = j14;
        this.zzf = j19;
        long j20 = j15;
        this.zzg = j20;
        long j21 = j16;
        this.zzc = j21;
        this.zzh = zzf(j17, 0, j18, j19, j20, j21);
    }

    protected static long zzf(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
        return zzew.zzr(((j13 + j16) - j15) - (j16 / 20), j13, j14 - 1);
    }

    static /* bridge */ /* synthetic */ void zzg(zzzc zzzc, long j10, long j11) {
        zzzc.zze = j10;
        zzzc.zzg = j11;
        zzzc.zzi();
    }

    static /* bridge */ /* synthetic */ void zzh(zzzc zzzc, long j10, long j11) {
        zzzc.zzd = j10;
        zzzc.zzf = j11;
        zzzc.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
