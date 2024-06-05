package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcns implements zzaty {
    private final ScheduledExecutorService zza;
    private final e zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcns(ScheduledExecutorService scheduledExecutorService, e eVar) {
        this.zza = scheduledExecutorService;
        this.zzb = eVar;
        t.d().zzc(this);
    }

    public final void zza(boolean z10) {
        if (z10) {
            zzc();
        } else {
            zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb() {
        if (!this.zzg) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1;
            } else {
                this.zzc.cancel(true);
                this.zze = this.zzd - this.zzb.b();
            }
            this.zzg = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        if (this.zzg) {
            if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
            }
            this.zzg = false;
        }
    }

    public final synchronized void zzd(int i10, Runnable runnable) {
        this.zzf = runnable;
        long j10 = (long) i10;
        this.zzd = this.zzb.b() + j10;
        this.zzc = this.zza.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
