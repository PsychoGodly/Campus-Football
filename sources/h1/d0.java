package h1;

import android.view.View;

/* compiled from: ViewUtilsApi19 */
class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f18601e = true;

    d0() {
    }

    public void a(View view) {
    }

    public float c(View view) {
        if (f18601e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f18601e = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    public void f(View view, float f10) {
        if (f18601e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f18601e = false;
            }
        }
        view.setAlpha(f10);
    }
}
