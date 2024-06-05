package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class j implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final k f26625a;

    j(k kVar) {
        this.f26625a = kVar;
    }

    public Object then(Task task) {
        return this.f26625a.h(task);
    }
}
