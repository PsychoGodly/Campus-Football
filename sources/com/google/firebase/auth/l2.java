package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.q0;
import y6.l;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class l2 extends q0.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ q0.b f26270a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26271b;

    l2(FirebaseAuth firebaseAuth, q0.b bVar) {
        this.f26271b = firebaseAuth;
        this.f26270a = bVar;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    public final void onCodeSent(String str, q0.a aVar) {
        this.f26270a.onVerificationCompleted(q0.a(str, (String) q.k(this.f26271b.f26153g.e())));
    }

    public final void onVerificationCompleted(o0 o0Var) {
        this.f26270a.onVerificationCompleted(o0Var);
    }

    public final void onVerificationFailed(l lVar) {
        this.f26270a.onVerificationFailed(lVar);
    }
}
