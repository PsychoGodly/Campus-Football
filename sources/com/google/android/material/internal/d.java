package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.l0;
import x5.k;

/* compiled from: ForegroundLinearLayout */
public class d extends l0 {

    /* renamed from: q  reason: collision with root package name */
    private Drawable f25833q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f25834r;

    /* renamed from: s  reason: collision with root package name */
    private final Rect f25835s;

    /* renamed from: t  reason: collision with root package name */
    private int f25836t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f25837u;

    /* renamed from: v  reason: collision with root package name */
    boolean f25838v;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f25833q;
        if (drawable != null) {
            if (this.f25838v) {
                this.f25838v = false;
                Rect rect = this.f25834r;
                Rect rect2 = this.f25835s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f25837u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f25836t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f25833q;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f25833q;
        if (drawable != null && drawable.isStateful()) {
            this.f25833q.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f25833q;
    }

    public int getForegroundGravity() {
        return this.f25836t;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f25833q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25838v = z10 | this.f25838v;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f25838v = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f25833q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f25833q);
            }
            this.f25833q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f25836t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f25836t != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f25836t = i10;
            if (i10 == 119 && this.f25833q != null) {
                this.f25833q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25833q;
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25834r = new Rect();
        this.f25835s = new Rect();
        this.f25836t = 119;
        this.f25837u = true;
        this.f25838v = false;
        TypedArray k10 = g.k(context, attributeSet, k.Y0, i10, 0, new int[0]);
        this.f25836t = k10.getInt(k.f30866a1, this.f25836t);
        Drawable drawable = k10.getDrawable(k.Z0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f25837u = k10.getBoolean(k.f30872b1, true);
        k10.recycle();
    }
}
