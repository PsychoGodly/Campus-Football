package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class q implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    static final Continuation f26641a = new q();

    private q() {
    }

    public Object then(Task task) {
        return ((l) task.getResult()).getToken();
    }
}
