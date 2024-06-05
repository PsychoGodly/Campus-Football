package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.i;
import androidx.lifecycle.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.e> A;
    private androidx.activity.result.c<String[]> B;
    ArrayDeque<m> C = new ArrayDeque<>();
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private q M;
    private Runnable N = new g();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<o> f3634a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3635b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final v f3636c = new v();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f3637d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f3638e;

    /* renamed from: f  reason: collision with root package name */
    private final l f3639f = new l(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f3640g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.l f3641h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f3642i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f3643j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f3644k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<C0056n> f3645l;

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.e>> f3646m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final x.g f3647n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final m f3648o = new m(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f3649p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f3650q = -1;

    /* renamed from: r  reason: collision with root package name */
    private k<?> f3651r;

    /* renamed from: s  reason: collision with root package name */
    private g f3652s;

    /* renamed from: t  reason: collision with root package name */
    private Fragment f3653t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f3654u;

    /* renamed from: v  reason: collision with root package name */
    private j f3655v = null;

    /* renamed from: w  reason: collision with root package name */
    private j f3656w = new e();

    /* renamed from: x  reason: collision with root package name */
    private d0 f3657x = null;

    /* renamed from: y  reason: collision with root package name */
    private d0 f3658y = new f();

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.c<Intent> f3659z;

    /* compiled from: FragmentManager */
    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3674a;
            int i10 = pollFirst.f3675b;
            Fragment i11 = n.this.f3636c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.h0(i10, aVar.d(), aVar.c());
        }
    }

    /* compiled from: FragmentManager */
    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3674a;
            int i11 = pollFirst.f3675b;
            Fragment i12 = n.this.f3636c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i12.G0(i11, strArr, iArr);
        }
    }

    /* compiled from: FragmentManager */
    class c extends androidx.activity.l {
        c(boolean z10) {
            super(z10);
        }

        public void b() {
            n.this.B0();
        }
    }

    /* compiled from: FragmentManager */
    class d implements x.g {
        d() {
        }

        public void a(Fragment fragment, androidx.core.os.e eVar) {
            if (!eVar.b()) {
                n.this.b1(fragment, eVar);
            }
        }

        public void b(Fragment fragment, androidx.core.os.e eVar) {
            n.this.f(fragment, eVar);
        }
    }

    /* compiled from: FragmentManager */
    class e extends j {
        e() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.t0().b(n.this.t0().f(), str, (Bundle) null);
        }
    }

    /* compiled from: FragmentManager */
    class f implements d0 {
        f() {
        }

        public c0 a(ViewGroup viewGroup) {
            return new c(viewGroup);
        }
    }

    /* compiled from: FragmentManager */
    class g implements Runnable {
        g() {
        }

        public void run() {
            n.this.a0(true);
        }
    }

    /* compiled from: FragmentManager */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3669c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3667a = viewGroup;
            this.f3668b = view;
            this.f3669c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3667a.endViewTransition(this.f3668b);
            animator.removeListener(this);
            Fragment fragment = this.f3669c;
            View view = fragment.I;
            if (view != null && fragment.A) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: FragmentManager */
    class i implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3671a;

        i(Fragment fragment) {
            this.f3671a = fragment;
        }

        public void a(n nVar, Fragment fragment) {
            this.f3671a.k0(fragment);
        }
    }

    /* compiled from: FragmentManager */
    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3674a;
            int i10 = pollFirst.f3675b;
            Fragment i11 = n.this.f3636c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.h0(i10, aVar.d(), aVar.c());
        }
    }

    /* compiled from: FragmentManager */
    static class k extends g.a<androidx.activity.result.e, androidx.activity.result.a> {
        k() {
        }

        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent c10 = eVar.c();
            if (!(c10 == null || (bundleExtra = c10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                c10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (c10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.a(eVar.g()).b((Intent) null).c(eVar.e(), eVar.d()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* compiled from: FragmentManager */
    public static abstract class l {
        @Deprecated
        public void a(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void b(n nVar, Fragment fragment, Context context) {
        }

        public void c(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void d(n nVar, Fragment fragment) {
        }

        public void e(n nVar, Fragment fragment) {
        }

        public void f(n nVar, Fragment fragment) {
        }

        public void g(n nVar, Fragment fragment, Context context) {
        }

        public void h(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void i(n nVar, Fragment fragment) {
        }

        public void j(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void k(n nVar, Fragment fragment) {
        }

        public void l(n nVar, Fragment fragment) {
        }

        public void m(n nVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(n nVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    /* compiled from: FragmentManager */
    public interface C0056n {
        void a();
    }

    /* compiled from: FragmentManager */
    interface o {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    private class p implements o {

        /* renamed from: a  reason: collision with root package name */
        final String f3676a;

        /* renamed from: b  reason: collision with root package name */
        final int f3677b;

        /* renamed from: c  reason: collision with root package name */
        final int f3678c;

        p(String str, int i10, int i11) {
            this.f3676a = str;
            this.f3677b = i10;
            this.f3678c = i11;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.f3654u;
            if (fragment != null && this.f3677b < 0 && this.f3676a == null && fragment.o().W0()) {
                return false;
            }
            return n.this.Y0(arrayList, arrayList2, this.f3676a, this.f3677b, this.f3678c);
        }
    }

    /* compiled from: FragmentManager */
    static class q implements Fragment.h {

        /* renamed from: a  reason: collision with root package name */
        final boolean f3680a;

        /* renamed from: b  reason: collision with root package name */
        final a f3681b;

        /* renamed from: c  reason: collision with root package name */
        private int f3682c;

        q(a aVar, boolean z10) {
            this.f3680a = z10;
            this.f3681b = aVar;
        }

        public void a() {
            this.f3682c++;
        }

        public void b() {
            int i10 = this.f3682c - 1;
            this.f3682c = i10;
            if (i10 == 0) {
                this.f3681b.f3479t.i1();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.f3681b;
            aVar.f3479t.t(aVar, this.f3680a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z10 = this.f3682c > 0;
            for (Fragment next : this.f3681b.f3479t.s0()) {
                next.y1((Fragment.h) null);
                if (z10 && next.a0()) {
                    next.E1();
                }
            }
            a aVar = this.f3681b;
            aVar.f3479t.t(aVar, this.f3680a, !z10, true);
        }

        public boolean e() {
            return this.f3682c == 0;
        }
    }

    static boolean F0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.E && fragment.F) || fragment.f3439v.n();
    }

    private void L(Fragment fragment) {
        if (fragment != null && fragment.equals(g0(fragment.f3424g))) {
            fragment.f1();
        }
    }

    private void N0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment n10 = bVar.n(i10);
            if (!n10.f3430m) {
                View n12 = n10.n1();
                n10.P = n12.getAlpha();
                n12.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void S(int i10) {
        try {
            this.f3635b = true;
            this.f3636c.d(i10);
            P0(i10, false);
            if (P) {
                for (c0 j10 : r()) {
                    j10.j();
                }
            }
            this.f3635b = false;
            a0(true);
        } catch (Throwable th) {
            this.f3635b = false;
            throw th;
        }
    }

    private void V() {
        if (this.H) {
            this.H = false;
            o1();
        }
    }

    private void X() {
        if (P) {
            for (c0 j10 : r()) {
                j10.j();
            }
        } else if (!this.f3646m.isEmpty()) {
            for (Fragment next : this.f3646m.keySet()) {
                m(next);
                Q0(next);
            }
        }
    }

    private boolean X0(String str, int i10, int i11) {
        a0(false);
        Z(true);
        Fragment fragment = this.f3654u;
        if (fragment != null && i10 < 0 && str == null && fragment.o().W0()) {
            return true;
        }
        boolean Y0 = Y0(this.I, this.J, str, i10, i11);
        if (Y0) {
            this.f3635b = true;
            try {
                d1(this.I, this.J);
            } finally {
                p();
            }
        }
        q1();
        V();
        this.f3636c.b();
        return Y0;
    }

    private void Z(boolean z10) {
        if (this.f3635b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3651r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3651r.g().getLooper()) {
            if (!z10) {
                o();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f3635b = true;
            try {
                f0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3635b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private int Z0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.A() && !aVar.y(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, booleanValue);
                this.L.add(qVar);
                aVar.C(qVar);
                if (booleanValue) {
                    aVar.t();
                } else {
                    aVar.u(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private static void c0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            a aVar = arrayList.get(i10);
            boolean z10 = true;
            if (arrayList2.get(i10).booleanValue()) {
                aVar.p(-1);
                if (i10 != i11 - 1) {
                    z10 = false;
                }
                aVar.u(z10);
            } else {
                aVar.p(1);
                aVar.t();
            }
            i10++;
        }
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i10 = this.f3650q;
        if (i10 >= 1) {
            int min = Math.min(i10, 5);
            for (Fragment next : this.f3636c.n()) {
                if (next.f3418a < min) {
                    R0(next, min);
                    if (next.I != null && !next.A && next.N) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            boolean r2 = r0.f3740r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            androidx.fragment.app.v r1 = r6.f3636c
            java.util.List r1 = r1.n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.x0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.v(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.D(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f3731i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f3650q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList<androidx.fragment.app.w$a> r1 = r1.f3725c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.w$a r7 = (androidx.fragment.app.w.a) r7
            androidx.fragment.app.Fragment r7 = r7.f3743b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.f3437t
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.v(r7)
            androidx.fragment.app.v r8 = r6.f3636c
            r8.p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f3651r
            android.content.Context r7 = r0.f()
            androidx.fragment.app.g r8 = r6.f3652s
            r13 = 0
            androidx.fragment.app.x$g r0 = r6.f3647n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.x.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            c0(r18, r19, r20, r21)
            boolean r0 = P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.w$a> r8 = r7.f3725c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.w$a> r9 = r7.f3725c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.w$a r9 = (androidx.fragment.app.w.a) r9
            androidx.fragment.app.Fragment r9 = r9.f3743b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.v(r9)
            r9.m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.w$a> r7 = r7.f3725c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.w$a r8 = (androidx.fragment.app.w.a) r8
            androidx.fragment.app.Fragment r8 = r8.f3743b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.v(r8)
            r8.m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f3650q
            r6.P0(r2, r1)
            java.util.Set r1 = r6.s(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c0 r2 = (androidx.fragment.app.c0) r2
            r2.r(r0)
            r2.p()
            r2.g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            androidx.collection.b r7 = new androidx.collection.b
            r7.<init>()
            r6.d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.Z0(r1, r2, r3, r4, r5)
            r6.N0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f3650q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f3651r
            android.content.Context r7 = r1.f()
            androidx.fragment.app.g r8 = r6.f3652s
            r1 = 1
            androidx.fragment.app.x$g r2 = r6.f3647n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.x.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f3650q
            r6.P0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f3481v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f3481v = r4
        L_0x01b6:
            r2.B()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.e1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void d1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                f0(arrayList, arrayList2);
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f3740r) {
                        if (i11 != i10) {
                            d0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f3740r) {
                                i11++;
                            }
                        }
                        d0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    d0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void e1() {
        if (this.f3645l != null) {
            for (int i10 = 0; i10 < this.f3645l.size(); i10++) {
                this.f3645l.get(i10).a();
            }
        }
    }

    private void f0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = this.L.get(i10);
            if (arrayList != null && !qVar.f3680a && (indexOf2 = arrayList.indexOf(qVar.f3681b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.L.remove(i10);
                i10--;
                size--;
                qVar.c();
            } else if (qVar.e() || (arrayList != null && qVar.f3681b.y(arrayList, 0, arrayList.size()))) {
                this.L.remove(i10);
                i10--;
                size--;
                if (arrayList == null || qVar.f3680a || (indexOf = arrayList.indexOf(qVar.f3681b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    qVar.d();
                } else {
                    qVar.c();
                }
            }
            i10++;
        }
    }

    static int g1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void k0() {
        if (P) {
            for (c0 k10 : r()) {
                k10.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean l0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3634a) {
            if (this.f3634a.isEmpty()) {
                return false;
            }
            int size = this.f3634a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f3634a.get(i10).a(arrayList, arrayList2);
            }
            this.f3634a.clear();
            this.f3651r.g().removeCallbacks(this.N);
            return z10;
        }
    }

    private void m(Fragment fragment) {
        HashSet hashSet = this.f3646m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
            hashSet.clear();
            w(fragment);
            this.f3646m.remove(fragment);
        }
    }

    private void m1(Fragment fragment) {
        ViewGroup p02 = p0(fragment);
        if (p02 != null && fragment.q() + fragment.t() + fragment.E() + fragment.F() > 0) {
            int i10 = l0.b.f19847c;
            if (p02.getTag(i10) == null) {
                p02.setTag(i10, fragment);
            }
            ((Fragment) p02.getTag(i10)).z1(fragment.D());
        }
    }

    private q n0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void o() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void o1() {
        for (u U0 : this.f3636c.k()) {
            U0(U0);
        }
    }

    private void p() {
        this.f3635b = false;
        this.J.clear();
        this.I.clear();
    }

    private ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3442y > 0 && this.f3652s.d()) {
            View c10 = this.f3652s.c(fragment.f3442y);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (m0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (I0(r3.f3653t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3641h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$o> r0 = r3.f3634a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$o> r1 = r3.f3634a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.l r1 = r3.f3641h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.l r0 = r3.f3641h
            int r1 = r3.m0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3653t
            boolean r1 = r3.I0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.q1():void");
    }

    private Set<c0> r() {
        HashSet hashSet = new HashSet();
        for (u k10 : this.f3636c.k()) {
            ViewGroup viewGroup = k10.k().H;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set<c0> s(ArrayList<a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<w.a> it = arrayList.get(i10).f3725c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3743b;
                if (!(fragment == null || (viewGroup = fragment.H) == null)) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.I != null) {
            f.d c10 = f.c(this.f3651r.f(), fragment, !fragment.A, fragment.D());
            if (c10 == null || (animator = c10.f3610b) == null) {
                if (c10 != null) {
                    fragment.I.startAnimation(c10.f3609a);
                    c10.f3609a.start();
                }
                fragment.I.setVisibility((!fragment.A || fragment.X()) ? 0 : 8);
                if (fragment.X()) {
                    fragment.w1(false);
                }
            } else {
                animator.setTarget(fragment.I);
                if (!fragment.A) {
                    fragment.I.setVisibility(0);
                } else if (fragment.X()) {
                    fragment.w1(false);
                } else {
                    ViewGroup viewGroup = fragment.H;
                    View view = fragment.I;
                    viewGroup.startViewTransition(view);
                    c10.f3610b.addListener(new h(viewGroup, view, fragment));
                }
                c10.f3610b.start();
            }
        }
        D0(fragment);
        fragment.O = false;
        fragment.w0(fragment.A);
    }

    private void w(Fragment fragment) {
        fragment.V0();
        this.f3648o.n(fragment, false);
        fragment.H = null;
        fragment.I = null;
        fragment.U = null;
        fragment.V.j(null);
        fragment.f3433p = false;
    }

    static Fragment z0(View view) {
        Object tag = view.getTag(l0.b.f19845a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void A(Configuration configuration) {
        for (Fragment next : this.f3636c.n()) {
            if (next != null) {
                next.P0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public o0 A0(Fragment fragment) {
        return this.M.l(fragment);
    }

    /* access modifiers changed from: package-private */
    public boolean B(MenuItem menuItem) {
        if (this.f3650q < 1) {
            return false;
        }
        for (Fragment next : this.f3636c.n()) {
            if (next != null && next.Q0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void B0() {
        a0(true);
        if (this.f3641h.c()) {
            W0();
        } else {
            this.f3640g.e();
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(1);
    }

    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            fragment.O = true ^ fragment.O;
            m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f3650q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment next : this.f3636c.n()) {
            if (next != null && H0(next) && next.S0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z10 = true;
            }
        }
        if (this.f3638e != null) {
            for (int i10 = 0; i10 < this.f3638e.size(); i10++) {
                Fragment fragment = this.f3638e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.s0();
                }
            }
        }
        this.f3638e = arrayList;
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (fragment.f3430m && G0(fragment)) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.f3651r = null;
        this.f3652s = null;
        this.f3653t = null;
        if (this.f3640g != null) {
            this.f3641h.d();
            this.f3640g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f3659z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    public boolean E0() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        S(1);
    }

    /* access modifiers changed from: package-private */
    public void G() {
        for (Fragment next : this.f3636c.n()) {
            if (next != null) {
                next.Y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z10) {
        for (Fragment next : this.f3636c.n()) {
            if (next != null) {
                next.Z0(z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.Z();
    }

    /* access modifiers changed from: package-private */
    public void I(Fragment fragment) {
        Iterator<r> it = this.f3649p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.f3437t;
        if (!fragment.equals(nVar.x0()) || !I0(nVar.f3653t)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean J(MenuItem menuItem) {
        if (this.f3650q < 1) {
            return false;
        }
        for (Fragment next : this.f3636c.n()) {
            if (next != null && next.a1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean J0(int i10) {
        return this.f3650q >= i10;
    }

    /* access modifiers changed from: package-private */
    public void K(Menu menu) {
        if (this.f3650q >= 1) {
            for (Fragment next : this.f3636c.n()) {
                if (next != null) {
                    next.b1(menu);
                }
            }
        }
    }

    public boolean K0() {
        return this.E || this.F;
    }

    /* access modifiers changed from: package-private */
    public void L0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f3659z != null) {
            this.C.addLast(new m(fragment.f3424g, i10));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3659z.a(intent);
            return;
        }
        this.f3651r.k(fragment, intent, i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public void M() {
        S(5);
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.A != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (F0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            androidx.activity.result.e a10 = new e.a(intentSender).b(intent2).c(i12, i11).a();
            int i14 = i10;
            this.C.addLast(new m(fragment2.f3424g, i10));
            if (F0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.A.a(a10);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        this.f3651r.l(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z10) {
        for (Fragment next : this.f3636c.n()) {
            if (next != null) {
                next.d1(z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean O(Menu menu) {
        boolean z10 = false;
        if (this.f3650q < 1) {
            return false;
        }
        for (Fragment next : this.f3636c.n()) {
            if (next != null && H0(next) && next.e1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        if (this.f3636c.c(fragment.f3424g)) {
            Q0(fragment);
            View view = fragment.I;
            if (!(view == null || !fragment.N || fragment.H == null)) {
                float f10 = fragment.P;
                if (f10 > 0.0f) {
                    view.setAlpha(f10);
                }
                fragment.P = 0.0f;
                fragment.N = false;
                f.d c10 = f.c(this.f3651r.f(), fragment, true, fragment.D());
                if (c10 != null) {
                    Animation animation = c10.f3609a;
                    if (animation != null) {
                        fragment.I.startAnimation(animation);
                    } else {
                        c10.f3610b.setTarget(fragment.I);
                        c10.f3610b.start();
                    }
                }
            }
            if (fragment.O) {
                u(fragment);
            }
        } else if (F0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3650q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public void P() {
        q1();
        L(this.f3654u);
    }

    /* access modifiers changed from: package-private */
    public void P0(int i10, boolean z10) {
        k<?> kVar;
        if (this.f3651r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f3650q) {
            this.f3650q = i10;
            if (P) {
                this.f3636c.r();
            } else {
                for (Fragment O0 : this.f3636c.n()) {
                    O0(O0);
                }
                for (u next : this.f3636c.k()) {
                    Fragment k10 = next.k();
                    if (!k10.N) {
                        O0(k10);
                    }
                    if (k10.f3431n && !k10.Y()) {
                        this.f3636c.q(next);
                    }
                }
            }
            o1();
            if (this.D && (kVar = this.f3651r) != null && this.f3650q == 7) {
                kVar.m();
                this.D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(7);
    }

    /* access modifiers changed from: package-private */
    public void Q0(Fragment fragment) {
        R0(fragment, this.f3650q);
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.v r0 = r10.f3636c
            java.lang.String r1 = r11.f3424g
            androidx.fragment.app.u r0 = r0.m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r10.f3648o
            androidx.fragment.app.v r3 = r10.f3636c
            r0.<init>(r2, r3, r11)
            r0.t(r1)
        L_0x0017:
            boolean r2 = r11.f3432o
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.f3433p
            if (r2 == 0) goto L_0x0028
            int r2 = r11.f3418a
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.f3418a
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f3646m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.m(r11)
        L_0x0047:
            int r2 = r11.f3418a
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.u()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.v()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = F0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.I
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.k<?> r2 = r10.f3651r
            boolean r2 = r2.j(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.f3421c
            if (r2 != 0) goto L_0x00c6
            r0.s()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.I
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.H
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.I
            r7.clearAnimation()
            boolean r7 = r11.c0()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f3650q
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.G
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.I
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.P
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.k<?> r2 = r10.f3651r
            android.content.Context r2 = r2.f()
            r6 = 0
            boolean r7 = r11.D()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.f.c(r2, r11, r6, r7)
        L_0x0105:
            r11.P = r8
            android.view.ViewGroup r6 = r11.H
            android.view.View r7 = r11.I
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.x$g r8 = r10.f3647n
            androidx.fragment.app.f.a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = F0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.H
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f3646m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f3646m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.f3418a
            if (r0 == r12) goto L_0x0196
            boolean r0 = F0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.f3418a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.f3418a = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.R0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void S0() {
        if (this.f3651r != null) {
            this.E = false;
            this.F = false;
            this.M.o(false);
            for (Fragment next : this.f3636c.n()) {
                if (next != null) {
                    next.f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.F = true;
        this.M.o(true);
        S(4);
    }

    /* access modifiers changed from: package-private */
    public void T0(h hVar) {
        View view;
        for (u next : this.f3636c.k()) {
            Fragment k10 = next.k();
            if (k10.f3442y == hVar.getId() && (view = k10.I) != null && view.getParent() == null) {
                k10.H = hVar;
                next.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        S(2);
    }

    /* access modifiers changed from: package-private */
    public void U0(u uVar) {
        Fragment k10 = uVar.k();
        if (!k10.J) {
            return;
        }
        if (this.f3635b) {
            this.H = true;
            return;
        }
        k10.J = false;
        if (P) {
            uVar.m();
        } else {
            Q0(k10);
        }
    }

    public void V0(int i10, int i11) {
        if (i10 >= 0) {
            Y(new p((String) null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3636c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3638e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3638e.get(i10).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f3637d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f3637d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3642i.get());
        synchronized (this.f3634a) {
            int size3 = this.f3634a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f3634a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3651r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3652s);
        if (this.f3653t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3653t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3650q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public boolean W0() {
        return X0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void Y(o oVar, boolean z10) {
        if (!z10) {
            if (this.f3651r != null) {
                o();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3634a) {
            if (this.f3651r != null) {
                this.f3634a.add(oVar);
                i1();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<a> arrayList3 = this.f3637d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3637d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f3637d.get(size2);
                    if ((str != null && str.equals(aVar.w())) || (i10 >= 0 && i10 == aVar.f3481v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f3637d.get(size2);
                        if ((str == null || !str.equals(aVar2.w())) && (i10 < 0 || i10 != aVar2.f3481v)) {
                            break;
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f3637d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3637d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f3637d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean a0(boolean z10) {
        Z(z10);
        boolean z11 = false;
        while (l0(this.I, this.J)) {
            this.f3635b = true;
            try {
                d1(this.I, this.J);
                p();
                z11 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        q1();
        V();
        this.f3636c.b();
        return z11;
    }

    public void a1(l lVar, boolean z10) {
        this.f3648o.o(lVar, z10);
    }

    /* access modifiers changed from: package-private */
    public void b0(o oVar, boolean z10) {
        if (!z10 || (this.f3651r != null && !this.G)) {
            Z(z10);
            if (oVar.a(this.I, this.J)) {
                this.f3635b = true;
                try {
                    d1(this.I, this.J);
                } finally {
                    p();
                }
            }
            q1();
            V();
            this.f3636c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void b1(Fragment fragment, androidx.core.os.e eVar) {
        HashSet hashSet = this.f3646m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f3646m.remove(fragment);
            if (fragment.f3418a < 5) {
                w(fragment);
                Q0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3436s);
        }
        boolean z10 = !fragment.Y();
        if (!fragment.B || z10) {
            this.f3636c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.f3431n = true;
            m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        if (this.f3637d == null) {
            this.f3637d = new ArrayList<>();
        }
        this.f3637d.add(aVar);
    }

    public boolean e0() {
        boolean a02 = a0(true);
        k0();
        return a02;
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, androidx.core.os.e eVar) {
        if (this.f3646m.get(fragment) == null) {
            this.f3646m.put(fragment, new HashSet());
        }
        this.f3646m.get(fragment).add(eVar);
    }

    /* access modifiers changed from: package-private */
    public void f1(Parcelable parcelable) {
        u uVar;
        if (parcelable != null) {
            p pVar = (p) parcelable;
            if (pVar.f3683a != null) {
                this.f3636c.t();
                Iterator<t> it = pVar.f3683a.iterator();
                while (it.hasNext()) {
                    t next = it.next();
                    if (next != null) {
                        Fragment h10 = this.M.h(next.f3700b);
                        if (h10 != null) {
                            if (F0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h10);
                            }
                            uVar = new u(this.f3648o, this.f3636c, h10, next);
                        } else {
                            uVar = new u(this.f3648o, this.f3636c, this.f3651r.f().getClassLoader(), q0(), next);
                        }
                        Fragment k10 = uVar.k();
                        k10.f3437t = this;
                        if (F0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k10.f3424g + "): " + k10);
                        }
                        uVar.o(this.f3651r.f().getClassLoader());
                        this.f3636c.p(uVar);
                        uVar.t(this.f3650q);
                    }
                }
                for (Fragment next2 : this.M.k()) {
                    if (!this.f3636c.c(next2.f3424g)) {
                        if (F0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + pVar.f3683a);
                        }
                        this.M.n(next2);
                        next2.f3437t = this;
                        u uVar2 = new u(this.f3648o, this.f3636c, next2);
                        uVar2.t(1);
                        uVar2.m();
                        next2.f3431n = true;
                        uVar2.m();
                    }
                }
                this.f3636c.u(pVar.f3684b);
                if (pVar.f3685c != null) {
                    this.f3637d = new ArrayList<>(pVar.f3685c.length);
                    int i10 = 0;
                    while (true) {
                        b[] bVarArr = pVar.f3685c;
                        if (i10 >= bVarArr.length) {
                            break;
                        }
                        a a10 = bVarArr[i10].a(this);
                        if (F0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + a10.f3481v + "): " + a10);
                            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                            a10.s("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3637d.add(a10);
                        i10++;
                    }
                } else {
                    this.f3637d = null;
                }
                this.f3642i.set(pVar.f3686d);
                String str = pVar.f3687f;
                if (str != null) {
                    Fragment g02 = g0(str);
                    this.f3654u = g02;
                    L(g02);
                }
                ArrayList<String> arrayList = pVar.f3688g;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        Bundle bundle = pVar.f3689h.get(i11);
                        bundle.setClassLoader(this.f3651r.f().getClassLoader());
                        this.f3643j.put(arrayList.get(i11), bundle);
                    }
                }
                this.C = new ArrayDeque<>(pVar.f3690i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public u g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u v10 = v(fragment);
        fragment.f3437t = this;
        this.f3636c.p(v10);
        if (!fragment.B) {
            this.f3636c.a(fragment);
            fragment.f3431n = false;
            if (fragment.I == null) {
                fragment.O = false;
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
        return v10;
    }

    /* access modifiers changed from: package-private */
    public Fragment g0(String str) {
        return this.f3636c.f(str);
    }

    public void h(r rVar) {
        this.f3649p.add(rVar);
    }

    public Fragment h0(int i10) {
        return this.f3636c.g(i10);
    }

    /* access modifiers changed from: package-private */
    public Parcelable h1() {
        int size;
        k0();
        X();
        a0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<t> v10 = this.f3636c.v();
        b[] bVarArr = null;
        if (v10.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w10 = this.f3636c.w();
        ArrayList<a> arrayList = this.f3637d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new b(this.f3637d.get(i10));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f3637d.get(i10));
                }
            }
        }
        p pVar = new p();
        pVar.f3683a = v10;
        pVar.f3684b = w10;
        pVar.f3685c = bVarArr;
        pVar.f3686d = this.f3642i.get();
        Fragment fragment = this.f3654u;
        if (fragment != null) {
            pVar.f3687f = fragment.f3424g;
        }
        pVar.f3688g.addAll(this.f3643j.keySet());
        pVar.f3689h.addAll(this.f3643j.values());
        pVar.f3690i = new ArrayList<>(this.C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f3642i.getAndIncrement();
    }

    public Fragment i0(String str) {
        return this.f3636c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        synchronized (this.f3634a) {
            ArrayList<q> arrayList = this.L;
            boolean z10 = false;
            boolean z11 = arrayList != null && !arrayList.isEmpty();
            if (this.f3634a.size() == 1) {
                z10 = true;
            }
            if (z11 || z10) {
                this.f3651r.g().removeCallbacks(this.N);
                this.f3651r.g().post(this.N);
                q1();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f3651r
            if (r0 != 0) goto L_0x0108
            r2.f3651r = r3
            r2.f3652s = r4
            r2.f3653t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r5)
            r2.h(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.r
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.r) r4
            r2.h(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.f3653t
            if (r4 == 0) goto L_0x0026
            r2.q1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.n
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.n r4 = (androidx.activity.n) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f3640g = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.l r1 = r2.f3641h
            r0.b(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.n r3 = r5.f3437t
            androidx.fragment.app.q r3 = r3.n0(r5)
            r2.M = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.p0
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.p0 r3 = (androidx.lifecycle.p0) r3
            androidx.lifecycle.o0 r3 = r3.getViewModelStore()
            androidx.fragment.app.q r3 = androidx.fragment.app.q.j(r3)
            r2.M = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            r2.M = r3
        L_0x005f:
            androidx.fragment.app.q r3 = r2.M
            boolean r4 = r2.K0()
            r3.o(r4)
            androidx.fragment.app.v r3 = r2.f3636c
            androidx.fragment.app.q r4 = r2.M
            r3.x(r4)
            androidx.fragment.app.k<?> r3 = r2.f3651r
            boolean r4 = r3 instanceof androidx.activity.result.d
            if (r4 == 0) goto L_0x0107
            androidx.activity.result.d r3 = (androidx.activity.result.d) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f3424g
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = ""
        L_0x0093:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            g.c r0 = new g.c
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.f3659z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            g.b r5 = new g.b
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.j(r4, r5, r0)
            r2.B = r3
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.j(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public Fragment j0(String str) {
        return this.f3636c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void j1(Fragment fragment, boolean z10) {
        ViewGroup p02 = p0(fragment);
        if (p02 != null && (p02 instanceof h)) {
            ((h) p02).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (!fragment.f3430m) {
                this.f3636c.a(fragment);
                if (F0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (G0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k1(Fragment fragment, i.b bVar) {
        if (!fragment.equals(g0(fragment.f3424g)) || !(fragment.f3438u == null || fragment.f3437t == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.S = bVar;
    }

    public w l() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public void l1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.f3424g)) && (fragment.f3438u == null || fragment.f3437t == this))) {
            Fragment fragment2 = this.f3654u;
            this.f3654u = fragment;
            L(fragment2);
            L(this.f3654u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public int m0() {
        ArrayList<a> arrayList = this.f3637d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z10 = false;
        for (Fragment next : this.f3636c.l()) {
            if (next != null) {
                z10 = G0(next);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.O = !fragment.O;
        }
    }

    /* access modifiers changed from: package-private */
    public g o0() {
        return this.f3652s;
    }

    public void p1(l lVar) {
        this.f3648o.p(lVar);
    }

    public final void q(String str) {
        this.f3643j.remove(str);
    }

    public j q0() {
        j jVar = this.f3655v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f3653t;
        if (fragment != null) {
            return fragment.f3437t.q0();
        }
        return this.f3656w;
    }

    /* access modifiers changed from: package-private */
    public v r0() {
        return this.f3636c;
    }

    public List<Fragment> s0() {
        return this.f3636c.n();
    }

    /* access modifiers changed from: package-private */
    public void t(a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.u(z12);
        } else {
            aVar.t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f3650q >= 1) {
            x.B(this.f3651r.f(), this.f3652s, arrayList, arrayList2, 0, 1, true, this.f3647n);
        }
        if (z12) {
            P0(this.f3650q, true);
        }
        for (Fragment next : this.f3636c.l()) {
            if (next != null && next.I != null && next.N && aVar.x(next.f3442y)) {
                float f10 = next.P;
                if (f10 > 0.0f) {
                    next.I.setAlpha(f10);
                }
                if (z12) {
                    next.P = 0.0f;
                } else {
                    next.P = -1.0f;
                    next.N = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public k<?> t0() {
        return this.f3651r;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f3653t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3653t)));
            sb2.append("}");
        } else {
            k<?> kVar = this.f3651r;
            if (kVar != null) {
                sb2.append(kVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3651r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 u0() {
        return this.f3639f;
    }

    /* access modifiers changed from: package-private */
    public u v(Fragment fragment) {
        u m10 = this.f3636c.m(fragment.f3424g);
        if (m10 != null) {
            return m10;
        }
        u uVar = new u(this.f3648o, this.f3636c, fragment);
        uVar.o(this.f3651r.f().getClassLoader());
        uVar.t(this.f3650q);
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public m v0() {
        return this.f3648o;
    }

    /* access modifiers changed from: package-private */
    public Fragment w0() {
        return this.f3653t;
    }

    /* access modifiers changed from: package-private */
    public void x(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.B) {
            fragment.B = true;
            if (fragment.f3430m) {
                if (F0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3636c.s(fragment);
                if (G0(fragment)) {
                    this.D = true;
                }
                m1(fragment);
            }
        }
    }

    public Fragment x0() {
        return this.f3654u;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(4);
    }

    /* access modifiers changed from: package-private */
    public d0 y0() {
        d0 d0Var = this.f3657x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f3653t;
        if (fragment != null) {
            return fragment.f3437t.y0();
        }
        return this.f3658y;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(0);
    }

    /* compiled from: FragmentManager */
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f3674a;

        /* renamed from: b  reason: collision with root package name */
        int f3675b;

        /* compiled from: FragmentManager */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            /* renamed from: b */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(String str, int i10) {
            this.f3674a = str;
            this.f3675b = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3674a);
            parcel.writeInt(this.f3675b);
        }

        m(Parcel parcel) {
            this.f3674a = parcel.readString();
            this.f3675b = parcel.readInt();
        }
    }
}
