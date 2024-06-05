package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfdn implements zzfdk {
    private final zzfdk zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) a0.c().zzb(zzbar.zzhV)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfdn(zzfdk zzfdk, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfdk;
        long intValue = (long) ((Integer) a0.c().zzb(zzbar.zzhU)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new zzfdm(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfdn zzfdn) {
        while (!zzfdn.zzb.isEmpty()) {
            zzfdn.zza.zzb((zzfdj) zzfdn.zzb.remove());
        }
    }

    public final String zza(zzfdj zzfdj) {
        return this.zza.zza(zzfdj);
    }

    public final void zzb(zzfdj zzfdj) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfdj);
        } else if (!this.zzd.getAndSet(true)) {
            Queue queue = this.zzb;
            zzfdj zzb2 = zzfdj.zzb("dropped_event");
            Map zzj = zzfdj.zzj();
            if (zzj.containsKey("action")) {
                zzb2.zza("dropped_action", (String) zzj.get("action"));
            }
            queue.offer(zzb2);
        }
    }
}
