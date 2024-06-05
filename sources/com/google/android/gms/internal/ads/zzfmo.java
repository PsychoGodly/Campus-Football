package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfmo extends zzfml {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfml zzb;
    final /* synthetic */ zzfmv zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfmo(zzfmv zzfmv, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfml zzfml) {
        super(taskCompletionSource);
        this.zzc = zzfmv;
        this.zza = taskCompletionSource2;
        this.zzb = zzfml;
    }

    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzfmv.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzfmv.zzp(this.zzc, this.zzb);
        }
    }
}
