package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.s;
import com.google.firebase.iid.u;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class f implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f26613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26614b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26615c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26616d;

    /* renamed from: e  reason: collision with root package name */
    private final u.a f26617e;

    f(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, u.a aVar) {
        this.f26613a = firebaseInstanceId;
        this.f26614b = str;
        this.f26615c = str2;
        this.f26616d = str3;
        this.f26617e = aVar;
    }

    public Task start() {
        return this.f26613a.x(this.f26614b, this.f26615c, this.f26616d, this.f26617e);
    }
}
