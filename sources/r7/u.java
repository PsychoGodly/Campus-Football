package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f37854a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f37855b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37856c;

    public /* synthetic */ u(o0 o0Var, List list, TaskCompletionSource taskCompletionSource) {
        this.f37854a = o0Var;
        this.f37855b = list;
        this.f37856c = taskCompletionSource;
    }

    public final void run() {
        this.f37854a.c0(this.f37855b, this.f37856c);
    }
}
