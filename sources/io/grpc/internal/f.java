package io.grpc.internal;

import dd.u;
import io.grpc.internal.g;
import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import r6.o;

/* compiled from: ApplicationThreadDeframer */
public class f implements y {

    /* renamed from: a  reason: collision with root package name */
    private final l1.b f34880a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f34881b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l1 f34882c;

    /* compiled from: ApplicationThreadDeframer */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34883a;

        a(int i10) {
            this.f34883a = i10;
        }

        public void run() {
            if (!f.this.f34882c.J()) {
                try {
                    f.this.f34882c.h(this.f34883a);
                } catch (Throwable th) {
                    f.this.f34881b.e(th);
                    f.this.f34882c.close();
                }
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1 f34885a;

        b(v1 v1Var) {
            this.f34885a = v1Var;
        }

        public void run() {
            try {
                f.this.f34882c.q(this.f34885a);
            } catch (Throwable th) {
                f.this.f34881b.e(th);
                f.this.f34882c.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer */
    class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1 f34887a;

        c(v1 v1Var) {
            this.f34887a = v1Var;
        }

        public void close() {
            this.f34887a.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer */
    class d implements Runnable {
        d() {
        }

        public void run() {
            f.this.f34882c.n();
        }
    }

    /* compiled from: ApplicationThreadDeframer */
    class e implements Runnable {
        e() {
        }

        public void run() {
            f.this.f34882c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f  reason: collision with other inner class name */
    /* compiled from: ApplicationThreadDeframer */
    private class C0398f extends g implements Closeable {

        /* renamed from: d  reason: collision with root package name */
        private final Closeable f34891d;

        public C0398f(Runnable runnable, Closeable closeable) {
            super(f.this, runnable, (a) null);
            this.f34891d = closeable;
        }

        public void close() throws IOException {
            this.f34891d.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer */
    private class g implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f34893a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34894b;

        /* synthetic */ g(f fVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void h() {
            if (!this.f34894b) {
                this.f34893a.run();
                this.f34894b = true;
            }
        }

        public InputStream next() {
            h();
            return f.this.f34881b.f();
        }

        private g(Runnable runnable) {
            this.f34894b = false;
            this.f34893a = runnable;
        }
    }

    /* compiled from: ApplicationThreadDeframer */
    interface h extends g.d {
    }

    f(l1.b bVar, h hVar, l1 l1Var) {
        h2 h2Var = new h2((l1.b) o.p(bVar, "listener"));
        this.f34880a = h2Var;
        g gVar = new g(h2Var, hVar);
        this.f34881b = gVar;
        l1Var.i0(gVar);
        this.f34882c = l1Var;
    }

    public void close() {
        this.f34882c.l0();
        this.f34880a.a(new g(this, new e(), (a) null));
    }

    public void h(int i10) {
        this.f34880a.a(new g(this, new a(i10), (a) null));
    }

    public void i(int i10) {
        this.f34882c.i(i10);
    }

    public void j(u uVar) {
        this.f34882c.j(uVar);
    }

    public void n() {
        this.f34880a.a(new g(this, new d(), (a) null));
    }

    public void q(v1 v1Var) {
        this.f34880a.a(new C0398f(new b(v1Var), new c(v1Var)));
    }
}
