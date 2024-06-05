package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import n6.g;
import n6.k;

/* compiled from: CutoutDrawable */
class c extends g {

    /* renamed from: x  reason: collision with root package name */
    private final Paint f25941x;

    /* renamed from: y  reason: collision with root package name */
    private final RectF f25942y;

    /* renamed from: z  reason: collision with root package name */
    private int f25943z;

    c() {
        this((k) null);
    }

    private void g0(Canvas canvas) {
        if (!n0(getCallback())) {
            canvas.restoreToCount(this.f25943z);
        }
    }

    private void h0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (n0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        j0(canvas);
    }

    private void j0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f25943z = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.f25943z = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    private void m0() {
        this.f25941x.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f25941x.setColor(-1);
        this.f25941x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean n0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        h0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f25942y, this.f25941x);
        g0(canvas);
    }

    /* access modifiers changed from: package-private */
    public boolean f0() {
        return !this.f25942y.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void k0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f25942y;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void l0(RectF rectF) {
        k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.f25941x = new Paint(1);
        m0();
        this.f25942y = new RectF();
    }
}
