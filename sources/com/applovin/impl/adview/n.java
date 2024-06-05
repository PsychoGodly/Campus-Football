package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

public final class n extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f6485c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f6486d = new Paint(1);

    /* renamed from: f  reason: collision with root package name */
    private static final Paint f6487f = new Paint(1);

    public n(Context context) {
        super(context);
        f6485c.setColor(-1);
        f6486d.setColor(-16777216);
        Paint paint = f6487f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f6453a * 10.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleOffset() {
        return this.f6453a * 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f6453a * 3.0f;
    }

    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6485c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f6486d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6487f;
        paint.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f10 = crossOffset;
        float f11 = size;
        Paint paint2 = paint;
        canvas2.drawLine(f10, crossOffset, f11, size, paint2);
        canvas2.drawLine(f10, size, f11, crossOffset, paint2);
    }
}
