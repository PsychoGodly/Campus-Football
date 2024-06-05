package d7;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public interface s0 {
    Task<RecaptchaTasksClient> a(Application application, String str);
}
