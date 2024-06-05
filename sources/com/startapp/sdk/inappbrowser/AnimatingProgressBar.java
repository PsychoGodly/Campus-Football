package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* compiled from: Sta */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c  reason: collision with root package name */
    public static final Interpolator f17219c = new AccelerateDecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f17220a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17221b = false;

    /* compiled from: Sta */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatingProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        boolean z10 = false;
        this.f17221b = Build.VERSION.SDK_INT >= 11 ? true : z10;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f17220a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setProgress(int i10) {
        if (!this.f17221b) {
            super.setProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f17220a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i10) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i10});
            this.f17220a = ofInt;
            ofInt.setInterpolator(f17219c);
            this.f17220a.addUpdateListener(new a());
        }
        this.f17220a.setIntValues(new int[]{getProgress(), i10});
        this.f17220a.start();
    }

    public void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f17220a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
