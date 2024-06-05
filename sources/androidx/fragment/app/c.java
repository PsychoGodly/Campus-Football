package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.core.view.a0;
import androidx.core.view.d0;
import androidx.core.view.x;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultSpecialEffectsController */
class c extends c0 {

    /* compiled from: DefaultSpecialEffectsController */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3502a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.c0$e$c[] r0 = androidx.fragment.app.c0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3502a = r0
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3502a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3502a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3502a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.<clinit>():void");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f3503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0.e f3504b;

        b(List list, c0.e eVar) {
            this.f3503a = list;
            this.f3504b = eVar;
        }

        public void run() {
            if (this.f3503a.contains(this.f3504b)) {
                this.f3503a.remove(this.f3504b);
                c.this.s(this.f3504b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultSpecialEffectsController */
    class C0054c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3506a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3507b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3508c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0.e f3509d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f3510e;

        C0054c(ViewGroup viewGroup, View view, boolean z10, c0.e eVar, k kVar) {
            this.f3506a = viewGroup;
            this.f3507b = view;
            this.f3508c = z10;
            this.f3509d = eVar;
            this.f3510e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3506a.endViewTransition(this.f3507b);
            if (this.f3508c) {
                this.f3509d.e().a(this.f3507b);
            }
            this.f3510e.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f3512a;

        d(Animator animator) {
            this.f3512a = animator;
        }

        public void a() {
            this.f3512a.end();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3515b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3516c;

        /* compiled from: DefaultSpecialEffectsController */
        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f3514a.endViewTransition(eVar.f3515b);
                e.this.f3516c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3514a = viewGroup;
            this.f3515b = view;
            this.f3516c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3514a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3521c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3519a = view;
            this.f3520b = viewGroup;
            this.f3521c = kVar;
        }

        public void a() {
            this.f3519a.clearAnimation();
            this.f3520b.endViewTransition(this.f3519a);
            this.f3521c.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0.e f3523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0.e f3524b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3525c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3526d;

        g(c0.e eVar, c0.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.f3523a = eVar;
            this.f3524b = eVar2;
            this.f3525c = z10;
            this.f3526d = aVar;
        }

        public void run() {
            x.f(this.f3523a.f(), this.f3524b.f(), this.f3525c, this.f3526d, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f3528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f3530c;

        h(z zVar, View view, Rect rect) {
            this.f3528a = zVar;
            this.f3529b = view;
            this.f3530c = rect;
        }

        public void run() {
            this.f3528a.k(this.f3529b, this.f3530c);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3532a;

        i(ArrayList arrayList) {
            this.f3532a = arrayList;
        }

        public void run() {
            x.A(this.f3532a, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f3534a;

        j(m mVar) {
            this.f3534a = mVar;
        }

        public void run() {
            this.f3534a.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f3536c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3537d = false;

        /* renamed from: e  reason: collision with root package name */
        private f.d f3538e;

        k(c0.e eVar, androidx.core.os.e eVar2, boolean z10) {
            super(eVar, eVar2);
            this.f3536c = z10;
        }

        /* access modifiers changed from: package-private */
        public f.d e(Context context) {
            if (this.f3537d) {
                return this.f3538e;
            }
            f.d c10 = f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.f3536c);
            this.f3538e = c10;
            this.f3537d = true;
            return c10;
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class l {

        /* renamed from: a  reason: collision with root package name */
        private final c0.e f3539a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.e f3540b;

        l(c0.e eVar, androidx.core.os.e eVar2) {
            this.f3539a = eVar;
            this.f3540b = eVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3539a.d(this.f3540b);
        }

        /* access modifiers changed from: package-private */
        public c0.e b() {
            return this.f3539a;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.os.e c() {
            return this.f3540b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.c0.e.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.c0$e r0 = r3.f3539a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.I
                androidx.fragment.app.c0$e$c r0 = androidx.fragment.app.c0.e.c.d(r0)
                androidx.fragment.app.c0$e r1 = r3.f3539a
                androidx.fragment.app.c0$e$c r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.c0$e$c r2 = androidx.fragment.app.c0.e.c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.l.d():boolean");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f3541c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3542d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f3543e;

        m(c0.e eVar, androidx.core.os.e eVar2, boolean z10, boolean z11) {
            super(eVar, eVar2);
            Object obj;
            Object obj2;
            boolean z12;
            if (eVar.e() == c0.e.c.VISIBLE) {
                if (z10) {
                    obj2 = eVar.f().H();
                } else {
                    obj2 = eVar.f().r();
                }
                this.f3541c = obj2;
                if (z10) {
                    z12 = eVar.f().k();
                } else {
                    z12 = eVar.f().j();
                }
                this.f3542d = z12;
            } else {
                if (z10) {
                    obj = eVar.f().J();
                } else {
                    obj = eVar.f().u();
                }
                this.f3541c = obj;
                this.f3542d = true;
            }
            if (!z11) {
                this.f3543e = null;
            } else if (z10) {
                this.f3543e = eVar.f().L();
            } else {
                this.f3543e = eVar.f().K();
            }
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f3751b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.f3752c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public z e() {
            z f10 = f(this.f3541c);
            z f11 = f(this.f3543e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f3541c + " which uses a different Transition  type than its shared element transition " + this.f3543e);
        }

        public Object g() {
            return this.f3543e;
        }

        /* access modifiers changed from: package-private */
        public Object h() {
            return this.f3541c;
        }

        public boolean i() {
            return this.f3543e != null;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f3542d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z10, Map<c0.e, Boolean> map) {
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k next : list) {
            if (next.d()) {
                next.a();
            } else {
                f.d e10 = next.e(context);
                if (e10 == null) {
                    next.a();
                } else {
                    Animator animator = e10.f3610b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        c0.e b10 = next.b();
                        Fragment f10 = b10.f();
                        if (Boolean.TRUE.equals(map.get(b10))) {
                            if (n.F0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z12 = b10.e() == c0.e.c.GONE;
                            List<c0.e> list3 = list2;
                            if (z12) {
                                list3.remove(b10);
                            }
                            View view = f10.I;
                            m10.startViewTransition(view);
                            C0054c cVar = r0;
                            C0054c cVar2 = new C0054c(m10, view, z12, b10, next);
                            animator.addListener(cVar);
                            animator.setTarget(view);
                            animator.start();
                            next.c().c(new d(animator));
                            z11 = true;
                        }
                    }
                }
            }
            Map<c0.e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            c0.e b11 = kVar.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z11) {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view2 = f11.I;
                Animation animation = (Animation) androidx.core.util.h.f(((f.d) androidx.core.util.h.f(kVar.e(context))).f3609a);
                if (b11.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                } else {
                    m10.startViewTransition(view2);
                    f.e eVar = new f.e(animation, m10, view2);
                    eVar.setAnimationListener(new e(m10, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.c().c(new f(view2, m10, kVar));
            }
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z10, c0.e eVar, c0.e eVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        c0.e eVar3;
        c0.e eVar4;
        Object obj2;
        Object obj3;
        androidx.collection.a aVar;
        c0.e eVar5;
        z zVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        c0.e eVar6;
        ArrayList arrayList4;
        boolean z11 = z10;
        c0.e eVar7 = eVar;
        c0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        z zVar2 = null;
        for (m next : list) {
            if (!next.d()) {
                z e10 = next.e();
                if (zVar2 == null) {
                    zVar2 = e10;
                } else if (!(e10 == null || zVar2 == e10)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.b().f() + " returned Transition " + next.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (m next2 : list) {
                hashMap.put(next2.b(), Boolean.FALSE);
                next2.a();
            }
            return hashMap;
        }
        View view4 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj4 = null;
        View view5 = null;
        boolean z12 = false;
        for (m next3 : list) {
            if (!next3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar6 = eVar7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                zVar = zVar2;
                eVar5 = eVar8;
                view5 = view5;
            } else {
                Object B = zVar2.B(zVar2.g(next3.g()));
                ArrayList<String> M = eVar2.f().M();
                ArrayList<String> M2 = eVar.f().M();
                ArrayList<String> N = eVar.f().N();
                Object obj5 = B;
                View view6 = view5;
                int i10 = 0;
                while (i10 < N.size()) {
                    int indexOf = M.indexOf(N.get(i10));
                    ArrayList<String> arrayList7 = N;
                    if (indexOf != -1) {
                        M.set(indexOf, M2.get(i10));
                    }
                    i10++;
                    N = arrayList7;
                }
                ArrayList<String> N2 = eVar2.f().N();
                if (!z11) {
                    eVar.f().v();
                    eVar2.f().s();
                } else {
                    eVar.f().s();
                    eVar2.f().v();
                }
                int i11 = 0;
                for (int size = M.size(); i11 < size; size = size) {
                    aVar2.put(M.get(i11), N2.get(i11));
                    i11++;
                }
                androidx.collection.a aVar3 = new androidx.collection.a();
                u(aVar3, eVar.f().I);
                aVar3.p(M);
                aVar2.p(aVar3.keySet());
                androidx.collection.a aVar4 = new androidx.collection.a();
                u(aVar4, eVar2.f().I);
                aVar4.p(N2);
                aVar4.p(aVar2.values());
                x.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar6 = eVar7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    view5 = view6;
                    obj4 = null;
                    eVar5 = eVar8;
                } else {
                    x.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    ArrayList<String> arrayList8 = M;
                    g gVar = r0;
                    ViewGroup m10 = m();
                    Object obj6 = obj5;
                    androidx.collection.a aVar5 = aVar4;
                    View view7 = view6;
                    androidx.collection.a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    g gVar2 = new g(eVar2, eVar, z10, aVar5);
                    x.a(m10, gVar2);
                    arrayList5.addAll(aVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList8.get(0));
                        zVar2.v(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!N2.isEmpty()) {
                        View view9 = (View) aVar5.get(N2.get(0));
                        if (view9 != null) {
                            x.a(m(), new h(zVar2, view9, rect2));
                            z12 = true;
                        }
                    }
                    zVar2.z(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    zVar2.t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            eVar7 = eVar6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList4;
            zVar2 = zVar;
        }
        View view10 = view5;
        androidx.collection.a aVar7 = aVar2;
        ArrayList arrayList10 = arrayList6;
        c0.e eVar9 = eVar7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        z zVar3 = zVar2;
        c0.e eVar10 = eVar8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (m next4 : list) {
            if (next4.d()) {
                hashMap.put(next4.b(), Boolean.FALSE);
                next4.a();
            } else {
                Object g10 = zVar3.g(next4.h());
                c0.e b10 = next4.b();
                boolean z13 = obj4 != null && (b10 == eVar9 || b10 == eVar10);
                if (g10 == null) {
                    if (!z13) {
                        hashMap.put(b10, Boolean.FALSE);
                        next4.a();
                    }
                    List<c0.e> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    eVar3 = eVar10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    t(arrayList13, b10.f().I);
                    if (z13) {
                        if (b10 == eVar9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        zVar3.a(g10, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        eVar4 = b10;
                        obj3 = obj8;
                        eVar3 = eVar10;
                        List<c0.e> list4 = list2;
                        obj2 = obj9;
                    } else {
                        zVar3.b(g10, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        c0.e eVar11 = b10;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        eVar3 = eVar10;
                        zVar3.t(g10, g10, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar11.e() == c0.e.c.GONE) {
                            eVar4 = eVar11;
                            list2.remove(eVar4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(eVar4.f().I);
                            zVar3.r(g10, eVar4.f().I, arrayList14);
                            x.a(m(), new i(arrayList13));
                        } else {
                            List<c0.e> list5 = list2;
                            eVar4 = eVar11;
                        }
                    }
                    if (eVar4.e() == c0.e.c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z12) {
                            zVar3.u(g10, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        zVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.j()) {
                        obj8 = zVar3.n(obj3, g10, (Object) null);
                        obj = obj2;
                    } else {
                        obj = zVar3.n(obj2, g10, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar10 = eVar3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        c0.e eVar12 = eVar10;
        Object m11 = zVar3.m(obj8, obj7, obj4);
        for (m next5 : list) {
            if (!next5.d()) {
                Object h10 = next5.h();
                c0.e b11 = next5.b();
                boolean z14 = obj4 != null && (b11 == eVar9 || b11 == eVar12);
                if (h10 != null || z14) {
                    if (!a0.R(m())) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                        }
                        next5.a();
                    } else {
                        zVar3.w(next5.b().f(), m11, next5.c(), new j(next5));
                    }
                }
            }
        }
        if (!a0.R(m())) {
            return hashMap;
        }
        x.A(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> o10 = zVar3.o(arrayList17);
        zVar3.c(m(), m11);
        zVar3.y(m(), arrayList16, arrayList17, o10, aVar7);
        x.A(arrayList12, 0);
        zVar3.A(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void f(List<c0.e> list, boolean z10) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e next : list) {
            c0.e.c d10 = c0.e.c.d(next.f().I);
            int i10 = a.f3502a[next.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (d10 == c0.e.c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i10 == 4 && d10 != c0.e.c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0.e> arrayList3 = new ArrayList<>(list);
        for (c0.e next2 : list) {
            androidx.core.os.e eVar3 = new androidx.core.os.e();
            next2.j(eVar3);
            arrayList.add(new k(next2, eVar3, z10));
            androidx.core.os.e eVar4 = new androidx.core.os.e();
            next2.j(eVar4);
            boolean z11 = false;
            if (z10) {
                if (next2 != eVar) {
                    arrayList2.add(new m(next2, eVar4, z10, z11));
                    next2.a(new b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new m(next2, eVar4, z10, z11));
                next2.a(new b(arrayList3, next2));
            }
            z11 = true;
            arrayList2.add(new m(next2, eVar4, z10, z11));
            next2.a(new b(arrayList3, next2));
        }
        Map<c0.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (c0.e s10 : arrayList3) {
            s(s10);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(c0.e eVar) {
        eVar.e().a(eVar.f().I);
    }

    /* access modifiers changed from: package-private */
    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!d0.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Map<String, View> map, View view) {
        String J = a0.J(view);
        if (J != null) {
            map.put(J, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(a0.J((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
