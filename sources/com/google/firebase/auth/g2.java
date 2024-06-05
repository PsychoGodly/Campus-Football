package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class g2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.b f26232a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26233b;

    g2(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f26233b = firebaseAuth;
        this.f26232a = bVar;
    }

    public final void run() {
        this.f26232a.a(this.f26233b);
    }
}
