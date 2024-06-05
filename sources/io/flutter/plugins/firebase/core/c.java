package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f33782a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33783b;

    public /* synthetic */ c(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f33782a = iVar;
        this.f33783b = taskCompletionSource;
    }

    public final void run() {
        this.f33782a.v(this.f33783b);
    }
}
