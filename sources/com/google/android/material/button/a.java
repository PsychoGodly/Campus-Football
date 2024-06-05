package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.a0;
import com.google.android.material.internal.h;
import k6.c;
import n6.g;
import n6.k;
import n6.n;
import x5.b;

/* compiled from: MaterialButtonHelper */
class a {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f25509s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f25510a;

    /* renamed from: b  reason: collision with root package name */
    private k f25511b;

    /* renamed from: c  reason: collision with root package name */
    private int f25512c;

    /* renamed from: d  reason: collision with root package name */
    private int f25513d;

    /* renamed from: e  reason: collision with root package name */
    private int f25514e;

    /* renamed from: f  reason: collision with root package name */
    private int f25515f;

    /* renamed from: g  reason: collision with root package name */
    private int f25516g;

    /* renamed from: h  reason: collision with root package name */
    private int f25517h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f25518i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f25519j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f25520k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f25521l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f25522m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f25523n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f25524o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25525p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f25526q;

    /* renamed from: r  reason: collision with root package name */
    private LayerDrawable f25527r;

    a(MaterialButton materialButton, k kVar) {
        this.f25510a = materialButton;
        this.f25511b = kVar;
    }

    private void A(k kVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(kVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g d10 = d();
        g l10 = l();
        if (d10 != null) {
            d10.Z((float) this.f25517h, this.f25520k);
            if (l10 != null) {
                l10.Y((float) this.f25517h, this.f25523n ? d6.a.c(this.f25510a, b.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f25512c, this.f25514e, this.f25513d, this.f25515f);
    }

    private Drawable a() {
        g gVar = new g(this.f25511b);
        gVar.L(this.f25510a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f25519j);
        PorterDuff.Mode mode = this.f25518i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.Z((float) this.f25517h, this.f25520k);
        g gVar2 = new g(this.f25511b);
        gVar2.setTint(0);
        gVar2.Y((float) this.f25517h, this.f25523n ? d6.a.c(this.f25510a, b.colorSurface) : 0);
        if (f25509s) {
            g gVar3 = new g(this.f25511b);
            this.f25522m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(l6.b.a(this.f25521l), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f25522m);
            this.f25527r = rippleDrawable;
            return rippleDrawable;
        }
        l6.a aVar = new l6.a(this.f25511b);
        this.f25522m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, l6.b.a(this.f25521l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f25522m});
        this.f25527r = layerDrawable;
        return D(layerDrawable);
    }

    private g e(boolean z10) {
        LayerDrawable layerDrawable = this.f25527r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f25509s) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f25527r.getDrawable(0)).getDrawable()).getDrawable(z10 ^ true ? 1 : 0);
        }
        return (g) this.f25527r.getDrawable(z10 ^ true ? 1 : 0);
    }

    private g l() {
        return e(true);
    }

    /* access modifiers changed from: package-private */
    public void B(int i10, int i11) {
        Drawable drawable = this.f25522m;
        if (drawable != null) {
            drawable.setBounds(this.f25512c, this.f25514e, i11 - this.f25513d, i10 - this.f25515f);
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f25516g;
    }

    public n c() {
        LayerDrawable layerDrawable = this.f25527r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f25527r.getNumberOfLayers() > 2) {
            return (n) this.f25527r.getDrawable(2);
        }
        return (n) this.f25527r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public g d() {
        return e(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f25521l;
    }

    /* access modifiers changed from: package-private */
    public k g() {
        return this.f25511b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f25520k;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f25517h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f25519j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        return this.f25518i;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f25524o;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f25526q;
    }

    /* access modifiers changed from: package-private */
    public void o(TypedArray typedArray) {
        this.f25512c = typedArray.getDimensionPixelOffset(x5.k.f30926k1, 0);
        this.f25513d = typedArray.getDimensionPixelOffset(x5.k.f30932l1, 0);
        this.f25514e = typedArray.getDimensionPixelOffset(x5.k.f30938m1, 0);
        this.f25515f = typedArray.getDimensionPixelOffset(x5.k.f30944n1, 0);
        int i10 = x5.k.f30968r1;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f25516g = dimensionPixelSize;
            u(this.f25511b.w((float) dimensionPixelSize));
            this.f25525p = true;
        }
        this.f25517h = typedArray.getDimensionPixelSize(x5.k.B1, 0);
        this.f25518i = h.c(typedArray.getInt(x5.k.f30962q1, -1), PorterDuff.Mode.SRC_IN);
        this.f25519j = c.a(this.f25510a.getContext(), typedArray, x5.k.f30956p1);
        this.f25520k = c.a(this.f25510a.getContext(), typedArray, x5.k.A1);
        this.f25521l = c.a(this.f25510a.getContext(), typedArray, x5.k.f31010z1);
        this.f25526q = typedArray.getBoolean(x5.k.f30950o1, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(x5.k.f30974s1, 0);
        int G = a0.G(this.f25510a);
        int paddingTop = this.f25510a.getPaddingTop();
        int F = a0.F(this.f25510a);
        int paddingBottom = this.f25510a.getPaddingBottom();
        this.f25510a.setInternalBackground(a());
        g d10 = d();
        if (d10 != null) {
            d10.S((float) dimensionPixelSize2);
        }
        a0.A0(this.f25510a, G + this.f25512c, paddingTop + this.f25514e, F + this.f25513d, paddingBottom + this.f25515f);
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        if (d() != null) {
            d().setTint(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f25524o = true;
        this.f25510a.setSupportBackgroundTintList(this.f25519j);
        this.f25510a.setSupportBackgroundTintMode(this.f25518i);
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f25526q = z10;
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        if (!this.f25525p || this.f25516g != i10) {
            this.f25516g = i10;
            this.f25525p = true;
            u(this.f25511b.w((float) i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void t(ColorStateList colorStateList) {
        if (this.f25521l != colorStateList) {
            this.f25521l = colorStateList;
            boolean z10 = f25509s;
            if (z10 && (this.f25510a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f25510a.getBackground()).setColor(l6.b.a(colorStateList));
            } else if (!z10 && (this.f25510a.getBackground() instanceof l6.a)) {
                ((l6.a) this.f25510a.getBackground()).setTintList(l6.b.a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(k kVar) {
        this.f25511b = kVar;
        A(kVar);
    }

    /* access modifiers changed from: package-private */
    public void v(boolean z10) {
        this.f25523n = z10;
        C();
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f25520k != colorStateList) {
            this.f25520k = colorStateList;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i10) {
        if (this.f25517h != i10) {
            this.f25517h = i10;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f25519j != colorStateList) {
            this.f25519j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.f25519j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(PorterDuff.Mode mode) {
        if (this.f25518i != mode) {
            this.f25518i = mode;
            if (d() != null && this.f25518i != null) {
                androidx.core.graphics.drawable.a.p(d(), this.f25518i);
            }
        }
    }
}
