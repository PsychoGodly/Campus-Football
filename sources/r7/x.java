package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f37863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1 f37864b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f37865c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37866d;

    public /* synthetic */ x(o0 o0Var, a1 a1Var, List list, TaskCompletionSource taskCompletionSource) {
        this.f37863a = o0Var;
        this.f37864b = a1Var;
        this.f37865c = list;
        this.f37866d = taskCompletionSource;
    }

    public final void run() {
        this.f37863a.X(this.f37864b, this.f37865c, this.f37866d);
    }
}
