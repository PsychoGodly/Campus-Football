package io.grpc.internal;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import dd.a;
import dd.a1;
import dd.c1;
import dd.d0;
import dd.e0;
import dd.f;
import dd.f0;
import dd.g;
import dd.i0;
import dd.j0;
import dd.j1;
import dd.k;
import dd.n1;
import dd.r0;
import dd.u0;
import dd.y0;
import dd.z0;
import io.grpc.internal.j;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.k1;
import io.grpc.internal.m;
import io.grpc.internal.p;
import io.grpc.internal.y0;
import io.grpc.internal.z1;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: ManagedChannelImpl */
final class g1 extends u0 implements i0<Object> {

    /* renamed from: n0  reason: collision with root package name */
    static final Logger f34922n0 = Logger.getLogger(g1.class.getName());

    /* renamed from: o0  reason: collision with root package name */
    static final Pattern f34923o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0  reason: collision with root package name */
    static final j1 f34924p0;

    /* renamed from: q0  reason: collision with root package name */
    static final j1 f34925q0;

    /* renamed from: r0  reason: collision with root package name */
    static final j1 f34926r0;
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public static final j1 f34927s0 = j1.a();
    /* access modifiers changed from: private */

    /* renamed from: t0  reason: collision with root package name */
    public static final f0 f34928t0 = new a();
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public static final dd.g<Object, Object> f34929u0 = new l();
    private final dd.d A;
    /* access modifiers changed from: private */
    public final String B;
    /* access modifiers changed from: private */
    public a1 C;
    private boolean D;
    /* access modifiers changed from: private */
    public t E;
    /* access modifiers changed from: private */
    public volatile r0.i F;
    private boolean G;
    /* access modifiers changed from: private */
    public final Set<y0> H = new HashSet(16, 0.75f);
    /* access modifiers changed from: private */
    public Collection<v.g<?, ?>> I;
    /* access modifiers changed from: private */
    public final Object J = new Object();
    private final Set<q1> K = new HashSet(1, 0.75f);
    /* access modifiers changed from: private */
    public final a0 L;
    /* access modifiers changed from: private */
    public final z M = new z(this, (a) null);
    /* access modifiers changed from: private */
    public final AtomicBoolean N = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public boolean O;
    /* access modifiers changed from: private */
    public boolean P;
    /* access modifiers changed from: private */
    public volatile boolean Q;
    private final CountDownLatch R = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public final m.b S;
    /* access modifiers changed from: private */
    public final m T;
    /* access modifiers changed from: private */
    public final o U;
    /* access modifiers changed from: private */
    public final dd.f V;
    /* access modifiers changed from: private */
    public final d0 W;
    /* access modifiers changed from: private */
    public final v X;
    /* access modifiers changed from: private */
    public w Y = w.NO_RESOLUTION;
    /* access modifiers changed from: private */
    public j1 Z = f34927s0;

    /* renamed from: a  reason: collision with root package name */
    private final j0 f34930a;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public final j1 f34931a0;

    /* renamed from: b  reason: collision with root package name */
    private final String f34932b;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public boolean f34933b0 = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f34934c;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f34935c0;

    /* renamed from: d  reason: collision with root package name */
    private final c1 f34936d;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public final z1.t f34937d0 = new z1.t();

    /* renamed from: e  reason: collision with root package name */
    private final a1.d f34938e;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public final long f34939e0;

    /* renamed from: f  reason: collision with root package name */
    private final a1.b f34940f;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public final long f34941f0;

    /* renamed from: g  reason: collision with root package name */
    private final j f34942g;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f34943g0;

    /* renamed from: h  reason: collision with root package name */
    private final t f34944h;

    /* renamed from: h0  reason: collision with root package name */
    private final k1.a f34945h0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final t f34946i;

    /* renamed from: i0  reason: collision with root package name */
    final w0<Object> f34947i0;

    /* renamed from: j  reason: collision with root package name */
    private final t f34948j;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public n1.d f34949j0;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final x f34950k;
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public k f34951k0;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Executor f34952l;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public final p.e f34953l0;

    /* renamed from: m  reason: collision with root package name */
    private final p1<? extends Executor> f34954m;

    /* renamed from: m0  reason: collision with root package name */
    private final y1 f34955m0;

    /* renamed from: n  reason: collision with root package name */
    private final p1<? extends Executor> f34956n;

    /* renamed from: o  reason: collision with root package name */
    private final q f34957o;

    /* renamed from: p  reason: collision with root package name */
    private final q f34958p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final l2 f34959q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final int f34960r;

    /* renamed from: s  reason: collision with root package name */
    final n1 f34961s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f34962t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final dd.v f34963u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final dd.o f34964v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final r6.v<r6.t> f34965w;

    /* renamed from: x  reason: collision with root package name */
    private final long f34966x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final w f34967y = new w();
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final k.a f34968z;

    /* compiled from: ManagedChannelImpl */
    class a extends f0 {
        a() {
        }

