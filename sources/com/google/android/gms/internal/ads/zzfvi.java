package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvi extends zzfus {
    final /* synthetic */ zzfvj zza;
    private final Callable zzb;

    zzfvi(zzfvj zzfvj, Callable callable) {
        this.zza = zzfvj;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
