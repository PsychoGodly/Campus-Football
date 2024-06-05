package h1;

import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23 */
class g0 extends f0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f18619i = true;

    g0() {
    }

    public void g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i10);
        } else if (f18619i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f18619i = false;
            }
        }
    }
}