        public f0.b a(r0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class b implements Runnable {
        b() {
        }

        public void run() {
            g1.this.A0(true);
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class c implements m.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l2 f34970a;

        c(l2 l2Var) {
            this.f34970a = l2Var;
        }

        public m a() {
            return new m(this.f34970a);
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f34972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dd.p f34973b;

        d(Runnable runnable, dd.p pVar) {
            this.f34972a = runnable;
            this.f34973b = pVar;
        }

        public void run() {
            g1.this.f34967y.c(this.f34972a, g1.this.f34952l, this.f34973b);
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class e extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.e f34975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f34976b;

        e(Throwable th) {
            this.f34976b = th;
            this.f34975a = r0.e.e(j1.f32247t.q("Panic! This is a bug!").p(th));
        }

        public r0.e a(r0.f fVar) {
            return this.f34975a;
        }

        public String toString() {
            return r6.i.b(e.class).d("panicPickResult", this.f34975a).toString();
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class f implements Runnable {
        f() {
        }

        public void run() {
            if (!g1.this.N.get() && g1.this.E != null) {
                g1.this.A0(false);
                g1.this.C0();
            }
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class g implements Runnable {
        g() {
        }

        public void run() {
            g1.this.D0();
            if (g1.this.F != null) {
                g1.this.F.b();
            }
            if (g1.this.E != null) {
                g1.this.E.f35002a.c();
            }
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class h implements Runnable {
        h() {
        }

        public void run() {
            g1.this.V.a(f.a.INFO, "Entering SHUTDOWN state");
            g1.this.f34967y.b(dd.p.SHUTDOWN);
        }
    }

    /* compiled from: ManagedChannelImpl */
    final class i implements Runnable {
        i() {
        }

        public void run() {
            if (!g1.this.O) {
                boolean unused = g1.this.O = true;
                g1.this.H0();
            }
        }
    }

    /* compiled from: ManagedChannelImpl */
    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = g1.f34922n0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + g1.this.g() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            g1.this.J0(th);
        }
    }

    /* compiled from: ManagedChannelImpl */
    class k extends n0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34983b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a1 a1Var, String str) {
            super(a1Var);
            this.f34983b = str;
        }

        public String a() {
            return this.f34983b;
        }
    }

    /* compiled from: ManagedChannelImpl */
    class l extends dd.g<Object, Object> {
        l() {
        }

        public void a(String str, Throwable th) {
        }

        public void b() {
        }

        public void c(int i10) {
        }

        public void d(Object obj) {
        }

        public void e(g.a<Object> aVar, y0 y0Var) {
        }
    }

    /* compiled from: ManagedChannelImpl */
    private final class m implements p.e {

        /* compiled from: ManagedChannelImpl */
        final class a implements Runnable {
            a() {
            }

            public void run() {
                g1.this.D0();
            }
        }

        /* compiled from: ManagedChannelImpl */
        final class b<ReqT> extends z1<ReqT> {
            final /* synthetic */ z0 E;
            final /* synthetic */ y0 F;
            final /* synthetic */ dd.c G;
            final /* synthetic */ a2 H;
            final /* synthetic */ t0 I;
            final /* synthetic */ z1.c0 J;
            final /* synthetic */ dd.r K;
            final /* synthetic */ m L;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            b(io.grpc.internal.g1.m r16, dd.z0 r17, dd.y0 r18, dd.c r19, io.grpc.internal.a2 r20, io.grpc.internal.t0 r21, io.grpc.internal.z1.c0 r22, dd.r r23) {
                /*
                    r15 = this;
                    r13 = r15
                    r0 = r16
                    r1 = r19
                    r13.L = r0
                    r2 = r17
                    r13.E = r2
                    r3 = r18
                    r13.F = r3
                    r13.G = r1
                    r10 = r20
                    r13.H = r10
                    r11 = r21
                    r13.I = r11
                    r12 = r22
                    r13.J = r12
                    r4 = r23
                    r13.K = r4
                    io.grpc.internal.g1 r4 = io.grpc.internal.g1.this
                    io.grpc.internal.z1$t r4 = r4.f34937d0
                    io.grpc.internal.g1 r5 = io.grpc.internal.g1.this
                    long r5 = r5.f34939e0
                    io.grpc.internal.g1 r7 = io.grpc.internal.g1.this
                    long r7 = r7.f34941f0
                    io.grpc.internal.g1 r9 = io.grpc.internal.g1.this
                    java.util.concurrent.Executor r9 = r9.E0(r1)
                    io.grpc.internal.g1 r0 = io.grpc.internal.g1.this
                    io.grpc.internal.t r0 = r0.f34946i
                    java.util.concurrent.ScheduledExecutorService r14 = r0.D0()
                    r0 = r15
                    r1 = r17
                    r2 = r18
                    r3 = r4
                    r4 = r5
                    r6 = r7
                    r8 = r9
                    r9 = r14
                    r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.g1.m.b.<init>(io.grpc.internal.g1$m, dd.z0, dd.y0, dd.c, io.grpc.internal.a2, io.grpc.internal.t0, io.grpc.internal.z1$c0, dd.r):void");
            }

            /* access modifiers changed from: package-private */
            public q i0(y0 y0Var, k.a aVar, int i10, boolean z10) {
                dd.c r10 = this.G.r(aVar);
                dd.k[] f10 = r0.f(r10, y0Var, i10, z10);
                s b10 = this.L.c(new t1(this.E, y0Var, r10));
                dd.r b11 = this.K.b();
                try {
                    return b10.c(this.E, y0Var, r10, f10);
                } finally {
                    this.K.f(b11);
                }
            }

            /* access modifiers changed from: package-private */
            public void j0() {
                g1.this.M.d(this);
            }

            /* access modifiers changed from: package-private */
            public j1 k0() {
                return g1.this.M.a(this);
            }
        }

        private m() {
        }

        /* access modifiers changed from: private */
        public s c(r0.f fVar) {
            r0.i s10 = g1.this.F;
            if (g1.this.N.get()) {
                return g1.this.L;
            }
            if (s10 == null) {
                g1.this.f34961s.execute(new a());
                return g1.this.L;
            }
            s j10 = r0.j(s10.a(fVar), fVar.a().j());
            if (j10 != null) {
                return j10;
            }
            return g1.this.L;
        }

        public q a(z0<?, ?> z0Var, dd.c cVar, y0 y0Var, dd.r rVar) {
            a2 a2Var;
            t0 t0Var;
            if (!g1.this.f34943g0) {
                s c10 = c(new t1(z0Var, y0Var, cVar));
                dd.r b10 = rVar.b();
                try {
                    return c10.c(z0Var, y0Var, cVar, r0.f(cVar, y0Var, 0, false));
                } finally {
                    rVar.f(b10);
                }
            } else {
                z1.c0 g10 = g1.this.Z.g();
                j1.b bVar = (j1.b) cVar.h(j1.b.f35119g);
                if (bVar == null) {
                    a2Var = null;
                } else {
                    a2Var = bVar.f35124e;
                }
                if (bVar == null) {
                    t0Var = null;
                } else {
                    t0Var = bVar.f35125f;
                }
                return new b(this, z0Var, y0Var, cVar, a2Var, t0Var, g10, rVar);
            }
        }

        /* synthetic */ m(g1 g1Var, a aVar) {
            this();
        }
    }

    /* compiled from: ManagedChannelImpl */
    static final class n<ReqT, RespT> extends dd.z<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final f0 f34986a;

        /* renamed from: b  reason: collision with root package name */
        private final dd.d f34987b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f34988c;

        /* renamed from: d  reason: collision with root package name */
        private final z0<ReqT, RespT> f34989d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final dd.r f34990e;

        /* renamed from: f  reason: collision with root package name */
        private dd.c f34991f;

        /* renamed from: g  reason: collision with root package name */
        private dd.g<ReqT, RespT> f34992g;

        /* compiled from: ManagedChannelImpl */
        class a extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g.a f34993b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ dd.j1 f34994c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g.a aVar, dd.j1 j1Var) {
                super(n.this.f34990e);
                this.f34993b = aVar;
                this.f34994c = j1Var;
            }

            public void a() {
                this.f34993b.a(this.f34994c, new y0());
            }
        }

        n(f0 f0Var, dd.d dVar, Executor executor, z0<ReqT, RespT> z0Var, dd.c cVar) {
            this.f34986a = f0Var;
            this.f34987b = dVar;
            this.f34989d = z0Var;
            executor = cVar.e() != null ? cVar.e() : executor;
            this.f34988c = executor;
            this.f34991f = cVar.n(executor);
            this.f34990e = dd.r.e();
        }

        private void h(g.a<RespT> aVar, dd.j1 j1Var) {
            this.f34988c.execute(new a(aVar, j1Var));
        }

        public void a(String str, Throwable th) {
            dd.g<ReqT, RespT> gVar = this.f34992g;
            if (gVar != null) {
                gVar.a(str, th);
            }
        }

        public void e(g.a<RespT> aVar, y0 y0Var) {
            f0.b a10 = this.f34986a.a(new t1(this.f34989d, y0Var, this.f34991f));
            dd.j1 c10 = a10.c();
            if (!c10.o()) {
                h(aVar, r0.n(c10));
                this.f34992g = g1.f34929u0;
                return;
            }
            dd.h b10 = a10.b();
            j1.b f10 = ((j1) a10.a()).f(this.f34989d);
            if (f10 != null) {
                this.f34991f = this.f34991f.q(j1.b.f35119g, f10);
            }
            if (b10 != null) {
                this.f34992g = b10.a(this.f34989d, this.f34991f, this.f34987b);
            } else {
                this.f34992g = this.f34987b.f(this.f34989d, this.f34991f);
            }
            this.f34992g.e(aVar, y0Var);
        }

        /* access modifiers changed from: protected */
        public dd.g<ReqT, RespT> f() {
            return this.f34992g;
        }
    }

    /* compiled from: ManagedChannelImpl */
    class o implements Runnable {
        o() {
        }

        public void run() {
            n1.d unused = g1.this.f34949j0 = null;
            g1.this.L0();
        }
    }

    /* compiled from: ManagedChannelImpl */
    private final class p implements k1.a {
        private p() {
        }

        public void a(dd.j1 j1Var) {
            r6.o.v(g1.this.N.get(), "Channel must have been shut down");
        }

        public void b() {
        }

        public void c() {
            r6.o.v(g1.this.N.get(), "Channel must have been shut down");
            boolean unused = g1.this.P = true;
            g1.this.O0(false);
            g1.this.H0();
            g1.this.I0();
        }

        public void d(boolean z10) {
            g1 g1Var = g1.this;
            g1Var.f34947i0.e(g1Var.L, z10);
        }

        /* synthetic */ p(g1 g1Var, a aVar) {
            this();
        }
    }

    /* compiled from: ManagedChannelImpl */
    static final class q implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final p1<? extends Executor> f34998a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f34999b;

        q(p1<? extends Executor> p1Var) {
            this.f34998a = (p1) r6.o.p(p1Var, "executorPool");
        }

        /* access modifiers changed from: package-private */
        public synchronized Executor a() {
            if (this.f34999b == null) {
                this.f34999b = (Executor) r6.o.q((Executor) this.f34998a.a(), "%s.getObject()", this.f34999b);
            }
            return this.f34999b;
        }

        /* access modifiers changed from: package-private */
        public synchronized void b() {
            Executor executor = this.f34999b;
            if (executor != null) {
                this.f34999b = (Executor) this.f34998a.b(executor);
            }
        }

        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    /* compiled from: ManagedChannelImpl */
    private final class r extends w0<Object> {
        private r() {
        }

        /* access modifiers changed from: protected */
        public void b() {
            g1.this.D0();
        }

        /* access modifiers changed from: protected */
        public void c() {
            if (!g1.this.N.get()) {
                g1.this.M0();
            }
        }

        /* synthetic */ r(g1 g1Var, a aVar) {
            this();
        }
    }

    /* compiled from: ManagedChannelImpl */
    private class s implements Runnable {
        private s() {
        }

        public void run() {
            if (g1.this.E != null) {
                g1.this.C0();
            }
        }

        /* synthetic */ s(g1 g1Var, a aVar) {
            this();
        }
    }

    /* compiled from: ManagedChannelImpl */
    private final class t extends r0.d {

        /* renamed from: a  reason: collision with root package name */
        j.b f35002a;

        /* compiled from: ManagedChannelImpl */
        final class a implements Runnable {
            a() {
            }

            public void run() {
                g1.this.K0();
            }
        }

        /* compiled from: ManagedChannelImpl */
        final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0.i f35005a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ dd.p f35006b;

            b(r0.i iVar, dd.p pVar) {
                this.f35005a = iVar;
                this.f35006b = pVar;
            }

            public void run() {
                t tVar = t.this;
                if (tVar == g1.this.E) {
                    g1.this.Q0(this.f35005a);
                    if (this.f35006b != dd.p.SHUTDOWN) {
                        g1.this.V.b(f.a.INFO, "Entering {0} state with picker: {1}", this.f35006b, this.f35005a);
                        g1.this.f34967y.b(this.f35006b);
                    }
                }
            }
        }

        private t() {
        }

        public dd.f b() {
            return g1.this.V;
        }

        public ScheduledExecutorService c() {
            return g1.this.f34950k;
        }

        public n1 d() {
            return g1.this.f34961s;
        }

        public void e() {
            g1.this.f34961s.e();
            g1.this.f34961s.execute(new a());
        }

        public void f(dd.p pVar, r0.i iVar) {
            g1.this.f34961s.e();
            r6.o.p(pVar, "newState");
            r6.o.p(iVar, "newPicker");
            g1.this.f34961s.execute(new b(iVar, pVar));
        }

        /* renamed from: g */
        public e a(r0.b bVar) {
            g1.this.f34961s.e();
            r6.o.v(!g1.this.P, "Channel is being terminated");
            return new y(bVar, this);
        }

        /* synthetic */ t(g1 g1Var, a aVar) {
            this();
        }
    }

    /* compiled from: ManagedChannelImpl */
    private final class u extends a1.e {

        /* renamed from: a  reason: collision with root package name */
        final t f35008a;

        /* renamed from: b  reason: collision with root package name */
        final a1 f35009b;

        /* compiled from: ManagedChannelImpl */
        final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dd.j1 f35011a;

            a(dd.j1 j1Var) {
                this.f35011a = j1Var;
            }

            public void run() {
                u.this.f(this.f35011a);
            }
        }

        /* compiled from: ManagedChannelImpl */
        final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a1.g f35013a;

            b(a1.g gVar) {
                this.f35013a = gVar;
            }

            public void run() {
                j1 j1Var;
                if (g1.this.C == u.this.f35009b) {
                    List<dd.x> a10 = this.f35013a.a();
                    dd.f F = g1.this.V;
                    f.a aVar = f.a.DEBUG;
                    F.b(aVar, "Resolved address: {0}, config={1}", a10, this.f35013a.b());
                    w m02 = g1.this.Y;
                    w wVar = w.SUCCESS;
                    if (m02 != wVar) {
                        g1.this.V.b(f.a.INFO, "Address resolved: {0}", a10);
                        w unused = g1.this.Y = wVar;
                    }
                    k unused2 = g1.this.f34951k0 = null;
                    a1.c c10 = this.f35013a.c();
                    f0 f0Var = (f0) this.f35013a.b().b(f0.f32213a);
                    j1 j1Var2 = (c10 == null || c10.c() == null) ? null : (j1) c10.c();
                    dd.j1 d10 = c10 != null ? c10.d() : null;
                    if (!g1.this.f34935c0) {
                        if (j1Var2 != null) {
                            g1.this.V.a(f.a.INFO, "Service config from name resolver discarded by channel settings");
                        }
                        j1Var = g1.this.f34931a0 == null ? g1.f34927s0 : g1.this.f34931a0;
                        if (f0Var != null) {
                            g1.this.V.a(f.a.INFO, "Config selector from name resolver discarded by channel settings");
                        }
                        g1.this.X.p(j1Var.c());
                    } else {
                        if (j1Var2 != null) {
                            if (f0Var != null) {
                                g1.this.X.p(f0Var);
                                if (j1Var2.c() != null) {
                                    g1.this.V.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                                }
                            } else {
                                g1.this.X.p(j1Var2.c());
                            }
                        } else if (g1.this.f34931a0 != null) {
                            j1Var2 = g1.this.f34931a0;
                            g1.this.X.p(j1Var2.c());
                            g1.this.V.a(f.a.INFO, "Received no service config, using default service config");
                        } else if (d10 == null) {
                            j1Var2 = g1.f34927s0;
                            g1.this.X.p((f0) null);
                        } else if (!g1.this.f34933b0) {
                            g1.this.V.a(f.a.INFO, "Fallback to error due to invalid first service config without default config");
                            u.this.b(c10.d());
                            return;
                        } else {
                            j1Var2 = g1.this.Z;
                        }
                        if (!j1Var2.equals(g1.this.Z)) {
                            dd.f F2 = g1.this.V;
                            f.a aVar2 = f.a.INFO;
                            Object[] objArr = new Object[1];
                            objArr[0] = j1Var2 == g1.f34927s0 ? " to empty" : MaxReward.DEFAULT_LABEL;
                            F2.b(aVar2, "Service config changed{0}", objArr);
                            j1 unused3 = g1.this.Z = j1Var2;
                        }
                        try {
                            boolean unused4 = g1.this.f34933b0 = true;
                        } catch (RuntimeException e10) {
                            Logger logger = g1.f34922n0;
                            Level level = Level.WARNING;
                            logger.log(level, "[" + g1.this.g() + "] Unexpected exception from parsing service config", e10);
                        }
                        j1Var = j1Var2;
                    }
                    dd.a b10 = this.f35013a.b();
                    u uVar = u.this;
                    if (uVar.f35008a == g1.this.E) {
                        a.b c11 = b10.d().c(f0.f32213a);
                        Map<String, ?> d11 = j1Var.d();
                        if (d11 != null) {
                            c11.d(r0.f32339b, d11).a();
                        }
                        if (!u.this.f35008a.f35002a.e(r0.g.d().b(a10).c(c11.a()).d(j1Var.e()).a())) {
                            u.this.g();
                        }
                    }
                }
            }
        }

        u(t tVar, a1 a1Var) {
            this.f35008a = (t) r6.o.p(tVar, "helperImpl");
            this.f35009b = (a1) r6.o.p(a1Var, "resolver");
        }

        /* access modifiers changed from: private */
        public void f(dd.j1 j1Var) {
            g1.f34922n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{g1.this.g(), j1Var});
            g1.this.X.m();
            w m02 = g1.this.Y;
            w wVar = w.ERROR;
            if (m02 != wVar) {
                g1.this.V.b(f.a.WARNING, "Failed to resolve name: {0}", j1Var);
                w unused = g1.this.Y = wVar;
            }
            if (this.f35008a == g1.this.E) {
                this.f35008a.f35002a.b(j1Var);
                g();
            }
        }

        /* access modifiers changed from: private */
        public void g() {
            if (g1.this.f34949j0 == null || !g1.this.f34949j0.b()) {
                if (g1.this.f34951k0 == null) {
                    g1 g1Var = g1.this;
                    k unused = g1Var.f34951k0 = g1Var.f34968z.get();
                }
                long a10 = g1.this.f34951k0.a();
                g1.this.V.b(f.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a10));
                g1 g1Var2 = g1.this;
                n1.d unused2 = g1Var2.f34949j0 = g1Var2.f34961s.c(new o(), a10, TimeUnit.NANOSECONDS, g1.this.f34946i.D0());
            }
        }

