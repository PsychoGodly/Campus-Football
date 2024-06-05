package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.core.view.a0;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpecialEffectsController */
abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f3544a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f3545b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f3546c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f3547d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f3548e = false;

    /* compiled from: SpecialEffectsController */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3549a;

        a(d dVar) {
            this.f3549a = dVar;
        }

        public void run() {
            if (c0.this.f3545b.contains(this.f3549a)) {
                this.f3549a.e().a(this.f3549a.f().I);
            }
        }
    }

    /* compiled from: SpecialEffectsController */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3551a;

        b(d dVar) {
            this.f3551a = dVar;
        }

        public void run() {
            c0.this.f3545b.remove(this.f3551a);
            c0.this.f3546c.remove(this.f3551a);
        }
    }

    /* compiled from: SpecialEffectsController */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3553a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3554b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.c0$e$b[] r0 = androidx.fragment.app.c0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3554b = r0
                r1 = 1
                androidx.fragment.app.c0$e$b r2 = androidx.fragment.app.c0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3554b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$b r3 = androidx.fragment.app.c0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3554b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$b r4 = androidx.fragment.app.c0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.c0$e$c[] r3 = androidx.fragment.app.c0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3553a = r3
                androidx.fragment.app.c0$e$c r4 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3553a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.c0$e$c r3 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3553a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3553a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c0.c.<clinit>():void");
        }
    }

    /* compiled from: SpecialEffectsController */
    private static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final u f3555h;

        d(e.c cVar, e.b bVar, u uVar, androidx.core.os.e eVar) {
            super(cVar, bVar, uVar.k(), eVar);
            this.f3555h = uVar;
        }

        public void c() {
            super.c();
            this.f3555h.m();
        }

        /* access modifiers changed from: package-private */
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f3555h.k();
                View findFocus = k10.I.findFocus();
                if (findFocus != null) {
                    k10.v1(findFocus);
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View n12 = f().n1();
                if (n12.getParent() == null) {
                    this.f3555h.b();
                    n12.setAlpha(0.0f);
                }
                if (n12.getAlpha() == 0.0f && n12.getVisibility() == 0) {
                    n12.setVisibility(4);
                }
                n12.setAlpha(k10.G());
            }
        }
    }

    /* compiled from: SpecialEffectsController */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f3556a;

        /* renamed from: b  reason: collision with root package name */
        private b f3557b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f3558c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f3559d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<androidx.core.os.e> f3560e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f3561f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3562g = false;

        /* compiled from: SpecialEffectsController */
        class a implements e.b {
            a() {
            }

            public void a() {
                e.this.b();
            }
        }

        /* compiled from: SpecialEffectsController */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c c(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            static c d(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return c(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void a(View view) {
                int i10 = c.f3553a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i10 == 2) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i10 == 4) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f3556a = cVar;
            this.f3557b = bVar;
            this.f3558c = fragment;
            eVar.c(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f3559d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!h()) {
                this.f3561f = true;
                if (this.f3560e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f3560e).iterator();
                while (it.hasNext()) {
                    ((androidx.core.os.e) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f3562g) {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f3562g = true;
                for (Runnable run : this.f3559d) {
                    run.run();
                }
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f3560e.remove(eVar) && this.f3560e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f3556a;
        }

        public final Fragment f() {
            return this.f3558c;
        }

        /* access modifiers changed from: package-private */
        public b g() {
            return this.f3557b;
        }

        /* access modifiers changed from: package-private */
        public final boolean h() {
            return this.f3561f;
        }

        /* access modifiers changed from: package-private */
        public final boolean i() {
            return this.f3562g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f3560e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        public final void k(c cVar, b bVar) {
            int i10 = c.f3554b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3558c + " mFinalState = " + this.f3556a + " -> REMOVED. mLifecycleImpact  = " + this.f3557b + " to REMOVING.");
                    }
                    this.f3556a = c.REMOVED;
                    this.f3557b = b.REMOVING;
                } else if (i10 == 3 && this.f3556a != c.REMOVED) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3558c + " mFinalState = " + this.f3556a + " -> " + cVar + ". ");
                    }
                    this.f3556a = cVar;
                }
            } else if (this.f3556a == c.REMOVED) {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3558c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3557b + " to ADDING.");
                }
                this.f3556a = c.VISIBLE;
                this.f3557b = b.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f3556a + "} " + "{" + "mLifecycleImpact = " + this.f3557b + "} " + "{" + "mFragment = " + this.f3558c + "}";
        }
    }

    c0(ViewGroup viewGroup) {
        this.f3544a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.f3545b) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            e h10 = h(uVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, eVar);
            this.f3545b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f3545b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f3546c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.y0());
    }

    static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i10 = l0.b.f19846b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 a10 = d0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f3545b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.c(next.f().n1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(e.c cVar, u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public void d(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void e(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(List<e> list, boolean z10);

    /* access modifiers changed from: package-private */
    public void g() {
        if (!this.f3548e) {
            if (!a0.Q(this.f3544a)) {
                j();
                this.f3547d = false;
                return;
            }
            synchronized (this.f3545b) {
                if (!this.f3545b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3546c);
                    this.f3546c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f3546c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f3545b);
                    this.f3545b.clear();
                    this.f3546c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f3547d);
                    this.f3547d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean Q = a0.Q(this.f3544a);
        synchronized (this.f3545b) {
            q();
            Iterator<e> it = this.f3545b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f3546c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (Q) {
                        str2 = MaxReward.DEFAULT_LABEL;
                    } else {
                        str2 = "Container " + this.f3544a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f3545b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.F0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (Q) {
                        str = MaxReward.DEFAULT_LABEL;
                    } else {
                        str = "Container " + this.f3544a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f3548e) {
            this.f3548e = false;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public e.b l(u uVar) {
        e h10 = h(uVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(uVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f3544a;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f3545b) {
            q();
            this.f3548e = false;
            int size = this.f3545b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3545b.get(size);
                e.c d10 = e.c.d(eVar.f().I);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && d10 != cVar) {
                    this.f3548e = eVar.f().a0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f3547d = z10;
    }
}
