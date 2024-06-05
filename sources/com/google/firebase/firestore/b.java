package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f26431a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26432b;

    public /* synthetic */ b(c cVar, TaskCompletionSource taskCompletionSource) {
        this.f26431a = cVar;
        this.f26432b = taskCompletionSource;
    }

    public final Object then(Task task) {
        return this.f26431a.d(this.f26432b, task);
    }
}
