package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.x0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f26892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26893b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x0.a f26894c;

    public /* synthetic */ t(FirebaseMessaging firebaseMessaging, String str, x0.a aVar) {
        this.f26892a = firebaseMessaging;
        this.f26893b = str;
        this.f26894c = aVar;
    }

    public final Task then(Object obj) {
        return this.f26892a.B(this.f26893b, this.f26894c, (String) obj);
    }
}
