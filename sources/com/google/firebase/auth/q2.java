package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import d7.t;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class q2 implements t {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a0 f26322a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26323b;

    q2(FirebaseAuth firebaseAuth, a0 a0Var) {
        this.f26323b = firebaseAuth;
        this.f26322a = a0Var;
    }

    public final void zza() {
        if (this.f26323b.f26152f != null && this.f26323b.f26152f.c().equalsIgnoreCase(this.f26322a.c())) {
            this.f26323b.H0();
        }
    }

    public final void zza(Status status) {
        if (status.w() == 17011 || status.w() == 17021 || status.w() == 17005) {
            this.f26323b.E();
        }
    }
}
