package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f26847a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f26848b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26849c;

    public /* synthetic */ m0(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f26847a = context;
        this.f26848b = z10;
        this.f26849c = taskCompletionSource;
    }

    public final void run() {
        n0.d(this.f26847a, this.f26848b, this.f26849c);
    }
}
