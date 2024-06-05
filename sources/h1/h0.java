package h1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29 */
class h0 extends g0 {
    h0() {
    }

    public float c(View view) {
        return view.getTransitionAlpha();
    }

    public void e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public void g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
