package io.grpc.internal;

import dd.j1;
import dd.p;
import dd.q;
import dd.r0;
import dd.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import r6.i;
import r6.o;

/* compiled from: PickFirstLoadBalancer */
final class r1 extends r0 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r0.d f35343c;

    /* renamed from: d  reason: collision with root package name */
    private r0.h f35344d;

    /* compiled from: PickFirstLoadBalancer */
    class a implements r0.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.h f35345a;

        a(r0.h hVar) {
            this.f35345a = hVar;
        }

        public void a(q qVar) {
            r1.this.i(this.f35345a, qVar);
        }
    }

    /* compiled from: PickFirstLoadBalancer */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35347a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                dd.p[] r0 = dd.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35347a = r0
                dd.p r1 = dd.p.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35347a     // Catch:{ NoSuchFieldError -> 0x001d }
                dd.p r1 = dd.p.CONNECTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35347a     // Catch:{ NoSuchFieldError -> 0x0028 }
                dd.p r1 = dd.p.READY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35347a     // Catch:{ NoSuchFieldError -> 0x0033 }
                dd.p r1 = dd.p.TRANSIENT_FAILURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.r1.b.<clinit>():void");
        }
    }

    /* compiled from: PickFirstLoadBalancer */
    private static final class c extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.e f35348a;

        c(r0.e eVar) {
            this.f35348a = (r0.e) o.p(eVar, "result");
        }

        public r0.e a(r0.f fVar) {
            return this.f35348a;
        }

        public String toString() {
            return i.b(c.class).d("result", this.f35348a).toString();
        }
    }

    /* compiled from: PickFirstLoadBalancer */
    private final class d extends r0.i {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final r0.h f35349a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f35350b = new AtomicBoolean(false);

        /* compiled from: PickFirstLoadBalancer */
        class a implements Runnable {
            a() {
            }

            public void run() {
                d.this.f35349a.e();
            }
        }

        d(r0.h hVar) {
            this.f35349a = (r0.h) o.p(hVar, "subchannel");
        }

        public r0.e a(r0.f fVar) {
            if (this.f35350b.compareAndSet(false, true)) {
                r1.this.f35343c.d().execute(new a());
            }
            return r0.e.g();
        }
    }

    r1(r0.d dVar) {
        this.f35343c = (r0.d) o.p(dVar, "helper");
    }

    /* access modifiers changed from: private */
    public void i(r0.h hVar, q qVar) {
        r0.i iVar;
        r0.i iVar2;
        p c10 = qVar.c();
        if (c10 != p.SHUTDOWN) {
            if (qVar.c() == p.TRANSIENT_FAILURE || qVar.c() == p.IDLE) {
                this.f35343c.e();
            }
            int i10 = b.f35347a[c10.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    iVar = new c(r0.e.g());
                } else if (i10 == 3) {
                    iVar2 = new c(r0.e.h(hVar));
                } else if (i10 == 4) {
                    iVar = new c(r0.e.f(qVar.d()));
                } else {
                    throw new IllegalArgumentException("Unsupported state:" + c10);
                }
                this.f35343c.f(c10, iVar);
            }
            iVar2 = new d(hVar);
            iVar = iVar2;
            this.f35343c.f(c10, iVar);
        }
    }

    public boolean a(r0.g gVar) {
        List<x> a10 = gVar.a();
        if (a10.isEmpty()) {
            j1 j1Var = j1.f32248u;
            c(j1Var.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        r0.h hVar = this.f35344d;
        if (hVar == null) {
            r0.h a11 = this.f35343c.a(r0.b.c().e(a10).b());
            a11.g(new a(a11));
            this.f35344d = a11;
            this.f35343c.f(p.CONNECTING, new c(r0.e.h(a11)));
            a11.e();
            return true;
        }
        hVar.h(a10);
        return true;
    }

    public void c(j1 j1Var) {
        r0.h hVar = this.f35344d;
        if (hVar != null) {
            hVar.f();
            this.f35344d = null;
        }
        this.f35343c.f(p.TRANSIENT_FAILURE, new c(r0.e.f(j1Var)));
    }

    public void e() {
        r0.h hVar = this.f35344d;
        if (hVar != null) {
            hVar.e();
        }
    }

    public void f() {
        r0.h hVar = this.f35344d;
        if (hVar != null) {
            hVar.f();
        }
    }
}
