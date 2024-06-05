package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f26819a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f26820b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f26821c;

    public /* synthetic */ i(Context context, Intent intent, boolean z10) {
        this.f26819a = context;
        this.f26820b = intent;
        this.f26821c = z10;
    }

    public final Object then(Task task) {
        return m.j(this.f26819a, this.f26820b, this.f26821c, task);
    }
}
