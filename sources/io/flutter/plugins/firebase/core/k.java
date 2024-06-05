package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import y6.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f33803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33804b;

    public /* synthetic */ k(f fVar, TaskCompletionSource taskCompletionSource) {
        this.f33803a = fVar;
        this.f33804b = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f33803a, this.f33804b);
    }
}
