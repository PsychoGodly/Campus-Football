package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzesq {
    public static zzepn zza(zzeru zzeru, zzenl zzenl, ScheduledExecutorService scheduledExecutorService, int i10) {
        return i10 == 0 ? new zzent(zzenl, 0, scheduledExecutorService) : new zzent(zzeru, 0, scheduledExecutorService);
    }

    public static zzepn zzb(zzese zzese, ScheduledExecutorService scheduledExecutorService) {
        return new zzent(zzese, ((Long) a0.c().zzb(zzbar.zzdG)).longValue(), scheduledExecutorService);
    }

    public static zzepn zzc(zzesz zzesz, ScheduledExecutorService scheduledExecutorService) {
        return new zzent(zzesz, 0, scheduledExecutorService);
    }
}
