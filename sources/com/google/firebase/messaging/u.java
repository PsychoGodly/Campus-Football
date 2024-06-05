package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26896a;

    public /* synthetic */ u(String str) {
        this.f26896a = str;
    }

    public final Task then(Object obj) {
        return ((c1) obj).u(this.f26896a);
    }
}
