package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat */
public final class f {

    /* compiled from: BundleCompat */
    static class a {
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* compiled from: BundleCompat */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f2698a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2699b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f2700c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2701d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f2699b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2698a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e10);
                }
                f2699b = true;
            }
            Method method2 = f2698a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e11);
                    f2698a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f2701d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2700c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e10);
                }
                f2701d = true;
            }
            Method method2 = f2700c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e11);
                    f2700c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return a.a(bundle, str);
        }
        return b.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.b(bundle, str, iBinder);
        } else {
            b.b(bundle, str, iBinder);
        }
    }
}
