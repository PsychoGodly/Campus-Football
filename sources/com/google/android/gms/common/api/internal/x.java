package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class x implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f15321a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y f15322b;

    x(y yVar, TaskCompletionSource taskCompletionSource) {
        this.f15322b = yVar;
        this.f15321a = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f15322b.f15330b.remove(this.f15321a);
    }
}
