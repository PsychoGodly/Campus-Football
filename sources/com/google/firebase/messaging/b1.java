package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f26756a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f26757b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f26758c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j0 f26759d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e0 f26760e;

    public /* synthetic */ b1(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, j0 j0Var, e0 e0Var) {
        this.f26756a = context;
        this.f26757b = scheduledExecutorService;
        this.f26758c = firebaseMessaging;
        this.f26759d = j0Var;
        this.f26760e = e0Var;
    }

    public final Object call() {
        return c1.j(this.f26756a, this.f26757b, this.f26758c, this.f26759d, this.f26760e);
    }
}
