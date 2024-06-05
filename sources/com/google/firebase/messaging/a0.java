package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f26747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26748b;

    public /* synthetic */ a0(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f26747a = firebaseMessaging;
        this.f26748b = taskCompletionSource;
    }

    public final void run() {
        this.f26747a.E(this.f26748b);
    }
}
