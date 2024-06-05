package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.google.android.material.internal.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k6.c;
import k6.d;
import l6.b;
import n6.g;
import x5.k;
import y5.h;

/* compiled from: ChipDrawable */
public class a extends g implements Drawable.Callback, f.b {
    private static final int[] G0 = {16842910};
    private static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    private float A;
    private ColorStateList A0;
    private ColorStateList B;
    private WeakReference<C0271a> B0 = new WeakReference<>((Object) null);
    private float C;
    private TextUtils.TruncateAt C0;
    private ColorStateList D;
    private boolean D0;
    private CharSequence E;
    private int E0;
    private boolean F;
    private boolean F0;
    private Drawable G;
    private ColorStateList H;
    private float I;
    private boolean J;
    private boolean K;
    private Drawable L;
    private Drawable M;
    private ColorStateList N;
    private float O;
    private CharSequence P;
    private boolean Q;
    private boolean R;
    private Drawable S;
    private h T;
    private h U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;

    /* renamed from: a0  reason: collision with root package name */
    private float f25569a0;

    /* renamed from: b0  reason: collision with root package name */
    private float f25570b0;

    /* renamed from: c0  reason: collision with root package name */
    private float f25571c0;

    /* renamed from: d0  reason: collision with root package name */
    private final Context f25572d0;

    /* renamed from: e0  reason: collision with root package name */
    private final Paint f25573e0 = new Paint(1);

    /* renamed from: f0  reason: collision with root package name */
    private final Paint f25574f0;

    /* renamed from: g0  reason: collision with root package name */
    private final Paint.FontMetrics f25575g0 = new Paint.FontMetrics();

    /* renamed from: h0  reason: collision with root package name */
    private final RectF f25576h0 = new RectF();

    /* renamed from: i0  reason: collision with root package name */
    private final PointF f25577i0 = new PointF();

    /* renamed from: j0  reason: collision with root package name */
    private final Path f25578j0 = new Path();

    /* renamed from: k0  reason: collision with root package name */
    private final f f25579k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f25580l0;

    /* renamed from: m0  reason: collision with root package name */
    private int f25581m0;

    /* renamed from: n0  reason: collision with root package name */
    private int f25582n0;

    /* renamed from: o0  reason: collision with root package name */
    private int f25583o0;

    /* renamed from: p0  reason: collision with root package name */
    private int f25584p0;

    /* renamed from: q0  reason: collision with root package name */
    private int f25585q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f25586r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f25587s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f25588t0 = 255;

    /* renamed from: u0  reason: collision with root package name */
    private ColorFilter f25589u0;

    /* renamed from: v0  reason: collision with root package name */
    private PorterDuffColorFilter f25590v0;

    /* renamed from: w0  reason: collision with root package name */
    private ColorStateList f25591w0;

    /* renamed from: x  reason: collision with root package name */
    private ColorStateList f25592x;

    /* renamed from: x0  reason: collision with root package name */
    private PorterDuff.Mode f25593x0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f25594y;

    /* renamed from: y0  reason: collision with root package name */
    private int[] f25595y0;

