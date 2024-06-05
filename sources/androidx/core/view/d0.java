package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import z.d;

/* compiled from: ViewGroupCompat */
public final class d0 {

    /* compiled from: ViewGroupCompat */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(d.Y);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && a0.J(viewGroup) == null) ? false : true;
    }
}
