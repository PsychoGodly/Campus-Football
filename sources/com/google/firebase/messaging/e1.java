package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e1 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f26796a;

    public /* synthetic */ e1(Intent intent) {
        this.f26796a = intent;
    }

    public final void onComplete(Task task) {
        f1.c(this.f26796a);
    }
}
