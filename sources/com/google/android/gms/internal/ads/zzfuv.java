package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfuv implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfsx zzb;

    zzfuv(Executor executor, zzfsx zzfsx) {
        this.zza = executor;
        this.zzb = zzfsx;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.zzb.zze(e10);
        }
    }
}
