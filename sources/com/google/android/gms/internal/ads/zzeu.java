package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeu {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzeu(long j10) {
        zzf(0);
    }

    public final synchronized long zza(long j10) {
        if (this.zzb == -9223372036854775807L) {
            long j11 = this.zza;
            if (j11 == 9223372036854775806L) {
                Long l10 = (Long) this.zzd.get();
                Objects.requireNonNull(l10);
                j11 = l10.longValue();
            }
            this.zzb = j11 - j10;
            notifyAll();
        }
        this.zzc = j10;
        return j10 + this.zzb;
    }

    public final synchronized long zzb(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((-1 + j13) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return zza((j10 * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j10 = this.zza;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long zzd() {
        long j10;
        j10 = this.zzc;
        return j10 != -9223372036854775807L ? j10 + this.zzb : zzc();
    }

    public final synchronized long zze() {
        return this.zzb;
    }

    public final synchronized void zzf(long j10) {
        this.zza = j10;
        this.zzb = j10 == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }
}
