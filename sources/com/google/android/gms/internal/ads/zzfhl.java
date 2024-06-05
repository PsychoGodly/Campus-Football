package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfhl implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfhl(Context context, TaskCompletionSource taskCompletionSource) {
        this.zza = context;
        this.zzb = taskCompletionSource;
    }

    public final void run() {
        this.zzb.setResult(zzfjr.zzb(this.zza, "GLAS", (String) null));
    }
}
