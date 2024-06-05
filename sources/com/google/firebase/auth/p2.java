package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import d7.o0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class p2 extends o0<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f26318a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f26319b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26320c;

    p2(FirebaseAuth firebaseAuth, String str, e eVar) {
        this.f26320c = firebaseAuth;
        this.f26318a = str;
        this.f26319b = eVar;
    }

    public final Task<Void> d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f26318a;
            Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f26318a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str3);
        }
        return this.f26320c.f26151e.zza(this.f26320c.f26147a, this.f26318a, this.f26319b, this.f26320c.f26157k, str);
    }
}
