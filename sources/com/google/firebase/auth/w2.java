package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class w2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26340a;

    w2(FirebaseAuth firebaseAuth) {
        this.f26340a = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.a a10 : this.f26340a.f26150d) {
            a10.a(this.f26340a);
        }
    }
}
