package pc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import pc.a1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f37097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1.f0 f37098b;

    public /* synthetic */ h0(a0 a0Var, a1.f0 f0Var) {
        this.f37097a = a0Var;
        this.f37098b = f0Var;
    }

    public final void onComplete(Task task) {
        q0.U(this.f37097a, this.f37098b, task);
    }
}
