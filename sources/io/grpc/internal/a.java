package io.grpc.internal;

import dd.b0;
import dd.j1;
import dd.n;
import dd.t;
import dd.v;
import dd.y0;
import io.grpc.internal.d;
import io.grpc.internal.m1;
import io.grpc.internal.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;

/* compiled from: AbstractClientStream */
public abstract class a extends d implements q, m1.d {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f34679g = Logger.getLogger(a.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final o2 f34680a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f34681b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34682c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34683d;

    /* renamed from: e  reason: collision with root package name */
    private y0 f34684e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f34685f;

    /* renamed from: io.grpc.internal.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractClientStream */
    private class C0395a implements p0 {

        /* renamed from: a  reason: collision with root package name */
        private y0 f34686a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34687b;

        /* renamed from: c  reason: collision with root package name */
        private final i2 f34688c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f34689d;

        public C0395a(y0 y0Var, i2 i2Var) {
            this.f34686a = (y0) o.p(y0Var, "headers");
            this.f34688c = (i2) o.p(i2Var, "statsTraceCtx");
        }

        public p0 a(n nVar) {
            return this;
        }

        public boolean b() {
            return this.f34687b;
        }

        public void c(InputStream inputStream) {
            o.v(this.f34689d == null, "writePayload should not be called multiple times");
            try {
                this.f34689d = t6.b.d(inputStream);
                this.f34688c.i(0);
                i2 i2Var = this.f34688c;
                byte[] bArr = this.f34689d;
                i2Var.j(0, (long) bArr.length, (long) bArr.length);
                this.f34688c.k((long) this.f34689d.length);
                this.f34688c.l((long) this.f34689d.length);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        public void close() {
            boolean z10 = true;
            this.f34687b = true;
            if (this.f34689d == null) {
                z10 = false;
            }
            o.v(z10, "Lack of request message. GET request is only supported for unary requests");
            a.this.u().d(this.f34686a, this.f34689d);
            this.f34689d = null;
            this.f34686a = null;
        }

        public void flush() {
        }

        public void j(int i10) {
        }
    }

    /* compiled from: AbstractClientStream */
    protected interface b {
        void b(j1 j1Var);

        void c(p2 p2Var, boolean z10, boolean z11, int i10);

        void d(y0 y0Var, byte[] bArr);
    }

    /* compiled from: AbstractClientStream */
    protected static abstract class c extends d.a {

        /* renamed from: i  reason: collision with root package name */
        private final i2 f34691i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f34692j;

        /* renamed from: k  reason: collision with root package name */
        private r f34693k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f34694l;

        /* renamed from: m  reason: collision with root package name */
        private v f34695m = v.c();

        /* renamed from: n  reason: collision with root package name */
        private boolean f34696n = false;

        /* renamed from: o  reason: collision with root package name */
        private Runnable f34697o;

        /* renamed from: p  reason: collision with root package name */
        private volatile boolean f34698p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f34699q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f34700r;

        /* renamed from: io.grpc.internal.a$c$a  reason: collision with other inner class name */
        /* compiled from: AbstractClientStream */
        class C0396a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j1 f34701a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f34702b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ y0 f34703c;

            C0396a(j1 j1Var, r.a aVar, y0 y0Var) {
                this.f34701a = j1Var;
                this.f34702b = aVar;
                this.f34703c = y0Var;
            }

            public void run() {
                c.this.C(this.f34701a, this.f34702b, this.f34703c);
            }
        }

        protected c(int i10, i2 i2Var, o2 o2Var) {
            super(i10, i2Var, o2Var);
            this.f34691i = (i2) o.p(i2Var, "statsTraceCtx");
        }

        /* access modifiers changed from: private */
        public void C(j1 j1Var, r.a aVar, y0 y0Var) {
            if (!this.f34692j) {
                this.f34692j = true;
                this.f34691i.m(j1Var);
                o().d(j1Var, aVar, y0Var);
                if (m() != null) {
                    m().f(j1Var.o());
                }
            }
        }

        /* access modifiers changed from: private */
        public void I(v vVar) {
            o.v(this.f34693k == null, "Already called start");
            this.f34695m = (v) o.p(vVar, "decompressorRegistry");
        }

        /* access modifiers changed from: private */
        public void J(boolean z10) {
            this.f34694l = z10;
        }

        /* access modifiers changed from: private */
        public final void L() {
            this.f34698p = true;
        }

        /* access modifiers changed from: protected */
        public void D(v1 v1Var) {
            o.p(v1Var, "frame");
            boolean z10 = true;
            try {
                if (this.f34699q) {
                    a.f34679g.log(Level.INFO, "Received data on closed stream");
                    v1Var.close();
                    return;
                }
                z10 = false;
                l(v1Var);
            } catch (Throwable th) {
                if (z10) {
                    v1Var.close();
                }
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void E(dd.y0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f34699q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                r6.o.v(r0, r2)
                io.grpc.internal.i2 r0 = r5.f34691i
                r0.a()
                dd.y0$g<java.lang.String> r0 = io.grpc.internal.r0.f35306g
                java.lang.Object r0 = r6.g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f34694l
                r3 = 0
                if (r2 == 0) goto L_0x004f
                if (r0 == 0) goto L_0x004f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x002f
                io.grpc.internal.s0 r0 = new io.grpc.internal.s0
                r0.<init>()
                r5.w(r0)
                r0 = 1
                goto L_0x0050
            L_0x002f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x004f
                dd.j1 r6 = dd.j1.f32247t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                dd.j1 r6 = r6.q(r0)
                dd.l1 r6 = r6.d()
                r5.e(r6)
                return
            L_0x004f:
                r0 = 0
            L_0x0050:
                dd.y0$g<java.lang.String> r2 = io.grpc.internal.r0.f35304e
                java.lang.Object r2 = r6.g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x0093
                dd.v r4 = r5.f34695m
                dd.u r4 = r4.e(r2)
                if (r4 != 0) goto L_0x007a
                dd.j1 r6 = dd.j1.f32247t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                dd.j1 r6 = r6.q(r0)
                dd.l1 r6 = r6.d()
                r5.e(r6)
                return
            L_0x007a:
                dd.l r1 = dd.l.b.f32286a
                if (r4 == r1) goto L_0x0093
                if (r0 == 0) goto L_0x0090
                dd.j1 r6 = dd.j1.f32247t
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                dd.j1 r6 = r6.q(r0)
                dd.l1 r6 = r6.d()
                r5.e(r6)
                return
            L_0x0090:
                r5.v(r4)
            L_0x0093:
                io.grpc.internal.r r0 = r5.o()
                r0.b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a.c.E(dd.y0):void");
        }

        /* access modifiers changed from: protected */
        public void F(y0 y0Var, j1 j1Var) {
            o.p(j1Var, "status");
            o.p(y0Var, "trailers");
            if (this.f34699q) {
                a.f34679g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{j1Var, y0Var});
                return;
            }
            this.f34691i.b(y0Var);
            N(j1Var, false, y0Var);
        }

        /* access modifiers changed from: protected */
        public final boolean G() {
            return this.f34698p;
        }

        /* access modifiers changed from: protected */
        /* renamed from: H */
        public final r o() {
            return this.f34693k;
        }

        public final void K(r rVar) {
            o.v(this.f34693k == null, "Already called setListener");
            this.f34693k = (r) o.p(rVar, "listener");
        }

        public final void M(j1 j1Var, r.a aVar, boolean z10, y0 y0Var) {
            o.p(j1Var, "status");
            o.p(y0Var, "trailers");
            if (!this.f34699q || z10) {
                this.f34699q = true;
                this.f34700r = j1Var.o();
                s();
                if (this.f34696n) {
                    this.f34697o = null;
                    C(j1Var, aVar, y0Var);
                    return;
                }
                this.f34697o = new C0396a(j1Var, aVar, y0Var);
                k(z10);
            }
        }

        public final void N(j1 j1Var, boolean z10, y0 y0Var) {
            M(j1Var, r.a.PROCESSED, z10, y0Var);
        }

        public void c(boolean z10) {
            o.v(this.f34699q, "status should have been reported on deframer closed");
            this.f34696n = true;
            if (this.f34700r && z10) {
                N(j1.f32247t.q("Encountered end-of-stream mid-frame"), true, new y0());
            }
            Runnable runnable = this.f34697o;
            if (runnable != null) {
                runnable.run();
                this.f34697o = null;
            }
        }
    }

    protected a(q2 q2Var, i2 i2Var, o2 o2Var, y0 y0Var, dd.c cVar, boolean z10) {
        o.p(y0Var, "headers");
        this.f34680a = (o2) o.p(o2Var, "transportTracer");
        this.f34682c = r0.o(cVar);
        this.f34683d = z10;
        if (!z10) {
            this.f34681b = new m1(this, q2Var, i2Var);
            this.f34684e = y0Var;
            return;
        }
        this.f34681b = new C0395a(y0Var, i2Var);
    }

    public final void b(j1 j1Var) {
        o.e(!j1Var.o(), "Should not cancel with OK status");
        this.f34685f = true;
        u().b(j1Var);
    }

    public final void e(p2 p2Var, boolean z10, boolean z11, int i10) {
        o.e(p2Var != null || z10, "null frame before EOS");
        u().c(p2Var, z10, z11, i10);
    }

    /* access modifiers changed from: protected */
    public final p0 g() {
        return this.f34681b;
    }

    public void i(int i10) {
        t().x(i10);
    }

    public final boolean isReady() {
        return super.isReady() && !this.f34685f;
    }

    public void j(int i10) {
        this.f34681b.j(i10);
    }

    public void k(t tVar) {
        y0 y0Var = this.f34684e;
        y0.g<Long> gVar = r0.f35303d;
        y0Var.e(gVar);
        this.f34684e.p(gVar, Long.valueOf(Math.max(0, tVar.j(TimeUnit.NANOSECONDS))));
    }

    public final void l(v vVar) {
        t().I(vVar);
    }

    public final void n(x0 x0Var) {
        x0Var.b("remote_addr", p().b(b0.f32141a));
    }

    public final void o() {
        if (!t().G()) {
            t().L();
            f();
        }
    }

    public final void q(r rVar) {
        t().K(rVar);
        if (!this.f34683d) {
            u().d(this.f34684e, (byte[]) null);
            this.f34684e = null;
        }
    }

    public final void r(boolean z10) {
        t().J(z10);
    }

    /* access modifiers changed from: protected */
    public abstract b u();

    /* access modifiers changed from: protected */
    public o2 w() {
        return this.f34680a;
    }

    public final boolean x() {
        return this.f34682c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract c t();
}
