package d7;

import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class q0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ o0 f28603a;

    public /* synthetic */ q0(o0 o0Var) {
        this.f28603a = o0Var;
    }

    public final Object then(Task task) {
        o0 o0Var = this.f28603a;
        if (task.isSuccessful()) {
            return o0Var.d((String) task.getResult());
        }
        String message = ((Exception) q.k(task.getException())).getMessage();
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message + "\n\n Failing open with a fake token.");
        return o0Var.d("NO_RECAPTCHA");
    }
}
