package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.g;
import b8.b;
import c8.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
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

/* compiled from: GmsRpc */
class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final f f26790a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f26791b;

    /* renamed from: c  reason: collision with root package name */
    private final d f26792c;

    /* renamed from: d  reason: collision with root package name */
    private final b<i> f26793d;

    /* renamed from: e  reason: collision with root package name */
    private final b<j> f26794e;

    /* renamed from: f  reason: collision with root package name */
    private final e f26795f;

    e0(f fVar, j0 j0Var, b<i> bVar, b<j> bVar2, e eVar) {
        this(fVar, j0Var, new d(fVar.m()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.continueWith(g.f4296a, new d0(this));
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.f26790a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) throws IOException {
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
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String i(Task task) throws Exception {
        return g((Bundle) task.getResult(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f26790a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f26791b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f26791b.a());
        bundle.putString("app_ver_name", this.f26791b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b11 = ((com.google.firebase.installations.g) Tasks.await(this.f26795f.a(false))).b();
            if (!TextUtils.isEmpty(b11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f26795f.getId()));
        bundle.putString("cliv", "fcm-" + "23.3.1");
        j jVar = this.f26794e.get();
        i iVar = this.f26793d.get();
        if (jVar != null && iVar != null && (b10 = jVar.b("fire-iid")) != j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.a()));
            bundle.putString("Firebase-Client", iVar.a());
        }
    }

    private Task<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f26792c.a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return d(k(j0.c(this.f26790a), "*", bundle));
    }

    /* access modifiers changed from: package-private */
    public Task<String> f() {
        return d(k(j0.c(this.f26790a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    public Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return d(k(str, "/topics/" + str2, bundle));
    }

    e0(f fVar, j0 j0Var, d dVar, b<i> bVar, b<j> bVar2, e eVar) {
        this.f26790a = fVar;
        this.f26791b = j0Var;
        this.f26792c = dVar;
        this.f26793d = bVar;
        this.f26794e = bVar2;
        this.f26795f = eVar;
    }
}
