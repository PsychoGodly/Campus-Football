package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f26885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26886b;

    public /* synthetic */ r(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f26885a = firebaseMessaging;
        this.f26886b = taskCompletionSource;
    }

    public final void run() {
        this.f26885a.D(this.f26886b);
    }
}
