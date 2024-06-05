package re;

import androidx.recyclerview.widget.RecyclerView;
import fe.l;
import fe.q;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.k3;
import pe.p;
import pe.r;
import pe.t0;
import sd.o;
import sd.w;
import ue.d0;
import ue.i0;
import ue.j0;
import ue.k0;
import ue.l0;
import ue.u0;

/* compiled from: BufferedChannel.kt */
public class b<E> implements d<E> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f37951d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f37952f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37953g;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37954h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f37955i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f37956j;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37957k;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37958l;

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37959m;
    private volatile Object _closeCause;

    /* renamed from: a  reason: collision with root package name */
    private final int f37960a;

    /* renamed from: b  reason: collision with root package name */
    public final l<E, w> f37961b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c  reason: collision with root package name */
    private final q<xe.b<?>, Object, Object, l<Throwable, w>> f37962c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* compiled from: BufferedChannel.kt */
    private final class a implements f<E>, k3 {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Object f37963a = c.f37997p;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public p<? super Boolean> f37964b;

        public a() {
        }

        private final Object f(i<E> iVar, int i10, long j10, xd.d<? super Boolean> dVar) {
            Boolean a10;
            b<E> bVar = b.this;
            p b10 = r.b(c.b(dVar));
            try {
                this.f37964b = b10;
                Object x10 = bVar.G0(iVar, i10, j10, this);
                if (x10 == c.f37994m) {
                    bVar.p0(this, iVar, i10);
                } else {
                    l<Throwable, w> lVar = null;
                    if (x10 == c.f37996o) {
                        if (j10 < bVar.R()) {
                            iVar.b();
                        }
                        i iVar2 = (i) b.f37956j.get(bVar);
                        while (true) {
                            if (bVar.Y()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f37952f.getAndIncrement(bVar);
                            int i11 = c.f37983b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (iVar2.f38808c != j11) {
                                i h10 = bVar.K(j11, iVar2);
                                if (h10 != null) {
                                    iVar2 = h10;
                                }
                            }
                            Object x11 = bVar.G0(iVar2, i12, andIncrement, this);
                            if (x11 == c.f37994m) {
                                bVar.p0(this, iVar2, i12);
                                break;
                            } else if (x11 == c.f37996o) {
                                if (andIncrement < bVar.R()) {
                                    iVar2.b();
                                }
                            } else if (x11 != c.f37995n) {
                                iVar2.b();
                                this.f37963a = x11;
                                this.f37964b = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                l<E, w> lVar2 = bVar.f37961b;
                                if (lVar2 != null) {
                                    lVar = d0.a(lVar2, x11, b10.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        iVar.b();
                        this.f37963a = x10;
                        this.f37964b = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        l<E, w> lVar3 = bVar.f37961b;
                        if (lVar3 != null) {
                            lVar = d0.a(lVar3, x10, b10.getContext());
                        }
                    }
                    b10.l(a10, lVar);
                }
                Object z10 = b10.z();
                if (z10 == d.c()) {
                    h.c(dVar);
                }
                return z10;
            } catch (Throwable th) {
                b10.K();
                throw th;
            }
        }

        private final boolean g() {
            this.f37963a = c.z();
            Throwable N = b.this.N();
            if (N == null) {
                return false;
            }
            throw k0.j(N);
        }

        /* access modifiers changed from: private */
        public final void h() {
            p<? super Boolean> pVar = this.f37964b;
            m.b(pVar);
            this.f37964b = null;
            this.f37963a = c.z();
            Throwable N = b.this.N();
            if (N == null) {
                o.a aVar = o.f38128b;
                pVar.resumeWith(o.b(Boolean.FALSE));
                return;
            }
            if (t0.d() && (pVar instanceof kotlin.coroutines.jvm.internal.e)) {
                N = k0.i(N, pVar);
            }
            o.a aVar2 = o.f38128b;
            pVar.resumeWith(o.b(sd.p.a(N)));
        }

        public void a(i0<?> i0Var, int i10) {
            p<? super Boolean> pVar = this.f37964b;
            if (pVar != null) {
                pVar.a(i0Var, i10);
            }
        }

        public Object b(xd.d<? super Boolean> dVar) {
            i iVar;
            b<E> bVar = b.this;
            i iVar2 = (i) b.f37956j.get(bVar);
            while (!bVar.Y()) {
                long andIncrement = b.f37952f.getAndIncrement(bVar);
                int i10 = c.f37983b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (iVar2.f38808c != j10) {
                    i h10 = bVar.K(j10, iVar2);
                    if (h10 == null) {
                        continue;
                    } else {
                        iVar = h10;
                    }
                } else {
                    iVar = iVar2;
                }
                Object x10 = bVar.G0(iVar, i11, andIncrement, (Object) null);
                if (x10 == c.f37994m) {
                    throw new IllegalStateException("unreachable".toString());
                } else if (x10 == c.f37996o) {
                    if (andIncrement < bVar.R()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else if (x10 == c.f37995n) {
                    return f(iVar, i11, andIncrement, dVar);
                } else {
                    iVar.b();
                    this.f37963a = x10;
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        public final boolean i(E e10) {
            p<? super Boolean> pVar = this.f37964b;
            m.b(pVar);
            l<Throwable, w> lVar = null;
            this.f37964b = null;
            this.f37963a = e10;
            Boolean bool = Boolean.TRUE;
            l<E, w> lVar2 = b.this.f37961b;
            if (lVar2 != null) {
                lVar = d0.a(lVar2, e10, pVar.getContext());
            }
            return c.B(pVar, bool, lVar);
        }

        public final void j() {
            p<? super Boolean> pVar = this.f37964b;
            m.b(pVar);
            this.f37964b = null;
            this.f37963a = c.z();
            Throwable N = b.this.N();
            if (N == null) {
                o.a aVar = o.f38128b;
                pVar.resumeWith(o.b(Boolean.FALSE));
                return;
            }
            if (t0.d() && (pVar instanceof kotlin.coroutines.jvm.internal.e)) {
                N = k0.i(N, pVar);
            }
            o.a aVar2 = o.f38128b;
            pVar.resumeWith(o.b(sd.p.a(N)));
        }

        public E next() {
            E e10 = this.f37963a;
            if (e10 != c.f37997p) {
                this.f37963a = c.f37997p;
                if (e10 != c.z()) {
                    return e10;
                }
                throw k0.j(b.this.O());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: re.b$b  reason: collision with other inner class name */
    /* compiled from: BufferedChannel.kt */
    private static final class C0428b implements k3 {

        /* renamed from: a  reason: collision with root package name */
        private final pe.o<Boolean> f37966a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ p<Boolean> f37967b;

        public void a(i0<?> i0Var, int i10) {
            this.f37967b.a(i0Var, i10);
        }

        public final pe.o<Boolean> b() {
            return this.f37966a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    static final class c extends n implements q<xe.b<?>, Object, Object, l<? super Throwable, ? extends w>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b<E> f37968a;

        /* compiled from: BufferedChannel.kt */
        static final class a extends n implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f37969a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b<E> f37970b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ xe.b<?> f37971c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, xe.b<?> bVar2) {
                super(1);
                this.f37969a = obj;
                this.f37970b = bVar;
                this.f37971c = bVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.f38141a;
            }

            public final void invoke(Throwable th) {
                if (this.f37969a != c.z()) {
                    d0.b(this.f37970b.f37961b, this.f37969a, this.f37971c.getContext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.f37968a = bVar;
        }

        /* renamed from: a */
        public final l<Throwable, w> invoke(xe.b<?> bVar, Object obj, Object obj2) {
            return new a(obj2, this.f37968a, bVar);
        }
    }

    @f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
    /* compiled from: BufferedChannel.kt */
    static final class d<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f37972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b<E> f37973b;

        /* renamed from: c  reason: collision with root package name */
        int f37974c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b<E> bVar, xd.d<? super d> dVar) {
            super(dVar);
            this.f37973b = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f37972a = obj;
            this.f37974c |= RecyclerView.UNDEFINED_DURATION;
            Object s02 = b.s0(this.f37973b, this);
            return s02 == d.c() ? s02 : h.b(s02);
        }
    }

    @f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    /* compiled from: BufferedChannel.kt */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f37975a;

        /* renamed from: b  reason: collision with root package name */
        Object f37976b;

        /* renamed from: c  reason: collision with root package name */
        int f37977c;

        /* renamed from: d  reason: collision with root package name */
        long f37978d;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f37979f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b<E> f37980g;

        /* renamed from: h  reason: collision with root package name */
        int f37981h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b<E> bVar, xd.d<? super e> dVar) {
            super(dVar);
            this.f37980g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f37979f = obj;
            this.f37981h |= RecyclerView.UNDEFINED_DURATION;
            Object w10 = this.f37980g.t0((i) null, 0, 0, this);
            return w10 == d.c() ? w10 : h.b(w10);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<b> cls2 = b.class;
        f37951d = AtomicLongFieldUpdater.newUpdater(cls2, "sendersAndCloseStatus");
        f37952f = AtomicLongFieldUpdater.newUpdater(cls2, "receivers");
        f37953g = AtomicLongFieldUpdater.newUpdater(cls2, "bufferEnd");
        f37954h = AtomicLongFieldUpdater.newUpdater(cls2, "completedExpandBuffersAndPauseFlag");
        f37955i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "sendSegment");
        f37956j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "receiveSegment");
        f37957k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "bufferEndSegment");
        f37958l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_closeCause");
        f37959m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "closeHandler");
    }

    public b(int i10, l<? super E, w> lVar) {
        this.f37960a = i10;
        this.f37961b = lVar;
        if (i10 >= 0) {
            this.bufferEnd = c.A(i10);
            this.completedExpandBuffersAndPauseFlag = M();
            i iVar = new i(0, (i) null, this, 3);
            this.sendSegment = iVar;
            this.receiveSegment = iVar;
            if (c0()) {
                iVar = c.f37982a;
                m.c(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = iVar;
            this.f37962c = lVar != null ? new c(this) : null;
            this._closeCause = c.f38000s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A0(re.i<E> r21, int r22, E r23, long r24, xd.d<? super sd.w> r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            xd.d r1 = yd.c.b(r26)
            pe.p r10 = pe.r.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.I0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x0101
            r11 = 1
            if (r1 == r11) goto L_0x00f8
            r12 = 2
            if (r1 == r12) goto L_0x00f0
            r13 = 4
            if (r1 == r13) goto L_0x00e3
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d9
            r21.b()     // Catch:{ all -> 0x0126 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f37955i     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0126 }
            re.i r1 = (re.i) r1     // Catch:{ all -> 0x0126 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f37951d     // Catch:{ all -> 0x0126 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0126 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.a0(r2)     // Catch:{ all -> 0x0126 }
            int r2 = re.c.f37983b     // Catch:{ all -> 0x0126 }
            long r3 = (long) r2     // Catch:{ all -> 0x0126 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0126 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0126 }
            long r5 = r1.f38808c     // Catch:{ all -> 0x0126 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006a
            re.i r2 = r9.L(r3, r1)     // Catch:{ all -> 0x0126 }
            if (r2 != 0) goto L_0x0068
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.m0(r0, r10)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x0068:
            r7 = r2
            goto L_0x006b
        L_0x006a:
            r7 = r1
        L_0x006b:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.I0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x00cb
            if (r1 == r11) goto L_0x00bf
            if (r1 == r12) goto L_0x00a8
            r2 = 3
            if (r1 == r2) goto L_0x009e
            if (r1 == r13) goto L_0x0092
            if (r1 == r15) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r21.b()     // Catch:{ all -> 0x0126 }
        L_0x008f:
            r1 = r21
            goto L_0x0039
        L_0x0092:
            long r1 = r20.P()     // Catch:{ all -> 0x0126 }
            int r3 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00a8:
            if (r18 == 0) goto L_0x00ae
            r21.p()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00ae:
            boolean r0 = r10 instanceof pe.k3     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00b4
            r0 = r10
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x010f
            r2 = r21
            r1 = r19
            r9.q0(r0, r2, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00bf:
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x0126 }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0126 }
        L_0x00c7:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00cb:
            r2 = r21
            r2.b()     // Catch:{ all -> 0x0126 }
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x0126 }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x00d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00e3:
            long r1 = r20.P()     // Catch:{ all -> 0x0126 }
            int r3 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00f0:
            r0 = r21
            r1 = r22
            r9.q0(r10, r0, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00f8:
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x0126 }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x0101:
            r0 = r21
            r21.b()     // Catch:{ all -> 0x0126 }
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x0126 }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x010f:
            java.lang.Object r0 = r10.z()
            java.lang.Object r1 = yd.d.c()
            if (r0 != r1) goto L_0x011c
            kotlin.coroutines.jvm.internal.h.c(r26)
        L_0x011c:
            java.lang.Object r1 = yd.d.c()
            if (r0 != r1) goto L_0x0123
            return r0
        L_0x0123:
            sd.w r0 = sd.w.f38141a
            return r0
        L_0x0126:
            r0 = move-exception
            r10.K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.A0(re.i, int, java.lang.Object, long, xd.d):java.lang.Object");
    }

    private final void B(i<E> iVar, long j10) {
        Object b10 = ue.r.b((Object) null, 1, (kotlin.jvm.internal.h) null);
        loop0:
        while (iVar != null) {
            for (int i10 = c.f37983b - 1; -1 < i10; i10--) {
                if ((iVar.f38808c * ((long) c.f37983b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object w10 = iVar.w(i10);
                    if (w10 == null || w10 == c.f37986e) {
                        if (iVar.r(i10, w10, c.z())) {
                            iVar.p();
                            break;
                        }
                    } else if (w10 instanceof v) {
                        if (iVar.r(i10, w10, c.z())) {
                            b10 = ue.r.c(b10, ((v) w10).f38023a);
                            iVar.x(i10, true);
                            break;
                        }
                    } else if (!(w10 instanceof k3)) {
                        break;
                    } else if (iVar.r(i10, w10, c.z())) {
                        b10 = ue.r.c(b10, w10);
                        iVar.x(i10, true);
                        break;
                    }
                }
            }
            iVar = (i) iVar.g();
        }
        if (b10 == null) {
            return;
        }
        if (!(b10 instanceof ArrayList)) {
            w0((k3) b10);
            return;
        }
        m.c(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) b10;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            w0((k3) arrayList.get(size));
        }
    }

    private final boolean B0(long j10) {
        if (a0(j10)) {
            return false;
        }
        return !z(j10 & 1152921504606846975L);
    }

    private final i<E> C() {
        i iVar = f37957k.get(this);
        i iVar2 = (i) f37955i.get(this);
        if (iVar2.f38808c > ((i) iVar).f38808c) {
            iVar = iVar2;
        }
        i iVar3 = (i) f37956j.get(this);
        if (iVar3.f38808c > ((i) iVar).f38808c) {
            iVar = iVar3;
        }
        return (i) ue.e.b((ue.f) iVar);
    }

    private final boolean C0(Object obj, E e10) {
        if (obj instanceof xe.b) {
            return ((xe.b) obj).b(this, e10);
        }
        l<Throwable, w> lVar = null;
        if (obj instanceof s) {
            m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s sVar = (s) obj;
            p<h<? extends E>> pVar = sVar.f38022a;
            h b10 = h.b(h.f38005b.c(e10));
            l<E, w> lVar2 = this.f37961b;
            if (lVar2 != null) {
                lVar = d0.a(lVar2, e10, sVar.f38022a.getContext());
            }
            return c.B(pVar, b10, lVar);
        } else if (obj instanceof a) {
            m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        } else if (obj instanceof pe.o) {
            m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            pe.o oVar = (pe.o) obj;
            l<E, w> lVar3 = this.f37961b;
            if (lVar3 != null) {
                lVar = d0.a(lVar3, e10, oVar.getContext());
            }
            return c.B(oVar, e10, lVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final boolean D0(Object obj, i<E> iVar, int i10) {
        if (obj instanceof pe.o) {
            m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((pe.o) obj, w.f38141a, (l) null, 2, (Object) null);
        } else if (obj instanceof xe.b) {
            m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            xe.d f10 = ((xe.a) obj).f(this, w.f38141a);
            if (f10 == xe.d.REREGISTER) {
                iVar.s(i10);
            }
            return f10 == xe.d.SUCCESSFUL;
        } else if (obj instanceof C0428b) {
            return c.C(((C0428b) obj).b(), Boolean.TRUE, (l) null, 2, (Object) null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final void E(long j10) {
        v0(F(j10));
    }

    private final boolean E0(i<E> iVar, int i10, long j10) {
        Object w10 = iVar.w(i10);
        if (!(w10 instanceof k3) || j10 < f37952f.get(this) || !iVar.r(i10, w10, c.f37988g)) {
            return F0(iVar, i10, j10);
        }
        if (D0(w10, iVar, i10)) {
            iVar.A(i10, c.f37985d);
            return true;
        }
        iVar.A(i10, c.f37991j);
        iVar.x(i10, false);
        return false;
    }

    private final i<E> F(long j10) {
        i<E> C = C();
        if (b0()) {
            long d02 = d0(C);
            if (d02 != -1) {
                H(d02);
            }
        }
        B(C, j10);
        return C;
    }

    private final boolean F0(i<E> iVar, int i10, long j10) {
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 instanceof k3) {
                if (j10 < f37952f.get(this)) {
                    if (iVar.r(i10, w10, new v((k3) w10))) {
                        return true;
                    }
                } else if (iVar.r(i10, w10, c.f37988g)) {
                    if (D0(w10, iVar, i10)) {
                        iVar.A(i10, c.f37985d);
                        return true;
                    }
                    iVar.A(i10, c.f37991j);
                    iVar.x(i10, false);
                    return false;
                }
            } else if (w10 == c.f37991j) {
                return false;
            } else {
                if (w10 == null) {
                    if (iVar.r(i10, w10, c.f37986e)) {
                        return true;
                    }
                } else if (w10 == c.f37985d || w10 == c.f37989h || w10 == c.f37990i || w10 == c.f37992k || w10 == c.z()) {
                    return true;
                } else {
                    if (w10 != c.f37987f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w10).toString());
                    }
                }
            }
        }
        return true;
    }

    private final void G() {
        q();
    }

    /* access modifiers changed from: private */
    public final Object G0(i<E> iVar, int i10, long j10, Object obj) {
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (j10 >= (f37951d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f37995n;
                }
                if (iVar.r(i10, w10, obj)) {
                    I();
                    return c.f37994m;
                }
            }
        } else if (w10 == c.f37985d && iVar.r(i10, w10, c.f37990i)) {
            I();
            return iVar.y(i10);
        }
        return H0(iVar, i10, j10, obj);
    }

    private final Object H0(i<E> iVar, int i10, long j10, Object obj) {
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 == null || w10 == c.f37986e) {
                if (j10 < (f37951d.get(this) & 1152921504606846975L)) {
                    if (iVar.r(i10, w10, c.f37989h)) {
                        I();
                        return c.f37996o;
                    }
                } else if (obj == null) {
                    return c.f37995n;
                } else {
                    if (iVar.r(i10, w10, obj)) {
                        I();
                        return c.f37994m;
                    }
                }
            } else if (w10 == c.f37985d) {
                if (iVar.r(i10, w10, c.f37990i)) {
                    I();
                    return iVar.y(i10);
                }
            } else if (w10 == c.f37991j) {
                return c.f37996o;
            } else {
                if (w10 == c.f37989h) {
                    return c.f37996o;
                }
                if (w10 == c.z()) {
                    I();
                    return c.f37996o;
                } else if (w10 != c.f37988g && iVar.r(i10, w10, c.f37987f)) {
                    boolean z10 = w10 instanceof v;
                    if (z10) {
                        w10 = ((v) w10).f38023a;
                    }
                    if (D0(w10, iVar, i10)) {
                        iVar.A(i10, c.f37990i);
                        I();
                        return iVar.y(i10);
                    }
                    iVar.A(i10, c.f37991j);
                    iVar.x(i10, false);
                    if (z10) {
                        I();
                    }
                    return c.f37996o;
                }
            }
        }
    }

    private final void I() {
        if (!c0()) {
            i iVar = (i) f37957k.get(this);
            while (true) {
                long andIncrement = f37953g.getAndIncrement(this);
                int i10 = c.f37983b;
                long j10 = andIncrement / ((long) i10);
                if (R() <= andIncrement) {
                    if (iVar.f38808c < j10 && iVar.e() != null) {
                        h0(j10, iVar);
                    }
                    U(this, 0, 1, (Object) null);
                    return;
                }
                if (iVar.f38808c != j10) {
                    i J = J(j10, iVar, andIncrement);
                    if (J == null) {
                        continue;
                    } else {
                        iVar = J;
                    }
                }
                if (E0(iVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                    U(this, 0, 1, (Object) null);
                    return;
                }
                U(this, 0, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final int I0(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        iVar.B(i10, e10);
        if (z10) {
            return J0(iVar, i10, e10, j10, obj, z10);
        }
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (z(j10)) {
                if (iVar.r(i10, (Object) null, c.f37985d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (iVar.r(i10, (Object) null, obj)) {
                    return 2;
                }
            }
        } else if (w10 instanceof k3) {
            iVar.s(i10);
            if (C0(w10, e10)) {
                iVar.A(i10, c.f37990i);
                n0();
                return 0;
            }
            if (iVar.t(i10, c.f37992k) != c.f37992k) {
                iVar.x(i10, true);
            }
            return 5;
        }
        return J0(iVar, i10, e10, j10, obj, z10);
    }

    private final i<E> J(long j10, i<E> iVar, long j11) {
        Object c10;
        boolean z10;
        boolean z11;
        long j12 = j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37957k;
        fe.p pVar = (fe.p) c.y();
        i<E> iVar2 = iVar;
        do {
            c10 = ue.e.c(iVar2, j12, pVar);
            z10 = false;
            if (j0.c(c10)) {
                break;
            }
            i0 b10 = j0.b(c10);
            while (true) {
                i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
                if (i0Var.f38808c >= b10.f38808c) {
                    break;
                } else if (!b10.q()) {
                    z11 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, i0Var, b10)) {
                    if (i0Var.m()) {
                        i0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z11 = true;
            continue;
        } while (!z11);
        if (j0.c(c10)) {
            G();
            h0(j10, iVar);
            U(this, 0, 1, (Object) null);
            return null;
        }
        i<E> iVar3 = (i) j0.b(c10);
        long j13 = iVar3.f38808c;
        if (j13 > j12) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f37953g;
            int i10 = c.f37983b;
            if (atomicLongFieldUpdater.compareAndSet(this, j11 + 1, ((long) i10) * j13)) {
                T((iVar3.f38808c * ((long) i10)) - j11);
                return null;
            }
            U(this, 0, 1, (Object) null);
            return null;
        }
        if (t0.a()) {
            if (iVar3.f38808c == j12) {
                z10 = true;
            }
            if (!z10) {
                throw new AssertionError();
            }
        }
        return iVar3;
    }

    private final int J0(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 == null) {
                if (!z(j10) || z10) {
                    if (z10) {
                        if (iVar.r(i10, (Object) null, c.f37991j)) {
                            iVar.x(i10, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (iVar.r(i10, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (iVar.r(i10, (Object) null, c.f37985d)) {
                    return 1;
                }
            } else if (w10 == c.f37986e) {
                if (iVar.r(i10, w10, c.f37985d)) {
                    return 1;
                }
            } else if (w10 == c.f37992k) {
                iVar.s(i10);
                return 5;
            } else if (w10 == c.f37989h) {
                iVar.s(i10);
                return 5;
            } else if (w10 == c.z()) {
                iVar.s(i10);
                G();
                return 4;
            } else {
                if (t0.a()) {
                    if (!((w10 instanceof k3) || (w10 instanceof v))) {
                        throw new AssertionError();
                    }
                }
                iVar.s(i10);
                if (w10 instanceof v) {
                    w10 = ((v) w10).f38023a;
                }
                if (C0(w10, e10)) {
                    iVar.A(i10, c.f37990i);
                    n0();
                    return 0;
                }
                if (iVar.t(i10, c.f37992k) != c.f37992k) {
                    iVar.x(i10, true);
                }
                return 5;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0040, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final re.i<E> K(long r13, re.i<E> r15) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f37956j
            le.e r1 = re.c.y()
            fe.p r1 = (fe.p) r1
        L_0x0008:
            java.lang.Object r2 = ue.e.c(r15, r13, r1)
            boolean r3 = ue.j0.c(r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x004d
            ue.i0 r3 = ue.j0.b(r2)
        L_0x0018:
            java.lang.Object r6 = r0.get(r12)
            ue.i0 r6 = (ue.i0) r6
            long r7 = r6.f38808c
            long r9 = r3.f38808c
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0040
        L_0x0028:
            boolean r7 = r3.q()
            if (r7 != 0) goto L_0x0030
            r3 = 0
            goto L_0x0040
        L_0x0030:
            boolean r7 = androidx.concurrent.futures.b.a(r0, r12, r6, r3)
            if (r7 == 0) goto L_0x0043
            boolean r3 = r6.m()
            if (r3 == 0) goto L_0x0026
            r6.k()
            goto L_0x0026
        L_0x0040:
            if (r3 == 0) goto L_0x0008
            goto L_0x004d
        L_0x0043:
            boolean r6 = r3.m()
            if (r6 == 0) goto L_0x0018
            r3.k()
            goto L_0x0018
        L_0x004d:
            boolean r0 = ue.j0.c(r2)
            r1 = 0
            if (r0 == 0) goto L_0x006b
            r12.G()
            long r13 = r15.f38808c
            int r0 = re.c.f37983b
            long r2 = (long) r0
            long r13 = r13 * r2
            long r2 = r12.R()
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e9
            r15.b()
            goto L_0x00e9
        L_0x006b:
            ue.i0 r15 = ue.j0.b(r2)
            re.i r15 = (re.i) r15
            boolean r0 = r12.c0()
            if (r0 != 0) goto L_0x00b3
            long r2 = r12.M()
            int r0 = re.c.f37983b
            long r6 = (long) r0
            long r2 = r2 / r6
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f37957k
        L_0x0085:
            java.lang.Object r2 = r0.get(r12)
            ue.i0 r2 = (ue.i0) r2
            long r6 = r2.f38808c
            long r8 = r15.f38808c
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b3
            boolean r3 = r15.q()
            if (r3 == 0) goto L_0x00b3
            boolean r3 = androidx.concurrent.futures.b.a(r0, r12, r2, r15)
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x00b3
            r2.k()
            goto L_0x00b3
        L_0x00a9:
            boolean r2 = r15.m()
            if (r2 == 0) goto L_0x0085
            r15.k()
            goto L_0x0085
        L_0x00b3:
            long r2 = r15.f38808c
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            int r13 = re.c.f37983b
            long r4 = (long) r13
            long r2 = r2 * r4
            r12.K0(r2)
            long r2 = r15.f38808c
            long r13 = (long) r13
            long r2 = r2 * r13
            long r13 = r12.R()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e9
            r15.b()
            goto L_0x00e9
        L_0x00d2:
            boolean r0 = pe.t0.a()
            if (r0 == 0) goto L_0x00e8
            long r0 = r15.f38808c
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00df
            r4 = 1
        L_0x00df:
            if (r4 == 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x00e8:
            r1 = r15
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.K(long, re.i):re.i");
    }

    private final void K0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37952f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10 || f37952f.compareAndSet(this, j11, j10)) {
            }
            j11 = atomicLongFieldUpdater.get(this);
            return;
        } while (f37952f.compareAndSet(this, j11, j10));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0040, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final re.i<E> L(long r13, re.i<E> r15) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f37955i
            le.e r1 = re.c.y()
            fe.p r1 = (fe.p) r1
        L_0x0008:
            java.lang.Object r2 = ue.e.c(r15, r13, r1)
            boolean r3 = ue.j0.c(r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x004d
            ue.i0 r3 = ue.j0.b(r2)
        L_0x0018:
            java.lang.Object r6 = r0.get(r12)
            ue.i0 r6 = (ue.i0) r6
            long r7 = r6.f38808c
            long r9 = r3.f38808c
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0040
        L_0x0028:
            boolean r7 = r3.q()
            if (r7 != 0) goto L_0x0030
            r3 = 0
            goto L_0x0040
        L_0x0030:
            boolean r7 = androidx.concurrent.futures.b.a(r0, r12, r6, r3)
            if (r7 == 0) goto L_0x0043
            boolean r3 = r6.m()
            if (r3 == 0) goto L_0x0026
            r6.k()
            goto L_0x0026
        L_0x0040:
            if (r3 == 0) goto L_0x0008
            goto L_0x004d
        L_0x0043:
            boolean r6 = r3.m()
            if (r6 == 0) goto L_0x0018
            r3.k()
            goto L_0x0018
        L_0x004d:
            boolean r0 = ue.j0.c(r2)
            r1 = 0
            if (r0 == 0) goto L_0x006a
            r12.G()
            long r13 = r15.f38808c
            int r0 = re.c.f37983b
            long r2 = (long) r0
            long r13 = r13 * r2
            long r2 = r12.P()
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a6
            r15.b()
            goto L_0x00a6
        L_0x006a:
            ue.i0 r15 = ue.j0.b(r2)
            re.i r15 = (re.i) r15
            long r2 = r15.f38808c
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            int r13 = re.c.f37983b
            long r4 = (long) r13
            long r2 = r2 * r4
            r12.L0(r2)
            long r2 = r15.f38808c
            long r13 = (long) r13
            long r2 = r2 * r13
            long r13 = r12.P()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a6
            r15.b()
            goto L_0x00a6
        L_0x008f:
            boolean r0 = pe.t0.a()
            if (r0 == 0) goto L_0x00a5
            long r0 = r15.f38808c
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x009c
            r4 = 1
        L_0x009c:
            if (r4 == 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x00a5:
            r1 = r15
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.L(long, re.i):re.i");
    }

    private final void L0(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37951d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f37951d.compareAndSet(this, j11, c.w(j12, (int) (j11 >> 60))));
    }

    private final long M() {
        return f37953g.get(this);
    }

    /* access modifiers changed from: private */
    public final Throwable O() {
        Throwable N = N();
        return N == null ? new m("Channel was closed") : N;
    }

    private final void T(long j10) {
        boolean z10;
        if ((f37954h.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
                if ((f37954h.get(this) & 4611686018427387904L) != 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } while (z10);
        }
    }

    static /* synthetic */ void U(b bVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            bVar.T(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void V() {
        Object obj;
        l0 l0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37959m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                l0Var = c.f37998q;
            } else {
                l0Var = c.f37999r;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, l0Var));
        if (obj != null) {
            l lVar = (l) c0.b(obj, 1);
            ((l) obj).invoke(N());
        }
    }

    private final boolean W(i<E> iVar, int i10, long j10) {
        Object w10;
        do {
            w10 = iVar.w(i10);
            if (w10 != null && w10 != c.f37986e) {
                if (w10 == c.f37985d) {
                    return true;
                }
                if (w10 == c.f37991j || w10 == c.z() || w10 == c.f37990i || w10 == c.f37989h) {
                    return false;
                }
                if (w10 == c.f37988g) {
                    return true;
                }
                if (w10 != c.f37987f && j10 == P()) {
                    return true;
                }
                return false;
            }
        } while (!iVar.r(i10, w10, c.f37989h));
        I();
        return false;
    }

    private final boolean X(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            F(j10 & 1152921504606846975L);
            return !z10 || !S();
        } else if (i10 == 3) {
            E(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
    }

    private final boolean Z(long j10) {
        return X(j10, true);
    }

    /* access modifiers changed from: private */
    public final boolean a0(long j10) {
        return X(j10, false);
    }

    private final boolean c0() {
        long M = M();
        return M == 0 || M == Long.MAX_VALUE;
    }

    private final long d0(i<E> iVar) {
        do {
            int i10 = c.f37983b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (iVar.f38808c * ((long) c.f37983b)) + ((long) i10);
                    if (j10 < P()) {
                        return -1;
                    }
                    while (true) {
                        Object w10 = iVar.w(i10);
                        if (w10 == null || w10 == c.f37986e) {
                            if (iVar.r(i10, w10, c.z())) {
                                iVar.p();
                                break;
                            }
                        } else if (w10 == c.f37985d) {
                            return j10;
                        }
                    }
                } else {
                    iVar = (i) iVar.g();
                }
            }
        } while (iVar != null);
        return -1;
    }

    private final void e0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37951d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 1)));
    }

    private final void f0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37951d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 3)));
    }

    private final void g0() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37951d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                j11 = c.w(j10 & 1152921504606846975L, 2);
            } else if (i10 == 1) {
                j11 = c.w(j10 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
    }

    private final void h0(long j10, i<E> iVar) {
        boolean z10;
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f38808c < j10 && (iVar3 = (i) iVar.e()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.h() || (iVar2 = (i) iVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37957k;
                while (true) {
                    i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (i0Var.f38808c >= iVar.f38808c) {
                        break;
                    } else if (!iVar.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, i0Var, iVar)) {
                        if (i0Var.m()) {
                            i0Var.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void j0(pe.o<? super h<? extends E>> oVar) {
        o.a aVar = o.f38128b;
        oVar.resumeWith(o.b(h.b(h.f38005b.a(N()))));
    }

    /* access modifiers changed from: private */
    public final void k0(pe.o<? super E> oVar) {
        o.a aVar = o.f38128b;
        oVar.resumeWith(o.b(sd.p.a(O())));
    }

    private final Object l0(E e10, xd.d<? super w> dVar) {
        Throwable d10;
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        l<E, w> lVar = this.f37961b;
        if (lVar == null || (d10 = d0.d(lVar, e10, (u0) null, 2, (Object) null)) == null) {
            Throwable Q = Q();
            o.a aVar = o.f38128b;
            if (t0.d()) {
                Q = k0.i(Q, pVar);
            }
            pVar.resumeWith(o.b(sd.p.a(Q)));
        } else {
            b.a(d10, Q());
            o.a aVar2 = o.f38128b;
            if (t0.d()) {
                d10 = k0.i(d10, pVar);
            }
            pVar.resumeWith(o.b(sd.p.a(d10)));
        }
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            h.c(dVar);
        }
        if (z10 == d.c()) {
            return z10;
        }
        return w.f38141a;
    }

    /* access modifiers changed from: private */
    public final void m0(E e10, pe.o<? super w> oVar) {
        l<E, w> lVar = this.f37961b;
        if (lVar != null) {
            d0.b(lVar, e10, oVar.getContext());
        }
        Throwable Q = Q();
        if (t0.d() && (oVar instanceof kotlin.coroutines.jvm.internal.e)) {
            Q = k0.i(Q, (kotlin.coroutines.jvm.internal.e) oVar);
        }
        o.a aVar = o.f38128b;
        oVar.resumeWith(o.b(sd.p.a(Q)));
    }

    /* access modifiers changed from: private */
    public final void p0(k3 k3Var, i<E> iVar, int i10) {
        o0();
        k3Var.a(iVar, i10);
    }

    /* access modifiers changed from: private */
    public final void q0(k3 k3Var, i<E> iVar, int i10) {
        k3Var.a(iVar, i10 + c.f37983b);
    }

    static /* synthetic */ <E> Object r0(b<E> bVar, xd.d<? super E> dVar) {
        i iVar = (i) f37956j.get(bVar);
        while (!bVar.Y()) {
            long andIncrement = f37952f.getAndIncrement(bVar);
            int i10 = c.f37983b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (iVar.f38808c != j10) {
                i h10 = bVar.K(j10, iVar);
                if (h10 == null) {
                    continue;
                } else {
                    iVar = h10;
                }
            }
            Object x10 = bVar.G0(iVar, i11, andIncrement, (Object) null);
            if (x10 == c.f37994m) {
                throw new IllegalStateException("unexpected".toString());
            } else if (x10 == c.f37996o) {
                if (andIncrement < bVar.R()) {
                    iVar.b();
                }
            } else if (x10 == c.f37995n) {
                return bVar.u0(iVar, i11, andIncrement, dVar);
            } else {
                iVar.b();
                return x10;
            }
        }
        throw k0.j(bVar.O());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ <E> java.lang.Object s0(re.b<E> r14, xd.d<? super re.h<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof re.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            re.b$d r0 = (re.b.d) r0
            int r1 = r0.f37974c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f37974c = r1
            goto L_0x0018
        L_0x0013:
            re.b$d r0 = new re.b$d
            r0.<init>(r14, r15)
        L_0x0018:
            r6 = r0
            java.lang.Object r15 = r6.f37972a
            java.lang.Object r0 = yd.d.c()
            int r1 = r6.f37974c
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            sd.p.b(r15)
            re.h r15 = (re.h) r15
            java.lang.Object r14 = r15.k()
            goto L_0x00b6
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0039:
            sd.p.b(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f37956j
            java.lang.Object r1 = r1.get(r14)
            re.i r1 = (re.i) r1
        L_0x0047:
            boolean r3 = r14.Y()
            if (r3 == 0) goto L_0x0059
            re.h$b r15 = re.h.f38005b
            java.lang.Throwable r14 = r14.N()
            java.lang.Object r14 = r15.a(r14)
            goto L_0x00b6
        L_0x0059:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f37952f
            long r4 = r3.getAndIncrement(r14)
            int r3 = re.c.f37983b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f38808c
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0079
            re.i r7 = r14.K(r7, r1)
            if (r7 != 0) goto L_0x0077
            goto L_0x0047
        L_0x0077:
            r13 = r7
            goto L_0x007a
        L_0x0079:
            r13 = r1
        L_0x007a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = r7.G0(r8, r9, r10, r12)
            ue.l0 r7 = re.c.f37994m
            if (r1 == r7) goto L_0x00b7
            ue.l0 r7 = re.c.f37996o
            if (r1 != r7) goto L_0x009c
            long r7 = r14.R()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x009a
            r13.b()
        L_0x009a:
            r1 = r13
            goto L_0x0047
        L_0x009c:
            ue.l0 r15 = re.c.f37995n
            if (r1 != r15) goto L_0x00ad
            r6.f37974c = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.t0(r2, r3, r4, r6)
            if (r14 != r0) goto L_0x00b6
            return r0
        L_0x00ad:
            r13.b()
            re.h$b r14 = re.h.f38005b
            java.lang.Object r14 = r14.c(r1)
        L_0x00b6:
            return r14
        L_0x00b7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.s0(re.b, xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t0(re.i<E> r11, int r12, long r13, xd.d<? super re.h<? extends E>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof re.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            re.b$e r0 = (re.b.e) r0
            int r1 = r0.f37981h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f37981h = r1
            goto L_0x0018
        L_0x0013:
            re.b$e r0 = new re.b$e
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f37979f
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f37981h
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.f37976b
            re.i r11 = (re.i) r11
            java.lang.Object r11 = r0.f37975a
            re.b r11 = (re.b) r11
            sd.p.b(r15)
            goto L_0x0131
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            sd.p.b(r15)
            r0.f37975a = r10
            r0.f37976b = r11
            r0.f37977c = r12
            r0.f37978d = r13
            r0.f37981h = r3
            xd.d r15 = yd.c.b(r0)
            pe.p r15 = pe.r.b(r15)
            re.s r8 = new re.s     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>"
            kotlin.jvm.internal.m.c(r15, r2)     // Catch:{ all -> 0x0138 }
            r8.<init>(r15)     // Catch:{ all -> 0x0138 }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r8
            java.lang.Object r2 = r2.G0(r3, r4, r5, r7)     // Catch:{ all -> 0x0138 }
            ue.l0 r3 = re.c.f37994m     // Catch:{ all -> 0x0138 }
            if (r2 != r3) goto L_0x006d
            r10.p0(r8, r11, r12)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x006d:
            ue.l0 r12 = re.c.f37996o     // Catch:{ all -> 0x0138 }
            r9 = 0
            if (r2 != r12) goto L_0x0107
            long r2 = r10.R()     // Catch:{ all -> 0x0138 }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x007f
            r11.b()     // Catch:{ all -> 0x0138 }
        L_0x007f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f37956j     // Catch:{ all -> 0x0138 }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x0138 }
            re.i r11 = (re.i) r11     // Catch:{ all -> 0x0138 }
        L_0x0089:
            boolean r12 = r10.Y()     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x0094
            r10.j0(r15)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x0094:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = f37952f     // Catch:{ all -> 0x0138 }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x0138 }
            int r14 = re.c.f37983b     // Catch:{ all -> 0x0138 }
            long r2 = (long) r14     // Catch:{ all -> 0x0138 }
            long r2 = r12 / r2
            long r4 = (long) r14     // Catch:{ all -> 0x0138 }
            long r4 = r12 % r4
            int r14 = (int) r4     // Catch:{ all -> 0x0138 }
            long r4 = r11.f38808c     // Catch:{ all -> 0x0138 }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x00b3
            re.i r2 = r10.K(r2, r11)     // Catch:{ all -> 0x0138 }
            if (r2 != 0) goto L_0x00b2
            goto L_0x0089
        L_0x00b2:
            r11 = r2
        L_0x00b3:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r8
            java.lang.Object r2 = r2.G0(r3, r4, r5, r7)     // Catch:{ all -> 0x0138 }
            ue.l0 r3 = re.c.f37994m     // Catch:{ all -> 0x0138 }
            if (r2 != r3) goto L_0x00c6
            r10.p0(r8, r11, r14)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x00c6:
            ue.l0 r14 = re.c.f37996o     // Catch:{ all -> 0x0138 }
            if (r2 != r14) goto L_0x00d8
            long r2 = r10.R()     // Catch:{ all -> 0x0138 }
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 >= 0) goto L_0x0089
            r11.b()     // Catch:{ all -> 0x0138 }
            goto L_0x0089
        L_0x00d8:
            ue.l0 r12 = re.c.f37995n     // Catch:{ all -> 0x0138 }
            if (r2 == r12) goto L_0x00fb
            r11.b()     // Catch:{ all -> 0x0138 }
            re.h$b r11 = re.h.f38005b     // Catch:{ all -> 0x0138 }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x0138 }
            re.h r11 = re.h.b(r11)     // Catch:{ all -> 0x0138 }
            fe.l<E, sd.w> r12 = r10.f37961b     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x00f7
            xd.g r13 = r15.getContext()     // Catch:{ all -> 0x0138 }
            fe.l r9 = ue.d0.a(r12, r2, r13)     // Catch:{ all -> 0x0138 }
        L_0x00f7:
            r15.l(r11, r9)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x00fb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0138 }
            java.lang.String r12 = "unexpected"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0138 }
            r11.<init>(r12)     // Catch:{ all -> 0x0138 }
            throw r11     // Catch:{ all -> 0x0138 }
        L_0x0107:
            r11.b()     // Catch:{ all -> 0x0138 }
            re.h$b r11 = re.h.f38005b     // Catch:{ all -> 0x0138 }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x0138 }
            re.h r11 = re.h.b(r11)     // Catch:{ all -> 0x0138 }
            fe.l<E, sd.w> r12 = r10.f37961b     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x00f7
            xd.g r13 = r15.getContext()     // Catch:{ all -> 0x0138 }
            fe.l r9 = ue.d0.a(r12, r2, r13)     // Catch:{ all -> 0x0138 }
            goto L_0x00f7
        L_0x0121:
            java.lang.Object r15 = r15.z()
            java.lang.Object r11 = yd.d.c()
            if (r15 != r11) goto L_0x012e
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x012e:
            if (r15 != r1) goto L_0x0131
            return r1
        L_0x0131:
            re.h r15 = (re.h) r15
            java.lang.Object r11 = r15.k()
            return r11
        L_0x0138:
            r11 = move-exception
            r15.K()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.t0(re.i, int, long, xd.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: pe.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: xe.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: fe.l<E, sd.w>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: fe.l<java.lang.Throwable, sd.w>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: xe.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: xe.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: xe.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: fe.l<E, sd.w>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: fe.l<java.lang.Throwable, sd.w>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: xe.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: xe.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object u0(re.i<E> r9, int r10, long r11, xd.d<? super E> r13) {
        /*
            r8 = this;
            xd.d r0 = yd.c.b(r13)
            pe.p r0 = pe.r.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.G0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            ue.l0 r2 = re.c.f37994m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x001c
            r8.p0(r0, r9, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x001c:
            ue.l0 r10 = re.c.f37996o     // Catch:{ all -> 0x00d1 }
            r7 = 0
            if (r1 != r10) goto L_0x00b3
            long r1 = r8.R()     // Catch:{ all -> 0x00d1 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x002e
            r9.b()     // Catch:{ all -> 0x00d1 }
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f37956j     // Catch:{ all -> 0x00d1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00d1 }
            re.i r9 = (re.i) r9     // Catch:{ all -> 0x00d1 }
        L_0x0038:
            boolean r10 = r8.Y()     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0043
            r8.k0(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x0043:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f37952f     // Catch:{ all -> 0x00d1 }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x00d1 }
            int r12 = re.c.f37983b     // Catch:{ all -> 0x00d1 }
            long r1 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x00d1 }
            long r3 = r9.f38808c     // Catch:{ all -> 0x00d1 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            re.i r1 = r8.K(r1, r9)     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0061
            goto L_0x0038
        L_0x0061:
            r9 = r1
        L_0x0062:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.G0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            ue.l0 r2 = re.c.f37994m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x007c
            boolean r10 = r0 instanceof pe.k3     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0076
            r7 = r0
        L_0x0076:
            if (r7 == 0) goto L_0x00c3
            r8.p0(r7, r9, r12)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x007c:
            ue.l0 r12 = re.c.f37996o     // Catch:{ all -> 0x00d1 }
            if (r1 != r12) goto L_0x008e
            long r1 = r8.R()     // Catch:{ all -> 0x00d1 }
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0038
            r9.b()     // Catch:{ all -> 0x00d1 }
            goto L_0x0038
        L_0x008e:
            ue.l0 r10 = re.c.f37995n     // Catch:{ all -> 0x00d1 }
            if (r1 == r10) goto L_0x00a7
            r9.b()     // Catch:{ all -> 0x00d1 }
            fe.l<E, sd.w> r9 = r8.f37961b     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            xd.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            fe.l r7 = ue.d0.a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
        L_0x00a3:
            r0.l(r1, r7)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = "unexpected"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00d1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00d1 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00b3:
            r9.b()     // Catch:{ all -> 0x00d1 }
            fe.l<E, sd.w> r9 = r8.f37961b     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            xd.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            fe.l r7 = ue.d0.a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a3
        L_0x00c3:
            java.lang.Object r9 = r0.z()
            java.lang.Object r10 = yd.d.c()
            if (r9 != r10) goto L_0x00d0
            kotlin.coroutines.jvm.internal.h.c(r13)
        L_0x00d0:
            return r9
        L_0x00d1:
            r9 = move-exception
            r0.K()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.u0(re.i, int, long, xd.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        r13 = (re.i) r13.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void v0(re.i<E> r13) {
        /*
            r12 = this;
            fe.l<E, sd.w> r0 = r12.f37961b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = ue.r.b(r1, r2, r1)
        L_0x0008:
            int r4 = re.c.f37983b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b4
            long r6 = r13.f38808c
            int r8 = re.c.f37983b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0017:
            java.lang.Object r8 = r13.w(r4)
            ue.l0 r9 = re.c.f37990i
            if (r8 == r9) goto L_0x00bc
            ue.l0 r9 = re.c.f37985d
            if (r8 != r9) goto L_0x0049
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            ue.l0 r9 = re.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0041
            java.lang.Object r5 = r13.v(r4)
            ue.u0 r1 = ue.d0.c(r0, r5, r1)
        L_0x0041:
            r13.s(r4)
            r13.p()
            goto L_0x00b0
        L_0x0049:
            ue.l0 r9 = re.c.f37986e
            if (r8 == r9) goto L_0x00a3
            if (r8 != 0) goto L_0x0052
            goto L_0x00a3
        L_0x0052:
            boolean r9 = r8 instanceof pe.k3
            if (r9 != 0) goto L_0x006f
            boolean r9 = r8 instanceof re.v
            if (r9 == 0) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            ue.l0 r9 = re.c.f37988g
            if (r8 == r9) goto L_0x00bc
            ue.l0 r9 = re.c.f37987f
            if (r8 != r9) goto L_0x0068
            goto L_0x00bc
        L_0x0068:
            ue.l0 r9 = re.c.f37988g
            if (r8 == r9) goto L_0x0017
            goto L_0x00b0
        L_0x006f:
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            boolean r9 = r8 instanceof re.v
            if (r9 == 0) goto L_0x0081
            r9 = r8
            re.v r9 = (re.v) r9
            pe.k3 r9 = r9.f38023a
            goto L_0x0084
        L_0x0081:
            r9 = r8
            pe.k3 r9 = (pe.k3) r9
        L_0x0084:
            ue.l0 r10 = re.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0098
            java.lang.Object r5 = r13.v(r4)
            ue.u0 r1 = ue.d0.c(r0, r5, r1)
        L_0x0098:
            java.lang.Object r3 = ue.r.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto L_0x00b0
        L_0x00a3:
            ue.l0 r9 = re.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            r13.p()
        L_0x00b0:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b4:
            ue.f r13 = r13.g()
            re.i r13 = (re.i) r13
            if (r13 != 0) goto L_0x0008
        L_0x00bc:
            if (r3 == 0) goto L_0x00e2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x00c8
            pe.k3 r3 = (pe.k3) r3
            r12.x0(r3)
            goto L_0x00e2
        L_0x00c8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.m.c(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        L_0x00d4:
            if (r5 >= r13) goto L_0x00e2
            java.lang.Object r0 = r3.get(r13)
            pe.k3 r0 = (pe.k3) r0
            r12.x0(r0)
            int r13 = r13 + -1
            goto L_0x00d4
        L_0x00e2:
            if (r1 != 0) goto L_0x00e5
            return
        L_0x00e5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.v0(re.i):void");
    }

    private final void w0(k3 k3Var) {
        y0(k3Var, true);
    }

    private final void x0(k3 k3Var) {
        y0(k3Var, false);
    }

    private final void y0(k3 k3Var, boolean z10) {
        if (k3Var instanceof C0428b) {
            pe.o<Boolean> b10 = ((C0428b) k3Var).b();
            o.a aVar = o.f38128b;
            b10.resumeWith(o.b(Boolean.FALSE));
        } else if (k3Var instanceof pe.o) {
            xd.d dVar = (xd.d) k3Var;
            o.a aVar2 = o.f38128b;
            dVar.resumeWith(o.b(sd.p.a(z10 ? O() : Q())));
        } else if (k3Var instanceof s) {
            p<h<? extends E>> pVar = ((s) k3Var).f38022a;
            o.a aVar3 = o.f38128b;
            pVar.resumeWith(o.b(h.b(h.f38005b.a(N()))));
        } else if (k3Var instanceof a) {
            ((a) k3Var).j();
        } else if (k3Var instanceof xe.b) {
            ((xe.b) k3Var).b(this, c.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + k3Var).toString());
        }
    }

    private final boolean z(long j10) {
        return j10 < M() || j10 < P() + ((long) this.f37960a);
    }

    static /* synthetic */ <E> Object z0(b<E> bVar, E e10, xd.d<? super w> dVar) {
        i iVar = (i) f37955i.get(bVar);
        while (true) {
            long andIncrement = f37951d.getAndIncrement(bVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean p10 = bVar.a0(andIncrement);
            int i10 = c.f37983b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (iVar.f38808c != j11) {
                i j12 = bVar.L(j11, iVar);
                if (j12 != null) {
                    iVar = j12;
                } else if (p10) {
                    Object l02 = bVar.l0(e10, dVar);
                    if (l02 == d.c()) {
                        return l02;
                    }
                }
            }
            int y10 = bVar.I0(iVar, i11, e10, j10, (Object) null, p10);
            if (y10 == 0) {
                iVar.b();
                break;
            } else if (y10 == 1) {
                break;
            } else if (y10 != 2) {
                if (y10 == 3) {
                    Object A0 = bVar.A0(iVar, i11, e10, j10, dVar);
                    if (A0 == d.c()) {
                        return A0;
                    }
                } else if (y10 == 4) {
                    if (j10 < bVar.P()) {
                        iVar.b();
                    }
                    Object l03 = bVar.l0(e10, dVar);
                    if (l03 == d.c()) {
                        return l03;
                    }
                } else if (y10 == 5) {
                    iVar.b();
                }
            } else if (p10) {
                iVar.p();
                Object l04 = bVar.l0(e10, dVar);
                if (l04 == d.c()) {
                    return l04;
                }
            } else if (t0.a()) {
                throw new AssertionError();
            }
        }
        return w.f38141a;
    }

    public boolean A(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return D(th, true);
    }

    /* access modifiers changed from: protected */
    public boolean D(Throwable th, boolean z10) {
        if (z10) {
            e0();
        }
        boolean a10 = androidx.concurrent.futures.b.a(f37958l, this, c.f38000s, th);
        if (z10) {
            f0();
        } else {
            g0();
        }
        G();
        i0();
        if (a10) {
            V();
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public final void H(long j10) {
        u0 d10;
        if (!t0.a() || b0()) {
            i iVar = (i) f37956j.get(this);
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f37952f;
                long j11 = atomicLongFieldUpdater.get(this);
                if (j10 >= Math.max(((long) this.f37960a) + j11, M())) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                        int i10 = c.f37983b;
                        long j12 = j11 / ((long) i10);
                        int i11 = (int) (j11 % ((long) i10));
                        if (iVar.f38808c != j12) {
                            i K = K(j12, iVar);
                            if (K == null) {
                                continue;
                            } else {
                                iVar = K;
                            }
                        }
                        Object G0 = G0(iVar, i11, j11, (Object) null);
                        if (G0 != c.f37996o) {
                            iVar.b();
                            l<E, w> lVar = this.f37961b;
                            if (!(lVar == null || (d10 = d0.d(lVar, G0, (u0) null, 2, (Object) null)) == null)) {
                                throw d10;
                            }
                        } else if (j11 < R()) {
                            iVar.b();
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public final void M0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        if (!c0()) {
            do {
            } while (M() <= j10);
            int g10 = c.f37984c;
            int i10 = 0;
            while (i10 < g10) {
                long M = M();
                if (M != (f37954h.get(this) & 4611686018427387903L) || M != M()) {
                    i10++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f37954h;
            do {
                j11 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, c.v(j11 & 4611686018427387903L, true)));
            while (true) {
                long M2 = M();
                atomicLongFieldUpdater = f37954h;
                long j13 = atomicLongFieldUpdater.get(this);
                long j14 = j13 & 4611686018427387903L;
                boolean z10 = (4611686018427387904L & j13) != 0;
                if (M2 == j14 && M2 == M()) {
                    break;
                } else if (!z10) {
                    atomicLongFieldUpdater.compareAndSet(this, j13, c.v(j14, true));
                }
            }
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, c.v(j12 & 4611686018427387903L, false)));
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable N() {
        return (Throwable) f37958l.get(this);
    }

    public final long P() {
        return f37952f.get(this);
    }

    /* access modifiers changed from: protected */
    public final Throwable Q() {
        Throwable N = N();
        return N == null ? new n("Channel was closed") : N;
    }

    public final long R() {
        return f37951d.get(this) & 1152921504606846975L;
    }

    public final boolean S() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37956j;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long P = P();
            if (R() <= P) {
                return false;
            }
            int i10 = c.f37983b;
            long j10 = P / ((long) i10);
            if (iVar.f38808c == j10 || (iVar = K(j10, iVar)) != null) {
                iVar.b();
                if (W(iVar, (int) (P % ((long) i10)), P)) {
                    return true;
                }
                f37952f.compareAndSet(this, P, P + 1);
            } else if (((i) atomicReferenceFieldUpdater.get(this)).f38808c < j10) {
                return false;
            }
        }
    }

    public boolean Y() {
        return Z(f37951d.get(this));
    }

    public Object a() {
        i iVar;
        long j10 = f37952f.get(this);
        long j11 = f37951d.get(this);
        if (Z(j11)) {
            return h.f38005b.a(N());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return h.f38005b.b();
        }
        l0 i10 = c.f37992k;
        i iVar2 = (i) f37956j.get(this);
        while (!Y()) {
            long andIncrement = f37952f.getAndIncrement(this);
            int i11 = c.f37983b;
            long j12 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (iVar2.f38808c != j12) {
                i h10 = K(j12, iVar2);
                if (h10 == null) {
                    continue;
                } else {
                    iVar = h10;
                }
            } else {
                iVar = iVar2;
            }
            Object x10 = G0(iVar, i12, andIncrement, i10);
            if (x10 == c.f37994m) {
                k3 k3Var = i10 instanceof k3 ? (k3) i10 : null;
                if (k3Var != null) {
                    p0(k3Var, iVar, i12);
                }
                M0(andIncrement);
                iVar.p();
                return h.f38005b.b();
            } else if (x10 == c.f37996o) {
                if (andIncrement < R()) {
                    iVar.b();
                }
                iVar2 = iVar;
            } else if (x10 != c.f37995n) {
                iVar.b();
                return h.f38005b.c(x10);
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return h.f38005b.a(N());
    }

    public Object b(xd.d<? super E> dVar) {
        return r0(this, dVar);
    }

    /* access modifiers changed from: protected */
    public boolean b0() {
        return false;
    }

    public Object c(E e10, xd.d<? super w> dVar) {
        return z0(this, e10, dVar);
    }

    public Object d(xd.d<? super h<? extends E>> dVar) {
        return s0(this, dVar);
    }

    public boolean e(Throwable th) {
        return D(th, false);
    }

    public void f(l<? super Throwable, w> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37959m;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != c.f37998q) {
                    if (obj == c.f37999r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.b.a(f37959m, this, c.f37998q, c.f37999r));
            lVar.invoke(N());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return re.h.f38005b.a(Q());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f37951d
            long r0 = r0.get(r14)
            boolean r0 = r14.B0(r0)
            if (r0 == 0) goto L_0x0013
            re.h$b r15 = re.h.f38005b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0013:
            ue.l0 r8 = re.c.f37991j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f37955i
            java.lang.Object r0 = r0.get(r14)
            re.i r0 = (re.i) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f37951d
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.a0(r1)
            int r1 = re.c.f37983b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f38808c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x004e
            re.i r1 = r14.L(r2, r0)
            if (r1 != 0) goto L_0x004c
            if (r11 == 0) goto L_0x0021
            goto L_0x008e
        L_0x004c:
            r13 = r1
            goto L_0x004f
        L_0x004e:
            r13 = r0
        L_0x004f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.I0(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b0
            r1 = 1
            if (r0 == r1) goto L_0x00b3
            r1 = 2
            if (r0 == r1) goto L_0x0089
            r1 = 3
            if (r0 == r1) goto L_0x007d
            r1 = 4
            if (r0 == r1) goto L_0x0071
            r1 = 5
            if (r0 == r1) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r13.b()
        L_0x006f:
            r0 = r13
            goto L_0x0021
        L_0x0071:
            long r0 = r14.P()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x008e
            r13.b()
            goto L_0x008e
        L_0x007d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0089:
            if (r11 == 0) goto L_0x0099
            r13.p()
        L_0x008e:
            re.h$b r15 = re.h.f38005b
            java.lang.Throwable r0 = r14.Q()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00bb
        L_0x0099:
            boolean r15 = r8 instanceof pe.k3
            if (r15 == 0) goto L_0x00a0
            pe.k3 r8 = (pe.k3) r8
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00a6
            r14.q0(r8, r13, r12)
        L_0x00a6:
            r13.p()
            re.h$b r15 = re.h.f38005b
            java.lang.Object r15 = r15.b()
            goto L_0x00bb
        L_0x00b0:
            r13.b()
        L_0x00b3:
            re.h$b r15 = re.h.f38005b
            sd.w r0 = sd.w.f38141a
            java.lang.Object r15 = r15.c(r0)
        L_0x00bb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.g(java.lang.Object):java.lang.Object");
    }

    public final void i(CancellationException cancellationException) {
        A(cancellationException);
    }

    /* access modifiers changed from: protected */
    public void i0() {
    }

    public f<E> iterator() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public void n0() {
    }

    /* access modifiers changed from: protected */
    public void o0() {
    }

    public boolean q() {
        return a0(f37951d.get(this));
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [ue.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e0, code lost:
        r3 = r3.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e7, code lost:
        if (r3 != null) goto L_0x0208;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f37951d
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r3 = (int) r2
            r2 = 3
            r4 = 2
            if (r3 == r4) goto L_0x001e
            if (r3 == r2) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r3 = "cancelled,"
            r1.append(r3)
            goto L_0x0023
        L_0x001e:
            java.lang.String r3 = "closed,"
            r1.append(r3)
        L_0x0023:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "capacity="
            r3.append(r5)
            int r5 = r0.f37960a
            r3.append(r5)
            r5 = 44
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "data=["
            r1.append(r3)
            re.i[] r2 = new re.i[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f37956j
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f37955i
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f37957k
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = td.q.f(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r2.next()
            r8 = r4
            re.i r8 = (re.i) r8
            re.i r9 = re.c.f37982a
            if (r8 == r9) goto L_0x0081
            r8 = 1
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            if (r8 == 0) goto L_0x006c
            r3.add(r4)
            goto L_0x006c
        L_0x0088:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020c
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009d
            goto L_0x00b7
        L_0x009d:
            r4 = r3
            re.i r4 = (re.i) r4
            long r8 = r4.f38808c
        L_0x00a2:
            java.lang.Object r4 = r2.next()
            r10 = r4
            re.i r10 = (re.i) r10
            long r10 = r10.f38808c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b1
            r3 = r4
            r8 = r10
        L_0x00b1:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a2
        L_0x00b7:
            re.i r3 = (re.i) r3
            long r10 = r16.P()
            long r12 = r16.R()
        L_0x00c1:
            int r2 = re.c.f37983b
            r4 = 0
        L_0x00c4:
            if (r4 >= r2) goto L_0x01e0
            long r8 = r3.f38808c
            int r14 = re.c.f37983b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d7
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e9
        L_0x00d7:
            java.lang.Object r15 = r3.w(r4)
            java.lang.Object r6 = r3.v(r4)
            boolean r7 = r15 instanceof pe.o
            if (r7 == 0) goto L_0x00f9
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ed
            if (r14 < 0) goto L_0x00ed
            java.lang.String r7 = "receive"
            goto L_0x01a6
        L_0x00ed:
            if (r14 >= 0) goto L_0x00f5
            if (r7 < 0) goto L_0x00f5
            java.lang.String r7 = "send"
            goto L_0x01a6
        L_0x00f5:
            java.lang.String r7 = "cont"
            goto L_0x01a6
        L_0x00f9:
            boolean r7 = r15 instanceof xe.b
            if (r7 == 0) goto L_0x0113
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0107
            if (r14 < 0) goto L_0x0107
            java.lang.String r7 = "onReceive"
            goto L_0x01a6
        L_0x0107:
            if (r14 >= 0) goto L_0x010f
            if (r7 < 0) goto L_0x010f
            java.lang.String r7 = "onSend"
            goto L_0x01a6
        L_0x010f:
            java.lang.String r7 = "select"
            goto L_0x01a6
        L_0x0113:
            boolean r7 = r15 instanceof re.s
            if (r7 == 0) goto L_0x011b
            java.lang.String r7 = "receiveCatching"
            goto L_0x01a6
        L_0x011b:
            boolean r7 = r15 instanceof re.b.C0428b
            if (r7 == 0) goto L_0x0123
            java.lang.String r7 = "sendBroadcast"
            goto L_0x01a6
        L_0x0123:
            boolean r7 = r15 instanceof re.v
            if (r7 == 0) goto L_0x013f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x01a6
        L_0x013f:
            ue.l0 r7 = re.c.f37987f
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
            if (r7 == 0) goto L_0x014b
            r7 = 1
            goto L_0x0153
        L_0x014b:
            ue.l0 r7 = re.c.f37988g
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0153:
            if (r7 == 0) goto L_0x0158
            java.lang.String r7 = "resuming_sender"
            goto L_0x01a6
        L_0x0158:
            if (r15 != 0) goto L_0x015c
            r7 = 1
            goto L_0x0164
        L_0x015c:
            ue.l0 r7 = re.c.f37986e
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0164:
            if (r7 == 0) goto L_0x0168
            r7 = 1
            goto L_0x0170
        L_0x0168:
            ue.l0 r7 = re.c.f37990i
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0170:
            if (r7 == 0) goto L_0x0174
            r7 = 1
            goto L_0x017c
        L_0x0174:
            ue.l0 r7 = re.c.f37989h
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x017c:
            if (r7 == 0) goto L_0x0180
            r7 = 1
            goto L_0x0188
        L_0x0180:
            ue.l0 r7 = re.c.f37992k
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0188:
            if (r7 == 0) goto L_0x018c
            r7 = 1
            goto L_0x0194
        L_0x018c:
            ue.l0 r7 = re.c.f37991j
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0194:
            if (r7 == 0) goto L_0x0198
            r7 = 1
            goto L_0x01a0
        L_0x0198:
            ue.l0 r7 = re.c.z()
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x01a0:
            if (r7 != 0) goto L_0x01da
            java.lang.String r7 = r15.toString()
        L_0x01a6:
            if (r6 == 0) goto L_0x01c8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01da
        L_0x01c8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01da:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c4
        L_0x01e0:
            ue.f r2 = r3.e()
            r3 = r2
            re.i r3 = (re.i) r3
            if (r3 != 0) goto L_0x0208
        L_0x01e9:
            char r2 = ne.r.C0(r1)
            if (r2 != r5) goto L_0x01fe
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.m.d(r2, r3)
        L_0x01fe:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0208:
            r6 = 0
            r7 = 1
            goto L_0x00c1
        L_0x020c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.toString():java.lang.String");
    }
}
