package we;

import com.google.android.gms.common.api.a;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import pe.t0;
import pe.u0;
import sd.w;
import ue.g0;
import ue.l0;

/* compiled from: CoroutineScheduler.kt */
public final class a implements Executor, Closeable {

    /* renamed from: i  reason: collision with root package name */
    public static final C0459a f39219i = new C0459a((h) null);

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f39220j = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f39221k = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39222l = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: m  reason: collision with root package name */
    public static final l0 f39223m = new l0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f39224a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39225b;

    /* renamed from: c  reason: collision with root package name */
    public final long f39226c;
    private volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f39227d;

    /* renamed from: f  reason: collision with root package name */
    public final d f39228f;

    /* renamed from: g  reason: collision with root package name */
    public final d f39229g;

    /* renamed from: h  reason: collision with root package name */
    public final g0<c> f39230h;
    private volatile long parkedWorkersStack;

    /* renamed from: we.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C0459a {
        private C0459a() {
        }

        public /* synthetic */ C0459a(h hVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39231a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                we.a$d[] r0 = we.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                we.a$d r1 = we.a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                we.a$d r1 = we.a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                we.a$d r1 = we.a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                we.a$d r1 = we.a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                we.a$d r1 = we.a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f39231a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: we.a.b.<clinit>():void");
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f39224a = i10;
        this.f39225b = i11;
        this.f39226c = j10;
        this.f39227d = str;
        boolean z10 = true;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 <= 0 ? false : z10) {
                        this.f39228f = new d();
                        this.f39229g = new d();
                        this.f39230h = new g0<>((i10 + 1) * 2);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    public static /* synthetic */ void B(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f39266g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.A(runnable, iVar, z10);
    }

    private final int J(c cVar) {
        Object i10 = cVar.i();
        while (i10 != f39223m) {
            if (i10 == null) {
                return 0;
            }
            c cVar2 = (c) i10;
            int h10 = cVar2.h();
            if (h10 != 0) {
                return h10;
            }
            i10 = cVar2.i();
        }
        return -1;
    }

    private final c L() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39220j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.f39230h.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & -2097152;
            int J = J(b10);
            if (J >= 0) {
                if (f39220j.compareAndSet(this, j10, ((long) J) | j11)) {
                    b10.r(f39223m);
                    return b10;
                }
            }
        }
    }

    private final void h0(long j10, boolean z10) {
        if (!z10 && !w0() && !u0(j10)) {
            w0();
        }
    }

    private final boolean i(h hVar) {
        boolean z10 = true;
        if (hVar.f39257b.b() != 1) {
            z10 = false;
        }
        if (z10) {
            return this.f39229g.a(hVar);
        }
        return this.f39228f.a(hVar);
    }

    private final int n() {
        synchronized (this.f39230h) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f39221k;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            boolean z10 = false;
            int a10 = i.a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (a10 >= this.f39224a) {
                return 0;
            }
            if (i10 >= this.f39225b) {
                return 0;
            }
            int i11 = ((int) (f39221k.get(this) & 2097151)) + 1;
            if (i11 > 0 && this.f39230h.b(i11) == null) {
                c cVar = new c(this, i11);
                this.f39230h.c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (z10) {
                    int i12 = a10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final h n0(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f39235c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f39257b.b() == 0 && cVar.f39235c == d.BLOCKING) {
            return hVar;
        }
        cVar.f39239h = true;
        return cVar.f39233a.a(hVar, z10);
    }

    private final c u() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !m.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean u0(long j10) {
        if (i.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f39224a) {
            int n10 = n();
            if (n10 == 1 && this.f39224a > 1) {
                n();
            }
            if (n10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean v0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f39221k.get(aVar);
        }
        return aVar.u0(j10);
    }

    private final boolean w0() {
        c L;
        do {
            L = L();
            if (L == null) {
                return false;
            }
        } while (!c.j().compareAndSet(L, -1, 0));
        LockSupport.unpark(L);
        return true;
    }

    public final void A(Runnable runnable, i iVar, boolean z10) {
        pe.c.a();
        h q10 = q(runnable, iVar);
        boolean z11 = false;
        boolean z12 = q10.f39257b.b() == 1;
        long addAndGet = z12 ? f39221k.addAndGet(this, 2097152) : 0;
        c u10 = u();
        h n02 = n0(u10, q10, z10);
        if (n02 == null || i(n02)) {
            if (z10 && u10 != null) {
                z11 = true;
            }
            if (z12) {
                h0(addAndGet, z11);
            } else if (!z11) {
                l0();
            }
        } else {
            throw new RejectedExecutionException(this.f39227d + " was terminated");
        }
    }

    public final boolean R(c cVar) {
        long j10;
        long j11;
        int h10;
        if (cVar.i() != f39223m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39220j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j10);
            j11 = (2097152 + j10) & -2097152;
            h10 = cVar.h();
            if (t0.a()) {
                if (!(h10 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.r(this.f39230h.b(i10));
        } while (!f39220j.compareAndSet(this, j10, ((long) h10) | j11));
        return true;
    }

    public final void Z(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39220j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                i12 = i11 == 0 ? J(cVar) : i11;
            }
            if (i12 >= 0) {
                if (f39220j.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public void close() {
        g0(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final void e0(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            pe.c.a();
            throw th;
        }
        pe.c.a();
    }

    public void execute(Runnable runnable) {
        B(this, runnable, (i) null, false, 6, (Object) null);
    }

    public final void g0(long j10) {
        int i10;
        h hVar;
        boolean z10 = false;
        if (f39222l.compareAndSet(this, 0, 1)) {
            c u10 = u();
            synchronized (this.f39230h) {
                i10 = (int) (f39221k.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f39230h.b(i11);
                    m.b(b10);
                    c cVar = b10;
                    if (cVar != u10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        d dVar = cVar.f39235c;
                        if (t0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f39233a.f(this.f39229g);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f39229g.b();
            this.f39228f.b();
            while (true) {
                if (u10 != null) {
                    hVar = u10.g(true);
                    if (hVar != null) {
                        continue;
                        e0(hVar);
                    }
                }
                hVar = (h) this.f39228f.d();
                if (hVar == null && (hVar = (h) this.f39229g.d()) == null) {
                    break;
                }
                e0(hVar);
            }
            if (u10 != null) {
                u10.u(d.TERMINATED);
            }
            if (t0.a()) {
                if (((int) ((f39221k.get(this) & 9223367638808264704L) >> 42)) == this.f39224a) {
                    z10 = true;
                }
                if (!z10) {
                    throw new AssertionError();
                }
            }
            f39220j.set(this, 0);
            f39221k.set(this, 0);
        }
    }

    public final boolean isTerminated() {
        return f39222l.get(this) != 0;
    }

    public final void l0() {
        if (!w0() && !v0(this, 0, 1, (Object) null)) {
            w0();
        }
    }

    public final h q(Runnable runnable, i iVar) {
        long a10 = l.f39265f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a10, iVar);
        }
        h hVar = (h) runnable;
        hVar.f39256a = a10;
        hVar.f39257b = iVar;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f39230h.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f39230h.b(i15);
            if (b10 != null) {
                int e10 = b10.f39233a.e();
                int i16 = b.f39231a[b10.f39235c.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(e10);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (e10 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(e10);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f39221k.get(this);
        return this.f39227d + '@' + u0.b(this) + "[Pool Size {core = " + this.f39224a + ", max = " + this.f39225b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f39228f.c() + ", global blocking queue size = " + this.f39229g.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f39224a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class c extends Thread {

        /* renamed from: j  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f39232j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final n f39233a;

        /* renamed from: b  reason: collision with root package name */
        private final z<h> f39234b;

        /* renamed from: c  reason: collision with root package name */
        public d f39235c;

        /* renamed from: d  reason: collision with root package name */
        private long f39236d;

        /* renamed from: f  reason: collision with root package name */
        private long f39237f;

        /* renamed from: g  reason: collision with root package name */
        private int f39238g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f39239h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f39233a = new n();
            this.f39234b = new z<>();
            this.f39235c = d.DORMANT;
            this.nextParkedWorker = a.f39223m;
            this.f39238g = ie.c.f33334a.c();
        }

        private final void b(int i10) {
            if (i10 != 0) {
                a.f39221k.addAndGet(a.this, -2097152);
                d dVar = this.f39235c;
                if (dVar != d.TERMINATED) {
                    if (t0.a()) {
                        if (!(dVar == d.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f39235c = d.DORMANT;
                }
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.l0();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f39257b.b();
            k(b10);
            c(b10);
            a.this.e0(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h o10;
            h o11;
            if (z10) {
                boolean z11 = m(a.this.f39224a * 2) == 0;
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f39233a.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f39233a.h();
            if (h10 != null) {
                return h10;
            }
            h hVar = (h) a.this.f39229g.d();
            return hVar == null ? v(1) : hVar;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f39232j;
        }

        private final void k(int i10) {
            this.f39236d = 0;
            if (this.f39235c == d.PARKING) {
                if (t0.a()) {
                    boolean z10 = true;
                    if (i10 != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                this.f39235c = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f39223m;
        }

        private final void n() {
            if (this.f39236d == 0) {
                this.f39236d = System.nanoTime() + a.this.f39226c;
            }
            LockSupport.parkNanos(a.this.f39226c);
            if (System.nanoTime() - this.f39236d >= 0) {
                this.f39236d = 0;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f39228f.d();
                if (hVar != null) {
                    return hVar;
                }
                return (h) a.this.f39229g.d();
            }
            h hVar2 = (h) a.this.f39229g.d();
            if (hVar2 != null) {
                return hVar2;
            }
            return (h) a.this.f39228f.d();
        }

        private final void p() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f39235c != d.TERMINATED) {
                    h g10 = g(this.f39239h);
                    if (g10 != null) {
                        this.f39237f = 0;
                        d(g10);
                    } else {
                        this.f39239h = false;
                        if (this.f39237f == 0) {
                            t();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f39237f);
                            this.f39237f = 0;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z10;
            if (this.f39235c != d.CPU_ACQUIRED) {
                a aVar = a.this;
                AtomicLongFieldUpdater h10 = a.f39221k;
                while (true) {
                    long j10 = h10.get(aVar);
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.f39221k.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f39235c = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.R(this);
                return;
            }
            f39232j.set(this, -1);
            while (l() && f39232j.get(this) == -1 && !a.this.isTerminated() && this.f39235c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f39221k.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c b10 = aVar.f39230h.b(m10);
                if (b10 == null || b10 == this) {
                    int i13 = i10;
                } else {
                    long n10 = b10.f39233a.n(i10, this.f39234b);
                    if (n10 == -1) {
                        z<h> zVar = this.f39234b;
                        h hVar = (h) zVar.f36055a;
                        zVar.f36055a = null;
                        return hVar;
                    } else if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f39237f = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f39230h) {
                if (!aVar.isTerminated()) {
                    if (((int) (a.f39221k.get(aVar) & 2097151)) > aVar.f39224a) {
                        if (f39232j.compareAndSet(this, -1, 1)) {
                            int i10 = this.indexInArray;
                            q(0);
                            aVar.Z(this, i10, 0);
                            int andDecrement = (int) (a.f39221k.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i10) {
                                c b10 = aVar.f39230h.b(andDecrement);
                                m.b(b10);
                                c cVar = b10;
                                aVar.f39230h.c(i10, cVar);
                                cVar.q(i10);
                                aVar.Z(cVar, andDecrement, i10);
                            }
                            aVar.f39230h.c(andDecrement, null);
                            w wVar = w.f38141a;
                            this.f39235c = d.TERMINATED;
                        }
                    }
                }
            }
        }

        public final h g(boolean z10) {
            if (s()) {
                return e(z10);
            }
            return f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f39238g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f39238g = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & a.e.API_PRIORITY_OTHER) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f39227d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f39235c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f39221k.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f39235c = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }
    }
}
