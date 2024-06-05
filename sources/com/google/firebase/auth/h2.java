package com.google.firebase.auth;

import com.google.firebase.auth.q0;
import y6.l;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class h2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ q0.b f26234a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ l f26235b;

    public /* synthetic */ h2(q0.b bVar, l lVar) {
        this.f26234a = bVar;
        this.f26235b = lVar;
    }

    public final void run() {
        this.f26234a.onVerificationFailed(this.f26235b);
    }
}
