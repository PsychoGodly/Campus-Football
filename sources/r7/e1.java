package r7;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f1;
import com.google.firebase.firestore.h0;
import com.google.firebase.firestore.z;
import dd.j1;
import g7.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p7.j;
import p8.d0;
import q7.d;
import r7.v1;
import r7.x1;
import t7.h1;
import t7.i0;
import t7.i1;
import t7.i4;
import t7.j0;
import t7.k1;
import t7.m;
import u7.i;
import u7.l;
import u7.s;
import u7.w;
import v7.f;
import v7.h;
import x7.m0;
import x7.r0;
import x7.u0;
import y7.g;
import y7.g0;
import y7.t;
import y7.v;

/* compiled from: SyncEngine */
public class e1 implements r0.c {

    /* renamed from: o  reason: collision with root package name */
    private static final String f29876o = "e1";

    /* renamed from: a  reason: collision with root package name */
    private final i0 f29877a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f29878b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<a1, c1> f29879c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, List<a1>> f29880d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f29881e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashSet<l> f29882f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final Map<l, Integer> f29883g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, b> f29884h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final k1 f29885i = new k1();

    /* renamed from: j  reason: collision with root package name */
    private final Map<j, Map<Integer, TaskCompletionSource<Void>>> f29886j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Integer, List<TaskCompletionSource<Void>>> f29887k;

    /* renamed from: l  reason: collision with root package name */
    private final g1 f29888l = g1.a();

    /* renamed from: m  reason: collision with root package name */
    private j f29889m;

    /* renamed from: n  reason: collision with root package name */
    private c f29890n;

