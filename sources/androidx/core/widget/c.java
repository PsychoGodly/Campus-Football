package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Field f3309a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3310b;

    /* compiled from: CompoundButtonCompat */
    static class a {
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat */
    static class b {
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(compoundButton);
        }
        if (!f3310b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3309a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f3310b = true;
        }
        Field field = f3309a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f3309a = null;
            }
        }
        return null;
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(compoundButton);
        }
        if (compoundButton instanceof l) {
            return ((l) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.c(compoundButton, colorStateList);
        } else if (compoundButton instanceof l) {
            ((l) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.d(compoundButton, mode);
        } else if (compoundButton instanceof l) {
            ((l) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
