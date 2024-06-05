package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f26887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26888b;

    public /* synthetic */ r0(s0 s0Var, String str) {
        this.f26887a = s0Var;
        this.f26888b = str;
    }

    public final Object then(Task task) {
        return this.f26887a.c(this.f26888b, task);
    }
}
