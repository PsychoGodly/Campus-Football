package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcxd extends zzczy {
    private final ScheduledExecutorService zzb;
    private final e zzc;
    private long zzd = -1;
    private long zze = -1;
    private boolean zzf = false;
    private ScheduledFuture zzg;

    public zzcxd(ScheduledExecutorService scheduledExecutorService, e eVar) {
        super(Collections.emptySet());
        this.zzb = scheduledExecutorService;
        this.zzc = eVar;
    }

    private final synchronized void zze(long j10) {
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzg.cancel(true);
        }
        this.zzd = this.zzc.b() + j10;
        this.zzg = this.zzb.schedule(new zzcxc(this, (zzcxb) null), j10, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzf = false;
        zze(0);
    }

    public final synchronized void zzb() {
        if (!this.zzf) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zze = -1;
            } else {
                this.zzg.cancel(true);
                this.zze = this.zzd - this.zzc.b();
            }
            this.zzf = true;
        }
    }

    public final synchronized void zzc() {
        if (this.zzf) {
            if (this.zze > 0 && this.zzg.isCancelled()) {
                zze(this.zze);
            }
            this.zzf = false;
        }
    }

    public final synchronized void zzd(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i10);
            if (this.zzf) {
                long j10 = this.zze;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.zze = millis;
                return;
            }
            long b10 = this.zzc.b();
            long j11 = this.zzd;
            if (b10 > j11 || j11 - this.zzc.b() > millis) {
                zze(millis);
            }
        }
    }
}
