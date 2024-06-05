package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2914a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2915b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2916c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2917d;

    /* renamed from: androidx.core.graphics.drawable.a$a  reason: collision with other inner class name */
    /* compiled from: DrawableCompat */
    static class C0035a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* compiled from: DrawableCompat */
    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat */
    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.a(drawable, theme);
        }
    }

    public static boolean b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.b(drawable);
        }
        return false;
    }

    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            drawable.clearColorFilter();
        } else if (i10 >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                c(C0035a.c((InsetDrawable) drawable));
            } else if (drawable instanceof c) {
                c(((c) drawable).b());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    Drawable b10 = C0035a.b(drawableContainerState, i11);
                    if (b10 != null) {
                        c(b10);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static int d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0035a.a(drawable);
        }
        return 0;
    }

    public static ColorFilter e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.c(drawable);
        }
        return null;
    }

    public static int f(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return c.a(drawable);
        }
        if (i10 >= 17) {
            if (!f2917d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2916c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
                }
                f2917d = true;
            }
            Method method = f2916c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e11) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                    f2916c = null;
                }
            }
        }
        return 0;
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0035a.d(drawable);
        }
        return false;
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0035a.e(drawable, z10);
        }
    }

    public static void k(Drawable drawable, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.e(drawable, f10, f11);
        }
    }

    public static void l(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.f(drawable, i10, i11, i12, i13);
        }
    }

    public static boolean m(Drawable drawable, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return c.b(drawable, i10);
        }
        if (i11 >= 17) {
            if (!f2915b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f2914a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
                }
                f2915b = true;
            }
            Method method = f2914a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i10)});
                    return true;
                } catch (Exception e11) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                    f2914a = null;
                }
            }
        }
        return false;
    }

    public static void n(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.g(drawable, i10);
        } else if (drawable instanceof b) {
            ((b) drawable).setTint(i10);
        }
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.h(drawable, colorStateList);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintList(colorStateList);
        }
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.i(drawable, mode);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintMode(mode);
        }
    }

    public static <T extends Drawable> T q(Drawable drawable) {
        return drawable instanceof c ? ((c) drawable).b() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return drawable;
        }
        return i10 >= 21 ? !(drawable instanceof b) ? new e(drawable) : drawable : !(drawable instanceof b) ? new d(drawable) : drawable;
    }
}
