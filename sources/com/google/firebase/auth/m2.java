package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import d7.i1;
import d7.o0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class m2 extends o0<i> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f26275a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f26276b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26277c;

    m2(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f26277c = firebaseAuth;
        this.f26275a = str;
        this.f26276b = str2;
    }

    public final Task<i> d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f26275a;
            Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f26275a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str3);
        }
        return this.f26277c.f26151e.zza(this.f26277c.f26147a, this.f26275a, this.f26276b, this.f26277c.f26157k, str, (i1) new FirebaseAuth.c());
    }
}
