package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import androidx.core.view.k0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.t;
import androidx.core.view.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements q, r {

    /* renamed from: v  reason: collision with root package name */
    static final String f2614v;

    /* renamed from: w  reason: collision with root package name */
    static final Class<?>[] f2615w = {Context.class, AttributeSet.class};

    /* renamed from: x  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f2616x = new ThreadLocal<>();

    /* renamed from: y  reason: collision with root package name */
    static final Comparator<View> f2617y;

    /* renamed from: z  reason: collision with root package name */
    private static final androidx.core.util.e<Rect> f2618z = new androidx.core.util.g(12);

    /* renamed from: a  reason: collision with root package name */
    private final List<View> f2619a;

    /* renamed from: b  reason: collision with root package name */
    private final a<View> f2620b;

    /* renamed from: c  reason: collision with root package name */
    private final List<View> f2621c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f2622d;

    /* renamed from: f  reason: collision with root package name */
    private Paint f2623f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f2624g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f2625h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2626i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2627j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f2628k;

    /* renamed from: l  reason: collision with root package name */
    private View f2629l;

    /* renamed from: m  reason: collision with root package name */
    private View f2630m;

    /* renamed from: n  reason: collision with root package name */
    private g f2631n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2632o;

    /* renamed from: p  reason: collision with root package name */
    private k0 f2633p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2634q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f2635r;

    /* renamed from: s  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f2636s;

    /* renamed from: t  reason: collision with root package name */
    private u f2637t;

    /* renamed from: u  reason: collision with root package name */
    private final t f2638u;

    class a implements u {
        a() {
        }

        public k0 a(View view, k0 k0Var) {
            return CoordinatorLayout.this.Q(k0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, v10, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v10) {
            return d(coordinatorLayout, v10) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public k0 f(CoordinatorLayout coordinatorLayout, V v10, k0 k0Var) {
            return k0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2636s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2636s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.B(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float L = a0.L(view);
            float L2 = a0.L(view2);
            if (L > L2) {
                return -1;
            }
            return L < L2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f2614v = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f2617y = r0
            goto L_0x0021
        L_0x001f:
            f2617y = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f2615w = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f2616x = r0
            androidx.core.util.g r0 = new androidx.core.util.g
            r1 = 12
            r0.<init>(r1)
            f2618z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, y.a.coordinatorLayoutStyle);
    }

    static c E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2614v;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f2616x;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2615w);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean F(MotionEvent motionEvent, int i10) {
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2621c;
        t(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if ((!z10 && !z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i11 == 0) {
                        z10 = f10.k(this, view, motionEvent2);
                    } else if (i11 == 1) {
                        z10 = f10.D(this, view, motionEvent2);
                    }
                    if (z10) {
                        this.f2629l = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i13 = fVar.i(this, view);
                z11 = i13 && !c10;
                if (i13 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    f10.k(this, view, motionEvent3);
                } else if (i11 == 1) {
                    f10.D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z10;
    }

    private void G() {
        this.f2619a.clear();
        this.f2620b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f s10 = s(childAt);
            s10.d(this, childAt);
            this.f2620b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (s10.b(this, childAt, childAt2)) {
                        if (!this.f2620b.d(childAt2)) {
                            this.f2620b.b(childAt2);
                        }
                        this.f2620b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2619a.addAll(this.f2620b.i());
        Collections.reverse(this.f2619a);
    }

    private static void I(Rect rect) {
        rect.setEmpty();
        f2618z.a(rect);
    }

    private void K(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.k(this, childAt, obtain);
                } else {
                    f10.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f2629l = null;
        this.f2626i = false;
    }

    private static int L(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int M(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void O(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2649i;
        if (i11 != i10) {
            a0.X(view, i10 - i11);
            fVar.f2649i = i10;
        }
    }

    private void P(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2650j;
        if (i11 != i10) {
            a0.Y(view, i10 - i11);
            fVar.f2650j = i10;
        }
    }

    private void R() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (a0.y(this)) {
                if (this.f2637t == null) {
                    this.f2637t = new a();
                }
                a0.z0(this, this.f2637t);
                setSystemUiVisibility(1280);
                return;
            }
            a0.z0(this, (u) null);
        }
    }

    private static Rect a() {
        Rect b10 = f2618z.b();
        return b10 == null ? new Rect() : b10;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private k0 e(k0 k0Var) {
        c f10;
        if (k0Var.n()) {
            return k0Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (a0.y(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                k0Var = f10.f(this, childAt, k0Var);
                if (k0Var.n()) {
                    break;
                }
            }
        }
        return k0Var;
    }

    private void p(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14;
        int b10 = androidx.core.view.e.b(L(fVar.f2643c), i10);
        int b11 = androidx.core.view.e.b(M(fVar.f2644d), i10);
        int i15 = b10 & 7;
        int i16 = b10 & 112;
        int i17 = b11 & 7;
        int i18 = b11 & 112;
        if (i17 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i17 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i18 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i18 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i15 == 1) {
            i13 -= i11 / 2;
        } else if (i15 != 5) {
            i13 -= i11;
        }
        if (i16 == 16) {
            i14 -= i12 / 2;
        } else if (i16 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    private int q(int i10) {
        int[] iArr = this.f2628k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    private void t(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2617y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean u(View view) {
        return this.f2620b.j(view);
    }

    private void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f2633p != null && a0.y(this) && !a0.y(view)) {
            a10.left += this.f2633p.i();
            a10.top += this.f2633p.k();
            a10.right -= this.f2633p.j();
            a10.bottom -= this.f2633p.h();
        }
        Rect a11 = a();
        androidx.core.view.e.a(M(fVar.f2643c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        I(a10);
        I(a11);
    }

    private void x(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            n(view2, a10);
            o(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            I(a10);
            I(a11);
        }
    }

    private void y(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = androidx.core.view.e.b(N(fVar.f2643c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int q10 = q(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            q10 += measuredWidth / 2;
        } else if (i12 == 5) {
            q10 += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(q10, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void z(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (a0.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.b(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            I(a11);
            if (a10.isEmpty()) {
                I(a10);
                return;
            }
            int b10 = androidx.core.view.e.b(fVar.f2648h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - fVar.topMargin) - fVar.f2650j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                P(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - fVar.bottomMargin) + fVar.f2650j) < (i14 = rect.bottom)) {
                P(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                P(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - fVar.leftMargin) - fVar.f2649i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                O(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - fVar.rightMargin) + fVar.f2649i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                O(view, width - i11);
            }
            if (!z12) {
                O(view, 0);
            }
            I(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void A(View view, int i10) {
        c f10;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f2651k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            n(fVar.f2651k, a10);
            boolean z10 = false;
            k(view2, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = measuredHeight;
            p(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            if (!(a12.left == a11.left && a12.top == a11.top)) {
                z10 = true;
            }
            d(fVar, a12, measuredWidth, i11);
            int i12 = a12.left - a11.left;
            int i13 = a12.top - a11.top;
            if (i12 != 0) {
                a0.X(view2, i12);
            }
            if (i13 != 0) {
                a0.Y(view2, i13);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.h(this, view2, fVar.f2651k);
            }
            I(a10);
            I(a11);
            I(a12);
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(int i10) {
        boolean z10;
        int i11 = i10;
        int B = a0.B(this);
        int size = this.f2619a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f2619a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f2652l == this.f2619a.get(i13)) {
                        A(view, B);
                    }
                }
                k(view, true, a11);
                if (fVar.f2647g != 0 && !a11.isEmpty()) {
                    int b10 = androidx.core.view.e.b(fVar.f2647g, B);
                    int i14 = b10 & 112;
                    if (i14 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i14 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i15 = b10 & 7;
                    if (i15 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i15 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f2648h != 0 && view.getVisibility() == 0) {
                    z(view, a10, B);
                }
                if (i11 != 2) {
                    r(view, a12);
                    if (!a12.equals(a11)) {
                        H(view, a11);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = this.f2619a.get(i16);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i11 != 0 || !fVar2.g()) {
                            if (i11 != 2) {
                                z10 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i11 == 1) {
                                fVar2.p(z10);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        I(a10);
        I(a11);
        I(a12);
    }

    public void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f2651k;
            if (view2 != null) {
                x(view, view2, i10);
                return;
            }
            int i11 = fVar.f2645e;
            if (i11 >= 0) {
                y(view, i11, i10);
            } else {
                w(view, i10);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void D(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void H(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    /* access modifiers changed from: package-private */
    public void J() {
        if (this.f2627j && this.f2631n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2631n);
        }
        this.f2632o = false;
    }

    /* access modifiers changed from: package-private */
    public final k0 Q(k0 k0Var) {
        if (androidx.core.util.c.a(this.f2633p, k0Var)) {
            return k0Var;
        }
        this.f2633p = k0Var;
        boolean z10 = true;
        boolean z11 = k0Var != null && k0Var.k() > 0;
        this.f2634q = z11;
        if (z11 || getBackground() != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        k0 e10 = e(k0Var);
        requestLayout();
        return e10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f2627j) {
            if (this.f2631n == null) {
                this.f2631n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2631n);
        }
        this.f2632o = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f2641a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f2623f == null) {
                    this.f2623f = new Paint();
                }
                this.f2623f.setColor(fVar.f2641a.c(this, view));
                this.f2623f.setAlpha(c(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2623f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2635r;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void f(View view) {
        List g10 = this.f2620b.g(view);
        if (g10 != null && !g10.isEmpty()) {
            for (int i10 = 0; i10 < g10.size(); i10++) {
                View view2 = (View) g10.get(i10);
                c f10 = ((f) view2.getLayoutParams()).f();
                if (f10 != null) {
                    f10.h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (u(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 == this.f2632o) {
            return;
        }
        if (z10) {
            b();
        } else {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        G();
        return Collections.unmodifiableList(this.f2619a);
    }

    public final k0 getLastWindowInsets() {
        return this.f2633p;
    }

    public int getNestedScrollAxes() {
        return this.f2638u.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2635r;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    /* renamed from: i */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void k(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> l(View view) {
        List<View> h10 = this.f2620b.h(view);
        this.f2622d.clear();
        if (h10 != null) {
            this.f2622d.addAll(h10);
        }
        return this.f2622d;
    }

    public List<View> m(View view) {
        List g10 = this.f2620b.g(view);
        this.f2622d.clear();
        if (g10 != null) {
            this.f2622d.addAll(g10);
        }
        return this.f2622d;
    }

    /* access modifiers changed from: package-private */
    public void n(View view, Rect rect) {
        b.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void o(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        p(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        K(false);
        if (this.f2632o) {
            if (this.f2631n == null) {
                this.f2631n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2631n);
        }
        if (this.f2633p == null && a0.y(this)) {
            a0.k0(this);
        }
        this.f2627j = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(false);
        if (this.f2632o && this.f2631n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2631n);
        }
        View view = this.f2630m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2627j = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2634q && this.f2635r != null) {
            k0 k0Var = this.f2633p;
            int k10 = k0Var != null ? k0Var.k() : 0;
            if (k10 > 0) {
                this.f2635r.setBounds(0, 0, getWidth(), k10);
                this.f2635r.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K(true);
        }
        boolean F = F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            K(true);
        }
        return F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int B = a0.B(this);
        int size = this.f2619a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f2619a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, B))) {
                C(view, B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.G()
            r30.g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.a0.B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.k0 r3 = r7.f2633p
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.a0.y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2619a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f2619a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f2645e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.q(r0)
            int r11 = r1.f2643c
            int r11 = N(r11)
            int r11 = androidx.core.view.e.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.a0.y(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.k0 r0 = r7.f2633p
            int r0 = r0.i()
            androidx.core.view.k0 r2 = r7.f2633p
            int r2 = r2.j()
            int r0 = r0 + r2
            androidx.core.view.k0 r2 = r7.f2633p
            int r2 = r2.k()
            androidx.core.view.k0 r11 = r7.f2633p
            int r11 = r11.h()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.D(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            B(1);
        }
        return z11;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.c());
        SparseArray<Parcelable> sparseArray = hVar.f2660c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = s(childAt).f();
            if (!(id2 == -1 || f10 == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                f10.x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (!(id2 == -1 || f10 == null || (y10 = f10.y(this, childAt)) == null)) {
                sparseArray.append(id2, y10);
            }
        }
        hVar.f2660c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2629l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.F(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2629l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2629l
            boolean r6 = r6.D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2629l
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.K(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void r(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f2626i) {
            K(false);
            this.f2626i = true;
        }
    }

    /* access modifiers changed from: package-private */
    public f s(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f2642b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f2642b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f2642b = true;
            }
        }
        return fVar;
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        R();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2636s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2635r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2635r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2635r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f2635r, a0.B(this));
                this.f2635r.setVisible(getVisibility() == 0, false);
                this.f2635r.setCallback(this);
            }
            a0.e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.getDrawable(getContext(), i10) : null);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2635r;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f2635r.setVisible(z10, false);
        }
    }

    public boolean v(View view, int i10, int i11) {
        Rect a10 = a();
        n(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            I(a10);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2635r;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArray;
        this.f2619a = new ArrayList();
        this.f2620b = new a<>();
        this.f2621c = new ArrayList();
        this.f2622d = new ArrayList();
        this.f2624g = new int[2];
        this.f2625h = new int[2];
        this.f2638u = new t(this);
        if (i10 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, y.c.f23698b, 0, y.b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, y.c.f23698b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, y.c.f23698b, attributeSet, typedArray, 0, y.b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, y.c.f23698b, attributeSet, typedArray, i10, 0);
            }
        }
        int resourceId = typedArray.getResourceId(y.c.f23699c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2628k = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2628k.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f2628k;
                iArr[i11] = (int) (((float) iArr[i11]) * f10);
            }
        }
        this.f2635r = typedArray.getDrawable(y.c.f23700d);
        typedArray.recycle();
        R();
        super.setOnHierarchyChangeListener(new e());
        if (a0.z(this) == 0) {
            a0.x0(this, 1);
        }
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int i13;
        int i14;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f2624g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2624g;
                    if (i10 > 0) {
                        i13 = Math.max(i15, iArr3[0]);
                    } else {
                        i13 = Math.min(i15, iArr3[0]);
                    }
                    i15 = i13;
                    int[] iArr4 = this.f2624g;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr4[1]);
                    } else {
                        i14 = Math.min(i16, iArr4[1]);
                    }
                    i16 = i14;
                    z10 = true;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        if (z10) {
            B(1);
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f2625h);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        c f10;
        this.f2638u.c(view, view2, i10, i11);
        this.f2630m = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean A = f10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A;
                    fVar.r(i12, A);
                } else {
                    fVar.r(i12, false);
                }
            }
        }
        return z10;
    }

    public void onStopNestedScroll(View view, int i10) {
        this.f2638u.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.C(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f2630m = null;
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        int i15;
        int i16;
        int childCount = getChildCount();
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f2624g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f2624g;
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr3[0]);
                    } else {
                        i15 = Math.min(i17, iArr3[0]);
                    }
                    i17 = i15;
                    if (i13 > 0) {
                        i16 = Math.max(i18, this.f2624g[1]);
                    } else {
                        i16 = Math.min(i18, this.f2624g[1]);
                    }
                    i18 = i16;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (z10) {
            B(1);
        }
    }

    protected static class h extends e0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray<Parcelable> f2660c;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2660c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2660c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f2660c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2660c.keyAt(i11);
                parcelableArr[i11] = this.f2660c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f2641a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2642b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f2643c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2644d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f2645e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f2646f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2647g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2648h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f2649i;

        /* renamed from: j  reason: collision with root package name */
        int f2650j;

        /* renamed from: k  reason: collision with root package name */
        View f2651k;

        /* renamed from: l  reason: collision with root package name */
        View f2652l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f2653m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f2654n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f2655o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f2656p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f2657q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        Object f2658r;

        public f(int i10, int i11) {
            super(i10, i11);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2646f);
            this.f2651k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f2652l = null;
                            this.f2651k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2652l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f2652l = null;
                    this.f2651k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f2652l = null;
                this.f2651k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2646f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i10) {
            int b10 = androidx.core.view.e.b(((f) view.getLayoutParams()).f2647g, i10);
            return b10 != 0 && (androidx.core.view.e.b(this.f2648h, i10) & b10) == b10;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2651k.getId() != this.f2646f) {
                return false;
            }
            View view2 = this.f2651k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2652l = null;
                    this.f2651k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2652l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f2651k == null && this.f2646f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f2641a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f2652l
                if (r4 == r0) goto L_0x001b
                int r0 = androidx.core.view.a0.B(r2)
                boolean r0 = r1.s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2641a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.f.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f2641a == null) {
                this.f2653m = false;
            }
            return this.f2653m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2646f == -1) {
                this.f2652l = null;
                this.f2651k = null;
                return null;
            }
            if (this.f2651k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f2651k;
        }

        public int e() {
            return this.f2646f;
        }

        public c f() {
            return this.f2641a;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.f2656p;
        }

        /* access modifiers changed from: package-private */
        public Rect h() {
            return this.f2657q;
        }

        /* access modifiers changed from: package-private */
        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2653m;
            if (z10) {
                return true;
            }
            c cVar = this.f2641a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f2653m = a10;
            return a10;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f2654n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2655o;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.f2656p = false;
        }

        /* access modifiers changed from: package-private */
        public void l(int i10) {
            r(i10, false);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f2653m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f2641a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f2641a = cVar;
                this.f2658r = null;
                this.f2642b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(boolean z10) {
            this.f2656p = z10;
        }

        /* access modifiers changed from: package-private */
        public void q(Rect rect) {
            this.f2657q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2654n = z10;
            } else if (i10 == 1) {
                this.f2655o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.c.f23701e);
            this.f2643c = obtainStyledAttributes.getInteger(y.c.f23702f, 0);
            this.f2646f = obtainStyledAttributes.getResourceId(y.c.f23703g, -1);
            this.f2644d = obtainStyledAttributes.getInteger(y.c.f23704h, 0);
            this.f2645e = obtainStyledAttributes.getInteger(y.c.f23708l, -1);
            this.f2647g = obtainStyledAttributes.getInt(y.c.f23707k, 0);
            this.f2648h = obtainStyledAttributes.getInt(y.c.f23706j, 0);
            int i10 = y.c.f23705i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2642b = hasValue;
            if (hasValue) {
                this.f2641a = CoordinatorLayout.E(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f2641a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
