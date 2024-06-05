package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaka extends Thread {
    private static final boolean zza = zzala.zzb;
    private final BlockingQueue zzb;
    /* access modifiers changed from: private */
    public final BlockingQueue zzc;
    private final zzajy zzd;
    private volatile boolean zze = false;
    private final zzalb zzf;
    private final zzakf zzg;

    public zzaka(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzajy zzajy, zzakf zzakf, byte[] bArr) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzajy;
        this.zzg = zzakf;
        this.zzf = new zzalb(this, blockingQueue2, zzakf, (byte[]) null);
    }

    private void zzc() throws InterruptedException {
        zzako zzako = (zzako) this.zzb.take();
        zzako.zzm("cache-queue-take");
        zzako.zzt(1);
        try {
            zzako.zzw();
            zzajx zza2 = this.zzd.zza(zzako.zzj());
            if (zza2 == null) {
                zzako.zzm("cache-miss");
                if (!this.zzf.zzc(zzako)) {
                    this.zzc.put(zzako);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzako.zzm("cache-hit-expired");
                zzako.zze(zza2);
                if (!this.zzf.zzc(zzako)) {
                    this.zzc.put(zzako);
                }
                zzako.zzt(2);
                return;
            }
            zzako.zzm("cache-hit");
            zzaku zzh = zzako.zzh(new zzakk(zza2.zza, zza2.zzg));
            zzako.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzako.zzm("cache-parsing-failed");
                this.zzd.zzc(zzako.zzj(), true);
                zzako.zze((zzajx) null);
                if (!this.zzf.zzc(zzako)) {
                    this.zzc.put(zzako);
                }
                zzako.zzt(2);
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzako.zzm("cache-hit-refresh-needed");
                zzako.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzako)) {
                    this.zzg.zzb(zzako, zzh, new zzajz(this, zzako));
                } else {
                    this.zzg.zzb(zzako, zzh, (Runnable) null);
                }
            } else {
                this.zzg.zzb(zzako, zzh, (Runnable) null);
            }
            zzako.zzt(2);
        } finally {
            zzako.zzt(2);
        }
    }

    public final void run() {
        if (zza) {
            zzala.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzala.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
