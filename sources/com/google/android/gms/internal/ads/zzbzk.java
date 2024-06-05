package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.o1;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbzk implements Executor {
    private final Handler zza = new o1(Looper.getMainLooper());

    zzbzk() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                t.r();
                b2.i(t.q().zzc(), th);
                throw th;
            }
        } else {
            this.zza.post(runnable);
        }
    }
}
