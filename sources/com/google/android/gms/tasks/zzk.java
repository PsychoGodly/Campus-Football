package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    zzk(zzl zzl, Task task) {
        this.zzb = zzl;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            zzl zzl = this.zzb;
            if (zzl.zzc != null) {
                zzl.zzc.onFailure((Exception) q.k(this.zza.getException()));
            }
        }
    }
}
