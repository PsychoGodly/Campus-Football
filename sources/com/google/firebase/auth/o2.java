package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import d7.o0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class o2 extends o0<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f26294a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f26295b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26296c;

    o2(FirebaseAuth firebaseAuth, String str, e eVar) {
        this.f26296c = firebaseAuth;
        this.f26294a = str;
        this.f26295b = eVar;
    }

    public final Task<Void> d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f26294a;
            Log.i("FirebaseAuth", "Email link sign in for " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f26294a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + str3);
        }
        return this.f26296c.f26151e.zzb(this.f26296c.f26147a, this.f26294a, this.f26295b, this.f26296c.f26157k, str);
    }
}
