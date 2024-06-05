package d7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.i;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class e1 {

    /* renamed from: c  reason: collision with root package name */
    private static final e1 f28543c = new e1();

    /* renamed from: a  reason: collision with root package name */
    private final m0 f28544a;

    /* renamed from: b  reason: collision with root package name */
    private final v f28545b;

    private e1() {
        this(m0.j(), v.b());
    }

    public static e1 f() {
        return f28543c;
    }

    public final void a(Context context) {
        this.f28544a.a(context);
    }

    public final void b(FirebaseAuth firebaseAuth) {
        this.f28544a.h(firebaseAuth);
    }

    public final boolean c(Activity activity, TaskCompletionSource<i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f28545b.i(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean d(Activity activity, TaskCompletionSource<i> taskCompletionSource, FirebaseAuth firebaseAuth, a0 a0Var) {
        return this.f28545b.j(activity, taskCompletionSource, firebaseAuth, a0Var);
    }

    public final Task<String> e() {
        return this.f28544a.i();
    }

    private e1(m0 m0Var, v vVar) {
        this.f28544a = m0Var;
        this.f28545b = vVar;
    }
}
