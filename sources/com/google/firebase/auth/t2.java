package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class t2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f26330a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26331b;

    t2(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f26331b = firebaseAuth;
        this.f26330a = aVar;
    }

    public final void run() {
        this.f26330a.a(this.f26331b);
    }
}
