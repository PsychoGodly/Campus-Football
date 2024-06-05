package io.grpc.internal;

import androidx.recyclerview.widget.RecyclerView;
import dd.j1;
import dd.k;
import dd.n1;
import dd.y0;
import dd.z0;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RetriableStream */
abstract class z1<ReqT> implements q {
    static final y0.g<String> A;
    static final y0.g<String> B;
    /* access modifiers changed from: private */
    public static final j1 C = j1.f32234g.q("Stream thrown away because RetriableStream committed");
    /* access modifiers changed from: private */
    public static Random D = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final z0<ReqT, ?> f35554a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f35555b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f35556c = new n1(new a());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f35557d;

    /* renamed from: e  reason: collision with root package name */
    private final y0 f35558e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a2 f35559f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final t0 f35560g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final boolean f35561h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Object f35562i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final t f35563j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final long f35564k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f35565l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final c0 f35566m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final x0 f35567n = new x0();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public volatile z f35568o = new z(new ArrayList(8), Collections.emptyList(), (Collection<b0>) null, (b0) null, false, false, false, 0);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final AtomicBoolean f35569p = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final AtomicInteger f35570q = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final AtomicInteger f35571r = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public j1 f35572s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public long f35573t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public r f35574u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public u f35575v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public u f35576w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public long f35577x;

    /* renamed from: y  reason: collision with root package name */
    private j1 f35578y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public boolean f35579z;

    /* compiled from: RetriableStream */
    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            throw j1.k(th).q("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    /* compiled from: RetriableStream */
    private final class a0 implements r {

        /* renamed from: a  reason: collision with root package name */
        final b0 f35581a;

        /* compiled from: RetriableStream */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y0 f35583a;

            a(y0 y0Var) {
                this.f35583a = y0Var;
            }

            public void run() {
                z1.this.f35574u.b(this.f35583a);
            }
        }

        /* compiled from: RetriableStream */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0 f35585a;

            /* compiled from: RetriableStream */
            class a implements Runnable {
                a() {
                }

                public void run() {
                    b bVar = b.this;
                    z1.this.f0(bVar.f35585a);
                }
            }

            b(b0 b0Var) {
                this.f35585a = b0Var;
            }

            public void run() {
                z1.this.f35555b.execute(new a());
            }
        }

        /* compiled from: RetriableStream */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0 f35588a;

            c(b0 b0Var) {
                this.f35588a = b0Var;
            }

