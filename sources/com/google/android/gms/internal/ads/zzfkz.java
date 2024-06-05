package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfkz {
    public static zzfut zza(Task task) {
        zzfky zzfky = new zzfky(task);
        task.addOnCompleteListener(zzfva.zzb(), new zzfkx(zzfky));
        return zzfky;
    }
}
