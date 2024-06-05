package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;

public abstract class x3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f13273a = new HashMap(2);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f13274a;

        /* renamed from: b  reason: collision with root package name */
        int f13275b;

        /* renamed from: c  reason: collision with root package name */
        int f13276c;

        /* renamed from: d  reason: collision with root package name */
        int f13277d;

        /* renamed from: com.applovin.impl.x3$a$a  reason: collision with other inner class name */
        public static class C0147a {

            /* renamed from: a  reason: collision with root package name */
            private int f13278a;

            /* renamed from: b  reason: collision with root package name */
            private int f13279b;

            /* renamed from: c  reason: collision with root package name */
            private int f13280c;

            /* renamed from: d  reason: collision with root package name */
            private int f13281d;

            C0147a() {
            }

            public C0147a a(int i10) {
                this.f13280c = i10;
                return this;
            }

            public C0147a b(int i10) {
                this.f13281d = i10;
                return this;
            }

            public C0147a c(int i10) {
                this.f13278a = i10;
                return this;
            }

            public C0147a d(int i10) {
                this.f13279b = i10;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f13278a + ", topRight=" + this.f13279b + ", bottomLeft=" + this.f13280c + ", bottomRight=" + this.f13281d + ")";
            }

            public a a() {
                return new a(this.f13278a, this.f13279b, this.f13280c, this.f13281d);
            }
        }

        a(int i10, int i11, int i12, int i13) {
            this.f13274a = i10;
            this.f13275b = i11;
            this.f13276c = i12;
            this.f13277d = i13;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f13277d;
        }

        public int c() {
            return this.f13274a;
        }

        public int d() {
            return this.f13275b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b();
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f13276c;
        }
    }

    public static Point a(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        Map map = f13273a;
        if (map.containsKey(Integer.valueOf(orientation))) {
            return (Point) map.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else if (d()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        map.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static a a(Context context, k kVar) {
        a aVar = null;
        if (((Boolean) kVar.a(oj.f10308g4)).booleanValue() && m()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVar = new a.C0147a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVar;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }
}
