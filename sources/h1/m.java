package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.g;
import androidx.core.view.a0;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition */
public abstract class m implements Cloneable {
    private static final int[] I = {2, 1, 3, 4};
    private static final g J = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> K = new ThreadLocal<>();
    private boolean A = false;
    private boolean B = false;
    private ArrayList<f> C = null;
    private ArrayList<Animator> D = new ArrayList<>();
    p E;
    private e F;
    private androidx.collection.a<String, String> G;
    private g H = J;

    /* renamed from: a  reason: collision with root package name */
    private String f18651a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f18652b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f18653c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f18654d = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Integer> f18655f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<View> f18656g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<String> f18657h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Class<?>> f18658i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Integer> f18659j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<View> f18660k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<Class<?>> f18661l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<String> f18662m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<Integer> f18663n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<View> f18664o = null;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<Class<?>> f18665p = null;

    /* renamed from: q  reason: collision with root package name */
    private t f18666q = new t();

    /* renamed from: r  reason: collision with root package name */
    private t f18667r = new t();

    /* renamed from: s  reason: collision with root package name */
    q f18668s = null;

    /* renamed from: t  reason: collision with root package name */
    private int[] f18669t = I;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<s> f18670u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<s> f18671v;

    /* renamed from: w  reason: collision with root package name */
    private ViewGroup f18672w = null;

    /* renamed from: x  reason: collision with root package name */
    boolean f18673x = false;

    /* renamed from: y  reason: collision with root package name */
    ArrayList<Animator> f18674y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    private int f18675z = 0;

    /* compiled from: Transition */
    static class a extends g {
        a() {
        }

        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f18676a;

        b(androidx.collection.a aVar) {
            this.f18676a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18676a.remove(animator);
            m.this.f18674y.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.f18674y.add(animator);
        }
    }

    /* compiled from: Transition */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.s();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f18679a;

        /* renamed from: b  reason: collision with root package name */
        String f18680b;

        /* renamed from: c  reason: collision with root package name */
        s f18681c;

        /* renamed from: d  reason: collision with root package name */
        m0 f18682d;

        /* renamed from: e  reason: collision with root package name */
        m f18683e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f18679a = view;
            this.f18680b = str;
            this.f18681c = sVar;
            this.f18682d = m0Var;
            this.f18683e = mVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class e {
    }

    /* compiled from: Transition */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static androidx.collection.a<Animator, d> C() {
        androidx.collection.a<Animator, d> aVar = K.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        K.set(aVar2);
        return aVar2;
    }

