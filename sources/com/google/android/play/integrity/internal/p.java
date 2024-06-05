package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final /* synthetic */ class p implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f26082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26083b;

    public /* synthetic */ p(y yVar, TaskCompletionSource taskCompletionSource) {
        this.f26082a = yVar;
        this.f26083b = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f26082a.q(this.f26083b, task);
    }
}
