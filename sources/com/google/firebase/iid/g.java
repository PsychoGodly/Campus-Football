package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class g implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f26618a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26619b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26620c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26621d;

    g(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f26618a = firebaseInstanceId;
        this.f26619b = str;
        this.f26620c = str2;
        this.f26621d = str3;
    }

    public Task then(Object obj) {
        return this.f26618a.v(this.f26619b, this.f26620c, this.f26621d, (String) obj);
    }
}
