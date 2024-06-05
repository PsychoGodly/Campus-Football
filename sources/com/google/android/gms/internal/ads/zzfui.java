package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfui {
    private final boolean zza;
    private final zzfqk zzb;

    /* synthetic */ zzfui(boolean z10, zzfqk zzfqk, zzfuh zzfuh) {
        this.zza = z10;
        this.zzb = zzfqk;
    }

    public final zzfut zza(Callable callable, Executor executor) {
        return new zzftw(this.zzb, this.zza, executor, callable);
    }
}
