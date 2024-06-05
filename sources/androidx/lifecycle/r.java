package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import l.c;

/* compiled from: LifecycleRegistry.kt */
public class r extends i {

    /* renamed from: j  reason: collision with root package name */
    public static final a f3959j = new a((h) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3960b;

    /* renamed from: c  reason: collision with root package name */
    private m.a<o, b> f3961c;

    /* renamed from: d  reason: collision with root package name */
    private i.b f3962d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<p> f3963e;

    /* renamed from: f  reason: collision with root package name */
    private int f3964f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3965g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3966h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i.b> f3967i;

    /* compiled from: LifecycleRegistry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final i.b a(i.b bVar, i.b bVar2) {
            m.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private i.b f3968a;

        /* renamed from: b  reason: collision with root package name */
        private m f3969b;

        public b(o oVar, i.b bVar) {
            m.e(bVar, "initialState");
            m.b(oVar);
            this.f3969b = u.f(oVar);
            this.f3968a = bVar;
        }

        public final void a(p pVar, i.a aVar) {
            m.e(aVar, "event");
            i.b d10 = aVar.d();
            this.f3968a = r.f3959j.a(this.f3968a, d10);
            m mVar = this.f3969b;
            m.b(pVar);
            mVar.onStateChanged(pVar, aVar);
            this.f3968a = d10;
        }

        public final i.b b() {
            return this.f3968a;
        }
    }

    private r(p pVar, boolean z10) {
        this.f3960b = z10;
        this.f3961c = new m.a<>();
        this.f3962d = i.b.INITIALIZED;
        this.f3967i = new ArrayList<>();
        this.f3963e = new WeakReference<>(pVar);
    }

    private final void e(p pVar) {
        Iterator<Map.Entry<o, b>> descendingIterator = this.f3961c.descendingIterator();
        m.d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f3966h) {
            Map.Entry next = descendingIterator.next();
            m.d(next, "next()");
            o oVar = (o) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f3962d) > 0 && !this.f3966h && this.f3961c.contains(oVar)) {
                i.a a10 = i.a.Companion.a(bVar.b());
                if (a10 != null) {
                    n(a10.d());
                    bVar.a(pVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.i.b f(androidx.lifecycle.o r4) {
        /*
            r3 = this;
            m.a<androidx.lifecycle.o, androidx.lifecycle.r$b> r0 = r3.f3961c
            java.util.Map$Entry r4 = r0.n(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.r$b r4 = (androidx.lifecycle.r.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.i$b r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList<androidx.lifecycle.i$b> r1 = r3.f3967i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002f
            java.util.ArrayList<androidx.lifecycle.i$b> r0 = r3.f3967i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.i$b r0 = (androidx.lifecycle.i.b) r0
        L_0x002f:
            androidx.lifecycle.r$a r1 = f3959j
            androidx.lifecycle.i$b r2 = r3.f3962d
            androidx.lifecycle.i$b r4 = r1.a(r2, r4)
            androidx.lifecycle.i$b r4 = r1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.f(androidx.lifecycle.o):androidx.lifecycle.i$b");
    }

    private final void g(String str) {
        if (this.f3960b && !c.g().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void h(p pVar) {
        m.b<K, V>.d e10 = this.f3961c.e();
        m.d(e10, "observerMap.iteratorWithAdditions()");
        while (e10.hasNext() && !this.f3966h) {
            Map.Entry entry = (Map.Entry) e10.next();
            o oVar = (o) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3962d) < 0 && !this.f3966h && this.f3961c.contains(oVar)) {
                n(bVar.b());
                i.a b10 = i.a.Companion.b(bVar.b());
                if (b10 != null) {
                    bVar.a(pVar, b10);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean j() {
        if (this.f3961c.size() == 0) {
            return true;
        }
        Map.Entry<o, b> b10 = this.f3961c.b();
        m.b(b10);
        i.b b11 = b10.getValue().b();
        Map.Entry<o, b> f10 = this.f3961c.f();
        m.b(f10);
        i.b b12 = f10.getValue().b();
        if (b11 == b12 && this.f3962d == b12) {
            return true;
        }
        return false;
    }

    private final void l(i.b bVar) {
        i.b bVar2 = this.f3962d;
        if (bVar2 != bVar) {
            if ((bVar2 == i.b.INITIALIZED && bVar == i.b.DESTROYED) ? false : true) {
                this.f3962d = bVar;
                if (this.f3965g || this.f3964f != 0) {
                    this.f3966h = true;
                    return;
                }
                this.f3965g = true;
                p();
                this.f3965g = false;
                if (this.f3962d == i.b.DESTROYED) {
                    this.f3961c = new m.a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f3962d + " in component " + this.f3963e.get()).toString());
        }
    }

    private final void m() {
        ArrayList<i.b> arrayList = this.f3967i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void n(i.b bVar) {
        this.f3967i.add(bVar);
    }

    private final void p() {
        p pVar = (p) this.f3963e.get();
        if (pVar != null) {
            while (!j()) {
                this.f3966h = false;
                i.b bVar = this.f3962d;
                Map.Entry<o, b> b10 = this.f3961c.b();
                m.b(b10);
                if (bVar.compareTo(b10.getValue().b()) < 0) {
                    e(pVar);
                }
                Map.Entry<o, b> f10 = this.f3961c.f();
                if (!this.f3966h && f10 != null && this.f3962d.compareTo(f10.getValue().b()) > 0) {
                    h(pVar);
                }
            }
            this.f3966h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public void a(o oVar) {
        p pVar;
        m.e(oVar, "observer");
        g("addObserver");
        i.b bVar = this.f3962d;
        i.b bVar2 = i.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = i.b.INITIALIZED;
        }
        b bVar3 = new b(oVar, bVar2);
        if (this.f3961c.h(oVar, bVar3) == null && (pVar = (p) this.f3963e.get()) != null) {
            boolean z10 = this.f3964f != 0 || this.f3965g;
            i.b f10 = f(oVar);
            this.f3964f++;
            while (bVar3.b().compareTo(f10) < 0 && this.f3961c.contains(oVar)) {
                n(bVar3.b());
                i.a b10 = i.a.Companion.b(bVar3.b());
                if (b10 != null) {
                    bVar3.a(pVar, b10);
                    m();
                    f10 = f(oVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z10) {
                p();
            }
            this.f3964f--;
        }
    }

    public i.b b() {
        return this.f3962d;
    }

    public void d(o oVar) {
        m.e(oVar, "observer");
        g("removeObserver");
        this.f3961c.m(oVar);
    }

    public void i(i.a aVar) {
        m.e(aVar, "event");
        g("handleLifecycleEvent");
        l(aVar.d());
    }

    public void k(i.b bVar) {
        m.e(bVar, "state");
        g("markState");
        o(bVar);
    }

    public void o(i.b bVar) {
        m.e(bVar, "state");
        g("setCurrentState");
        l(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(p pVar) {
        this(pVar, true);
        m.e(pVar, "provider");
    }
}
