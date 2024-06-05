package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.util.n1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzctm implements zzcuo, zzdbl, zzczg, zzcve, zzatf {
    /* access modifiers changed from: private */
    public final zzcvg zza;
    private final zzeyc zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfvc zze = zzfvc.zzf();
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg = new AtomicBoolean();

    zzctm(zzcvg zzcvg, zzeyc zzeyc, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzcvg;
        this.zzb = zzeyc;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    private final boolean zzh() {
        return this.zzb.zzZ == 2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (!this.zze.isDone()) {
                this.zze.zzd(Boolean.TRUE);
            }
        }
    }

    public final void zzbr() {
    }

    public final void zzc(zzate zzate) {
        if (((Boolean) a0.c().zzb(zzbar.zzjC)).booleanValue() && !zzh() && zzate.zzj && this.zzg.compareAndSet(false, true)) {
            n1.a("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final void zzd() {
        if (((Boolean) a0.c().zzb(zzbar.zzjC)).booleanValue() && !zzh()) {
            this.zza.zza();
        }
    }

    public final synchronized void zze() {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(Boolean.TRUE);
        }
    }

    public final void zzf() {
        if (((Boolean) a0.c().zzb(zzbar.zzbp)).booleanValue() && zzh()) {
            if (this.zzb.zzr == 0) {
                this.zza.zza();
                return;
            }
            zzfuj.zzq(this.zze, new zzctl(this), this.zzd);
            this.zzf = this.zzc.schedule(new zzctk(this), (long) this.zzb.zzr, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzg() {
    }

    public final void zzj() {
    }

    public final synchronized void zzk(c3 c3Var) {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zze(new Exception());
        }
    }

    public final void zzm() {
    }

    public final void zzo() {
        int i10 = this.zzb.zzZ;
        if (i10 == 0 || i10 == 1) {
            if (!((Boolean) a0.c().zzb(zzbar.zzjC)).booleanValue()) {
                this.zza.zza();
            }
        }
    }

    public final void zzp(zzbud zzbud, String str, String str2) {
    }

    public final void zzq() {
    }
}
