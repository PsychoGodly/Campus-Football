package d7;

import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class p0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f28598a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t0 f28599b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f28600c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Continuation f28601d;

    p0(String str, t0 t0Var, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f28598a = str;
        this.f28599b = t0Var;
        this.f28600c = recaptchaAction;
        this.f28601d = continuation;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (task.isSuccessful() || !zzacf.zzb((Exception) q.k(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            String str = this.f28598a;
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return this.f28599b.b(this.f28598a, Boolean.TRUE, this.f28600c).continueWithTask(this.f28601d);
    }
}
