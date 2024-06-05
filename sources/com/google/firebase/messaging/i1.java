package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i1 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f26822a;

    public /* synthetic */ i1(ScheduledFuture scheduledFuture) {
        this.f26822a = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f26822a.cancel(false);
    }
}
