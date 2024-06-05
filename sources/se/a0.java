package se;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.i1;
import pe.r;
import pe.t0;
import sd.o;
import sd.w;
import te.p;
import ue.l0;
import xd.d;
import xd.g;

/* compiled from: SharedFlow.kt */
public class a0<T> extends te.b<c0> implements u<T>, e, p<T> {

    /* renamed from: f  reason: collision with root package name */
    private final int f38148f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f38149g;

    /* renamed from: h  reason: collision with root package name */
    private final re.a f38150h;

    /* renamed from: i  reason: collision with root package name */
    private Object[] f38151i;

    /* renamed from: j  reason: collision with root package name */
    private long f38152j;

    /* renamed from: k  reason: collision with root package name */
    private long f38153k;

    /* renamed from: l  reason: collision with root package name */
    private int f38154l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f38155m;

    /* compiled from: SharedFlow.kt */
    private static final class a implements i1 {

        /* renamed from: a  reason: collision with root package name */
        public final a0<?> f38156a;

        /* renamed from: b  reason: collision with root package name */
        public long f38157b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f38158c;

        /* renamed from: d  reason: collision with root package name */
        public final d<w> f38159d;

        public a(a0<?> a0Var, long j10, Object obj, d<? super w> dVar) {
            this.f38156a = a0Var;
            this.f38157b = j10;
            this.f38158c = obj;
            this.f38159d = dVar;
        }

        public void dispose() {
            this.f38156a.y(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38160a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                re.a[] r0 = re.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                re.a r1 = re.a.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                re.a r1 = re.a.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                re.a r1 = re.a.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f38160a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: se.a0.b.<clinit>():void");
        }
    }

    @f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
    /* compiled from: SharedFlow.kt */
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38161a;

        /* renamed from: b  reason: collision with root package name */
        Object f38162b;

        /* renamed from: c  reason: collision with root package name */
        Object f38163c;

        /* renamed from: d  reason: collision with root package name */
        Object f38164d;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f38165f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a0<T> f38166g;

