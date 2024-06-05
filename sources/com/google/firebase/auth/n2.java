package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import d7.d1;
import d7.o0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class n2 extends o0<i> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a0 f26286a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j f26287b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26288c;

    n2(FirebaseAuth firebaseAuth, a0 a0Var, j jVar) {
        this.f26288c = firebaseAuth;
        this.f26286a = a0Var;
        this.f26287b = jVar;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        return this.f26288c.f26151e.zza(this.f26288c.f26147a, this.f26286a, (h) this.f26287b, str, (d1) new FirebaseAuth.d());
    }
}
