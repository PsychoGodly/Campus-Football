package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzftu extends zzftv {
    final /* synthetic */ zzftw zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzftu(zzftw zzftw, Callable callable, Executor executor) {
        super(zzftw, executor);
        this.zza = zzftw;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
