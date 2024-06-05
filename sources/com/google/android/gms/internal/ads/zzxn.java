package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzxn {
    private zzxm zza = new zzxm();
    private zzxm zzb = new zzxm();
    private boolean zzc;
    private long zzd = -9223372036854775807L;
    private int zze;

    public final float zza() {
        if (this.zza.zzf()) {
            return (float) (1.0E9d / ((double) this.zza.zza()));
        }
        return -1.0f;
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc() {
        if (this.zza.zzf()) {
            return this.zza.zza();
        }
        return -9223372036854775807L;
    }

    public final long zzd() {
        if (this.zza.zzf()) {
            return this.zza.zzb();
        }
        return -9223372036854775807L;
    }

    public final void zze(long j10) {
        this.zza.zzc(j10);
        int i10 = 0;
        if (this.zza.zzf()) {
            this.zzc = false;
        } else if (this.zzd != -9223372036854775807L) {
            if (!this.zzc || this.zzb.zze()) {
                this.zzb.zzd();
                this.zzb.zzc(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzc(j10);
        }
        if (this.zzc && this.zzb.zzf()) {
            zzxm zzxm = this.zza;
            this.zza = this.zzb;
            this.zzb = zzxm;
            this.zzc = false;
        }
        this.zzd = j10;
        if (!this.zza.zzf()) {
            i10 = this.zze + 1;
        }
        this.zze = i10;
    }

    public final void zzf() {
        this.zza.zzd();
        this.zzb.zzd();
        this.zzc = false;
        this.zzd = -9223372036854775807L;
        this.zze = 0;
    }

    public final boolean zzg() {
        return this.zza.zzf();
    }
}
