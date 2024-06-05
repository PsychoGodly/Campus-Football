package m5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import h5.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f20096a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f20097b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f20098c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f20099d;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f20100e;

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f20101f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f20100e == null) {
            boolean z10 = false;
            if (m.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f20100e = Boolean.valueOf(z10);
        }
        return f20100e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f20101f == null) {
            boolean z10 = false;
            if (m.l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f20101f = Boolean.valueOf(z10);
        }
        return f20101f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f20098c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f20098c = Boolean.valueOf(z10);
        }
        return f20098c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i10 = j.f18843a;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f20096a == null) {
            boolean z10 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f20096a = Boolean.valueOf(z10);
        }
        return f20096a.booleanValue();
    }

    public static boolean g(Context context) {
        if (f(context) && !m.h()) {
            return true;
        }
        if (h(context)) {
            return !m.i() || m.l();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f20097b == null) {
            boolean z10 = false;
            if (m.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f20097b = Boolean.valueOf(z10);
        }
        return f20097b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f20099d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f20099d = Boolean.valueOf(z10);
        }
        return f20099d.booleanValue();
    }
}
