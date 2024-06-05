package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b8.b;
import c8.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.g;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import g5.d;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import l8.i;
import y6.f;
import z7.j;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final f f26626a;

    /* renamed from: b  reason: collision with root package name */
    private final n f26627b;

    /* renamed from: c  reason: collision with root package name */
    private final d f26628c;

    /* renamed from: d  reason: collision with root package name */
    private final b<i> f26629d;

    /* renamed from: e  reason: collision with root package name */
    private final b<j> f26630e;

    /* renamed from: f  reason: collision with root package name */
    private final e f26631f;

    public k(f fVar, n nVar, b<i> bVar, b<j> bVar2, e eVar) {
        this(fVar, nVar, new d(fVar.m()), bVar, bVar2, eVar);
    }

    k(f fVar, n nVar, d dVar, b<i> bVar, b<j> bVar2, e eVar) {
        this.f26626a = fVar;
        this.f26627b = nVar;
        this.f26628c = dVar;
        this.f26629d = bVar;
        this.f26630e = bVar2;
        this.f26631f = eVar;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(b.a(), new j(this));
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.f26626a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        j.a b10;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f26626a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f26627b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f26627b.a());
        bundle.putString("app_ver_name", this.f26627b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((g) Tasks.await(this.f26631f.a(false))).b();
            if (!TextUtils.isEmpty(b11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        j jVar = this.f26630e.get();
        i iVar = this.f26629d.get();
        if (!(jVar == null || iVar == null || (b10 = jVar.b("fire-iid")) == j.a.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.a()));
            bundle.putString("Firebase-Client", iVar.a());
        }
        return bundle;
    }

    private Task<Bundle> j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.f26628c.a(bundle);
    }

    public Task<?> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return c(j(str, str2, str3, bundle));
    }

    public Task<String> e(String str, String str2, String str3) {
        return c(j(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String h(Task task) throws Exception {
        return f((Bundle) task.getResult(IOException.class));
    }
}
