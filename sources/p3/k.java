package p3;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import j4.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.n0;
import n2.c4;
import n2.z1;
import p3.s0;
import p3.x;

/* compiled from: ConcatenatingMediaSource */
public final class k extends g<e> {
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static final z1 f21453x = new z1.c().f(Uri.EMPTY).a();

    /* renamed from: l  reason: collision with root package name */
    private final List<e> f21454l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<d> f21455m;

    /* renamed from: n  reason: collision with root package name */
    private Handler f21456n;

    /* renamed from: o  reason: collision with root package name */
    private final List<e> f21457o;

    /* renamed from: p  reason: collision with root package name */
    private final IdentityHashMap<u, e> f21458p;

    /* renamed from: q  reason: collision with root package name */
    private final Map<Object, e> f21459q;

    /* renamed from: r  reason: collision with root package name */
    private final Set<e> f21460r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f21461s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f21462t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f21463u;

    /* renamed from: v  reason: collision with root package name */
    private Set<d> f21464v;

    /* renamed from: w  reason: collision with root package name */
    private s0 f21465w;

    /* compiled from: ConcatenatingMediaSource */
    private static final class b extends n2.a {

        /* renamed from: j  reason: collision with root package name */
        private final int f21466j;

        /* renamed from: k  reason: collision with root package name */
        private final int f21467k;

        /* renamed from: l  reason: collision with root package name */
        private final int[] f21468l;

        /* renamed from: m  reason: collision with root package name */
        private final int[] f21469m;

        /* renamed from: n  reason: collision with root package name */
        private final c4[] f21470n;

        /* renamed from: o  reason: collision with root package name */
        private final Object[] f21471o;

        /* renamed from: p  reason: collision with root package name */
        private final HashMap<Object, Integer> f21472p = new HashMap<>();

        public b(Collection<e> collection, s0 s0Var, boolean z10) {
            super(z10, s0Var);
            int size = collection.size();
            this.f21468l = new int[size];
            this.f21469m = new int[size];
            this.f21470n = new c4[size];
            this.f21471o = new Object[size];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (e next : collection) {
                this.f21470n[i12] = next.f21475a.c0();
                this.f21469m[i12] = i10;
                this.f21468l[i12] = i11;
                i10 += this.f21470n[i12].t();
                i11 += this.f21470n[i12].m();
                Object[] objArr = this.f21471o;
                objArr[i12] = next.f21476b;
                this.f21472p.put(objArr[i12], Integer.valueOf(i12));
                i12++;
            }
            this.f21466j = i10;
            this.f21467k = i11;
        }

        /* access modifiers changed from: protected */
        public Object B(int i10) {
            return this.f21471o[i10];
        }

        /* access modifiers changed from: protected */
        public int D(int i10) {
            return this.f21468l[i10];
        }

        /* access modifiers changed from: protected */
        public int E(int i10) {
            return this.f21469m[i10];
        }

        /* access modifiers changed from: protected */
        public c4 H(int i10) {
            return this.f21470n[i10];
        }

        public int m() {
            return this.f21467k;
        }

        public int t() {
            return this.f21466j;
        }

