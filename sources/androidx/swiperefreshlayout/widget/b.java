package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.h;

/* compiled from: CircularProgressDrawable */
public class b extends Drawable implements Animatable {

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f4815h = new LinearInterpolator();

    /* renamed from: i  reason: collision with root package name */
    private static final Interpolator f4816i = new m0.b();

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f4817j = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    private final c f4818a;

    /* renamed from: b  reason: collision with root package name */
    private float f4819b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f4820c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f4821d;

    /* renamed from: f  reason: collision with root package name */
    float f4822f;

    /* renamed from: g  reason: collision with root package name */
    boolean f4823g;

    /* compiled from: CircularProgressDrawable */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f4824a;

        a(c cVar) {
            this.f4824a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f4824a);
            b.this.b(floatValue, this.f4824a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: CircularProgressDrawable */
    class C0083b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f4826a;

        C0083b(c cVar) {
            this.f4826a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f4826a, true);
            this.f4826a.A();
            this.f4826a.l();
            b bVar = b.this;
            if (bVar.f4823g) {
                bVar.f4823g = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f4826a.x(false);
                return;
            }
            bVar.f4822f += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.f4822f = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f4828a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f4829b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f4830c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f4831d;

        /* renamed from: e  reason: collision with root package name */
        float f4832e;

        /* renamed from: f  reason: collision with root package name */
        float f4833f;

        /* renamed from: g  reason: collision with root package name */
        float f4834g;

        /* renamed from: h  reason: collision with root package name */
        float f4835h;

        /* renamed from: i  reason: collision with root package name */
        int[] f4836i;

        /* renamed from: j  reason: collision with root package name */
        int f4837j;

        /* renamed from: k  reason: collision with root package name */
        float f4838k;

        /* renamed from: l  reason: collision with root package name */
        float f4839l;

        /* renamed from: m  reason: collision with root package name */
        float f4840m;

        /* renamed from: n  reason: collision with root package name */
        boolean f4841n;

        /* renamed from: o  reason: collision with root package name */
        Path f4842o;

        /* renamed from: p  reason: collision with root package name */
        float f4843p;

        /* renamed from: q  reason: collision with root package name */
        float f4844q;

        /* renamed from: r  reason: collision with root package name */
        int f4845r;

        /* renamed from: s  reason: collision with root package name */
        int f4846s;

        /* renamed from: t  reason: collision with root package name */
        int f4847t;

        /* renamed from: u  reason: collision with root package name */
        int f4848u;

        c() {
            Paint paint = new Paint();
            this.f4829b = paint;
            Paint paint2 = new Paint();
            this.f4830c = paint2;
            Paint paint3 = new Paint();
            this.f4831d = paint3;
            this.f4832e = 0.0f;
            this.f4833f = 0.0f;
            this.f4834g = 0.0f;
            this.f4835h = 5.0f;
            this.f4843p = 1.0f;
            this.f4847t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.f4838k = this.f4832e;
            this.f4839l = this.f4833f;
            this.f4840m = this.f4834g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4828a;
            float f10 = this.f4844q;
            float f11 = (this.f4835h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f4845r) * this.f4843p) / 2.0f, this.f4835h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f11, ((float) rect.centerY()) - f11, ((float) rect.centerX()) + f11, ((float) rect.centerY()) + f11);
            float f12 = this.f4832e;
            float f13 = this.f4834g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f4833f + f13) * 360.0f) - f14;
            this.f4829b.setColor(this.f4848u);
            this.f4829b.setAlpha(this.f4847t);
            float f16 = this.f4835h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4831d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f4829b);
            b(canvas, f14, f15, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f4841n) {
                Path path = this.f4842o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4842o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f4842o.moveTo(0.0f, 0.0f);
                this.f4842o.lineTo(((float) this.f4845r) * this.f4843p, 0.0f);
                Path path3 = this.f4842o;
                float f12 = this.f4843p;
                path3.lineTo((((float) this.f4845r) * f12) / 2.0f, ((float) this.f4846s) * f12);
                this.f4842o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f4845r) * this.f4843p) / 2.0f), rectF.centerY() + (this.f4835h / 2.0f));
                this.f4842o.close();
                this.f4830c.setColor(this.f4848u);
                this.f4830c.setAlpha(this.f4847t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4842o, this.f4830c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f4847t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f4833f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f4836i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.f4837j + 1) % this.f4836i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.f4832e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f4836i[this.f4837j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.f4839l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.f4840m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.f4838k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f4838k = 0.0f;
            this.f4839l = 0.0f;
            this.f4840m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void n(int i10) {
            this.f4847t = i10;
        }

        /* access modifiers changed from: package-private */
        public void o(float f10, float f11) {
            this.f4845r = (int) f10;
            this.f4846s = (int) f11;
        }

        /* access modifiers changed from: package-private */
        public void p(float f10) {
            if (f10 != this.f4843p) {
                this.f4843p = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f10) {
            this.f4844q = f10;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            this.f4848u = i10;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.f4829b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i10) {
            this.f4837j = i10;
            this.f4848u = this.f4836i[i10];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.f4836i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f10) {
            this.f4833f = f10;
        }

        /* access modifiers changed from: package-private */
        public void w(float f10) {
            this.f4834g = f10;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z10) {
            if (this.f4841n != z10) {
                this.f4841n = z10;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f10) {
            this.f4832e = f10;
        }

        /* access modifiers changed from: package-private */
        public void z(float f10) {
            this.f4835h = f10;
            this.f4829b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f4820c = ((Context) h.f(context)).getResources();
        c cVar = new c();
        this.f4818a = cVar;
        cVar.u(f4817j);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) (((float) (((i11 >> 24) & 255) - i12)) * f10))) << 24) | ((i13 + ((int) (((float) (((i11 >> 16) & 255) - i13)) * f10))) << 16) | ((i14 + ((int) (((float) (((i11 >> 8) & 255) - i14)) * f10))) << 8) | (i15 + ((int) (f10 * ((float) ((i11 & 255) - i15)))));
    }

    private void h(float f10) {
        this.f4819b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f4818a;
        float f14 = this.f4820c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f4818a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4815h);
        ofFloat.addListener(new C0083b(cVar));
        this.f4821d = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f10, c cVar, boolean z10) {
        float f11;
        float f12;
        if (this.f4823g) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                f11 = cVar.k();
                f12 = (f4816i.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + f11;
            } else {
                float k10 = cVar.k() + 0.79f;
                float f13 = k10;
                f11 = k10 - (((1.0f - f4816i.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = f13;
            }
            cVar.y(f11);
            cVar.v(f12);
            cVar.w(j10 + (0.20999998f * f10));
            h((f10 + this.f4822f) * 216.0f);
        }
    }

    public void d(boolean z10) {
        this.f4818a.x(z10);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4819b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4818a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f4818a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f4818a.u(iArr);
        this.f4818a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f4818a.w(f10);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f4818a.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f4821d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f4818a.y(f10);
        this.f4818a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f4818a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    public void setAlpha(int i10) {
        this.f4818a.n(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4818a.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f4821d.cancel();
        this.f4818a.A();
        if (this.f4818a.d() != this.f4818a.g()) {
            this.f4823g = true;
            this.f4821d.setDuration(666);
            this.f4821d.start();
            return;
        }
        this.f4818a.t(0);
        this.f4818a.m();
        this.f4821d.setDuration(1332);
        this.f4821d.start();
    }

    public void stop() {
        this.f4821d.cancel();
        h(0.0f);
        this.f4818a.x(false);
        this.f4818a.t(0);
        this.f4818a.m();
        invalidateSelf();
    }
}
