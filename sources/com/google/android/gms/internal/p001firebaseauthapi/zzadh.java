package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzadh {
    zzacg zza;
    Executor zzb;

    public final <ResultT> Task<ResultT> zza(zzadj<ResultT> zzadj) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new zzadg(this, zzadj, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
