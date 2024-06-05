package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.y;
import androidx.core.widget.n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.i;
import java.util.List;
import x5.j;
import y5.h;
import y5.k;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends i implements y, n, h6.a, n6.n {

    /* renamed from: q  reason: collision with root package name */
    private static final int f25721q = j.Widget_Design_FloatingActionButton;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f25722b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f25723c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f25724d;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f25725f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f25726g;

    /* renamed from: h  reason: collision with root package name */
    private int f25727h;

    /* renamed from: i  reason: collision with root package name */
    private int f25728i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f25729j;

    /* renamed from: k  reason: collision with root package name */
    private int f25730k;

    /* renamed from: l  reason: collision with root package name */
    boolean f25731l;

    /* renamed from: m  reason: collision with root package name */
    final Rect f25732m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f25733n;

    /* renamed from: o  reason: collision with root package name */
    private final p f25734o;

    /* renamed from: p  reason: collision with root package name */
    private a f25735p;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.l(coordinatorLayout, floatingActionButton, i10);
        }

        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements a.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f25739a;

        a(b bVar) {
            this.f25739a = bVar;
        }

        public void a() {
            this.f25739a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f25739a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements m6.b {
        c() {
        }

        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public void b(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f25732m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f25729j, i11 + FloatingActionButton.this.f25729j, i12 + FloatingActionButton.this.f25729j, i13 + FloatingActionButton.this.f25729j);
        }

        public boolean c() {
            return FloatingActionButton.this.f25731l;
        }
    }

    class d<T extends FloatingActionButton> implements a.i {

        /* renamed from: a  reason: collision with root package name */
        private final k<T> f25742a;

        d(k<T> kVar) {
            this.f25742a = kVar;
        }

        public void a() {
            this.f25742a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f25742a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f25742a.equals(this.f25742a);
        }

        public int hashCode() {
            return this.f25742a.hashCode();
        }
    }

    private a getImpl() {
        if (this.f25735p == null) {
            this.f25735p = h();
        }
        return this.f25735p;
    }

    private a h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new b(this, new c());
        }
        return new a(this, new c());
    }

    private int k(int i10) {
        int i11 = this.f25728i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(x5.d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(x5.d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    private void p(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f25732m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f25724d;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f25725f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.j.e(colorForState, mode));
        }
    }

    private static int r(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i10, size);
        }
        if (mode == 0) {
            return i10;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private a.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public boolean a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().C(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(k<? extends FloatingActionButton> kVar) {
        getImpl().f(new d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f25722b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f25723c;
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().j();
    }

    public int getCustomSize() {
        return this.f25728i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f25726g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f25726g;
    }

    public n6.k getShapeAppearanceModel() {
        return (n6.k) androidx.core.util.h.f(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f25727h;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return k(this.f25727h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f25724d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f25725f;
    }

    public boolean getUseCompatPadding() {
        return this.f25731l;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!a0.R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().y();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, boolean z10) {
        getImpl().v(u(bVar), z10);
    }

    public boolean n() {
        return getImpl().w();
    }

    public boolean o() {
        return getImpl().x();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f25729j = (sizeDimension - this.f25730k) / 2;
        getImpl().b0();
        int min = Math.min(r(sizeDimension, i10), r(sizeDimension, i11));
        Rect rect = this.f25732m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o6.a aVar = (o6.a) parcelable;
        super.onRestoreInstanceState(aVar.c());
        Bundle bundle = (Bundle) androidx.core.util.h.f(aVar.f29483c.get("expandableWidgetHelper"));
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new o6.a(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !i(this.f25733n) || this.f25733n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f25722b != colorStateList) {
            this.f25722b = colorStateList;
            getImpl().J(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f25723c != mode) {
            this.f25723c = mode;
            getImpl().K(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().L(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().O(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f25728i) {
            this.f25728i = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().c0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().M(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().N(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().a0();
            if (this.f25724d != null) {
                q();
            }
        }
    }

    public void setImageResource(int i10) {
        this.f25734o.i(i10);
        q();
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().G();
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().S(z10);
    }

    public void setShapeAppearanceModel(n6.k kVar) {
        getImpl().T(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().U(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f25728i = 0;
        if (i10 != this.f25727h) {
            this.f25727h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f25724d != colorStateList) {
            this.f25724d = colorStateList;
            q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f25725f != mode) {
            this.f25725f = mode;
            q();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().H();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().H();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().H();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f25731l != z10) {
            this.f25731l = z10;
            getImpl().A();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* access modifiers changed from: package-private */
    public void t(b bVar, boolean z10) {
        getImpl().Y(u(bVar), z10);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f25736a;

        /* renamed from: b  reason: collision with root package name */
        private b f25737b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f25738c;

        public BaseBehavior() {
            this.f25738c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f25732m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i11 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i10 = rect.right;
                } else {
                    i10 = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    a0.Y(floatingActionButton, i11);
                }
                if (i10 != 0) {
                    a0.X(floatingActionButton, i10);
                }
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f25738c && fVar.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f25736a == null) {
                this.f25736a = new Rect();
            }
            Rect rect = this.f25736a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m(this.f25737b, false);
                return true;
            }
            floatingActionButton.t(this.f25737b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m(this.f25737b, false);
                return true;
            }
            floatingActionButton.t(this.f25737b, false);
            return true;
        }

        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f25732m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!F(view)) {
                return false;
            } else {
                L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> l10 = coordinatorLayout.l(floatingActionButton);
            int size = l10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = l10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.C(floatingActionButton, i10);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f2648h == 0) {
                fVar.f2648h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x5.k.R0);
            this.f25738c = obtainStyledAttributes.getBoolean(x5.k.S0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f25726g != colorStateList) {
            this.f25726g = colorStateList;
            getImpl().R(this.f25726g);
        }
    }
}
