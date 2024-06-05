package d7;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class r0 implements s0 {
    r0() {
    }

    public final Task<RecaptchaTasksClient> a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}
