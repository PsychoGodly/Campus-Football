package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f33796a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Boolean f33797b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33798c;

    public /* synthetic */ h(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f33796a = str;
        this.f33797b = bool;
        this.f33798c = taskCompletionSource;
    }

    public final void run() {
        i.x(this.f33796a, this.f33797b, this.f33798c);
    }
}
