package k4;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleUtil */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f19676a;

    public static IBinder a(Bundle bundle, String str) {
        if (n0.f19738a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f19676a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f19676a = method2;
                method2.setAccessible(true);
                method = f19676a;
            } catch (NoSuchMethodException e10) {
                r.g("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            r.g("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }
}
