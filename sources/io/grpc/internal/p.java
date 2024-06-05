package io.grpc.internal;

import dd.f0;
import dd.g;
import dd.g0;
import dd.j1;
import dd.l;
import dd.n;
import dd.o;
import dd.r;
import dd.s;
import dd.t;
import dd.v;
import dd.y0;
import dd.z0;
import io.grpc.internal.j1;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.i;

/* compiled from: ClientCallImpl */
final class p<ReqT, RespT> extends dd.g<ReqT, RespT> {

    /* renamed from: t  reason: collision with root package name */
    private static final Logger f35237t = Logger.getLogger(p.class.getName());

    /* renamed from: u  reason: collision with root package name */
    private static final byte[] f35238u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v  reason: collision with root package name */
    private static final double f35239v = (((double) TimeUnit.SECONDS.toNanos(1)) * 1.0d);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final z0<ReqT, RespT> f35240a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final md.d f35241b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f35242c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f35243d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final m f35244e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final r f35245f;

    /* renamed from: g  reason: collision with root package name */
    private volatile ScheduledFuture<?> f35246g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f35247h;

    /* renamed from: i  reason: collision with root package name */
    private dd.c f35248i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public q f35249j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f35250k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35251l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f35252m;

    /* renamed from: n  reason: collision with root package name */
    private final e f35253n;

    /* renamed from: o  reason: collision with root package name */
    private final p<ReqT, RespT>.f f35254o = new f();

    /* renamed from: p  reason: collision with root package name */
    private final ScheduledExecutorService f35255p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f35256q;

    /* renamed from: r  reason: collision with root package name */
    private v f35257r = v.c();

    /* renamed from: s  reason: collision with root package name */
    private o f35258s = o.a();

    /* compiled from: ClientCallImpl */
    class b extends x {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.a f35259b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g.a aVar) {
            super(p.this.f35245f);
            this.f35259b = aVar;
        }

