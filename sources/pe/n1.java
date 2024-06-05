package pe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import pe.z0;
import sd.w;
import ue.r0;
import ue.s0;
import ue.y;
import xd.g;

/* compiled from: EventLoop.common.kt */
public abstract class n1 extends o1 implements z0 {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37367f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37368g;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37369h;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    private final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private final o<w> f37370c;

        public a(long j10, o<? super w> oVar) {
            super(j10);
            this.f37370c = oVar;
        }

        public void run() {
            this.f37370c.j(n1.this, w.f38141a);
        }

        public String toString() {
            return super.toString() + this.f37370c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    private static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f37372c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f37372c = runnable;
        }

        public void run() {
            this.f37372c.run();
        }

        public String toString() {
            return super.toString() + this.f37372c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, i1, s0 {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f37373a;

        /* renamed from: b  reason: collision with root package name */
        private int f37374b = -1;

        public c(long j10) {
            this.f37373a = j10;
        }

        public r0<?> c() {
            Object obj = this._heap;
            if (obj instanceof r0) {
                return (r0) obj;
            }
            return null;
        }

        public void d(r0<?> r0Var) {
            if (this._heap != q1.f37385a) {
                this._heap = r0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj != q1.f37385a) {
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.g(this);
                    }
                    this._heap = q1.f37385a;
                    w wVar = w.f38141a;
                }
            }
        }

        public void e(int i10) {
            this.f37374b = i10;
        }

        public int f() {
            return this.f37374b;
        }

