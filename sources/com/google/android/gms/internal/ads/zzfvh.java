package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvh extends zzfus {
    final /* synthetic */ zzfvj zza;
    private final zzftp zzb;

    zzfvh(zzfvj zzfvj, zzftp zzftp) {
        this.zza = zzfvj;
        Objects.requireNonNull(zzftp);
        this.zzb = zzftp;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfut zza2 = this.zzb.zza();
        zzfnu.zzd(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza2;
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
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfut) obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
