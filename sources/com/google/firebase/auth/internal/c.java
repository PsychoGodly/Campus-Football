package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ RecaptchaActivity f26248a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f26249b;

    public /* synthetic */ c(RecaptchaActivity recaptchaActivity, String str) {
        this.f26248a = recaptchaActivity;
        this.f26249b = str;
    }

    public final void onComplete(Task task) {
        this.f26248a.g(this.f26249b, task);
    }
}
