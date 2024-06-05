package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcdg implements zzjp {
    private final zzwt zza = new zzwt(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcdg() {
    }

    public final long zza() {
        return 0;
    }

    public final void zzb() {
        zzj(false);
    }

    public final void zzc() {
        zzj(true);
    }

    public final void zzd() {
        zzj(true);
    }

    public final void zze(zzkn[] zzknArr, zzur zzur, zzwe[] zzweArr) {
        int i10 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzknArr.length;
            if (i10 < 2) {
                if (zzweArr[i10] != null) {
                    this.zzf += zzknArr[i10].zzb() != 1 ? 131072000 : 13107200;
                }
                i10++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j10, long j11, float f10) {
        boolean z10 = true;
        char c10 = j11 > this.zzc ? 0 : j11 < this.zzb ? (char) 2 : 1;
        int zza2 = this.zza.zza();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || zza2 >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    public final boolean zzh(long j10, float f10, boolean z10, long j11) {
        long j12 = z10 ? this.zze : this.zzd;
        return j12 <= 0 || j10 >= j12;
    }

    public final zzwt zzi() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i10) {
        this.zzd = ((long) i10) * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zze = ((long) i10) * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzc = ((long) i10) * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzb = ((long) i10) * 1000;
    }
}
