package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfbm implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    zzfbm() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new Thread(runnable, "AdWorker(NG) #" + andIncrement);
    }
}
