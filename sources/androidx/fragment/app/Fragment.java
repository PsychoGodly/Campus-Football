package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.s;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, p, p0, androidx.lifecycle.h, b1.d {

    /* renamed from: b0  reason: collision with root package name */
    static final Object f3417b0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F = true;
    private boolean G;
    ViewGroup H;
    View I;
    boolean J;
    boolean K = true;
    e L;
    Runnable M = new a();
    boolean N;
    boolean O;
    float P;
    LayoutInflater Q;
    boolean R;
    i.b S = i.b.RESUMED;
    r T;
    a0 U;
    w<p> V = new w<>();
    l0.b W;
    b1.c X;
    private int Y;
    private final AtomicInteger Z = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    int f3418a = -1;

    /* renamed from: a0  reason: collision with root package name */
    private final ArrayList<g> f3419a0 = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    Bundle f3420b;

    /* renamed from: c  reason: collision with root package name */
    SparseArray<Parcelable> f3421c;

    /* renamed from: d  reason: collision with root package name */
    Bundle f3422d;

    /* renamed from: f  reason: collision with root package name */
    Boolean f3423f;

    /* renamed from: g  reason: collision with root package name */
    String f3424g = UUID.randomUUID().toString();

    /* renamed from: h  reason: collision with root package name */
    Bundle f3425h;

    /* renamed from: i  reason: collision with root package name */
    Fragment f3426i;

    /* renamed from: j  reason: collision with root package name */
    String f3427j = null;

    /* renamed from: k  reason: collision with root package name */
    int f3428k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f3429l = null;

    /* renamed from: m  reason: collision with root package name */
    boolean f3430m;

    /* renamed from: n  reason: collision with root package name */
    boolean f3431n;

    /* renamed from: o  reason: collision with root package name */
    boolean f3432o;

    /* renamed from: p  reason: collision with root package name */
    boolean f3433p;

    /* renamed from: q  reason: collision with root package name */
    boolean f3434q;

    /* renamed from: r  reason: collision with root package name */
    boolean f3435r;

    /* renamed from: s  reason: collision with root package name */
    int f3436s;

    /* renamed from: t  reason: collision with root package name */
    n f3437t;

    /* renamed from: u  reason: collision with root package name */
    k<?> f3438u;

    /* renamed from: v  reason: collision with root package name */
    n f3439v = new o();

    /* renamed from: w  reason: collision with root package name */
    Fragment f3440w;

    /* renamed from: x  reason: collision with root package name */
    int f3441x;

    /* renamed from: y  reason: collision with root package name */
    int f3442y;

    /* renamed from: z  reason: collision with root package name */
    String f3443z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.E1();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Fragment.this.d(false);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f3447a;

        c(c0 c0Var) {
            this.f3447a = c0Var;
        }

        public void run() {
            this.f3447a.g();
        }
    }

    class d extends g {
        d() {
        }

        public View c(int i10) {
            View view = Fragment.this.I;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        public boolean d() {
            return Fragment.this.I != null;
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        View f3450a;

        /* renamed from: b  reason: collision with root package name */
        Animator f3451b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3452c;

        /* renamed from: d  reason: collision with root package name */
        int f3453d;

        /* renamed from: e  reason: collision with root package name */
        int f3454e;

        /* renamed from: f  reason: collision with root package name */
        int f3455f;

        /* renamed from: g  reason: collision with root package name */
        int f3456g;

        /* renamed from: h  reason: collision with root package name */
        int f3457h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<String> f3458i;

        /* renamed from: j  reason: collision with root package name */
        ArrayList<String> f3459j;

        /* renamed from: k  reason: collision with root package name */
        Object f3460k = null;

        /* renamed from: l  reason: collision with root package name */
        Object f3461l;

        /* renamed from: m  reason: collision with root package name */
        Object f3462m;

        /* renamed from: n  reason: collision with root package name */
        Object f3463n;

        /* renamed from: o  reason: collision with root package name */
        Object f3464o;

        /* renamed from: p  reason: collision with root package name */
        Object f3465p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f3466q;

        /* renamed from: r  reason: collision with root package name */
        Boolean f3467r;

        /* renamed from: s  reason: collision with root package name */
        s f3468s;

        /* renamed from: t  reason: collision with root package name */
        s f3469t;

        /* renamed from: u  reason: collision with root package name */
        float f3470u;

        /* renamed from: v  reason: collision with root package name */
        View f3471v;

        /* renamed from: w  reason: collision with root package name */
        boolean f3472w;

        /* renamed from: x  reason: collision with root package name */
        h f3473x;

        /* renamed from: y  reason: collision with root package name */
        boolean f3474y;

        e() {
            Object obj = Fragment.f3417b0;
            this.f3461l = obj;
            this.f3462m = null;
            this.f3463n = obj;
            this.f3464o = null;
            this.f3465p = obj;
            this.f3470u = 1.0f;
            this.f3471v = null;
        }
    }

    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class g {
        private g() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    interface h {
        void a();

        void b();
    }

    public Fragment() {
        S();
    }

    private void S() {
        this.T = new r(this);
        this.X = b1.c.a(this);
        this.W = null;
    }

    @Deprecated
    public static Fragment U(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.u1(bundle);
            }
            return fragment;
        } catch (InstantiationException e10) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private e g() {
        if (this.L == null) {
            this.L = new e();
        }
        return this.L;
    }

    private void p1() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.I != null) {
            q1(this.f3420b);
        }
        this.f3420b = null;
    }

    private int z() {
        i.b bVar = this.S;
        if (bVar == i.b.INITIALIZED || this.f3440w == null) {
            return bVar.ordinal();
        }
        return Math.min(bVar.ordinal(), this.f3440w.z());
    }

    /* access modifiers changed from: package-private */
    public int A() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3457h;
    }

    public boolean A0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void A1(float f10) {
        g().f3470u = f10;
    }

    public final Fragment B() {
        return this.f3440w;
    }

    public void B0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public void B1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        g();
        e eVar = this.L;
        eVar.f3458i = arrayList;
        eVar.f3459j = arrayList2;
    }

    public final n C() {
        n nVar = this.f3437t;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void C0() {
        this.G = true;
    }

    @Deprecated
    public void C1(Intent intent, int i10, Bundle bundle) {
        if (this.f3438u != null) {
            C().L0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        e eVar = this.L;
        if (eVar == null) {
            return false;
        }
        return eVar.f3452c;
    }

    public void D0(boolean z10) {
    }

    @Deprecated
    public void D1(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f3438u != null) {
            if (n.F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(this);
                sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i14 = i10;
                sb2.append(i10);
                sb2.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb2.append(intentSender);
                sb2.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb2.append(intent);
                sb2.append(" options: ");
                sb2.append(bundle);
                Log.v("FragmentManager", sb2.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i15 = i10;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            C().M0(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public int E() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3455f;
    }

    public void E0(Menu menu) {
    }

    public void E1() {
        if (this.L != null && g().f3472w) {
            if (this.f3438u == null) {
                g().f3472w = false;
            } else if (Looper.myLooper() != this.f3438u.g().getLooper()) {
                this.f3438u.g().postAtFrontOfQueue(new b());
            } else {
                d(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int F() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3456g;
    }

    public void F0(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public float G() {
        e eVar = this.L;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f3470u;
    }

    @Deprecated
    public void G0(int i10, String[] strArr, int[] iArr) {
    }

    public Object H() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3463n;
        return obj == f3417b0 ? u() : obj;
    }

    public void H0() {
        this.G = true;
    }

    public final Resources I() {
        return m1().getResources();
    }

    public void I0(Bundle bundle) {
    }

    public Object J() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3461l;
        return obj == f3417b0 ? r() : obj;
    }

    public void J0() {
        this.G = true;
    }

    public Object K() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3464o;
    }

    public void K0() {
        this.G = true;
    }

    public Object L() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3465p;
        return obj == f3417b0 ? K() : obj;
    }

    public void L0(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> M() {
        ArrayList<String> arrayList;
        e eVar = this.L;
        if (eVar == null || (arrayList = eVar.f3458i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public void M0(Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> N() {
        ArrayList<String> arrayList;
        e eVar = this.L;
        if (eVar == null || (arrayList = eVar.f3459j) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void N0(Bundle bundle) {
        this.f3439v.S0();
        this.f3418a = 3;
        this.G = false;
        g0(bundle);
        if (this.G) {
            p1();
            this.f3439v.y();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final String O(int i10) {
        return I().getString(i10);
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        Iterator<g> it = this.f3419a0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f3419a0.clear();
        this.f3439v.j(this.f3438u, e(), this);
        this.f3418a = 0;
        this.G = false;
        j0(this.f3438u.f());
        if (this.G) {
            this.f3437t.I(this);
            this.f3439v.z();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onAttach()");
    }

    @Deprecated
    public final Fragment P() {
        String str;
        Fragment fragment = this.f3426i;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.f3437t;
        if (nVar == null || (str = this.f3427j) == null) {
            return null;
        }
        return nVar.g0(str);
    }

    /* access modifiers changed from: package-private */
    public void P0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3439v.A(configuration);
    }

    public View Q() {
        return this.I;
    }

    /* access modifiers changed from: package-private */
    public boolean Q0(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (l0(menuItem)) {
            return true;
        }
        return this.f3439v.B(menuItem);
    }

    public LiveData<p> R() {
        return this.V;
    }

    /* access modifiers changed from: package-private */
    public void R0(Bundle bundle) {
        this.f3439v.S0();
        this.f3418a = 1;
        this.G = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.T.a(new m() {
                public void onStateChanged(p pVar, i.a aVar) {
                    View view;
                    if (aVar == i.a.ON_STOP && (view = Fragment.this.I) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.X.d(bundle);
        m0(bundle);
        this.R = true;
        if (this.G) {
            this.T.i(i.a.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean S0(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            z10 = true;
            p0(menu, menuInflater);
        }
        return z10 | this.f3439v.D(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public void T() {
        S();
        this.f3424g = UUID.randomUUID().toString();
        this.f3430m = false;
        this.f3431n = false;
        this.f3432o = false;
        this.f3433p = false;
        this.f3434q = false;
        this.f3436s = 0;
        this.f3437t = null;
        this.f3439v = new o();
        this.f3438u = null;
        this.f3441x = 0;
        this.f3442y = 0;
        this.f3443z = null;
        this.A = false;
        this.B = false;
    }

    /* access modifiers changed from: package-private */
    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3439v.S0();
        this.f3435r = true;
        this.U = new a0(this, getViewModelStore());
        View q02 = q0(layoutInflater, viewGroup, bundle);
        this.I = q02;
        if (q02 != null) {
            this.U.b();
            q0.a(this.I, this.U);
            r0.a(this.I, this.U);
            b1.e.a(this.I, this.U);
            this.V.j(this.U);
        } else if (!this.U.c()) {
            this.U = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        this.f3439v.E();
        this.T.i(i.a.ON_DESTROY);
        this.f3418a = 0;
        this.G = false;
        this.R = false;
        r0();
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final boolean V() {
        return this.f3438u != null && this.f3430m;
    }

    /* access modifiers changed from: package-private */
    public void V0() {
        this.f3439v.F();
        if (this.I != null && this.U.getLifecycle().b().c(i.b.CREATED)) {
            this.U.a(i.a.ON_DESTROY);
        }
        this.f3418a = 1;
        this.G = false;
        t0();
        if (this.G) {
            androidx.loader.app.a.b(this).c();
            this.f3435r = false;
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final boolean W() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public void W0() {
        this.f3418a = -1;
        this.G = false;
        u0();
        this.Q = null;
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f3439v.E0()) {
            this.f3439v.E();
            this.f3439v = new o();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X() {
        e eVar = this.L;
        if (eVar == null) {
            return false;
        }
        return eVar.f3474y;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater X0(Bundle bundle) {
        LayoutInflater v02 = v0(bundle);
        this.Q = v02;
        return v02;
    }

    /* access modifiers changed from: package-private */
    public final boolean Y() {
        return this.f3436s > 0;
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        onLowMemory();
        this.f3439v.G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f3437t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Z() {
        /*
            r2 = this;
            boolean r0 = r2.F
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.n r0 = r2.f3437t
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f3440w
            boolean r0 = r0.H0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.Z():boolean");
    }

    /* access modifiers changed from: package-private */
    public void Z0(boolean z10) {
        z0(z10);
        this.f3439v.H(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean a0() {
        e eVar = this.L;
        if (eVar == null) {
            return false;
        }
        return eVar.f3472w;
    }

    /* access modifiers changed from: package-private */
    public boolean a1(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (!this.E || !this.F || !A0(menuItem)) {
            return this.f3439v.J(menuItem);
        }
        return true;
    }

    public final boolean b0() {
        return this.f3431n;
    }

    /* access modifiers changed from: package-private */
    public void b1(Menu menu) {
        if (!this.A) {
            if (this.E && this.F) {
                B0(menu);
            }
            this.f3439v.K(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c0() {
        Fragment B2 = B();
        return B2 != null && (B2.b0() || B2.c0());
    }

    /* access modifiers changed from: package-private */
    public void c1() {
        this.f3439v.M();
        if (this.I != null) {
            this.U.a(i.a.ON_PAUSE);
        }
        this.T.i(i.a.ON_PAUSE);
        this.f3418a = 6;
        this.G = false;
        C0();
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z10) {
        ViewGroup viewGroup;
        n nVar;
        e eVar = this.L;
        h hVar = null;
        if (eVar != null) {
            eVar.f3472w = false;
            h hVar2 = eVar.f3473x;
            eVar.f3473x = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.b();
        } else if (n.P && this.I != null && (viewGroup = this.H) != null && (nVar = this.f3437t) != null) {
            c0 n10 = c0.n(viewGroup, nVar);
            n10.p();
            if (z10) {
                this.f3438u.g().post(new c(n10));
            } else {
                n10.g();
            }
        }
    }

    public final boolean d0() {
        n nVar = this.f3437t;
        if (nVar == null) {
            return false;
        }
        return nVar.K0();
    }

    /* access modifiers changed from: package-private */
    public void d1(boolean z10) {
        D0(z10);
        this.f3439v.N(z10);
    }

    /* access modifiers changed from: package-private */
    public g e() {
        return new d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e0() {
        /*
            r1 = this;
            boolean r0 = r1.V()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.W()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.I
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.I
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.e0():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean e1(Menu menu) {
        boolean z10 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            z10 = true;
            E0(menu);
        }
        return z10 | this.f3439v.O(menu);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3441x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3442y));
        printWriter.print(" mTag=");
        printWriter.println(this.f3443z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3418a);
        printWriter.print(" mWho=");
        printWriter.print(this.f3424g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3436s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3430m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3431n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3432o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3433p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.f3437t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3437t);
        }
        if (this.f3438u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3438u);
        }
        if (this.f3440w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3440w);
        }
        if (this.f3425h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3425h);
        }
        if (this.f3420b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3420b);
        }
        if (this.f3421c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3421c);
        }
        if (this.f3422d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3422d);
        }
        Fragment P2 = P();
        if (P2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(P2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3428k);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(D());
        if (q() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(q());
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(t());
        }
        if (E() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(E());
        }
        if (F() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(F());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(l());
        }
        if (p() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3439v + ":");
        n nVar = this.f3439v;
        nVar.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        this.f3439v.S0();
    }

    /* access modifiers changed from: package-private */
    public void f1() {
        boolean I0 = this.f3437t.I0(this);
        Boolean bool = this.f3429l;
        if (bool == null || bool.booleanValue() != I0) {
            this.f3429l = Boolean.valueOf(I0);
            F0(I0);
            this.f3439v.P();
        }
    }

    @Deprecated
    public void g0(Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        this.f3439v.S0();
        this.f3439v.a0(true);
        this.f3418a = 7;
        this.G = false;
        H0();
        if (this.G) {
            r rVar = this.T;
            i.a aVar = i.a.ON_RESUME;
            rVar.i(aVar);
            if (this.I != null) {
                this.U.a(aVar);
            }
            this.f3439v.Q();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onResume()");
    }

    public /* synthetic */ p0.a getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.g.a(this);
    }

    public i getLifecycle() {
        return this.T;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.X.b();
    }

    public o0 getViewModelStore() {
        if (this.f3437t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (z() != i.b.INITIALIZED.ordinal()) {
            return this.f3437t.A0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str.equals(this.f3424g)) {
            return this;
        }
        return this.f3439v.j0(str);
    }

    @Deprecated
    public void h0(int i10, int i11, Intent intent) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void h1(Bundle bundle) {
        I0(bundle);
        this.X.e(bundle);
        Parcelable h12 = this.f3439v.h1();
        if (h12 != null) {
            bundle.putParcelable("android:support:fragments", h12);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final e i() {
        k<?> kVar = this.f3438u;
        if (kVar == null) {
            return null;
        }
        return (e) kVar.e();
    }

    @Deprecated
    public void i0(Activity activity) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        this.f3439v.S0();
        this.f3439v.a0(true);
        this.f3418a = 5;
        this.G = false;
        J0();
        if (this.G) {
            r rVar = this.T;
            i.a aVar = i.a.ON_START;
            rVar.i(aVar);
            if (this.I != null) {
                this.U.a(aVar);
            }
            this.f3439v.R();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStart()");
    }

    public boolean j() {
        Boolean bool;
        e eVar = this.L;
        if (eVar == null || (bool = eVar.f3467r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void j0(Context context) {
        this.G = true;
        k<?> kVar = this.f3438u;
        Activity e10 = kVar == null ? null : kVar.e();
        if (e10 != null) {
            this.G = false;
            i0(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        this.f3439v.T();
        if (this.I != null) {
            this.U.a(i.a.ON_STOP);
        }
        this.T.i(i.a.ON_STOP);
        this.f3418a = 4;
        this.G = false;
        K0();
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public boolean k() {
        Boolean bool;
        e eVar = this.L;
        if (eVar == null || (bool = eVar.f3466q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void k0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    public void k1() {
        L0(this.I, this.f3420b);
        this.f3439v.U();
    }

    /* access modifiers changed from: package-private */
    public View l() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3450a;
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    public final e l1() {
        e i10 = i();
        if (i10 != null) {
            return i10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    public Animator m() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3451b;
    }

    public void m0(Bundle bundle) {
        this.G = true;
        o1(bundle);
        if (!this.f3439v.J0(1)) {
            this.f3439v.C();
        }
    }

    public final Context m1() {
        Context p10 = p();
        if (p10 != null) {
            return p10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Bundle n() {
        return this.f3425h;
    }

    public Animation n0(int i10, boolean z10, int i11) {
        return null;
    }

    public final View n1() {
        View Q2 = Q();
        if (Q2 != null) {
            return Q2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final n o() {
        if (this.f3438u != null) {
            return this.f3439v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Animator o0(int i10, boolean z10, int i11) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void o1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3439v.f1(parcelable);
            this.f3439v.C();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        l1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.G = true;
    }

    public Context p() {
        k<?> kVar = this.f3438u;
        if (kVar == null) {
            return null;
        }
        return kVar.f();
    }

    public void p0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public int q() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3453d;
    }

    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.Y;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void q1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3421c;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f3421c = null;
        }
        if (this.I != null) {
            this.U.d(this.f3422d);
            this.f3422d = null;
        }
        this.G = false;
        M0(bundle);
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.I != null) {
            this.U.a(i.a.ON_CREATE);
        }
    }

    public Object r() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3460k;
    }

    public void r0() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void r1(View view) {
        g().f3450a = view;
    }

    /* access modifiers changed from: package-private */
    public s s() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3468s;
    }

    public void s0() {
    }

    /* access modifiers changed from: package-private */
    public void s1(int i10, int i11, int i12, int i13) {
        if (this.L != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            g().f3453d = i10;
            g().f3454e = i11;
            g().f3455f = i12;
            g().f3456g = i13;
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        C1(intent, i10, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public int t() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3454e;
    }

    public void t0() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void t1(Animator animator) {
        g().f3451b = animator;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f3424g);
        if (this.f3441x != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3441x));
        }
        if (this.f3443z != null) {
            sb2.append(" tag=");
            sb2.append(this.f3443z);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public Object u() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3462m;
    }

    public void u0() {
        this.G = true;
    }

    public void u1(Bundle bundle) {
        if (this.f3437t == null || !d0()) {
            this.f3425h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    public s v() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3469t;
    }

    public LayoutInflater v0(Bundle bundle) {
        return y(bundle);
    }

    /* access modifiers changed from: package-private */
    public void v1(View view) {
        g().f3471v = view;
    }

    /* access modifiers changed from: package-private */
    public View w() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3471v;
    }

    public void w0(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public void w1(boolean z10) {
        g().f3474y = z10;
    }

    public final Object x() {
        k<?> kVar = this.f3438u;
        if (kVar == null) {
            return null;
        }
        return kVar.h();
    }

    @Deprecated
    public void x0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void x1(int i10) {
        if (this.L != null || i10 != 0) {
            g();
            this.L.f3457h = i10;
        }
    }

    @Deprecated
    public LayoutInflater y(Bundle bundle) {
        k<?> kVar = this.f3438u;
        if (kVar != null) {
            LayoutInflater i10 = kVar.i();
            androidx.core.view.g.b(i10, this.f3439v.u0());
            return i10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void y0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        k<?> kVar = this.f3438u;
        Activity e10 = kVar == null ? null : kVar.e();
        if (e10 != null) {
            this.G = false;
            x0(e10, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void y1(h hVar) {
        g();
        e eVar = this.L;
        h hVar2 = eVar.f3473x;
        if (hVar != hVar2) {
            if (hVar == null || hVar2 == null) {
                if (eVar.f3472w) {
                    eVar.f3473x = hVar;
                }
                if (hVar != null) {
                    hVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void z0(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public void z1(boolean z10) {
        if (this.L != null) {
            g().f3452c = z10;
        }
    }
}
