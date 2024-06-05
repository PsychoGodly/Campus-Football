package h1;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils */
class x {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18705a = true;

    static w a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new v(viewGroup);
        }
        return u.g(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f18705a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f18705a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (i10 >= 18) {
            b(viewGroup, z10);
        } else {
            y.b(viewGroup, z10);
        }
    }
}
