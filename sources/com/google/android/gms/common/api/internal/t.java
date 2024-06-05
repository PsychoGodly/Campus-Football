package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class t {
    public static void a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        b(status, (Object) null, taskCompletionSource);
    }

    public static <TResult> void b(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.z()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new b(status));
        }
    }
}
