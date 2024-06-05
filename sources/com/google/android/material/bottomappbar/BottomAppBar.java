package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.h;
import x5.j;
import y5.k;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: m0  reason: collision with root package name */
    private static final int f25416m0 = j.Widget_MaterialComponents_BottomAppBar;
    private final int V;
    private final n6.g W;

    /* renamed from: a0  reason: collision with root package name */
    private Animator f25417a0;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public Animator f25418b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f25419c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f25420d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f25421e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f25422f0;

    /* renamed from: g0  reason: collision with root package name */
    private ArrayList<f> f25423g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f25424h0;

    /* renamed from: i0  reason: collision with root package name */
    private Behavior f25425i0;

    /* renamed from: j0  reason: collision with root package name */
    private int f25426j0;

    /* renamed from: k0  reason: collision with root package name */
    AnimatorListenerAdapter f25427k0;

    /* renamed from: l0  reason: collision with root package name */
    k<FloatingActionButton> f25428l0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25435a;

        class a extends FloatingActionButton.b {
            a() {
            }

            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.i0();
            }
        }

        b(int i10) {
            this.f25435a = i10;
        }

        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.n0(this.f25435a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
            Animator unused = BottomAppBar.this.f25418b0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f25439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f25440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f25441c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f25442d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f25440b = actionMenuView;
            this.f25441c = i10;
            this.f25442d = z10;
        }

        public void onAnimationCancel(Animator animator) {
            this.f25439a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f25439a) {
                BottomAppBar.this.u0(this.f25440b, this.f25441c, this.f25442d);
            }
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f25427k0.onAnimationStart(animator);
            FloatingActionButton T = BottomAppBar.this.k0();
            if (T != null) {
                T.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class g extends e0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f25445c;

        /* renamed from: d  reason: collision with root package name */
        boolean f25446d;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25445c);
            parcel.writeInt(this.f25446d ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25445c = parcel.readInt();
            this.f25446d = parcel.readInt() != 0;
        }
    }

    /* access modifiers changed from: private */
    public void d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f25427k0);
        floatingActionButton.f(new e());
        floatingActionButton.g(this.f25428l0);
    }

    private void e0() {
        Animator animator = this.f25418b0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f25417a0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void g0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k0(), "translationX", new float[]{n0(i10)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f25426j0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return n0(this.f25419c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().b();
    }

    private a getTopEdgeTreatment() {
        return (a) this.W.B().p();
    }

    private void h0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) m0(actionMenuView, i10, z10))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new d(actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public void i0() {
        ArrayList<f> arrayList;
        int i10 = this.f25422f0 - 1;
        this.f25422f0 = i10;
        if (i10 == 0 && (arrayList = this.f25423g0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void j0() {
        ArrayList<f> arrayList;
        int i10 = this.f25422f0;
        this.f25422f0 = i10 + 1;
        if (i10 == 0 && (arrayList = this.f25423g0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton k0() {
        View l02 = l0();
        if (l02 instanceof FloatingActionButton) {
            return (FloatingActionButton) l02;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View l0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.l0():android.view.View");
    }

    /* access modifiers changed from: private */
    public float n0(int i10) {
        int i11 = 1;
        boolean z10 = a0.B(this) == 1;
        if (i10 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.V;
        if (z10) {
            i11 = -1;
        }
        return (float) (measuredWidth * i11);
    }

    private boolean o0() {
        FloatingActionButton k02 = k0();
        return k02 != null && k02.o();
    }

    private void p0(int i10, boolean z10) {
        if (a0.R(this)) {
            Animator animator = this.f25418b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!o0()) {
                i10 = 0;
                z10 = false;
            }
            h0(i10, z10, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f25418b0 = animatorSet;
            animatorSet.addListener(new c());
            this.f25418b0.start();
        }
    }

    private void q0(int i10) {
        if (this.f25419c0 != i10 && a0.R(this)) {
            Animator animator = this.f25417a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f25420d0 == 1) {
                g0(i10, arrayList);
            } else {
                f0(i10, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f25417a0 = animatorSet;
            animatorSet.addListener(new a());
            this.f25417a0.start();
        }
    }

    private void r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!o0()) {
                u0(actionMenuView, 0, false);
            } else {
                u0(actionMenuView, this.f25419c0, this.f25424h0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void s0() {
        getTopEdgeTreatment().k(getFabTranslationX());
        View l02 = l0();
        this.W.U((!this.f25424h0 || !o0()) ? 0.0f : 1.0f);
        if (l02 != null) {
            l02.setTranslationY(getFabTranslationY());
            l02.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    public void u0(ActionMenuView actionMenuView, int i10, boolean z10) {
        actionMenuView.setTranslationX((float) m0(actionMenuView, i10, z10));
    }

    /* access modifiers changed from: protected */
    public void f0(int i10, List<Animator> list) {
        FloatingActionButton k02 = k0();
        if (k02 != null && !k02.n()) {
            j0();
            k02.l(new b(i10));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.W.D();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().b();
    }

    public int getFabAlignmentMode() {
        return this.f25419c0;
    }

    public int getFabAnimationMode() {
        return this.f25420d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().d();
    }

    public boolean getHideOnScroll() {
        return this.f25421e0;
    }

    /* access modifiers changed from: protected */
    public int m0(ActionMenuView actionMenuView, int i10, boolean z10) {
        boolean z11 = a0.B(this) == 1;
        int measuredWidth = z11 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f834a & 8388615) == 8388611) {
                if (z11) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = measuredWidth - (z11 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i10 != 1 || !z10) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.W);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            e0();
            s0();
        }
        r0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.c());
        this.f25419c0 = gVar.f25445c;
        this.f25424h0 = gVar.f25446d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f25445c = this.f25419c0;
        gVar.f25446d = this.f25424h0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.W, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().f(f10);
            this.W.invalidateSelf();
            s0();
        }
    }

    public void setElevation(float f10) {
        this.W.S(f10);
        getBehavior().G(this, this.W.A() - this.W.z());
    }

    public void setFabAlignmentMode(int i10) {
        q0(i10);
        p0(i10, this.f25424h0);
        this.f25419c0 = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.f25420d0 = i10;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().g(f10);
            this.W.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().i(f10);
            this.W.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f25421e0 = z10;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: package-private */
    public boolean t0(int i10) {
        float f10 = (float) i10;
        if (f10 == getTopEdgeTreatment().e()) {
            return false;
        }
        getTopEdgeTreatment().j(f10);
        this.W.invalidateSelf();
        return true;
    }

    public Behavior getBehavior() {
        if (this.f25425i0 == null) {
            this.f25425i0 = new Behavior();
        }
        return this.f25425i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final Rect f25429e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f25430f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f25431g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f25432h = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f25430f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.f25429e);
                int height = Behavior.this.f25429e.height();
                bottomAppBar.t0(height);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f25431g == 0) {
                    int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(x5.d.mtrl_bottomappbar_fab_bottom_margin);
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f25430f = new WeakReference<>(bottomAppBar);
            View W = bottomAppBar.l0();
            if (W != null && !a0.R(W)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) W.getLayoutParams();
                fVar.f2644d = 49;
                this.f25431g = fVar.bottomMargin;
                if (W instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) W;
                    floatingActionButton.addOnLayoutChangeListener(this.f25432h);
                    bottomAppBar.d0(floatingActionButton);
                }
                bottomAppBar.s0();
            }
            coordinatorLayout.C(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