            public void run() {
                z1.this.f0(this.f35588a);
            }
        }

        /* compiled from: RetriableStream */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k2.a f35590a;

            d(k2.a aVar) {
                this.f35590a = aVar;
            }

            public void run() {
                z1.this.f35574u.a(this.f35590a);
            }
        }

        /* compiled from: RetriableStream */
        class e implements Runnable {
            e() {
            }

            public void run() {
                if (!z1.this.f35579z) {
                    z1.this.f35574u.c();
                }
            }
        }

        a0(b0 b0Var) {
            this.f35581a = b0Var;
        }

        private Integer e(y0 y0Var) {
            String str = (String) y0Var.g(z1.B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private v f(j1 j1Var, y0 y0Var) {
            Integer e10 = e(y0Var);
            boolean z10 = true;
            boolean z11 = !z1.this.f35560g.f35388c.contains(j1Var.m());
            boolean z12 = (z1.this.f35566m == null || (z11 && (e10 == null || e10.intValue() >= 0))) ? false : !z1.this.f35566m.b();
            if (z11 || z12) {
                z10 = false;
            }
            return new v(z10, e10);
        }

        private x g(j1 j1Var, y0 y0Var) {
            long j10 = 0;
            boolean z10 = false;
            if (z1.this.f35559f == null) {
                return new x(false, 0);
            }
            boolean contains = z1.this.f35559f.f34736f.contains(j1Var.m());
            Integer e10 = e(y0Var);
            boolean z11 = (z1.this.f35566m == null || (!contains && (e10 == null || e10.intValue() >= 0))) ? false : !z1.this.f35566m.b();
            if (z1.this.f35559f.f34731a > this.f35581a.f35598d + 1 && !z11) {
                if (e10 == null) {
                    if (contains) {
                        j10 = (long) (((double) z1.this.f35577x) * z1.D.nextDouble());
                        z1 z1Var = z1.this;
                        long unused = z1Var.f35577x = Math.min((long) (((double) z1Var.f35577x) * z1.this.f35559f.f34734d), z1.this.f35559f.f34733c);
                    }
                } else if (e10.intValue() >= 0) {
                    j10 = TimeUnit.MILLISECONDS.toNanos((long) e10.intValue());
                    z1 z1Var2 = z1.this;
                    long unused2 = z1Var2.f35577x = z1Var2.f35559f.f34732b;
                }
                z10 = true;
            }
            return new x(z10, j10);
        }

        public void a(k2.a aVar) {
            z P = z1.this.f35568o;
            r6.o.v(P.f35655f != null, "Headers should be received prior to messages.");
            if (P.f35655f == this.f35581a) {
                z1.this.f35556c.execute(new d(aVar));
            }
        }

        public void b(y0 y0Var) {
            z1.this.c0(this.f35581a);
            if (z1.this.f35568o.f35655f == this.f35581a) {
                if (z1.this.f35566m != null) {
                    z1.this.f35566m.c();
                }
                z1.this.f35556c.execute(new a(y0Var));
            }
        }

        public void c() {
            if (z1.this.isReady()) {
                z1.this.f35556c.execute(new e());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0123, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(dd.j1 r6, io.grpc.internal.r.a r7, dd.y0 r8) {
            /*
                r5 = this;
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                java.lang.Object r0 = r0.f35562i
                monitor-enter(r0)
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0201 }
                io.grpc.internal.z1$z r2 = r1.f35568o     // Catch:{ all -> 0x0201 }
                io.grpc.internal.z1$b0 r3 = r5.f35581a     // Catch:{ all -> 0x0201 }
                io.grpc.internal.z1$z r2 = r2.g(r3)     // Catch:{ all -> 0x0201 }
                io.grpc.internal.z1.z unused = r1.f35568o = r2     // Catch:{ all -> 0x0201 }
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0201 }
                io.grpc.internal.x0 r1 = r1.f35567n     // Catch:{ all -> 0x0201 }
                dd.j1$b r2 = r6.m()     // Catch:{ all -> 0x0201 }
                r1.a(r2)     // Catch:{ all -> 0x0201 }
                monitor-exit(r0)     // Catch:{ all -> 0x0201 }
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f35571r
                int r0 = r0.decrementAndGet()
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r1) goto L_0x0043
                io.grpc.internal.z1 r6 = io.grpc.internal.z1.this
                dd.j1 r7 = r6.f35572s
                io.grpc.internal.r$a r8 = io.grpc.internal.r.a.PROCESSED
                dd.y0 r0 = new dd.y0
                r0.<init>()
                r6.m0(r7, r8, r0)
                return
            L_0x0043:
                io.grpc.internal.z1$b0 r0 = r5.f35581a
                boolean r1 = r0.f35597c
                if (r1 == 0) goto L_0x0060
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                r1.c0(r0)
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$z r0 = r0.f35568o
                io.grpc.internal.z1$b0 r0 = r0.f35655f
                io.grpc.internal.z1$b0 r1 = r5.f35581a
                if (r0 != r1) goto L_0x005f
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                r0.m0(r6, r7, r8)
            L_0x005f:
                return
            L_0x0060:
                io.grpc.internal.r$a r0 = io.grpc.internal.r.a.MISCARRIED
                if (r7 != r0) goto L_0x009b
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f35570q
                int r1 = r1.incrementAndGet()
                r2 = 1000(0x3e8, float:1.401E-42)
                if (r1 <= r2) goto L_0x009b
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$b0 r1 = r5.f35581a
                r0.c0(r1)
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$z r0 = r0.f35568o
                io.grpc.internal.z1$b0 r0 = r0.f35655f
                io.grpc.internal.z1$b0 r1 = r5.f35581a
                if (r0 != r1) goto L_0x009a
                dd.j1 r0 = dd.j1.f32247t
                java.lang.String r1 = "Too many transparent retries. Might be a bug in gRPC"
                dd.j1 r0 = r0.q(r1)
                dd.l1 r6 = r6.d()
                dd.j1 r6 = r0.p(r6)
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                r0.m0(r6, r7, r8)
            L_0x009a:
                return
            L_0x009b:
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                io.grpc.internal.z1$z r1 = r1.f35568o
                io.grpc.internal.z1$b0 r1 = r1.f35655f
                if (r1 != 0) goto L_0x01e8
                r1 = 0
                r2 = 1
                if (r7 == r0) goto L_0x0170
                io.grpc.internal.r$a r0 = io.grpc.internal.r.a.REFUSED
                if (r7 != r0) goto L_0x00bb
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f35569p
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x00bb
                goto L_0x0170
            L_0x00bb:
                io.grpc.internal.r$a r0 = io.grpc.internal.r.a.DROPPED
                if (r7 != r0) goto L_0x00ce
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                boolean r0 = r0.f35561h
                if (r0 == 0) goto L_0x01e8
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                r0.g0()
                goto L_0x01e8
            L_0x00ce:
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f35569p
                r0.set(r2)
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                boolean r0 = r0.f35561h
                if (r0 == 0) goto L_0x012a
                io.grpc.internal.z1$v r0 = r5.f(r6, r8)
                boolean r1 = r0.f35641a
                if (r1 == 0) goto L_0x00ee
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                java.lang.Integer r2 = r0.f35642b
                r1.l0(r2)
            L_0x00ee:
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                java.lang.Object r3 = r1.f35562i
                monitor-enter(r3)
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0127 }
                io.grpc.internal.z1$z r2 = r1.f35568o     // Catch:{ all -> 0x0127 }
                io.grpc.internal.z1$b0 r4 = r5.f35581a     // Catch:{ all -> 0x0127 }
                io.grpc.internal.z1$z r2 = r2.e(r4)     // Catch:{ all -> 0x0127 }
                io.grpc.internal.z1.z unused = r1.f35568o = r2     // Catch:{ all -> 0x0127 }
                boolean r0 = r0.f35641a     // Catch:{ all -> 0x0127 }
                if (r0 == 0) goto L_0x0124
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0127 }
                io.grpc.internal.z1$z r1 = r0.f35568o     // Catch:{ all -> 0x0127 }
                boolean r0 = r0.h0(r1)     // Catch:{ all -> 0x0127 }
                if (r0 != 0) goto L_0x0122
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0127 }
                io.grpc.internal.z1$z r0 = r0.f35568o     // Catch:{ all -> 0x0127 }
                java.util.Collection<io.grpc.internal.z1$b0> r0 = r0.f35653d     // Catch:{ all -> 0x0127 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0127 }
                if (r0 != 0) goto L_0x0124
            L_0x0122:
                monitor-exit(r3)     // Catch:{ all -> 0x0127 }
                return
            L_0x0124:
                monitor-exit(r3)     // Catch:{ all -> 0x0127 }
                goto L_0x01e8
            L_0x0127:
                r6 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0127 }
                throw r6
            L_0x012a:
                io.grpc.internal.z1$x r0 = r5.g(r6, r8)
                boolean r3 = r0.f35647a
                if (r3 == 0) goto L_0x01e8
                io.grpc.internal.z1 r6 = io.grpc.internal.z1.this
                io.grpc.internal.z1$b0 r7 = r5.f35581a
                int r7 = r7.f35598d
                int r7 = r7 + r2
                io.grpc.internal.z1$b0 r6 = r6.d0(r7, r1)
                if (r6 != 0) goto L_0x0140
                return
            L_0x0140:
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                java.lang.Object r1 = r7.f35562i
                monitor-enter(r1)
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this     // Catch:{ all -> 0x016d }
                io.grpc.internal.z1$u r8 = new io.grpc.internal.z1$u     // Catch:{ all -> 0x016d }
                java.lang.Object r2 = r7.f35562i     // Catch:{ all -> 0x016d }
                r8.<init>(r2)     // Catch:{ all -> 0x016d }
                io.grpc.internal.z1.u unused = r7.f35575v = r8     // Catch:{ all -> 0x016d }
                monitor-exit(r1)     // Catch:{ all -> 0x016d }
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                java.util.concurrent.ScheduledExecutorService r7 = r7.f35557d
                io.grpc.internal.z1$a0$b r1 = new io.grpc.internal.z1$a0$b
                r1.<init>(r6)
                long r2 = r0.f35648b
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
                java.util.concurrent.ScheduledFuture r6 = r7.schedule(r1, r2, r6)
                r8.c(r6)
                return
            L_0x016d:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x016d }
                throw r6
            L_0x0170:
                io.grpc.internal.z1 r6 = io.grpc.internal.z1.this
                io.grpc.internal.z1$b0 r7 = r5.f35581a
                int r7 = r7.f35598d
                io.grpc.internal.z1$b0 r6 = r6.d0(r7, r2)
                if (r6 != 0) goto L_0x017d
                return
            L_0x017d:
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                boolean r7 = r7.f35561h
                if (r7 == 0) goto L_0x01c2
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                java.lang.Object r7 = r7.f35562i
                monitor-enter(r7)
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1$z r0 = r8.f35568o     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1$b0 r3 = r5.f35581a     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1$z r0 = r0.f(r3, r6)     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1.z unused = r8.f35568o = r0     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1$z r0 = r8.f35568o     // Catch:{ all -> 0x01bf }
                boolean r8 = r8.h0(r0)     // Catch:{ all -> 0x01bf }
                if (r8 != 0) goto L_0x01b6
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch:{ all -> 0x01bf }
                io.grpc.internal.z1$z r8 = r8.f35568o     // Catch:{ all -> 0x01bf }
                java.util.Collection<io.grpc.internal.z1$b0> r8 = r8.f35653d     // Catch:{ all -> 0x01bf }
                int r8 = r8.size()     // Catch:{ all -> 0x01bf }
                if (r8 != r2) goto L_0x01b6
                r1 = 1
            L_0x01b6:
                monitor-exit(r7)     // Catch:{ all -> 0x01bf }
                if (r1 == 0) goto L_0x01d9
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                r7.c0(r6)
                goto L_0x01d9
            L_0x01bf:
                r6 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x01bf }
                throw r6
            L_0x01c2:
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                io.grpc.internal.a2 r7 = r7.f35559f
                if (r7 == 0) goto L_0x01d4
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                io.grpc.internal.a2 r7 = r7.f35559f
                int r7 = r7.f34731a
                if (r7 != r2) goto L_0x01d9
            L_0x01d4:
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                r7.c0(r6)
            L_0x01d9:
                io.grpc.internal.z1 r7 = io.grpc.internal.z1.this
                java.util.concurrent.Executor r7 = r7.f35555b
                io.grpc.internal.z1$a0$c r8 = new io.grpc.internal.z1$a0$c
                r8.<init>(r6)
                r7.execute(r8)
                return
            L_0x01e8:
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$b0 r1 = r5.f35581a
                r0.c0(r1)
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$z r0 = r0.f35568o
                io.grpc.internal.z1$b0 r0 = r0.f35655f
                io.grpc.internal.z1$b0 r1 = r5.f35581a
                if (r0 != r1) goto L_0x0200
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                r0.m0(r6, r7, r8)
            L_0x0200:
                return
            L_0x0201:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0201 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.a0.d(dd.j1, io.grpc.internal.r$a, dd.y0):void");
        }
    }

    /* compiled from: RetriableStream */
    class b implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35593a;

        b(String str) {
            this.f35593a = str;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.m(this.f35593a);
        }
    }

    /* compiled from: RetriableStream */
    private static final class b0 {

        /* renamed from: a  reason: collision with root package name */
        q f35595a;

        /* renamed from: b  reason: collision with root package name */
        boolean f35596b;

        /* renamed from: c  reason: collision with root package name */
        boolean f35597c;

        /* renamed from: d  reason: collision with root package name */
        final int f35598d;

        b0(int i10) {
            this.f35598d = i10;
        }
    }

    /* compiled from: RetriableStream */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f35599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f35600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Future f35601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Future f35602d;

        c(Collection collection, b0 b0Var, Future future, Future future2) {
            this.f35599a = collection;
            this.f35600b = b0Var;
            this.f35601c = future;
            this.f35602d = future2;
        }

        public void run() {
            for (b0 b0Var : this.f35599a) {
                if (b0Var != this.f35600b) {
                    b0Var.f35595a.b(z1.C);
                }
            }
            Future future = this.f35601c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f35602d;
            if (future2 != null) {
                future2.cancel(false);
            }
            z1.this.j0();
        }
    }

    /* compiled from: RetriableStream */
    static final class c0 {

        /* renamed from: a  reason: collision with root package name */
        final int f35604a;

        /* renamed from: b  reason: collision with root package name */
        final int f35605b;

        /* renamed from: c  reason: collision with root package name */
        final int f35606c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f35607d;

        c0(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f35607d = atomicInteger;
            this.f35606c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f35604a = i10;
            this.f35605b = i10 / 2;
            atomicInteger.set(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f35607d.get() > this.f35605b;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10;
            int i11;
            do {
                i10 = this.f35607d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f35607d.compareAndSet(i10, Math.max(i11, 0)));
            if (i11 > this.f35605b) {
                return true;
            }
            return false;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        void c() {
            /*
                r4 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicInteger r0 = r4.f35607d
                int r0 = r0.get()
                int r1 = r4.f35604a
                if (r0 != r1) goto L_0x000b
                goto L_0x001a
            L_0x000b:
                int r2 = r4.f35606c
                int r2 = r2 + r0
                java.util.concurrent.atomic.AtomicInteger r3 = r4.f35607d
                int r1 = java.lang.Math.min(r2, r1)
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.c0.c():void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            if (this.f35604a == c0Var.f35604a && this.f35606c == c0Var.f35606c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return r6.k.b(Integer.valueOf(this.f35604a), Integer.valueOf(this.f35606c));
        }
    }

    /* compiled from: RetriableStream */
    class d implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dd.n f35608a;

        d(dd.n nVar) {
            this.f35608a = nVar;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.a(this.f35608a);
        }
    }

    /* compiled from: RetriableStream */
    class e implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dd.t f35610a;

        e(dd.t tVar) {
            this.f35610a = tVar;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.k(this.f35610a);
        }
    }

    /* compiled from: RetriableStream */
    class f implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dd.v f35612a;

        f(dd.v vVar) {
            this.f35612a = vVar;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.l(this.f35612a);
        }
    }

    /* compiled from: RetriableStream */
    class g implements r {
        g() {
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.flush();
        }
    }

    /* compiled from: RetriableStream */
    class h implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f35615a;

        h(boolean z10) {
            this.f35615a = z10;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.r(this.f35615a);
        }
    }

    /* compiled from: RetriableStream */
    class i implements r {
        i() {
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.o();
        }
    }

    /* compiled from: RetriableStream */
    class j implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35618a;

        j(int i10) {
            this.f35618a = i10;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.i(this.f35618a);
        }
    }

    /* compiled from: RetriableStream */
    class k implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35620a;

        k(int i10) {
            this.f35620a = i10;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.j(this.f35620a);
        }
    }

    /* compiled from: RetriableStream */
    class l implements r {
        l() {
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.d();
        }
    }

    /* compiled from: RetriableStream */
    class m implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35623a;

        m(int i10) {
            this.f35623a = i10;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.h(this.f35623a);
        }
    }

    /* compiled from: RetriableStream */
    class n implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35625a;

        n(Object obj) {
            this.f35625a = obj;
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.c(z1.this.f35554a.j(this.f35625a));
            b0Var.f35595a.flush();
        }
    }

    /* compiled from: RetriableStream */
    class o extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dd.k f35627a;

        o(dd.k kVar) {
            this.f35627a = kVar;
        }

        public dd.k a(k.b bVar, y0 y0Var) {
            return this.f35627a;
        }
    }

    /* compiled from: RetriableStream */
    class p implements Runnable {
        p() {
        }

        public void run() {
            if (!z1.this.f35579z) {
                z1.this.f35574u.c();
            }
        }
    }

    /* compiled from: RetriableStream */
    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f35630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r.a f35631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ y0 f35632c;

        q(j1 j1Var, r.a aVar, y0 y0Var) {
            this.f35630a = j1Var;
            this.f35631b = aVar;
            this.f35632c = y0Var;
        }

        public void run() {
            boolean unused = z1.this.f35579z = true;
            z1.this.f35574u.d(this.f35630a, this.f35631b, this.f35632c);
        }
    }

    /* compiled from: RetriableStream */
    private interface r {
        void a(b0 b0Var);
    }

    /* compiled from: RetriableStream */
    class s extends dd.k {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f35634a;

        /* renamed from: b  reason: collision with root package name */
        long f35635b;

        s(b0 b0Var) {
            this.f35634a = b0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
            r0.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(long r8) {
            /*
                r7 = this;
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$z r0 = r0.f35568o
                io.grpc.internal.z1$b0 r0 = r0.f35655f
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                r0 = 0
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                java.lang.Object r1 = r1.f35562i
                monitor-enter(r1)
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1$z r2 = r2.f35568o     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1$b0 r2 = r2.f35655f     // Catch:{ all -> 0x0084 }
                if (r2 != 0) goto L_0x0082
                io.grpc.internal.z1$b0 r2 = r7.f35634a     // Catch:{ all -> 0x0084 }
                boolean r2 = r2.f35596b     // Catch:{ all -> 0x0084 }
                if (r2 == 0) goto L_0x0024
                goto L_0x0082
            L_0x0024:
                long r2 = r7.f35635b     // Catch:{ all -> 0x0084 }
                long r2 = r2 + r8
                r7.f35635b = r2     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                long r8 = r8.f35573t     // Catch:{ all -> 0x0084 }
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 > 0) goto L_0x0035
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                return
            L_0x0035:
                long r8 = r7.f35635b     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                long r2 = r2.f35564k     // Catch:{ all -> 0x0084 }
                r4 = 1
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x0047
                io.grpc.internal.z1$b0 r8 = r7.f35634a     // Catch:{ all -> 0x0084 }
                r8.f35597c = r4     // Catch:{ all -> 0x0084 }
                goto L_0x006f
            L_0x0047:
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1$t r8 = r8.f35563j     // Catch:{ all -> 0x0084 }
                long r2 = r7.f35635b     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r9 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                long r5 = r9.f35573t     // Catch:{ all -> 0x0084 }
                long r2 = r2 - r5
                long r8 = r8.a(r2)     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                long r5 = r7.f35635b     // Catch:{ all -> 0x0084 }
                long unused = r2.f35573t = r5     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                long r2 = r2.f35565l     // Catch:{ all -> 0x0084 }
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x006f
                io.grpc.internal.z1$b0 r8 = r7.f35634a     // Catch:{ all -> 0x0084 }
                r8.f35597c = r4     // Catch:{ all -> 0x0084 }
            L_0x006f:
                io.grpc.internal.z1$b0 r8 = r7.f35634a     // Catch:{ all -> 0x0084 }
                boolean r9 = r8.f35597c     // Catch:{ all -> 0x0084 }
                if (r9 == 0) goto L_0x007b
                io.grpc.internal.z1 r9 = io.grpc.internal.z1.this     // Catch:{ all -> 0x0084 }
                java.lang.Runnable r0 = r9.b0(r8)     // Catch:{ all -> 0x0084 }
            L_0x007b:
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                if (r0 == 0) goto L_0x0081
                r0.run()
            L_0x0081:
                return
            L_0x0082:
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                return
            L_0x0084:
                r8 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.s.h(long):void");
        }
    }

    /* compiled from: RetriableStream */
    static final class t {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicLong f35637a = new AtomicLong();

        t() {
        }

        /* access modifiers changed from: package-private */
        public long a(long j10) {
            return this.f35637a.addAndGet(j10);
        }
    }

    /* compiled from: RetriableStream */
    private static final class u {

        /* renamed from: a  reason: collision with root package name */
        final Object f35638a;

        /* renamed from: b  reason: collision with root package name */
        Future<?> f35639b;

        /* renamed from: c  reason: collision with root package name */
        boolean f35640c;

        u(Object obj) {
            this.f35638a = obj;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f35640c;
        }

        /* access modifiers changed from: package-private */
        public Future<?> b() {
            this.f35640c = true;
            return this.f35639b;
        }

        /* access modifiers changed from: package-private */
        public void c(Future<?> future) {
            synchronized (this.f35638a) {
                if (!this.f35640c) {
                    this.f35639b = future;
                }
            }
        }
    }

    /* compiled from: RetriableStream */
    private static final class v {

        /* renamed from: a  reason: collision with root package name */
        final boolean f35641a;

        /* renamed from: b  reason: collision with root package name */
        final Integer f35642b;

        public v(boolean z10, Integer num) {
            this.f35641a = z10;
            this.f35642b = num;
        }
    }

    /* compiled from: RetriableStream */
    private final class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final u f35643a;

        /* compiled from: RetriableStream */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0 f35645a;

            a(b0 b0Var) {
                this.f35645a = b0Var;
            }

            public void run() {
                u uVar;
                boolean z10;
                synchronized (z1.this.f35562i) {
                    uVar = null;
                    z10 = false;
                    if (w.this.f35643a.a()) {
                        z10 = true;
                    } else {
                        z1 z1Var = z1.this;
                        z unused = z1Var.f35568o = z1Var.f35568o.a(this.f35645a);
                        z1 z1Var2 = z1.this;
                        if (!z1Var2.h0(z1Var2.f35568o) || (z1.this.f35566m != null && !z1.this.f35566m.a())) {
                            z1 z1Var3 = z1.this;
                            z unused2 = z1Var3.f35568o = z1Var3.f35568o.d();
                            u unused3 = z1.this.f35576w = null;
                        } else {
                            z1 z1Var4 = z1.this;
                            uVar = new u(z1Var4.f35562i);
                            u unused4 = z1Var4.f35576w = uVar;
                        }
                    }
                }
                if (z10) {
                    this.f35645a.f35595a.b(j1.f32234g.q("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.c(z1.this.f35557d.schedule(new w(uVar), z1.this.f35560g.f35387b, TimeUnit.NANOSECONDS));
                }
                z1.this.f0(this.f35645a);
            }
        }

        w(u uVar) {
            this.f35643a = uVar;
        }

        public void run() {
            z1 z1Var = z1.this;
            b0 V = z1Var.d0(z1Var.f35568o.f35654e, false);
            if (V != null) {
                z1.this.f35555b.execute(new a(V));
            }
        }
    }

    /* compiled from: RetriableStream */
    private static final class x {

        /* renamed from: a  reason: collision with root package name */
        final boolean f35647a;

        /* renamed from: b  reason: collision with root package name */
        final long f35648b;

        x(boolean z10, long j10) {
            this.f35647a = z10;
            this.f35648b = j10;
        }
    }

    /* compiled from: RetriableStream */
    class y implements r {
        y() {
        }

        public void a(b0 b0Var) {
            b0Var.f35595a.q(new a0(b0Var));
        }
    }

    /* compiled from: RetriableStream */
    private static final class z {

        /* renamed from: a  reason: collision with root package name */
        final boolean f35650a;

        /* renamed from: b  reason: collision with root package name */
        final List<r> f35651b;

        /* renamed from: c  reason: collision with root package name */
        final Collection<b0> f35652c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<b0> f35653d;

        /* renamed from: e  reason: collision with root package name */
        final int f35654e;

        /* renamed from: f  reason: collision with root package name */
        final b0 f35655f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f35656g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f35657h;

        z(List<r> list, Collection<b0> collection, Collection<b0> collection2, b0 b0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f35651b = list;
            this.f35652c = (Collection) r6.o.p(collection, "drainedSubstreams");
            this.f35655f = b0Var;
            this.f35653d = collection2;
            this.f35656g = z10;
            this.f35650a = z11;
            this.f35657h = z12;
            this.f35654e = i10;
            boolean z13 = false;
            r6.o.v(!z11 || list == null, "passThrough should imply buffer is null");
            r6.o.v(!z11 || b0Var != null, "passThrough should imply winningSubstream != null");
            r6.o.v(!z11 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f35596b), "passThrough should imply winningSubstream is drained");
            r6.o.v((!z10 || b0Var != null) ? true : z13, "cancelled should imply committed");
        }

        /* access modifiers changed from: package-private */
        public z a(b0 b0Var) {
            Collection collection;
            r6.o.v(!this.f35657h, "hedging frozen");
            r6.o.v(this.f35655f == null, "already committed");
            if (this.f35653d == null) {
                collection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f35653d);
                arrayList.add(b0Var);
                collection = Collections.unmodifiableCollection(arrayList);
            }
            return new z(this.f35651b, this.f35652c, collection, this.f35655f, this.f35656g, this.f35650a, this.f35657h, this.f35654e + 1);
        }

        /* access modifiers changed from: package-private */
        public z b() {
            return new z(this.f35651b, this.f35652c, this.f35653d, this.f35655f, true, this.f35650a, this.f35657h, this.f35654e);
        }

        /* access modifiers changed from: package-private */
        public z c(b0 b0Var) {
            boolean z10;
            Set set;
            List<r> list;
            r6.o.v(this.f35655f == null, "Already committed");
            List<r> list2 = this.f35651b;
            if (this.f35652c.contains(b0Var)) {
                list = null;
                set = Collections.singleton(b0Var);
                z10 = true;
            } else {
                list = list2;
                set = Collections.emptyList();
                z10 = false;
            }
            return new z(list, set, this.f35653d, b0Var, this.f35656g, z10, this.f35657h, this.f35654e);
        }

        /* access modifiers changed from: package-private */
        public z d() {
            if (this.f35657h) {
                return this;
            }
            return new z(this.f35651b, this.f35652c, this.f35653d, this.f35655f, this.f35656g, this.f35650a, true, this.f35654e);
        }

        /* access modifiers changed from: package-private */
        public z e(b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f35653d);
            arrayList.remove(b0Var);
            return new z(this.f35651b, this.f35652c, Collections.unmodifiableCollection(arrayList), this.f35655f, this.f35656g, this.f35650a, this.f35657h, this.f35654e);
        }

        /* access modifiers changed from: package-private */
        public z f(b0 b0Var, b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f35653d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new z(this.f35651b, this.f35652c, Collections.unmodifiableCollection(arrayList), this.f35655f, this.f35656g, this.f35650a, this.f35657h, this.f35654e);
        }

        /* access modifiers changed from: package-private */
        public z g(b0 b0Var) {
            b0Var.f35596b = true;
            if (!this.f35652c.contains(b0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f35652c);
            arrayList.remove(b0Var);
            return new z(this.f35651b, Collections.unmodifiableCollection(arrayList), this.f35653d, this.f35655f, this.f35656g, this.f35650a, this.f35657h, this.f35654e);
        }

        /* access modifiers changed from: package-private */
        public z h(b0 b0Var) {
            Collection unmodifiableCollection;
            boolean z10 = true;
            r6.o.v(!this.f35650a, "Already passThrough");
            if (b0Var.f35596b) {
                unmodifiableCollection = this.f35652c;
            } else if (this.f35652c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f35652c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            b0 b0Var2 = this.f35655f;
            boolean z11 = b0Var2 != null;
            List<r> list = this.f35651b;
            if (z11) {
                if (b0Var2 != b0Var) {
                    z10 = false;
                }
                r6.o.v(z10, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.f35653d, this.f35655f, this.f35656g, z11, this.f35657h, this.f35654e);
        }
    }

    static {
        y0.d<String> dVar = y0.f32388e;
        A = y0.g.e("grpc-previous-rpc-attempts", dVar);
        B = y0.g.e("grpc-retry-pushback-ms", dVar);
    }

    z1(z0<ReqT, ?> z0Var, y0 y0Var, t tVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, a2 a2Var, t0 t0Var, c0 c0Var) {
        a2 a2Var2 = a2Var;
        t0 t0Var2 = t0Var;
        this.f35554a = z0Var;
        this.f35563j = tVar;
        this.f35564k = j10;
        this.f35565l = j11;
        this.f35555b = executor;
        this.f35557d = scheduledExecutorService;
        this.f35558e = y0Var;
        this.f35559f = a2Var2;
        if (a2Var2 != null) {
            this.f35577x = a2Var2.f34732b;
        }
        this.f35560g = t0Var2;
        boolean z10 = false;
        r6.o.e(a2Var2 == null || t0Var2 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f35561h = t0Var2 != null ? true : z10;
        this.f35566m = c0Var;
    }

    /* access modifiers changed from: private */
    public Runnable b0(b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f35562i) {
            if (this.f35568o.f35655f != null) {
                return null;
            }
            Collection<b0> collection = this.f35568o.f35652c;
            this.f35568o = this.f35568o.c(b0Var);
            this.f35563j.a(-this.f35573t);
            u uVar = this.f35575v;
            if (uVar != null) {
                Future<?> b10 = uVar.b();
                this.f35575v = null;
                future = b10;
            } else {
                future = null;
            }
            u uVar2 = this.f35576w;
            if (uVar2 != null) {
                Future<?> b11 = uVar2.b();
                this.f35576w = null;
                future2 = b11;
            } else {
                future2 = null;
            }
            c cVar = new c(collection, b0Var, future, future2);
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    public void c0(b0 b0Var) {
        Runnable b02 = b0(b0Var);
        if (b02 != null) {
            b02.run();
        }
    }

    /* access modifiers changed from: private */
    public b0 d0(int i10, boolean z10) {
        int i11;
        do {
            i11 = this.f35571r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f35571r.compareAndSet(i11, i11 + 1));
        b0 b0Var = new b0(i10);
        b0Var.f35595a = i0(o0(this.f35558e, i10), new o(new s(b0Var)), i10, z10);
        return b0Var;
    }

    private void e0(r rVar) {
        Collection<b0> collection;
        synchronized (this.f35562i) {
            if (!this.f35568o.f35650a) {
                this.f35568o.f35651b.add(rVar);
            }
            collection = this.f35568o.f35652c;
        }
        for (b0 a10 : collection) {
            rVar.a(a10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r2.hasNext() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0085, code lost:
        r4 = (io.grpc.internal.z1.r) r2.next();
        r4.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        if ((r4 instanceof io.grpc.internal.z1.y) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r1 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r4 = r8.f35568o;
        r5 = r4.f35655f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
        if (r5 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5 == r9) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        if (r4.f35656g == false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f0(io.grpc.internal.z1.b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L_0x0004:
            java.lang.Object r4 = r8.f35562i
            monitor-enter(r4)
            io.grpc.internal.z1$z r5 = r8.f35568o     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0019
            io.grpc.internal.z1$b0 r6 = r5.f35655f     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0013
            if (r6 == r9) goto L_0x0013
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0013:
            boolean r6 = r5.f35656g     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0019
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0019:
            java.util.List<io.grpc.internal.z1$r> r6 = r5.f35651b     // Catch:{ all -> 0x00a5 }
            int r6 = r6.size()     // Catch:{ all -> 0x00a5 }
            if (r2 != r6) goto L_0x004e
            io.grpc.internal.z1$z r0 = r5.h(r9)     // Catch:{ all -> 0x00a5 }
            r8.f35568o = r0     // Catch:{ all -> 0x00a5 }
            boolean r0 = r8.isReady()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x002f
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            return
        L_0x002f:
            io.grpc.internal.z1$p r0 = new io.grpc.internal.z1$p     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
        L_0x0035:
            if (r0 == 0) goto L_0x003d
            java.util.concurrent.Executor r9 = r8.f35556c
            r9.execute(r0)
            return
        L_0x003d:
            io.grpc.internal.q r0 = r9.f35595a
            io.grpc.internal.z1$z r1 = r8.f35568o
            io.grpc.internal.z1$b0 r1 = r1.f35655f
            if (r1 != r9) goto L_0x0048
            dd.j1 r9 = r8.f35578y
            goto L_0x004a
        L_0x0048:
            dd.j1 r9 = C
        L_0x004a:
            r0.b(r9)
            return
        L_0x004e:
            boolean r6 = r9.f35596b     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0054
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            return
        L_0x0054:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.z1$r> r7 = r5.f35651b     // Catch:{ all -> 0x00a5 }
            int r7 = r7.size()     // Catch:{ all -> 0x00a5 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x006e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a5 }
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f35651b     // Catch:{ all -> 0x00a5 }
            java.util.List r2 = r5.subList(r2, r6)     // Catch:{ all -> 0x00a5 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x007a
        L_0x006e:
            r3.clear()     // Catch:{ all -> 0x00a5 }
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f35651b     // Catch:{ all -> 0x00a5 }
            java.util.List r2 = r5.subList(r2, r6)     // Catch:{ all -> 0x00a5 }
            r3.addAll(r2)     // Catch:{ all -> 0x00a5 }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = r3.iterator()
        L_0x007f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00a2
            java.lang.Object r4 = r2.next()
            io.grpc.internal.z1$r r4 = (io.grpc.internal.z1.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.z1.y
            if (r4 == 0) goto L_0x0093
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x007f
            io.grpc.internal.z1$z r4 = r8.f35568o
            io.grpc.internal.z1$b0 r5 = r4.f35655f
            if (r5 == 0) goto L_0x009e
            if (r5 == r9) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            boolean r4 = r4.f35656g
            if (r4 == 0) goto L_0x007f
        L_0x00a2:
            r2 = r6
            goto L_0x0004
        L_0x00a5:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.f0(io.grpc.internal.z1$b0):void");
    }

    /* access modifiers changed from: private */
    public void g0() {
        Future<?> future;
        synchronized (this.f35562i) {
            u uVar = this.f35576w;
            future = null;
            if (uVar != null) {
                Future<?> b10 = uVar.b();
                this.f35576w = null;
                future = b10;
            }
            this.f35568o = this.f35568o.d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* access modifiers changed from: private */
    public boolean h0(z zVar) {
        return zVar.f35655f == null && zVar.f35654e < this.f35560g.f35386a && !zVar.f35657h;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1.cancel(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2.c(r5.f35557d.schedule(new io.grpc.internal.z1.w(r5, r2), (long) r6.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l0(java.lang.Integer r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r6.intValue()
            if (r0 >= 0) goto L_0x000d
            r5.g0()
            return
        L_0x000d:
            java.lang.Object r0 = r5.f35562i
            monitor-enter(r0)
            io.grpc.internal.z1$u r1 = r5.f35576w     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0016:
            java.util.concurrent.Future r1 = r1.b()     // Catch:{ all -> 0x0040 }
            io.grpc.internal.z1$u r2 = new io.grpc.internal.z1$u     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r5.f35562i     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            r5.f35576w = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r1.cancel(r0)
        L_0x002a:
            java.util.concurrent.ScheduledExecutorService r0 = r5.f35557d
            io.grpc.internal.z1$w r1 = new io.grpc.internal.z1$w
            r1.<init>(r2)
            int r6 = r6.intValue()
            long r3 = (long) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r6 = r0.schedule(r1, r3, r6)
            r2.c(r6)
            return
        L_0x0040:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.l0(java.lang.Integer):void");
    }

    /* access modifiers changed from: private */
    public void m0(j1 j1Var, r.a aVar, y0 y0Var) {
        this.f35556c.execute(new q(j1Var, aVar, y0Var));
    }

    public final void a(dd.n nVar) {
        e0(new d(nVar));
    }

    public final void b(j1 j1Var) {
        b0 b0Var = new b0(0);
        b0Var.f35595a = new o1();
        Runnable b02 = b0(b0Var);
        if (b02 != null) {
            this.f35572s = j1Var;
            b02.run();
            if (this.f35571r.addAndGet(RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE) {
                m0(j1Var, r.a.PROCESSED, new y0());
                return;
            }
            return;
        }
        b0 b0Var2 = null;
        synchronized (this.f35562i) {
            if (this.f35568o.f35652c.contains(this.f35568o.f35655f)) {
                b0Var2 = this.f35568o.f35655f;
            } else {
                this.f35578y = j1Var;
            }
            this.f35568o = this.f35568o.b();
        }
        if (b0Var2 != null) {
            b0Var2.f35595a.b(j1Var);
        }
    }

    public final void c(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public void d() {
        e0(new l());
    }

    public final void flush() {
        z zVar = this.f35568o;
        if (zVar.f35650a) {
            zVar.f35655f.f35595a.flush();
        } else {
            e0(new g());
        }
    }

    public final void h(int i10) {
        z zVar = this.f35568o;
        if (zVar.f35650a) {
            zVar.f35655f.f35595a.h(i10);
        } else {
            e0(new m(i10));
        }
    }

    public final void i(int i10) {
        e0(new j(i10));
    }

    /* access modifiers changed from: package-private */
    public abstract q i0(y0 y0Var, k.a aVar, int i10, boolean z10);

    public final boolean isReady() {
        for (b0 b0Var : this.f35568o.f35652c) {
            if (b0Var.f35595a.isReady()) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i10) {
        e0(new k(i10));
    }

    /* access modifiers changed from: package-private */
    public abstract void j0();

    public final void k(dd.t tVar) {
        e0(new e(tVar));
    }

    /* access modifiers changed from: package-private */
    public abstract j1 k0();

    public final void l(dd.v vVar) {
        e0(new f(vVar));
    }

    public final void m(String str) {
        e0(new b(str));
    }

    public void n(x0 x0Var) {
        z zVar;
        synchronized (this.f35562i) {
            x0Var.b("closed", this.f35567n);
            zVar = this.f35568o;
        }
        if (zVar.f35655f != null) {
            x0 x0Var2 = new x0();
            zVar.f35655f.f35595a.n(x0Var2);
            x0Var.b("committed", x0Var2);
            return;
        }
        x0 x0Var3 = new x0();
        for (b0 b0Var : zVar.f35652c) {
            x0 x0Var4 = new x0();
            b0Var.f35595a.n(x0Var4);
            x0Var3.a(x0Var4);
        }
        x0Var.b("open", x0Var3);
    }

    /* access modifiers changed from: package-private */
    public final void n0(ReqT reqt) {
        z zVar = this.f35568o;
        if (zVar.f35650a) {
            zVar.f35655f.f35595a.c(this.f35554a.j(reqt));
        } else {
            e0(new n(reqt));
        }
    }

    public final void o() {
        e0(new i());
    }

    /* access modifiers changed from: package-private */
    public final y0 o0(y0 y0Var, int i10) {
        y0 y0Var2 = new y0();
        y0Var2.m(y0Var);
        if (i10 > 0) {
            y0Var2.p(A, String.valueOf(i10));
        }
        return y0Var2;
    }

    public final void q(r rVar) {
        c0 c0Var;
        this.f35574u = rVar;
        j1 k02 = k0();
        if (k02 != null) {
            b(k02);
            return;
        }
        synchronized (this.f35562i) {
            this.f35568o.f35651b.add(new y());
        }
        b0 d02 = d0(0, false);
        if (d02 != null) {
            if (this.f35561h) {
                u uVar = null;
                synchronized (this.f35562i) {
                    this.f35568o = this.f35568o.a(d02);
                    if (h0(this.f35568o) && ((c0Var = this.f35566m) == null || c0Var.a())) {
                        uVar = new u(this.f35562i);
                        this.f35576w = uVar;
                    }
                }
                if (uVar != null) {
                    uVar.c(this.f35557d.schedule(new w(uVar), this.f35560g.f35387b, TimeUnit.NANOSECONDS));
                }
            }
            f0(d02);
        }
    }

    public final void r(boolean z10) {
        e0(new h(z10));
    }
}
