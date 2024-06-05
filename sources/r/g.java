package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
class g extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f21850a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f21851b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f21852c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f21853d;

    /* renamed from: e  reason: collision with root package name */
    private float f21854e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21855f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21856g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f21857h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f21858i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f21859j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f21860k = PorterDuff.Mode.SRC_IN;

    g(ColorStateList colorStateList, float f10) {
        this.f21850a = f10;
        this.f21851b = new Paint(5);
        e(colorStateList);
        this.f21852c = new RectF();
        this.f21853d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21857h = colorStateList;
        this.f21851b.setColor(colorStateList.getColorForState(getState(), this.f21857h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f21852c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f21853d.set(rect);
        if (this.f21855f) {
            float d10 = h.d(this.f21854e, this.f21850a, this.f21856g);
            this.f21853d.inset((int) Math.ceil((double) h.c(this.f21854e, this.f21850a, this.f21856g)), (int) Math.ceil((double) d10));
            this.f21852c.set(this.f21853d);
        }
    }

    public ColorStateList b() {
        return this.f21857h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f21854e;
    }

    public float d() {
        return this.f21850a;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f21851b;
        if (this.f21858i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f21858i);
            z10 = true;
        }
        RectF rectF = this.f21852c;
        float f10 = this.f21850a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 != this.f21854e || this.f21855f != z10 || this.f21856g != z11) {
            this.f21854e = f10;
            this.f21855f = z10;
            this.f21856g = z11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f21853d, this.f21850a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 != this.f21850a) {
            this.f21850a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f21857h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f21859j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f21857h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f21857h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f21851b.getColor();
        if (z10) {
            this.f21851b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f21859j;
        if (colorStateList2 == null || (mode = this.f21860k) == null) {
            return z10;
        }
        this.f21858i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f21851b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f21851b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f21859j = colorStateList;
        this.f21858i = a(colorStateList, this.f21860k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f21860k = mode;
        this.f21858i = a(this.f21859j, mode);
        invalidateSelf();
    }
}
