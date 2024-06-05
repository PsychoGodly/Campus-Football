package pc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import pc.a1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f37204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1.f0 f37205b;

    public /* synthetic */ w(a0 a0Var, a1.f0 f0Var) {
        this.f37204a = a0Var;
        this.f37205b = f0Var;
    }

    public final void onComplete(Task task) {
        q0.Y(this.f37204a, this.f37205b, task);
    }
}
