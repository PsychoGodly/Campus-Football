package r7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f37849a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f37850b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37851c;

    public /* synthetic */ s(o0 o0Var, String str, TaskCompletionSource taskCompletionSource) {
        this.f37849a = o0Var;
        this.f37850b = str;
        this.f37851c = taskCompletionSource;
    }

    public final void run() {
        this.f37849a.N(this.f37850b, this.f37851c);
    }
}
