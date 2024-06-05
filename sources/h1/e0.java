package h1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f18616f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f18617g = true;

    e0() {
    }

    public void h(View view, Matrix matrix) {
        if (f18616f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f18616f = false;
            }
        }
    }

    public void i(View view, Matrix matrix) {
        if (f18617g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f18617g = false;
            }
        }
    }
}
