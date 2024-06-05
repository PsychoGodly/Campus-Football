package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f26925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26926b;

    public /* synthetic */ z(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f26925a = firebaseMessaging;
        this.f26926b = taskCompletionSource;
    }

    public final void run() {
        this.f26925a.C(this.f26926b);
    }
}