        public void a() {
            p pVar = p.this;
            pVar.r(this.f35259b, s.a(pVar.f35245f), new y0());
        }
    }

    /* compiled from: ClientCallImpl */
    class c extends x {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.a f35261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35262c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g.a aVar, String str) {
            super(p.this.f35245f);
            this.f35261b = aVar;
            this.f35262c = str;
        }

        public void a() {
            p.this.r(this.f35261b, j1.f32247t.q(String.format("Unable to find compressor by name %s", new Object[]{this.f35262c})), new y0());
        }
    }

    /* compiled from: ClientCallImpl */
    private class d implements r {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final g.a<RespT> f35264a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public j1 f35265b;

        /* compiled from: ClientCallImpl */
        final class a extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ md.b f35267b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ y0 f35268c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(md.b bVar, y0 y0Var) {
                super(p.this.f35245f);
                this.f35267b = bVar;
                this.f35268c = y0Var;
            }

            private void b() {
                if (d.this.f35265b == null) {
                    try {
                        d.this.f35264a.b(this.f35268c);
                    } catch (Throwable th) {
                        d.this.i(j1.f32234g.p(th).q("Failed to read headers"));
                    }
                }
            }

            public void a() {
                md.c.g("ClientCall$Listener.headersRead", p.this.f35241b);
                md.c.d(this.f35267b);
                try {
                    b();
                } finally {
                    md.c.i("ClientCall$Listener.headersRead", p.this.f35241b);
                }
            }
        }

        /* compiled from: ClientCallImpl */
        final class b extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ md.b f35270b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k2.a f35271c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(md.b bVar, k2.a aVar) {
                super(p.this.f35245f);
                this.f35270b = bVar;
                this.f35271c = aVar;
            }

            private void b() {
                InputStream next;
                if (d.this.f35265b != null) {
                    r0.d(this.f35271c);
                    return;
                }
                while (true) {
                    try {
                        next = this.f35271c.next();
                        if (next != null) {
                            d.this.f35264a.c(p.this.f35240a.i(next));
                            next.close();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        r0.d(this.f35271c);
                        d.this.i(j1.f32234g.p(th).q("Failed to read message."));
                        return;
                    }
                }
            }

            public void a() {
                md.c.g("ClientCall$Listener.messagesAvailable", p.this.f35241b);
                md.c.d(this.f35270b);
                try {
                    b();
                } finally {
                    md.c.i("ClientCall$Listener.messagesAvailable", p.this.f35241b);
                }
            }
        }

        /* compiled from: ClientCallImpl */
        final class c extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ md.b f35273b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j1 f35274c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ y0 f35275d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(md.b bVar, j1 j1Var, y0 y0Var) {
                super(p.this.f35245f);
                this.f35273b = bVar;
                this.f35274c = j1Var;
                this.f35275d = y0Var;
            }

            private void b() {
                j1 j1Var = this.f35274c;
                y0 y0Var = this.f35275d;
                if (d.this.f35265b != null) {
                    j1Var = d.this.f35265b;
                    y0Var = new y0();
                }
                boolean unused = p.this.f35250k = true;
                try {
                    d dVar = d.this;
                    p.this.r(dVar.f35264a, j1Var, y0Var);
                } finally {
                    p.this.y();
                    p.this.f35244e.a(j1Var.o());
                }
            }

            public void a() {
                md.c.g("ClientCall$Listener.onClose", p.this.f35241b);
                md.c.d(this.f35273b);
                try {
                    b();
                } finally {
                    md.c.i("ClientCall$Listener.onClose", p.this.f35241b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d  reason: collision with other inner class name */
        /* compiled from: ClientCallImpl */
        final class C0400d extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ md.b f35277b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0400d(md.b bVar) {
                super(p.this.f35245f);
                this.f35277b = bVar;
            }

            private void b() {
                if (d.this.f35265b == null) {
                    try {
                        d.this.f35264a.d();
                    } catch (Throwable th) {
                        d.this.i(j1.f32234g.p(th).q("Failed to call onReady."));
                    }
                }
            }

            public void a() {
                md.c.g("ClientCall$Listener.onReady", p.this.f35241b);
                md.c.d(this.f35277b);
                try {
                    b();
                } finally {
                    md.c.i("ClientCall$Listener.onReady", p.this.f35241b);
                }
            }
        }

        public d(g.a<RespT> aVar) {
            this.f35264a = (g.a) r6.o.p(aVar, "observer");
        }

        private void h(j1 j1Var, r.a aVar, y0 y0Var) {
            t g10 = p.this.s();
            if (j1Var.m() == j1.b.CANCELLED && g10 != null && g10.h()) {
                x0 x0Var = new x0();
                p.this.f35249j.n(x0Var);
                j1 j1Var2 = j1.f32237j;
                j1Var = j1Var2.e("ClientCall was cancelled at or after deadline. " + x0Var);
                y0Var = new y0();
            }
            p.this.f35242c.execute(new c(md.c.e(), j1Var, y0Var));
        }

        /* access modifiers changed from: private */
        public void i(j1 j1Var) {
            this.f35265b = j1Var;
            p.this.f35249j.b(j1Var);
        }

        public void a(k2.a aVar) {
            md.c.g("ClientStreamListener.messagesAvailable", p.this.f35241b);
            try {
                p.this.f35242c.execute(new b(md.c.e(), aVar));
            } finally {
                md.c.i("ClientStreamListener.messagesAvailable", p.this.f35241b);
            }
        }

        public void b(y0 y0Var) {
            md.c.g("ClientStreamListener.headersRead", p.this.f35241b);
            try {
                p.this.f35242c.execute(new a(md.c.e(), y0Var));
            } finally {
                md.c.i("ClientStreamListener.headersRead", p.this.f35241b);
            }
        }

        public void c() {
            if (!p.this.f35240a.e().a()) {
                md.c.g("ClientStreamListener.onReady", p.this.f35241b);
                try {
                    p.this.f35242c.execute(new C0400d(md.c.e()));
                } finally {
                    md.c.i("ClientStreamListener.onReady", p.this.f35241b);
                }
            }
        }

        public void d(j1 j1Var, r.a aVar, y0 y0Var) {
            md.c.g("ClientStreamListener.closed", p.this.f35241b);
            try {
                h(j1Var, aVar, y0Var);
            } finally {
                md.c.i("ClientStreamListener.closed", p.this.f35241b);
            }
        }
    }

    /* compiled from: ClientCallImpl */
    interface e {
        q a(z0<?, ?> z0Var, dd.c cVar, y0 y0Var, dd.r rVar);
    }

    /* compiled from: ClientCallImpl */
    private final class f implements r.a {
        private f() {
        }
    }

    /* compiled from: ClientCallImpl */
    private class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f35280a;

        g(long j10) {
            this.f35280a = j10;
        }

        public void run() {
            x0 x0Var = new x0();
            p.this.f35249j.n(x0Var);
            long abs = Math.abs(this.f35280a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1);
            long abs2 = Math.abs(this.f35280a) % timeUnit.toNanos(1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deadline exceeded after ");
            if (this.f35280a < 0) {
                sb2.append('-');
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
            sb2.append("s. ");
            sb2.append(x0Var);
            p.this.f35249j.b(j1.f32237j.e(sb2.toString()));
        }
    }

    p(z0<ReqT, RespT> z0Var, Executor executor, dd.c cVar, e eVar, ScheduledExecutorService scheduledExecutorService, m mVar, f0 f0Var) {
        this.f35240a = z0Var;
        md.d b10 = md.c.b(z0Var.c(), (long) System.identityHashCode(this));
        this.f35241b = b10;
        boolean z10 = true;
        if (executor == w6.g.a()) {
            this.f35242c = new c2();
            this.f35243d = true;
        } else {
            this.f35242c = new d2(executor);
            this.f35243d = false;
        }
        this.f35244e = mVar;
        this.f35245f = dd.r.e();
        if (!(z0Var.e() == z0.d.UNARY || z0Var.e() == z0.d.SERVER_STREAMING)) {
            z10 = false;
        }
        this.f35247h = z10;
        this.f35248i = cVar;
        this.f35253n = eVar;
        this.f35255p = scheduledExecutorService;
        md.c.c("ClientCall.<init>", b10);
    }

    private ScheduledFuture<?> D(t tVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long j10 = tVar.j(timeUnit);
        return this.f35255p.schedule(new d1(new g(j10)), j10, timeUnit);
    }

    private void E(g.a<RespT> aVar, y0 y0Var) {
        n nVar;
        r6.o.v(this.f35249j == null, "Already started");
        r6.o.v(!this.f35251l, "call was cancelled");
        r6.o.p(aVar, "observer");
        r6.o.p(y0Var, "headers");
        if (this.f35245f.h()) {
            this.f35249j = o1.f35223a;
            this.f35242c.execute(new b(aVar));
            return;
        }
        p();
        String b10 = this.f35248i.b();
        if (b10 != null) {
            nVar = this.f35258s.b(b10);
            if (nVar == null) {
                this.f35249j = o1.f35223a;
                this.f35242c.execute(new c(aVar, b10));
                return;
            }
        } else {
            nVar = l.b.f32286a;
        }
        x(y0Var, this.f35257r, nVar, this.f35256q);
        t s10 = s();
        if (!(s10 != null && s10.h())) {
            v(s10, this.f35245f.g(), this.f35248i.d());
            this.f35249j = this.f35253n.a(this.f35240a, this.f35248i, y0Var, this.f35245f);
        } else {
            this.f35249j = new f0(j1.f32237j.q(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", new Object[]{u(this.f35248i.d(), this.f35245f.g()) ? "CallOptions" : "Context", Double.valueOf(((double) s10.j(TimeUnit.NANOSECONDS)) / f35239v)})), r0.f(this.f35248i, y0Var, 0, false));
        }
        if (this.f35243d) {
            this.f35249j.d();
        }
        if (this.f35248i.a() != null) {
            this.f35249j.m(this.f35248i.a());
        }
        if (this.f35248i.f() != null) {
            this.f35249j.i(this.f35248i.f().intValue());
        }
        if (this.f35248i.g() != null) {
            this.f35249j.j(this.f35248i.g().intValue());
        }
        if (s10 != null) {
            this.f35249j.k(s10);
        }
        this.f35249j.a(nVar);
        boolean z10 = this.f35256q;
        if (z10) {
            this.f35249j.r(z10);
        }
        this.f35249j.l(this.f35257r);
        this.f35244e.b();
        this.f35249j.q(new d(aVar));
        this.f35245f.a(this.f35254o, w6.g.a());
        if (!(s10 == null || s10.equals(this.f35245f.g()) || this.f35255p == null)) {
            this.f35246g = D(s10);
        }
        if (this.f35250k) {
            y();
        }
    }

    private void p() {
        j1.b bVar = (j1.b) this.f35248i.h(j1.b.f35119g);
        if (bVar != null) {
            Long l10 = bVar.f35120a;
            if (l10 != null) {
                t a10 = t.a(l10.longValue(), TimeUnit.NANOSECONDS);
                t d10 = this.f35248i.d();
                if (d10 == null || a10.compareTo(d10) < 0) {
                    this.f35248i = this.f35248i.m(a10);
                }
            }
            Boolean bool = bVar.f35121b;
            if (bool != null) {
                this.f35248i = bool.booleanValue() ? this.f35248i.s() : this.f35248i.t();
            }
            if (bVar.f35122c != null) {
                Integer f10 = this.f35248i.f();
                if (f10 != null) {
                    this.f35248i = this.f35248i.o(Math.min(f10.intValue(), bVar.f35122c.intValue()));
                } else {
                    this.f35248i = this.f35248i.o(bVar.f35122c.intValue());
                }
            }
            if (bVar.f35123d != null) {
                Integer g10 = this.f35248i.g();
                if (g10 != null) {
                    this.f35248i = this.f35248i.p(Math.min(g10.intValue(), bVar.f35123d.intValue()));
                } else {
                    this.f35248i = this.f35248i.p(bVar.f35123d.intValue());
                }
            }
        }
    }

    private void q(String str, Throwable th) {
        dd.j1 j1Var;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f35237t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.f35251l) {
            this.f35251l = true;
            try {
                if (this.f35249j != null) {
                    dd.j1 j1Var2 = dd.j1.f32234g;
                    if (str != null) {
                        j1Var = j1Var2.q(str);
                    } else {
                        j1Var = j1Var2.q("Call cancelled without message");
                    }
                    if (th != null) {
                        j1Var = j1Var.p(th);
                    }
                    this.f35249j.b(j1Var);
                }
            } finally {
                y();
            }
        }
    }

    /* access modifiers changed from: private */
    public void r(g.a<RespT> aVar, dd.j1 j1Var, y0 y0Var) {
        aVar.a(j1Var, y0Var);
    }

    /* access modifiers changed from: private */
    public t s() {
        return w(this.f35248i.d(), this.f35245f.g());
    }

    private void t() {
        r6.o.v(this.f35249j != null, "Not started");
        r6.o.v(!this.f35251l, "call was cancelled");
        r6.o.v(!this.f35252m, "call already half-closed");
        this.f35252m = true;
        this.f35249j.o();
    }

    private static boolean u(t tVar, t tVar2) {
        if (tVar == null) {
            return false;
        }
        if (tVar2 == null) {
            return true;
        }
        return tVar.g(tVar2);
    }

    private static void v(t tVar, t tVar2, t tVar3) {
        Logger logger = f35237t;
        if (logger.isLoggable(Level.FINE) && tVar != null && tVar.equals(tVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long max = Math.max(0, tVar.j(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(max)}));
            if (tVar3 == null) {
                sb2.append(" Explicit call timeout was not set.");
            } else {
                sb2.append(String.format(locale, " Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(tVar3.j(timeUnit))}));
            }
            logger.fine(sb2.toString());
        }
    }

    private static t w(t tVar, t tVar2) {
        if (tVar == null) {
            return tVar2;
        }
        return tVar2 == null ? tVar : tVar.i(tVar2);
    }

    static void x(y0 y0Var, v vVar, n nVar, boolean z10) {
        y0Var.e(r0.f35308i);
        y0.g<String> gVar = r0.f35304e;
        y0Var.e(gVar);
        if (nVar != l.b.f32286a) {
            y0Var.p(gVar, nVar.a());
        }
        y0.g<byte[]> gVar2 = r0.f35305f;
        y0Var.e(gVar2);
        byte[] a10 = g0.a(vVar);
        if (a10.length != 0) {
            y0Var.p(gVar2, a10);
        }
        y0Var.e(r0.f35306g);
        y0.g<byte[]> gVar3 = r0.f35307h;
        y0Var.e(gVar3);
        if (z10) {
            y0Var.p(gVar3, f35238u);
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        this.f35245f.i(this.f35254o);
        ScheduledFuture<?> scheduledFuture = this.f35246g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void z(ReqT reqt) {
        r6.o.v(this.f35249j != null, "Not started");
        r6.o.v(!this.f35251l, "call was cancelled");
        r6.o.v(!this.f35252m, "call was half-closed");
        try {
            q qVar = this.f35249j;
            if (qVar instanceof z1) {
                ((z1) qVar).n0(reqt);
            } else {
                qVar.c(this.f35240a.j(reqt));
            }
            if (!this.f35247h) {
                this.f35249j.flush();
            }
        } catch (RuntimeException e10) {
            this.f35249j.b(dd.j1.f32234g.p(e10).q("Failed to stream message"));
        } catch (Error e11) {
            this.f35249j.b(dd.j1.f32234g.q("Client sendMessage() failed with Error"));
            throw e11;
        }
    }

    /* access modifiers changed from: package-private */
    public p<ReqT, RespT> A(o oVar) {
        this.f35258s = oVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public p<ReqT, RespT> B(v vVar) {
        this.f35257r = vVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public p<ReqT, RespT> C(boolean z10) {
        this.f35256q = z10;
        return this;
    }

    public void a(String str, Throwable th) {
        md.c.g("ClientCall.cancel", this.f35241b);
        try {
            q(str, th);
        } finally {
            md.c.i("ClientCall.cancel", this.f35241b);
        }
    }

    public void b() {
        md.c.g("ClientCall.halfClose", this.f35241b);
        try {
            t();
        } finally {
            md.c.i("ClientCall.halfClose", this.f35241b);
        }
    }

    public void c(int i10) {
        md.c.g("ClientCall.request", this.f35241b);
        try {
            boolean z10 = true;
            r6.o.v(this.f35249j != null, "Not started");
            if (i10 < 0) {
                z10 = false;
            }
            r6.o.e(z10, "Number requested must be non-negative");
            this.f35249j.h(i10);
        } finally {
            md.c.i("ClientCall.request", this.f35241b);
        }
    }

    public void d(ReqT reqt) {
        md.c.g("ClientCall.sendMessage", this.f35241b);
        try {
            z(reqt);
        } finally {
            md.c.i("ClientCall.sendMessage", this.f35241b);
        }
    }

    public void e(g.a<RespT> aVar, y0 y0Var) {
        md.c.g("ClientCall.start", this.f35241b);
        try {
            E(aVar, y0Var);
        } finally {
            md.c.i("ClientCall.start", this.f35241b);
        }
    }

    public String toString() {
        return i.c(this).d("method", this.f35240a).toString();
    }
}
