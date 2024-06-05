package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26902a;

    public /* synthetic */ v(String str) {
        this.f26902a = str;
    }

    public final Task then(Object obj) {
        return ((c1) obj).r(this.f26902a);
    }
}