        public void b(dd.j1 j1Var) {
            r6.o.e(!j1Var.o(), "the error status must not be OK");
            g1.this.f34961s.execute(new a(j1Var));
        }

        public void c(a1.g gVar) {
            g1.this.f34961s.execute(new b(gVar));
        }
    }

    /* compiled from: ManagedChannelImpl */
    private class v extends dd.d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReference<f0> f35015a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f35016b;

        /* renamed from: c  reason: collision with root package name */
        private final dd.d f35017c;

        /* compiled from: ManagedChannelImpl */
        class a extends dd.d {
            a() {
            }

            public String a() {
                return v.this.f35016b;
            }

            public <RequestT, ResponseT> dd.g<RequestT, ResponseT> f(z0<RequestT, ResponseT> z0Var, dd.c cVar) {
                return new p(z0Var, g1.this.E0(cVar), cVar, g1.this.f34953l0, g1.this.Q ? null : g1.this.f34946i.D0(), g1.this.T, (f0) null).C(g1.this.f34962t).B(g1.this.f34963u).A(g1.this.f34964v);
            }
        }

        /* compiled from: ManagedChannelImpl */
        final class b implements Runnable {
            b() {
            }

            public void run() {
                if (g1.this.I == null) {
                    if (v.this.f35015a.get() == g1.f34928t0) {
                        v.this.f35015a.set((Object) null);
                    }
                    g1.this.M.b(g1.f34925q0);
                }
            }
        }

