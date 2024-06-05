package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaki extends Thread {
    private final BlockingQueue zza;
    private final zzakh zzb;
    private final zzajy zzc;
    private volatile boolean zzd = false;
    private final zzakf zze;

    public zzaki(BlockingQueue blockingQueue, zzakh zzakh, zzajy zzajy, zzakf zzakf, byte[] bArr) {
        this.zza = blockingQueue;
        this.zzb = zzakh;
        this.zzc = zzajy;
        this.zze = zzakf;
    }

    private void zzb() throws InterruptedException {
        zzako zzako = (zzako) this.zza.take();
        SystemClock.elapsedRealtime();
        zzako.zzt(3);
        try {
            zzako.zzm("network-queue-take");
            zzako.zzw();
            TrafficStats.setThreadStatsTag(zzako.zzc());
            zzakk zza2 = this.zzb.zza(zzako);
            zzako.zzm("network-http-complete");
            if (!zza2.zze || !zzako.zzv()) {
                zzaku zzh = zzako.zzh(zza2);
                zzako.zzm("network-parse-complete");
                if (zzh.zzb != null) {
                    this.zzc.zzd(zzako.zzj(), zzh.zzb);
                    zzako.zzm("network-cache-written");
                }
                zzako.zzq();
                this.zze.zzb(zzako, zzh, (Runnable) null);
                zzako.zzs(zzh);
                zzako.zzt(4);
                return;
            }
            zzako.zzp("not-modified");
            zzako.zzr();
        } catch (zzakx e10) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzako, e10);
            zzako.zzr();
        } catch (Exception e11) {
            zzala.zzc(e11, "Unhandled exception %s", e11.toString());
            zzakx zzakx = new zzakx((Throwable) e11);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzako, zzakx);
            zzako.zzr();
        } finally {
            zzako.zzt(4);
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzala.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
