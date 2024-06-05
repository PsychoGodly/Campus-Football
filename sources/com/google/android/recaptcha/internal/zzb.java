package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import pe.x0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzb {
    public static final Task zza(x0 x0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        x0Var.u(new zza(taskCompletionSource, x0Var));
        return taskCompletionSource.getTask();
    }
}
