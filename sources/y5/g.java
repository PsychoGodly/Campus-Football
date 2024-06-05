package y5;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f31301a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f31302b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f31303c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f31301a);
        matrix2.getValues(this.f31302b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f31302b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f31301a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f31303c.setValues(this.f31302b);
        return this.f31303c;
    }
}
