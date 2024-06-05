package io.grpc.internal;

import dd.l;
import dd.n;
import dd.u;
import io.grpc.internal.f;
import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.InputStream;
import md.b;
import md.c;
import r6.o;

/* compiled from: AbstractStream */
public abstract class d implements j2 {

    /* compiled from: AbstractStream */
    public static abstract class a implements f.h, l1.b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public y f34851a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f34852b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final i2 f34853c;

        /* renamed from: d  reason: collision with root package name */
        private final o2 f34854d;

        /* renamed from: e  reason: collision with root package name */
        private final l1 f34855e;

        /* renamed from: f  reason: collision with root package name */
        private int f34856f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f34857g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f34858h;

        /* renamed from: io.grpc.internal.d$a$a  reason: collision with other inner class name */
        /* compiled from: AbstractStream */
        class C0397a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f34859a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f34860b;

            C0397a(b bVar, int i10) {
                this.f34859a = bVar;
                this.f34860b = i10;
            }

            public void run() {
                c.f("AbstractStream.request");
                c.d(this.f34859a);
                try {
                    a.this.f34851a.h(this.f34860b);
                } catch (Throwable th) {
                    c.h("AbstractStream.request");
                    throw th;
                }
                c.h("AbstractStream.request");
            }
        }

        protected a(int i10, i2 i2Var, o2 o2Var) {
            this.f34853c = (i2) o.p(i2Var, "statsTraceCtx");
            this.f34854d = (o2) o.p(o2Var, "transportTracer");
            l1 l1Var = new l1(this, l.b.f32286a, i10, i2Var, o2Var);
            this.f34855e = l1Var;
            this.f34851a = l1Var;
        }

        /* access modifiers changed from: private */
        public boolean n() {
            boolean z10;
            synchronized (this.f34852b) {
                z10 = this.f34857g && this.f34856f < 32768 && !this.f34858h;
            }
            return z10;
        }

        private void p() {
            boolean n10;
            synchronized (this.f34852b) {
                n10 = n();
            }
            if (n10) {
                o().c();
            }
        }

        /* access modifiers changed from: private */
        public void q(int i10) {
            synchronized (this.f34852b) {
                this.f34856f += i10;
            }
        }

        /* access modifiers changed from: private */
        public void u(int i10) {
            f(new C0397a(c.e(), i10));
        }

        public void a(k2.a aVar) {
            o().a(aVar);
        }

        public final void b(int i10) {
            boolean z10;
            synchronized (this.f34852b) {
                o.v(this.f34857g, "onStreamAllocated was not called, but it seems the stream is active");
                int i11 = this.f34856f;
                z10 = true;
                boolean z11 = i11 < 32768;
                int i12 = i11 - i10;
                this.f34856f = i12;
                boolean z12 = i12 < 32768;
                if (z11 || !z12) {
                    z10 = false;
                }
            }
            if (z10) {
                p();
            }
        }

        /* access modifiers changed from: protected */
        public final void k(boolean z10) {
            if (z10) {
                this.f34851a.close();
            } else {
                this.f34851a.n();
            }
        }

        /* access modifiers changed from: protected */
        public final void l(v1 v1Var) {
            try {
                this.f34851a.q(v1Var);
            } catch (Throwable th) {
                e(th);
            }
        }

        /* access modifiers changed from: protected */
        public o2 m() {
            return this.f34854d;
        }

        /* access modifiers changed from: protected */
        public abstract k2 o();

        /* access modifiers changed from: protected */
        public void r() {
            boolean z10 = false;
            o.u(o() != null);
            synchronized (this.f34852b) {
                if (!this.f34857g) {
                    z10 = true;
                }
                o.v(z10, "Already allocated");
                this.f34857g = true;
            }
            p();
        }

        /* access modifiers changed from: protected */
        public final void s() {
            synchronized (this.f34852b) {
                this.f34858h = true;
            }
        }

        /* access modifiers changed from: package-private */
        public final void t() {
            this.f34855e.i0(this);
            this.f34851a = this.f34855e;
        }

        /* access modifiers changed from: protected */
        public final void v(u uVar) {
            this.f34851a.j(uVar);
        }

        /* access modifiers changed from: protected */
        public void w(s0 s0Var) {
            this.f34855e.h0(s0Var);
            this.f34851a = new f(this, this, this.f34855e);
        }

        /* access modifiers changed from: package-private */
        public final void x(int i10) {
            this.f34851a.i(i10);
        }
    }

    public final void a(n nVar) {
        g().a((n) o.p(nVar, "compressor"));
    }

    public final void c(InputStream inputStream) {
        o.p(inputStream, "message");
        try {
            if (!g().b()) {
                g().c(inputStream);
            }
        } finally {
            r0.e(inputStream);
        }
    }

    public void d() {
        t().t();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        g().close();
    }

    public final void flush() {
        if (!g().b()) {
            g().flush();
        }
    }

    /* access modifiers changed from: protected */
    public abstract p0 g();

    public final void h(int i10) {
        t().u(i10);
    }

    public boolean isReady() {
        return t().n();
    }

    /* access modifiers changed from: protected */
    public final void s(int i10) {
        t().q(i10);
    }

    /* access modifiers changed from: protected */
    public abstract a t();
}