        /* compiled from: ManagedChannelImpl */
        final class c implements Runnable {
            c() {
            }

            public void run() {
                if (v.this.f35015a.get() == g1.f34928t0) {
                    v.this.f35015a.set((Object) null);
                }
                if (g1.this.I != null) {
                    for (g a10 : g1.this.I) {
                        a10.a("Channel is forcefully shutdown", (Throwable) null);
                    }
                }
                g1.this.M.c(g1.f34924p0);
            }
        }

        /* compiled from: ManagedChannelImpl */
        class d implements Runnable {
            d() {
            }

            public void run() {
                g1.this.D0();
            }
        }

        /* compiled from: ManagedChannelImpl */
        class e extends dd.g<ReqT, RespT> {
            e() {
            }

            public void a(String str, Throwable th) {
            }

            public void b() {
            }

            public void c(int i10) {
            }

            public void d(ReqT reqt) {
            }

            public void e(g.a<RespT> aVar, y0 y0Var) {
                aVar.a(g1.f34925q0, new y0());
            }
        }

        /* compiled from: ManagedChannelImpl */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f35024a;

            f(g gVar) {
                this.f35024a = gVar;
            }

            public void run() {
                if (v.this.f35015a.get() == g1.f34928t0) {
                    if (g1.this.I == null) {
                        Collection unused = g1.this.I = new LinkedHashSet();
                        g1 g1Var = g1.this;
                        g1Var.f34947i0.e(g1Var.J, true);
                    }
                    g1.this.I.add(this.f35024a);
                    return;
                }
                this.f35024a.r();
            }
        }

        /* compiled from: ManagedChannelImpl */
        private final class g<ReqT, RespT> extends z<ReqT, RespT> {

            /* renamed from: l  reason: collision with root package name */
            final dd.r f35026l;

            /* renamed from: m  reason: collision with root package name */
            final z0<ReqT, RespT> f35027m;

            /* renamed from: n  reason: collision with root package name */
            final dd.c f35028n;

            /* compiled from: ManagedChannelImpl */
            class a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Runnable f35030a;

                a(Runnable runnable) {
                    this.f35030a = runnable;
                }

                public void run() {
                    this.f35030a.run();
                    g gVar = g.this;
                    g1.this.f34961s.execute(new b());
                }
            }

            /* compiled from: ManagedChannelImpl */
            final class b implements Runnable {
                b() {
                }

                public void run() {
                    if (g1.this.I != null) {
                        g1.this.I.remove(g.this);
                        if (g1.this.I.isEmpty()) {
                            g1 g1Var = g1.this;
                            g1Var.f34947i0.e(g1Var.J, false);
                            Collection unused = g1.this.I = null;
                            if (g1.this.N.get()) {
                                g1.this.M.b(g1.f34925q0);
                            }
                        }
                    }
                }
            }

            g(dd.r rVar, z0<ReqT, RespT> z0Var, dd.c cVar) {
                super(g1.this.E0(cVar), g1.this.f34950k, cVar.d());
                this.f35026l = rVar;
                this.f35027m = z0Var;
                this.f35028n = cVar;
            }

            /* access modifiers changed from: protected */
            public void j() {
                super.j();
                g1.this.f34961s.execute(new b());
            }

            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: package-private */
            public void r() {
                dd.r b10 = this.f35026l.b();
                try {
                    dd.g k10 = v.this.l(this.f35027m, this.f35028n);
                    this.f35026l.f(b10);
                    Runnable p10 = p(k10);
                    if (p10 == null) {
                        g1.this.f34961s.execute(new b());
                    } else {
                        g1.this.E0(this.f35028n).execute(new a(p10));
                    }
                } catch (Throwable th) {
                    this.f35026l.f(b10);
                    throw th;
                }
            }
        }

        /* synthetic */ v(g1 g1Var, String str, a aVar) {
            this(str);
        }

        /* access modifiers changed from: private */
        public <ReqT, RespT> dd.g<ReqT, RespT> l(z0<ReqT, RespT> z0Var, dd.c cVar) {
            f0 f0Var = this.f35015a.get();
            if (f0Var == null) {
                return this.f35017c.f(z0Var, cVar);
            }
            if (!(f0Var instanceof j1.c)) {
                return new n(f0Var, this.f35017c, g1.this.f34952l, z0Var, cVar);
            }
            j1.b f10 = ((j1.c) f0Var).f35126b.f(z0Var);
            if (f10 != null) {
                cVar = cVar.q(j1.b.f35119g, f10);
            }
            return this.f35017c.f(z0Var, cVar);
        }

        public String a() {
            return this.f35016b;
        }

        public <ReqT, RespT> dd.g<ReqT, RespT> f(z0<ReqT, RespT> z0Var, dd.c cVar) {
            if (this.f35015a.get() != g1.f34928t0) {
                return l(z0Var, cVar);
            }
            g1.this.f34961s.execute(new d());
            if (this.f35015a.get() != g1.f34928t0) {
                return l(z0Var, cVar);
            }
            if (g1.this.N.get()) {
                return new e();
            }
            g gVar = new g(dd.r.e(), z0Var, cVar);
            g1.this.f34961s.execute(new f(gVar));
            return gVar;
        }

        /* access modifiers changed from: package-private */
        public void m() {
            if (this.f35015a.get() == g1.f34928t0) {
                p((f0) null);
            }
        }

        /* access modifiers changed from: package-private */
        public void n() {
            g1.this.f34961s.execute(new b());
        }

        /* access modifiers changed from: package-private */
        public void o() {
            g1.this.f34961s.execute(new c());
        }

        /* access modifiers changed from: package-private */
        public void p(f0 f0Var) {
            f0 f0Var2 = this.f35015a.get();
            this.f35015a.set(f0Var);
            if (f0Var2 == g1.f34928t0 && g1.this.I != null) {
                for (g r10 : g1.this.I) {
                    r10.r();
                }
            }
        }

        private v(String str) {
            this.f35015a = new AtomicReference<>(g1.f34928t0);
            this.f35017c = new a();
            this.f35016b = (String) r6.o.p(str, "authority");
        }
    }

    /* compiled from: ManagedChannelImpl */
    enum w {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* compiled from: ManagedChannelImpl */
    private static final class x implements ScheduledExecutorService {

        /* renamed from: a  reason: collision with root package name */
        final ScheduledExecutorService f35037a;

        /* synthetic */ x(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f35037a.awaitTermination(j10, timeUnit);
        }

        public void execute(Runnable runnable) {
            this.f35037a.execute(runnable);
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f35037a.invokeAll(collection);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            return this.f35037a.invokeAny(collection);
        }

        public boolean isShutdown() {
            return this.f35037a.isShutdown();
        }

        public boolean isTerminated() {
            return this.f35037a.isTerminated();
        }

        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f35037a.schedule(callable, j10, timeUnit);
        }

        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f35037a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f35037a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        public <T> Future<T> submit(Callable<T> callable) {
            return this.f35037a.submit(callable);
        }

        private x(ScheduledExecutorService scheduledExecutorService) {
            this.f35037a = (ScheduledExecutorService) r6.o.p(scheduledExecutorService, "delegate");
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f35037a.invokeAll(collection, j10, timeUnit);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f35037a.invokeAny(collection, j10, timeUnit);
        }

        public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f35037a.schedule(runnable, j10, timeUnit);
        }

        public Future<?> submit(Runnable runnable) {
            return this.f35037a.submit(runnable);
        }

        public <T> Future<T> submit(Runnable runnable, T t10) {
            return this.f35037a.submit(runnable, t10);
        }
    }

    /* compiled from: ManagedChannelImpl */
    private final class y extends e {

        /* renamed from: a  reason: collision with root package name */
        final r0.b f35038a;

        /* renamed from: b  reason: collision with root package name */
        final t f35039b;

        /* renamed from: c  reason: collision with root package name */
        final j0 f35040c;

        /* renamed from: d  reason: collision with root package name */
        final n f35041d;

        /* renamed from: e  reason: collision with root package name */
        final o f35042e;

        /* renamed from: f  reason: collision with root package name */
        List<dd.x> f35043f;

        /* renamed from: g  reason: collision with root package name */
        y0 f35044g;

        /* renamed from: h  reason: collision with root package name */
        boolean f35045h;

        /* renamed from: i  reason: collision with root package name */
        boolean f35046i;

        /* renamed from: j  reason: collision with root package name */
        n1.d f35047j;

        /* compiled from: ManagedChannelImpl */
        final class a extends y0.j {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0.j f35049a;

            a(r0.j jVar) {
                this.f35049a = jVar;
            }

            /* access modifiers changed from: package-private */
            public void a(y0 y0Var) {
                g1.this.f34947i0.e(y0Var, true);
            }

            /* access modifiers changed from: package-private */
            public void b(y0 y0Var) {
                g1.this.f34947i0.e(y0Var, false);
            }

            /* access modifiers changed from: package-private */
            public void c(y0 y0Var, dd.q qVar) {
                r6.o.v(this.f35049a != null, "listener is null");
                this.f35049a.a(qVar);
            }

            /* access modifiers changed from: package-private */
            public void d(y0 y0Var) {
                g1.this.H.remove(y0Var);
                g1.this.W.k(y0Var);
                g1.this.I0();
            }
        }

        /* compiled from: ManagedChannelImpl */
        final class b implements Runnable {
            b() {
            }

            public void run() {
                y.this.f35044g.b(g1.f34926r0);
            }
        }

        y(r0.b bVar, t tVar) {
            r6.o.p(bVar, "args");
            this.f35043f = bVar.a();
            if (g1.this.f34934c != null) {
                bVar = bVar.d().e(i(bVar.a())).b();
            }
            this.f35038a = bVar;
            this.f35039b = (t) r6.o.p(tVar, "helper");
            j0 b10 = j0.b("Subchannel", g1.this.a());
            this.f35040c = b10;
            int d02 = g1.this.f34960r;
            long a10 = g1.this.f34959q.a();
            o oVar = new o(b10, d02, a10, "Subchannel for " + bVar.a());
            this.f35042e = oVar;
            this.f35041d = new n(oVar, g1.this.f34959q);
        }

        private List<dd.x> i(List<dd.x> list) {
            ArrayList arrayList = new ArrayList();
            for (dd.x next : list) {
                arrayList.add(new dd.x(next.a(), next.b().d().c(dd.x.f32377d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        public List<dd.x> b() {
            g1.this.f34961s.e();
            r6.o.v(this.f35045h, "not started");
            return this.f35043f;
        }

        public dd.a c() {
            return this.f35038a.b();
        }

        public Object d() {
            r6.o.v(this.f35045h, "Subchannel is not started");
            return this.f35044g;
        }

        public void e() {
            g1.this.f34961s.e();
            r6.o.v(this.f35045h, "not started");
            this.f35044g.a();
        }

        public void f() {
            n1.d dVar;
            g1.this.f34961s.e();
            if (this.f35044g == null) {
                this.f35046i = true;
                return;
            }
            if (!this.f35046i) {
                this.f35046i = true;
            } else if (g1.this.P && (dVar = this.f35047j) != null) {
                dVar.a();
                this.f35047j = null;
            } else {
                return;
            }
            if (!g1.this.P) {
                this.f35047j = g1.this.f34961s.c(new d1(new b()), 5, TimeUnit.SECONDS, g1.this.f34946i.D0());
            } else {
                this.f35044g.b(g1.f34925q0);
            }
        }

        public void g(r0.j jVar) {
            g1.this.f34961s.e();
            r6.o.v(!this.f35045h, "already started");
            r6.o.v(!this.f35046i, "already shutdown");
            r6.o.v(!g1.this.P, "Channel is being terminated");
            this.f35045h = true;
            List<dd.x> a10 = this.f35038a.a();
            String a11 = g1.this.a();
            String h02 = g1.this.B;
            k.a i02 = g1.this.f34968z;
            t C = g1.this.f34946i;
            ScheduledExecutorService D0 = g1.this.f34946i.D0();
            r6.v j02 = g1.this.f34965w;
            n1 n1Var = g1.this.f34961s;
            a aVar = new a(jVar);
            d0 f02 = g1.this.W;
            m a12 = g1.this.S.a();
            o oVar = this.f35042e;
            y0 y0Var = new y0(a10, a11, h02, i02, C, D0, j02, n1Var, aVar, f02, a12, oVar, this.f35040c, this.f35041d);
            g1.this.U.e(new e0.a().b("Child Subchannel started").c(e0.b.CT_INFO).e(g1.this.f34959q.a()).d(y0Var).a());
            this.f35044g = y0Var;
            g1.this.W.e(y0Var);
            g1.this.H.add(y0Var);
        }

        public void h(List<dd.x> list) {
            g1.this.f34961s.e();
            this.f35043f = list;
            if (g1.this.f34934c != null) {
                list = i(list);
            }
            this.f35044g.U(list);
        }

        public String toString() {
            return this.f35040c.toString();
        }
    }

    static {
        dd.j1 j1Var = dd.j1.f32248u;
        f34924p0 = j1Var.q("Channel shutdownNow invoked");
        f34925q0 = j1Var.q("Channel shutdown invoked");
        f34926r0 = j1Var.q("Subchannel shutdown invoked");
    }

    g1(h1 h1Var, t tVar, k.a aVar, p1<? extends Executor> p1Var, r6.v<r6.t> vVar, List<dd.h> list, l2 l2Var) {
        a aVar2;
        h1 h1Var2 = h1Var;
        t tVar2 = tVar;
        p1<? extends Executor> p1Var2 = p1Var;
        l2 l2Var2 = l2Var;
        n1 n1Var = new n1(new j());
        this.f34961s = n1Var;
        p pVar = new p(this, (a) null);
        this.f34945h0 = pVar;
        this.f34947i0 = new r(this, (a) null);
        this.f34953l0 = new m(this, (a) null);
        String str = (String) r6.o.p(h1Var2.f35068f, "target");
        this.f34932b = str;
        j0 b10 = j0.b("Channel", str);
        this.f34930a = b10;
        this.f34959q = (l2) r6.o.p(l2Var2, "timeProvider");
        p1<? extends Executor> p1Var3 = (p1) r6.o.p(h1Var2.f35063a, "executorPool");
        this.f34954m = p1Var3;
        Executor executor = (Executor) r6.o.p((Executor) p1Var3.a(), "executor");
        this.f34952l = executor;
        this.f34944h = tVar2;
        q qVar = new q((p1) r6.o.p(h1Var2.f35064b, "offloadExecutorPool"));
        this.f34958p = qVar;
        l lVar = new l(tVar2, h1Var2.f35069g, qVar);
        this.f34946i = lVar;
        this.f34948j = new l(tVar2, (dd.b) null, qVar);
        x xVar = new x(lVar.D0(), (a) null);
        this.f34950k = xVar;
        this.f34960r = h1Var2.f35084v;
        int i10 = h1Var2.f35084v;
        long a10 = l2Var.a();
        o oVar = r12;
        l lVar2 = lVar;
        int i11 = i10;
        q qVar2 = qVar;
        o oVar2 = new o(b10, i11, a10, "Channel for '" + str + "'");
        this.U = oVar;
        n nVar = new n(oVar, l2Var2);
        this.V = nVar;
        dd.g1 g1Var = h1Var2.f35087y;
        g1Var = g1Var == null ? r0.f35316q : g1Var;
        boolean z10 = h1Var2.f35082t;
        this.f34943g0 = z10;
        j jVar = new j(h1Var2.f35073k);
        this.f34942g = jVar;
        this.f34936d = h1Var2.f35066d;
        b2 b2Var = new b2(z10, h1Var2.f35078p, h1Var2.f35079q, jVar);
        String str2 = h1Var2.f35072j;
        this.f34934c = str2;
        a1.b a11 = a1.b.f().c(h1Var.e()).f(g1Var).i(n1Var).g(xVar).h(b2Var).b(nVar).d(qVar2).e(str2).a();
        this.f34940f = a11;
        a1.d dVar = h1Var2.f35067e;
        this.f34938e = dVar;
        this.C = G0(str, str2, dVar, a11);
        this.f34956n = (p1) r6.o.p(p1Var2, "balancerRpcExecutorPool");
        this.f34957o = new q(p1Var2);
        a0 a0Var = new a0(executor, n1Var);
        this.L = a0Var;
        a0Var.e(pVar);
        this.f34968z = aVar;
        Map<String, ?> map = h1Var2.f35085w;
        if (map != null) {
            a1.c a12 = b2Var.a(map);
            r6.o.x(a12.d() == null, "Default config is invalid: %s", a12.d());
            j1 j1Var = (j1) a12.c();
            this.f34931a0 = j1Var;
            this.Z = j1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f34931a0 = null;
        }
        boolean z11 = h1Var2.f35086x;
        this.f34935c0 = z11;
        v vVar2 = new v(this, this.C.a(), aVar2);
        this.X = vVar2;
        this.A = dd.j.a(vVar2, list);
        this.f34965w = (r6.v) r6.o.p(vVar, "stopwatchSupplier");
        long j10 = h1Var2.f35077o;
        if (j10 == -1) {
            this.f34966x = j10;
        } else {
            r6.o.j(j10 >= h1.J, "invalid idleTimeoutMillis %s", j10);
            this.f34966x = h1Var2.f35077o;
        }
        this.f34955m0 = new y1(new s(this, (a) null), n1Var, lVar2.D0(), vVar.get());
        this.f34962t = h1Var2.f35074l;
        this.f34963u = (dd.v) r6.o.p(h1Var2.f35075m, "decompressorRegistry");
        this.f34964v = (dd.o) r6.o.p(h1Var2.f35076n, "compressorRegistry");
        this.B = h1Var2.f35071i;
        this.f34941f0 = h1Var2.f35080r;
        this.f34939e0 = h1Var2.f35081s;
        c cVar = new c(l2Var);
        this.S = cVar;
        this.T = cVar.a();
        d0 d0Var = (d0) r6.o.o(h1Var2.f35083u);
        this.W = d0Var;
        d0Var.d(this);
        if (!z11) {
            if (this.f34931a0 != null) {
                nVar.a(f.a.INFO, "Service config look-up disabled, using default service config");
            }
            this.f34933b0 = true;
        }
    }

    /* access modifiers changed from: private */
    public void A0(boolean z10) {
        this.f34955m0.i(z10);
    }

    private void B0() {
        this.f34961s.e();
        n1.d dVar = this.f34949j0;
        if (dVar != null) {
            dVar.a();
            this.f34949j0 = null;
            this.f34951k0 = null;
        }
    }

    /* access modifiers changed from: private */
    public void C0() {
        O0(true);
        this.L.r((r0.i) null);
        this.V.a(f.a.INFO, "Entering IDLE state");
        this.f34967y.b(dd.p.IDLE);
        if (this.f34947i0.a(this.J, this.L)) {
            D0();
        }
    }

    /* access modifiers changed from: private */
    public Executor E0(dd.c cVar) {
        Executor e10 = cVar.e();
        return e10 == null ? this.f34952l : e10;
    }

    private static a1 F0(String str, a1.d dVar, a1.b bVar) {
        URI uri;
        a1 b10;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        if (uri != null && (b10 = dVar.b(uri, bVar)) != null) {
            return b10;
        }
        boolean matches = f34923o0.matcher(str).matches();
        String str2 = MaxReward.DEFAULT_LABEL;
        if (!matches) {
            try {
                a1 b11 = dVar.b(new URI(dVar.a(), str2, UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + str, (String) null), bVar);
                if (b11 != null) {
                    return b11;
                }
            } catch (URISyntaxException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb2.length() > 0) {
            str2 = " (" + sb2 + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    static a1 G0(String str, String str2, a1.d dVar, a1.b bVar) {
        a1 F0 = F0(str, dVar, bVar);
        if (str2 == null) {
            return F0;
        }
        return new k(F0, str2);
    }

    /* access modifiers changed from: private */
    public void H0() {
        if (this.O) {
            for (y0 d10 : this.H) {
                d10.d(f34924p0);
            }
            for (q1 o10 : this.K) {
                o10.o().d(f34924p0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void I0() {
        if (!this.Q && this.N.get() && this.H.isEmpty() && this.K.isEmpty()) {
            this.V.a(f.a.INFO, "Terminated");
            this.W.j(this);
            this.f34954m.b(this.f34952l);
            this.f34957o.b();
            this.f34958p.b();
            this.f34946i.close();
            this.Q = true;
            this.R.countDown();
        }
    }

    /* access modifiers changed from: private */
    public void K0() {
        this.f34961s.e();
        B0();
        L0();
    }

    /* access modifiers changed from: private */
    public void L0() {
        this.f34961s.e();
        if (this.D) {
            this.C.b();
        }
    }

    /* access modifiers changed from: private */
    public void M0() {
        long j10 = this.f34966x;
        if (j10 != -1) {
            this.f34955m0.k(j10, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    public void O0(boolean z10) {
        this.f34961s.e();
        if (z10) {
            r6.o.v(this.D, "nameResolver is not started");
            r6.o.v(this.E != null, "lbHelper is null");
        }
        if (this.C != null) {
            B0();
            this.C.c();
            this.D = false;
            if (z10) {
                this.C = G0(this.f34932b, this.f34934c, this.f34938e, this.f34940f);
            } else {
                this.C = null;
            }
        }
        t tVar = this.E;
        if (tVar != null) {
            tVar.f35002a.d();
            this.E = null;
        }
        this.F = null;
    }

    /* access modifiers changed from: private */
    public void Q0(r0.i iVar) {
        this.F = iVar;
        this.L.r(iVar);
    }

    /* access modifiers changed from: package-private */
    public void D0() {
        this.f34961s.e();
        if (!this.N.get() && !this.G) {
            if (this.f34947i0.d()) {
                A0(false);
            } else {
                M0();
            }
            if (this.E == null) {
                this.V.a(f.a.INFO, "Exiting idle mode");
                t tVar = new t(this, (a) null);
                tVar.f35002a = this.f34942g.e(tVar);
                this.E = tVar;
                this.C.d(new u(tVar, this.C));
                this.D = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J0(Throwable th) {
        if (!this.G) {
            this.G = true;
            A0(true);
            O0(false);
            Q0(new e(th));
            this.X.p((f0) null);
            this.V.a(f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            this.f34967y.b(dd.p.TRANSIENT_FAILURE);
        }
    }

    /* renamed from: N0 */
    public g1 m() {
        this.V.a(f.a.DEBUG, "shutdown() called");
        if (!this.N.compareAndSet(false, true)) {
            return this;
        }
        this.f34961s.execute(new h());
        this.X.n();
        this.f34961s.execute(new b());
        return this;
    }

    /* renamed from: P0 */
    public g1 n() {
        this.V.a(f.a.DEBUG, "shutdownNow() called");
        m();
        this.X.o();
        this.f34961s.execute(new i());
        return this;
    }

    public String a() {
        return this.A.a();
    }

    public <ReqT, RespT> dd.g<ReqT, RespT> f(z0<ReqT, RespT> z0Var, dd.c cVar) {
        return this.A.f(z0Var, cVar);
    }

    public j0 g() {
        return this.f34930a;
    }

    public boolean i(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.R.await(j10, timeUnit);
    }

    public void j() {
        this.f34961s.execute(new f());
    }

    public dd.p k(boolean z10) {
        dd.p a10 = this.f34967y.a();
        if (z10 && a10 == dd.p.IDLE) {
            this.f34961s.execute(new g());
        }
        return a10;
    }

    public void l(dd.p pVar, Runnable runnable) {
        this.f34961s.execute(new d(runnable, pVar));
    }

    public String toString() {
        return r6.i.c(this).c("logId", this.f34930a.d()).d("target", this.f34932b).toString();
    }

    /* compiled from: ManagedChannelImpl */
    private final class z {

        /* renamed from: a  reason: collision with root package name */
        final Object f35052a;

        /* renamed from: b  reason: collision with root package name */
        Collection<q> f35053b;

        /* renamed from: c  reason: collision with root package name */
        dd.j1 f35054c;

        private z() {
            this.f35052a = new Object();
            this.f35053b = new HashSet();
        }

        /* access modifiers changed from: package-private */
        public dd.j1 a(z1<?> z1Var) {
            synchronized (this.f35052a) {
                dd.j1 j1Var = this.f35054c;
                if (j1Var != null) {
                    return j1Var;
                }
                this.f35053b.add(z1Var);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            io.grpc.internal.g1.u(r2.f35055d).b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(dd.j1 r3) {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f35052a
                monitor-enter(r0)
                dd.j1 r1 = r2.f35054c     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                return
            L_0x0009:
                r2.f35054c = r3     // Catch:{ all -> 0x001e }
                java.util.Collection<io.grpc.internal.q> r1 = r2.f35053b     // Catch:{ all -> 0x001e }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001d
                io.grpc.internal.g1 r0 = io.grpc.internal.g1.this
                io.grpc.internal.a0 r0 = r0.L
                r0.b(r3)
            L_0x001d:
                return
            L_0x001e:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.g1.z.b(dd.j1):void");
        }

        /* access modifiers changed from: package-private */
        public void c(dd.j1 j1Var) {
            ArrayList<q> arrayList;
            b(j1Var);
            synchronized (this.f35052a) {
                arrayList = new ArrayList<>(this.f35053b);
            }
            for (q b10 : arrayList) {
                b10.b(j1Var);
            }
            g1.this.L.d(j1Var);
        }

        /* access modifiers changed from: package-private */
        public void d(z1<?> z1Var) {
            dd.j1 j1Var;
            synchronized (this.f35052a) {
                this.f35053b.remove(z1Var);
                if (this.f35053b.isEmpty()) {
                    j1Var = this.f35054c;
                    this.f35053b = new HashSet();
                } else {
                    j1Var = null;
                }
            }
            if (j1Var != null) {
                g1.this.L.b(j1Var);
            }
        }

        /* synthetic */ z(g1 g1Var, a aVar) {
            this();
        }
    }
}
