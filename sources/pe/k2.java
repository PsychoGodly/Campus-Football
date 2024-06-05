package pe;

import fe.l;
import fe.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import sd.w;
import ue.e0;
import ue.k0;
import ue.v;
import ue.w;
import xd.g;

/* compiled from: JobSupport.kt */
public class k2 implements c2, w, t2 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37331a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37332b;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    private static final class a<T> extends p<T> {

        /* renamed from: j  reason: collision with root package name */
        private final k2 f37333j;

        public a(xd.d<? super T> dVar, k2 k2Var) {
            super(dVar, 1);
            this.f37333j = k2Var;
        }

        /* access modifiers changed from: protected */
        public String I() {
            return "AwaitContinuation";
        }

        public Throwable x(c2 c2Var) {
            Throwable e10;
            Object Y = this.f37333j.Y();
            if ((Y instanceof c) && (e10 = ((c) Y).e()) != null) {
                return e10;
            }
            if (Y instanceof c0) {
                return ((c0) Y).f37280a;
            }
            return c2Var.L();
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class b extends j2 {

        /* renamed from: f  reason: collision with root package name */
        private final k2 f37334f;

        /* renamed from: g  reason: collision with root package name */
        private final c f37335g;

        /* renamed from: h  reason: collision with root package name */
        private final v f37336h;

        /* renamed from: i  reason: collision with root package name */
        private final Object f37337i;

        public b(k2 k2Var, c cVar, v vVar, Object obj) {
            this.f37334f = k2Var;
            this.f37335g = cVar;
            this.f37336h = vVar;
            this.f37337i = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            q((Throwable) obj);
            return w.f38141a;
        }

        public void q(Throwable th) {
            this.f37334f.M(this.f37335g, this.f37336h, this.f37337i);
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class c implements x1 {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f37338b;

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f37339c;

        /* renamed from: d  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f37340d;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        private final p2 f37341a;

        static {
            Class<Object> cls = Object.class;
            Class<c> cls2 = c.class;
            f37338b = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleting");
            f37339c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_rootCause");
            f37340d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_exceptionsHolder");
        }

        public c(p2 p2Var, boolean z10, Throwable th) {
            this.f37341a = p2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f37340d.get(this);
        }

        private final void k(Object obj) {
            f37340d.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable e10 = e();
            if (e10 == null) {
                l(th);
            } else if (th != e10) {
                Object d10 = d();
                if (d10 == null) {
                    k(th);
                } else if (d10 instanceof Throwable) {
                    if (th != d10) {
                        ArrayList<Throwable> c10 = c();
                        c10.add(d10);
                        c10.add(th);
                        k(c10);
                    }
                } else if (d10 instanceof ArrayList) {
                    ((ArrayList) d10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
            }
        }

        public p2 b() {
            return this.f37341a;
        }

        public final Throwable e() {
            return (Throwable) f37339c.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return f37338b.get(this) != 0;
        }

        public final boolean h() {
            return d() == l2.f37356e;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d10 = d();
            if (d10 == null) {
                arrayList = c();
            } else if (d10 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(d10);
                arrayList = c10;
            } else if (d10 instanceof ArrayList) {
                arrayList = (ArrayList) d10;
            } else {
                throw new IllegalStateException(("State is " + d10).toString());
            }
            Throwable e10 = e();
            if (e10 != null) {
                arrayList.add(0, e10);
            }
            if (th != null && !m.a(th, e10)) {
                arrayList.add(th);
            }
            k(l2.f37356e);
            return arrayList;
        }

        public boolean isActive() {
            return e() == null;
        }

        public final void j(boolean z10) {
            f37338b.set(this, z10 ? 1 : 0);
        }

        public final void l(Throwable th) {
            f37339c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class d extends w.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k2 f37342d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f37343e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ue.w wVar, k2 k2Var, Object obj) {
            super(wVar);
            this.f37342d = k2Var;
            this.f37343e = obj;
        }

        /* renamed from: f */
        public Object d(ue.w wVar) {
            if (this.f37342d.Y() == this.f37343e) {
                return null;
            }
            return v.a();
        }
    }

    @f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {955, 957}, m = "invokeSuspend")
    /* compiled from: JobSupport.kt */
    static final class e extends k implements p<me.f<? super c2>, xd.d<? super sd.w>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f37344b;

        /* renamed from: c  reason: collision with root package name */
        Object f37345c;

        /* renamed from: d  reason: collision with root package name */
        int f37346d;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f37347f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k2 f37348g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k2 k2Var, xd.d<? super e> dVar) {
            super(2, dVar);
            this.f37348g = k2Var;
        }

        public final xd.d<sd.w> create(Object obj, xd.d<?> dVar) {
            e eVar = new e(this.f37348g, dVar);
            eVar.f37347f = obj;
            return eVar;
        }

        /* renamed from: d */
        public final Object invoke(me.f<? super c2> fVar, xd.d<? super sd.w> dVar) {
            return ((e) create(fVar, dVar)).invokeSuspend(sd.w.f38141a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r7.f37346d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r7.f37345c
                ue.w r1 = (ue.w) r1
                java.lang.Object r3 = r7.f37344b
                ue.u r3 = (ue.u) r3
                java.lang.Object r4 = r7.f37347f
                me.f r4 = (me.f) r4
                sd.p.b(r8)
                r8 = r7
                goto L_0x0083
            L_0x001f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0027:
                sd.p.b(r8)
                goto L_0x0088
            L_0x002b:
                sd.p.b(r8)
                java.lang.Object r8 = r7.f37347f
                me.f r8 = (me.f) r8
                pe.k2 r1 = r7.f37348g
                java.lang.Object r1 = r1.Y()
                boolean r4 = r1 instanceof pe.v
                if (r4 == 0) goto L_0x0049
                pe.v r1 = (pe.v) r1
                pe.w r1 = r1.f37405f
                r7.f37346d = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L_0x0088
                return r0
            L_0x0049:
                boolean r3 = r1 instanceof pe.x1
                if (r3 == 0) goto L_0x0088
                pe.x1 r1 = (pe.x1) r1
                pe.p2 r1 = r1.b()
                if (r1 == 0) goto L_0x0088
                java.lang.Object r3 = r1.i()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.m.c(r3, r4)
                ue.w r3 = (ue.w) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x0065:
                boolean r5 = kotlin.jvm.internal.m.a(r1, r3)
                if (r5 != 0) goto L_0x0088
                boolean r5 = r1 instanceof pe.v
                if (r5 == 0) goto L_0x0083
                r5 = r1
                pe.v r5 = (pe.v) r5
                pe.w r5 = r5.f37405f
                r8.f37347f = r4
                r8.f37344b = r3
                r8.f37345c = r1
                r8.f37346d = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L_0x0083
                return r0
            L_0x0083:
                ue.w r1 = r1.j()
                goto L_0x0065
            L_0x0088:
                sd.w r8 = sd.w.f38141a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.k2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<k2> cls2 = k2.class;
        f37331a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f37332b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_parentHandle");
    }

    public k2(boolean z10) {
        this._state = z10 ? l2.f37358g : l2.f37357f;
    }

    private final void A0(j2 j2Var) {
        j2Var.e(new p2());
        androidx.concurrent.futures.b.a(f37331a, this, j2Var, j2Var.j());
    }

    private final int D0(Object obj) {
        if (obj instanceof l1) {
            if (((l1) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f37331a, this, obj, l2.f37358g)) {
                return -1;
            }
            x0();
            return 1;
        } else if (!(obj instanceof w1)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f37331a, this, obj, ((w1) obj).b())) {
                return -1;
            }
            x0();
            return 1;
        }
    }

