package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvj extends zzftz implements RunnableFuture {
    private volatile zzfus zza;

    zzfvj(zzftp zzftp) {
        this.zza = new zzfvh(this, zzftp);
    }

    static zzfvj zzf(Runnable runnable, Object obj) {
        return new zzfvj(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzfus zzfus = this.zza;
        if (zzfus != null) {
            zzfus.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzfus zzfus = this.zza;
        if (zzfus == null) {
            return super.zza();
        }
        String obj = zzfus.toString();
        return "task=[" + obj + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfus zzfus;
        if (zzu() && (zzfus = this.zza) != null) {
            zzfus.zzh();
        }
        this.zza = null;
    }

    zzfvj(Callable callable) {
        this.zza = new zzfvi(this, callable);
    }
}
