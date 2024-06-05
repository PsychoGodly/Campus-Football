package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f33793a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Boolean f33794b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33795c;

    public /* synthetic */ g(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f33793a = str;
        this.f33794b = bool;
        this.f33795c = taskCompletionSource;
    }

    public final void run() {
        i.w(this.f33793a, this.f33794b, this.f33795c);
    }
}
