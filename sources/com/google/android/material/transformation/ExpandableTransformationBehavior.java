package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f26009b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f26009b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    public boolean H(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f26009b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet J = J(view, view2, z10, z12);
        this.f26009b = J;
        J.addListener(new a());
        this.f26009b.start();
        if (!z11) {
            this.f26009b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract AnimatorSet J(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