    /* renamed from: z  reason: collision with root package name */
    private float f25596z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f25597z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* compiled from: ChipDrawable */
    public interface C0271a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        L(context);
        this.f25572d0 = context;
        f fVar = new f(this);
        this.f25579k0 = fVar;
        this.E = MaxReward.DEFAULT_LABEL;
        fVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f25574f0 = null;
        int[] iArr = G0;
        setState(iArr);
        b2(iArr);
        this.D0 = true;
        if (b.f29181a) {
            H0.setTint(-1);
        }
    }

    private boolean C2() {
        return this.R && this.S != null && this.f25586r0;
    }

    private boolean D2() {
        return this.F && this.G != null;
    }

    private boolean E2() {
        return this.K && this.L != null;
    }

    private void F2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void G2() {
        this.A0 = this.f25597z0 ? b.a(this.D) : null;
    }

    private void H2() {
        this.M = new RippleDrawable(b.a(X0()), this.L, H0);
    }

    private void R1(ColorStateList colorStateList) {
        if (this.f25592x != colorStateList) {
            this.f25592x = colorStateList;
            onStateChange(getState());
        }
    }

    private ColorFilter d1() {
        ColorFilter colorFilter = this.f25589u0;
        return colorFilter != null ? colorFilter : this.f25590v0;
    }

    private void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.L) {
                if (drawable.isStateful()) {
                    drawable.setState(Q0());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.N);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.G;
            if (drawable == drawable2 && this.J) {
                androidx.core.graphics.drawable.a.o(drawable2, this.H);
            }
        }
    }

    private static boolean f1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (D2() || C2()) {
            float f10 = this.V + this.W;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = ((float) rect.left) + f10;
                rectF.left = f11;
                rectF.right = f11 + this.I;
            } else {
                float f12 = ((float) rect.right) - f10;
                rectF.right = f12;
                rectF.left = f12 - this.I;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.I;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (E2()) {
            float f10 = this.f25571c0 + this.f25570b0 + this.O + this.f25569a0 + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f10;
            } else {
                rectF.left = ((float) rect.left) + f10;
            }
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (E2()) {
            float f10 = this.f25571c0 + this.f25570b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.O;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.O;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.O;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private static boolean j1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (E2()) {
            float f10 = this.f25571c0 + this.f25570b0 + this.O + this.f25569a0 + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean k1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f29119b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean l1(k6.d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f29119b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.l1(k6.d):boolean");
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.E != null) {
            float h02 = this.V + h0() + this.Y;
            float l02 = this.f25571c0 + l0() + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + h02;
                rectF.right = ((float) rect.right) - l02;
            } else {
                rectF.left = ((float) rect.left) + l02;
                rectF.right = ((float) rect.right) - h02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void m1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray k10 = com.google.android.material.internal.g.k(this.f25572d0, attributeSet, k.K, i10, i11, new int[0]);
        this.F0 = k10.hasValue(k.f30984u0);
        R1(c.a(this.f25572d0, k10, k.f30907h0));
        v1(c.a(this.f25572d0, k10, k.U));
        J1(k10.getDimension(k.f30877c0, 0.0f));
        int i12 = k.V;
        if (k10.hasValue(i12)) {
            x1(k10.getDimension(i12, 0.0f));
        }
        N1(c.a(this.f25572d0, k10, k.f30895f0));
        P1(k10.getDimension(k.f30901g0, 0.0f));
        o2(c.a(this.f25572d0, k10, k.f30979t0));
        t2(k10.getText(k.P));
        u2(c.f(this.f25572d0, k10, k.L));
        int i13 = k10.getInt(k.N, 0);
        if (i13 == 1) {
            g2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            g2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            g2(TextUtils.TruncateAt.END);
        }
        I1(k10.getBoolean(k.f30871b0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            I1(k10.getBoolean(k.Y, false));
        }
        B1(c.d(this.f25572d0, k10, k.X));
        int i14 = k.f30865a0;
        if (k10.hasValue(i14)) {
            F1(c.a(this.f25572d0, k10, i14));
        }
        D1(k10.getDimension(k.Z, 0.0f));
        e2(k10.getBoolean(k.f30949o0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            e2(k10.getBoolean(k.f30919j0, false));
        }
        S1(c.d(this.f25572d0, k10, k.f30913i0));
        c2(c.a(this.f25572d0, k10, k.f30943n0));
        X1(k10.getDimension(k.f30931l0, 0.0f));
        p1(k10.getBoolean(k.Q, false));
        u1(k10.getBoolean(k.T, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            u1(k10.getBoolean(k.S, false));
        }
        r1(c.d(this.f25572d0, k10, k.R));
        r2(h.b(this.f25572d0, k10, k.f30989v0));
        h2(h.b(this.f25572d0, k10, k.f30961q0));
        L1(k10.getDimension(k.f30889e0, 0.0f));
        l2(k10.getDimension(k.f30973s0, 0.0f));
        j2(k10.getDimension(k.f30967r0, 0.0f));
        y2(k10.getDimension(k.f30999x0, 0.0f));
        w2(k10.getDimension(k.f30994w0, 0.0f));
        Z1(k10.getDimension(k.f30937m0, 0.0f));
        U1(k10.getDimension(k.f30925k0, 0.0f));
        z1(k10.getDimension(k.W, 0.0f));
        n2(k10.getDimensionPixelSize(k.O, a.e.API_PRIORITY_OTHER));
        k10.recycle();
    }

    private float n0() {
        this.f25579k0.e().getFontMetrics(this.f25575g0);
        Paint.FontMetrics fontMetrics = this.f25575g0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean o1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f25592x
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f25580l0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f25580l0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f25580l0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f25594y
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f25581m0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f25581m0
            if (r5 == r3) goto L_0x002c
            r6.f25581m0 = r3
            r0 = 1
        L_0x002c:
            int r1 = d6.a.e(r1, r3)
            int r3 = r6.f25582n0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.w()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.f25582n0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.T(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.B
            if (r1 == 0) goto L_0x0058
            int r3 = r6.f25583o0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.f25583o0
            if (r3 == r1) goto L_0x0060
            r6.f25583o0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.A0
            if (r1 == 0) goto L_0x0073
            boolean r1 = l6.b.b(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.A0
            int r3 = r6.f25584p0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.f25584p0
            if (r3 == r1) goto L_0x007f
            r6.f25584p0 = r1
            boolean r1 = r6.f25597z0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.f r1 = r6.f25579k0
            k6.d r1 = r1.d()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.f r1 = r6.f25579k0
            k6.d r1 = r1.d()
            android.content.res.ColorStateList r1 = r1.f29119b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.f r1 = r6.f25579k0
            k6.d r1 = r1.d()
            android.content.res.ColorStateList r1 = r1.f29119b
            int r3 = r6.f25585q0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.f25585q0
            if (r3 == r1) goto L_0x00a8
            r6.f25585q0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = f1(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.Q
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.f25586r0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.S
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.h0()
            r6.f25586r0 = r1
            float r1 = r6.h0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.f25591w0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.f25587s0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.f25587s0
            if (r5 == r3) goto L_0x00f4
            r6.f25587s0 = r3
            android.content.res.ColorStateList r0 = r6.f25591w0
            android.graphics.PorterDuff$Mode r3 = r6.f25593x0
            android.graphics.PorterDuffColorFilter r0 = f6.a.a(r6, r0, r3)
            r6.f25590v0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.G
            boolean r0 = k1(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.G
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.S
            boolean r0 = k1(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.S
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.L
            boolean r0 = k1(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.L
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = l6.b.f29181a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.M
            boolean r7 = k1(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.M
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.n1()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.o1(int[], int[]):boolean");
    }

    private boolean p0() {
        return this.R && this.S != null && this.Q;
    }

    public static a q0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.m1(attributeSet, i10, i11);
        return aVar;
    }

    private void r0(Canvas canvas, Rect rect) {
        if (C2()) {
            g0(rect, this.f25576h0);
            RectF rectF = this.f25576h0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.S.setBounds(0, 0, (int) this.f25576h0.width(), (int) this.f25576h0.height());
            this.S.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void s0(Canvas canvas, Rect rect) {
        if (!this.F0) {
            this.f25573e0.setColor(this.f25581m0);
            this.f25573e0.setStyle(Paint.Style.FILL);
            this.f25573e0.setColorFilter(d1());
            this.f25576h0.set(rect);
            canvas.drawRoundRect(this.f25576h0, C0(), C0(), this.f25573e0);
        }
    }

    private void t0(Canvas canvas, Rect rect) {
        if (D2()) {
            g0(rect, this.f25576h0);
            RectF rectF = this.f25576h0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.G.setBounds(0, 0, (int) this.f25576h0.width(), (int) this.f25576h0.height());
            this.G.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (this.C > 0.0f && !this.F0) {
            this.f25573e0.setColor(this.f25583o0);
            this.f25573e0.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                this.f25573e0.setColorFilter(d1());
            }
            RectF rectF = this.f25576h0;
            float f10 = this.C;
            rectF.set(((float) rect.left) + (f10 / 2.0f), ((float) rect.top) + (f10 / 2.0f), ((float) rect.right) - (f10 / 2.0f), ((float) rect.bottom) - (f10 / 2.0f));
            float f11 = this.A - (this.C / 2.0f);
            canvas.drawRoundRect(this.f25576h0, f11, f11, this.f25573e0);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (!this.F0) {
            this.f25573e0.setColor(this.f25580l0);
            this.f25573e0.setStyle(Paint.Style.FILL);
            this.f25576h0.set(rect);
            canvas.drawRoundRect(this.f25576h0, C0(), C0(), this.f25573e0);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        if (E2()) {
            j0(rect, this.f25576h0);
            RectF rectF = this.f25576h0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.L.setBounds(0, 0, (int) this.f25576h0.width(), (int) this.f25576h0.height());
            if (b.f29181a) {
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                this.M.draw(canvas);
            } else {
                this.L.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        this.f25573e0.setColor(this.f25584p0);
        this.f25573e0.setStyle(Paint.Style.FILL);
        this.f25576h0.set(rect);
        if (!this.F0) {
            canvas.drawRoundRect(this.f25576h0, C0(), C0(), this.f25573e0);
            return;
        }
        g(new RectF(rect), this.f25578j0);
        super.o(canvas, this.f25573e0, this.f25578j0, t());
    }

    private void y0(Canvas canvas, Rect rect) {
        Paint paint = this.f25574f0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.b.f(-16777216, 127));
            canvas.drawRect(rect, this.f25574f0);
            if (D2() || C2()) {
                g0(rect, this.f25576h0);
                canvas.drawRect(this.f25576h0, this.f25574f0);
            }
            if (this.E != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f25574f0);
            }
            if (E2()) {
                j0(rect, this.f25576h0);
                canvas.drawRect(this.f25576h0, this.f25574f0);
            }
            this.f25574f0.setColor(androidx.core.graphics.b.f(-65536, 127));
            i0(rect, this.f25576h0);
            canvas.drawRect(this.f25576h0, this.f25574f0);
            this.f25574f0.setColor(androidx.core.graphics.b.f(-16711936, 127));
            k0(rect, this.f25576h0);
            canvas.drawRect(this.f25576h0, this.f25574f0);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.E != null) {
            Paint.Align o02 = o0(rect, this.f25577i0);
            m0(rect, this.f25576h0);
            if (this.f25579k0.d() != null) {
                this.f25579k0.e().drawableState = getState();
                this.f25579k0.j(this.f25572d0);
            }
            this.f25579k0.e().setTextAlign(o02);
            int i10 = 0;
            boolean z10 = Math.round(this.f25579k0.f(Z0().toString())) > Math.round(this.f25576h0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f25576h0);
            }
            CharSequence charSequence = this.E;
            if (z10 && this.C0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f25579k0.e(), this.f25576h0.width(), this.C0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f25577i0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f25579k0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public Drawable A0() {
        return this.S;
    }

    public void A1(int i10) {
        z1(this.f25572d0.getResources().getDimension(i10));
    }

    public void A2(boolean z10) {
        if (this.f25597z0 != z10) {
            this.f25597z0 = z10;
            G2();
            onStateChange(getState());
        }
    }

    public ColorStateList B0() {
        return this.f25594y;
    }

    public void B1(Drawable drawable) {
        Drawable E02 = E0();
        if (E02 != drawable) {
            float h02 = h0();
            this.G = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float h03 = h0();
            F2(E02);
            if (D2()) {
                f0(this.G);
            }
            invalidateSelf();
            if (h02 != h03) {
                n1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean B2() {
        return this.D0;
    }

    public float C0() {
        return this.F0 ? E() : this.A;
    }

    public void C1(int i10) {
        B1(i.a.b(this.f25572d0, i10));
    }

    public float D0() {
        return this.f25571c0;
    }

    public void D1(float f10) {
        if (this.I != f10) {
            float h02 = h0();
            this.I = f10;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                n1();
            }
        }
    }

    public Drawable E0() {
        Drawable drawable = this.G;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void E1(int i10) {
        D1(this.f25572d0.getResources().getDimension(i10));
    }

    public float F0() {
        return this.I;
    }

    public void F1(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (D2()) {
                androidx.core.graphics.drawable.a.o(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.H;
    }

    public void G1(int i10) {
        F1(i.a.a(this.f25572d0, i10));
    }

    public float H0() {
        return this.f25596z;
    }

    public void H1(int i10) {
        I1(this.f25572d0.getResources().getBoolean(i10));
    }

    public float I0() {
        return this.V;
    }

    public void I1(boolean z10) {
        if (this.F != z10) {
            boolean D2 = D2();
            this.F = z10;
            boolean D22 = D2();
            if (D2 != D22) {
                if (D22) {
                    f0(this.G);
                } else {
                    F2(this.G);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public ColorStateList J0() {
        return this.B;
    }

    public void J1(float f10) {
        if (this.f25596z != f10) {
            this.f25596z = f10;
            invalidateSelf();
            n1();
        }
    }

    public float K0() {
        return this.C;
    }

    public void K1(int i10) {
        J1(this.f25572d0.getResources().getDimension(i10));
    }

    public Drawable L0() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void L1(float f10) {
        if (this.V != f10) {
            this.V = f10;
            invalidateSelf();
            n1();
        }
    }

    public CharSequence M0() {
        return this.P;
    }

    public void M1(int i10) {
        L1(this.f25572d0.getResources().getDimension(i10));
    }

    public float N0() {
        return this.f25570b0;
    }

    public void N1(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float O0() {
        return this.O;
    }

    public void O1(int i10) {
        N1(i.a.a(this.f25572d0, i10));
    }

    public float P0() {
        return this.f25569a0;
    }

    public void P1(float f10) {
        if (this.C != f10) {
            this.C = f10;
            this.f25573e0.setStrokeWidth(f10);
            if (this.F0) {
                super.b0(f10);
            }
            invalidateSelf();
        }
    }

    public int[] Q0() {
        return this.f25595y0;
    }

    public void Q1(int i10) {
        P1(this.f25572d0.getResources().getDimension(i10));
    }

    public ColorStateList R0() {
        return this.N;
    }

    public void S0(RectF rectF) {
        k0(getBounds(), rectF);
    }

    public void S1(Drawable drawable) {
        Drawable L0 = L0();
        if (L0 != drawable) {
            float l02 = l0();
            this.L = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f29181a) {
                H2();
            }
            float l03 = l0();
            F2(L0);
            if (E2()) {
                f0(this.L);
            }
            invalidateSelf();
            if (l02 != l03) {
                n1();
            }
        }
    }

    public TextUtils.TruncateAt T0() {
        return this.C0;
    }

    public void T1(CharSequence charSequence) {
        if (this.P != charSequence) {
            this.P = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public h U0() {
        return this.U;
    }

    public void U1(float f10) {
        if (this.f25570b0 != f10) {
            this.f25570b0 = f10;
            invalidateSelf();
            if (E2()) {
                n1();
            }
        }
    }

    public float V0() {
        return this.X;
    }

    public void V1(int i10) {
        U1(this.f25572d0.getResources().getDimension(i10));
    }

    public float W0() {
        return this.W;
    }

    public void W1(int i10) {
        S1(i.a.b(this.f25572d0, i10));
    }

    public ColorStateList X0() {
        return this.D;
    }

    public void X1(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidateSelf();
            if (E2()) {
                n1();
            }
        }
    }

    public h Y0() {
        return this.T;
    }

    public void Y1(int i10) {
        X1(this.f25572d0.getResources().getDimension(i10));
    }

    public CharSequence Z0() {
        return this.E;
    }

    public void Z1(float f10) {
        if (this.f25569a0 != f10) {
            this.f25569a0 = f10;
            invalidateSelf();
            if (E2()) {
                n1();
            }
        }
    }

    public void a() {
        n1();
        invalidateSelf();
    }

    public d a1() {
        return this.f25579k0.d();
    }

    public void a2(int i10) {
        Z1(this.f25572d0.getResources().getDimension(i10));
    }

    public float b1() {
        return this.Z;
    }

    public boolean b2(int[] iArr) {
        if (Arrays.equals(this.f25595y0, iArr)) {
            return false;
        }
        this.f25595y0 = iArr;
        if (E2()) {
            return o1(getState(), iArr);
        }
        return false;
    }

    public float c1() {
        return this.Y;
    }

    public void c2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (E2()) {
                androidx.core.graphics.drawable.a.o(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d2(int i10) {
        c2(i.a.a(this.f25572d0, i10));
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i10 = 0;
            int i11 = this.f25588t0;
            if (i11 < 255) {
                i10 = z5.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i11);
            }
            v0(canvas, bounds);
            s0(canvas, bounds);
            if (this.F0) {
                super.draw(canvas);
            }
            u0(canvas, bounds);
            x0(canvas, bounds);
            t0(canvas, bounds);
            r0(canvas, bounds);
            if (this.D0) {
                z0(canvas, bounds);
            }
            w0(canvas, bounds);
            y0(canvas, bounds);
            if (this.f25588t0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public boolean e1() {
        return this.f25597z0;
    }

    public void e2(boolean z10) {
        if (this.K != z10) {
            boolean E2 = E2();
            this.K = z10;
            boolean E22 = E2();
            if (E2 != E22) {
                if (E22) {
                    f0(this.L);
                } else {
                    F2(this.L);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public void f2(C0271a aVar) {
        this.B0 = new WeakReference<>(aVar);
    }

    public boolean g1() {
        return this.Q;
    }

    public void g2(TextUtils.TruncateAt truncateAt) {
        this.C0 = truncateAt;
    }

    public int getAlpha() {
        return this.f25588t0;
    }

    public ColorFilter getColorFilter() {
        return this.f25589u0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f25596z;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.V + h0() + this.Y + this.f25579k0.f(Z0().toString()) + this.Z + l0() + this.f25571c0), this.E0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.A);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* access modifiers changed from: package-private */
    public float h0() {
        if (D2() || C2()) {
            return this.W + this.I + this.X;
        }
        return 0.0f;
    }

    public boolean h1() {
        return k1(this.L);
    }

    public void h2(h hVar) {
        this.U = hVar;
    }

    public boolean i1() {
        return this.K;
    }

    public void i2(int i10) {
        h2(h.c(this.f25572d0, i10));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return j1(this.f25592x) || j1(this.f25594y) || j1(this.B) || (this.f25597z0 && j1(this.A0)) || l1(this.f25579k0.d()) || p0() || k1(this.G) || k1(this.S) || j1(this.f25591w0);
    }

    public void j2(float f10) {
        if (this.X != f10) {
            float h02 = h0();
            this.X = f10;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                n1();
            }
        }
    }

    public void k2(int i10) {
        j2(this.f25572d0.getResources().getDimension(i10));
    }

    /* access modifiers changed from: package-private */
    public float l0() {
        if (E2()) {
            return this.f25569a0 + this.O + this.f25570b0;
        }
        return 0.0f;
    }

    public void l2(float f10) {
        if (this.W != f10) {
            float h02 = h0();
            this.W = f10;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                n1();
            }
        }
    }

    public void m2(int i10) {
        l2(this.f25572d0.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public void n1() {
        C0271a aVar = (C0271a) this.B0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void n2(int i10) {
        this.E0 = i10;
    }

    /* access modifiers changed from: package-private */
    public Paint.Align o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.E != null) {
            float h02 = this.V + h0() + this.Y;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + h02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - h02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - n0();
        }
        return align;
    }

    public void o2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            G2();
            onStateChange(getState());
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (D2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.G, i10);
        }
        if (C2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.S, i10);
        }
        if (E2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.L, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (D2()) {
            onLevelChange |= this.G.setLevel(i10);
        }
        if (C2()) {
            onLevelChange |= this.S.setLevel(i10);
        }
        if (E2()) {
            onLevelChange |= this.L.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return o1(iArr, Q0());
    }

    public void p1(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            float h02 = h0();
            if (!z10 && this.f25586r0) {
                this.f25586r0 = false;
            }
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                n1();
            }
        }
    }

    public void p2(int i10) {
        o2(i.a.a(this.f25572d0, i10));
    }

    public void q1(int i10) {
        p1(this.f25572d0.getResources().getBoolean(i10));
    }

    /* access modifiers changed from: package-private */
    public void q2(boolean z10) {
        this.D0 = z10;
    }

    public void r1(Drawable drawable) {
        if (this.S != drawable) {
            float h02 = h0();
            this.S = drawable;
            float h03 = h0();
            F2(this.S);
            f0(this.S);
            invalidateSelf();
            if (h02 != h03) {
                n1();
            }
        }
    }

    public void r2(h hVar) {
        this.T = hVar;
    }

    public void s1(int i10) {
        r1(i.a.b(this.f25572d0, i10));
    }

    public void s2(int i10) {
        r2(h.c(this.f25572d0, i10));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.f25588t0 != i10) {
            this.f25588t0 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f25589u0 != colorFilter) {
            this.f25589u0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f25591w0 != colorStateList) {
            this.f25591w0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f25593x0 != mode) {
            this.f25593x0 = mode;
            this.f25590v0 = f6.a.a(this, this.f25591w0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (D2()) {
            visible |= this.G.setVisible(z10, z11);
        }
        if (C2()) {
            visible |= this.S.setVisible(z10, z11);
        }
        if (E2()) {
            visible |= this.L.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(int i10) {
        u1(this.f25572d0.getResources().getBoolean(i10));
    }

    public void t2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = MaxReward.DEFAULT_LABEL;
        }
        if (!TextUtils.equals(this.E, charSequence)) {
            this.E = charSequence;
            this.f25579k0.i(true);
            invalidateSelf();
            n1();
        }
    }

    public void u1(boolean z10) {
        if (this.R != z10) {
            boolean C2 = C2();
            this.R = z10;
            boolean C22 = C2();
            if (C2 != C22) {
                if (C22) {
                    f0(this.S);
                } else {
                    F2(this.S);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public void u2(d dVar) {
        this.f25579k0.h(dVar, this.f25572d0);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.f25594y != colorStateList) {
            this.f25594y = colorStateList;
            onStateChange(getState());
        }
    }

    public void v2(int i10) {
        u2(new d(this.f25572d0, i10));
    }

    public void w1(int i10) {
        v1(i.a.a(this.f25572d0, i10));
    }

    public void w2(float f10) {
        if (this.Z != f10) {
            this.Z = f10;
            invalidateSelf();
            n1();
        }
    }

    @Deprecated
    public void x1(float f10) {
        if (this.A != f10) {
            this.A = f10;
            setShapeAppearanceModel(B().w(f10));
        }
    }

    public void x2(int i10) {
        w2(this.f25572d0.getResources().getDimension(i10));
    }

    @Deprecated
    public void y1(int i10) {
        x1(this.f25572d0.getResources().getDimension(i10));
    }

    public void y2(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            invalidateSelf();
            n1();
        }
    }

    public void z1(float f10) {
        if (this.f25571c0 != f10) {
            this.f25571c0 = f10;
            invalidateSelf();
            n1();
        }
    }

    public void z2(int i10) {
        y2(this.f25572d0.getResources().getDimension(i10));
    }
}
