package x7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f39312a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f39313b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f39314c;

    public /* synthetic */ v(y yVar, TaskCompletionSource taskCompletionSource, Object obj) {
        this.f39312a = yVar;
        this.f39313b = taskCompletionSource;
        this.f39314c = obj;
    }

    public final void onComplete(Task task) {
        this.f39312a.j(this.f39313b, this.f39314c, task);
    }
}
