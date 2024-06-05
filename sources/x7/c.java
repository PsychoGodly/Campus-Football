package x7;

import dd.j1;
import dd.y0;
import dd.z0;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x7.t0;
import y7.g;
import y7.g0;
import y7.r;
import y7.v;

/* compiled from: AbstractStream */
abstract class c<ReqT, RespT, CallbackT extends t0> {

    /* renamed from: n  reason: collision with root package name */
    private static final long f31017n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f31018o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f31019p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f31020q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f31021r;

    /* renamed from: a  reason: collision with root package name */
    private g.b f31022a;

    /* renamed from: b  reason: collision with root package name */
    private g.b f31023b;

    /* renamed from: c  reason: collision with root package name */
    private final y f31024c;

    /* renamed from: d  reason: collision with root package name */
    private final z0<ReqT, RespT> f31025d;

    /* renamed from: e  reason: collision with root package name */
    private final c<ReqT, RespT, CallbackT>.b f31026e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final g f31027f;

    /* renamed from: g  reason: collision with root package name */
    private final g.d f31028g;

    /* renamed from: h  reason: collision with root package name */
    private final g.d f31029h;

    /* renamed from: i  reason: collision with root package name */
    private s0 f31030i = s0.Initial;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public long f31031j = 0;

    /* renamed from: k  reason: collision with root package name */
    private dd.g<ReqT, RespT> f31032k;

    /* renamed from: l  reason: collision with root package name */
    final r f31033l;

    /* renamed from: m  reason: collision with root package name */
    final CallbackT f31034m;

    /* compiled from: AbstractStream */
    class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f31035a;

        a(long j10) {
            this.f31035a = j10;
        }

