package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.f;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.google.android.material.chip.a;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import k6.d;
import n6.n;
import x5.i;
import x5.j;
import x5.k;

public class Chip extends f implements a.C0271a, n {
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final Rect f25536v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    private static final int[] f25537w = {16842913};

    /* renamed from: x  reason: collision with root package name */
    private static final int[] f25538x = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a f25539f;

    /* renamed from: g  reason: collision with root package name */
    private InsetDrawable f25540g;

    /* renamed from: h  reason: collision with root package name */
    private RippleDrawable f25541h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnClickListener f25542i;

    /* renamed from: j  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f25543j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25544k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25545l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25546m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f25547n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f25548o;

    /* renamed from: p  reason: collision with root package name */
    private int f25549p;

    /* renamed from: q  reason: collision with root package name */
    private int f25550q;

    /* renamed from: r  reason: collision with root package name */
    private final c f25551r;

    /* renamed from: s  reason: collision with root package name */
    private final Rect f25552s;

    /* renamed from: t  reason: collision with root package name */
    private final RectF f25553t;

    /* renamed from: u  reason: collision with root package name */
    private final k6.f f25554u;

    class a extends k6.f {
        a() {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f25539f.B2() ? Chip.this.f25539f.Z0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f25539f != null) {
                Chip.this.f25539f.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends f0.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f10, float f11) {
            return (!Chip.this.m() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m() && Chip.this.r()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.s();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void M(androidx.core.view.accessibility.c cVar) {
            cVar.V(Chip.this.q());
            cVar.Y(Chip.this.isClickable());
            if (Chip.this.q() || Chip.this.isClickable()) {
                cVar.X(Chip.this.q() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.X("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.s0(text);
            } else {
                cVar.b0(text);
            }
        }

        /* access modifiers changed from: protected */
        public void N(int i10, androidx.core.view.accessibility.c cVar) {
            CharSequence charSequence = MaxReward.DEFAULT_LABEL;
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.b0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.b0(context.getString(i11, objArr).trim());
                }
                cVar.T(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f3126i);
                cVar.d0(Chip.this.isEnabled());
                return;
            }
            cVar.b0(charSequence);
            cVar.T(Chip.f25536v);
        }

        /* access modifiers changed from: protected */
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                boolean unused = Chip.this.f25547n = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5.b.chipStyle);
    }

