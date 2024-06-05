package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

public final class i extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f6475c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f6476d = new Paint(1);

    public i(Context context) {
        super(context);
        f6475c.setARGB(80, 0, 0, 0);
        Paint paint = f6476d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public void a(int i10) {
        setViewScale(((float) i10) / 30.0f);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f6453a * 8.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f6453a * 2.0f;
    }

    public e.a getStyle() {
        return e.a.WHITE_ON_TRANSPARENT;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6475c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6476d;
        paint.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f10 = crossOffset;
        float f11 = size;
        Paint paint2 = paint;
        canvas2.drawLine(f10, crossOffset, f11, size, paint2);
        canvas2.drawLine(f10, size, f11, crossOffset, paint2);
    }
}
