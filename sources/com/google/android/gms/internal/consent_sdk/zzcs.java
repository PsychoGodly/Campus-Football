package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzcs implements Executor {
    private final AtomicInteger zza = new AtomicInteger(1);
    private final ThreadPoolExecutor zzb;
    private WeakReference zzc = new WeakReference((Object) null);

    zzcs(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcr(this, "Google consent worker"));
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.zzc.get()) {
            runnable.run();
        } else {
            this.zzb.execute(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Thread zza(String str, Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        Thread thread = new Thread(runnable, "Google consent worker #" + andIncrement);
        this.zzc = new WeakReference(thread);
        return thread;
    }
}
