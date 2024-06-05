package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f33780a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33781b;

    public /* synthetic */ b(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f33780a = iVar;
        this.f33781b = taskCompletionSource;
    }

    public final void run() {
        this.f33780a.t(this.f33781b);
    }
}
