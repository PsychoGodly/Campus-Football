package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.e;

public final class j extends e {

    /* renamed from: f  reason: collision with root package name */
    private static final Paint f6477f = new Paint(1);

    /* renamed from: g  reason: collision with root package name */
    private static final Paint f6478g = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    private final float[] f6479c = {30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};

    /* renamed from: d  reason: collision with root package name */
    private Path f6480d;

    public j(Context context) {
        super(context);
        f6477f.setARGB(80, 0, 0, 0);
        Paint paint = f6478g;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public void a(int i10) {
        setViewScale(((float) i10) / 30.0f);
        a();
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f6453a * 2.0f;
    }

    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6477f);
        Paint paint = f6478g;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f6480d, paint);
    }

    private void a() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f6479c;
            if (i10 < fArr.length) {
                fArr[i10] = fArr[i10] * 0.3f * this.f6453a;
                i10++;
            } else {
                Path path = new Path();
                this.f6480d = path;
                float[] fArr2 = this.f6479c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f6480d;
                float[] fArr3 = this.f6479c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f6480d;
                float[] fArr4 = this.f6479c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f6480d;
                float[] fArr5 = this.f6479c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f6480d;
                float[] fArr6 = this.f6479c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f6480d;
                float[] fArr7 = this.f6479c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