    private void A() {
        TextPaint paint = getPaint();
        a aVar = this.f25539f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.f25554u);
        }
    }

    private void B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f25553t.setEmpty();
        if (m()) {
            this.f25539f.S0(this.f25553t);
        }
        return this.f25553t;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f25552s.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f25552s;
    }

    private d getTextAppearance() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    private void h(a aVar) {
        aVar.f2(this);
    }

    private int[] i() {
        int isEnabled = isEnabled();
        if (this.f25547n) {
            isEnabled++;
        }
        if (this.f25546m) {
            isEnabled++;
        }
        if (this.f25545l) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f25547n) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f25546m) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f25545l) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void k() {
        if (getBackgroundDrawable() == this.f25540g && this.f25539f.getCallback() == null) {
            this.f25539f.setCallback(this.f25540g);
        }
    }

    private boolean l(MotionEvent motionEvent) {
        Class<f0.a> cls = f0.a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f25551r)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f25551r, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e10);
            } catch (IllegalAccessException e11) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e11);
            } catch (InvocationTargetException e12) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e12);
            } catch (NoSuchFieldException e13) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e13);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean m() {
        a aVar = this.f25539f;
        return (aVar == null || aVar.L0() == null) ? false : true;
    }

    private void n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray k10 = g.k(context, attributeSet, k.K, i10, j.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f25548o = k10.getBoolean(k.f30955p0, false);
        this.f25550q = (int) Math.ceil((double) k10.getDimension(k.f30883d0, (float) Math.ceil((double) h.a(getContext(), 48))));
        k10.recycle();
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void p(int i10, int i11, int i12, int i13) {
        this.f25540g = new InsetDrawable(this.f25539f, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f25546m != z10) {
            this.f25546m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f25545l != z10) {
            this.f25545l = z10;
            refreshDrawableState();
        }
    }

    private void t() {
        if (this.f25540g != null) {
            this.f25540g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    private void v(a aVar) {
        if (aVar != null) {
            aVar.f2((a.C0271a) null);
        }
    }

    private void w() {
        if (Build.VERSION.SDK_INT < 24) {
            if (!m() || !r()) {
                a0.n0(this, (androidx.core.view.a) null);
            } else {
                a0.n0(this, this.f25551r);
            }
        }
    }

    private void x() {
        if (l6.b.f29181a) {
            y();
            return;
        }
        this.f25539f.A2(true);
        a0.r0(this, getBackgroundDrawable());
        k();
    }

    private void y() {
        this.f25541h = new RippleDrawable(l6.b.a(this.f25539f.X0()), getBackgroundDrawable(), (Drawable) null);
        this.f25539f.A2(false);
        a0.r0(this, this.f25541h);
    }

    private void z() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f25539f) != null) {
            a0.A0(this, (int) (this.f25539f.I0() + this.f25539f.c1() + this.f25539f.h0()), getPaddingTop(), (int) (aVar.D0() + this.f25539f.b1() + this.f25539f.l0()), getPaddingBottom());
        }
    }

    public void a() {
        j(this.f25550q);
        x();
        z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return l(motionEvent) || this.f25551r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f25551r.w(keyEvent) || this.f25551r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f25539f;
        if ((aVar == null || !aVar.h1()) ? false : this.f25539f.b2(i())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f25540g;
        return insetDrawable == null ? this.f25539f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.C0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f25539f;
    }

    public float getChipEndPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.D0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f25551r.A() == 1 || this.f25551r.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public y5.h getHideMotionSpec() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public n6.k getShapeAppearanceModel() {
        return this.f25539f.B();
    }

    public y5.h getShowMotionSpec() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f25539f;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public boolean j(int i10) {
        this.f25550q = i10;
        int i11 = 0;
        if (!u()) {
            t();
            return false;
        }
        int max = Math.max(0, i10 - this.f25539f.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f25539f.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i12 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i11 = max / 2;
            }
            if (this.f25540g != null) {
                Rect rect = new Rect();
                this.f25540g.getPadding(rect);
                if (rect.top == i11 && rect.bottom == i11 && rect.left == i12 && rect.right == i12) {
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i10) {
                    setMinHeight(i10);
                }
                if (getMinWidth() != i10) {
                    setMinWidth(i10);
                }
            } else {
                setMinHeight(i10);
                setMinWidth(i10);
            }
            p(i12, i11, i12, i11);
            return true;
        }
        t();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n6.h.f(this, this.f25539f);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f25537w);
        }
        if (q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f25538x);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f25551r.I(z10, i10, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (q() || isClickable()) {
            accessibilityNodeInfo.setClassName(q() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f25549p != i10) {
            this.f25549p = i10;
            z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f25545l
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f25545l
            if (r0 == 0) goto L_0x0034
            r5.s()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q() {
        a aVar = this.f25539f;
        return aVar != null && aVar.g1();
    }

    public boolean r() {
        a aVar = this.f25539f;
        return aVar != null && aVar.i1();
    }

    public boolean s() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f25542i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        this.f25551r.U(1, 1);
        return z10;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f25541h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f25541h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.p1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.q1(i10);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.f25539f;
        if (aVar == null) {
            this.f25544k = z10;
        } else if (aVar.g1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (onCheckedChangeListener = this.f25543j) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z10);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.r1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.s1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.t1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.v1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.w1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.x1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.y1(i10);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f25539f;
        if (aVar2 != aVar) {
            v(aVar2);
            this.f25539f = aVar;
            aVar.q2(false);
            h(this.f25539f);
            j(this.f25550q);
            x();
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.z1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.B1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.D1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.F1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.J1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.L1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.N1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.P1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.S1(drawable);
        }
        w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.T1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.U1(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.W1(i10);
        }
        w();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.Z1(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.c2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f25539f != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f25539f;
                if (aVar != null) {
                    aVar.g2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f25548o = z10;
        j(this.f25550q);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(y5.h hVar) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.h2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.l2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setLayoutDirection(int i10) {
        if (this.f25539f != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f25543j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f25542i = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.o2(colorStateList);
        }
        if (!this.f25539f.e1()) {
            y();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.p2(i10);
            if (!this.f25539f.e1()) {
                y();
            }
        }
    }

    public void setShapeAppearanceModel(n6.k kVar) {
        this.f25539f.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(y5.h hVar) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.r2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f25539f;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = MaxReward.DEFAULT_LABEL;
            }
            super.setText(aVar.B2() ? null : charSequence, bufferType);
            a aVar2 = this.f25539f;
            if (aVar2 != null) {
                aVar2.t2(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.u2(dVar);
        }
        A();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.w2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.y2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    public boolean u() {
        return this.f25548o;
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25552s = new Rect();
        this.f25553t = new RectF();
        this.f25554u = new a();
        B(attributeSet);
        int i11 = j.Widget_MaterialComponents_Chip_Action;
        a q02 = a.q0(context, attributeSet, i10, i11);
        n(context, attributeSet, i10);
        setChipDrawable(q02);
        q02.S(a0.v(this));
        TypedArray k10 = g.k(context, attributeSet, k.K, i10, i11, new int[0]);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            setTextColor(k6.c.a(context, k10, k.M));
        }
        boolean hasValue = k10.hasValue(k.f30984u0);
        k10.recycle();
        c cVar = new c(this);
        this.f25551r = cVar;
        if (i12 >= 24) {
            a0.n0(this, cVar);
        } else {
            w();
        }
        if (!hasValue) {
            o();
        }
        setChecked(this.f25544k);
        setText(q02.Z0());
        setEllipsize(q02.T0());
        setIncludeFontPadding(false);
        A();
        if (!this.f25539f.B2()) {
            setSingleLine();
        }
        setGravity(8388627);
        z();
        if (u()) {
            setMinHeight(this.f25550q);
        }
        this.f25549p = a0.B(this);
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.e2(z10);
        }
        w();
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.u1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.I1(z10);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.v2(i10);
        }
        A();
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f25539f;
        if (aVar != null) {
            aVar.v2(i10);
        }
        A();
    }
}
