package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import d7.d1;
import d7.i1;
import d7.o0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class g1 extends o0<i> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f26228a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a0 f26229b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j f26230c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26231d;

    g1(FirebaseAuth firebaseAuth, boolean z10, a0 a0Var, j jVar) {
        this.f26231d = firebaseAuth;
        this.f26228a = z10;
        this.f26229b = a0Var;
        this.f26230c = jVar;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (!this.f26228a) {
            return this.f26231d.f26151e.zza(this.f26231d.f26147a, this.f26230c, str, (i1) new FirebaseAuth.c());
        }
        return this.f26231d.f26151e.zzb(this.f26231d.f26147a, (a0) q.k(this.f26229b), this.f26230c, str, (d1) new FirebaseAuth.d());
    }
}
