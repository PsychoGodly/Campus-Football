package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import x5.j;
import x5.k;
import y5.h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int A = j.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> B;
    static final Property<View, Float> C;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final Rect f25705t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final c f25706u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final c f25707v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final c f25708w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final c f25709x;

    /* renamed from: y  reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f25710y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f25711z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f25717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f25718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f25719c;

        a(c cVar, d dVar) {
            this.f25718b = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f25717a = true;
            this.f25718b.a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f25718b.f();
            if (!this.f25717a) {
                this.f25718b.i(this.f25719c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f25718b.onAnimationStart(animator);
            this.f25717a = false;
        }
    }

    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    public static abstract class d {
    }

    static {
        Class<Float> cls = Float.class;
        B = new b(cls, "width");
        C = new c(cls, "height");
    }

    /* access modifiers changed from: private */
    public void m(c cVar, d dVar) {
        if (!cVar.e()) {
            if (!n()) {
                cVar.c();
                cVar.i(dVar);
                return;
            }
            measure(0, 0);
            AnimatorSet g10 = cVar.g();
            g10.addListener(new a(cVar, dVar));
            for (Animator.AnimatorListener addListener : cVar.h()) {
                g10.addListener(addListener);
            }
            g10.start();
        }
    }

    private boolean n() {
        return a0.R(this) && !isInEditMode();
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f25710y;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(a0.G(this), a0.F(this)) * 2) + getIconSize();
    }

    public h getExtendMotionSpec() {
        return this.f25707v.d();
    }

    public h getHideMotionSpec() {
        return this.f25709x.d();
    }

    public h getShowMotionSpec() {
        return this.f25708w.d();
    }

    public h getShrinkMotionSpec() {
        return this.f25706u.d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25711z && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f25711z = false;
            this.f25706u.c();
        }
    }

    public void setExtendMotionSpec(h hVar) {
        this.f25707v.b(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f25711z != z10) {
            c cVar = z10 ? this.f25707v : this.f25706u;
            if (!cVar.e()) {
                cVar.c();
            }
        }
    }

    public void setHideMotionSpec(h hVar) {
        this.f25709x.b(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    public void setShowMotionSpec(h hVar) {
        this.f25708w.b(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.f25706u.b(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.c(getContext(), i10));
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f25712a;

        /* renamed from: b  reason: collision with root package name */
        private d f25713b;

        /* renamed from: c  reason: collision with root package name */
        private d f25714c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f25715d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f25716e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f25715d = false;
            this.f25716e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i10;
            Rect l10 = extendedFloatingActionButton.f25705t;
            if (l10 != null && l10.centerX() > 0 && l10.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
                int i11 = 0;
                if (extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i10 = l10.right;
                } else {
                    i10 = extendedFloatingActionButton.getLeft() <= fVar.leftMargin ? -l10.left : 0;
                }
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i11 = l10.bottom;
                } else if (extendedFloatingActionButton.getTop() <= fVar.topMargin) {
                    i11 = -l10.top;
                }
                if (i11 != 0) {
                    a0.Y(extendedFloatingActionButton, i11);
                }
                if (i10 != 0) {
                    a0.X(extendedFloatingActionButton, i10);
                }
            }
        }

        private boolean K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f25715d || this.f25716e) && fVar.e() == view.getId()) {
                return true;
            }
            return false;
        }

        private boolean M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!K(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f25712a == null) {
                this.f25712a = new Rect();
            }
            Rect rect = this.f25712a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                L(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!K(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                L(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            c cVar;
            boolean z10 = this.f25716e;
            d dVar = z10 ? this.f25714c : this.f25713b;
            if (z10) {
                cVar = extendedFloatingActionButton.f25707v;
            } else {
                cVar = extendedFloatingActionButton.f25708w;
            }
            extendedFloatingActionButton.m(cVar, dVar);
        }

        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect l10 = extendedFloatingActionButton.f25705t;
            rect.set(extendedFloatingActionButton.getLeft() + l10.left, extendedFloatingActionButton.getTop() + l10.top, extendedFloatingActionButton.getRight() - l10.right, extendedFloatingActionButton.getBottom() - l10.bottom);
            return true;
        }

        /* renamed from: I */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!G(view)) {
                return false;
            } else {
                N(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: J */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> l10 = coordinatorLayout.l(extendedFloatingActionButton);
            int size = l10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = l10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && N(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.C(extendedFloatingActionButton, i10);
            H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            c cVar;
            boolean z10 = this.f25716e;
            d dVar = z10 ? this.f25714c : this.f25713b;
            if (z10) {
                cVar = extendedFloatingActionButton.f25706u;
            } else {
                cVar = extendedFloatingActionButton.f25709x;
            }
            extendedFloatingActionButton.m(cVar, dVar);
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f2648h == 0) {
                fVar.f2648h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.N0);
            this.f25715d = obtainStyledAttributes.getBoolean(k.O0, false);
            this.f25716e = obtainStyledAttributes.getBoolean(k.P0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
