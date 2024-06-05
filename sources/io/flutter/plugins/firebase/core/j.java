package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33802a;

    public /* synthetic */ j(TaskCompletionSource taskCompletionSource) {
        this.f33802a = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f33802a);
    }
}
