package com.google.firebase.auth.internal;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Uri f26246a;

    public /* synthetic */ a(Uri uri) {
        this.f26246a = uri;
    }

    public final Object then(Task task) {
        return GenericIdpActivity.e(this.f26246a, task);
    }
}
