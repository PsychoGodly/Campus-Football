package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* compiled from: CheckedTextViewCompat */
public final class b {

    /* compiled from: CheckedTextViewCompat */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f3307a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f3308b;

        static Drawable a(CheckedTextView checkedTextView) {
            if (!f3308b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f3307a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", e10);
                }
                f3308b = true;
            }
            Field field = f3307a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e11) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", e11);
                    f3307a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.widget.b$b  reason: collision with other inner class name */
    /* compiled from: CheckedTextViewCompat */
    private static class C0050b {
        static Drawable a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* compiled from: CheckedTextViewCompat */
    private static class c {
        static void a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable a(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0050b.a(checkedTextView);
        }
        return a.a(checkedTextView);
    }

    public static void b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof k) {
            ((k) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    public static void c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.b(checkedTextView, mode);
        } else if (checkedTextView instanceof k) {
            ((k) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
