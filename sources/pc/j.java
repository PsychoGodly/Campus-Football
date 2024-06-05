package pc;

import com.google.android.gms.tasks.TaskCompletionSource;
import y6.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f37107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37108b;

    public /* synthetic */ j(f fVar, TaskCompletionSource taskCompletionSource) {
        this.f37107a = fVar;
        this.f37108b = taskCompletionSource;
    }

    public final void run() {
        u.X(this.f37107a, this.f37108b);
    }
}
