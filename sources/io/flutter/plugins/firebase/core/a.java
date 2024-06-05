package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.core.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p.g f33779a;

    public /* synthetic */ a(p.g gVar) {
        this.f33779a = gVar;
    }

    public final void onComplete(Task task) {
        i.u(this.f33779a, task);
    }
}
