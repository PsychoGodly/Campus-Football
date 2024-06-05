package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.e;
import b7.a;
import b8.b;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaci;
import com.google.android.gms.internal.p001firebaseauthapi.zzacj;
import com.google.android.gms.internal.p001firebaseauthapi.zzack;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import com.google.android.gms.internal.p001firebaseauthapi.zzb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.network.model.HttpRequest;
import d7.c1;
import d7.e1;
import d7.g0;
import d7.m0;
import d7.o1;
import d7.p1;
import d7.q;
import d7.r1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import m5.h;
import m5.j;
import org.json.JSONException;
import org.json.JSONObject;
import y6.f;

@KeepName
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class GenericIdpActivity extends e implements zzack {

    /* renamed from: b  reason: collision with root package name */
    private static long f26239b;

    /* renamed from: c  reason: collision with root package name */
    private static final e1 f26240c = e1.f();

    /* renamed from: a  reason: collision with root package name */
    private boolean f26241a = false;

    private final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String f10 = f(intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String uuid = UUID.randomUUID().toString();
        String zza = zzacj.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = stringExtra;
        String str4 = zza;
        String str5 = uuid;
        String str6 = f10;
        String str7 = join;
        p1.c().e(getApplicationContext(), str, uuid, zza, action, stringExtra2, stringExtra3, stringExtra4);
        String b10 = r1.a(getApplicationContext(), f.p(stringExtra4).s()).b();
        if (TextUtils.isEmpty(b10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            g(q.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (str4 == null) {
            return null;
        } else {
            Uri.Builder appendQueryParameter = builder2.appendQueryParameter("eid", "p");
            appendQueryParameter.appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", str3).appendQueryParameter("providerId", stringExtra2).appendQueryParameter(JsonStorageKeyNames.SESSION_ID_KEY, str4).appendQueryParameter("eventId", str5).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b10);
            if (!TextUtils.isEmpty(str7)) {
                builder2.appendQueryParameter("scopes", str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                builder2.appendQueryParameter("customParameters", str6);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder2.appendQueryParameter(ScarConstants.TOKEN_ID_KEY, stringExtra3);
            }
            return builder2;
        }
    }

    static /* synthetic */ Uri e(Uri uri, Task task) throws Exception {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            a aVar = (a) task.getResult();
            if (aVar.a() != null) {
                String valueOf = String.valueOf(aVar.a());
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + valueOf);
            }
            String b10 = aVar.b();
            buildUpon.fragment("fac=" + b10);
        } else {
            String message = task.getException().getMessage();
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + message);
        }
        return buildUpon.build();
    }

    private static String f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    private final void g(Status status) {
        f26239b = 0;
        this.f26241a = false;
        Intent intent = new Intent();
        c1.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!h(intent)) {
            m0.b(getApplicationContext(), status);
        } else {
            f26240c.a(this);
        }
        finish();
    }

    private final boolean h(Intent intent) {
        return r0.a.b(this).d(intent);
    }

    private final void i() {
        f26239b = 0;
        this.f26241a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!h(intent)) {
            m0.b(this, q.a("WEB_CONTEXT_CANCELED"));
        } else {
            f26240c.a(this);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a10 = h.d().a();
            if (a10 - f26239b < 30000) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f26239b = a10;
            if (bundle != null) {
                this.f26241a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
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
                g(c1.b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                i();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                o1 b10 = p1.c().b(this, packageName, stringExtra2);
                if (b10 == null) {
                    i();
                }
                if (booleanExtra) {
                    stringExtra = r1.a(getApplicationContext(), f.p(b10.a()).s()).c(stringExtra);
                }
                zzagt zzagt = new zzagt(b10, stringExtra);
                String e10 = b10.e();
                String b11 = b10.b();
                zzagt.zzb(e10);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b11) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b11) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b11)) {
                    f26239b = 0;
                    this.f26241a = false;
                    Intent intent2 = new Intent();
                    i5.e.e(zzagt, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b11);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!h(intent2)) {
                        m0.c(getApplicationContext(), zzagt, b11, e10);
                    } else {
                        f26240c.a(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: " + b11);
                i();
            }
        } else if (!this.f26241a) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = j.b(m5.a.a(this, packageName2)).toLowerCase(Locale.US);
                f p10 = f.p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(p10);
                if (!zzaed.zza(p10)) {
                    new zzaci(packageName2, lowerCase, getIntent(), p10, this).executeOnExecutor(instance.B0(), new Void[0]);
                } else {
                    zza(d(Uri.parse(zzaed.zza(p10.r().b())).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, instance.t0());
                }
            } catch (PackageManager.NameNotFoundException e11) {
                String valueOf = String.valueOf(e11);
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + valueOf);
                zzacj.zzb(this, packageName2);
            }
            this.f26241a = true;
        } else {
            i();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f26241a);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            i();
        } else {
            g(status);
        }
    }

    public final void zza(Uri uri, String str, b<c7.b> bVar) {
        Task<TContinuationResult> task;
        c7.b bVar2 = bVar.get();
        if (bVar2 != null) {
            task = bVar2.a(false).continueWith(new a(uri));
        } else {
            task = Tasks.forResult(uri);
        }
        task.addOnCompleteListener(new g0(this, str));
    }
}
