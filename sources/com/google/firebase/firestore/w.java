package com.google.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f26551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26552b;

    public /* synthetic */ w(FirebaseFirestore firebaseFirestore, TaskCompletionSource taskCompletionSource) {
        this.f26551a = firebaseFirestore;
        this.f26552b = taskCompletionSource;
    }

    public final void run() {
        this.f26551a.z(this.f26552b);
    }
}
