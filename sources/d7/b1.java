package d7;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.q;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class b1 implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f28511a;

    b1(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f28511a = taskCompletionSource;
    }

    public final void onFailure(Exception exc) {
        Log.e(d0.f28533b, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", new Object[]{exc.getMessage()}));
        if (!(exc instanceof q) || !((q) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f28511a.setResult(new n1().a());
        } else {
            this.f28511a.setException(exc);
        }
    }
}
