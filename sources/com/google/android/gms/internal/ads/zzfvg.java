package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvg extends zzftz {
    /* access modifiers changed from: private */
    public zzfut zza;
    /* access modifiers changed from: private */
    public ScheduledFuture zzb;

    private zzfvg(zzfut zzfut) {
        Objects.requireNonNull(zzfut);
        this.zza = zzfut;
    }

    static zzfut zzg(zzfut zzfut, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvg zzfvg = new zzfvg(zzfut);
        zzfvd zzfvd = new zzfvd(zzfvg);
        zzfvg.zzb = scheduledExecutorService.schedule(zzfvd, j10, timeUnit);
        zzfut.zzc(zzfvd, zzftx.INSTANCE);
        return zzfvg;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzfut zzfut = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfut == null) {
            return null;
        }
        String str = "inputFuture=[" + zzfut.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
