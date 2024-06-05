package io.grpc.internal;

import com.google.android.gms.common.api.a;
import dd.b;
import dd.c;
import dd.f;
import dd.j1;
import dd.k;
import dd.l0;
import dd.m;
import dd.y0;
import dd.z0;
import io.grpc.internal.n1;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import r6.o;

/* compiled from: CallCredentialsApplyingTransportFactory */
final class l implements t {

    /* renamed from: a  reason: collision with root package name */
    private final t f35127a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f35128b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f35129c;

    /* compiled from: CallCredentialsApplyingTransportFactory */
    private class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        private final v f35130a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35131b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f35132c = new AtomicInteger(-2147483647);

        /* renamed from: d  reason: collision with root package name */
        private volatile j1 f35133d;

        /* renamed from: e  reason: collision with root package name */
        private j1 f35134e;

        /* renamed from: f  reason: collision with root package name */
        private j1 f35135f;

        /* renamed from: g  reason: collision with root package name */
        private final n1.a f35136g = new C0399a();

        /* renamed from: io.grpc.internal.l$a$a  reason: collision with other inner class name */
        /* compiled from: CallCredentialsApplyingTransportFactory */
        class C0399a implements n1.a {
            C0399a() {
            }

            public void a() {
                if (a.this.f35132c.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        /* compiled from: CallCredentialsApplyingTransportFactory */
        class b extends b.C0362b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z0 f35139a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f35140b;

            b(z0 z0Var, c cVar) {
                this.f35139a = z0Var;
                this.f35140b = cVar;
            }
        }

        a(v vVar, String str) {
            this.f35130a = (v) o.p(vVar, "delegate");
            this.f35131b = (String) o.p(str, "authority");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            super.d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r0 == null) goto L_0x001a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            super.b(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j() {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.atomic.AtomicInteger r0 = r3.f35132c     // Catch:{ all -> 0x0020 }
                int r0 = r0.get()     // Catch:{ all -> 0x0020 }
                if (r0 == 0) goto L_0x000b
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                return
            L_0x000b:
                dd.j1 r0 = r3.f35134e     // Catch:{ all -> 0x0020 }
                dd.j1 r1 = r3.f35135f     // Catch:{ all -> 0x0020 }
                r2 = 0
                r3.f35134e = r2     // Catch:{ all -> 0x0020 }
                r3.f35135f = r2     // Catch:{ all -> 0x0020 }
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                if (r0 == 0) goto L_0x001a
                super.b(r0)
            L_0x001a:
                if (r1 == 0) goto L_0x001f
                super.d(r1)
            L_0x001f:
                return
            L_0x0020:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.l.a.j():void");
        }

        /* access modifiers changed from: protected */
        public v a() {
            return this.f35130a;
        }

        public void b(j1 j1Var) {
            o.p(j1Var, "status");
            synchronized (this) {
                if (this.f35132c.get() < 0) {
                    this.f35133d = j1Var;
                    this.f35132c.addAndGet(a.e.API_PRIORITY_OTHER);
                    if (this.f35132c.get() != 0) {
                        this.f35134e = j1Var;
                    } else {
                        super.b(j1Var);
                    }
                }
            }
        }

        public q c(z0<?, ?> z0Var, y0 y0Var, c cVar, k[] kVarArr) {
            Executor executor;
            dd.b c10 = cVar.c();
            if (c10 == null) {
                c10 = l.this.f35128b;
            } else if (l.this.f35128b != null) {
                c10 = new m(l.this.f35128b, c10);
            }
            if (c10 != null) {
                n1 n1Var = new n1(this.f35130a, z0Var, y0Var, cVar, this.f35136g, kVarArr);
                if (this.f35132c.incrementAndGet() > 0) {
                    this.f35136g.a();
                    return new f0(this.f35133d, kVarArr);
                }
                b bVar = new b(z0Var, cVar);
                try {
                    if (!(c10 instanceof l0) || !((l0) c10).a() || cVar.e() == null) {
                        executor = l.this.f35129c;
                    } else {
                        executor = cVar.e();
                    }
                    c10.a(bVar, executor, n1Var);
                } catch (Throwable th) {
                    n1Var.b(j1.f32241n.q("Credentials should use fail() instead of throwing exceptions").p(th));
                }
                return n1Var.d();
            } else if (this.f35132c.get() >= 0) {
                return new f0(this.f35133d, kVarArr);
            } else {
                return this.f35130a.c(z0Var, y0Var, cVar, kVarArr);
            }
        }

        public void d(j1 j1Var) {
            o.p(j1Var, "status");
            synchronized (this) {
                if (this.f35132c.get() < 0) {
                    this.f35133d = j1Var;
                    this.f35132c.addAndGet(a.e.API_PRIORITY_OTHER);
                } else if (this.f35135f != null) {
                    return;
                }
                if (this.f35132c.get() != 0) {
                    this.f35135f = j1Var;
                } else {
                    super.d(j1Var);
                }
            }
        }
    }

    l(t tVar, b bVar, Executor executor) {
        this.f35127a = (t) o.p(tVar, "delegate");
        this.f35128b = bVar;
        this.f35129c = (Executor) o.p(executor, "appExecutor");
    }

    public ScheduledExecutorService D0() {
        return this.f35127a.D0();
    }

    public v F0(SocketAddress socketAddress, t.a aVar, f fVar) {
        return new a(this.f35127a.F0(socketAddress, aVar, fVar), aVar.a());
    }

    public void close() {
        this.f35127a.close();
    }
}
