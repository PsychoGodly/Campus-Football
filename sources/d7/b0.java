package d7;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class b0 implements OnSuccessListener<i> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28509a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f28510b;

    b0(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f28509a = taskCompletionSource;
        this.f28510b = context;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f28509a.setResult((i) obj);
        v.d(this.f28510b);
    }
}
