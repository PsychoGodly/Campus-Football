package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition */
class x {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f3750a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final z f3751b = (Build.VERSION.SDK_INT >= 21 ? new y() : null);

    /* renamed from: c  reason: collision with root package name */
    static final z f3752c = w();

    /* compiled from: FragmentTransition */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3754b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3755c;

        a(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f3753a = gVar;
            this.f3754b = fragment;
            this.f3755c = eVar;
        }

        public void run() {
            this.f3753a.a(this.f3754b, this.f3755c);
        }
    }

    /* compiled from: FragmentTransition */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3756a;

        b(ArrayList arrayList) {
            this.f3756a = arrayList;
        }

        public void run() {
            x.A(this.f3756a, 4);
        }
    }

    /* compiled from: FragmentTransition */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3758b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3759c;

        c(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f3757a = gVar;
            this.f3758b = fragment;
            this.f3759c = eVar;
        }

        public void run() {
            this.f3757a.a(this.f3758b, this.f3759c);
        }
    }

    /* compiled from: FragmentTransition */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f3760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f3761b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3762c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f3763d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3764f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f3765g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f3766h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f3767i;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3760a = obj;
            this.f3761b = zVar;
            this.f3762c = view;
            this.f3763d = fragment;
            this.f3764f = arrayList;
            this.f3765g = arrayList2;
            this.f3766h = arrayList3;
            this.f3767i = obj2;
        }

        public void run() {
            Object obj = this.f3760a;
            if (obj != null) {
                this.f3761b.p(obj, this.f3762c);
                this.f3765g.addAll(x.k(this.f3761b, this.f3760a, this.f3763d, this.f3764f, this.f3762c));
            }
            if (this.f3766h != null) {
                if (this.f3767i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3762c);
                    this.f3761b.q(this.f3767i, this.f3766h, arrayList);
                }
                this.f3766h.clear();
                this.f3766h.add(this.f3762c);
            }
        }
    }

    /* compiled from: FragmentTransition */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3770c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3771d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f3772f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z f3773g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Rect f3774h;

        e(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar, View view, z zVar, Rect rect) {
            this.f3768a = fragment;
            this.f3769b = fragment2;
            this.f3770c = z10;
            this.f3771d = aVar;
            this.f3772f = view;
            this.f3773g = zVar;
            this.f3774h = rect;
        }

        public void run() {
            x.f(this.f3768a, this.f3769b, this.f3770c, this.f3771d, false);
            View view = this.f3772f;
            if (view != null) {
                this.f3773g.k(view, this.f3774h);
            }
        }
    }

    /* compiled from: FragmentTransition */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f3775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f3777c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f3778d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3779f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f3780g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f3781h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Fragment f3782i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f3783j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f3784k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f3785l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Rect f3786m;

        f(z zVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3775a = zVar;
            this.f3776b = aVar;
            this.f3777c = obj;
            this.f3778d = hVar;
            this.f3779f = arrayList;
            this.f3780g = view;
            this.f3781h = fragment;
            this.f3782i = fragment2;
            this.f3783j = z10;
            this.f3784k = arrayList2;
            this.f3785l = obj2;
            this.f3786m = rect;
        }

        public void run() {
            androidx.collection.a<String, View> h10 = x.h(this.f3775a, this.f3776b, this.f3777c, this.f3778d);
            if (h10 != null) {
                this.f3779f.addAll(h10.values());
                this.f3779f.add(this.f3780g);
            }
            x.f(this.f3781h, this.f3782i, this.f3783j, h10, false);
            Object obj = this.f3777c;
            if (obj != null) {
                this.f3775a.A(obj, this.f3784k, this.f3779f);
                View s10 = x.s(h10, this.f3778d, this.f3785l, this.f3783j);
                if (s10 != null) {
                    this.f3775a.k(s10, this.f3786m);
                }
            }
        }
    }

    /* compiled from: FragmentTransition */
    interface g {
        void a(Fragment fragment, androidx.core.os.e eVar);

        void b(Fragment fragment, androidx.core.os.e eVar);
    }

    /* compiled from: FragmentTransition */
    static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f3787a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3788b;

        /* renamed from: c  reason: collision with root package name */
        public a f3789c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f3790d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3791e;

        /* renamed from: f  reason: collision with root package name */
        public a f3792f;

        h() {
        }
    }

    static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i10);
            }
        }
    }

    static void B(Context context, g gVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                androidx.collection.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (gVar.d() && (viewGroup = (ViewGroup) gVar.c(keyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, d10, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View n10 = aVar.n(size);
            if (collection.contains(a0.J(n10))) {
                arrayList.add(n10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f3430m != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.A == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.w.a r9, android.util.SparseArray<androidx.fragment.app.x.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3743b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f3442y
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3750a
            int r9 = r9.f3742a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3742a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.O
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.A
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f3430m
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.A
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.O
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3430m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.A
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f3430m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.A
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.f3430m
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.I
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.P
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.f3430m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.A
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.N
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.f3430m
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.A
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0092:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.x$h r5 = (androidx.fragment.app.x.h) r5
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.x$h r5 = p(r5, r10, r1)
            r5.f3787a = r0
            r5.f3788b = r11
            r5.f3789c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r3 = r5.f3790d
            if (r3 != r0) goto L_0x00b1
            r5.f3790d = r2
        L_0x00b1:
            boolean r3 = r8.f3740r
            if (r3 != 0) goto L_0x00c5
            androidx.fragment.app.n r3 = r8.f3479t
            androidx.fragment.app.u r6 = r3.v(r0)
            androidx.fragment.app.v r7 = r3.r0()
            r7.p(r6)
            r3.Q0(r0)
        L_0x00c5:
            if (r4 == 0) goto L_0x00d7
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r3 = r5.f3790d
            if (r3 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.x$h r5 = p(r5, r10, r1)
            r5.f3790d = r0
            r5.f3791e = r11
            r5.f3792f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r5.f3787a
            if (r8 != r0) goto L_0x00e3
            r5.f3787a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f3725c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f3725c.get(i10), sparseArray, false, z10);
        }
    }

    private static androidx.collection.a<String, String> d(int i10, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            a aVar2 = arrayList.get(i13);
            if (aVar2.x(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3738p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3738p;
                        arrayList4 = aVar2.f3739q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3738p;
                        arrayList3 = aVar2.f3739q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.f3479t.o0().d()) {
            for (int size = aVar.f3725c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f3725c.get(size), sparseArray, true, z10);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.s();
        } else {
            fragment.s();
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a<String, View> h(z zVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3787a;
        View Q = fragment.Q();
        if (aVar.isEmpty() || obj == null || Q == null) {
            aVar.clear();
            return null;
        }
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        zVar.j(aVar2, Q);
        a aVar3 = hVar.f3789c;
        if (hVar.f3788b) {
            fragment.v();
            arrayList = aVar3.f3738p;
        } else {
            fragment.s();
            arrayList = aVar3.f3739q;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
            aVar2.p(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static androidx.collection.a<String, View> i(z zVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3790d;
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        zVar.j(aVar2, fragment.n1());
        a aVar3 = hVar.f3792f;
        if (hVar.f3791e) {
            fragment.s();
            arrayList = aVar3.f3739q;
        } else {
            fragment.v();
            arrayList = aVar3.f3738p;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
        }
        aVar.p(aVar2.keySet());
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object u10 = fragment.u();
            if (u10 != null) {
                arrayList.add(u10);
            }
            Object J = fragment.J();
            if (J != null) {
                arrayList.add(J);
            }
            Object L = fragment.L();
            if (L != null) {
                arrayList.add(L);
            }
        }
        if (fragment2 != null) {
            Object r10 = fragment2.r();
            if (r10 != null) {
                arrayList.add(r10);
            }
            Object H = fragment2.H();
            if (H != null) {
                arrayList.add(H);
            }
            Object K = fragment2.K();
            if (K != null) {
                arrayList.add(K);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = f3751b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = f3752c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View Q = fragment.Q();
        if (Q != null) {
            zVar.f(arrayList2, Q);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        androidx.collection.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        z zVar2 = zVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3787a;
        Fragment fragment2 = hVar2.f3790d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar2.f3788b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = t(zVar2, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        androidx.collection.a<String, View> i10 = i(zVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i10.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj4 != null) {
            rect = new Rect();
            zVar2.z(obj4, view, arrayList3);
            z(zVar, obj4, obj2, i10, hVar2.f3791e, hVar2.f3792f);
            if (obj5 != null) {
                zVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(zVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect);
        androidx.core.view.x.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        z zVar2 = zVar;
        View view3 = view;
        androidx.collection.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3787a;
        Fragment fragment2 = hVar2.f3790d;
        if (fragment != null) {
            fragment.n1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar2.f3788b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = t(zVar, fragment, fragment2, z10);
        }
        androidx.collection.a<String, View> i10 = i(zVar, aVar2, obj3, hVar2);
        androidx.collection.a<String, View> h10 = h(zVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj4 = null;
        } else {
            a(arrayList3, i10, aVar.keySet());
            a(arrayList4, h10, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            zVar.z(obj4, view3, arrayList3);
            z(zVar, obj4, obj2, i10, hVar2.f3791e, hVar2.f3792f);
            Rect rect2 = new Rect();
            View s10 = s(h10, hVar2, obj5, z10);
            if (s10 != null) {
                zVar.u(obj5, rect2);
            }
            rect = rect2;
            view2 = s10;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.x.a(viewGroup, new e(fragment, fragment2, z10, h10, view2, zVar, rect));
        return obj4;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        h hVar2 = hVar;
        View view2 = view;
        androidx.collection.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f3787a;
        Fragment fragment2 = hVar2.f3790d;
        z j10 = j(fragment2, fragment);
        if (j10 != null) {
            boolean z10 = hVar2.f3788b;
            boolean z11 = hVar2.f3791e;
            Object q10 = q(j10, fragment, z10);
            Object r10 = r(j10, fragment2, z11);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r10;
            z zVar = j10;
            Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, q10, obj2);
            Object obj3 = q10;
            if (obj3 == null && l10 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k10 = k(zVar, obj, fragment2, arrayList4, view2);
            if (k10 == null || k10.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            zVar.a(obj3, view2);
            Object u10 = u(zVar, obj3, obj4, l10, fragment, hVar2.f3788b);
            if (!(fragment2 == null || k10 == null || (k10.size() <= 0 && arrayList4.size() <= 0))) {
                androidx.core.os.e eVar = new androidx.core.os.e();
                gVar2.b(fragment2, eVar);
                zVar.w(fragment2, u10, eVar, new c(gVar2, fragment2, eVar));
            }
            if (u10 != null) {
                ArrayList arrayList5 = new ArrayList();
                z zVar2 = zVar;
                zVar2.t(u10, obj3, arrayList5, obj4, k10, l10, arrayList2);
                y(zVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k10);
                ViewGroup viewGroup3 = viewGroup;
                z zVar3 = zVar;
                ArrayList arrayList6 = arrayList2;
                zVar3.x(viewGroup3, arrayList6, aVar2);
                zVar3.c(viewGroup3, u10);
                zVar3.s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        h hVar2 = hVar;
        View view2 = view;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f3787a;
        Fragment fragment2 = hVar2.f3790d;
        z j10 = j(fragment2, fragment);
        if (j10 != null) {
            boolean z10 = hVar2.f3788b;
            boolean z11 = hVar2.f3791e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q10 = q(j10, fragment, z10);
            Object r10 = r(j10, fragment2, z11);
            ArrayList arrayList3 = arrayList2;
            Object m10 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, q10, r10);
            Object obj2 = q10;
            if (obj2 == null && m10 == null) {
                obj = r10;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r10;
            }
            ArrayList<View> k10 = k(j10, obj, fragment2, arrayList3, view2);
            ArrayList<View> k11 = k(j10, obj2, fragment, arrayList, view2);
            A(k11, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k10;
            Object u10 = u(j10, obj2, obj, m10, fragment3, z10);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                androidx.core.os.e eVar = new androidx.core.os.e();
                g gVar3 = gVar;
                gVar3.b(fragment2, eVar);
                j10.w(fragment2, u10, eVar, new a(gVar3, fragment2, eVar));
            }
            if (u10 != null) {
                v(j10, obj, fragment2, arrayList4);
                ArrayList<String> o10 = j10.o(arrayList);
                z zVar = j10;
                zVar.t(u10, obj2, k11, obj, arrayList4, m10, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j10.c(viewGroup2, u10);
                zVar.y(viewGroup2, arrayList3, arrayList, o10, aVar);
                A(k11, 0);
                j10.A(m10, arrayList3, arrayList);
            }
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    private static Object q(z zVar, Fragment fragment, boolean z10) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            obj = fragment.H();
        } else {
            obj = fragment.r();
        }
        return zVar.g(obj);
    }

    private static Object r(z zVar, Fragment fragment, boolean z10) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            obj = fragment.J();
        } else {
            obj = fragment.u();
        }
        return zVar.g(obj);
    }

    static View s(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = hVar.f3789c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3738p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            str = aVar2.f3738p.get(0);
        } else {
            str = aVar2.f3739q.get(0);
        }
        return aVar.get(str);
    }

    private static Object t(z zVar, Fragment fragment, Fragment fragment2, boolean z10) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z10) {
            obj = fragment2.L();
        } else {
            obj = fragment.K();
        }
        return zVar.B(zVar.g(obj));
    }

    private static Object u(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        boolean z11;
        if (obj == null || obj2 == null || fragment == null) {
            z11 = true;
        } else {
            z11 = z10 ? fragment.k() : fragment.j();
        }
        if (z11) {
            return zVar.n(obj2, obj, obj3);
        }
        return zVar.m(obj2, obj, obj3);
    }

    private static void v(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3430m && fragment.A && fragment.O) {
            fragment.w1(true);
            zVar.r(obj, fragment.Q(), arrayList);
            androidx.core.view.x.a(fragment.H, new b(arrayList));
        }
    }

    private static z w() {
        try {
            return h1.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    private static void y(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        androidx.core.view.x.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(z zVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z10, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3738p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                str = aVar2.f3739q.get(0);
            } else {
                str = aVar2.f3738p.get(0);
            }
            View view = aVar.get(str);
            zVar.v(obj, view);
            if (obj2 != null) {
                zVar.v(obj2, view);
            }
        }
    }
}
