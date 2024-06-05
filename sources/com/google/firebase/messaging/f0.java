package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f26799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26800b;

    public /* synthetic */ f0(g0 g0Var, TaskCompletionSource taskCompletionSource) {
        this.f26799a = g0Var;
        this.f26800b = taskCompletionSource;
    }

    public final void run() {
        this.f26799a.u(this.f26800b);
    }
}
