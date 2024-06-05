package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import n6.k;
import n6.n;
import x5.b;
import x5.j;

/* compiled from: MaterialCardView */
public class a extends r.a implements Checkable, n {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f25528o = {16842911};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f25529p = {16842912};

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f25530q = {b.state_dragged};

    /* renamed from: r  reason: collision with root package name */
    private static final int f25531r = j.Widget_MaterialComponents_CardView;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25532k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25533l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25534m;

    /* renamed from: n  reason: collision with root package name */
    private C0270a f25535n;

    /* renamed from: com.google.android.material.card.a$a  reason: collision with other inner class name */
    /* compiled from: MaterialCardView */
    public interface C0270a {
        void a(a aVar, boolean z10);
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return this.f25534m;
    }

    public boolean isChecked() {
        return this.f25533l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f25528o);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f25529p);
        }
        if (i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f25530q);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(r.a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(r.a.class.getName());
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f25532k) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        throw null;
    }

    public void setCheckable(boolean z10) {
        throw null;
    }

    public void setChecked(boolean z10) {
        if (this.f25533l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i10) {
        i.a.b(getContext(), i10);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        throw null;
    }

    public void setDragged(boolean z10) {
        if (this.f25534m != z10) {
            this.f25534m = z10;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        throw null;
    }

    public void setOnCheckedChangeListener(C0270a aVar) {
        this.f25535n = aVar;
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        throw null;
    }

    public void setProgress(float f10) {
        throw null;
    }

    public void setRadius(float f10) {
        super.setRadius(f10);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i10) {
        i.a.a(getContext(), i10);
        throw null;
    }

    public void setShapeAppearanceModel(k kVar) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setStrokeWidth(int i10) {
        throw null;
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        throw null;
    }

    public void toggle() {
        if (h() && isEnabled()) {
            this.f25533l = !this.f25533l;
            refreshDrawableState();
            g();
            C0270a aVar = this.f25535n;
            if (aVar != null) {
                aVar.a(this, this.f25533l);
            }
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
