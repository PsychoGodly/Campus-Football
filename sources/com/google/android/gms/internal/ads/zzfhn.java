package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfhn implements Continuation {
    public static final /* synthetic */ zzfhn zza = new zzfhn();

    private /* synthetic */ zzfhn() {
    }

    public final Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }
}
