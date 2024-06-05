package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.k0;
import androidx.core.view.o;
import java.lang.ref.WeakReference;
import java.util.List;
import n6.g;
import n6.h;
import x5.d;
import x5.k;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f25336a;

    /* renamed from: b  reason: collision with root package name */
    private int f25337b;

    /* renamed from: c  reason: collision with root package name */
    private int f25338c;

    /* renamed from: d  reason: collision with root package name */
    private int f25339d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25340f;

    /* renamed from: g  reason: collision with root package name */
    private int f25341g;

    /* renamed from: h  reason: collision with root package name */
    private k0 f25342h;

    /* renamed from: i  reason: collision with root package name */
    private List<b> f25343i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f25344j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25345k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25346l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25347m;

    /* renamed from: n  reason: collision with root package name */
    private int f25348n;

    /* renamed from: o  reason: collision with root package name */
    private WeakReference<View> f25349o;

    /* renamed from: p  reason: collision with root package name */
    private ValueAnimator f25350p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f25351q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f25352r;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        public /* bridge */ /* synthetic */ boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                a0.Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f25353k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.j()) {
                    appBarLayout.p(appBarLayout.r(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i10)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout Q = H(coordinatorLayout.l(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f25380d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.m(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f30996w2);
            O(obtainStyledAttributes.getDimensionPixelSize(k.f31001x2, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f25366a;

        a(g gVar) {
            this.f25366a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25366a.S(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    private void a() {
        WeakReference<View> weakReference = this.f25349o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f25349o = null;
    }

    private View b(View view) {
        int i10;
        if (this.f25349o == null && (i10 = this.f25348n) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f25348n);
            }
            if (findViewById != null) {
                this.f25349o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f25349o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((c) getChildAt(i10).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void i() {
        this.f25337b = -1;
        this.f25338c = -1;
        this.f25339d = -1;
    }

    private void n(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.f25341g = i11 | i10;
        requestLayout();
    }

    private boolean o(boolean z10) {
        if (this.f25345k == z10) {
            return false;
        }
        this.f25345k = z10;
        refreshDrawableState();
        return true;
    }

    private boolean q() {
        return this.f25352r != null && getTopInset() > 0;
    }

    private boolean s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || a0.y(childAt)) {
            return false;
        }
        return true;
    }

    private void t(g gVar, boolean z10) {
        float dimension = getResources().getDimension(d.design_appbar_elevation);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f25350p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, dimension});
        this.f25350p = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(x5.g.app_bar_elevation_anim_duration));
        this.f25350p.setInterpolator(y5.a.f31291a);
        this.f25350p.addUpdateListener(new a(gVar));
        this.f25350p.start();
    }

    private void u() {
        setWillNotDraw(!q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public c generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* renamed from: d */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (q()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f25336a));
            this.f25352r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f25352r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f25340f;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i10;
        int C;
        int i11 = this.f25338c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = cVar.f25368a;
            if ((i13 & 5) == 5) {
                int i14 = cVar.topMargin + cVar.bottomMargin;
                if ((i13 & 8) != 0) {
                    C = a0.C(childAt);
                } else if ((i13 & 2) != 0) {
                    C = measuredHeight - a0.C(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && a0.y(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + C;
                i10 = Math.min(i10, measuredHeight - getTopInset());
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f25338c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i10 = this.f25339d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + cVar.topMargin + cVar.bottomMargin;
            int i13 = cVar.f25368a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= a0.C(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f25339d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f25348n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = a0.C(this);
        if (C == 0) {
            int childCount = getChildCount();
            C = childCount >= 1 ? a0.C(getChildAt(childCount - 1)) : 0;
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f25341g;
    }

    public Drawable getStatusBarForeground() {
        return this.f25352r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        k0 k0Var = this.f25342h;
        if (k0Var != null) {
            return k0Var.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f25337b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = cVar.f25368a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + cVar.topMargin + cVar.bottomMargin;
            if (i11 == 0 && a0.y(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= a0.C(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f25337b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return getTotalScrollRange() != 0;
    }

    public boolean j() {
        return this.f25347m;
    }

    /* access modifiers changed from: package-private */
    public void k(int i10) {
        this.f25336a = i10;
        if (!willNotDraw()) {
            a0.e0(this);
        }
        List<b> list = this.f25343i;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f25343i.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f25341g = 0;
    }

    public void m(boolean z10, boolean z11) {
        n(z10, z11, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        if (this.f25351q == null) {
            this.f25351q = new int[4];
        }
        int[] iArr = this.f25351q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f25345k;
        int i11 = x5.b.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (!z10 || !this.f25346l) ? -x5.b.state_lifted : x5.b.state_lifted;
        int i12 = x5.b.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (!z10 || !this.f25346l) ? -x5.b.state_collapsed : x5.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (a0.y(this) && s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                a0.Y(getChildAt(childCount), topInset);
            }
        }
        i();
        this.f25340f = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((c) getChildAt(i14).getLayoutParams()).b() != null) {
                this.f25340f = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f25352r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f25344j) {
            if (!this.f25347m && !g()) {
                z11 = false;
            }
            o(z11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && a0.y(this) && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = b0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        i();
    }

    /* access modifiers changed from: package-private */
    public boolean p(boolean z10) {
        if (this.f25346l == z10) {
            return false;
        }
        this.f25346l = z10;
        refreshDrawableState();
        if (!this.f25347m || !(getBackground() instanceof g)) {
            return true;
        }
        t((g) getBackground(), z10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        View b10 = b(view);
        if (b10 != null) {
            view = b10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        m(z10, a0.R(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f25347m = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f25348n = i10;
        a();
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f25352r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f25352r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f25352r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f25352r, a0.B(this));
                this.f25352r.setVisible(getVisibility() == 0, false);
                this.f25352r.setCallback(this);
            }
            u();
            a0.e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(i.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this, f10);
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f25352r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25352r;
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f25353k;

        /* renamed from: l  reason: collision with root package name */
        private int f25354l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f25355m;

        /* renamed from: n  reason: collision with root package name */
        private int f25356n = -1;

        /* renamed from: o  reason: collision with root package name */
        private boolean f25357o;

        /* renamed from: p  reason: collision with root package name */
        private float f25358p;

        /* renamed from: q  reason: collision with root package name */
        private WeakReference<View> f25359q;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f25360a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f25361b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f25360a = coordinatorLayout;
                this.f25361b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f25360a, this.f25361b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int i11;
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                i11 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i11 = (int) (((((float) abs) / ((float) t10.getHeight())) + 1.0f) * 150.0f);
            }
            T(coordinatorLayout, t10, i10, i11);
        }

        private void T(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int M = M();
            if (M == i10) {
                ValueAnimator valueAnimator = this.f25355m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f25355m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f25355m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f25355m = valueAnimator3;
                valueAnimator3.setInterpolator(y5.a.f31295e);
                this.f25355m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f25355m.setDuration((long) Math.min(i11, 600));
            this.f25355m.setIntValues(new int[]{M, i10});
            this.f25355m.start();
        }

        private boolean V(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.h() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean W(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private View X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View Y(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int Z(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (W(cVar.a(), 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private int c0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                c cVar = (c) childAt.getLayoutParams();
                Interpolator b10 = cVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (b10 != null) {
                    int a10 = cVar.a();
                    if ((a10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + cVar.topMargin + cVar.bottomMargin;
                        if ((a10 & 2) != 0) {
                            i11 -= a0.C(childAt);
                        }
                    }
                    if (a0.y(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = (float) i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * b10.getInterpolation(((float) (abs - childAt.getTop())) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean n0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> m10 = coordinatorLayout.m(t10);
            int size = m10.size();
            int i10 = 0;
            while (i10 < size) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) m10.get(i10).getLayoutParams()).f();
                if (!(f10 instanceof ScrollingViewBehavior)) {
                    i10++;
                } else if (((ScrollingViewBehavior) f10).K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        private void o0(CoordinatorLayout coordinatorLayout, T t10) {
            int M = M();
            int Z = Z(t10, M);
            if (Z >= 0) {
                View childAt = t10.getChildAt(Z);
                c cVar = (c) childAt.getLayoutParams();
                int a10 = cVar.a();
                if ((a10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (Z == t10.getChildCount() - 1) {
                        i11 += t10.getTopInset();
                    }
                    if (W(a10, 2)) {
                        i11 += a0.C(childAt);
                    } else if (W(a10, 5)) {
                        int C = a0.C(childAt) + i11;
                        if (M < C) {
                            i10 = C;
                        } else {
                            i11 = C;
                        }
                    }
                    if (W(a10, 32)) {
                        i10 += cVar.topMargin;
                        i11 -= cVar.bottomMargin;
                    }
                    if (M < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    S(coordinatorLayout, t10, b0.a.b(i10, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void p0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View Y = Y(t10, i10);
            if (Y != null) {
                int a10 = ((c) Y.getLayoutParams()).a();
                boolean z11 = false;
                if ((a10 & 1) != 0) {
                    int C = a0.C(Y);
                    if (i11 <= 0 || (a10 & 12) == 0 ? !((a10 & 2) == 0 || (-i10) < (Y.getBottom() - C) - t10.getTopInset()) : (-i10) >= (Y.getBottom() - C) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
                if (t10.j()) {
                    z11 = t10.r(X(coordinatorLayout));
                }
                boolean p10 = t10.p(z11);
                if (z10 || (p10 && n0(coordinatorLayout, t10))) {
                    t10.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int M() {
            return E() + this.f25353k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean H(T t10) {
            WeakReference<View> weakReference = this.f25359q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public int K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public int L(T t10) {
            return t10.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public void N(CoordinatorLayout coordinatorLayout, T t10) {
            o0(coordinatorLayout, t10);
            if (t10.j()) {
                t10.p(t10.r(X(coordinatorLayout)));
            }
        }

        /* renamed from: e0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            int i11;
            boolean l10 = super.l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            int i12 = this.f25356n;
            if (i12 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t10.getChildAt(i12);
                int i13 = -childAt.getBottom();
                if (this.f25357o) {
                    i11 = a0.C(childAt) + t10.getTopInset();
                } else {
                    i11 = Math.round(((float) childAt.getHeight()) * this.f25358p);
                }
                P(coordinatorLayout, t10, i13 + i11);
            } else if (pendingAction != 0) {
                boolean z10 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i14 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        S(coordinatorLayout, t10, i14, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, i14);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        S(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.l();
            this.f25356n = -1;
            G(b0.a.b(E(), -t10.getTotalScrollRange(), 0));
            p0(coordinatorLayout, t10, E(), 0, true);
            t10.k(E());
            return l10;
        }

        /* renamed from: f0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((CoordinatorLayout.f) t10.getLayoutParams()).height != -2) {
                return super.m(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.D(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* renamed from: g0 */
        public void q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    int i15 = -t10.getTotalScrollRange();
                    i14 = i15;
                    i13 = t10.getDownNestedPreScrollRange() + i15;
                } else {
                    i14 = -t10.getUpNestedPreScrollRange();
                    i13 = 0;
                }
                if (i14 != i13) {
                    iArr[1] = O(coordinatorLayout, t10, i11, i14, i13);
                }
            }
            if (t10.j()) {
                t10.p(t10.r(view));
            }
        }

        /* renamed from: h0 */
        public void t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: i0 */
        public void x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.x(coordinatorLayout, t10, bVar.c());
                this.f25356n = bVar.f25363c;
                this.f25358p = bVar.f25364d;
                this.f25357o = bVar.f25365f;
                return;
            }
            super.x(coordinatorLayout, t10, parcelable);
            this.f25356n = -1;
        }

        /* renamed from: j0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable y10 = super.y(coordinatorLayout, t10);
            int E = E();
            int childCount = t10.getChildCount();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i10++;
                } else {
                    b bVar = new b(y10);
                    bVar.f25363c = i10;
                    if (bottom == a0.C(childAt) + t10.getTopInset()) {
                        z10 = true;
                    }
                    bVar.f25365f = z10;
                    bVar.f25364d = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return y10;
        }

        /* renamed from: k0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.j() || V(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f25355m) != null) {
                valueAnimator.cancel();
            }
            this.f25359q = null;
            this.f25354l = i11;
            return z10;
        }

        /* renamed from: l0 */
        public void C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f25354l == 0 || i10 == 1) {
                o0(coordinatorLayout, t10);
                if (t10.j()) {
                    t10.p(t10.r(view));
                }
            }
            this.f25359q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int M = M();
            int i13 = 0;
            if (i11 == 0 || M < i11 || M > i12) {
                this.f25353k = 0;
            } else {
                int b10 = b0.a.b(i10, i11, i12);
                if (M != b10) {
                    int c02 = t10.f() ? c0(t10, b10) : b10;
                    boolean G = G(c02);
                    i13 = M - b10;
                    this.f25353k = b10 - c02;
                    if (!G && t10.f()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.k(E());
                    p0(coordinatorLayout, t10, b10, b10 < M ? -1 : 1, false);
                }
            }
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class b extends e0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            int f25363c;

            /* renamed from: d  reason: collision with root package name */
            float f25364d;

            /* renamed from: f  reason: collision with root package name */
            boolean f25365f;

            static class a implements Parcelable.ClassLoaderCreator<b> {
                a() {
                }

                /* renamed from: a */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                /* renamed from: c */
                public b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f25363c = parcel.readInt();
                this.f25364d = parcel.readFloat();
                this.f25365f = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.f25363c);
                parcel.writeFloat(this.f25364d);
                parcel.writeByte(this.f25365f ? (byte) 1 : 0);
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f25368a = 1;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f25369b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f30936m);
            this.f25368a = obtainStyledAttributes.getInt(k.f30942n, 0);
            int i10 = k.f30948o;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f25369b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f25368a;
        }

        public Interpolator b() {
            return this.f25369b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i10 = this.f25368a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
