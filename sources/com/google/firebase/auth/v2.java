package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import d7.i1;
import d7.w;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class v2 implements w, i1 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26336a;

    v2(FirebaseAuth firebaseAuth) {
        this.f26336a = firebaseAuth;
    }

    public final void a(zzafn zzafn, a0 a0Var) {
        this.f26336a.h0(a0Var, zzafn, true, true);
    }

    public final void zza(Status status) {
        int w10 = status.w();
        if (w10 == 17011 || w10 == 17021 || w10 == 17005) {
            this.f26336a.E();
        }
    }
}
