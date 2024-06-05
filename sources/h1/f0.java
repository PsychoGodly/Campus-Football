package h1;

import android.view.View;

/* compiled from: ViewUtilsApi22 */
class f0 extends e0 {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f18618h = true;

    f0() {
    }

    public void e(View view, int i10, int i11, int i12, int i13) {
        if (f18618h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f18618h = false;
            }
        }
    }
}
