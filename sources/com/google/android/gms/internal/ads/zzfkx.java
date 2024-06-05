package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfkx implements OnCompleteListener {
    public final /* synthetic */ zzfky zza;

    public /* synthetic */ zzfkx(zzfky zzfky) {
        this.zza = zzfky;
    }

    public final void onComplete(Task task) {
        zzfky zzfky = this.zza;
        if (task.isCanceled()) {
            zzfky.cancel(false);
        } else if (task.isSuccessful()) {
            zzfky.zzd(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfky.zze(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
