package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f26534a;

    public /* synthetic */ t(FirebaseFirestore firebaseFirestore) {
        this.f26534a = firebaseFirestore;
    }

    public final Object then(Task task) {
        return this.f26534a.A(task);
    }
}
