package h5;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.i;
import m5.m;
import m5.r;
import o5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class j {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f18843a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f18844b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f18845c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f18846d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f18847e = new AtomicBoolean();

    @Deprecated
    public static void a(Context context) {
        if (!f18844b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    public static void b(Context context, int i10) throws h, g {
        int j10 = f.h().j(context, i10);
        if (j10 != 0) {
            Intent d10 = f.h().d(context, j10, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + j10);
            if (d10 == null) {
                throw new g(j10);
            }
            throw new h(j10, "Google Play Services not available", d10);
        }
    }

    @Deprecated
    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String d(int i10) {
        return b.B(i10);
    }

    public static Context e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean g(Context context) {
        if (!f18846d) {
            try {
                PackageInfo f10 = c.a(context).f("com.google.android.gms", 64);
                k.a(context);
                if (f10 == null || k.e(f10, false) || !k.e(f10, true)) {
                    f18845c = false;
                } else {
                    f18845c = true;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
            } finally {
                f18846d = true;
            }
        }
        return f18845c || !i.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = h5.l.f18852a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f18847e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = com.google.android.gms.common.internal.w0.a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f18843a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = m5.i.g(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = m5.i.i(r10)
            if (r1 != 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            com.google.android.gms.common.internal.q.a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007d
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = 9
            goto L_0x0133
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0126 }
            h5.k.a(r10)
            boolean r10 = h5.k.e(r9, r3)
            if (r10 != 0) goto L_0x009a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x009a:
            if (r1 == 0) goto L_0x00b3
            com.google.android.gms.common.internal.q.k(r8)
            boolean r10 = h5.k.e(r8, r3)
            if (r10 != 0) goto L_0x00b3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b3:
            if (r1 == 0) goto L_0x00d3
            if (r8 == 0) goto L_0x00d3
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d3:
            int r10 = r9.versionCode
            int r10 = m5.t.a(r10)
            int r1 = m5.t.a(r11)
            if (r10 >= r1) goto L_0x0107
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0133
        L_0x0107:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x011f
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0110 }
            goto L_0x011f
        L_0x0110:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0133
        L_0x011f:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0125
            r3 = 3
            goto L_0x0133
        L_0x0125:
            return r4
        L_0x0126:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0133:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.j.h(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean i(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean j(Context context) {
        if (!m.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        q.k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean k(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @Deprecated
    public static boolean l(Context context, int i10, String str) {
        return r.b(context, i10, str);
    }

    static boolean m(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (m.f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !j(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
