package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.a0;
import androidx.core.view.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3312a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3313b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f3314c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3315d;

    /* compiled from: PopupWindowCompat */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* compiled from: PopupWindowCompat */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.c(popupWindow, z10);
        } else if (i10 >= 21) {
            if (!f3315d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3314c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
                }
                f3315d = true;
            }
            Field field = f3314c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z10));
                } catch (IllegalAccessException e11) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
                }
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i10);
            return;
        }
        if (!f3313b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f3312a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3313b = true;
        }
        Method method = f3312a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i10)});
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.a(popupWindow, view, i10, i11, i12);
            return;
        }
        if ((e.b(i12, a0.B(view)) & 7) == 5) {
            i10 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i10, i11);
    }
}
