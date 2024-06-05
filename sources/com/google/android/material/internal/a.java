package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.a0;
import androidx.core.view.e;
import k6.a;
import k6.d;

/* compiled from: CollapsingTextHelper */
public final class a {
    private static final boolean V = (Build.VERSION.SDK_INT < 18);
    private static final Paint W = null;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;

    /* renamed from: a  reason: collision with root package name */
    private final View f25801a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25802b;

    /* renamed from: c  reason: collision with root package name */
    private float f25803c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f25804d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f25805e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f25806f;

    /* renamed from: g  reason: collision with root package name */
    private int f25807g = 16;

    /* renamed from: h  reason: collision with root package name */
    private int f25808h = 16;

    /* renamed from: i  reason: collision with root package name */
    private float f25809i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f25810j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f25811k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f25812l;

    /* renamed from: m  reason: collision with root package name */
    private float f25813m;

    /* renamed from: n  reason: collision with root package name */
    private float f25814n;

    /* renamed from: o  reason: collision with root package name */
    private float f25815o;

    /* renamed from: p  reason: collision with root package name */
    private float f25816p;

    /* renamed from: q  reason: collision with root package name */
    private float f25817q;

    /* renamed from: r  reason: collision with root package name */
    private float f25818r;

    /* renamed from: s  reason: collision with root package name */
    private Typeface f25819s;

    /* renamed from: t  reason: collision with root package name */
    private Typeface f25820t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f25821u;

    /* renamed from: v  reason: collision with root package name */
    private k6.a f25822v;

    /* renamed from: w  reason: collision with root package name */
    private k6.a f25823w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f25824x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f25825y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f25826z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* compiled from: CollapsingTextHelper */
    class C0275a implements a.C0308a {
        C0275a() {
        }

        public void a(Typeface typeface) {
            a.this.G(typeface);
        }
    }

    public a(View view) {
        this.f25801a = view;
        TextPaint textPaint = new TextPaint(129);
        this.J = textPaint;
        this.K = new TextPaint(textPaint);
        this.f25805e = new Rect();
        this.f25804d = new Rect();
        this.f25806f = new RectF();
    }

    private static boolean A(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private boolean H(Typeface typeface) {
        k6.a aVar = this.f25823w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f25819s == typeface) {
            return false;
        }
        this.f25819s = typeface;
        return true;
    }

