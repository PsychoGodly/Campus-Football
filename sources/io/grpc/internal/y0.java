package io.grpc.internal;

import dd.c0;
import dd.d0;
import dd.f;
import dd.i0;
import dd.j0;
import dd.j1;
import dd.n1;
import dd.p;
import dd.q;
import dd.x;
import dd.z0;
import io.grpc.internal.k;
import io.grpc.internal.k1;
import io.grpc.internal.r;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import r6.o;
import r6.t;
import r6.v;

/* compiled from: InternalSubchannel */
final class y0 implements i0<Object>, n2 {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f35444a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35445b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35446c;

    /* renamed from: d  reason: collision with root package name */
    private final k.a f35447d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final j f35448e;

    /* renamed from: f  reason: collision with root package name */
    private final t f35449f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f35450g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final d0 f35451h;

    /* renamed from: i  reason: collision with root package name */
    private final m f35452i;

    /* renamed from: j  reason: collision with root package name */
    private final o f35453j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final dd.f f35454k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final n1 f35455l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final k f35456m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public volatile List<x> f35457n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public k f35458o;

    /* renamed from: p  reason: collision with root package name */
    private final t f35459p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public n1.d f35460q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public n1.d f35461r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public k1 f35462s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final Collection<v> f35463t = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final w0<v> f35464u = new a();
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public v f35465v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public volatile k1 f35466w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public volatile q f35467x = q.a(p.IDLE);
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public j1 f35468y;

    /* compiled from: InternalSubchannel */
    class a extends w0<v> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void b() {
            y0.this.f35448e.a(y0.this);
        }

