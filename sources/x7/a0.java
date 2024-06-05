package x7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import dd.z0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h0 f39275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z0 f39276b;

    public /* synthetic */ a0(h0 h0Var, z0 z0Var) {
        this.f39275a = h0Var;
        this.f39276b = z0Var;
    }

    public final Object then(Task task) {
        return this.f39275a.l(this.f39276b, task);
    }
}