        /* access modifiers changed from: package-private */
        public void a(Runnable runnable) {
            c.this.f31027f.w();
            if (c.this.f31031j == this.f31035a) {
                runnable.run();
            } else {
                v.a(c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* compiled from: AbstractStream */
    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.j();
        }
    }

    /* renamed from: x7.c$c  reason: collision with other inner class name */
    /* compiled from: AbstractStream */
    class C0350c implements j0<RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final c<ReqT, RespT, CallbackT>.defpackage.a f31038a;

        C0350c(c<ReqT, RespT, CallbackT>.defpackage.a aVar) {
            this.f31038a = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(j1 j1Var) {
            if (j1Var.o()) {
                v.a(c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(c.this)));
            } else {
                v.e(c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(c.this)), j1Var);
            }
            c.this.k(j1Var);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(y0 y0Var) {
            if (v.c()) {
                HashMap hashMap = new HashMap();
                for (String next : y0Var.j()) {
                    if (q.f31102e.contains(next.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(next, (String) y0Var.g(y0.g.e(next, y0.f32388e)));
                    }
                }
                if (!hashMap.isEmpty()) {
                    v.a(c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(c.this)), hashMap);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(Object obj) {
            if (v.c()) {
                v.a(c.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(c.this)), obj);
            }
            c.this.r(obj);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l() {
            v.a(c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(c.this)));
            c.this.s();
        }

        public void a() {
            this.f31038a.a(new d(this));
        }

        public void b(j1 j1Var) {
            this.f31038a.a(new f(this, j1Var));
        }

        public void c(y0 y0Var) {
            this.f31038a.a(new e(this, y0Var));
        }

        public void d(RespT respt) {
            this.f31038a.a(new g(this, respt));
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f31017n = timeUnit.toMillis(1);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f31018o = timeUnit2.toMillis(1);
        f31019p = timeUnit2.toMillis(1);
        f31020q = timeUnit.toMillis(10);
        f31021r = timeUnit.toMillis(10);
    }

    c(y yVar, z0<ReqT, RespT> z0Var, g gVar, g.d dVar, g.d dVar2, g.d dVar3, CallbackT callbackt) {
        this.f31024c = yVar;
        this.f31025d = z0Var;
        g gVar2 = gVar;
        this.f31027f = gVar2;
        this.f31028g = dVar2;
        this.f31029h = dVar3;
        this.f31034m = callbackt;
        this.f31026e = new b();
        this.f31033l = new r(gVar2, dVar, f31017n, 1.5d, f31018o);
    }

    private void g() {
        g.b bVar = this.f31022a;
        if (bVar != null) {
            bVar.c();
            this.f31022a = null;
        }
    }

    private void h() {
        g.b bVar = this.f31023b;
        if (bVar != null) {
            bVar.c();
            this.f31023b = null;
        }
    }

    private void i(s0 s0Var, j1 j1Var) {
        y7.b.d(n(), "Only started streams should be closed.", new Object[0]);
        s0 s0Var2 = s0.Error;
        y7.b.d(s0Var == s0Var2 || j1Var.o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f31027f.w();
        if (q.j(j1Var)) {
            g0.p(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", j1Var.l()));
        }
        h();
        g();
        this.f31033l.c();
        this.f31031j++;
        j1.b m10 = j1Var.m();
        if (m10 == j1.b.OK) {
            this.f31033l.f();
        } else if (m10 == j1.b.RESOURCE_EXHAUSTED) {
            v.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f31033l.g();
        } else if (m10 == j1.b.UNAUTHENTICATED && this.f31030i != s0.Healthy) {
            this.f31024c.h();
        } else if (m10 == j1.b.UNAVAILABLE && ((j1Var.l() instanceof UnknownHostException) || (j1Var.l() instanceof ConnectException))) {
            this.f31033l.h(f31021r);
        }
        if (s0Var != s0Var2) {
            v.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            w();
        }
        if (this.f31032k != null) {
            if (j1Var.o()) {
                v.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f31032k.b();
            }
            this.f31032k = null;
        }
        this.f31030i = s0Var;
        this.f31034m.b(j1Var);
    }

    /* access modifiers changed from: private */
    public void j() {
        if (m()) {
            i(s0.Initial, j1.f32233f);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (m()) {
            this.f31030i = s0.Healthy;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p() {
        s0 s0Var = this.f31030i;
        y7.b.d(s0Var == s0.Backoff, "State should still be backoff but was %s", s0Var);
        this.f31030i = s0.Initial;
        u();
        y7.b.d(n(), "Stream should have started", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void s() {
        this.f31030i = s0.Open;
        this.f31034m.a();
        if (this.f31022a == null) {
            this.f31022a = this.f31027f.k(this.f31029h, f31020q, new b(this));
        }
    }

    private void t() {
        y7.b.d(this.f31030i == s0.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f31030i = s0.Backoff;
        this.f31033l.b(new a(this));
    }

    /* access modifiers changed from: package-private */
    public void k(j1 j1Var) {
        y7.b.d(n(), "Can't handle server close on non-started stream!", new Object[0]);
        i(s0.Error, j1Var);
    }

    public void l() {
        y7.b.d(!n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f31027f.w();
        this.f31030i = s0.Initial;
        this.f31033l.f();
    }

    public boolean m() {
        this.f31027f.w();
        s0 s0Var = this.f31030i;
        return s0Var == s0.Open || s0Var == s0.Healthy;
    }

    public boolean n() {
        this.f31027f.w();
        s0 s0Var = this.f31030i;
        return s0Var == s0.Starting || s0Var == s0.Backoff || m();
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (m() && this.f31023b == null) {
            this.f31023b = this.f31027f.k(this.f31028g, f31019p, this.f31026e);
        }
    }

    public abstract void r(RespT respt);

    public void u() {
        this.f31027f.w();
        boolean z10 = true;
        y7.b.d(this.f31032k == null, "Last call still set", new Object[0]);
        y7.b.d(this.f31023b == null, "Idle timer still set", new Object[0]);
        s0 s0Var = this.f31030i;
        if (s0Var == s0.Error) {
            t();
            return;
        }
        if (s0Var != s0.Initial) {
            z10 = false;
        }
        y7.b.d(z10, "Already started", new Object[0]);
        this.f31032k = this.f31024c.m(this.f31025d, new C0350c(new a(this.f31031j)));
        this.f31030i = s0.Starting;
    }

    public void v() {
        if (n()) {
            i(s0.Initial, j1.f32233f);
        }
    }

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public void x(ReqT reqt) {
        this.f31027f.w();
        v.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        h();
        this.f31032k.d(reqt);
    }
}
