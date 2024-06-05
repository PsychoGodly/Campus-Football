package d7;

import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class v0 implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f28632a;

    v0(t0 t0Var, RecaptchaAction recaptchaAction) {
        this.f28632a = recaptchaAction;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f28632a);
        }
        Exception exc = (Exception) q.k(task.getException());
        if (!(exc instanceof u0)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            String message = exc.getMessage();
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + message);
        }
        return Tasks.forResult(MaxReward.DEFAULT_LABEL);
    }
}
