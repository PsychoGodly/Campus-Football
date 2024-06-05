package d7;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class x implements OnSuccessListener<i> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28642a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f28643b;

    x(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f28642a = taskCompletionSource;
        this.f28643b = context;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f28642a.setResult((i) obj);
        v.d(this.f28643b);
    }
}