        /* renamed from: g */
        public int compareTo(c cVar) {
            int i10 = ((this.f37373a - cVar.f37373a) > 0 ? 1 : ((this.f37373a - cVar.f37373a) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public final int h(long j10, d dVar, n1 n1Var) {
            synchronized (this) {
                if (this._heap == q1.f37385a) {
                    return 2;
                }
                synchronized (dVar) {
                    c cVar = (c) dVar.b();
                    if (n1Var.h()) {
                        return 1;
                    }
                    if (cVar == null) {
                        dVar.f37375c = j10;
                    } else {
                        long j11 = cVar.f37373a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f37375c > 0) {
                            dVar.f37375c = j10;
                        }
                    }
                    long j12 = this.f37373a;
                    long j13 = dVar.f37375c;
                    if (j12 - j13 < 0) {
                        this.f37373a = j13;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean i(long j10) {
            return j10 - this.f37373a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f37373a + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class d extends r0<c> {

        /* renamed from: c  reason: collision with root package name */
        public long f37375c;

        public d(long j10) {
            this.f37375c = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<n1> cls2 = n1.class;
        f37367f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f37368g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
        f37369h = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleted");
    }

    private final void B1(boolean z10) {
        f37369h.set(this, z10 ? 1 : 0);
    }

    private final boolean C1(c cVar) {
        d dVar = (d) f37368g.get(this);
        return (dVar != null ? (c) dVar.e() : null) == cVar;
    }

    /* access modifiers changed from: private */
    public final boolean h() {
        return f37369h.get(this) != 0;
    }

    private final void r1() {
        if (!t0.a() || h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37367f;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    if (androidx.concurrent.futures.b.a(f37367f, this, (Object) null, q1.f37386b)) {
                        return;
                    }
                } else if (obj instanceof y) {
                    ((y) obj).d();
                    return;
                } else if (obj != q1.f37386b) {
                    y yVar = new y(8, true);
                    m.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    yVar.a((Runnable) obj);
                    if (androidx.concurrent.futures.b.a(f37367f, this, obj, yVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private final Runnable s1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37367f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof y) {
                m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                y yVar = (y) obj;
                Object j10 = yVar.j();
                if (j10 != y.f38866h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f37367f, this, obj, yVar.i());
            } else if (obj == q1.f37386b) {
                return null;
            } else {
                if (androidx.concurrent.futures.b.a(f37367f, this, obj, (Object) null)) {
                    m.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean u1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37367f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (h()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f37367f, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof y) {
                m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                y yVar = (y) obj;
                int a10 = yVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f37367f, this, obj, yVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == q1.f37386b) {
                return false;
            } else {
                y yVar2 = new y(8, true);
                m.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                yVar2.a((Runnable) obj);
                yVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f37367f, this, obj, yVar2)) {
                    return true;
                }
            }
        }
    }

    private final void w1() {
        c cVar;
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f37368g.get(this);
            if (dVar != null && (cVar = (c) dVar.i()) != null) {
                o1(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: pe.n1$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int z1(long r4, pe.n1.c r6) {
        /*
            r3 = this;
            boolean r0 = r3.h()
            if (r0 == 0) goto L_0x0008
            r4 = 1
            return r4
        L_0x0008:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f37368g
            java.lang.Object r1 = r0.get(r3)
            pe.n1$d r1 = (pe.n1.d) r1
            if (r1 != 0) goto L_0x0025
            r1 = 0
            pe.n1$d r2 = new pe.n1$d
            r2.<init>(r4)
            androidx.concurrent.futures.b.a(r0, r3, r1, r2)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.m.b(r0)
            r1 = r0
            pe.n1$d r1 = (pe.n1.d) r1
        L_0x0025:
            int r4 = r6.h(r4, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.n1.z1(long, pe.n1$c):int");
    }

    /* access modifiers changed from: protected */
    public final i1 A1(long j10, Runnable runnable) {
        long c10 = q1.c(j10);
        if (c10 >= 4611686018427387903L) {
            return r2.f37394a;
        }
        c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c10 + nanoTime, runnable);
        y1(nanoTime, bVar);
        return bVar;
    }

    public i1 C0(long j10, Runnable runnable, g gVar) {
        return z0.a.a(this, j10, runnable, gVar);
    }

    public final void X0(g gVar, Runnable runnable) {
        t1(runnable);
    }

    /* access modifiers changed from: protected */
    public long f1() {
        c cVar;
        if (super.f1() == 0) {
            return 0;
        }
        Object obj = f37367f.get(this);
        if (obj != null) {
            if (obj instanceof y) {
                if (!((y) obj).g()) {
                    return 0;
                }
            } else if (obj == q1.f37386b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        d dVar = (d) f37368g.get(this);
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f37373a;
        c.a();
        return i.b(j10 - System.nanoTime(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long k1() {
        /*
            r9 = this;
            boolean r0 = r9.l1()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f37368g
            java.lang.Object r0 = r0.get(r9)
            pe.n1$d r0 = (pe.n1.d) r0
            if (r0 == 0) goto L_0x0049
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0049
            pe.c.a()
            long r3 = java.lang.System.nanoTime()
        L_0x0020:
            monitor-enter(r0)
            ue.s0 r5 = r0.b()     // Catch:{ all -> 0x0046 }
            r6 = 0
            if (r5 != 0) goto L_0x002a
            monitor-exit(r0)
            goto L_0x0041
        L_0x002a:
            pe.n1$c r5 = (pe.n1.c) r5     // Catch:{ all -> 0x0046 }
            boolean r7 = r5.i(r3)     // Catch:{ all -> 0x0046 }
            r8 = 0
            if (r7 == 0) goto L_0x0038
            boolean r5 = r9.u1(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            ue.s0 r5 = r0.h(r8)     // Catch:{ all -> 0x0046 }
            r6 = r5
        L_0x0040:
            monitor-exit(r0)
        L_0x0041:
            pe.n1$c r6 = (pe.n1.c) r6
            if (r6 != 0) goto L_0x0020
            goto L_0x0049
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0049:
            java.lang.Runnable r0 = r9.s1()
            if (r0 == 0) goto L_0x0053
            r0.run()
            return r1
        L_0x0053:
            long r0 = r9.f1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.n1.k1():long");
    }

    public void q(long j10, o<? super w> oVar) {
        long c10 = q1.c(j10);
        if (c10 < 4611686018427387903L) {
            c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, oVar);
            y1(nanoTime, aVar);
            r.a(oVar, aVar);
        }
    }

    public void shutdown() {
        b3.f37276a.c();
        B1(true);
        r1();
        do {
        } while (k1() <= 0);
        w1();
    }

    public void t1(Runnable runnable) {
        if (u1(runnable)) {
            p1();
        } else {
            v0.f37406i.t1(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean v1() {
        if (!j1()) {
            return false;
        }
        d dVar = (d) f37368g.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = f37367f.get(this);
        if (obj != null) {
            if (obj instanceof y) {
                return ((y) obj).g();
            }
            if (obj == q1.f37386b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void x1() {
        f37367f.set(this, (Object) null);
        f37368g.set(this, (Object) null);
    }

    public final void y1(long j10, c cVar) {
        int z12 = z1(j10, cVar);
        if (z12 != 0) {
            if (z12 == 1) {
                o1(j10, cVar);
            } else if (z12 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (C1(cVar)) {
            p1();
        }
    }
}
