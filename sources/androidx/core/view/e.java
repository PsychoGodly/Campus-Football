package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* compiled from: GravityCompat */
public final class e {

    /* compiled from: GravityCompat */
    static class a {
        static void a(int i10, int i11, int i12, Rect rect, int i13, int i14, Rect rect2, int i15) {
            Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
        }

        static void b(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
            Gravity.apply(i10, i11, i12, rect, rect2, i13);
        }

        static void c(int i10, Rect rect, Rect rect2, int i11) {
            Gravity.applyDisplay(i10, rect, rect2, i11);
        }
    }

    public static void a(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        if (Build.VERSION.SDK_INT >= 17) {
            a.b(i10, i11, i12, rect, rect2, i13);
        } else {
            Gravity.apply(i10, i11, i12, rect, rect2);
        }
    }

    public static int b(int i10, int i11) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i10, i11) : i10 & -8388609;
    }
}
