package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzkt implements zzjq {
    private final zzdm zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzby zze = zzby.zza;

    public zzkt(zzdm zzdm) {
        this.zza = zzdm;
    }

    public final long zza() {
        long j10;
        long j11 = this.zzc;
        if (!this.zzb) {
            return j11;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzby zzby = this.zze;
        if (zzby.zzc == 1.0f) {
            j10 = zzew.zzv(elapsedRealtime);
        } else {
            j10 = zzby.zza(elapsedRealtime);
        }
        return j11 + j10;
    }

    public final void zzb(long j10) {
        this.zzc = j10;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    public final zzby zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (!this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
            this.zzb = true;
        }
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    public final void zzg(zzby zzby) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzby;
    }
}
