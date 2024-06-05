package m6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.b;

/* compiled from: ShadowRenderer */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f29219h = new int[3];

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f29220i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f29221j = new int[4];

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f29222k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f29223a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f29224b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f29225c;

    /* renamed from: d  reason: collision with root package name */
    private int f29226d;

    /* renamed from: e  reason: collision with root package name */
    private int f29227e;

    /* renamed from: f  reason: collision with root package name */
    private int f29228f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f29229g;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        RectF rectF2 = rectF;
        int i11 = i10;
        float f12 = f11;
        boolean z10 = f12 < 0.0f;
        Path path = this.f29229g;
        if (z10) {
            int[] iArr = f29221j;
            iArr[0] = 0;
            iArr[1] = this.f29228f;
            iArr[2] = this.f29227e;
            iArr[3] = this.f29226d;
            float f13 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f10, f12);
            path.close();
            float f14 = (float) (-i11);
            rectF2.inset(f14, f14);
            int[] iArr2 = f29221j;
            iArr2[0] = 0;
            iArr2[1] = this.f29226d;
            iArr2[2] = this.f29227e;
            iArr2[3] = this.f29228f;
        }
        float width = 1.0f - (((float) i11) / (rectF.width() / 2.0f));
        float[] fArr = f29222k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f29224b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f29221j, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(rectF, f10, f11, true, this.f29224b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += (float) i10;
        rectF.offset(0.0f, (float) (-i10));
        int[] iArr = f29219h;
        iArr[0] = this.f29228f;
        iArr[1] = this.f29227e;
        iArr[2] = this.f29226d;
        Paint paint = this.f29225c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f29220i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f29225c);
        canvas.restore();
    }

    public Paint c() {
        return this.f29223a;
    }

    public void d(int i10) {
        this.f29226d = b.f(i10, 68);
        this.f29227e = b.f(i10, 20);
        this.f29228f = b.f(i10, 0);
    }

    public a(int i10) {
        this.f29229g = new Path();
        d(i10);
        Paint paint = new Paint(4);
        this.f29224b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f29223a = paint2;
        paint2.setColor(this.f29226d);
        this.f29225c = new Paint(paint);
    }
}
