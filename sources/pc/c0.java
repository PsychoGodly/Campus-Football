package pc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import pc.a1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a1.f0 f37054a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f37055b;

    public /* synthetic */ c0(a1.f0 f0Var, a0 a0Var) {
        this.f37054a = f0Var;
        this.f37055b = a0Var;
    }

    public final void onComplete(Task task) {
        q0.X(this.f37054a, this.f37055b, task);
    }
}
