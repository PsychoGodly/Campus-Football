package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import d7.a;
import h8.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class u2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26334a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b f26335b;

    u2(FirebaseAuth firebaseAuth, b bVar) {
        this.f26334a = firebaseAuth;
        this.f26335b = bVar;
    }

    public final void run() {
        for (a a10 : this.f26334a.f26149c) {
            a10.a(this.f26335b);
        }
        for (FirebaseAuth.b a11 : this.f26334a.f26148b) {
            a11.a(this.f26334a);
        }
    }
}
