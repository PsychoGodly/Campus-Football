package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.f;
import f0.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n6.k;
import x5.j;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int K = j.Widget_Design_BottomSheet_Modal;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    private final ArrayList<e> D = new ArrayList<>();
    private VelocityTracker E;
    int F;
    private int G;
    boolean H;
    private Map<View, Integer> I;
    private final c.C0187c J = new c();

    /* renamed from: a  reason: collision with root package name */
    private int f25452a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f25453b = true;

    /* renamed from: c  reason: collision with root package name */
    private float f25454c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f25455d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25456e;

    /* renamed from: f  reason: collision with root package name */
    private int f25457f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25458g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public n6.g f25459h;

    /* renamed from: i  reason: collision with root package name */
    private k f25460i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f25461j;

    /* renamed from: k  reason: collision with root package name */
    private BottomSheetBehavior<V>.defpackage.g f25462k = null;

    /* renamed from: l  reason: collision with root package name */
    private ValueAnimator f25463l;

    /* renamed from: m  reason: collision with root package name */
    int f25464m;

    /* renamed from: n  reason: collision with root package name */
    int f25465n;

    /* renamed from: o  reason: collision with root package name */
    int f25466o;

    /* renamed from: p  reason: collision with root package name */
    float f25467p = 0.5f;

    /* renamed from: q  reason: collision with root package name */
    int f25468q;

    /* renamed from: r  reason: collision with root package name */
    float f25469r = -1.0f;

    /* renamed from: s  reason: collision with root package name */
    boolean f25470s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f25471t;

    /* renamed from: u  reason: collision with root package name */
    int f25472u = 4;

    /* renamed from: v  reason: collision with root package name */
    f0.c f25473v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f25474w;

    /* renamed from: x  reason: collision with root package name */
    private int f25475x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f25476y;

    /* renamed from: z  reason: collision with root package name */
    int f25477z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f25478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f25479b;

        a(View view, int i10) {
            this.f25478a = view;
            this.f25479b = i10;
        }

        public void run() {
            BottomSheetBehavior.this.f0(this.f25478a, this.f25479b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f25459h != null) {
                BottomSheetBehavior.this.f25459h.U(floatValue);
            }
        }
    }

    class c extends c.C0187c {
        c() {
        }

        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(View view, int i10, int i11) {
            int G = BottomSheetBehavior.this.R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b0.a.b(i10, G, bottomSheetBehavior.f25470s ? bottomSheetBehavior.A : bottomSheetBehavior.f25468q);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f25470s) {
                return bottomSheetBehavior.A;
            }
            return bottomSheetBehavior.f25468q;
        }

        public void j(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior.this.e0(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.P(i11);
        }

        public void l(View view, float f10, float f11) {
            int i10;
            int i11;
            int i12 = 4;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f25470s && bottomSheetBehavior.h0(view, f11) && (view.getTop() > BottomSheetBehavior.this.f25468q || Math.abs(f10) < Math.abs(f11))) {
                    i10 = BottomSheetBehavior.this.A;
                    i12 = 5;
                    BottomSheetBehavior.this.i0(view, i12, i10, true);
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f25453b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i13 = bottomSheetBehavior2.f25466o;
                        if (top < i13) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f25468q)) {
                                i10 = BottomSheetBehavior.this.f25464m;
                            } else {
                                i11 = BottomSheetBehavior.this.f25466o;
                            }
                        } else if (Math.abs(top - i13) < Math.abs(top - BottomSheetBehavior.this.f25468q)) {
                            i11 = BottomSheetBehavior.this.f25466o;
                        } else {
                            i10 = BottomSheetBehavior.this.f25468q;
                            BottomSheetBehavior.this.i0(view, i12, i10, true);
                        }
                        i12 = 6;
                        BottomSheetBehavior.this.i0(view, i12, i10, true);
                    } else if (Math.abs(top - BottomSheetBehavior.this.f25465n) < Math.abs(top - BottomSheetBehavior.this.f25468q)) {
                        i10 = BottomSheetBehavior.this.f25465n;
                    } else {
                        i10 = BottomSheetBehavior.this.f25468q;
                        BottomSheetBehavior.this.i0(view, i12, i10, true);
                    }
                } else {
                    if (BottomSheetBehavior.this.f25453b) {
                        i10 = BottomSheetBehavior.this.f25468q;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f25466o) < Math.abs(top2 - BottomSheetBehavior.this.f25468q)) {
                            i11 = BottomSheetBehavior.this.f25466o;
                            i12 = 6;
                        } else {
                            i10 = BottomSheetBehavior.this.f25468q;
                        }
                    }
                    BottomSheetBehavior.this.i0(view, i12, i10, true);
                }
            } else if (BottomSheetBehavior.this.f25453b) {
                i10 = BottomSheetBehavior.this.f25465n;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i14 = bottomSheetBehavior3.f25466o;
                if (top3 > i14) {
                    i11 = i14;
                    i12 = 6;
                    BottomSheetBehavior.this.i0(view, i12, i10, true);
                }
                i10 = bottomSheetBehavior3.f25464m;
            }
            i12 = 3;
            BottomSheetBehavior.this.i0(view, i12, i10, true);
        }

        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f25472u;
            if (i11 == 1 || bottomSheetBehavior.H) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.F == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    class d implements androidx.core.view.accessibility.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25483a;

        d(int i10) {
            this.f25483a = i10;
        }

        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.d0(this.f25483a);
            return true;
        }
    }

    public static abstract class e {
        public abstract void a(View view, float f10);

        public abstract void b(View view, int i10);
    }

    private class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f25490a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f25491b;

        /* renamed from: c  reason: collision with root package name */
        int f25492c;

        g(View view, int i10) {
            this.f25490a = view;
            this.f25492c = i10;
        }

        public void run() {
            f0.c cVar = BottomSheetBehavior.this.f25473v;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.e0(this.f25492c);
            } else {
                a0.f0(this.f25490a, this);
            }
            this.f25491b = false;
        }
    }

    public BottomSheetBehavior() {
    }

    private void J(V v10, c.a aVar, int i10) {
        a0.j0(v10, aVar, (CharSequence) null, new d(i10));
    }

    private void K() {
        int i10;
        if (this.f25456e) {
            i10 = Math.max(this.f25457f, this.A - ((this.f25477z * 9) / 16));
        } else {
            i10 = this.f25455d;
        }
        if (this.f25453b) {
            this.f25468q = Math.max(this.A - i10, this.f25465n);
        } else {
            this.f25468q = this.A - i10;
        }
    }

    private void L() {
        this.f25466o = (int) (((float) this.A) * (1.0f - this.f25467p));
    }

    private void M(Context context, AttributeSet attributeSet, boolean z10) {
        N(context, attributeSet, z10, (ColorStateList) null);
    }

    private void N(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f25458g) {
            this.f25460i = k.e(context, attributeSet, x5.b.bottomSheetStyle, K).m();
            n6.g gVar = new n6.g(this.f25460i);
            this.f25459h = gVar;
            gVar.L(context);
            if (!z10 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f25459h.setTint(typedValue.data);
                return;
            }
            this.f25459h.T(colorStateList);
        }
    }

    private void O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f25463l = ofFloat;
        ofFloat.setDuration(500);
        this.f25463l.addUpdateListener(new b());
    }

    /* access modifiers changed from: private */
    public int R() {
        return this.f25453b ? this.f25465n : this.f25464m;
    }

    private float S() {
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f25454c);
        return this.E.getYVelocity(this.F);
    }

    private void T() {
        this.F = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    private void U(f fVar) {
        int i10 = this.f25452a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f25455d = fVar.f25486d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f25453b = fVar.f25487f;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f25470s = fVar.f25488g;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f25471t = fVar.f25489h;
            }
        }
    }

    private void g0(int i10) {
        View view = (View) this.B.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !a0.Q(view)) {
                f0(view, i10);
            } else {
                view.post(new a(view, i10));
            }
        }
    }

    private void j0() {
        View view;
        WeakReference<V> weakReference = this.B;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            a0.h0(view, 524288);
            a0.h0(view, 262144);
            a0.h0(view, 1048576);
            if (this.f25470s && this.f25472u != 5) {
                J(view, c.a.f3142y, 5);
            }
            int i10 = this.f25472u;
            int i11 = 6;
            if (i10 == 3) {
                if (this.f25453b) {
                    i11 = 4;
                }
                J(view, c.a.f3141x, i11);
            } else if (i10 == 4) {
                if (this.f25453b) {
                    i11 = 3;
                }
                J(view, c.a.f3140w, i11);
            } else if (i10 == 6) {
                J(view, c.a.f3141x, 4);
                J(view, c.a.f3140w, 3);
            }
        }
    }

    private void k0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            boolean z10 = i10 == 3;
            if (this.f25461j != z10) {
                this.f25461j = z10;
                if (this.f25459h != null && (valueAnimator = this.f25463l) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f25463l.reverse();
                        return;
                    }
                    float f10 = z10 ? 0.0f : 1.0f;
                    this.f25463l.setFloatValues(new float[]{1.0f - f10, f10});
                    this.f25463l.start();
                }
            }
        }
    }

    private void l0(boolean z10) {
        WeakReference<V> weakReference = this.B;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z10) {
                    if (this.I == null) {
                        this.I = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.B.get()) {
                        if (!z10) {
                            Map<View, Integer> map = this.I;
                            if (map != null && map.containsKey(childAt)) {
                                a0.x0(childAt, this.I.get(childAt).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            a0.x0(childAt, 4);
                        }
                    }
                }
                if (!z10) {
                    this.I = null;
                }
            }
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f25475x = 0;
        this.f25476y = false;
        if ((i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        int i11;
        int i12;
        int i13 = 3;
        if (v10.getTop() == R()) {
            e0(3);
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (weakReference != null && view == weakReference.get() && this.f25476y) {
            if (this.f25475x > 0) {
                i11 = R();
            } else if (!this.f25470s || !h0(v10, S())) {
                if (this.f25475x == 0) {
                    int top = v10.getTop();
                    if (!this.f25453b) {
                        int i14 = this.f25466o;
                        if (top < i14) {
                            if (top < Math.abs(top - this.f25468q)) {
                                i11 = this.f25464m;
                            } else {
                                i11 = this.f25466o;
                            }
                        } else if (Math.abs(top - i14) < Math.abs(top - this.f25468q)) {
                            i11 = this.f25466o;
                        } else {
                            i12 = this.f25468q;
                        }
                        i13 = 6;
                    } else if (Math.abs(top - this.f25465n) < Math.abs(top - this.f25468q)) {
                        i11 = this.f25465n;
                    } else {
                        i12 = this.f25468q;
                    }
                } else if (this.f25453b) {
                    i12 = this.f25468q;
                } else {
                    int top2 = v10.getTop();
                    if (Math.abs(top2 - this.f25466o) < Math.abs(top2 - this.f25468q)) {
                        i11 = this.f25466o;
                        i13 = 6;
                    } else {
                        i12 = this.f25468q;
                    }
                }
                i13 = 4;
            } else {
                i11 = this.A;
                i13 = 5;
            }
            i0(v10, i13, i11, false);
            this.f25476y = false;
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f25472u == 1 && actionMasked == 0) {
            return true;
        }
        f0.c cVar = this.f25473v;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            T();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f25474w && Math.abs(((float) this.G) - motionEvent.getY()) > ((float) this.f25473v.u())) {
            this.f25473v.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f25474w;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        float f10;
        float f11;
        View view = (View) this.B.get();
        if (view != null && !this.D.isEmpty()) {
            int i11 = this.f25468q;
            if (i10 > i11) {
                f10 = (float) (i11 - i10);
                f11 = (float) (this.A - i11);
            } else {
                f10 = (float) (i11 - i10);
                f11 = (float) (i11 - R());
            }
            float f12 = f10 / f11;
            for (int i12 = 0; i12 < this.D.size(); i12++) {
                this.D.get(i12).a(view, f12);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View Q(View view) {
        if (a0.S(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View Q = Q(viewGroup.getChildAt(i10));
            if (Q != null) {
                return Q;
            }
        }
        return null;
    }

    public void V(int i10) {
        if (i10 >= 0) {
            this.f25464m = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void W(boolean z10) {
        if (this.f25453b != z10) {
            this.f25453b = z10;
            if (this.B != null) {
                K();
            }
            e0((!this.f25453b || this.f25472u != 6) ? this.f25472u : 3);
            j0();
        }
    }

    public void X(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f25467p = f10;
    }

    public void Y(boolean z10) {
        if (this.f25470s != z10) {
            this.f25470s = z10;
            if (!z10 && this.f25472u == 5) {
                d0(4);
            }
            j0();
        }
    }

    public void Z(int i10) {
        a0(i10, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f25456e
            if (r4 != 0) goto L_0x0015
            r3.f25456e = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f25456e
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f25455d
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f25456e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f25455d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.B
            if (r4 == 0) goto L_0x0042
            r3.K()
            int r4 = r3.f25472u
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.B
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f25472u
            r3.g0(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a0(int, boolean):void");
    }

    public void b0(int i10) {
        this.f25452a = i10;
    }

    public void c0(boolean z10) {
        this.f25471t = z10;
    }

    public void d0(int i10) {
        if (i10 != this.f25472u) {
            if (this.B != null) {
                g0(i10);
            } else if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f25470s && i10 == 5)) {
                this.f25472u = i10;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e0(int i10) {
        View view;
        if (this.f25472u != i10) {
            this.f25472u = i10;
            WeakReference<V> weakReference = this.B;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 6 || i10 == 3) {
                    l0(true);
                } else if (i10 == 5 || i10 == 4) {
                    l0(false);
                }
                k0(i10);
                for (int i11 = 0; i11 < this.D.size(); i11++) {
                    this.D.get(i11).b(view, i10);
                }
                j0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f0(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.f25468q;
        } else if (i10 == 6) {
            int i13 = this.f25466o;
            if (!this.f25453b || i13 > (i12 = this.f25465n)) {
                i11 = i13;
            } else {
                i11 = i12;
                i10 = 3;
            }
        } else if (i10 == 3) {
            i11 = R();
        } else if (!this.f25470s || i10 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i10);
        } else {
            i11 = this.A;
        }
        i0(view, i10, i11, false);
    }

    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.B = null;
        this.f25473v = null;
    }

    /* access modifiers changed from: package-private */
    public boolean h0(View view, float f10) {
        if (this.f25471t) {
            return true;
        }
        if (view.getTop() >= this.f25468q && Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f25468q)) / ((float) this.f25455d) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void i0(View view, int i10, int i11, boolean z10) {
        boolean z11;
        if (z10) {
            z11 = this.f25473v.F(view.getLeft(), i11);
        } else {
            z11 = this.f25473v.H(view, view.getLeft(), i11);
        }
        if (z11) {
            e0(2);
            k0(i10);
            if (this.f25462k == null) {
                this.f25462k = new g(view, i10);
            }
            if (!this.f25462k.f25491b) {
                BottomSheetBehavior<V>.defpackage.g gVar = this.f25462k;
                gVar.f25492c = i10;
                a0.f0(view, gVar);
                boolean unused = this.f25462k.f25491b = true;
                return;
            }
            this.f25462k.f25492c = i10;
            return;
        }
        e0(i10);
    }

    public void j() {
        super.j();
        this.B = null;
        this.f25473v = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r9.f25474w = r2
            return r1
        L_0x000b:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r9.T()
        L_0x0014:
            android.view.VelocityTracker r3 = r9.E
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.E = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r9.E
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002e
            r11 = 3
            if (r0 == r11) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            r9.H = r1
            r9.F = r4
            boolean r11 = r9.f25474w
            if (r11 == 0) goto L_0x007c
            r9.f25474w = r1
            return r1
        L_0x0039:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.G = r7
            int r7 = r9.f25472u
            if (r7 == r5) goto L_0x006b
            java.lang.ref.WeakReference<android.view.View> r7 = r9.C
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x006b
            int r8 = r9.G
            boolean r7 = r10.v(r7, r6, r8)
            if (r7 == 0) goto L_0x006b
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.F = r7
            r9.H = r2
        L_0x006b:
            int r7 = r9.F
            if (r7 != r4) goto L_0x0079
            int r4 = r9.G
            boolean r11 = r10.v(r11, r6, r4)
            if (r11 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            r9.f25474w = r11
        L_0x007c:
            boolean r11 = r9.f25474w
            if (r11 != 0) goto L_0x008b
            f0.c r11 = r9.f25473v
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.G(r12)
            if (r11 == 0) goto L_0x008b
            return r2
        L_0x008b:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.C
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0096:
            if (r0 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r11 = r9.f25474w
            if (r11 != 0) goto L_0x00ce
            int r11 = r9.f25472u
            if (r11 == r2) goto L_0x00ce
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.v(r3, r11, r0)
            if (r10 != 0) goto L_0x00ce
            f0.c r10 = r9.f25473v
            if (r10 == 0) goto L_0x00ce
            int r10 = r9.G
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            f0.c r11 = r9.f25473v
            int r11 = r11.u()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        n6.g gVar;
        if (a0.y(coordinatorLayout) && !a0.y(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f25457f = coordinatorLayout.getResources().getDimensionPixelSize(x5.d.design_bottom_sheet_peek_height_min);
            this.B = new WeakReference<>(v10);
            if (this.f25458g && (gVar = this.f25459h) != null) {
                a0.r0(v10, gVar);
            }
            n6.g gVar2 = this.f25459h;
            if (gVar2 != null) {
                float f10 = this.f25469r;
                if (f10 == -1.0f) {
                    f10 = a0.v(v10);
                }
                gVar2.S(f10);
                boolean z10 = this.f25472u == 3;
                this.f25461j = z10;
                this.f25459h.U(z10 ? 0.0f : 1.0f);
            }
            j0();
            if (a0.z(v10) == 0) {
                a0.x0(v10, 1);
            }
        }
        if (this.f25473v == null) {
            this.f25473v = f0.c.m(coordinatorLayout, this.J);
        }
        int top = v10.getTop();
        coordinatorLayout.C(v10, i10);
        this.f25477z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.f25465n = Math.max(0, height - v10.getHeight());
        L();
        K();
        int i11 = this.f25472u;
        if (i11 == 3) {
            a0.Y(v10, R());
        } else if (i11 == 6) {
            a0.Y(v10, this.f25466o);
        } else if (this.f25470s && i11 == 5) {
            a0.Y(v10, this.A);
        } else if (i11 == 4) {
            a0.Y(v10, this.f25468q);
        } else if (i11 == 1 || i11 == 2) {
            a0.Y(v10, top - v10.getTop());
        }
        this.C = new WeakReference<>(Q(v10));
        return true;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f25472u != 3 || super.o(coordinatorLayout, v10, view, f10, f11)) {
            return true;
        }
        return false;
    }

    public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 != 1) {
            WeakReference<View> weakReference = this.C;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v10.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (i13 < R()) {
                        iArr[1] = top - R();
                        a0.Y(v10, -iArr[1]);
                        e0(3);
                    } else {
                        iArr[1] = i11;
                        a0.Y(v10, -i11);
                        e0(1);
                    }
                } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                    int i14 = this.f25468q;
                    if (i13 <= i14 || this.f25470s) {
                        iArr[1] = i11;
                        a0.Y(v10, -i11);
                        e0(1);
                    } else {
                        iArr[1] = top - i14;
                        a0.Y(v10, -iArr[1]);
                        e0(4);
                    }
                }
                P(v10.getTop());
                this.f25475x = i11;
                this.f25476y = true;
            }
        }
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, v10, fVar.c());
        U(fVar);
        int i10 = fVar.f25485c;
        if (i10 == 1 || i10 == 2) {
            this.f25472u = 4;
        } else {
            this.f25472u = i10;
        }
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new f(super.y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    protected static class f extends e0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f25485c;

        /* renamed from: d  reason: collision with root package name */
        int f25486d;

        /* renamed from: f  reason: collision with root package name */
        boolean f25487f;

        /* renamed from: g  reason: collision with root package name */
        boolean f25488g;

        /* renamed from: h  reason: collision with root package name */
        boolean f25489h;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25485c = parcel.readInt();
            this.f25486d = parcel.readInt();
            boolean z10 = false;
            this.f25487f = parcel.readInt() == 1;
            this.f25488g = parcel.readInt() == 1;
            this.f25489h = parcel.readInt() == 1 ? true : z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25485c);
            parcel.writeInt(this.f25486d);
            parcel.writeInt(this.f25487f ? 1 : 0);
            parcel.writeInt(this.f25488g ? 1 : 0);
            parcel.writeInt(this.f25489h ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f25485c = bottomSheetBehavior.f25472u;
            this.f25486d = bottomSheetBehavior.f25455d;
            this.f25487f = bottomSheetBehavior.f25453b;
            this.f25488g = bottomSheetBehavior.f25470s;
            this.f25489h = bottomSheetBehavior.f25471t;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x5.k.f30998x);
        this.f25458g = obtainStyledAttributes.hasValue(x5.k.H);
        int i11 = x5.k.f31008z;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            N(context, attributeSet, hasValue, k6.c.a(context, obtainStyledAttributes, i11));
        } else {
            M(context, attributeSet, hasValue);
        }
        O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f25469r = obtainStyledAttributes.getDimension(x5.k.f31003y, -1.0f);
        }
        int i12 = x5.k.E;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i12);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            Z(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        } else {
            Z(i10);
        }
        Y(obtainStyledAttributes.getBoolean(x5.k.D, false));
        W(obtainStyledAttributes.getBoolean(x5.k.B, true));
        c0(obtainStyledAttributes.getBoolean(x5.k.G, false));
        b0(obtainStyledAttributes.getInt(x5.k.F, 0));
        X(obtainStyledAttributes.getFloat(x5.k.C, 0.5f));
        V(obtainStyledAttributes.getInt(x5.k.A, 0));
        obtainStyledAttributes.recycle();
        this.f25454c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
