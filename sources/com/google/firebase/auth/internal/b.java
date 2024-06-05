package com.google.firebase.auth.internal;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class b implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Uri f26247a;

    public /* synthetic */ b(Uri uri) {
        this.f26247a = uri;
    }

    public final Object then(Task task) {
        return RecaptchaActivity.e(this.f26247a, task);
    }
}
