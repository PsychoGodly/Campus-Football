package pc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import pc.a1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a1.f0 f37039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f37040b;

    public /* synthetic */ b0(a1.f0 f0Var, a0 a0Var) {
        this.f37039a = f0Var;
        this.f37040b = a0Var;
    }

    public final void onComplete(Task task) {
        q0.V(this.f37039a, this.f37040b, task);
    }
}
