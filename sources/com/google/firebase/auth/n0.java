package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzacr;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class n0 extends n {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f26278a;

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f26279a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f26280b;

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f26281c;

        private a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f26280b = bundle;
            Bundle bundle2 = new Bundle();
            this.f26281c = bundle2;
            this.f26279a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.l().r().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzacr.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.q());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.l().q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.n());
        }

        public a a(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                this.f26281c.putString((String) next.getKey(), (String) next.getValue());
            }
            return this;
        }

        public n0 b() {
            return new n0(this.f26280b);
        }

        public a c(List<String> list) {
            this.f26280b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList(list));
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f26282a;

        /* renamed from: b  reason: collision with root package name */
        private String f26283b;

        /* renamed from: c  reason: collision with root package name */
        private String f26284c;

        /* renamed from: d  reason: collision with root package name */
        private String f26285d;

        private b(String str) {
            this.f26282a = str;
        }

        public h a() {
            return d2.J(this.f26282a, this.f26283b, this.f26284c, this.f26285d);
        }

        public b b(String str) {
            this.f26284c = str;
            return this;
        }

        public b c(String str) {
            this.f26283b = str;
            return this;
        }

        public b d(String str, String str2) {
            this.f26283b = str;
            this.f26285d = str2;
            return this;
        }
    }

    private n0(Bundle bundle) {
        this.f26278a = bundle;
    }

    public static a d(String str) {
        return e(str, FirebaseAuth.getInstance());
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        q.g(str);
        q.k(firebaseAuth);
        if (!"facebook.com".equals(str) || zzaed.zza(firebaseAuth.l())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(q.g(str));
    }

    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f26278a);
        activity.startActivity(intent);
    }

    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f26278a);
        activity.startActivity(intent);
    }

    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f26278a);
        activity.startActivity(intent);
    }
}
