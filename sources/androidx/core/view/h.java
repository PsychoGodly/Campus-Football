package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat */
public final class h {

    /* compiled from: MarginLayoutParamsCompat */
    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.resolveLayoutDirection(i10);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setLayoutDirection(i10);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginEnd(i10);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginStart(i10);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return a.b(marginLayoutParams);
        }
        return marginLayoutParams.rightMargin;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return a.c(marginLayoutParams);
        }
        return marginLayoutParams.leftMargin;
    }
}
