package x7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import dd.j1;
import g7.e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p8.d0;
import t7.h1;
import t7.i0;
import t7.i4;
import u7.f;
import u7.l;
import u7.w;
import v7.g;
import v7.h;
import v7.i;
import x7.a1;
import x7.n;
import x7.x0;
import x7.y0;
import x7.z0;
import y7.g0;
import y7.v;

/* compiled from: RemoteStore */
public final class r0 implements y0.c {

    /* renamed from: a  reason: collision with root package name */
    private final c f31114a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f31115b;

    /* renamed from: c  reason: collision with root package name */
    private final q f31116c;

    /* renamed from: d  reason: collision with root package name */
    private final n f31117d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, i4> f31118e;

    /* renamed from: f  reason: collision with root package name */
    private final l0 f31119f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31120g = false;

    /* renamed from: h  reason: collision with root package name */
    private final z0 f31121h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final a1 f31122i;

    /* renamed from: j  reason: collision with root package name */
    private y0 f31123j;

    /* renamed from: k  reason: collision with root package name */
    private final Deque<g> f31124k;

    /* compiled from: RemoteStore */
    class a implements z0.a {
        a() {
        }

        public void a() {
            r0.this.y();
        }

        public void b(j1 j1Var) {
            r0.this.x(j1Var);
        }

        public void c(w wVar, x0 x0Var) {
            r0.this.w(wVar, x0Var);
        }
    }

    /* compiled from: RemoteStore */
    class b implements a1.a {
        b() {
        }

        public void a() {
            r0.this.f31122i.C();
        }

        public void b(j1 j1Var) {
            r0.this.B(j1Var);
        }

        public void d() {
            r0.this.C();
        }

        public void e(w wVar, List<i> list) {
            r0.this.D(wVar, list);
        }
    }

    /* compiled from: RemoteStore */
    public interface c {
        void a(r7.y0 y0Var);

        e<l> b(int i10);

        void c(int i10, j1 j1Var);

        void d(h hVar);

        void e(int i10, j1 j1Var);

        void f(m0 m0Var);
    }

    public r0(c cVar, i0 i0Var, q qVar, y7.g gVar, n nVar) {
        this.f31114a = cVar;
        this.f31115b = i0Var;
        this.f31116c = qVar;
        this.f31117d = nVar;
        this.f31118e = new HashMap();
        this.f31124k = new ArrayDeque();
        Objects.requireNonNull(cVar);
        this.f31119f = new l0(gVar, new p0(cVar));
        this.f31121h = qVar.f(new a());
        this.f31122i = qVar.g(new b());
        nVar.a(new q0(this, gVar));
    }