    private final Object F(Object obj) {
        Object M0;
        do {
            Object Y = Y();
            if (!(Y instanceof x1) || ((Y instanceof c) && ((c) Y).g())) {
                return l2.f37352a;
            }
            M0 = M0(Y, new c0(N(obj), false, 2, (h) null));
        } while (M0 == l2.f37354c);
        return M0;
    }

    private final String F0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f()) {
                return "Cancelling";
            }
            if (cVar.g()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof x1)) {
            return obj instanceof c0 ? "Cancelled" : "Completed";
        } else {
            if (((x1) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
    }

    private final boolean G(Throwable th) {
        if (d0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        u X = X();
        if (X == null || X == r2.f37394a) {
            return z10;
        }
        if (X.a(th) || z10) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ CancellationException I0(k2 k2Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return k2Var.H0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final void K(x1 x1Var, Object obj) {
        u X = X();
        if (X != null) {
            X.dispose();
            C0(r2.f37394a);
        }
        Throwable th = null;
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            th = c0Var.f37280a;
        }
        if (x1Var instanceof j2) {
            try {
                ((j2) x1Var).q(th);
            } catch (Throwable th2) {
                b0(new f0("Exception in completion handler " + x1Var + " for " + this, th2));
            }
        } else {
            p2 b10 = x1Var.b();
            if (b10 != null) {
                s0(b10, th);
            }
        }
    }

    private final boolean K0(x1 x1Var, Object obj) {
        if (t0.a()) {
            if (!((x1Var instanceof l1) || (x1Var instanceof j2))) {
                throw new AssertionError();
            }
        }
        if (t0.a() && !(!(obj instanceof c0))) {
            throw new AssertionError();
        } else if (!androidx.concurrent.futures.b.a(f37331a, this, x1Var, l2.g(obj))) {
            return false;
        } else {
            t0((Throwable) null);
            u0(obj);
            K(x1Var, obj);
            return true;
        }
    }

    private final boolean L0(x1 x1Var, Throwable th) {
        if (t0.a() && !(!(x1Var instanceof c))) {
            throw new AssertionError();
        } else if (!t0.a() || x1Var.isActive()) {
            p2 W = W(x1Var);
            if (W == null) {
                return false;
            }
            if (!androidx.concurrent.futures.b.a(f37331a, this, x1Var, new c(W, false, th))) {
                return false;
            }
            r0(W, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: private */
    public final void M(c cVar, v vVar, Object obj) {
        if (t0.a()) {
            if (!(Y() == cVar)) {
                throw new AssertionError();
            }
        }
        v q02 = q0(vVar);
        if (q02 == null || !O0(cVar, q02, obj)) {
            x(O(cVar, obj));
        }
    }

    private final Object M0(Object obj, Object obj2) {
        if (!(obj instanceof x1)) {
            return l2.f37352a;
        }
        if ((!(obj instanceof l1) && !(obj instanceof j2)) || (obj instanceof v) || (obj2 instanceof c0)) {
            return N0((x1) obj, obj2);
        }
        if (K0((x1) obj, obj2)) {
            return obj2;
        }
        return l2.f37354c;
    }

    private final Throwable N(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new d2(H(), (Throwable) null, this);
            }
            return th;
        }
        m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((t2) obj).w0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0082, code lost:
        r3 = (java.lang.Throwable) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0085, code lost:
        if (r2 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0087, code lost:
        r0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008a, code lost:
        r9 = P(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008e, code lost:
        if (r9 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0094, code lost:
        if (O0(r1, r9, r10) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0098, code lost:
        return pe.l2.f37353b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        return O(r1, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object N0(pe.x1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            pe.p2 r0 = r8.W(r9)
            if (r0 != 0) goto L_0x000b
            ue.l0 r9 = pe.l2.f37354c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof pe.k2.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            pe.k2$c r1 = (pe.k2.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            pe.k2$c r1 = new pe.k2$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.z r4 = new kotlin.jvm.internal.z
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.g()     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x002f
            ue.l0 r9 = pe.l2.f37352a     // Catch:{ all -> 0x009e }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.j(r5)     // Catch:{ all -> 0x009e }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f37331a     // Catch:{ all -> 0x009e }
            boolean r6 = androidx.concurrent.futures.b.a(r6, r8, r9, r1)     // Catch:{ all -> 0x009e }
            if (r6 != 0) goto L_0x0043
            ue.l0 r9 = pe.l2.f37354c     // Catch:{ all -> 0x009e }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = pe.t0.a()     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0057
            boolean r6 = r1.h()     // Catch:{ all -> 0x009e }
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x009e }
            r9.<init>()     // Catch:{ all -> 0x009e }
            throw r9     // Catch:{ all -> 0x009e }
        L_0x0057:
            boolean r6 = r1.f()     // Catch:{ all -> 0x009e }
            boolean r7 = r10 instanceof pe.c0     // Catch:{ all -> 0x009e }
            if (r7 == 0) goto L_0x0063
            r7 = r10
            pe.c0 r7 = (pe.c0) r7     // Catch:{ all -> 0x009e }
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            if (r7 == 0) goto L_0x006b
            java.lang.Throwable r7 = r7.f37280a     // Catch:{ all -> 0x009e }
            r1.a(r7)     // Catch:{ all -> 0x009e }
        L_0x006b:
            java.lang.Throwable r7 = r1.e()     // Catch:{ all -> 0x009e }
            if (r6 != 0) goto L_0x0072
            r3 = 1
        L_0x0072:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x009e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x007d
            r2 = r7
        L_0x007d:
            r4.f36055a = r2     // Catch:{ all -> 0x009e }
            sd.w r3 = sd.w.f38141a     // Catch:{ all -> 0x009e }
            monitor-exit(r1)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L_0x008a
            r8.r0(r0, r2)
        L_0x008a:
            pe.v r9 = r8.P(r9)
            if (r9 == 0) goto L_0x0099
            boolean r9 = r8.O0(r1, r9, r10)
            if (r9 == 0) goto L_0x0099
            ue.l0 r9 = pe.l2.f37353b
            return r9
        L_0x0099:
            java.lang.Object r9 = r8.O(r1, r10)
            return r9
        L_0x009e:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.k2.N0(pe.x1, java.lang.Object):java.lang.Object");
    }

    private final Object O(c cVar, Object obj) {
        boolean f10;
        Throwable T;
        boolean z10 = true;
        if (t0.a()) {
            if (!(Y() == cVar)) {
                throw new AssertionError();
            }
        }
        if (t0.a() && !(!cVar.h())) {
            throw new AssertionError();
        } else if (!t0.a() || cVar.g()) {
            c0 c0Var = obj instanceof c0 ? (c0) obj : null;
            Throwable th = c0Var != null ? c0Var.f37280a : null;
            synchronized (cVar) {
                f10 = cVar.f();
                List<Throwable> i10 = cVar.i(th);
                T = T(cVar, i10);
                if (T != null) {
                    w(T, i10);
                }
            }
            if (!(T == null || T == th)) {
                obj = new c0(T, false, 2, (h) null);
            }
            if (T != null) {
                if (!G(T) && !a0(T)) {
                    z10 = false;
                }
                if (z10) {
                    m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((c0) obj).b();
                }
            }
            if (!f10) {
                t0(T);
            }
            u0(obj);
            boolean a10 = androidx.concurrent.futures.b.a(f37331a, this, cVar, l2.g(obj));
            if (!t0.a() || a10) {
                K(cVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    private final boolean O0(c cVar, v vVar, Object obj) {
        while (c2.a.d(vVar.f37405f, false, false, new b(this, cVar, vVar, obj), 1, (Object) null) == r2.f37394a) {
            vVar = q0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    private final v P(x1 x1Var) {
        v vVar = x1Var instanceof v ? (v) x1Var : null;
        if (vVar != null) {
            return vVar;
        }
        p2 b10 = x1Var.b();
        if (b10 != null) {
            return q0(b10);
        }
        return null;
    }

    private final Throwable S(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f37280a;
        }
        return null;
    }

    private final Throwable T(c cVar, List<? extends Throwable> list) {
        T t10;
        boolean z10;
        T t11 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (!(((Throwable) t10) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t10;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof e3) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof e3)) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                    if (z10) {
                        t11 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t11;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.f()) {
            return new d2(H(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    private final p2 W(x1 x1Var) {
        p2 b10 = x1Var.b();
        if (b10 != null) {
            return b10;
        }
        if (x1Var instanceof l1) {
            return new p2();
        }
        if (x1Var instanceof j2) {
            A0((j2) x1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + x1Var).toString());
    }

    private final boolean f0() {
        Object Y;
        do {
            Y = Y();
            if (!(Y instanceof x1)) {
                return false;
            }
        } while (D0(Y) < 0);
        return true;
    }

    private final Object i0(xd.d<? super sd.w> dVar) {
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        r.a(pVar, u(new v2(pVar)));
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (z10 == d.c()) {
            return z10;
        }
        return sd.w.f38141a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r0(((pe.k2.c) r2).b(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return pe.l2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object j0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.Y()
            boolean r3 = r2 instanceof pe.k2.c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            pe.k2$c r3 = (pe.k2.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.h()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            ue.l0 r7 = pe.l2.f37355d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            pe.k2$c r3 = (pe.k2.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.f()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.N(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            pe.k2$c r7 = (pe.k2.c) r7     // Catch:{ all -> 0x004e }
            r7.a(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            pe.k2$c r7 = (pe.k2.c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            pe.k2$c r2 = (pe.k2.c) r2
            pe.p2 r7 = r2.b()
            r6.r0(r7, r0)
        L_0x0049:
            ue.l0 r7 = pe.l2.f37352a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof pe.x1
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.N(r7)
        L_0x005b:
            r3 = r2
            pe.x1 r3 = (pe.x1) r3
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.L0(r3, r1)
            if (r2 == 0) goto L_0x0002
            ue.l0 r7 = pe.l2.f37352a
            return r7
        L_0x006f:
            pe.c0 r3 = new pe.c0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.M0(r2, r3)
            ue.l0 r4 = pe.l2.f37352a
            if (r3 == r4) goto L_0x0087
            ue.l0 r2 = pe.l2.f37354c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            ue.l0 r7 = pe.l2.f37355d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.k2.j0(java.lang.Object):java.lang.Object");
    }

    private final j2 o0(l<? super Throwable, sd.w> lVar, boolean z10) {
        j2 j2Var = null;
        if (z10) {
            if (lVar instanceof e2) {
                j2Var = (e2) lVar;
            }
            if (j2Var == null) {
                j2Var = new a2(lVar);
            }
        } else {
            if (lVar instanceof j2) {
                j2Var = (j2) lVar;
            }
            if (j2Var == null) {
                j2Var = new b2(lVar);
            } else if (t0.a() && !(!(j2Var instanceof e2))) {
                throw new AssertionError();
            }
        }
        j2Var.s(this);
        return j2Var;
    }

    private final v q0(ue.w wVar) {
        while (wVar.l()) {
            wVar = wVar.k();
        }
        while (true) {
            wVar = wVar.j();
            if (!wVar.l()) {
                if (wVar instanceof v) {
                    return (v) wVar;
                }
                if (wVar instanceof p2) {
                    return null;
                }
            }
        }
    }

    private final void r0(p2 p2Var, Throwable th) {
        t0(th);
        Object i10 = p2Var.i();
        m.c(i10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        f0 f0Var = null;
        for (ue.w wVar = (ue.w) i10; !m.a(wVar, p2Var); wVar = wVar.j()) {
            if (wVar instanceof e2) {
                j2 j2Var = (j2) wVar;
                try {
                    j2Var.q(th);
                } catch (Throwable th2) {
                    if (f0Var != null) {
                        b.a(f0Var, th2);
                    } else {
                        f0Var = new f0("Exception in completion handler " + j2Var + " for " + this, th2);
                        sd.w wVar2 = sd.w.f38141a;
                    }
                }
            }
        }
        if (f0Var != null) {
            b0(f0Var);
        }
        G(th);
    }

    private final void s0(p2 p2Var, Throwable th) {
        Object i10 = p2Var.i();
        m.c(i10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        f0 f0Var = null;
        for (ue.w wVar = (ue.w) i10; !m.a(wVar, p2Var); wVar = wVar.j()) {
            if (wVar instanceof j2) {
                j2 j2Var = (j2) wVar;
                try {
                    j2Var.q(th);
                } catch (Throwable th2) {
                    if (f0Var != null) {
                        b.a(f0Var, th2);
                    } else {
                        f0Var = new f0("Exception in completion handler " + j2Var + " for " + this, th2);
                        sd.w wVar2 = sd.w.f38141a;
                    }
                }
            }
        }
        if (f0Var != null) {
            b0(f0Var);
        }
    }

    private final boolean v(Object obj, p2 p2Var, j2 j2Var) {
        int p10;
        d dVar = new d(j2Var, this, obj);
        do {
            p10 = p2Var.k().p(j2Var, p2Var, dVar);
            if (p10 == 1) {
                return true;
            }
        } while (p10 != 2);
        return false;
    }

    private final void w(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable l10 = !t0.d() ? th : k0.l(th);
            for (Throwable th2 : list) {
                if (t0.d()) {
                    th2 = k0.l(th2);
                }
                if (th2 != th && th2 != l10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    b.a(th, th2);
                }
            }
        }
    }

    private final Object z(xd.d<Object> dVar) {
        a aVar = new a(c.b(dVar), this);
        aVar.C();
        r.a(aVar, u(new u2(aVar)));
        Object z10 = aVar.z();
        if (z10 == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [pe.w1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void z0(pe.l1 r3) {
        /*
            r2 = this;
            pe.p2 r0 = new pe.p2
            r0.<init>()
            boolean r1 = r3.isActive()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            pe.w1 r1 = new pe.w1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f37331a
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.k2.z0(pe.l1):void");
    }

    public final me.d<c2> A() {
        return h.b(new e(this, (xd.d<? super e>) null));
    }

    public final Throwable B() {
        Object Y = Y();
        if (!(Y instanceof x1)) {
            return S(Y);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B0(pe.j2 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.Y()
            boolean r1 = r0 instanceof pe.j2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f37331a
            pe.l1 r2 = pe.l2.f37358g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof pe.x1
            if (r1 == 0) goto L_0x0027
            pe.x1 r0 = (pe.x1) r0
            pe.p2 r0 = r0.b()
            if (r0 == 0) goto L_0x0027
            r4.m()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.k2.B0(pe.j2):void");
    }

    public final boolean C(Throwable th) {
        return D(th);
    }

    public final void C0(u uVar) {
        f37332b.set(this, uVar);
    }

    public final boolean D(Object obj) {
        Object a10 = l2.f37352a;
        if (V() && (a10 = F(obj)) == l2.f37353b) {
            return true;
        }
        if (a10 == l2.f37352a) {
            a10 = j0(obj);
        }
        if (a10 == l2.f37352a || a10 == l2.f37353b) {
            return true;
        }
        if (a10 == l2.f37355d) {
            return false;
        }
        x(a10);
        return true;
    }

    public void E(Throwable th) {
        D(th);
    }

    /* access modifiers changed from: protected */
    public String H() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    public final CancellationException H0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = H();
            }
            cancellationException = new d2(str, th, this);
        }
        return cancellationException;
    }

    public boolean I(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!D(th) || !U()) {
            return false;
        }
        return true;
    }

    public final String J0() {
        return p0() + '{' + F0(Y()) + '}';
    }

    public final CancellationException L() {
        Object Y = Y();
        if (Y instanceof c) {
            Throwable e10 = ((c) Y).e();
            if (e10 != null) {
                CancellationException H0 = H0(e10, u0.a(this) + " is cancelling");
                if (H0 != null) {
                    return H0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (Y instanceof x1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (Y instanceof c0) {
            return I0(this, ((c0) Y).f37280a, (String) null, 1, (Object) null);
        } else {
            return new d2(u0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public final Object Q() {
        Object Y = Y();
        if (!(!(Y instanceof x1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(Y instanceof c0)) {
            return l2.h(Y);
        } else {
            throw ((c0) Y).f37280a;
        }
    }

    public final void Q0(t2 t2Var) {
        D(t2Var);
    }

    public final i1 R(boolean z10, boolean z11, l<? super Throwable, sd.w> lVar) {
        j2 o02 = o0(lVar, z10);
        while (true) {
            Object Y = Y();
            if (Y instanceof l1) {
                l1 l1Var = (l1) Y;
                if (!l1Var.isActive()) {
                    z0(l1Var);
                } else if (androidx.concurrent.futures.b.a(f37331a, this, Y, o02)) {
                    return o02;
                }
            } else {
                Throwable th = null;
                if (Y instanceof x1) {
                    p2 b10 = ((x1) Y).b();
                    if (b10 == null) {
                        m.c(Y, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        A0((j2) Y);
                    } else {
                        i1 i1Var = r2.f37394a;
                        if (z10 && (Y instanceof c)) {
                            synchronized (Y) {
                                th = ((c) Y).e();
                                if (th == null || ((lVar instanceof v) && !((c) Y).g())) {
                                    if (v(Y, b10, o02)) {
                                        if (th == null) {
                                            return o02;
                                        }
                                        i1Var = o02;
                                    }
                                }
                                sd.w wVar = sd.w.f38141a;
                            }
                        }
                        if (th != null) {
                            if (z11) {
                                lVar.invoke(th);
                            }
                            return i1Var;
                        } else if (v(Y, b10, o02)) {
                            return o02;
                        }
                    }
                } else {
                    if (z11) {
                        c0 c0Var = Y instanceof c0 ? (c0) Y : null;
                        if (c0Var != null) {
                            th = c0Var.f37280a;
                        }
                        lVar.invoke(th);
                    }
                    return r2.f37394a;
                }
            }
        }
    }

    public boolean U() {
        return true;
    }

    public boolean V() {
        return false;
    }

    public final u X() {
        return (u) f37332b.get(this);
    }

    public final Object Y() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37331a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof e0)) {
                return obj;
            }
            ((e0) obj).a(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a0(Throwable th) {
        return false;
    }

    public void b0(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void c0(c2 c2Var) {
        if (t0.a()) {
            if (!(X() == null)) {
                throw new AssertionError();
            }
        }
        if (c2Var == null) {
            C0(r2.f37394a);
            return;
        }
        c2Var.start();
        u h02 = c2Var.h0(this);
        C0(h02);
        if (h()) {
            h02.dispose();
            C0(r2.f37394a);
        }
    }

    /* access modifiers changed from: protected */
    public boolean d0() {
        return false;
    }

    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return c2.a.b(this, r10, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return c2.a.c(this, cVar);
    }

    public final g.c<?> getKey() {
        return c2.B1;
    }

    public c2 getParent() {
        u X = X();
        if (X != null) {
            return X.getParent();
        }
        return null;
    }

    public final boolean h() {
        return !(Y() instanceof x1);
    }

    public final u h0(w wVar) {
        i1 d10 = c2.a.d(this, true, false, new v(wVar), 2, (Object) null);
        m.c(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (u) d10;
    }

    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d2(H(), (Throwable) null, this);
        }
        E(cancellationException);
    }

    public boolean isActive() {
        Object Y = Y();
        return (Y instanceof x1) && ((x1) Y).isActive();
    }

    public final boolean isCancelled() {
        Object Y = Y();
        return (Y instanceof c0) || ((Y instanceof c) && ((c) Y).f());
    }

    public final boolean k0(Object obj) {
        Object M0;
        do {
            M0 = M0(Y(), obj);
            if (M0 == l2.f37352a) {
                return false;
            }
            if (M0 == l2.f37353b) {
                return true;
            }
        } while (M0 == l2.f37354c);
        x(M0);
        return true;
    }

    public final Object m0(Object obj) {
        Object M0;
        do {
            M0 = M0(Y(), obj);
            if (M0 == l2.f37352a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, S(obj));
            }
        } while (M0 == l2.f37354c);
        return M0;
    }

    public g minusKey(g.c<?> cVar) {
        return c2.a.e(this, cVar);
    }

    public String p0() {
        return u0.a(this);
    }

    public g plus(g gVar) {
        return c2.a.f(this, gVar);
    }

    public final boolean start() {
        int D0;
        do {
            D0 = D0(Y());
            if (D0 == 0) {
                return false;
            }
        } while (D0 != 1);
        return true;
    }

    /* access modifiers changed from: protected */
    public void t0(Throwable th) {
    }

    public String toString() {
        return J0() + '@' + u0.b(this);
    }

    public final i1 u(l<? super Throwable, sd.w> lVar) {
        return R(false, true, lVar);
    }

    /* access modifiers changed from: protected */
    public void u0(Object obj) {
    }

    public CancellationException w0() {
        Throwable th;
        Object Y = Y();
        CancellationException cancellationException = null;
        if (Y instanceof c) {
            th = ((c) Y).e();
        } else if (Y instanceof c0) {
            th = ((c0) Y).f37280a;
        } else if (!(Y instanceof x1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + Y).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new d2("Parent job is " + F0(Y), th, this);
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void x0() {
    }

    /* access modifiers changed from: protected */
    public final Object y(xd.d<Object> dVar) {
        Object Y;
        do {
            Y = Y();
            if (!(Y instanceof x1)) {
                if (!(Y instanceof c0)) {
                    return l2.h(Y);
                }
                Throwable th = ((c0) Y).f37280a;
                if (!t0.d()) {
                    throw th;
                } else if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                    throw th;
                } else {
                    throw k0.i(th, (kotlin.coroutines.jvm.internal.e) dVar);
                }
            }
        } while (D0(Y) < 0);
        return z(dVar);
    }

    public final Object y0(xd.d<? super sd.w> dVar) {
        if (!f0()) {
            g2.j(dVar.getContext());
            return sd.w.f38141a;
        }
        Object i02 = i0(dVar);
        return i02 == d.c() ? i02 : sd.w.f38141a;
    }
}
