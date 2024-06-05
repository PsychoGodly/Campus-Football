package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f26608a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26609b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26610c;

    c(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f26608a = firebaseInstanceId;
        this.f26609b = str;
        this.f26610c = str2;
    }

    public Object then(Task task) {
        return this.f26608a.y(this.f26609b, this.f26610c, task);
    }
}
