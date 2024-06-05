package d7;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class h1 implements OnSuccessListener<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28560a;

    h1(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f28560a = taskCompletionSource;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f28560a.setResult(new n1().c((String) obj).a());
    }
}
