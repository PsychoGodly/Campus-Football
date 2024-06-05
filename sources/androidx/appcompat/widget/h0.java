package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.c;

/* compiled from: DrawableUtils */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1615a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1616b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1617c = new Rect();

    public static boolean a(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17) {
            return true;
        }
        if (i10 < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i10 < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i10 < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable a10 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(a10)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof c) {
            return a(((c) drawable).b());
        } else {
            if (drawable instanceof j.c) {
                return a(((j.c) drawable).a());
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            c(drawable);
        } else if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1615a);
        } else {
            drawable.setState(f1616b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode d(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
