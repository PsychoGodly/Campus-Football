package d7;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class y implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28647a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f28648b;

    y(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f28647a = taskCompletionSource;
        this.f28648b = context;
    }

    public final void onFailure(Exception exc) {
        this.f28647a.setException(exc);
        v.d(this.f28648b);
    }
}