        /* access modifiers changed from: protected */
        public void c() {
            y0.this.f35448e.b(y0.this);
        }
    }

    /* compiled from: InternalSubchannel */
    class b implements Runnable {
        b() {
        }

        public void run() {
            n1.d unused = y0.this.f35460q = null;
            y0.this.f35454k.a(f.a.INFO, "CONNECTING after backoff");
            y0.this.N(p.CONNECTING);
            y0.this.T();
        }
    }

    /* compiled from: InternalSubchannel */
    class c implements Runnable {
        c() {
        }

        public void run() {
            if (y0.this.f35467x.c() == p.IDLE) {
                y0.this.f35454k.a(f.a.INFO, "CONNECTING as requested");
                y0.this.N(p.CONNECTING);
                y0.this.T();
            }
        }
    }

    /* compiled from: InternalSubchannel */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f35472a;

        /* compiled from: InternalSubchannel */
        class a implements Runnable {
            a() {
            }

            public void run() {
                k1 p10 = y0.this.f35462s;
                n1.d unused = y0.this.f35461r = null;
                k1 unused2 = y0.this.f35462s = null;
                p10.b(j1.f32248u.q("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f35472a = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r0 = r0.f35456m
                java.net.SocketAddress r0 = r0.a()
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r1 = r1.f35456m
                java.util.List r2 = r7.f35472a
                r1.h(r2)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                java.util.List r2 = r7.f35472a
                java.util.List unused = r1.f35457n = r2
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                dd.q r1 = r1.f35467x
                dd.p r1 = r1.c()
                dd.p r2 = dd.p.READY
                r3 = 0
                if (r1 == r2) goto L_0x0039
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                dd.q r1 = r1.f35467x
                dd.p r1 = r1.c()
                dd.p r4 = dd.p.CONNECTING
                if (r1 != r4) goto L_0x0091
            L_0x0039:
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r1 = r1.f35456m
                boolean r0 = r1.g(r0)
                if (r0 != 0) goto L_0x0091
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                dd.q r0 = r0.f35467x
                dd.p r0 = r0.c()
                if (r0 != r2) goto L_0x006d
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.k1 r0 = r0.f35466w
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.k1 unused = r1.f35466w = r3
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r1 = r1.f35456m
                r1.f()
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                dd.p r2 = dd.p.IDLE
                r1.N(r2)
                goto L_0x0092
            L_0x006d:
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.v r0 = r0.f35465v
                dd.j1 r1 = dd.j1.f32248u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                dd.j1 r1 = r1.q(r2)
                r0.b(r1)
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.v unused = r0.f35465v = r3
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r0 = r0.f35456m
                r0.f()
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                r0.T()
            L_0x0091:
                r0 = r3
            L_0x0092:
                if (r0 == 0) goto L_0x00e1
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                dd.n1$d r1 = r1.f35461r
                if (r1 == 0) goto L_0x00c0
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.k1 r1 = r1.f35462s
                dd.j1 r2 = dd.j1.f32248u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                dd.j1 r2 = r2.q(r4)
                r1.b(r2)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                dd.n1$d r1 = r1.f35461r
                r1.a()
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                dd.n1.d unused = r1.f35461r = r3
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.k1 unused = r1.f35462s = r3
            L_0x00c0:
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.k1 unused = r1.f35462s = r0
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                dd.n1 r1 = r0.f35455l
                io.grpc.internal.y0$d$a r2 = new io.grpc.internal.y0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.y0 r6 = io.grpc.internal.y0.this
                java.util.concurrent.ScheduledExecutorService r6 = r6.f35450g
                dd.n1$d r1 = r1.c(r2, r3, r5, r6)
                dd.n1.d unused = r0.f35461r = r1
            L_0x00e1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y0.d.run():void");
        }
    }

    /* compiled from: InternalSubchannel */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f35475a;

        e(j1 j1Var) {
            this.f35475a = j1Var;
        }

        public void run() {
            p c10 = y0.this.f35467x.c();
            p pVar = p.SHUTDOWN;
            if (c10 != pVar) {
                j1 unused = y0.this.f35468y = this.f35475a;
                k1 j10 = y0.this.f35466w;
                v l10 = y0.this.f35465v;
                k1 unused2 = y0.this.f35466w = null;
                v unused3 = y0.this.f35465v = null;
                y0.this.N(pVar);
                y0.this.f35456m.f();
                if (y0.this.f35463t.isEmpty()) {
                    y0.this.P();
                }
                y0.this.K();
                if (y0.this.f35461r != null) {
                    y0.this.f35461r.a();
                    y0.this.f35462s.b(this.f35475a);
                    n1.d unused4 = y0.this.f35461r = null;
                    k1 unused5 = y0.this.f35462s = null;
                }
                if (j10 != null) {
                    j10.b(this.f35475a);
                }
                if (l10 != null) {
                    l10.b(this.f35475a);
                }
            }
        }
    }

    /* compiled from: InternalSubchannel */
    class f implements Runnable {
        f() {
        }

        public void run() {
            y0.this.f35454k.a(f.a.INFO, "Terminated");
            y0.this.f35448e.d(y0.this);
        }
    }

    /* compiled from: InternalSubchannel */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f35478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35479b;

        g(v vVar, boolean z10) {
            this.f35478a = vVar;
            this.f35479b = z10;
        }

        public void run() {
            y0.this.f35464u.e(this.f35478a, this.f35479b);
        }
    }

    /* compiled from: InternalSubchannel */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f35481a;

        h(j1 j1Var) {
            this.f35481a = j1Var;
        }

        public void run() {
            for (k1 d10 : new ArrayList(y0.this.f35463t)) {
                d10.d(this.f35481a);
            }
        }
    }

    /* compiled from: InternalSubchannel */
    static final class i extends k0 {

        /* renamed from: a  reason: collision with root package name */
        private final v f35483a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final m f35484b;

        /* compiled from: InternalSubchannel */
        class a extends i0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f35485a;

            /* renamed from: io.grpc.internal.y0$i$a$a  reason: collision with other inner class name */
            /* compiled from: InternalSubchannel */
            class C0401a extends j0 {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f35487a;

                C0401a(r rVar) {
                    this.f35487a = rVar;
                }

                public void d(j1 j1Var, r.a aVar, dd.y0 y0Var) {
                    i.this.f35484b.a(j1Var.o());
                    super.d(j1Var, aVar, y0Var);
                }

                /* access modifiers changed from: protected */
                public r e() {
                    return this.f35487a;
                }
            }

            a(q qVar) {
                this.f35485a = qVar;
            }

            /* access modifiers changed from: protected */
            public q e() {
                return this.f35485a;
            }

            public void q(r rVar) {
                i.this.f35484b.b();
                super.q(new C0401a(rVar));
            }
        }

        /* synthetic */ i(v vVar, m mVar, a aVar) {
            this(vVar, mVar);
        }

        /* access modifiers changed from: protected */
        public v a() {
            return this.f35483a;
        }

        public q c(z0<?, ?> z0Var, dd.y0 y0Var, dd.c cVar, dd.k[] kVarArr) {
            return new a(super.c(z0Var, y0Var, cVar, kVarArr));
        }

        private i(v vVar, m mVar) {
            this.f35483a = vVar;
            this.f35484b = mVar;
        }
    }

    /* compiled from: InternalSubchannel */
    static abstract class j {
        j() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(y0 y0Var);

        /* access modifiers changed from: package-private */
        public abstract void b(y0 y0Var);

        /* access modifiers changed from: package-private */
        public abstract void c(y0 y0Var, q qVar);

        /* access modifiers changed from: package-private */
        public abstract void d(y0 y0Var);
    }

    /* compiled from: InternalSubchannel */
    static final class k {

        /* renamed from: a  reason: collision with root package name */
        private List<x> f35489a;

        /* renamed from: b  reason: collision with root package name */
        private int f35490b;

        /* renamed from: c  reason: collision with root package name */
        private int f35491c;

        public k(List<x> list) {
            this.f35489a = list;
        }

        public SocketAddress a() {
            return this.f35489a.get(this.f35490b).a().get(this.f35491c);
        }

        public dd.a b() {
            return this.f35489a.get(this.f35490b).b();
        }

        public void c() {
            int i10 = this.f35491c + 1;
            this.f35491c = i10;
            if (i10 >= this.f35489a.get(this.f35490b).a().size()) {
                this.f35490b++;
                this.f35491c = 0;
            }
        }

        public boolean d() {
            return this.f35490b == 0 && this.f35491c == 0;
        }

        public boolean e() {
            return this.f35490b < this.f35489a.size();
        }

        public void f() {
            this.f35490b = 0;
            this.f35491c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            int i10 = 0;
            while (i10 < this.f35489a.size()) {
                int indexOf = this.f35489a.get(i10).a().indexOf(socketAddress);
                if (indexOf == -1) {
                    i10++;
                } else {
                    this.f35490b = i10;
                    this.f35491c = indexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List<x> list) {
            this.f35489a = list;
            f();
        }
    }

    /* compiled from: InternalSubchannel */
    private class l implements k1.a {

        /* renamed from: a  reason: collision with root package name */
        final v f35492a;

        /* renamed from: b  reason: collision with root package name */
        final SocketAddress f35493b;

        /* renamed from: c  reason: collision with root package name */
        boolean f35494c = false;

        /* compiled from: InternalSubchannel */
        class a implements Runnable {
            a() {
            }

            public void run() {
                k unused = y0.this.f35458o = null;
                if (y0.this.f35468y != null) {
                    o.v(y0.this.f35466w == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f35492a.b(y0.this.f35468y);
                    return;
                }
                v l10 = y0.this.f35465v;
                l lVar2 = l.this;
                v vVar = lVar2.f35492a;
                if (l10 == vVar) {
                    k1 unused2 = y0.this.f35466w = vVar;
                    v unused3 = y0.this.f35465v = null;
                    y0.this.N(p.READY);
                }
            }
        }

        /* compiled from: InternalSubchannel */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j1 f35497a;

            b(j1 j1Var) {
                this.f35497a = j1Var;
            }

            public void run() {
                if (y0.this.f35467x.c() != p.SHUTDOWN) {
                    k1 j10 = y0.this.f35466w;
                    l lVar = l.this;
                    if (j10 == lVar.f35492a) {
                        k1 unused = y0.this.f35466w = null;
                        y0.this.f35456m.f();
                        y0.this.N(p.IDLE);
                        return;
                    }
                    v l10 = y0.this.f35465v;
                    l lVar2 = l.this;
                    if (l10 == lVar2.f35492a) {
                        o.x(y0.this.f35467x.c() == p.CONNECTING, "Expected state is CONNECTING, actual state is %s", y0.this.f35467x.c());
                        y0.this.f35456m.c();
                        if (!y0.this.f35456m.e()) {
                            v unused2 = y0.this.f35465v = null;
                            y0.this.f35456m.f();
                            y0.this.S(this.f35497a);
                            return;
                        }
                        y0.this.T();
                    }
                }
            }
        }

        /* compiled from: InternalSubchannel */
        class c implements Runnable {
            c() {
            }

            public void run() {
                y0.this.f35463t.remove(l.this.f35492a);
                if (y0.this.f35467x.c() == p.SHUTDOWN && y0.this.f35463t.isEmpty()) {
                    y0.this.P();
                }
            }
        }

        l(v vVar, SocketAddress socketAddress) {
            this.f35492a = vVar;
            this.f35493b = socketAddress;
        }

        public void a(j1 j1Var) {
            y0.this.f35454k.b(f.a.INFO, "{0} SHUTDOWN with {1}", this.f35492a.g(), y0.this.R(j1Var));
            this.f35494c = true;
            y0.this.f35455l.execute(new b(j1Var));
        }

        public void b() {
            y0.this.f35454k.a(f.a.INFO, "READY");
            y0.this.f35455l.execute(new a());
        }

        public void c() {
            o.v(this.f35494c, "transportShutdown() must be called before transportTerminated().");
            y0.this.f35454k.b(f.a.INFO, "{0} Terminated", this.f35492a.g());
            y0.this.f35451h.i(this.f35492a);
            y0.this.Q(this.f35492a, false);
            y0.this.f35455l.execute(new c());
        }

        public void d(boolean z10) {
            y0.this.Q(this.f35492a, z10);
        }
    }

    /* compiled from: InternalSubchannel */
    static final class m extends dd.f {

        /* renamed from: a  reason: collision with root package name */
        j0 f35500a;

        m() {
        }

        public void a(f.a aVar, String str) {
            n.d(this.f35500a, aVar, str);
        }

        public void b(f.a aVar, String str, Object... objArr) {
            n.e(this.f35500a, aVar, str, objArr);
        }
    }

    y0(List<x> list, String str, String str2, k.a aVar, t tVar, ScheduledExecutorService scheduledExecutorService, v<t> vVar, n1 n1Var, j jVar, d0 d0Var, m mVar, o oVar, j0 j0Var, dd.f fVar) {
        List<x> list2 = list;
        o.p(list, "addressGroups");
        o.e(!list.isEmpty(), "addressGroups is empty");
        L(list, "addressGroups contains null entry");
        List<x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f35457n = unmodifiableList;
        this.f35456m = new k(unmodifiableList);
        this.f35445b = str;
        this.f35446c = str2;
        this.f35447d = aVar;
        this.f35449f = tVar;
        this.f35450g = scheduledExecutorService;
        this.f35459p = vVar.get();
        this.f35455l = n1Var;
        this.f35448e = jVar;
        this.f35451h = d0Var;
        this.f35452i = mVar;
        this.f35453j = (o) o.p(oVar, "channelTracer");
        this.f35444a = (j0) o.p(j0Var, "logId");
        this.f35454k = (dd.f) o.p(fVar, "channelLogger");
    }

    /* access modifiers changed from: private */
    public void K() {
        this.f35455l.e();
        n1.d dVar = this.f35460q;
        if (dVar != null) {
            dVar.a();
            this.f35460q = null;
            this.f35458o = null;
        }
    }

    private static void L(List<?> list, String str) {
        for (Object p10 : list) {
            o.p(p10, str);
        }
    }

    /* access modifiers changed from: private */
    public void N(p pVar) {
        this.f35455l.e();
        O(q.a(pVar));
    }

    private void O(q qVar) {
        this.f35455l.e();
        if (this.f35467x.c() != qVar.c()) {
            boolean z10 = this.f35467x.c() != p.SHUTDOWN;
            o.v(z10, "Cannot transition out of SHUTDOWN to " + qVar);
            this.f35467x = qVar;
            this.f35448e.c(this, qVar);
        }
    }

    /* access modifiers changed from: private */
    public void P() {
        this.f35455l.execute(new f());
    }

    /* access modifiers changed from: private */
    public void Q(v vVar, boolean z10) {
        this.f35455l.execute(new g(vVar, z10));
    }

    /* access modifiers changed from: private */
    public String R(j1 j1Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j1Var.m());
        if (j1Var.n() != null) {
            sb2.append("(");
            sb2.append(j1Var.n());
            sb2.append(")");
        }
        if (j1Var.l() != null) {
            sb2.append("[");
            sb2.append(j1Var.l());
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public void S(j1 j1Var) {
        this.f35455l.e();
        O(q.b(j1Var));
        if (this.f35458o == null) {
            this.f35458o = this.f35447d.get();
        }
        long a10 = this.f35458o.a();
        t tVar = this.f35459p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d10 = a10 - tVar.d(timeUnit);
        boolean z10 = false;
        this.f35454k.b(f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", R(j1Var), Long.valueOf(d10));
        if (this.f35460q == null) {
            z10 = true;
        }
        o.v(z10, "previous reconnectTask is not done");
        this.f35460q = this.f35455l.c(new b(), d10, timeUnit, this.f35450g);
    }

    /* access modifiers changed from: private */
    public void T() {
        SocketAddress socketAddress;
        c0 c0Var;
        this.f35455l.e();
        o.v(this.f35460q == null, "Should have no reconnectTask scheduled");
        if (this.f35456m.d()) {
            this.f35459p.f().g();
        }
        SocketAddress a10 = this.f35456m.a();
        if (a10 instanceof c0) {
            c0Var = (c0) a10;
            socketAddress = c0Var.c();
        } else {
            socketAddress = a10;
            c0Var = null;
        }
        dd.a b10 = this.f35456m.b();
        String str = (String) b10.b(x.f32377d);
        t.a aVar = new t.a();
        if (str == null) {
            str = this.f35445b;
        }
        t.a g10 = aVar.e(str).f(b10).h(this.f35446c).g(c0Var);
        m mVar = new m();
        mVar.f35500a = g();
        i iVar = new i(this.f35449f.F0(socketAddress, g10, mVar), this.f35452i, (a) null);
        mVar.f35500a = iVar.g();
        this.f35451h.c(iVar);
        this.f35465v = iVar;
        this.f35463t.add(iVar);
        Runnable e10 = iVar.e(new l(iVar, socketAddress));
        if (e10 != null) {
            this.f35455l.b(e10);
        }
        this.f35454k.b(f.a.INFO, "Started transport {0}", mVar.f35500a);
    }

    /* access modifiers changed from: package-private */
    public p M() {
        return this.f35467x.c();
    }

    public void U(List<x> list) {
        o.p(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        o.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f35455l.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    public s a() {
        k1 k1Var = this.f35466w;
        if (k1Var != null) {
            return k1Var;
        }
        this.f35455l.execute(new c());
        return null;
    }

    public void b(j1 j1Var) {
        this.f35455l.execute(new e(j1Var));
    }

    /* access modifiers changed from: package-private */
    public void d(j1 j1Var) {
        b(j1Var);
        this.f35455l.execute(new h(j1Var));
    }

    public j0 g() {
        return this.f35444a;
    }

    public String toString() {
        return r6.i.c(this).c("logId", this.f35444a.d()).d("addressGroups", this.f35457n).toString();
    }
}
