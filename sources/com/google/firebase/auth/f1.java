package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import d7.o0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class f1 extends o0<i> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f26222a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f26223b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a0 f26224c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f26225d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f26226e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26227f;

    f1(FirebaseAuth firebaseAuth, String str, boolean z10, a0 a0Var, String str2, String str3) {
        this.f26227f = firebaseAuth;
        this.f26222a = str;
        this.f26223b = z10;
        this.f26224c = a0Var;
        this.f26225d = str2;
        this.f26226e = str3;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f26222a;
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f26222a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str3);
        }
        if (this.f26223b) {
            return this.f26227f.f26151e.zzb(this.f26227f.f26147a, (a0) q.k(this.f26224c), this.f26222a, this.f26225d, this.f26226e, str, new FirebaseAuth.d());
        }
        return this.f26227f.f26151e.zzb(this.f26227f.f26147a, this.f26222a, this.f26225d, this.f26226e, str, new FirebaseAuth.c());
    }
}
