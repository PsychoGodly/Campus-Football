package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f33791a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33792b;

    public /* synthetic */ f(String str, TaskCompletionSource taskCompletionSource) {
        this.f33791a = str;
        this.f33792b = taskCompletionSource;
    }

    public final void run() {
        i.q(this.f33791a, this.f33792b);
    }
}
