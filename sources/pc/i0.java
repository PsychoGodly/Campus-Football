package pc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import pc.a1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f37103a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1.f0 f37104b;

    public /* synthetic */ i0(a0 a0Var, a1.f0 f0Var) {
        this.f37103a = a0Var;
        this.f37104b = f0Var;
    }

    public final void onComplete(Task task) {
        q0.W(this.f37103a, this.f37104b, task);
    }
}
