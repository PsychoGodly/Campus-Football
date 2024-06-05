package r;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import q.b;
import q.c;

/* compiled from: RoundRectDrawableWithShadow */
class h extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    private static final double f21861q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    static a f21862r;

    /* renamed from: a  reason: collision with root package name */
    private final int f21863a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f21864b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f21865c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f21866d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f21867e;

    /* renamed from: f  reason: collision with root package name */
    private float f21868f;

    /* renamed from: g  reason: collision with root package name */
    private Path f21869g;

    /* renamed from: h  reason: collision with root package name */
    private float f21870h;

    /* renamed from: i  reason: collision with root package name */
    private float f21871i;

    /* renamed from: j  reason: collision with root package name */
    private float f21872j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f21873k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21874l = true;

    /* renamed from: m  reason: collision with root package name */
    private final int f21875m;

    /* renamed from: n  reason: collision with root package name */
    private final int f21876n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f21877o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21878p = false;

    /* compiled from: RoundRectDrawableWithShadow */
    interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    h(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f21875m = resources.getColor(b.cardview_shadow_start_color);
        this.f21876n = resources.getColor(b.cardview_shadow_end_color);
        this.f21863a = resources.getDimensionPixelSize(c.cardview_compat_inset_shadow);
        this.f21864b = new Paint(5);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f21865c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21868f = (float) ((int) (f10 + 0.5f));
        this.f21867e = new RectF();
        Paint paint2 = new Paint(this.f21865c);
        this.f21866d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    private void a(Rect rect) {
        float f10 = this.f21870h;
        float f11 = 1.5f * f10;
        this.f21867e.set(((float) rect.left) + f10, ((float) rect.top) + f11, ((float) rect.right) - f10, ((float) rect.bottom) - f11);
        b();
    }

    private void b() {
        float f10 = this.f21868f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f21871i;
        rectF2.inset(-f11, -f11);
        Path path = this.f21869g;
        if (path == null) {
            this.f21869g = new Path();
        } else {
            path.reset();
        }
        this.f21869g.setFillType(Path.FillType.EVEN_ODD);
        this.f21869g.moveTo(-this.f21868f, 0.0f);
        this.f21869g.rLineTo(-this.f21871i, 0.0f);
        this.f21869g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f21869g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f21869g.close();
        float f12 = this.f21868f;
        float f13 = f12 / (this.f21871i + f12);
        Paint paint = this.f21865c;
        float f14 = this.f21868f + this.f21871i;
        int i10 = this.f21875m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f21876n}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f21866d;
        float f15 = this.f21868f;
        float f16 = this.f21871i;
        int i11 = this.f21875m;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f21876n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f21866d.setAntiAlias(false);
    }

    static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f21861q) * ((double) f11))) : f10;
    }

    static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f21861q) * ((double) f11))) : f10 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f10 = this.f21868f;
        float f11 = (-f10) - this.f21871i;
        float f12 = f10 + ((float) this.f21863a) + (this.f21872j / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f21867e.width() - f13 > 0.0f;
        boolean z11 = this.f21867e.height() - f13 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f21867e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f21869g, this.f21865c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f21867e.width() - f13, -this.f21868f, this.f21866d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f21867e;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f21869g, this.f21865c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f21867e.width() - f13, (-this.f21868f) + this.f21871i, this.f21866d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f21867e;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f21869g, this.f21865c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f21867e.height() - f13, -this.f21868f, this.f21866d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f21867e;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f21869g, this.f21865c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f21867e.height() - f13, -this.f21868f, this.f21866d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21873k = colorStateList;
        this.f21864b.setColor(colorStateList.getColorForState(getState(), this.f21873k.getDefaultColor()));
    }

    private void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        } else if (f11 >= 0.0f) {
            float t10 = (float) t(f10);
            float t11 = (float) t(f11);
            if (t10 > t11) {
                if (!this.f21878p) {
                    this.f21878p = true;
                }
                t10 = t11;
            }
            if (this.f21872j != t10 || this.f21870h != t11) {
                this.f21872j = t10;
                this.f21870h = t11;
                this.f21871i = (float) ((int) ((t10 * 1.5f) + ((float) this.f21863a) + 0.5f));
                this.f21874l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
    }

    private int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    public void draw(Canvas canvas) {
        if (this.f21874l) {
            a(getBounds());
            this.f21874l = false;
        }
        canvas.translate(0.0f, this.f21872j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f21872j) / 2.0f);
        f21862r.a(canvas, this.f21867e, this.f21868f, this.f21864b);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f21873k;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f21868f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.f21870h, this.f21868f, this.f21877o));
        int ceil2 = (int) Math.ceil((double) c(this.f21870h, this.f21868f, this.f21877o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f21870h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f21873k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    public float j() {
        float f10 = this.f21870h;
        return (Math.max(f10, this.f21868f + ((float) this.f21863a) + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (((this.f21870h * 1.5f) + ((float) this.f21863a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float k() {
        float f10 = this.f21870h;
        return (Math.max(f10, this.f21868f + ((float) this.f21863a) + (f10 / 2.0f)) * 2.0f) + ((this.f21870h + ((float) this.f21863a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f21872j;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f21877o = z10;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21874l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f21873k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f21864b.getColor() == colorForState) {
            return false;
        }
        this.f21864b.setColor(colorForState);
        this.f21874l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f10) {
        if (f10 >= 0.0f) {
            float f11 = (float) ((int) (f10 + 0.5f));
            if (this.f21868f != f11) {
                this.f21868f = f11;
                this.f21874l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void q(float f10) {
        s(this.f21872j, f10);
    }

    /* access modifiers changed from: package-private */
    public void r(float f10) {
        s(f10, this.f21870h);
    }

    public void setAlpha(int i10) {
        this.f21864b.setAlpha(i10);
        this.f21865c.setAlpha(i10);
        this.f21866d.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f21864b.setColorFilter(colorFilter);
    }
}
