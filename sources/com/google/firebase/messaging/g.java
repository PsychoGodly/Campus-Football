package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f26804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f26805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26806c;

    public /* synthetic */ g(h hVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f26804a = hVar;
        this.f26805b = intent;
        this.f26806c = taskCompletionSource;
    }

    public final void run() {
        this.f26804a.i(this.f26805b, this.f26806c);
    }
}
