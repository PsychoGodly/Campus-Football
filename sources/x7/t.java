package x7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dd.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Task f39309a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.a f39310b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f39311c;

    public /* synthetic */ t(Task task, b.a aVar, Task task2) {
        this.f39309a = task;
        this.f39310b = aVar;
        this.f39311c = task2;
    }

    public final void onComplete(Task task) {
        u.c(this.f39309a, this.f39310b, this.f39311c, task);
    }
}
