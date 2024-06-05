package y5;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f31300a = new Matrix();

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f31300a.set(imageView.getImageMatrix());
        return this.f31300a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
