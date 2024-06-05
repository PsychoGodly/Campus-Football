package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfhm implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfhm(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.setResult(zzfjr.zzc());
    }
}
