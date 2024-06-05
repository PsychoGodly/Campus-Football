package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfaa {
    static Task zza;
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z10) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = AppSet.getClient(context);
            }
            Task task = zza;
            if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z10 && zza.isComplete()))) {
                zza = ((AppSetIdClient) q.l(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
            }
        }
    }
}
