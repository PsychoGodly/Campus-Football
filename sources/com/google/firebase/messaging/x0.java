package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store */
class x0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f26914a;

    /* compiled from: Store */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f26915d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f26916a;

        /* renamed from: b  reason: collision with root package name */
        final String f26917b;

        /* renamed from: c  reason: collision with root package name */
        final long f26918c;

        private a(String str, String str2, long j10) {
            this.f26916a = str;
            this.f26917b = str2;
            this.f26918c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f26918c + f26915d || !str.equals(this.f26917b);
        }
    }

    public x0(Context context) {
        this.f26914a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.a.getNoBackupFilesDir(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    c();
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
                }
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|" + "*";
    }

    public synchronized void c() {
        this.f26914a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b10 = b(str, str2);
        SharedPreferences.Editor edit = this.f26914a.edit();
        edit.remove(b10);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f26914a.getString(b(str, str2), (String) null));
    }

    public synchronized boolean f() {
        return this.f26914a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f26914a.edit();
            edit.putString(b(str, str2), a10);
            edit.commit();
        }
    }
}
