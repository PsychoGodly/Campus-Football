package y7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f39386a;

    public /* synthetic */ c(TaskCompletionSource taskCompletionSource) {
        this.f39386a = taskCompletionSource;
    }

    public final Object then(Task task) {
        return g.q(this.f39386a, task);
    }
}
