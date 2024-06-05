package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    zze(zzf zzf, Task task) {
        this.zzb = zzf;
        this.zza = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.zzb.zzb.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, this.zzb);
            task.addOnFailureListener(executor, (OnFailureListener) this.zzb);
            task.addOnCanceledListener(executor, (OnCanceledListener) this.zzb);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e10.getCause());
            } else {
                this.zzb.zzc.zza(e10);
            }
        } catch (Exception e11) {
            this.zzb.zzc.zza(e11);
        }
    }
}