    private static boolean M(s sVar, s sVar2, String str) {
        Object obj = sVar.f18697a.get(str);
        Object obj2 = sVar2.f18697a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void N(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && L(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && L(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f18670u.add(sVar);
                    this.f18671v.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void O(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j10 = aVar.j(size);
            if (j10 != null && L(j10) && (remove = aVar2.remove(j10)) != null && L(remove.f18698b)) {
                this.f18670u.add(aVar.l(size));
                this.f18671v.add(remove);
            }
        }
    }

    private void P(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.d<View> dVar, androidx.collection.d<View> dVar2) {
        View e10;
        int m10 = dVar.m();
        for (int i10 = 0; i10 < m10; i10++) {
            View o10 = dVar.o(i10);
            if (o10 != null && L(o10) && (e10 = dVar2.e(dVar.i(i10))) != null && L(e10)) {
                s sVar = aVar.get(o10);
                s sVar2 = aVar2.get(e10);
                if (!(sVar == null || sVar2 == null)) {
                    this.f18670u.add(sVar);
                    this.f18671v.add(sVar2);
                    aVar.remove(o10);
                    aVar2.remove(e10);
                }
            }
        }
    }

    private void Q(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View n10 = aVar3.n(i10);
            if (n10 != null && L(n10) && (view = aVar4.get(aVar3.j(i10))) != null && L(view)) {
                s sVar = aVar.get(n10);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f18670u.add(sVar);
                    this.f18671v.add(sVar2);
                    aVar.remove(n10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void R(t tVar, t tVar2) {
        androidx.collection.a aVar = new androidx.collection.a((g) tVar.f18700a);
        androidx.collection.a aVar2 = new androidx.collection.a((g) tVar2.f18700a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f18669t;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    O(aVar, aVar2);
                } else if (i11 == 2) {
                    Q(aVar, aVar2, tVar.f18703d, tVar2.f18703d);
                } else if (i11 == 3) {
                    N(aVar, aVar2, tVar.f18701b, tVar2.f18701b);
                } else if (i11 == 4) {
                    P(aVar, aVar2, tVar.f18702c, tVar2.f18702c);
                }
                i10++;
            } else {
                c(aVar, aVar2);
                return;
            }
        }
    }

    private void X(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s n10 = aVar.n(i10);
            if (L(n10.f18698b)) {
                this.f18670u.add(n10);
                this.f18671v.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s n11 = aVar2.n(i11);
            if (L(n11.f18698b)) {
                this.f18671v.add(n11);
                this.f18670u.add((Object) null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f18700a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f18701b.indexOfKey(id2) >= 0) {
                tVar.f18701b.put(id2, (Object) null);
            } else {
                tVar.f18701b.put(id2, view);
            }
        }
        String J2 = a0.J(view);
        if (J2 != null) {
            if (tVar.f18703d.containsKey(J2)) {
                tVar.f18703d.put(J2, null);
            } else {
                tVar.f18703d.put(J2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f18702c.g(itemIdAtPosition) >= 0) {
                    View e10 = tVar.f18702c.e(itemIdAtPosition);
                    if (e10 != null) {
                        a0.w0(e10, false);
                        tVar.f18702c.j(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                a0.w0(view, true);
                tVar.f18702c.j(itemIdAtPosition, view);
            }
        }
    }

    private void i(View view, boolean z10) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList<Integer> arrayList = this.f18659j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList<View> arrayList2 = this.f18660k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f18661l;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!this.f18661l.get(i10).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z10) {
                            k(sVar);
                        } else {
                            g(sVar);
                        }
                        sVar.f18699c.add(this);
                        j(sVar);
                        if (z10) {
                            d(this.f18666q, view, sVar);
                        } else {
                            d(this.f18667r, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f18663n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList<View> arrayList5 = this.f18664o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f18665p;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!this.f18665p.get(i11).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    i(viewGroup.getChildAt(i12), z10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public p B() {
        return this.E;
    }

    public long D() {
        return this.f18652b;
    }

    public List<Integer> E() {
        return this.f18655f;
    }

    public List<String> F() {
        return this.f18657h;
    }

    public List<Class<?>> G() {
        return this.f18658i;
    }

    public List<View> H() {
        return this.f18656g;
    }

    public String[] I() {
        return null;
    }

    public s J(View view, boolean z10) {
        q qVar = this.f18668s;
        if (qVar != null) {
            return qVar.J(view, z10);
        }
        return (z10 ? this.f18666q : this.f18667r).f18700a.get(view);
    }

    public boolean K(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] I2 = I();
        if (I2 != null) {
            int length = I2.length;
            int i10 = 0;
            while (i10 < length) {
                if (!M(sVar, sVar2, I2[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String M : sVar.f18697a.keySet()) {
            if (M(sVar, sVar2, M)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean L(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f18659j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f18660k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f18661l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f18661l.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f18662m != null && a0.J(view) != null && this.f18662m.contains(a0.J(view))) {
            return false;
        }
        if ((this.f18655f.size() == 0 && this.f18656g.size() == 0 && (((arrayList = this.f18658i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f18657h) == null || arrayList2.isEmpty()))) || this.f18655f.contains(Integer.valueOf(id2)) || this.f18656g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f18657h;
        if (arrayList6 != null && arrayList6.contains(a0.J(view))) {
            return true;
        }
        if (this.f18658i != null) {
            for (int i11 = 0; i11 < this.f18658i.size(); i11++) {
                if (this.f18658i.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void S(View view) {
        if (!this.B) {
            androidx.collection.a<Animator, d> C2 = C();
            int size = C2.size();
            m0 d10 = c0.d(view);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d n10 = C2.n(i10);
                if (n10.f18679a != null && d10.equals(n10.f18682d)) {
                    a.b(C2.j(i10));
                }
            }
            ArrayList<f> arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((f) arrayList2.get(i11)).b(this);
                }
            }
            this.A = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void T(ViewGroup viewGroup) {
        d dVar;
        this.f18670u = new ArrayList<>();
        this.f18671v = new ArrayList<>();
        R(this.f18666q, this.f18667r);
        androidx.collection.a<Animator, d> C2 = C();
        int size = C2.size();
        m0 d10 = c0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator j10 = C2.j(i10);
            if (!(j10 == null || (dVar = C2.get(j10)) == null || dVar.f18679a == null || !d10.equals(dVar.f18682d))) {
                s sVar = dVar.f18681c;
                View view = dVar.f18679a;
                s J2 = J(view, true);
                s x10 = x(view, true);
                if (J2 == null && x10 == null) {
                    x10 = this.f18667r.f18700a.get(view);
                }
                if (!(J2 == null && x10 == null) && dVar.f18683e.K(sVar, x10)) {
                    if (j10.isRunning() || j10.isStarted()) {
                        j10.cancel();
                    } else {
                        C2.remove(j10);
                    }
                }
            }
        }
        r(viewGroup, this.f18666q, this.f18667r, this.f18670u, this.f18671v);
        Y();
    }

    public m U(f fVar) {
        ArrayList<f> arrayList = this.C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.C.size() == 0) {
            this.C = null;
        }
        return this;
    }

    public m V(View view) {
        this.f18656g.remove(view);
        return this;
    }

    public void W(View view) {
        if (this.A) {
            if (!this.B) {
                androidx.collection.a<Animator, d> C2 = C();
                int size = C2.size();
                m0 d10 = c0.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d n10 = C2.n(i10);
                    if (n10.f18679a != null && d10.equals(n10.f18682d)) {
                        a.c(C2.j(i10));
                    }
                }
                ArrayList<f> arrayList = this.C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.C.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).e(this);
                    }
                }
            }
            this.A = false;
        }
    }

    /* access modifiers changed from: protected */
    public void Y() {
        f0();
        androidx.collection.a<Animator, d> C2 = C();
        Iterator<Animator> it = this.D.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (C2.containsKey(next)) {
                f0();
                X(next, C2);
            }
        }
        this.D.clear();
        s();
    }

    public m Z(long j10) {
        this.f18653c = j10;
        return this;
    }

    public m a(f fVar) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(fVar);
        return this;
    }

    public void a0(e eVar) {
        this.F = eVar;
    }

    public m b(View view) {
        this.f18656g.add(view);
        return this;
    }

    public m b0(TimeInterpolator timeInterpolator) {
        this.f18654d = timeInterpolator;
        return this;
    }

    public void c0(g gVar) {
        if (gVar == null) {
            this.H = J;
        } else {
            this.H = gVar;
        }
    }

    public void d0(p pVar) {
    }

    /* access modifiers changed from: protected */
    public void e(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (D() >= 0) {
            animator.setStartDelay(D() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public m e0(long j10) {
        this.f18652b = j10;
        return this;
    }

    /* access modifiers changed from: protected */
    public void f() {
        for (int size = this.f18674y.size() - 1; size >= 0; size--) {
            this.f18674y.get(size).cancel();
        }
        ArrayList<f> arrayList = this.C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.C.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void f0() {
        if (this.f18675z == 0) {
            ArrayList<f> arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).d(this);
                }
            }
            this.B = false;
        }
        this.f18675z++;
    }

    public abstract void g(s sVar);

    /* access modifiers changed from: package-private */
    public String g0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f18653c != -1) {
            str2 = str2 + "dur(" + this.f18653c + ") ";
        }
        if (this.f18652b != -1) {
            str2 = str2 + "dly(" + this.f18652b + ") ";
        }
        if (this.f18654d != null) {
            str2 = str2 + "interp(" + this.f18654d + ") ";
        }
        if (this.f18655f.size() <= 0 && this.f18656g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f18655f.size() > 0) {
            for (int i10 = 0; i10 < this.f18655f.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f18655f.get(i10);
            }
        }
        if (this.f18656g.size() > 0) {
            for (int i11 = 0; i11 < this.f18656g.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f18656g.get(i11);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: package-private */
    public void j(s sVar) {
    }

    public abstract void k(s sVar);

    /* access modifiers changed from: package-private */
    public void l(ViewGroup viewGroup, boolean z10) {
        androidx.collection.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        m(z10);
        if ((this.f18655f.size() > 0 || this.f18656g.size() > 0) && (((arrayList = this.f18657h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f18658i) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f18655f.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f18655f.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        k(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f18699c.add(this);
                    j(sVar);
                    if (z10) {
                        d(this.f18666q, findViewById, sVar);
                    } else {
                        d(this.f18667r, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f18656g.size(); i11++) {
                View view = this.f18656g.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    k(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f18699c.add(this);
                j(sVar2);
                if (z10) {
                    d(this.f18666q, view, sVar2);
                } else {
                    d(this.f18667r, view, sVar2);
                }
            }
        } else {
            i(viewGroup, z10);
        }
        if (!z10 && (aVar = this.G) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f18666q.f18703d.remove(this.G.j(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f18666q.f18703d.put(this.G.n(i13), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        if (z10) {
            this.f18666q.f18700a.clear();
            this.f18666q.f18701b.clear();
            this.f18666q.f18702c.b();
            return;
        }
        this.f18667r.f18700a.clear();
        this.f18667r.f18701b.clear();
        this.f18667r.f18702c.b();
    }

    /* renamed from: o */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.D = new ArrayList<>();
            mVar.f18666q = new t();
            mVar.f18667r = new t();
            mVar.f18670u = null;
            mVar.f18671v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void r(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i10;
        Animator animator;
        s sVar;
        View view;
        s sVar2;
        Animator animator2;
        androidx.collection.a<Animator, d> C2 = C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f18699c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f18699c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || K(sVar3, sVar4)) {
                    Animator p10 = p(viewGroup, sVar3, sVar4);
                    if (p10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f18698b;
                            String[] I2 = I();
                            if (I2 != null && I2.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f18700a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < I2.length) {
                                        sVar2.f18697a.put(I2[i12], sVar5.f18697a.get(I2[i12]));
                                        i12++;
                                        p10 = p10;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = p10;
                                i10 = size;
                                int size2 = C2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = C2.get(C2.j(i13));
                                    if (dVar.f18681c != null && dVar.f18679a == view2 && dVar.f18680b.equals(y()) && dVar.f18681c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                t tVar3 = tVar2;
                                i10 = size;
                                animator2 = p10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            t tVar4 = tVar2;
                            i10 = size;
                            view = sVar3.f18698b;
                            animator = p10;
                            sVar = null;
                        }
                        if (animator != null) {
                            C2.put(animator, new d(view, y(), this, c0.d(viewGroup), sVar));
                            this.D.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    t tVar5 = tVar2;
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            t tVar52 = tVar2;
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.D.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        int i10 = this.f18675z - 1;
        this.f18675z = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).a(this);
                }
            }
            for (int i12 = 0; i12 < this.f18666q.f18702c.m(); i12++) {
                View o10 = this.f18666q.f18702c.o(i12);
                if (o10 != null) {
                    a0.w0(o10, false);
                }
            }
            for (int i13 = 0; i13 < this.f18667r.f18702c.m(); i13++) {
                View o11 = this.f18667r.f18702c.o(i13);
                if (o11 != null) {
                    a0.w0(o11, false);
                }
            }
            this.B = true;
        }
    }

    public long t() {
        return this.f18653c;
    }

    public String toString() {
        return g0(MaxReward.DEFAULT_LABEL);
    }

    public e v() {
        return this.F;
    }

    public TimeInterpolator w() {
        return this.f18654d;
    }

    /* access modifiers changed from: package-private */
    public s x(View view, boolean z10) {
        q qVar = this.f18668s;
        if (qVar != null) {
            return qVar.x(view, z10);
        }
        ArrayList<s> arrayList = z10 ? this.f18670u : this.f18671v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            s sVar = arrayList.get(i11);
            if (sVar == null) {
                return null;
            }
            if (sVar.f18698b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.f18671v : this.f18670u).get(i10);
    }

    public String y() {
        return this.f18651a;
    }

    public g z() {
        return this.H;
    }
}
