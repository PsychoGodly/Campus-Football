package d7;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class a0 implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28506a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f28507b;

    a0(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f28506a = taskCompletionSource;
        this.f28507b = context;
    }

    public final void onFailure(Exception exc) {
        this.f28506a.setException(exc);
        v.d(this.f28507b);
    }
}
