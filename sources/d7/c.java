package d7;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f28512a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ TaskCompletionSource f28513b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ FirebaseAuth f28514c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ e1 f28515d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Activity f28516e;

    public /* synthetic */ c(d0 d0Var, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, e1 e1Var, Activity activity) {
        this.f28512a = d0Var;
        this.f28513b = taskCompletionSource;
        this.f28514c = firebaseAuth;
        this.f28515d = e1Var;
        this.f28516e = activity;
    }

    public final void onComplete(Task task) {
        this.f28512a.c(this.f28513b, this.f28514c, this.f28515d, this.f28516e, task);
    }
}