    /* compiled from: SyncEngine */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29891a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r7.t0$a[] r0 = r7.t0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29891a = r0
                r7.t0$a r1 = r7.t0.a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29891a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.t0$a r1 = r7.t0.a.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.e1.a.<clinit>():void");
        }
    }

    /* compiled from: SyncEngine */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final l f29892a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f29893b;

        b(l lVar) {
            this.f29892a = lVar;
        }
    }

    /* compiled from: SyncEngine */
    interface c {
        void a(y0 y0Var);

        void b(a1 a1Var, j1 j1Var);

        void c(List<x1> list);
    }

    public e1(i0 i0Var, r0 r0Var, j jVar, int i10) {
        this.f29877a = i0Var;
        this.f29878b = r0Var;
        this.f29881e = i10;
        this.f29889m = jVar;
        this.f29887k = new HashMap();
    }

    private void B(List<t0> list, int i10) {
        for (t0 next : list) {
            int i11 = a.f29891a[next.b().ordinal()];
            if (i11 == 1) {
                this.f29885i.a(next.a(), i10);
                z(next);
            } else if (i11 == 2) {
                v.a(f29876o, "Document no longer in limbo: %s", next.a());
                l a10 = next.a();
                this.f29885i.f(a10, i10);
                if (!this.f29885i.c(a10)) {
                    u(a10);
                }
            } else {
                throw y7.b.a("Unknown limbo change type: %s", next.b());
            }
        }
    }

    private void g(int i10, TaskCompletionSource<Void> taskCompletionSource) {
        Map map = this.f29886j.get(this.f29889m);
        if (map == null) {
            map = new HashMap();
            this.f29886j.put(this.f29889m, map);
        }
        map.put(Integer.valueOf(i10), taskCompletionSource);
    }

    private void h(String str) {
        y7.b.d(this.f29890n != null, "Trying to call %s before setting callback", str);
    }

    private void i(g7.c<l, i> cVar, m0 m0Var) {
        u0 u0Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<a1, c1> value : this.f29879c.entrySet()) {
            c1 c1Var = (c1) value.getValue();
            v1 c10 = c1Var.c();
            v1.b g10 = c10.g(cVar);
            if (g10.b()) {
                g10 = c10.h(this.f29877a.A(c1Var.a(), false).a(), g10);
            }
            if (m0Var == null) {
                u0Var = null;
            } else {
                u0Var = m0Var.d().get(Integer.valueOf(c1Var.b()));
            }
            w1 c11 = c1Var.c().c(g10, u0Var);
            B(c11.a(), c1Var.b());
            if (c11.b() != null) {
                arrayList.add(c11.b());
                arrayList2.add(j0.a(c1Var.b(), c11.b()));
            }
        }
        this.f29890n.c(arrayList);
        this.f29877a.f0(arrayList2);
    }

    private boolean j(j1 j1Var) {
        j1.b m10 = j1Var.m();
        String n10 = j1Var.n() != null ? j1Var.n() : MaxReward.DEFAULT_LABEL;
        if ((m10 != j1.b.FAILED_PRECONDITION || !n10.contains("requires an index")) && m10 != j1.b.PERMISSION_DENIED) {
            return false;
        }
        return true;
    }

    private void k() {
        for (Map.Entry<Integer, List<TaskCompletionSource<Void>>> value : this.f29887k.entrySet()) {
            for (TaskCompletionSource exception : (List) value.getValue()) {
                exception.setException(new z("'waitForPendingWrites' task is cancelled due to User change.", z.a.CANCELLED));
            }
        }
        this.f29887k.clear();
    }

    private x1 m(a1 a1Var, int i10, com.google.protobuf.i iVar) {
        i1 A = this.f29877a.A(a1Var, true);
        x1.a aVar = x1.a.NONE;
        boolean z10 = false;
        if (this.f29880d.get(Integer.valueOf(i10)) != null) {
            aVar = this.f29879c.get((a1) this.f29880d.get(Integer.valueOf(i10)).get(0)).c().i();
        }
        if (aVar == x1.a.SYNCED) {
            z10 = true;
        }
        u0 a10 = u0.a(z10, iVar);
        v1 v1Var = new v1(a1Var, A.b());
        w1 c10 = v1Var.c(v1Var.g(A.a()), a10);
        B(c10.a(), i10);
        this.f29879c.put(a1Var, new c1(a1Var, i10, v1Var));
        if (!this.f29880d.containsKey(Integer.valueOf(i10))) {
            this.f29880d.put(Integer.valueOf(i10), new ArrayList(1));
        }
        this.f29880d.get(Integer.valueOf(i10)).add(a1Var);
        return c10.b();
    }

    private void p(j1 j1Var, String str, Object... objArr) {
        if (j(j1Var)) {
            v.e("Firestore", "%s: %s", String.format(str, objArr), j1Var);
        }
    }

    private void q(int i10, j1 j1Var) {
        Map map = this.f29886j.get(this.f29889m);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i10);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(valueOf);
            if (taskCompletionSource != null) {
                if (j1Var != null) {
                    taskCompletionSource.setException(g0.t(j1Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(valueOf);
            }
        }
    }

    private void r() {
        while (!this.f29882f.isEmpty() && this.f29883g.size() < this.f29881e) {
            Iterator it = this.f29882f.iterator();
            l lVar = (l) it.next();
            it.remove();
            int c10 = this.f29888l.c();
            this.f29884h.put(Integer.valueOf(c10), new b(lVar));
            this.f29883g.put(lVar, Integer.valueOf(c10));
            this.f29878b.G(new i4(a1.b(lVar.l()).D(), c10, -1, h1.LIMBO_RESOLUTION));
        }
    }

    private void t(int i10, j1 j1Var) {
        for (a1 a1Var : this.f29880d.get(Integer.valueOf(i10))) {
            this.f29879c.remove(a1Var);
            if (!j1Var.o()) {
                this.f29890n.b(a1Var, j1Var);
                p(j1Var, "Listen for %s failed", a1Var);
            }
        }
        this.f29880d.remove(Integer.valueOf(i10));
        e<l> d10 = this.f29885i.d(i10);
        this.f29885i.h(i10);
        Iterator<l> it = d10.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (!this.f29885i.c(next)) {
                u(next);
            }
        }
    }

    private void u(l lVar) {
        this.f29882f.remove(lVar);
        Integer num = this.f29883g.get(lVar);
        if (num != null) {
            this.f29878b.T(num.intValue());
            this.f29883g.remove(lVar);
            this.f29884h.remove(num);
            r();
        }
    }

    private void v(int i10) {
        if (this.f29887k.containsKey(Integer.valueOf(i10))) {
            for (TaskCompletionSource result : this.f29887k.get(Integer.valueOf(i10))) {
                result.setResult(null);
            }
            this.f29887k.remove(Integer.valueOf(i10));
        }
    }

    private void z(t0 t0Var) {
        l a10 = t0Var.a();
        if (!this.f29883g.containsKey(a10) && !this.f29882f.contains(a10)) {
            v.a(f29876o, "New document in limbo: %s", a10);
            this.f29882f.add(a10);
            r();
        }
    }

    public <TResult> Task<TResult> A(g gVar, f1 f1Var, t<j1, Task<TResult>> tVar) {
        return new n1(gVar, this.f29878b, f1Var, tVar).i();
    }

    public void C(List<f> list, TaskCompletionSource<Void> taskCompletionSource) {
        h("writeMutations");
        m p02 = this.f29877a.p0(list);
        g(p02.b(), taskCompletionSource);
        i(p02.c(), (m0) null);
        this.f29878b.u();
    }

    public void a(y0 y0Var) {
        h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<a1, c1> value : this.f29879c.entrySet()) {
            w1 d10 = ((c1) value.getValue()).c().d(y0Var);
            y7.b.d(d10.a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (d10.b() != null) {
                arrayList.add(d10.b());
            }
        }
        this.f29890n.c(arrayList);
        this.f29890n.a(y0Var);
    }

    public e<l> b(int i10) {
        b bVar = this.f29884h.get(Integer.valueOf(i10));
        if (bVar != null && bVar.f29893b) {
            return l.e().e(bVar.f29892a);
        }
        e<l> e10 = l.e();
        if (this.f29880d.containsKey(Integer.valueOf(i10))) {
            for (a1 a1Var : this.f29880d.get(Integer.valueOf(i10))) {
                if (this.f29879c.containsKey(a1Var)) {
                    e10 = e10.h(this.f29879c.get(a1Var).c().j());
                }
            }
        }
        return e10;
    }

    public void c(int i10, j1 j1Var) {
        h("handleRejectedListen");
        b bVar = this.f29884h.get(Integer.valueOf(i10));
        l c10 = bVar != null ? bVar.f29892a : null;
        if (c10 != null) {
            this.f29883g.remove(c10);
            this.f29884h.remove(Integer.valueOf(i10));
            r();
            w wVar = w.f30653b;
            f(new m0(wVar, Collections.emptyMap(), Collections.emptyMap(), Collections.singletonMap(c10, s.p(c10, wVar)), Collections.singleton(c10)));
            return;
        }
        this.f29877a.j0(i10);
        t(i10, j1Var);
    }

    public void d(h hVar) {
        h("handleSuccessfulWrite");
        q(hVar.b().e(), (j1) null);
        v(hVar.b().e());
        i(this.f29877a.u(hVar), (m0) null);
    }

    public void e(int i10, j1 j1Var) {
        h("handleRejectedWrite");
        g7.c<l, i> i02 = this.f29877a.i0(i10);
        if (!i02.isEmpty()) {
            p(j1Var, "Write failed at %s", i02.g().l());
        }
        q(i10, j1Var);
        v(i10);
        i(i02, (m0) null);
    }

    public void f(m0 m0Var) {
        h("handleRemoteEvent");
        for (Map.Entry next : m0Var.d().entrySet()) {
            u0 u0Var = (u0) next.getValue();
            b bVar = this.f29884h.get((Integer) next.getKey());
            if (bVar != null) {
                y7.b.d((u0Var.b().size() + u0Var.c().size()) + u0Var.d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (u0Var.b().size() > 0) {
                    boolean unused = bVar.f29893b = true;
                } else if (u0Var.c().size() > 0) {
                    y7.b.d(bVar.f29893b, "Received change for limbo target document without add.", new Object[0]);
                } else if (u0Var.d().size() > 0) {
                    y7.b.d(bVar.f29893b, "Received remove for limbo target document without add.", new Object[0]);
                    boolean unused2 = bVar.f29893b = false;
                }
            }
        }
        i(this.f29877a.w(m0Var), m0Var);
    }

    public void l(j jVar) {
        boolean z10 = !this.f29889m.equals(jVar);
        this.f29889m = jVar;
        if (z10) {
            k();
            i(this.f29877a.K(jVar), (m0) null);
        }
        this.f29878b.v();
    }

    public int n(a1 a1Var) {
        h("listen");
        y7.b.d(!this.f29879c.containsKey(a1Var), "We already listen to query: %s", a1Var);
        i4 v10 = this.f29877a.v(a1Var.D());
        this.f29890n.c(Collections.singletonList(m(a1Var, v10.h(), v10.d())));
        this.f29878b.G(v10);
        return v10.h();
    }

    public void o(q7.f fVar, h0 h0Var) {
        try {
            q7.e d10 = fVar.d();
            if (this.f29877a.L(d10)) {
                h0Var.e(com.google.firebase.firestore.i0.b(d10));
                try {
                    fVar.b();
                } catch (IOException e10) {
                    v.e("SyncEngine", "Exception while closing bundle", e10);
                }
            } else {
                h0Var.f(com.google.firebase.firestore.i0.a(d10));
                d dVar = new d(this.f29877a, d10);
                long j10 = 0;
                while (true) {
                    q7.c f10 = fVar.f();
                    if (f10 != null) {
                        long e11 = fVar.e();
                        com.google.firebase.firestore.i0 a10 = dVar.a(f10, e11 - j10);
                        if (a10 != null) {
                            h0Var.f(a10);
                        }
                        j10 = e11;
                    } else {
                        i(dVar.b(), (m0) null);
                        this.f29877a.b(d10);
                        h0Var.e(com.google.firebase.firestore.i0.b(d10));
                        try {
                            fVar.b();
                            return;
                        } catch (IOException e12) {
                            v.e("SyncEngine", "Exception while closing bundle", e12);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e13) {
            v.e("Firestore", "Loading bundle failed : %s", e13);
            h0Var.d(new z("Bundle failed to load", z.a.INVALID_ARGUMENT, e13));
            try {
                fVar.b();
            } catch (IOException e14) {
                v.e("SyncEngine", "Exception while closing bundle", e14);
            }
        } catch (Throwable th) {
            try {
                fVar.b();
            } catch (IOException e15) {
                v.e("SyncEngine", "Exception while closing bundle", e15);
            }
            throw th;
        }
    }

    public void s(TaskCompletionSource<Void> taskCompletionSource) {
        if (!this.f29878b.o()) {
            v.a(f29876o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int B = this.f29877a.B();
        if (B == -1) {
            taskCompletionSource.setResult(null);
            return;
        }
        if (!this.f29887k.containsKey(Integer.valueOf(B))) {
            this.f29887k.put(Integer.valueOf(B), new ArrayList());
        }
        this.f29887k.get(Integer.valueOf(B)).add(taskCompletionSource);
    }

    public Task<Map<String, d0>> w(a1 a1Var, List<com.google.firebase.firestore.a> list) {
        return this.f29878b.K(a1Var, list);
    }

    public void x(c cVar) {
        this.f29890n = cVar;
    }

    /* access modifiers changed from: package-private */
    public void y(a1 a1Var) {
        h("stopListening");
        c1 c1Var = this.f29879c.get(a1Var);
        y7.b.d(c1Var != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f29879c.remove(a1Var);
        int b10 = c1Var.b();
        List list = this.f29880d.get(Integer.valueOf(b10));
        list.remove(a1Var);
        if (list.isEmpty()) {
            this.f29877a.j0(b10);
            this.f29878b.T(b10);
            t(b10, j1.f32233f);
        }
    }
}
