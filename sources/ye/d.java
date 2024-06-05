package ye;

import fe.l;
import fe.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.k3;
import pe.o;
import sd.w;

/* compiled from: Semaphore.kt */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39453c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f39454d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39455e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f39456f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39457g;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    private final int f39458a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Throwable, w> f39459b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* compiled from: Semaphore.kt */
    /* synthetic */ class a extends k implements p<Long, f, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39460a = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f b(long j10, f fVar) {
            return e.h(j10, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (f) obj2);
        }
    }

    /* compiled from: Semaphore.kt */
    static final class b extends n implements l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f39461a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.f39461a = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            this.f39461a.h();
        }
    }

    /* compiled from: Semaphore.kt */
    /* synthetic */ class c extends k implements p<Long, f, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39462a = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f b(long j10, f fVar) {
            return e.h(j10, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (f) obj2);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<d> cls2 = d.class;
        f39453c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head");
        f39454d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f39455e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f39456f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f39457g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public d(int i10, int i11) {
        this.f39458a = i10;
        boolean z10 = true;
        if (i10 > 0) {
            if ((i11 < 0 || i11 > i10) ? false : z10) {
                f fVar = new f(0, (f) null, 2);
                this.head = fVar;
                this.tail = fVar;
                this._availablePermits = i10 - i11;
                this.f39459b = new b(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0051, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r10 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d(pe.k3 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f39455e
            java.lang.Object r3 = r2.get(r0)
            ye.f r3 = (ye.f) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f39456f
            long r4 = r4.getAndIncrement(r0)
            ye.d$a r6 = ye.d.a.f39460a
            int r7 = ye.e.f39468f
            long r7 = (long) r7
            long r7 = r4 / r7
        L_0x001b:
            java.lang.Object r9 = ue.e.c(r3, r7, r6)
            boolean r10 = ue.j0.c(r9)
            if (r10 != 0) goto L_0x005e
            ue.i0 r10 = ue.j0.b(r9)
        L_0x0029:
            java.lang.Object r13 = r2.get(r0)
            ue.i0 r13 = (ue.i0) r13
            long r14 = r13.f38808c
            long r11 = r10.f38808c
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0039
        L_0x0037:
            r10 = 1
            goto L_0x0051
        L_0x0039:
            boolean r11 = r10.q()
            if (r11 != 0) goto L_0x0041
            r10 = 0
            goto L_0x0051
        L_0x0041:
            boolean r11 = androidx.concurrent.futures.b.a(r2, r0, r13, r10)
            if (r11 == 0) goto L_0x0054
            boolean r10 = r13.m()
            if (r10 == 0) goto L_0x0037
            r13.k()
            goto L_0x0037
        L_0x0051:
            if (r10 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0054:
            boolean r11 = r10.m()
            if (r11 == 0) goto L_0x0029
            r10.k()
            goto L_0x0029
        L_0x005e:
            ue.i0 r2 = ue.j0.b(r9)
            ye.f r2 = (ye.f) r2
            int r3 = ye.e.f39468f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.r()
            boolean r4 = r5.compareAndSet(r3, r4, r1)
            if (r4 == 0) goto L_0x007b
            r1.a(r2, r3)
            r1 = 1
            return r1
        L_0x007b:
            ue.l0 r4 = ye.e.f39464b
            ue.l0 r5 = ye.e.f39465c
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r2.r()
            boolean r4 = r6.compareAndSet(r3, r4, r5)
            if (r4 == 0) goto L_0x00c9
            boolean r2 = r1 instanceof pe.o
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.m.c(r1, r2)
            pe.o r1 = (pe.o) r1
            sd.w r2 = sd.w.f38141a
            fe.l<java.lang.Throwable, sd.w> r3 = r0.f39459b
            r1.l(r2, r3)
        L_0x009f:
            r1 = 1
            goto L_0x00ad
        L_0x00a1:
            boolean r2 = r1 instanceof xe.b
            if (r2 == 0) goto L_0x00ae
            xe.b r1 = (xe.b) r1
            sd.w r2 = sd.w.f38141a
            r1.c(r2)
            goto L_0x009f
        L_0x00ad:
            return r1
        L_0x00ae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00c9:
            r1 = 1
            boolean r4 = pe.t0.a()
            if (r4 == 0) goto L_0x00ea
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.r()
            java.lang.Object r2 = r2.get(r3)
            ue.l0 r3 = ye.e.f39466d
            if (r2 != r3) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r12 == 0) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x00ea:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.d.d(pe.k3):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private final void e() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f39457g
            int r1 = r0.get(r3)
            int r2 = r3.f39458a
            if (r1 <= r2) goto L_0x0010
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.d.e():void");
    }

    private final int f() {
        int andDecrement;
        do {
            andDecrement = f39457g.getAndDecrement(this);
        } while (andDecrement > this.f39458a);
        return andDecrement;
    }

    private final boolean j(Object obj) {
        if (obj instanceof o) {
            m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            o oVar = (o) obj;
            Object k10 = oVar.k(w.f38141a, (Object) null, this.f39459b);
            if (k10 == null) {
                return false;
            }
            oVar.r(k10);
            return true;
        } else if (obj instanceof xe.b) {
            return ((xe.b) obj).b(this, w.f38141a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r9 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean k() {
        /*
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f39453c
            java.lang.Object r2 = r1.get(r0)
            ye.f r2 = (ye.f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f39454d
            long r3 = r3.getAndIncrement(r0)
            int r5 = ye.e.f39468f
            long r5 = (long) r5
            long r5 = r3 / r5
            ye.d$c r7 = ye.d.c.f39462a
        L_0x0019:
            java.lang.Object r8 = ue.e.c(r2, r5, r7)
            boolean r9 = ue.j0.c(r8)
            if (r9 != 0) goto L_0x005c
            ue.i0 r9 = ue.j0.b(r8)
        L_0x0027:
            java.lang.Object r12 = r1.get(r0)
            ue.i0 r12 = (ue.i0) r12
            long r13 = r12.f38808c
            long r10 = r9.f38808c
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 < 0) goto L_0x0037
        L_0x0035:
            r9 = 1
            goto L_0x004f
        L_0x0037:
            boolean r10 = r9.q()
            if (r10 != 0) goto L_0x003f
            r9 = 0
            goto L_0x004f
        L_0x003f:
            boolean r10 = androidx.concurrent.futures.b.a(r1, r0, r12, r9)
            if (r10 == 0) goto L_0x0052
            boolean r9 = r12.m()
            if (r9 == 0) goto L_0x0035
            r12.k()
            goto L_0x0035
        L_0x004f:
            if (r9 == 0) goto L_0x0019
            goto L_0x005c
        L_0x0052:
            boolean r10 = r9.m()
            if (r10 == 0) goto L_0x0027
            r9.k()
            goto L_0x0027
        L_0x005c:
            ue.i0 r1 = ue.j0.b(r8)
            ye.f r1 = (ye.f) r1
            r1.b()
            long r7 = r1.f38808c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x006d
            r2 = 0
            return r2
        L_0x006d:
            int r2 = ye.e.f39468f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            ue.l0 r3 = ye.e.f39464b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto L_0x00b0
            int r3 = ye.e.f39463a
            r10 = 0
        L_0x0087:
            if (r10 >= r3) goto L_0x009d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r4 = r4.get(r2)
            ue.l0 r5 = ye.e.f39465c
            if (r4 != r5) goto L_0x0099
            r4 = 1
            return r4
        L_0x0099:
            r4 = 1
            int r10 = r10 + 1
            goto L_0x0087
        L_0x009d:
            r4 = 1
            ue.l0 r3 = ye.e.f39464b
            ue.l0 r5 = ye.e.f39466d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.r()
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        L_0x00b0:
            ue.l0 r1 = ye.e.f39467e
            if (r3 != r1) goto L_0x00b8
            r1 = 0
            return r1
        L_0x00b8:
            boolean r1 = r0.j(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.d.k():boolean");
    }

    /* access modifiers changed from: protected */
    public final void c(o<? super w> oVar) {
        while (f() <= 0) {
            m.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (d((k3) oVar)) {
                return;
            }
        }
        oVar.l(w.f38141a, this.f39459b);
    }

    public int g() {
        return Math.max(f39457g.get(this), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f39457g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f39458a
            if (r0 >= r1) goto L_0x0014
            if (r0 < 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0014:
            r3.e()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f39458a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.d.h():void");
    }

    public boolean i() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39457g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f39458a) {
                e();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
