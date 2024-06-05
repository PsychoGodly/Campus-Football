package d7;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class c0 implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28517a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f28518b;

    c0(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f28517a = taskCompletionSource;
        this.f28518b = context;
    }

    public final void onFailure(Exception exc) {
        this.f28517a.setException(exc);
        v.d(this.f28518b);
    }
}
