package f0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.h;
import androidx.core.view.a0;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.e;
import androidx.core.view.e0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import f0.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f17936n = new Rect(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a<androidx.core.view.accessibility.c> f17937o = new C0185a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.C0186b<h<androidx.core.view.accessibility.c>, androidx.core.view.accessibility.c> f17938p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f17939d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f17940e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f17941f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f17942g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f17943h;

    /* renamed from: i  reason: collision with root package name */
    private final View f17944i;

    /* renamed from: j  reason: collision with root package name */
    private c f17945j;

    /* renamed from: k  reason: collision with root package name */
    int f17946k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    int f17947l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    private int f17948m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: f0.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    static class C0185a implements b.a<androidx.core.view.accessibility.c> {
        C0185a() {
        }

        /* renamed from: b */
        public void a(androidx.core.view.accessibility.c cVar, Rect rect) {
            cVar.l(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    static class b implements b.C0186b<h<androidx.core.view.accessibility.c>, androidx.core.view.accessibility.c> {
        b() {
        }

        /* renamed from: c */
        public androidx.core.view.accessibility.c a(h<androidx.core.view.accessibility.c> hVar, int i10) {
            return hVar.l(i10);
        }

        /* renamed from: d */
        public int b(h<androidx.core.view.accessibility.c> hVar) {
            return hVar.k();
        }
    }

    /* compiled from: ExploreByTouchHelper */
    private class c extends d {
        c() {
        }

        public androidx.core.view.accessibility.c b(int i10) {
            return androidx.core.view.accessibility.c.N(a.this.H(i10));
        }

        public androidx.core.view.accessibility.c d(int i10) {
            int i11 = i10 == 2 ? a.this.f17946k : a.this.f17947l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f17944i = view;
            this.f17943h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (a0.z(view) == 0) {
                a0.x0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f17944i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f17944i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        androidx.core.view.accessibility.c cVar;
        androidx.core.view.accessibility.c cVar2;
        h<androidx.core.view.accessibility.c> y10 = y();
        int i11 = this.f17947l;
        int i12 = RecyclerView.UNDEFINED_DURATION;
        if (i11 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = y10.e(i11);
        }
        androidx.core.view.accessibility.c cVar3 = cVar;
        if (i10 == 1 || i10 == 2) {
            cVar2 = (androidx.core.view.accessibility.c) b.d(y10, f17938p, f17937o, cVar3, i10, a0.B(this.f17944i) == 1, false);
        } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            Rect rect2 = new Rect();
            int i13 = this.f17947l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f17944i, i10, rect2);
            }
            cVar2 = (androidx.core.view.accessibility.c) b.c(y10, f17938p, f17937o, cVar3, rect2, i10);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i12 = y10.i(y10.g(cVar2));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return T(i10);
        }
        if (i11 == 2) {
            return o(i10);
        }
        if (i11 == 64) {
            return S(i10);
        }
        if (i11 != 128) {
            return J(i10, i11, bundle);
        }
        return n(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return a0.c0(this.f17944i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f17943h.isEnabled() || !this.f17943h.isTouchExplorationEnabled() || (i11 = this.f17946k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f17946k = i10;
        this.f17944i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f17948m;
        if (i11 != i10) {
            this.f17948m = i10;
            U(i10, 128);
            U(i11, 256);
        }
    }

    private boolean n(int i10) {
        if (this.f17946k != i10) {
            return false;
        }
        this.f17946k = RecyclerView.UNDEFINED_DURATION;
        this.f17944i.invalidate();
        U(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f17947l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        if (i10 != -1) {
            return r(i10, i11);
        }
        return s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        androidx.core.view.accessibility.c H = H(i10);
        obtain.getText().add(H.v());
        obtain.setContentDescription(H.q());
        obtain.setScrollable(H.I());
        obtain.setPassword(H.H());
        obtain.setEnabled(H.D());
        obtain.setChecked(H.B());
        L(i10, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.o());
            e.c(obtain, this.f17944i, i10);
            obtain.setPackageName(this.f17944i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f17944i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private androidx.core.view.accessibility.c t(int i10) {
        androidx.core.view.accessibility.c L = androidx.core.view.accessibility.c.L();
        L.d0(true);
        L.f0(true);
        L.X("android.view.View");
        Rect rect = f17936n;
        L.T(rect);
        L.U(rect);
        L.l0(this.f17944i);
        N(i10, L);
        if (L.v() == null && L.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        L.l(this.f17940e);
        if (!this.f17940e.equals(rect)) {
            int j10 = L.j();
            if ((j10 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j10 & 128) == 0) {
                L.j0(this.f17944i.getContext().getPackageName());
                L.q0(this.f17944i, i10);
                if (this.f17946k == i10) {
                    L.R(true);
                    L.a(128);
                } else {
                    L.R(false);
                    L.a(64);
                }
                boolean z10 = this.f17947l == i10;
                if (z10) {
                    L.a(2);
                } else if (L.E()) {
                    L.a(1);
                }
                L.g0(z10);
                this.f17944i.getLocationOnScreen(this.f17942g);
                L.m(this.f17939d);
                if (this.f17939d.equals(rect)) {
                    L.l(this.f17939d);
                    if (L.f3120b != -1) {
                        androidx.core.view.accessibility.c L2 = androidx.core.view.accessibility.c.L();
                        for (int i11 = L.f3120b; i11 != -1; i11 = L2.f3120b) {
                            L2.m0(this.f17944i, -1);
                            L2.T(f17936n);
                            N(i11, L2);
                            L2.l(this.f17940e);
                            Rect rect2 = this.f17939d;
                            Rect rect3 = this.f17940e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        L2.P();
                    }
                    this.f17939d.offset(this.f17942g[0] - this.f17944i.getScrollX(), this.f17942g[1] - this.f17944i.getScrollY());
                }
                if (this.f17944i.getLocalVisibleRect(this.f17941f)) {
                    this.f17941f.offset(this.f17942g[0] - this.f17944i.getScrollX(), this.f17942g[1] - this.f17944i.getScrollY());
                    if (this.f17939d.intersect(this.f17941f)) {
                        L.U(this.f17939d);
                        if (E(this.f17939d)) {
                            L.t0(true);
                        }
                    }
                }
                return L;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private androidx.core.view.accessibility.c u() {
        androidx.core.view.accessibility.c M = androidx.core.view.accessibility.c.M(this.f17944i);
        a0.a0(this.f17944i, M);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (M.n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                M.c(this.f17944i, ((Integer) arrayList.get(i10)).intValue());
            }
            return M;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h<androidx.core.view.accessibility.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<androidx.core.view.accessibility.c> hVar = new h<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.j(i10, t(i10));
        }
        return hVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).l(rect);
    }

    public final int A() {
        return this.f17947l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f10, float f11);

    /* access modifiers changed from: protected */
    public abstract void C(List<Integer> list);

    /* access modifiers changed from: package-private */
    public androidx.core.view.accessibility.c H(int i10) {
        if (i10 == -1) {
            return u();
        }
        return t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f17947l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i10, int i11, Bundle bundle);

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void M(androidx.core.view.accessibility.c cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void N(int i10, androidx.core.view.accessibility.c cVar);

    /* access modifiers changed from: protected */
    public void O(int i10, boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public boolean P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return Q(i10, i11, bundle);
        }
        return R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f17944i.isFocused() && !this.f17944i.requestFocus()) || (i11 = this.f17947l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        this.f17947l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f17943h.isEnabled() || (parent = this.f17944i.getParent()) == null) {
            return false;
        }
        return e0.h(parent, this.f17944i, q(i10, i11));
    }

    public d b(View view) {
        if (this.f17945j == null) {
            this.f17945j = new c();
        }
        return this.f17945j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i10) {
        if (this.f17947l != i10) {
            return false;
        }
        this.f17947l = RecyclerView.UNDEFINED_DURATION;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f17943h.isEnabled() || !this.f17943h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f17948m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && G(F, (Rect) null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f17946k;
    }
}