        /* access modifiers changed from: protected */
        public int w(Object obj) {
            Integer num = this.f21472p.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        /* access modifiers changed from: protected */
        public int x(int i10) {
            return n0.h(this.f21468l, i10 + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public int y(int i10) {
            return n0.h(this.f21469m, i10 + 1, false, false);
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    private static final class c extends a {
        private c() {
        }

        /* access modifiers changed from: protected */
        public void C(p0 p0Var) {
        }

        /* access modifiers changed from: protected */
        public void E() {
        }

        public u a(x.b bVar, j4.b bVar2, long j10) {
            throw new UnsupportedOperationException();
        }

        public void b(u uVar) {
        }

        public z1 g() {
            return k.f21453x;
        }

        public void h() {
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f21473a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f21474b;

        public d(Handler handler, Runnable runnable) {
            this.f21473a = handler;
            this.f21474b = runnable;
        }

        public void a() {
            this.f21473a.post(this.f21474b);
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final s f21475a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f21476b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<x.b> f21477c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f21478d;

        /* renamed from: e  reason: collision with root package name */
        public int f21479e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21480f;

        public e(x xVar, boolean z10) {
            this.f21475a = new s(xVar, z10);
        }

        public void a(int i10, int i11) {
            this.f21478d = i10;
            this.f21479e = i11;
            this.f21480f = false;
            this.f21477c.clear();
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    private static final class f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f21481a;

        /* renamed from: b  reason: collision with root package name */
        public final T f21482b;

        /* renamed from: c  reason: collision with root package name */
        public final d f21483c;

        public f(int i10, T t10, d dVar) {
            this.f21481a = i10;
            this.f21482b = t10;
            this.f21483c = dVar;
        }
    }

    public k(x... xVarArr) {
        this(false, xVarArr);
    }

    private void R(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f21457o.get(i10 - 1);
            eVar.a(i10, eVar2.f21479e + eVar2.f21475a.c0().t());
        } else {
            eVar.a(i10, 0);
        }
        W(i10, 1, eVar.f21475a.c0().t());
        this.f21457o.add(i10, eVar);
        this.f21459q.put(eVar.f21476b, eVar);
        N(eVar, eVar.f21475a);
        if (!B() || !this.f21458p.isEmpty()) {
            G(eVar);
        } else {
            this.f21460r.add(eVar);
        }
    }

    private void U(int i10, Collection<e> collection) {
        for (e R : collection) {
            R(i10, R);
            i10++;
        }
    }

    private void V(int i10, Collection<x> collection, Handler handler, Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        k4.a.a(z10);
        Handler handler2 = this.f21456n;
        for (x e10 : collection) {
            k4.a.e(e10);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (x eVar : collection) {
            arrayList.add(new e(eVar, this.f21462t));
        }
        this.f21454l.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i10, arrayList, X(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void W(int i10, int i11, int i12) {
        while (i10 < this.f21457o.size()) {
            e eVar = this.f21457o.get(i10);
            eVar.f21478d += i11;
            eVar.f21479e += i12;
            i10++;
        }
    }

    private d X(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f21455m.add(dVar);
        return dVar;
    }

    private void Y() {
        Iterator<e> it = this.f21460r.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f21477c.isEmpty()) {
                G(next);
                it.remove();
            }
        }
    }

    private synchronized void Z(Set<d> set) {
        for (d a10 : set) {
            a10.a();
        }
        this.f21455m.removeAll(set);
    }

    private void a0(e eVar) {
        this.f21460r.add(eVar);
        H(eVar);
    }

    private static Object b0(Object obj) {
        return n2.a.z(obj);
    }

    private static Object d0(Object obj) {
        return n2.a.A(obj);
    }

    private static Object e0(e eVar, Object obj) {
        return n2.a.C(eVar.f21476b, obj);
    }

    private Handler f0() {
        return (Handler) k4.a.e(this.f21456n);
    }

    /* access modifiers changed from: private */
    public boolean i0(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f fVar = (f) n0.j(message.obj);
            this.f21465w = this.f21465w.g(fVar.f21481a, ((Collection) fVar.f21482b).size());
            U(fVar.f21481a, (Collection) fVar.f21482b);
            s0(fVar.f21483c);
        } else if (i10 == 1) {
            f fVar2 = (f) n0.j(message.obj);
            int i11 = fVar2.f21481a;
            int intValue = ((Integer) fVar2.f21482b).intValue();
            if (i11 == 0 && intValue == this.f21465w.b()) {
                this.f21465w = this.f21465w.i();
            } else {
                this.f21465w = this.f21465w.c(i11, intValue);
            }
            for (int i12 = intValue - 1; i12 >= i11; i12--) {
                o0(i12);
            }
            s0(fVar2.f21483c);
        } else if (i10 == 2) {
            f fVar3 = (f) n0.j(message.obj);
            s0 s0Var = this.f21465w;
            int i13 = fVar3.f21481a;
            s0 c10 = s0Var.c(i13, i13 + 1);
            this.f21465w = c10;
            this.f21465w = c10.g(((Integer) fVar3.f21482b).intValue(), 1);
            l0(fVar3.f21481a, ((Integer) fVar3.f21482b).intValue());
            s0(fVar3.f21483c);
        } else if (i10 == 3) {
            f fVar4 = (f) n0.j(message.obj);
            this.f21465w = (s0) fVar4.f21482b;
            s0(fVar4.f21483c);
        } else if (i10 == 4) {
            w0();
        } else if (i10 == 5) {
            Z((Set) n0.j(message.obj));
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    private void j0(e eVar) {
        if (eVar.f21480f && eVar.f21477c.isEmpty()) {
            this.f21460r.remove(eVar);
            O(eVar);
        }
    }

    private void l0(int i10, int i11) {
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        int i12 = this.f21457o.get(min).f21479e;
        List<e> list = this.f21457o;
        list.add(i11, list.remove(i10));
        while (min <= max) {
            e eVar = this.f21457o.get(min);
            eVar.f21478d = min;
            eVar.f21479e = i12;
            i12 += eVar.f21475a.c0().t();
            min++;
        }
    }

    private void m0(int i10, int i11, Handler handler, Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        k4.a.a(z10);
        Handler handler2 = this.f21456n;
        List<e> list = this.f21454l;
        list.add(i11, list.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i10, Integer.valueOf(i11), X(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void o0(int i10) {
        e remove = this.f21457o.remove(i10);
        this.f21459q.remove(remove.f21476b);
        W(i10, -1, -remove.f21475a.c0().t());
        remove.f21480f = true;
        j0(remove);
    }

    private void q0(int i10, int i11, Handler handler, Runnable runnable) {
        boolean z10 = false;
        if ((handler == null) == (runnable == null)) {
            z10 = true;
        }
        k4.a.a(z10);
        Handler handler2 = this.f21456n;
        n0.N0(this.f21454l, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i10, Integer.valueOf(i11), X(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void r0() {
        s0((d) null);
    }

    private void s0(d dVar) {
        if (!this.f21463u) {
            f0().obtainMessage(4).sendToTarget();
            this.f21463u = true;
        }
        if (dVar != null) {
            this.f21464v.add(dVar);
        }
    }

    private void t0(s0 s0Var, Handler handler, Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        k4.a.a(z10);
        Handler handler2 = this.f21456n;
        if (handler2 != null) {
            int g02 = g0();
            if (s0Var.b() != g02) {
                s0Var = s0Var.i().g(0, g02);
            }
            handler2.obtainMessage(3, new f(0, s0Var, X(handler, runnable))).sendToTarget();
            return;
        }
        if (s0Var.b() > 0) {
            s0Var = s0Var.i();
        }
        this.f21465w = s0Var;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void v0(e eVar, c4 c4Var) {
        int t10;
        if (eVar.f21478d + 1 < this.f21457o.size() && (t10 = c4Var.t() - (this.f21457o.get(eVar.f21478d + 1).f21479e - eVar.f21479e)) != 0) {
            W(eVar.f21478d + 1, 0, t10);
        }
        r0();
    }

    private void w0() {
        this.f21463u = false;
        Set<d> set = this.f21464v;
        this.f21464v = new HashSet();
        D(new b(this.f21457o, this.f21465w, this.f21461s));
        f0().obtainMessage(5, set).sendToTarget();
    }

    /* access modifiers changed from: protected */
    public synchronized void C(p0 p0Var) {
        super.C(p0Var);
        this.f21456n = new Handler(new j(this));
        if (this.f21454l.isEmpty()) {
            w0();
        } else {
            this.f21465w = this.f21465w.g(0, this.f21454l.size());
            U(0, this.f21454l);
            r0();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void E() {
        super.E();
        this.f21457o.clear();
        this.f21460r.clear();
        this.f21459q.clear();
        this.f21465w = this.f21465w.i();
        Handler handler = this.f21456n;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f21456n = null;
        }
        this.f21463u = false;
        this.f21464v.clear();
        Z(this.f21455m);
    }

    public synchronized void S(int i10, Collection<x> collection, Handler handler, Runnable runnable) {
        V(i10, collection, handler, runnable);
    }

    public synchronized void T(Collection<x> collection) {
        V(this.f21454l.size(), collection, (Handler) null, (Runnable) null);
    }

    public u a(x.b bVar, j4.b bVar2, long j10) {
        Object d02 = d0(bVar.f21677a);
        x.b c10 = bVar.c(b0(bVar.f21677a));
        e eVar = this.f21459q.get(d02);
        if (eVar == null) {
            eVar = new e(new c(), this.f21462t);
            eVar.f21480f = true;
            N(eVar, eVar.f21475a);
        }
        a0(eVar);
        eVar.f21477c.add(c10);
        r Z = eVar.f21475a.a(c10, bVar2, j10);
        this.f21458p.put(Z, eVar);
        Y();
        return Z;
    }

    public void b(u uVar) {
        e eVar = (e) k4.a.e(this.f21458p.remove(uVar));
        eVar.f21475a.b(uVar);
        eVar.f21477c.remove(((r) uVar).f21618a);
        if (!this.f21458p.isEmpty()) {
            Y();
        }
        j0(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public x.b I(e eVar, x.b bVar) {
        for (int i10 = 0; i10 < eVar.f21477c.size(); i10++) {
            if (eVar.f21477c.get(i10).f21680d == bVar.f21680d) {
                return bVar.c(e0(eVar, bVar.f21677a));
            }
        }
        return null;
    }

    public z1 g() {
        return f21453x;
    }

    public synchronized int g0() {
        return this.f21454l.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public int K(e eVar, int i10) {
        return i10 + eVar.f21479e;
    }

    public boolean i() {
        return false;
    }

    public synchronized c4 j() {
        s0 s0Var;
        if (this.f21465w.b() != this.f21454l.size()) {
            s0Var = this.f21465w.i().g(0, this.f21454l.size());
        } else {
            s0Var = this.f21465w;
        }
        return new b(this.f21454l, s0Var, this.f21461s);
    }

    public synchronized void k0(int i10, int i11, Handler handler, Runnable runnable) {
        m0(i10, i11, handler, runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public void M(e eVar, x xVar, c4 c4Var) {
        v0(eVar, c4Var);
    }

    public synchronized void p0(int i10, int i11, Handler handler, Runnable runnable) {
        q0(i10, i11, handler, runnable);
    }

    public synchronized void u0(s0 s0Var) {
        t0(s0Var, (Handler) null, (Runnable) null);
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        this.f21460r.clear();
    }

    /* access modifiers changed from: protected */
    public void z() {
    }

    public k(boolean z10, x... xVarArr) {
        this(z10, new s0.a(0), xVarArr);
    }

    public k(boolean z10, s0 s0Var, x... xVarArr) {
        this(z10, false, s0Var, xVarArr);
    }

    public k(boolean z10, boolean z11, s0 s0Var, x... xVarArr) {
        for (x e10 : xVarArr) {
            k4.a.e(e10);
        }
        this.f21465w = s0Var.b() > 0 ? s0Var.i() : s0Var;
        this.f21458p = new IdentityHashMap<>();
        this.f21459q = new HashMap();
        this.f21454l = new ArrayList();
        this.f21457o = new ArrayList();
        this.f21464v = new HashSet();
        this.f21455m = new HashSet();
        this.f21460r = new HashSet();
        this.f21461s = z10;
        this.f21462t = z11;
        T(Arrays.asList(xVarArr));
    }
}
