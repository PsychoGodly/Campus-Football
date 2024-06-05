package r7;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.a0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f37837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37838b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f37839c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f37840d;

    public /* synthetic */ l0(o0 o0Var, TaskCompletionSource taskCompletionSource, Context context, a0 a0Var) {
        this.f37837a = o0Var;
        this.f37838b = taskCompletionSource;
        this.f37839c = context;
        this.f37840d = a0Var;
    }

    public final void run() {
        this.f37837a.Q(this.f37838b, this.f37839c, this.f37840d);
    }
}
