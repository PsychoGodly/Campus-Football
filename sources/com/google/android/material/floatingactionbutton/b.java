package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop */
class b extends a {
    b(FloatingActionButton floatingActionButton, m6.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator e0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f25767x, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f25767x, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(a.E);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        b0();
    }

    /* access modifiers changed from: package-private */
    public void C(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f25767x.isEnabled()) {
            this.f25767x.setElevation(this.f25750g);
            if (this.f25767x.isPressed()) {
                this.f25767x.setTranslationZ(this.f25752i);
            } else if (this.f25767x.isFocused() || this.f25767x.isHovered()) {
                this.f25767x.setTranslationZ(this.f25751h);
            } else {
                this.f25767x.setTranslationZ(0.0f);
            }
        } else {
            this.f25767x.setElevation(0.0f);
            this.f25767x.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f25767x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.F, e0(f10, f12));
            stateListAnimator.addState(a.G, e0(f10, f11));
            stateListAnimator.addState(a.H, e0(f10, f11));
            stateListAnimator.addState(a.I, e0(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f25767x, "elevation", new float[]{f10}).setDuration(0));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f25767x;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f25767x, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.E);
            stateListAnimator.addState(a.J, animatorSet);
            stateListAnimator.addState(a.K, e0(0.0f, 0.0f));
            this.f25767x.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f25746c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(l6.b.a(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean V() {
        return this.f25768y.c() || !X();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
    }

    public float m() {
        return this.f25767x.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void r(Rect rect) {
        if (this.f25768y.c()) {
            super.r(rect);
        } else if (!X()) {
            int sizeDimension = (this.f25753j - this.f25767x.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
    }
}
