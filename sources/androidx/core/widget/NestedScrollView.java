package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.e;
import androidx.core.view.n;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.core.view.t;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements r, o {
    private static final float C = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final a D = new a();
    private static final int[] E = {16843130};
    private float A;
    private c B;

    /* renamed from: a  reason: collision with root package name */
    private final float f3251a;

    /* renamed from: b  reason: collision with root package name */
    private long f3252b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f3253c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f3254d;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f3255f;

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f3256g;

    /* renamed from: h  reason: collision with root package name */
    private int f3257h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3258i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3259j;

    /* renamed from: k  reason: collision with root package name */
    private View f3260k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3261l;

    /* renamed from: m  reason: collision with root package name */
    private VelocityTracker f3262m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3263n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3264o;

    /* renamed from: p  reason: collision with root package name */
    private int f3265p;

    /* renamed from: q  reason: collision with root package name */
    private int f3266q;

    /* renamed from: r  reason: collision with root package name */
    private int f3267r;

    /* renamed from: s  reason: collision with root package name */
    private int f3268s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f3269t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f3270u;

    /* renamed from: v  reason: collision with root package name */
    private int f3271v;

    /* renamed from: w  reason: collision with root package name */
    private int f3272w;

    /* renamed from: x  reason: collision with root package name */
    private d f3273x;

    /* renamed from: y  reason: collision with root package name */
    private final t f3274y;

    /* renamed from: z  reason: collision with root package name */
    private final p f3275z;

    static class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.a(accessibilityEvent, nestedScrollView.getScrollX());
            e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.X(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.o0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.b(c.a.f3135r);
                    cVar.b(c.a.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.b(c.a.f3134q);
                    cVar.b(c.a.E);
                }
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.P(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.P(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f3276a;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3276a + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3276a);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f3276a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z.a.f24028c);
    }

    private void A(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3275z.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    private void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3268s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3257h = (int) motionEvent.getY(i10);
            this.f3268s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f3262m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void E() {
        VelocityTracker velocityTracker = this.f3262m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3262m = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int F(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3255f
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f3255f
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3255f
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3255f
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f3256g
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f3256g
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3256g
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3256g
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0064
            r3.invalidate()
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.F(int, float):int");
    }

    private void G(boolean z10) {
        if (z10) {
            Q(2, 1);
        } else {
            S(1);
        }
        this.f3272w = getScrollY();
        a0.e0(this);
    }

    private boolean H(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View n10 = n(z11, i11, i12);
        if (n10 == null) {
            n10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            I(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (n10 != findFocus()) {
            n10.requestFocus(i10);
        }
        return z10;
    }

    private int I(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15 = i11;
        int i16 = i12;
        if (i16 == 1) {
            Q(2, i16);
        }
        boolean z11 = false;
        if (h(0, i10, this.f3270u, this.f3269t, i12)) {
            i14 = i10 - this.f3270u[1];
            i13 = this.f3269t[1] + 0;
        } else {
            i14 = i10;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = c() && !z10;
        int i17 = scrollRange;
        boolean z13 = C(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !r(i16);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3270u;
        iArr[1] = 0;
        i(0, scrollY2, 0, i14 - scrollY2, this.f3269t, i12, iArr);
        int i18 = i13 + this.f3269t[1];
        int i19 = i14 - this.f3270u[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                d.d(this.f3255f, ((float) (-i19)) / ((float) getHeight()), ((float) i15) / ((float) getWidth()));
                if (!this.f3256g.isFinished()) {
                    this.f3256g.onRelease();
                }
            }
        } else if (i20 > i17 && z12) {
            d.d(this.f3256g, ((float) i19) / ((float) getHeight()), 1.0f - (((float) i15) / ((float) getWidth())));
            if (!this.f3255f.isFinished()) {
                this.f3255f.onRelease();
            }
        }
        if (!this.f3255f.isFinished() || !this.f3256g.isFinished()) {
            a0.e0(this);
        } else {
            z11 = z13;
        }
        if (z11 && i16 == 0) {
            this.f3262m.clear();
        }
        if (i16 == 1) {
            S(i16);
            this.f3255f.onRelease();
            this.f3256g.onRelease();
        }
        return i18;
    }

    private void J(View view) {
        view.getDrawingRect(this.f3253c);
        offsetDescendantRectToMyCoords(view, this.f3253c);
        int f10 = f(this.f3253c);
        if (f10 != 0) {
            scrollBy(0, f10);
        }
    }

    private boolean K(Rect rect, boolean z10) {
        int f10 = f(rect);
        boolean z11 = f10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f10);
            } else {
                M(0, f10);
            }
        }
        return z11;
    }

    private boolean L(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        if (q(-i10) < d.b(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    private void N(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3252b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3254d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                G(z10);
            } else {
                if (!this.f3254d.isFinished()) {
                    a();
                }
                scrollBy(i10, i11);
            }
            this.f3252b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean R(MotionEvent motionEvent) {
        boolean z10;
        if (d.b(this.f3255f) != 0.0f) {
            d.d(this.f3255f, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.b(this.f3256g) == 0.0f) {
            return z10;
        }
        d.d(this.f3256g, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f3254d.abortAnimation();
        S(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.A;
    }

    private void j(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f3264o) {
            M(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    private boolean k(int i10) {
        if (d.b(this.f3255f) != 0.0f) {
            if (L(this.f3255f, i10)) {
                this.f3255f.onAbsorb(i10);
            } else {
                o(-i10);
            }
        } else if (d.b(this.f3256g) == 0.0f) {
            return false;
        } else {
            int i11 = -i10;
            if (L(this.f3256g, i11)) {
                this.f3256g.onAbsorb(i11);
            } else {
                o(i11);
            }
        }
        return true;
    }

    private void l() {
        this.f3268s = -1;
        this.f3261l = false;
        E();
        S(0);
        this.f3255f.onRelease();
        this.f3256g.onRelease();
    }

    private View n(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float q(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f3251a * 0.015f)));
        float f10 = C;
        return (float) (((double) (this.f3251a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private boolean s(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i11 < childAt.getTop() - scrollY || i11 >= childAt.getBottom() - scrollY || i10 < childAt.getLeft() || i10 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void t() {
        VelocityTracker velocityTracker = this.f3262m;
        if (velocityTracker == null) {
            this.f3262m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void u() {
        this.f3254d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3265p = viewConfiguration.getScaledTouchSlop();
        this.f3266q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3267r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void v() {
        if (this.f3262m == null) {
            this.f3262m = VelocityTracker.obtain();
        }
    }

    private void w(int i10, int i11) {
        this.f3257h = i10;
        this.f3268s = i11;
        Q(2, 0);
    }

    private boolean x(View view) {
        return !z(view, 0, getHeight());
    }

    private static boolean y(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !y((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean z(View view, int i10, int i11) {
        view.getDrawingRect(this.f3253c);
        offsetDescendantRectToMyCoords(view, this.f3253c);
        return this.f3253c.bottom + i10 >= getScrollY() && this.f3253c.top - i10 <= getScrollY() + i11;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.r(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f3254d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.C(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean D(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f3253c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3253c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3253c.top = getScrollY() - height;
            Rect rect2 = this.f3253c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3253c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return H(i10, i11, i12);
    }

    public final void M(int i10, int i11) {
        N(i10, i11, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void O(int i10, int i11, int i12, boolean z10) {
        N(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* access modifiers changed from: package-private */
    public void P(int i10, int i11, boolean z10) {
        O(i10, i11, 250, z10);
    }

    public boolean Q(int i10, int i11) {
        return this.f3275z.q(i10, i11);
    }

    public void S(int i10) {
        this.f3275z.s(i10);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !z(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            I(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f3253c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3253c);
            I(f(this.f3253c), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && x(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f3254d.isFinished()) {
            this.f3254d.computeScrollOffset();
            int currY = this.f3254d.getCurrY();
            int g10 = g(currY - this.f3272w);
            this.f3272w = currY;
            int[] iArr = this.f3270u;
            boolean z10 = false;
            iArr[1] = 0;
            h(0, g10, iArr, (int[]) null, 1);
            int i10 = g10 - this.f3270u[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                C(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.f3270u;
                iArr2[1] = 0;
                i(0, scrollY2, 0, i11, this.f3269t, 1, iArr2);
                i10 = i11 - this.f3270u[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    if (i10 < 0) {
                        if (this.f3255f.isFinished()) {
                            this.f3255f.onAbsorb((int) this.f3254d.getCurrVelocity());
                        }
                    } else if (this.f3256g.isFinished()) {
                        this.f3256g.onAbsorb((int) this.f3254d.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f3254d.isFinished()) {
                a0.e0(this);
            } else {
                S(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3275z.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3275z.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return h(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3275z.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f3255f.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 21 || b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (i12 >= 21 && b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f3255f.setSize(width, height);
            if (this.f3255f.draw(canvas)) {
                a0.e0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f3256g.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 21 || b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = 0 + getPaddingLeft();
            }
            if (i13 >= 21 && b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f3256g.setSize(width2, height2);
            if (this.f3256g.draw(canvas)) {
                a0.e0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i13 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && d.b(this.f3255f) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * d.d(this.f3255f, (((float) (-i10)) * 4.0f) / ((float) height), 0.5f));
            if (round != i10) {
                this.f3255f.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || d.b(this.f3256g) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) height;
            int round2 = Math.round((f10 / 4.0f) * d.d(this.f3256g, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f3256g.finish();
            }
            return i10 - round2;
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f3274y.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean h(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f3275z.d(i10, i11, iArr, iArr2, i12);
    }

    public boolean hasNestedScrollingParent() {
        return r(0);
    }

    public void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f3275z.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3275z.m();
    }

    public boolean m(KeyEvent keyEvent) {
        this.f3253c.setEmpty();
        int i10 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i10 = 33;
                    }
                    D(i10);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return b(130);
                } else {
                    return p(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return b(33);
            } else {
                return p(33);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void o(int i10) {
        if (getChildCount() > 0) {
            this.f3254d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER, 0, 0);
            G(true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3259j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (motionEvent.getAction() != 8 || this.f3261l) {
            return false;
        }
        if (n.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (n.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            f10 = 0.0f;
            i10 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        I(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, n.a(motionEvent, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f3261l) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f3268s;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f3257h) > this.f3265p && (2 & getNestedScrollAxes()) == 0) {
                                this.f3261l = true;
                                this.f3257h = y10;
                                v();
                                this.f3262m.addMovement(motionEvent);
                                this.f3271v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        B(motionEvent);
                    }
                }
            }
            this.f3261l = false;
            this.f3268s = -1;
            E();
            if (this.f3254d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                a0.e0(this);
            }
            S(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!s((int) motionEvent.getX(), y11)) {
                if (!R(motionEvent) && this.f3254d.isFinished()) {
                    z10 = false;
                }
                this.f3261l = z10;
                E();
            } else {
                this.f3257h = y11;
                this.f3268s = motionEvent.getPointerId(0);
                t();
                this.f3262m.addMovement(motionEvent);
                this.f3254d.computeScrollOffset();
                if (!R(motionEvent) && this.f3254d.isFinished()) {
                    z10 = false;
                }
                this.f3261l = z10;
                Q(2, 0);
            }
        }
        return this.f3261l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f3258i = false;
        View view = this.f3260k;
        if (view != null && y(view, this)) {
            J(this.f3260k);
        }
        this.f3260k = null;
        if (!this.f3259j) {
            if (this.f3273x != null) {
                scrollTo(getScrollX(), this.f3273x.f3276a);
                this.f3273x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e10 = e(scrollY, paddingTop, i14);
            if (e10 != scrollY) {
                scrollTo(getScrollX(), e10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3259j = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3263n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        o((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        h(i10, i11, iArr, (int[]) null, i12);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        A(i13, i14, iArr);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f3274y.c(view, view2, i10, i11);
        Q(2, i11);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i10);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !x(view)) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f3273x = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f3276a = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.B;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && z(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f3253c);
            offsetDescendantRectToMyCoords(findFocus, this.f3253c);
            j(f(this.f3253c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void onStopNestedScroll(View view, int i10) {
        this.f3274y.e(view, i10);
        S(i10);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        v();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3271v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f3271v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3262m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3267r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3268s);
                if (Math.abs(yVelocity) >= this.f3266q) {
                    if (!k(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = (float) i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            o(i10);
                        }
                    }
                } else if (this.f3254d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    a0.e0(this);
                }
                l();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3268s);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3268s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f3257h - y10;
                    int F = i11 - F(i11, motionEvent.getX(findPointerIndex));
                    if (!this.f3261l && Math.abs(F) > this.f3265p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3261l = true;
                        F = F > 0 ? F - this.f3265p : F + this.f3265p;
                    }
                    if (this.f3261l) {
                        int I = I(F, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f3257h = y10 - I;
                        this.f3271v += I;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3261l && getChildCount() > 0 && this.f3254d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    a0.e0(this);
                }
                l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3257h = (int) motionEvent.getY(actionIndex);
                this.f3268s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                B(motionEvent);
                this.f3257h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3268s));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f3261l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3254d.isFinished()) {
                a();
            }
            w((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f3262m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean p(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f3253c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3253c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3253c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3253c;
        return H(i10, rect3.top, rect3.bottom);
    }

    public boolean r(int i10) {
        return this.f3275z.l(i10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3258i) {
            J(view2);
        } else {
            this.f3260k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return K(rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            E();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.f3258i = true;
        super.requestLayout();
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e10 = e(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e11 = e(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e10 != getScrollX() || e11 != getScrollY()) {
                super.scrollTo(e10, e11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f3263n) {
            this.f3263n = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.f3275z.n(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.B = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f3264o = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return Q(i10, 0);
    }

    public void stopNestedScroll() {
        S(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3253c = new Rect();
        this.f3258i = true;
        this.f3259j = false;
        this.f3260k = null;
        this.f3261l = false;
        this.f3264o = true;
        this.f3268s = -1;
        this.f3269t = new int[2];
        this.f3270u = new int[2];
        this.f3255f = d.a(context, attributeSet);
        this.f3256g = d.a(context, attributeSet);
        this.f3251a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3274y = new t(this);
        this.f3275z = new p(this);
        setNestedScrollingEnabled(true);
        a0.n0(this, D);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        A(i13, i14, (int[]) null);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        A(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
