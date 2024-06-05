package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);
}
