package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f25395a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f25396b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f25397c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f25398d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f25398d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f25398d = v10.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public void G(V v10, int i10) {
        this.f25397c = i10;
        if (this.f25396b == 1) {
            v10.setTranslationY((float) (this.f25395a + i10));
        }
    }

    public void H(V v10) {
        if (this.f25396b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f25398d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            this.f25396b = 1;
            F(v10, this.f25395a + this.f25397c, 175, y5.a.f31293c);
        }
    }

    public void I(V v10) {
        if (this.f25396b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f25398d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            this.f25396b = 2;
            F(v10, 0, 225, y5.a.f31294d);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f25395a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v10, i10);
    }

    public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        if (i11 > 0) {
            H(v10);
        } else if (i11 < 0) {
            I(v10);
        }
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