        /* renamed from: h  reason: collision with root package name */
        int f38167h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a0<T> a0Var, d<? super c> dVar) {
            super(dVar);
            this.f38166g = a0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f38165f = obj;
            this.f38167h |= RecyclerView.UNDEFINED_DURATION;
            return a0.A(this.f38166g, (f) null, this);
        }
    }

    public a0(int i10, int i11, re.a aVar) {
        this.f38148f = i10;
        this.f38149g = i11;
        this.f38150h = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: se.c0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ <T> java.lang.Object A(se.a0<T> r8, se.f<? super T> r9, xd.d<?> r10) {
        /*
            boolean r0 = r10 instanceof se.a0.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            se.a0$c r0 = (se.a0.c) r0
            int r1 = r0.f38167h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38167h = r1
            goto L_0x0018
        L_0x0013:
            se.a0$c r0 = new se.a0$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f38165f
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38167h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.f38164d
            pe.c2 r8 = (pe.c2) r8
            java.lang.Object r9 = r0.f38163c
            se.c0 r9 = (se.c0) r9
            java.lang.Object r2 = r0.f38162b
            se.f r2 = (se.f) r2
            java.lang.Object r5 = r0.f38161a
            se.a0 r5 = (se.a0) r5
            goto L_0x0054
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.f38164d
            pe.c2 r8 = (pe.c2) r8
            java.lang.Object r9 = r0.f38163c
            se.c0 r9 = (se.c0) r9
            java.lang.Object r2 = r0.f38162b
            se.f r2 = (se.f) r2
            java.lang.Object r5 = r0.f38161a
            se.a0 r5 = (se.a0) r5
        L_0x0054:
            sd.p.b(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x005b:
            r8 = move-exception
            goto L_0x00da
        L_0x005e:
            java.lang.Object r8 = r0.f38163c
            r9 = r8
            se.c0 r9 = (se.c0) r9
            java.lang.Object r8 = r0.f38162b
            se.f r8 = (se.f) r8
            java.lang.Object r2 = r0.f38161a
            se.a0 r2 = (se.a0) r2
            sd.p.b(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00da
        L_0x0075:
            sd.p.b(r10)
            te.d r10 = r8.h()
            se.c0 r10 = (se.c0) r10
            boolean r2 = r9 instanceof se.m0     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            se.m0 r2 = (se.m0) r2     // Catch:{ all -> 0x00d6 }
            r0.f38161a = r8     // Catch:{ all -> 0x00d6 }
            r0.f38162b = r9     // Catch:{ all -> 0x00d6 }
            r0.f38163c = r10     // Catch:{ all -> 0x00d6 }
            r0.f38167h = r5     // Catch:{ all -> 0x00d6 }
            java.lang.Object r2 = r2.d(r0)     // Catch:{ all -> 0x00d6 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            xd.g r2 = r0.getContext()     // Catch:{ all -> 0x00d2 }
            pe.c2$b r5 = pe.c2.B1     // Catch:{ all -> 0x00d2 }
            xd.g$b r2 = r2.get(r5)     // Catch:{ all -> 0x00d2 }
            pe.c2 r2 = (pe.c2) r2     // Catch:{ all -> 0x00d2 }
        L_0x00a3:
            java.lang.Object r5 = r8.U(r9)     // Catch:{ all -> 0x00d2 }
            ue.l0 r6 = se.b0.f38173a     // Catch:{ all -> 0x00d2 }
            if (r5 != r6) goto L_0x00bc
            r0.f38161a = r8     // Catch:{ all -> 0x00d2 }
            r0.f38162b = r10     // Catch:{ all -> 0x00d2 }
            r0.f38163c = r9     // Catch:{ all -> 0x00d2 }
            r0.f38164d = r2     // Catch:{ all -> 0x00d2 }
            r0.f38167h = r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r8.x(r9, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            pe.g2.i(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00c1:
            r0.f38161a = r8     // Catch:{ all -> 0x00d2 }
            r0.f38162b = r10     // Catch:{ all -> 0x00d2 }
            r0.f38163c = r9     // Catch:{ all -> 0x00d2 }
            r0.f38164d = r2     // Catch:{ all -> 0x00d2 }
            r0.f38167h = r3     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00da
        L_0x00d6:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00da:
            r5.k(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: se.a0.A(se.a0, se.f, xd.d):java.lang.Object");
    }

    private final void B(long j10) {
        te.d[] g10;
        if (!(this.f38645b == 0 || (g10 = this.f38644a) == null)) {
            for (te.d dVar : g10) {
                if (dVar != null) {
                    c0 c0Var = (c0) dVar;
                    long j11 = c0Var.f38175a;
                    if (j11 >= 0 && j11 < j10) {
                        c0Var.f38175a = j10;
                    }
                }
            }
        }
        this.f38153k = j10;
    }

    private final void E() {
        Object[] objArr = this.f38151i;
        m.b(objArr);
        b0.g(objArr, K(), (Object) null);
        this.f38154l--;
        long K = K() + 1;
        if (this.f38152j < K) {
            this.f38152j = K;
        }
        if (this.f38153k < K) {
            B(K);
        }
        if (t0.a()) {
            if (!(K() == K)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ <T> Object F(a0<T> a0Var, T t10, d<? super w> dVar) {
        if (a0Var.c(t10)) {
            return w.f38141a;
        }
        Object G = a0Var.G(t10, dVar);
        return G == d.c() ? G : w.f38141a;
    }

    private final Object G(T t10, d<? super w> dVar) {
        d<w>[] dVarArr;
        a aVar;
        pe.p pVar = new pe.p(c.b(dVar), 1);
        pVar.C();
        d<w>[] dVarArr2 = te.c.f38648a;
        synchronized (this) {
            if (R(t10)) {
                o.a aVar2 = o.f38128b;
                pVar.resumeWith(o.b(w.f38141a));
                dVarArr = I(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, ((long) P()) + K(), t10, pVar);
                H(aVar3);
                this.f38155m = this.f38155m + 1;
                if (this.f38149g == 0) {
                    dVarArr2 = I(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            r.a(pVar, aVar);
        }
        for (d<w> dVar2 : dVarArr) {
            if (dVar2 != null) {
                o.a aVar4 = o.f38128b;
                dVar2.resumeWith(o.b(w.f38141a));
            }
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
    public final void H(Object obj) {
        int P = P();
        Object[] objArr = this.f38151i;
        if (objArr == null) {
            objArr = Q((Object[]) null, 0, 2);
        } else if (P >= objArr.length) {
            objArr = Q(objArr, P, objArr.length * 2);
        }
        b0.g(objArr, K() + ((long) P), obj);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (se.c0) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xd.d<sd.w>[] I(xd.d<sd.w>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = r11.f38645b
            if (r1 == 0) goto L_0x0048
            te.d[] r1 = r11.f38644a
            if (r1 == 0) goto L_0x0048
            r2 = 0
            int r3 = r1.length
        L_0x000f:
            if (r2 >= r3) goto L_0x0048
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0045
            se.c0 r4 = (se.c0) r4
            xd.d<? super sd.w> r5 = r4.f38176b
            if (r5 != 0) goto L_0x001c
            goto L_0x0045
        L_0x001c:
            long r6 = r11.T(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0045
            int r6 = r12.length
            if (r0 < r6) goto L_0x003a
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.m.d(r12, r6)
        L_0x003a:
            r6 = r12
            xd.d[] r6 = (xd.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f38176b = r0
            r0 = r7
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0048:
            xd.d[] r12 = (xd.d[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: se.a0.I(xd.d[]):xd.d[]");
    }

    private final long J() {
        return K() + ((long) this.f38154l);
    }

    /* access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f38153k, this.f38152j);
    }

    private final Object M(long j10) {
        Object[] objArr = this.f38151i;
        m.b(objArr);
        Object c10 = b0.f(objArr, j10);
        return c10 instanceof a ? ((a) c10).f38158c : c10;
    }

    private final long N() {
        return K() + ((long) this.f38154l) + ((long) this.f38155m);
    }

    private final int O() {
        return (int) ((K() + ((long) this.f38154l)) - this.f38152j);
    }

    /* access modifiers changed from: private */
    public final int P() {
        return this.f38154l + this.f38155m;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f38151i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + K;
                b0.g(objArr2, j10, b0.f(objArr, j10));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* access modifiers changed from: private */
    public final boolean R(T t10) {
        if (l() == 0) {
            return S(t10);
        }
        if (this.f38154l >= this.f38149g && this.f38153k <= this.f38152j) {
            int i10 = b.f38160a[this.f38150h.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        H(t10);
        int i11 = this.f38154l + 1;
        this.f38154l = i11;
        if (i11 > this.f38149g) {
            E();
        }
        if (O() > this.f38148f) {
            V(this.f38152j + 1, this.f38153k, J(), N());
        }
        return true;
    }

    private final boolean S(T t10) {
        if (t0.a()) {
            if (!(l() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f38148f == 0) {
            return true;
        }
        H(t10);
        int i10 = this.f38154l + 1;
        this.f38154l = i10;
        if (i10 > this.f38148f) {
            E();
        }
        this.f38153k = K() + ((long) this.f38154l);
        return true;
    }

    /* access modifiers changed from: private */
    public final long T(c0 c0Var) {
        long j10 = c0Var.f38175a;
        if (j10 < J()) {
            return j10;
        }
        if (this.f38149g <= 0 && j10 <= K() && this.f38155m != 0) {
            return j10;
        }
        return -1;
    }

    private final Object U(c0 c0Var) {
        Object obj;
        d<w>[] dVarArr = te.c.f38648a;
        synchronized (this) {
            long T = T(c0Var);
            if (T < 0) {
                obj = b0.f38173a;
            } else {
                long j10 = c0Var.f38175a;
                Object M = M(T);
                c0Var.f38175a = T + 1;
                Object obj2 = M;
                dVarArr = W(j10);
                obj = obj2;
            }
        }
        for (d<w> dVar : dVarArr) {
            if (dVar != null) {
                o.a aVar = o.f38128b;
                dVar.resumeWith(o.b(w.f38141a));
            }
        }
        return obj;
    }

    private final void V(long j10, long j11, long j12, long j13) {
        long j14 = j10;
        long j15 = j11;
        long min = Math.min(j15, j14);
        boolean z10 = true;
        if (t0.a()) {
            if (!(min >= K())) {
                throw new AssertionError();
            }
        }
        for (long K = K(); K < min; K++) {
            Object[] objArr = this.f38151i;
            m.b(objArr);
            b0.g(objArr, K, (Object) null);
        }
        this.f38152j = j14;
        this.f38153k = j15;
        this.f38154l = (int) (j12 - min);
        this.f38155m = (int) (j13 - j12);
        if (t0.a()) {
            if (!(this.f38154l >= 0)) {
                throw new AssertionError();
            }
        }
        if (t0.a()) {
            if (!(this.f38155m >= 0)) {
                throw new AssertionError();
            }
        }
        if (t0.a()) {
            if (this.f38152j > K() + ((long) this.f38154l)) {
                z10 = false;
            }
            if (!z10) {
                throw new AssertionError();
            }
        }
    }

    private final Object x(c0 c0Var, d<? super w> dVar) {
        w wVar;
        pe.p pVar = new pe.p(c.b(dVar), 1);
        pVar.C();
        synchronized (this) {
            if (T(c0Var) < 0) {
                c0Var.f38176b = pVar;
                c0Var.f38176b = pVar;
            } else {
                o.a aVar = o.f38128b;
                pVar.resumeWith(o.b(w.f38141a));
            }
            wVar = w.f38141a;
        }
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            h.c(dVar);
        }
        return z10 == d.c() ? z10 : wVar;
    }

    /* access modifiers changed from: private */
    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f38157b >= K()) {
                Object[] objArr = this.f38151i;
                m.b(objArr);
                if (b0.f(objArr, aVar.f38157b) == aVar) {
                    b0.g(objArr, aVar.f38157b, b0.f38173a);
                    z();
                    w wVar = w.f38141a;
                }
            }
        }
    }

    private final void z() {
        if (this.f38149g != 0 || this.f38155m > 1) {
            Object[] objArr = this.f38151i;
            m.b(objArr);
            while (this.f38155m > 0 && b0.f(objArr, (K() + ((long) P())) - 1) == b0.f38173a) {
                this.f38155m--;
                b0.g(objArr, K() + ((long) P()), (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c0 i() {
        return new c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public c0[] j(int i10) {
        return new c0[i10];
    }

    /* access modifiers changed from: protected */
    public final T L() {
        Object[] objArr = this.f38151i;
        m.b(objArr);
        return b0.f(objArr, (this.f38152j + ((long) O())) - 1);
    }

    public final d<w>[] W(long j10) {
        int i10;
        long j11;
        long j12;
        te.d[] g10;
        if (t0.a()) {
            if (!(j10 >= this.f38153k)) {
                throw new AssertionError();
            }
        }
        if (j10 > this.f38153k) {
            return te.c.f38648a;
        }
        long K = K();
        long j13 = ((long) this.f38154l) + K;
        if (this.f38149g == 0 && this.f38155m > 0) {
            j13++;
        }
        if (!(this.f38645b == 0 || (g10 = this.f38644a) == null)) {
            for (te.d dVar : g10) {
                if (dVar != null) {
                    long j14 = ((c0) dVar).f38175a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (t0.a()) {
            if (!(j13 >= this.f38153k)) {
                throw new AssertionError();
            }
        }
        if (j13 <= this.f38153k) {
            return te.c.f38648a;
        }
        long J = J();
        if (l() > 0) {
            i10 = Math.min(this.f38155m, this.f38149g - ((int) (J - j13)));
        } else {
            i10 = this.f38155m;
        }
        d<w>[] dVarArr = te.c.f38648a;
        long j15 = ((long) this.f38155m) + J;
        if (i10 > 0) {
            dVarArr = new d[i10];
            Object[] objArr = this.f38151i;
            m.b(objArr);
            long j16 = J;
            int i11 = 0;
            while (true) {
                if (J >= j15) {
                    j11 = j13;
                    break;
                }
                Object c10 = b0.f(objArr, J);
                l0 l0Var = b0.f38173a;
                j11 = j13;
                if (c10 != l0Var) {
                    m.c(c10, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c10;
                    int i12 = i11 + 1;
                    dVarArr[i11] = aVar.f38159d;
                    b0.g(objArr, J, l0Var);
                    b0.g(objArr, j16, aVar.f38158c);
                    j12 = 1;
                    j16++;
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                } else {
                    j12 = 1;
                }
                J += j12;
                j13 = j11;
            }
            J = j16;
        } else {
            j11 = j13;
        }
        int i13 = (int) (J - K);
        long j17 = l() == 0 ? J : j11;
        long max = Math.max(this.f38152j, J - ((long) Math.min(this.f38148f, i13)));
        if (this.f38149g == 0 && max < j15) {
            Object[] objArr2 = this.f38151i;
            m.b(objArr2);
            if (m.a(b0.f(objArr2, max), b0.f38173a)) {
                J++;
                max++;
            }
        }
        V(max, j17, J, j15);
        z();
        return true ^ (dVarArr.length == 0) ? I(dVarArr) : dVarArr;
    }

    public final long X() {
        long j10 = this.f38152j;
        if (j10 < this.f38153k) {
            this.f38153k = j10;
        }
        return j10;
    }

    public void b() {
        synchronized (this) {
            V(J(), this.f38153k, J(), N());
            w wVar = w.f38141a;
        }
    }

    public boolean c(T t10) {
        int i10;
        boolean z10;
        d<w>[] dVarArr = te.c.f38648a;
        synchronized (this) {
            if (R(t10)) {
                dVarArr = I(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (d<w> dVar : dVarArr) {
            if (dVar != null) {
                o.a aVar = o.f38128b;
                dVar.resumeWith(o.b(w.f38141a));
            }
        }
        return z10;
    }

    public Object collect(f<? super T> fVar, d<?> dVar) {
        return A(this, fVar, dVar);
    }

    public e<T> d(g gVar, int i10, re.a aVar) {
        return b0.e(this, gVar, i10, aVar);
    }

    public Object emit(T t10, d<? super w> dVar) {
        return F(this, t10, dVar);
    }
}
