package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33872a;

    public /* synthetic */ c(TaskCompletionSource taskCompletionSource) {
        this.f33872a = taskCompletionSource;
    }

    public final void onError(String str) {
        this.f33872a.setException(new Exception(str));
    }
}
