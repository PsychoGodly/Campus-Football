package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcvb extends zzczy implements zzcus {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzcvb(zzcva zzcva, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        zzm(zzcva, executor);
    }

    public final void zza(c3 c3Var) {
        zzp(new zzcuu(c3Var));
    }

    public final void zzb() {
        zzp(zzcuw.zza);
    }

    public final void zzc(zzded zzded) {
        if (!this.zzd) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzp(new zzcut(zzded));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzbza.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzded("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new zzcuv(this), (long) ((Integer) a0.c().zzb(zzbar.zzjc)).intValue(), TimeUnit.MILLISECONDS);
    }
}
