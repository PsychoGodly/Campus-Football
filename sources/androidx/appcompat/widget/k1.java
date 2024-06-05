package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.view.a0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtils */
public class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1692a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f1693b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1693b = i10 >= 27;
        if (i10 >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f1692a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1692a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1692a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e10) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    public static boolean b(View view) {
        return a0.B(view) == 1;
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e10) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
            } catch (IllegalAccessException e11) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
            }
        }
    }
}