    private boolean N(Typeface typeface) {
        k6.a aVar = this.f25822v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f25820t == typeface) {
            return false;
        }
        this.f25820t = typeface;
        return true;
    }

    private void P(float f10) {
        g(f10);
        boolean z10 = V && this.F != 1.0f;
        this.A = z10;
        if (z10) {
            j();
        }
        a0.e0(this.f25801a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), (int) ((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), (int) ((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), (int) ((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    private void b() {
        float f10 = this.G;
        g(this.f25810j);
        CharSequence charSequence = this.f25825y;
        float f11 = 0.0f;
        float measureText = charSequence != null ? this.J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int b10 = e.b(this.f25808h, this.f25826z ? 1 : 0);
        int i10 = b10 & 112;
        if (i10 == 48) {
            this.f25814n = ((float) this.f25805e.top) - this.J.ascent();
        } else if (i10 != 80) {
            this.f25814n = ((float) this.f25805e.centerY()) + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.f25814n = (float) this.f25805e.bottom;
        }
        int i11 = b10 & 8388615;
        if (i11 == 1) {
            this.f25816p = ((float) this.f25805e.centerX()) - (measureText / 2.0f);
        } else if (i11 != 5) {
            this.f25816p = (float) this.f25805e.left;
        } else {
            this.f25816p = ((float) this.f25805e.right) - measureText;
        }
        g(this.f25809i);
        CharSequence charSequence2 = this.f25825y;
        if (charSequence2 != null) {
            f11 = this.J.measureText(charSequence2, 0, charSequence2.length());
        }
        int b11 = e.b(this.f25807g, this.f25826z ? 1 : 0);
        int i12 = b11 & 112;
        if (i12 == 48) {
            this.f25813m = ((float) this.f25804d.top) - this.J.ascent();
        } else if (i12 != 80) {
            this.f25813m = ((float) this.f25804d.centerY()) + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.f25813m = (float) this.f25804d.bottom;
        }
        int i13 = b11 & 8388615;
        if (i13 == 1) {
            this.f25815o = ((float) this.f25804d.centerX()) - (f11 / 2.0f);
        } else if (i13 != 5) {
            this.f25815o = (float) this.f25804d.left;
        } else {
            this.f25815o = ((float) this.f25804d.right) - f11;
        }
        h();
        P(f10);
    }

    private void d() {
        f(this.f25803c);
    }

    private boolean e(CharSequence charSequence) {
        boolean z10 = true;
        if (a0.B(this.f25801a) != 1) {
            z10 = false;
        }
        return (z10 ? androidx.core.text.e.f3070d : androidx.core.text.e.f3069c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f10) {
        u(f10);
        this.f25817q = x(this.f25815o, this.f25816p, f10, this.L);
        this.f25818r = x(this.f25813m, this.f25814n, f10, this.L);
        P(x(this.f25809i, this.f25810j, f10, this.M));
        if (this.f25812l != this.f25811k) {
            this.J.setColor(a(p(), n(), f10));
        } else {
            this.J.setColor(n());
        }
        this.J.setShadowLayer(x(this.R, this.N, f10, (TimeInterpolator) null), x(this.S, this.O, f10, (TimeInterpolator) null), x(this.T, this.P, f10, (TimeInterpolator) null), a(o(this.U), o(this.Q), f10));
        a0.e0(this.f25801a);
    }

    private void g(float f10) {
        float f11;
        boolean z10;
        boolean z11;
        if (this.f25824x != null) {
            float width = (float) this.f25805e.width();
            float width2 = (float) this.f25804d.width();
            boolean z12 = true;
            if (v(f10, this.f25810j)) {
                f11 = this.f25810j;
                this.F = 1.0f;
                Typeface typeface = this.f25821u;
                Typeface typeface2 = this.f25819s;
                if (typeface != typeface2) {
                    this.f25821u = typeface2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                float f12 = this.f25809i;
                Typeface typeface3 = this.f25821u;
                Typeface typeface4 = this.f25820t;
                if (typeface3 != typeface4) {
                    this.f25821u = typeface4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (v(f10, f12)) {
                    this.F = 1.0f;
                } else {
                    this.F = f10 / this.f25809i;
                }
                float f13 = this.f25810j / this.f25809i;
                width = width2 * f13 > width ? Math.min(width / f13, width2) : width2;
                f11 = f12;
                z10 = z11;
            }
            if (width > 0.0f) {
                z10 = this.G != f11 || this.I || z10;
                this.G = f11;
                this.I = false;
            }
            if (this.f25825y == null || z10) {
                this.J.setTextSize(this.G);
                this.J.setTypeface(this.f25821u);
                TextPaint textPaint = this.J;
                if (this.F == 1.0f) {
                    z12 = false;
                }
                textPaint.setLinearText(z12);
                CharSequence ellipsize = TextUtils.ellipsize(this.f25824x, this.J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f25825y)) {
                    this.f25825y = ellipsize;
                    this.f25826z = e(ellipsize);
                }
            }
        }
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void j() {
        if (this.B == null && !this.f25804d.isEmpty() && !TextUtils.isEmpty(this.f25825y)) {
            f(0.0f);
            this.D = this.J.ascent();
            this.E = this.J.descent();
            TextPaint textPaint = this.J;
            CharSequence charSequence = this.f25825y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.E - this.D);
            if (round > 0 && round2 > 0) {
                this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.B);
                CharSequence charSequence2 = this.f25825y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.J.descent(), this.J);
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
    }

    private int o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int p() {
        return o(this.f25811k);
    }

    private void s(TextPaint textPaint) {
        textPaint.setTextSize(this.f25810j);
        textPaint.setTypeface(this.f25819s);
    }

    private void t(TextPaint textPaint) {
        textPaint.setTextSize(this.f25809i);
        textPaint.setTypeface(this.f25820t);
    }

    private void u(float f10) {
        this.f25806f.left = x((float) this.f25804d.left, (float) this.f25805e.left, f10, this.L);
        this.f25806f.top = x(this.f25813m, this.f25814n, f10, this.L);
        this.f25806f.right = x((float) this.f25804d.right, (float) this.f25805e.right, f10, this.L);
        this.f25806f.bottom = x((float) this.f25804d.bottom, (float) this.f25805e.bottom, f10, this.L);
    }

    private static boolean v(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    private static float x(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return y5.a.a(f10, f11, f12);
    }

    public void B(int i10, int i11, int i12, int i13) {
        if (!A(this.f25805e, i10, i11, i12, i13)) {
            this.f25805e.set(i10, i11, i12, i13);
            this.I = true;
            y();
        }
    }

    public void C(Rect rect) {
        B(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void D(int i10) {
        d dVar = new d(this.f25801a.getContext(), i10);
        ColorStateList colorStateList = dVar.f29119b;
        if (colorStateList != null) {
            this.f25812l = colorStateList;
        }
        float f10 = dVar.f29118a;
        if (f10 != 0.0f) {
            this.f25810j = f10;
        }
        ColorStateList colorStateList2 = dVar.f29126i;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f29127j;
        this.P = dVar.f29128k;
        this.N = dVar.f29129l;
        k6.a aVar = this.f25823w;
        if (aVar != null) {
            aVar.c();
        }
        this.f25823w = new k6.a(new C0275a(), dVar.e());
        dVar.h(this.f25801a.getContext(), this.f25823w);
        z();
    }

    public void E(ColorStateList colorStateList) {
        if (this.f25812l != colorStateList) {
            this.f25812l = colorStateList;
            z();
        }
    }

    public void F(int i10) {
        if (this.f25808h != i10) {
            this.f25808h = i10;
            z();
        }
    }

    public void G(Typeface typeface) {
        if (H(typeface)) {
            z();
        }
    }

    public void I(int i10, int i11, int i12, int i13) {
        if (!A(this.f25804d, i10, i11, i12, i13)) {
            this.f25804d.set(i10, i11, i12, i13);
            this.I = true;
            y();
        }
    }

    public void J(Rect rect) {
        I(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void K(ColorStateList colorStateList) {
        if (this.f25811k != colorStateList) {
            this.f25811k = colorStateList;
            z();
        }
    }

    public void L(int i10) {
        if (this.f25807g != i10) {
            this.f25807g = i10;
            z();
        }
    }

    public void M(float f10) {
        if (this.f25809i != f10) {
            this.f25809i = f10;
            z();
        }
    }

    public void O(float f10) {
        float a10 = b0.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f25803c) {
            this.f25803c = a10;
            d();
        }
    }

    public void Q(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        z();
    }

    public final boolean R(int[] iArr) {
        this.H = iArr;
        if (!w()) {
            return false;
        }
        z();
        return true;
    }

    public void S(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f25824x, charSequence)) {
            this.f25824x = charSequence;
            this.f25825y = null;
            h();
            z();
        }
    }

    public void T(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        z();
    }

    public void U(Typeface typeface) {
        boolean H2 = H(typeface);
        boolean N2 = N(typeface);
        if (H2 || N2) {
            z();
        }
    }

    public float c() {
        if (this.f25824x == null) {
            return 0.0f;
        }
        s(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.f25824x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void i(Canvas canvas) {
        float f10;
        int save = canvas.save();
        if (this.f25825y != null && this.f25802b) {
            float f11 = this.f25817q;
            float f12 = this.f25818r;
            boolean z10 = this.A && this.B != null;
            if (z10) {
                f10 = this.D * this.F;
            } else {
                f10 = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z10) {
                f12 += f10;
            }
            float f13 = f12;
            float f14 = this.F;
            if (f14 != 1.0f) {
                canvas.scale(f14, f14, f11, f13);
            }
            if (z10) {
                canvas.drawBitmap(this.B, f11, f13, this.C);
            } else {
                CharSequence charSequence = this.f25825y;
                canvas.drawText(charSequence, 0, charSequence.length(), f11, f13, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void k(RectF rectF) {
        float f10;
        boolean e10 = e(this.f25824x);
        Rect rect = this.f25805e;
        if (!e10) {
            f10 = (float) rect.left;
        } else {
            f10 = ((float) rect.right) - c();
        }
        rectF.left = f10;
        Rect rect2 = this.f25805e;
        rectF.top = (float) rect2.top;
        rectF.right = !e10 ? f10 + c() : (float) rect2.right;
        rectF.bottom = ((float) this.f25805e.top) + m();
    }

    public ColorStateList l() {
        return this.f25812l;
    }

    public float m() {
        s(this.K);
        return -this.K.ascent();
    }

    public int n() {
        return o(this.f25812l);
    }

    public float q() {
        t(this.K);
        return -this.K.ascent();
    }

    public float r() {
        return this.f25803c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f25811k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f25812l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f25811k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.w():boolean");
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.f25802b = this.f25805e.width() > 0 && this.f25805e.height() > 0 && this.f25804d.width() > 0 && this.f25804d.height() > 0;
    }

    public void z() {
        if (this.f25801a.getHeight() > 0 && this.f25801a.getWidth() > 0) {
            b();
            d();
        }
    }
}
