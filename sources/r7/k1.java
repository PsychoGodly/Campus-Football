package r7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k1 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n1 f37835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f37836b;

    public /* synthetic */ k1(n1 n1Var, Task task) {
        this.f37835a = n1Var;
        this.f37836b = task;
    }

    public final void onComplete(Task task) {
        this.f37835a.f(this.f37836b, task);
    }
}
