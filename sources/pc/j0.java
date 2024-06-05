package pc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import pc.a1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f37109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1.f0 f37110b;

    public /* synthetic */ j0(a0 a0Var, a1.f0 f0Var) {
        this.f37109a = a0Var;
        this.f37110b = f0Var;
    }

    public final void onComplete(Task task) {
        q0.a0(this.f37109a, this.f37110b, task);
    }
}
