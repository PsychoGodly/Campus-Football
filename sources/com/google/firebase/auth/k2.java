package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.firebase.auth.q0;
import y6.l;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class k2 extends q0.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p0 f26265a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q0.b f26266b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26267c;

    k2(FirebaseAuth firebaseAuth, p0 p0Var, q0.b bVar) {
        this.f26267c = firebaseAuth;
        this.f26265a = p0Var;
        this.f26266b = bVar;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f26266b.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, q0.a aVar) {
        this.f26266b.onCodeSent(str, aVar);
    }

    public final void onVerificationCompleted(o0 o0Var) {
        this.f26266b.onVerificationCompleted(o0Var);
    }

    public final void onVerificationFailed(l lVar) {
        if (zzacf.zza((Exception) lVar)) {
            this.f26265a.b(true);
            String i10 = this.f26265a.i();
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + i10);
            FirebaseAuth.i0(this.f26265a);
            return;
        }
        String i11 = this.f26265a.i();
        String message = lVar.getMessage();
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + i11 + ", error - " + message);
        this.f26266b.onVerificationFailed(lVar);
    }
}
