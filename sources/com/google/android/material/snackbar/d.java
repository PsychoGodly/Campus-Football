package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.a0;
import com.google.android.material.internal.g;
import x5.k;

/* compiled from: BaseTransientBottomBar */
public class d extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    private static final View.OnTouchListener f25864g = new a();

    /* renamed from: a  reason: collision with root package name */
    private c f25865a;

    /* renamed from: b  reason: collision with root package name */
    private b f25866b;

    /* renamed from: c  reason: collision with root package name */
    private int f25867c;

    /* renamed from: d  reason: collision with root package name */
    private final float f25868d;

    /* renamed from: f  reason: collision with root package name */
    private final float f25869f;

    /* compiled from: BaseTransientBottomBar */
    static class a implements View.OnTouchListener {
        a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected d(Context context, AttributeSet attributeSet) {
        super(g.f(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.L2);
        int i10 = k.Q2;
        if (obtainStyledAttributes.hasValue(i10)) {
            a0.v0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i10, 0));
        }
        this.f25867c = obtainStyledAttributes.getInt(k.O2, 0);
        this.f25868d = obtainStyledAttributes.getFloat(k.P2, 1.0f);
        this.f25869f = obtainStyledAttributes.getFloat(k.N2, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f25864g);
        setFocusable(true);
    }

    /* access modifiers changed from: package-private */
    public float getActionTextColorAlpha() {
        return this.f25869f;
    }

    /* access modifiers changed from: package-private */
    public int getAnimationMode() {
        return this.f25867c;
    }

    /* access modifiers changed from: package-private */
    public float getBackgroundOverlayColorAlpha() {
        return this.f25868d;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f25866b;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        a0.k0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f25866b;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c cVar = this.f25865a;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationMode(int i10) {
        this.f25867c = i10;
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(b bVar) {
        this.f25866b = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f25864g);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(c cVar) {
        this.f25865a = cVar;
    }
}
