package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.a0;
import androidx.fragment.app.c0;
import androidx.lifecycle.i;
import androidx.lifecycle.p0;

/* compiled from: FragmentStateManager */
class u {

    /* renamed from: a  reason: collision with root package name */
    private final m f3712a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3713b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f3714c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3715d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f3716e = -1;

    /* compiled from: FragmentStateManager */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3717a;

        a(View view) {
            this.f3717a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3717a.removeOnAttachStateChangeListener(this);
            a0.k0(this.f3717a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3719a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.i.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3719a = r0
                androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3719a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3719a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3719a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.b.<clinit>():void");
        }
    }

    u(m mVar, v vVar, Fragment fragment) {
        this.f3712a = mVar;
        this.f3713b = vVar;
        this.f3714c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f3714c.I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3714c.I) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f3714c.h1(bundle);
        this.f3712a.j(this.f3714c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3714c.I != null) {
            s();
        }
        if (this.f3714c.f3421c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3714c.f3421c);
        }
        if (this.f3714c.f3422d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3714c.f3422d);
        }
        if (!this.f3714c.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3714c.K);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3714c);
        }
        Fragment fragment = this.f3714c;
        fragment.N0(fragment.f3420b);
        m mVar = this.f3712a;
        Fragment fragment2 = this.f3714c;
        mVar.a(fragment2, fragment2.f3420b, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int j10 = this.f3713b.j(this.f3714c);
        Fragment fragment = this.f3714c;
        fragment.H.addView(fragment.I, j10);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3714c);
        }
        Fragment fragment = this.f3714c;
        Fragment fragment2 = fragment.f3426i;
        u uVar = null;
        if (fragment2 != null) {
            u m10 = this.f3713b.m(fragment2.f3424g);
            if (m10 != null) {
                Fragment fragment3 = this.f3714c;
                fragment3.f3427j = fragment3.f3426i.f3424g;
                fragment3.f3426i = null;
                uVar = m10;
            } else {
                throw new IllegalStateException("Fragment " + this.f3714c + " declared target fragment " + this.f3714c.f3426i + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3427j;
            if (str != null && (uVar = this.f3713b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3714c + " declared target fragment " + this.f3714c.f3427j + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (n.P || uVar.k().f3418a < 1)) {
            uVar.m();
        }
        Fragment fragment4 = this.f3714c;
        fragment4.f3438u = fragment4.f3437t.t0();
        Fragment fragment5 = this.f3714c;
        fragment5.f3440w = fragment5.f3437t.w0();
        this.f3712a.g(this.f3714c, false);
        this.f3714c.O0();
        this.f3712a.b(this.f3714c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3714c;
        if (fragment2.f3437t == null) {
            return fragment2.f3418a;
        }
        int i10 = this.f3716e;
        int i11 = b.f3719a[fragment2.S.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = Math.min(i10, 5);
            } else if (i11 == 3) {
                i10 = Math.min(i10, 1);
            } else if (i11 != 4) {
                i10 = Math.min(i10, -1);
            } else {
                i10 = Math.min(i10, 0);
            }
        }
        Fragment fragment3 = this.f3714c;
        if (fragment3.f3432o) {
            if (fragment3.f3433p) {
                i10 = Math.max(this.f3716e, 2);
                View view = this.f3714c.I;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f3716e < 4 ? Math.min(i10, fragment3.f3418a) : Math.min(i10, 1);
            }
        }
        if (!this.f3714c.f3430m) {
            i10 = Math.min(i10, 1);
        }
        c0.e.b bVar = null;
        if (n.P && (viewGroup = fragment.H) != null) {
            bVar = c0.n(viewGroup, (fragment = this.f3714c).C()).l(this);
        }
        if (bVar == c0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == c0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f3714c;
            if (fragment4.f3431n) {
                if (fragment4.Y()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f3714c;
        if (fragment5.J && fragment5.f3418a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f3714c);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3714c);
        }
        Fragment fragment = this.f3714c;
        if (!fragment.R) {
            this.f3712a.h(fragment, fragment.f3420b, false);
            Fragment fragment2 = this.f3714c;
            fragment2.R0(fragment2.f3420b);
            m mVar = this.f3712a;
            Fragment fragment3 = this.f3714c;
            mVar.c(fragment3, fragment3.f3420b, false);
            return;
        }
        fragment.o1(fragment.f3420b);
        this.f3714c.f3418a = 1;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f3714c.f3432o) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3714c);
            }
            Fragment fragment = this.f3714c;
            LayoutInflater X0 = fragment.X0(fragment.f3420b);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3714c;
            ViewGroup viewGroup2 = fragment2.H;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = fragment2.f3442y;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) fragment2.f3437t.o0().c(this.f3714c.f3442y);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3714c;
                            if (!fragment3.f3434q) {
                                try {
                                    str = fragment3.I().getResourceName(this.f3714c.f3442y);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3714c.f3442y) + " (" + str + ") for fragment " + this.f3714c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3714c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3714c;
            fragment4.H = viewGroup;
            fragment4.T0(X0, viewGroup, fragment4.f3420b);
            View view = this.f3714c.I;
            if (view != null) {
                boolean z10 = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3714c;
                fragment5.I.setTag(l0.b.f19845a, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.f3714c;
                if (fragment6.A) {
                    fragment6.I.setVisibility(8);
                }
                if (a0.Q(this.f3714c.I)) {
                    a0.k0(this.f3714c.I);
                } else {
                    View view2 = this.f3714c.I;
                    view2.addOnAttachStateChangeListener(new a(view2));
                }
                this.f3714c.k1();
                m mVar = this.f3712a;
                Fragment fragment7 = this.f3714c;
                mVar.m(fragment7, fragment7.I, fragment7.f3420b, false);
                int visibility = this.f3714c.I.getVisibility();
                float alpha = this.f3714c.I.getAlpha();
                if (n.P) {
                    this.f3714c.A1(alpha);
                    Fragment fragment8 = this.f3714c;
                    if (fragment8.H != null && visibility == 0) {
                        View findFocus = fragment8.I.findFocus();
                        if (findFocus != null) {
                            this.f3714c.v1(findFocus);
                            if (n.F0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3714c);
                            }
                        }
                        this.f3714c.I.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f3714c;
                    if (visibility == 0 && fragment9.H != null) {
                        z10 = true;
                    }
                    fragment9.N = z10;
                }
            }
            this.f3714c.f3418a = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Fragment f10;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3714c);
        }
        Fragment fragment = this.f3714c;
        boolean z10 = true;
        boolean z11 = fragment.f3431n && !fragment.Y();
        if (z11 || this.f3713b.o().p(this.f3714c)) {
            k<?> kVar = this.f3714c.f3438u;
            if (kVar instanceof p0) {
                z10 = this.f3713b.o().m();
            } else if (kVar.f() instanceof Activity) {
                z10 = true ^ ((Activity) kVar.f()).isChangingConfigurations();
            }
            if (z11 || z10) {
                this.f3713b.o().g(this.f3714c);
            }
            this.f3714c.U0();
            this.f3712a.d(this.f3714c, false);
            for (u next : this.f3713b.k()) {
                if (next != null) {
                    Fragment k10 = next.k();
                    if (this.f3714c.f3424g.equals(k10.f3427j)) {
                        k10.f3426i = this.f3714c;
                        k10.f3427j = null;
                    }
                }
            }
            Fragment fragment2 = this.f3714c;
            String str = fragment2.f3427j;
            if (str != null) {
                fragment2.f3426i = this.f3713b.f(str);
            }
            this.f3713b.q(this);
            return;
        }
        String str2 = this.f3714c.f3427j;
        if (!(str2 == null || (f10 = this.f3713b.f(str2)) == null || !f10.C)) {
            this.f3714c.f3426i = f10;
        }
        this.f3714c.f3418a = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3714c);
        }
        Fragment fragment = this.f3714c;
        ViewGroup viewGroup = fragment.H;
        if (!(viewGroup == null || (view = fragment.I) == null)) {
            viewGroup.removeView(view);
        }
        this.f3714c.V0();
        this.f3712a.n(this.f3714c, false);
        Fragment fragment2 = this.f3714c;
        fragment2.H = null;
        fragment2.I = null;
        fragment2.U = null;
        fragment2.V.j(null);
        this.f3714c.f3433p = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3714c);
        }
        this.f3714c.W0();
        boolean z10 = false;
        this.f3712a.e(this.f3714c, false);
        Fragment fragment = this.f3714c;
        fragment.f3418a = -1;
        fragment.f3438u = null;
        fragment.f3440w = null;
        fragment.f3437t = null;
        if (fragment.f3431n && !fragment.Y()) {
            z10 = true;
        }
        if (z10 || this.f3713b.o().p(this.f3714c)) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3714c);
            }
            this.f3714c.T();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f3714c;
        if (fragment.f3432o && fragment.f3433p && !fragment.f3435r) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3714c);
            }
            Fragment fragment2 = this.f3714c;
            fragment2.T0(fragment2.X0(fragment2.f3420b), (ViewGroup) null, this.f3714c.f3420b);
            View view = this.f3714c.I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3714c;
                fragment3.I.setTag(l0.b.f19845a, fragment3);
                Fragment fragment4 = this.f3714c;
                if (fragment4.A) {
                    fragment4.I.setVisibility(8);
                }
                this.f3714c.k1();
                m mVar = this.f3712a;
                Fragment fragment5 = this.f3714c;
                mVar.m(fragment5, fragment5.I, fragment5.f3420b, false);
                this.f3714c.f3418a = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.f3714c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3715d) {
            boolean z10 = false;
            z10 = true;
            try {
                while (true) {
                    int d10 = d();
                    Fragment fragment = this.f3714c;
                    int i10 = fragment.f3418a;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f3714c.f3418a = z10 ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.f3433p = z10;
                                    fragment.f3418a = 2;
                                    break;
                                case 3:
                                    if (n.F0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3714c);
                                    }
                                    Fragment fragment2 = this.f3714c;
                                    if (fragment2.I != null && fragment2.f3421c == null) {
                                        s();
                                    }
                                    Fragment fragment3 = this.f3714c;
                                    if (!(fragment3.I == null || (viewGroup2 = fragment3.H) == null)) {
                                        c0.n(viewGroup2, fragment3.C()).d(this);
                                    }
                                    this.f3714c.f3418a = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    fragment.f3418a = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.I == null || (viewGroup3 = fragment.H) == null)) {
                                        c0.n(viewGroup3, fragment.C()).b(c0.e.c.c(this.f3714c.I.getVisibility()), this);
                                    }
                                    this.f3714c.f3418a = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    fragment.f3418a = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (n.P && fragment.O) {
                            if (!(fragment.I == null || (viewGroup = fragment.H) == null)) {
                                c0 n10 = c0.n(viewGroup, fragment.C());
                                if (this.f3714c.A) {
                                    n10.c(this);
                                } else {
                                    n10.e(this);
                                }
                            }
                            Fragment fragment4 = this.f3714c;
                            n nVar = fragment4.f3437t;
                            if (nVar != null) {
                                nVar.D0(fragment4);
                            }
                            Fragment fragment5 = this.f3714c;
                            fragment5.O = z10;
                            fragment5.w0(fragment5.A);
                        }
                        this.f3715d = z10;
                        return;
                    }
                }
            } finally {
                this.f3715d = z10;
            }
        } else if (n.F0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3714c);
        }
        this.f3714c.c1();
        this.f3712a.f(this.f3714c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f3714c.f3420b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3714c;
            fragment.f3421c = fragment.f3420b.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3714c;
            fragment2.f3422d = fragment2.f3420b.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3714c;
            fragment3.f3427j = fragment3.f3420b.getString("android:target_state");
            Fragment fragment4 = this.f3714c;
            if (fragment4.f3427j != null) {
                fragment4.f3428k = fragment4.f3420b.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3714c;
            Boolean bool = fragment5.f3423f;
            if (bool != null) {
                fragment5.K = bool.booleanValue();
                this.f3714c.f3423f = null;
            } else {
                fragment5.K = fragment5.f3420b.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3714c;
            if (!fragment6.K) {
                fragment6.J = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3714c);
        }
        View w10 = this.f3714c.w();
        if (w10 != null && l(w10)) {
            boolean requestFocus = w10.requestFocus();
            if (n.F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(w10);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3714c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3714c.I.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f3714c.v1((View) null);
        this.f3714c.g1();
        this.f3712a.i(this.f3714c, false);
        Fragment fragment = this.f3714c;
        fragment.f3420b = null;
        fragment.f3421c = null;
        fragment.f3422d = null;
    }

    /* access modifiers changed from: package-private */
    public t r() {
        t tVar = new t(this.f3714c);
        Fragment fragment = this.f3714c;
        if (fragment.f3418a <= -1 || tVar.f3711n != null) {
            tVar.f3711n = fragment.f3420b;
        } else {
            Bundle q10 = q();
            tVar.f3711n = q10;
            if (this.f3714c.f3427j != null) {
                if (q10 == null) {
                    tVar.f3711n = new Bundle();
                }
                tVar.f3711n.putString("android:target_state", this.f3714c.f3427j);
                int i10 = this.f3714c.f3428k;
                if (i10 != 0) {
                    tVar.f3711n.putInt("android:target_req_state", i10);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.f3714c.I != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3714c.I.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3714c.f3421c = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3714c.U.e(bundle);
            if (!bundle.isEmpty()) {
                this.f3714c.f3422d = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        this.f3716e = i10;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3714c);
        }
        this.f3714c.i1();
        this.f3712a.k(this.f3714c, false);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3714c);
        }
        this.f3714c.j1();
        this.f3712a.l(this.f3714c, false);
    }

    u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.f3712a = mVar;
        this.f3713b = vVar;
        Fragment a10 = jVar.a(classLoader, tVar.f3699a);
        this.f3714c = a10;
        Bundle bundle = tVar.f3708k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.u1(tVar.f3708k);
        a10.f3424g = tVar.f3700b;
        a10.f3432o = tVar.f3701c;
        a10.f3434q = true;
        a10.f3441x = tVar.f3702d;
        a10.f3442y = tVar.f3703f;
        a10.f3443z = tVar.f3704g;
        a10.C = tVar.f3705h;
        a10.f3431n = tVar.f3706i;
        a10.B = tVar.f3707j;
        a10.A = tVar.f3709l;
        a10.S = i.b.values()[tVar.f3710m];
        Bundle bundle2 = tVar.f3711n;
        if (bundle2 != null) {
            a10.f3420b = bundle2;
        } else {
            a10.f3420b = new Bundle();
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.f3712a = mVar;
        this.f3713b = vVar;
        this.f3714c = fragment;
        fragment.f3421c = null;
        fragment.f3422d = null;
        fragment.f3436s = 0;
        fragment.f3433p = false;
        fragment.f3430m = false;
        Fragment fragment2 = fragment.f3426i;
        fragment.f3427j = fragment2 != null ? fragment2.f3424g : null;
        fragment.f3426i = null;
        Bundle bundle = tVar.f3711n;
        if (bundle != null) {
            fragment.f3420b = bundle;
        } else {
            fragment.f3420b = new Bundle();
        }
    }
}
