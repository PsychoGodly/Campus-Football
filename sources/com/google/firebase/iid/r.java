package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class r implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final s f26642a;

    /* renamed from: b  reason: collision with root package name */
    private final Pair f26643b;

    r(s sVar, Pair pair) {
        this.f26642a = sVar;
        this.f26643b = pair;
    }

    public Object then(Task task) {
        this.f26642a.b(this.f26643b, task);
        return task;
    }
}