    private void A(j1 j1Var) {
        y7.b.d(!j1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (q.l(j1Var)) {
            v.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", g0.A(this.f31122i.y()), j1Var);
            a1 a1Var = this.f31122i;
            com.google.protobuf.i iVar = a1.f31013v;
            a1Var.B(iVar);
            this.f31115b.k0(iVar);
        }
    }

    /* access modifiers changed from: private */
    public void B(j1 j1Var) {
        if (j1Var.o()) {
            y7.b.d(!O(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!j1Var.o() && !this.f31124k.isEmpty()) {
            if (this.f31122i.z()) {
                z(j1Var);
            } else {
                A(j1Var);
            }
        }
        if (O()) {
            S();
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        this.f31115b.k0(this.f31122i.y());
        for (g h10 : this.f31124k) {
            this.f31122i.D(h10.h());
        }
    }

    /* access modifiers changed from: private */
    public void D(w wVar, List<i> list) {
        this.f31114a.d(h.a(this.f31124k.poll(), wVar, list, this.f31122i.y()));
        u();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(n.a aVar) {
        if (aVar.equals(n.a.REACHABLE) && this.f31119f.c().equals(r7.y0.ONLINE)) {
            return;
        }
        if ((!aVar.equals(n.a.UNREACHABLE) || !this.f31119f.c().equals(r7.y0.OFFLINE)) && o()) {
            v.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            J();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(y7.g gVar, n.a aVar) {
        gVar.l(new o0(this, aVar));
    }

    private void H(x0.d dVar) {
        y7.b.d(dVar.a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer next : dVar.d()) {
            if (this.f31118e.containsKey(next)) {
                this.f31118e.remove(next);
                this.f31123j.q(next.intValue());
                this.f31114a.c(next.intValue(), dVar.a());
            }
        }
    }

    private void I(w wVar) {
        y7.b.d(!wVar.equals(w.f30653b), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        m0 c10 = this.f31123j.c(wVar);
        for (Map.Entry next : c10.d().entrySet()) {
            u0 u0Var = (u0) next.getValue();
            if (!u0Var.e().isEmpty()) {
                int intValue = ((Integer) next.getKey()).intValue();
                i4 i4Var = this.f31118e.get(Integer.valueOf(intValue));
                if (i4Var != null) {
                    this.f31118e.put(Integer.valueOf(intValue), i4Var.k(u0Var.e(), wVar));
                }
            }
        }
        for (Map.Entry next2 : c10.e().entrySet()) {
            int intValue2 = ((Integer) next2.getKey()).intValue();
            i4 i4Var2 = this.f31118e.get(Integer.valueOf(intValue2));
            if (i4Var2 != null) {
                this.f31118e.put(Integer.valueOf(intValue2), i4Var2.k(com.google.protobuf.i.f27039b, i4Var2.f()));
                L(intValue2);
                M(new i4(i4Var2.g(), intValue2, i4Var2.e(), (h1) next2.getValue()));
            }
        }
        this.f31114a.f(c10);
    }

    private void J() {
        this.f31120g = false;
        s();
        this.f31119f.i(r7.y0.UNKNOWN);
        this.f31122i.l();
        this.f31121h.l();
        t();
    }

    private void L(int i10) {
        this.f31123j.o(i10);
        this.f31121h.z(i10);
    }

    private void M(i4 i4Var) {
        this.f31123j.o(i4Var.h());
        if (!i4Var.d().isEmpty() || i4Var.f().compareTo(w.f30653b) > 0) {
            i4Var = i4Var.i(Integer.valueOf(b(i4Var.h()).size()));
        }
        this.f31121h.A(i4Var);
    }

    private boolean N() {
        return o() && !this.f31121h.n() && !this.f31118e.isEmpty();
    }

    private boolean O() {
        return o() && !this.f31122i.n() && !this.f31124k.isEmpty();
    }

    private void R() {
        y7.b.d(N(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f31123j = new y0(this);
        this.f31121h.u();
        this.f31119f.e();
    }

    private void S() {
        y7.b.d(O(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f31122i.u();
    }

    private void m(g gVar) {
        y7.b.d(n(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f31124k.add(gVar);
        if (this.f31122i.m() && this.f31122i.z()) {
            this.f31122i.D(gVar.h());
        }
    }

    private boolean n() {
        return o() && this.f31124k.size() < 10;
    }

    private void p() {
        this.f31123j = null;
    }

    private void s() {
        this.f31121h.v();
        this.f31122i.v();
        if (!this.f31124k.isEmpty()) {
            v.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f31124k.size()));
            this.f31124k.clear();
        }
        p();
    }

    /* access modifiers changed from: private */
    public void w(w wVar, x0 x0Var) {
        this.f31119f.i(r7.y0.ONLINE);
        y7.b.d((this.f31121h == null || this.f31123j == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z10 = x0Var instanceof x0.d;
        x0.d dVar = z10 ? (x0.d) x0Var : null;
        if (dVar == null || !dVar.b().equals(x0.e.Removed) || dVar.a() == null) {
            if (x0Var instanceof x0.b) {
                this.f31123j.i((x0.b) x0Var);
            } else if (x0Var instanceof x0.c) {
                this.f31123j.j((x0.c) x0Var);
            } else {
                y7.b.d(z10, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
                this.f31123j.k((x0.d) x0Var);
            }
            if (!wVar.equals(w.f30653b) && wVar.compareTo(this.f31115b.E()) >= 0) {
                I(wVar);
                return;
            }
            return;
        }
        H(dVar);
    }

    /* access modifiers changed from: private */
    public void x(j1 j1Var) {
        if (j1Var.o()) {
            y7.b.d(!N(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        p();
        if (N()) {
            this.f31119f.d(j1Var);
            R();
            return;
        }
        this.f31119f.i(r7.y0.UNKNOWN);
    }

    /* access modifiers changed from: private */
    public void y() {
        for (i4 M : this.f31118e.values()) {
            M(M);
        }
    }

    private void z(j1 j1Var) {
        y7.b.d(!j1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (q.m(j1Var)) {
            this.f31122i.l();
            this.f31114a.e(this.f31124k.poll().e(), j1Var);
            u();
        }
    }

    public void G(i4 i4Var) {
        Integer valueOf = Integer.valueOf(i4Var.h());
        if (!this.f31118e.containsKey(valueOf)) {
            this.f31118e.put(valueOf, i4Var);
            if (N()) {
                R();
            } else if (this.f31121h.m()) {
                M(i4Var);
            }
        }
    }

    public Task<Map<String, d0>> K(r7.a1 a1Var, List<com.google.firebase.firestore.a> list) {
        if (o()) {
            return this.f31116c.q(a1Var, list);
        }
        return Tasks.forException(new z("Failed to get result from server.", z.a.UNAVAILABLE));
    }

    public void P() {
        v.a("RemoteStore", "Shutting down", new Object[0]);
        this.f31117d.shutdown();
        this.f31120g = false;
        s();
        this.f31116c.r();
        this.f31119f.i(r7.y0.UNKNOWN);
    }

    public void Q() {
        t();
    }

    public void T(int i10) {
        y7.b.d(this.f31118e.remove(Integer.valueOf(i10)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i10));
        if (this.f31121h.m()) {
            L(i10);
        }
        if (!this.f31118e.isEmpty()) {
            return;
        }
        if (this.f31121h.m()) {
            this.f31121h.q();
        } else if (o()) {
            this.f31119f.i(r7.y0.UNKNOWN);
        }
    }

    public f a() {
        return this.f31116c.h().a();
    }

    public e<l> b(int i10) {
        return this.f31114a.b(i10);
    }

    public i4 c(int i10) {
        return this.f31118e.get(Integer.valueOf(i10));
    }

    public boolean o() {
        return this.f31120g;
    }

    public r7.j1 q() {
        return new r7.j1(this.f31116c);
    }

    public void r() {
        this.f31120g = false;
        s();
        this.f31119f.i(r7.y0.OFFLINE);
    }

    public void t() {
        this.f31120g = true;
        if (o()) {
            this.f31122i.B(this.f31115b.F());
            if (N()) {
                R();
            } else {
                this.f31119f.i(r7.y0.UNKNOWN);
            }
            u();
        }
    }

    public void u() {
        int e10 = this.f31124k.isEmpty() ? -1 : this.f31124k.getLast().e();
        while (true) {
            if (!n()) {
                break;
            }
            g I = this.f31115b.I(e10);
            if (I != null) {
                m(I);
                e10 = I.e();
            } else if (this.f31124k.size() == 0) {
                this.f31122i.q();
            }
        }
        if (O()) {
            S();
        }
    }

    public void v() {
        if (o()) {
            v.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            J();
        }
    }
}
