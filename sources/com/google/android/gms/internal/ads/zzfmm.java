package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfmm implements OnCompleteListener {
    public final /* synthetic */ zzfmv zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfmm(zzfmv zzfmv, TaskCompletionSource taskCompletionSource) {
        this.zza = zzfmv;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.zza.zzt(this.zzb, task);
    }
}
