package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.d;
import androidx.fragment.app.e;
import b7.a;
import b8.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaci;
import com.google.android.gms.internal.p001firebaseauthapi.zzacj;
import com.google.android.gms.internal.p001firebaseauthapi.zzack;
import com.google.android.gms.internal.p001firebaseauthapi.zzacw;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.unity3d.services.core.network.model.HttpRequest;
import d7.c1;
import d7.e1;
import d7.m0;
import d7.p1;
import d7.q;
import d7.r1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import m5.h;
import m5.j;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class RecaptchaActivity extends e implements zzack {

    /* renamed from: b  reason: collision with root package name */
    private static final String f26242b = "RecaptchaActivity";

    /* renamed from: c  reason: collision with root package name */
    private static long f26243c;

    /* renamed from: d  reason: collision with root package name */
    private static final e1 f26244d = e1.f();

    /* renamed from: a  reason: collision with root package name */
    private boolean f26245a = false;

    private final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f p10 = f.p(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(p10);
        p1.c().d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String b10 = r1.a(getApplicationContext(), p10.s()).b();
        if (TextUtils.isEmpty(b10)) {
            Log.e(f26242b, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            f(q.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(instance.p())) {
            str3 = instance.p();
        } else {
            str3 = zzacw.zza();
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid);
        appendQueryParameter.appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b10);
        return builder;
    }

    static /* synthetic */ Uri e(Uri uri, Task task) throws Exception {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            a aVar = (a) task.getResult();
            if (aVar.a() != null) {
                String str = f26242b;
                String valueOf = String.valueOf(aVar.a());
                Log.w(str, "Error getting App Check token; using placeholder token instead. Error: " + valueOf);
            }
            String b10 = aVar.b();
            buildUpon.fragment("fac=" + b10);
        } else {
            String str2 = f26242b;
            String message = task.getException().getMessage();
            Log.e(str2, "Unexpected error getting App Check token: " + message);
        }
        return buildUpon.build();
    }

    private final void f(Status status) {
        f26243c = 0;
        this.f26245a = false;
        Intent intent = new Intent();
        c1.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        h(intent);
        f26244d.a(this);
        finish();
    }

    private final boolean h(Intent intent) {
        return r0.a.b(this).d(intent);
    }

    private final void i() {
        f26243c = 0;
        this.f26245a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        h(intent);
        f26244d.a(this);
        finish();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str, Task task) {
        boolean z10 = false;
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                z10 = true;
            }
            if (z10) {
                d b10 = new d.b().b();
                b10.f1921a.addFlags(1073741824);
                b10.f1921a.addFlags(268435456);
                b10.b(this, (Uri) task.getResult());
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        Log.e(f26242b, "Device cannot resolve intent for: android.intent.action.VIEW");
        zzacj.zzb(this, str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a10 = h.d().a();
            if (a10 - f26243c < 30000) {
                Log.e(f26242b, "Could not start operation - already in progress");
                return;
            }
            f26243c = a10;
            if (bundle != null) {
                this.f26245a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        String str = f26242b;
        Log.e(str, "Could not do operation - unknown action: " + action);
        i();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                f(c1.b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                i();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String g10 = p1.c().g(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
                if (TextUtils.isEmpty(g10)) {
                    Log.e(f26242b, "Failed to find registration for this event - failing to prevent session injection.");
                    f(q.a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = r1.a(getApplicationContext(), f.p(g10).s()).c(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f26243c = 0;
                this.f26245a = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!h(intent2)) {
                    m0.f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                } else {
                    f26244d.a(this);
                }
                finish();
            }
        } else if (!this.f26245a) {
            Intent intent3 = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = j.b(m5.a.a(this, packageName)).toLowerCase(Locale.US);
                f p10 = f.p(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(p10);
                if (!zzaed.zza(p10)) {
                    new zzaci(packageName, lowerCase, intent3, p10, this).executeOnExecutor(instance.B0(), new Void[0]);
                } else {
                    zza(d(Uri.parse(zzaed.zza(p10.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, instance.t0());
                }
            } catch (PackageManager.NameNotFoundException e10) {
                String str = f26242b;
                String valueOf = String.valueOf(e10);
                Log.e(str, "Could not get package signature: " + packageName + " " + valueOf);
                zzacj.zzb(this, packageName);
            }
            this.f26245a = true;
        } else {
            i();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f26245a);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return d(new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final String zza(String str) {
        return zzaed.zzb(str);
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzack.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            i();
        } else {
            f(status);
        }
    }

    public final void zza(Uri uri, String str, b<c7.b> bVar) {
        Task<TContinuationResult> task;
        c7.b bVar2 = bVar.get();
        if (bVar2 != null) {
            task = bVar2.a(false).continueWith(new b(uri));
        } else {
            task = Tasks.forResult(uri);
        }
        task.addOnCompleteListener(new c(this, str));
    }
}
