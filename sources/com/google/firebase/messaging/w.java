package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s0;
import com.google.firebase.messaging.x0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements s0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f26904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26905b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x0.a f26906c;

    public /* synthetic */ w(FirebaseMessaging firebaseMessaging, String str, x0.a aVar) {
        this.f26904a = firebaseMessaging;
        this.f26905b = str;
        this.f26906c = aVar;
    }

    public final Task start() {
        return this.f26904a.A(this.f26905b, this.f26906c);
    }
}
