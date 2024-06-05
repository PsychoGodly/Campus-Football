package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import y5.b;
import y5.i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final i f26030c = new i(75, 150);

    /* renamed from: d  reason: collision with root package name */
    private final i f26031d = new i(0, 150);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f26032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f26033b;

        a(boolean z10, View view) {
            this.f26032a = z10;
            this.f26033b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f26032a) {
                this.f26033b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f26032a) {
                this.f26033b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    private void K(View view, boolean z10, boolean z11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        i iVar = z10 ? this.f26030c : this.f26031d;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.a(objectAnimator);
        list.add(objectAnimator);
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        K(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
