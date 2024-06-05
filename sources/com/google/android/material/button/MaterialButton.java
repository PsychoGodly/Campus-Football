package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.a0;
import androidx.core.widget.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n6.h;
import n6.k;
import n6.n;
import x5.j;

public class MaterialButton extends AppCompatButton implements Checkable, n {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f25494q = {16842911};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f25495r = {16842912};

    /* renamed from: s  reason: collision with root package name */
    private static final int f25496s = j.Widget_MaterialComponents_Button;

    /* renamed from: d  reason: collision with root package name */
    private final a f25497d;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashSet<a> f25498f;

    /* renamed from: g  reason: collision with root package name */
    private b f25499g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f25500h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f25501i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f25502j;

    /* renamed from: k  reason: collision with root package name */
    private int f25503k;

    /* renamed from: l  reason: collision with root package name */
    private int f25504l;

    /* renamed from: m  reason: collision with root package name */
    private int f25505m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f25506n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f25507o;

    /* renamed from: p  reason: collision with root package name */
    private int f25508p;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5.b.materialButtonStyle);
    }

    private boolean b() {
        return a0.B(this) == 1;
    }

    private boolean c() {
        a aVar = this.f25497d;
        return aVar != null && !aVar.m();
    }

    private void d(boolean z10) {
        if (z10) {
            i.i(this, this.f25502j, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            i.i(this, (Drawable) null, (Drawable) null, this.f25502j, (Drawable) null);
        }
    }

    private void e(boolean z10) {
        Drawable drawable = this.f25502j;
        boolean z11 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f25502j = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f25501i);
            PorterDuff.Mode mode = this.f25500h;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f25502j, mode);
            }
            int i10 = this.f25503k;
            if (i10 == 0) {
                i10 = this.f25502j.getIntrinsicWidth();
            }
            int i11 = this.f25503k;
            if (i11 == 0) {
                i11 = this.f25502j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f25502j;
            int i12 = this.f25504l;
            drawable2.setBounds(i12, 0, i10 + i12, i11);
        }
        int i13 = this.f25508p;
        boolean z12 = i13 == 1 || i13 == 2;
        if (z10) {
            d(z12);
            return;
        }
        Drawable[] a10 = i.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[2];
        if ((z12 && drawable3 != this.f25502j) || (!z12 && drawable4 != this.f25502j)) {
            z11 = true;
        }
        if (z11) {
            d(z12);
        }
    }

    private void f() {
        if (this.f25502j != null && getLayout() != null) {
            int i10 = this.f25508p;
            boolean z10 = true;
            if (i10 == 1 || i10 == 3) {
                this.f25504l = 0;
                e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i11 = this.f25503k;
            if (i11 == 0) {
                i11 = this.f25502j.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - a0.F(this)) - i11) - this.f25505m) - a0.G(this)) / 2;
            boolean b10 = b();
            if (this.f25508p != 4) {
                z10 = false;
            }
            if (b10 != z10) {
                measuredWidth = -measuredWidth;
            }
            if (this.f25504l != measuredWidth) {
                this.f25504l = measuredWidth;
                e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        a aVar = this.f25497d;
        return aVar != null && aVar.n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.f25497d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f25502j;
    }

    public int getIconGravity() {
        return this.f25508p;
    }

    public int getIconPadding() {
        return this.f25505m;
    }

    public int getIconSize() {
        return this.f25503k;
    }

    public ColorStateList getIconTint() {
        return this.f25501i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f25500h;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.f25497d.f();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (c()) {
            return this.f25497d.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.f25497d.h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.f25497d.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (c()) {
            return this.f25497d.j();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (c()) {
            return this.f25497d.k();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f25506n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f25497d.d());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f25494q);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f25495r);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f25497d) != null) {
            aVar.B(i13 - i11, i12 - i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        f();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (c()) {
            this.f25497d.p(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f25497d.q();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (c()) {
            this.f25497d.r(z10);
        }
    }

    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f25506n != z10) {
            this.f25506n = z10;
            refreshDrawableState();
            if (!this.f25507o) {
                this.f25507o = true;
                Iterator it = this.f25498f.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.f25506n);
                }
                this.f25507o = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (c()) {
            this.f25497d.s(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (c()) {
            this.f25497d.d().S(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f25502j != drawable) {
            this.f25502j = drawable;
            e(true);
        }
    }

    public void setIconGravity(int i10) {
        if (this.f25508p != i10) {
            this.f25508p = i10;
            f();
        }
    }

    public void setIconPadding(int i10) {
        if (this.f25505m != i10) {
            this.f25505m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f25503k != i10) {
            this.f25503k = i10;
            e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f25501i != colorStateList) {
            this.f25501i = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f25500h != mode) {
            this.f25500h = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(i.a.a(getContext(), i10));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f25499g = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.f25499g;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.f25497d.t(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (c()) {
            setRippleColor(i.a.a(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (c()) {
            this.f25497d.u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (c()) {
            this.f25497d.v(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.f25497d.w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (c()) {
            setStrokeColor(i.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (c()) {
            this.f25497d.x(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f25497d.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f25497d.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f25506n);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f25496s
            android.content.Context r9 = com.google.android.material.internal.g.f(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f25498f = r9
            r9 = 0
            r8.f25506n = r9
            r8.f25507o = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = x5.k.f30920j1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.g.k(r0, r1, r2, r3, r4, r5)
            int r1 = x5.k.f30990v1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f25505m = r1
            int r1 = x5.k.f31005y1
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.h.c(r1, r2)
            r8.f25500h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = x5.k.f31000x1
            android.content.res.ColorStateList r1 = k6.c.a(r1, r0, r2)
            r8.f25501i = r1
            android.content.Context r1 = r8.getContext()
            int r2 = x5.k.f30980t1
            android.graphics.drawable.Drawable r1 = k6.c.d(r1, r0, r2)
            r8.f25502j = r1
            int r1 = x5.k.f30985u1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f25508p = r1
            int r1 = x5.k.f30995w1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f25503k = r1
            n6.k$b r10 = n6.k.e(r7, r10, r11, r6)
            n6.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f25497d = r11
            r11.o(r0)
            r0.recycle()
            int r10 = r8.f25505m
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f25502j
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
