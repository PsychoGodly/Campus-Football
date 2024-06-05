package h8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import o7.c;
import y6.b;

/* compiled from: DataCollectionConfigStorage */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f28938a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f28939b;

    /* renamed from: c  reason: collision with root package name */
    private final c f28940c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28941d = c();

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f28938a = a10;
        this.f28939b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28940c = cVar;
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return androidx.core.content.a.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        if (this.f28939b.contains("firebase_data_collection_default_enabled")) {
            return this.f28939b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f28938a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f28938a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f28941d != z10) {
            this.f28941d = z10;
            this.f28940c.b(new o7.a(b.class, new b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f28941d;
    }

    public synchronized void e(Boolean bool) {
        if (bool == null) {
            this.f28939b.edit().remove("firebase_data_collection_default_enabled").apply();
            f(d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f28939b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            f(equals);
        }
    }
}
