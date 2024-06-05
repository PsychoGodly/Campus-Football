package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f26797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f26798b;

    public /* synthetic */ f(h hVar, Intent intent) {
        this.f26797a = hVar;
        this.f26798b = intent;
    }

    public final void onComplete(Task task) {
        this.f26797a.h(this.f26798b, task);
    }
}
