package d7;

import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class o0<T> {
    static /* synthetic */ Task a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) q.k(task.getException());
        if (zzacf.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                String valueOf = String.valueOf(recaptchaAction);
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + valueOf);
            }
            if (firebaseAuth.q0() == null) {
                firebaseAuth.k0(new t0(firebaseAuth.l(), firebaseAuth));
            }
            return c(firebaseAuth.q0(), recaptchaAction, str, continuation);
        }
        String valueOf2 = String.valueOf(recaptchaAction);
        String message = exc.getMessage();
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf2 + "with exception - " + message);
        return Tasks.forException(exc);
    }

    private static <T> Task<T> c(t0 t0Var, RecaptchaAction recaptchaAction, String str, Continuation<String, Task<T>> continuation) {
        Task<String> b10 = t0Var.b(str, Boolean.FALSE, recaptchaAction);
        return b10.continueWithTask(continuation).continueWithTask(new p0(str, t0Var, recaptchaAction, continuation));
    }

    public final Task<T> b(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction, String str2) {
        q0 q0Var = new q0(this);
        t0 q02 = firebaseAuth.q0();
        if (q02 == null || !q02.d(str2)) {
            return d((String) null).continueWithTask(new n0(recaptchaAction, firebaseAuth, str, q0Var));
        }
        return c(q02, recaptchaAction, str, q0Var);
    }

    public abstract Task<T> d(String str);
}
