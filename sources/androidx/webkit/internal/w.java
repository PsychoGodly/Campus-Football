package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import j1.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: StartupApiFeature */
public abstract class w {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<w> f5062c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f5063a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5064b;

    /* compiled from: StartupApiFeature */
    public static class a extends w {
        a(String str, String str2) {
            super(str, str2);
        }

        public final boolean e() {
            return false;
        }
    }

    /* compiled from: StartupApiFeature */
    public static class b extends w {
        b(String str, String str2) {
            super(str, str2);
        }

        public final boolean e() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    w(String str, String str2) {
        this.f5063a = str;
        this.f5064b = str2;
        f5062c.add(this);
    }

    private static Bundle a(Context context) {
        PackageInfo f10 = r.f(context);
        if (f10 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(f10.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            try {
                return i.a(context.getPackageManager(), componentName, i.b(640)).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } else {
            int i11 = 128;
            if (i10 >= 24) {
                i11 = 640;
            }
            try {
                return c(context, componentName, i11).metaData;
            } catch (PackageManager.NameNotFoundException unused2) {
                return null;
            }
        }
    }

    private static ServiceInfo c(Context context, ComponentName componentName, int i10) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(componentName, i10);
    }

    public static Set<w> g() {
        return Collections.unmodifiableSet(f5062c);
    }

    public String b() {
        return this.f5063a;
    }

    public boolean d(Context context) {
        return e() || f(context);
    }

    public abstract boolean e();

    public boolean f(Context context) {
        Bundle a10 = a(context);
        if (a10 == null) {
            return false;
        }
        return a10.containsKey(this.f5064b);
    }
}
