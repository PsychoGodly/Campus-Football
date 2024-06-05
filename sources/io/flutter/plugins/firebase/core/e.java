package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import y6.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f33788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f33789b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33790c;

    public /* synthetic */ e(i iVar, f fVar, TaskCompletionSource taskCompletionSource) {
        this.f33788a = iVar;
        this.f33789b = fVar;
        this.f33790c = taskCompletionSource;
    }

    public final void run() {
        this.f33788a.r(this.f33789b, this.f33790c);
    }
}
