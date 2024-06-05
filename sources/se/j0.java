package se;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;
import te.b;
import te.p;
import te.s;
import xd.g;

/* compiled from: StateFlow.kt */
final class j0<T> extends b<l0> implements v<T>, e, p<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38215g = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: f  reason: collision with root package name */
    private int f38216f;

    @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    /* compiled from: StateFlow.kt */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f38217a;

        /* renamed from: b  reason: collision with root package name */
        Object f38218b;

        /* renamed from: c  reason: collision with root package name */
        Object f38219c;

        /* renamed from: d  reason: collision with root package name */
        Object f38220d;

        /* renamed from: f  reason: collision with root package name */
        Object f38221f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f38222g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j0<T> f38223h;

        /* renamed from: i  reason: collision with root package name */
        int f38224i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j0<T> j0Var, xd.d<? super a> dVar) {
            super(dVar);
            this.f38223h = j0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f38222g = obj;
            this.f38224i |= RecyclerView.UNDEFINED_DURATION;
            return this.f38223h.collect((f) null, this);
        }
    }

    public j0(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r8 = (se.l0[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r8 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r3 >= r0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r6.f38216f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r8 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r6.f38216f = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = m();
        r0 = sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f38215g     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r7 == 0) goto L_0x0012
            boolean r7 = kotlin.jvm.internal.m.a(r1, r7)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0012
            monitor-exit(r6)
            return r2
        L_0x0012:
            boolean r7 = kotlin.jvm.internal.m.a(r1, r8)     // Catch:{ all -> 0x005e }
            r1 = 1
            if (r7 == 0) goto L_0x001b
            monitor-exit(r6)
            return r1
        L_0x001b:
            r0.set(r6, r8)     // Catch:{ all -> 0x005e }
            int r7 = r6.f38216f     // Catch:{ all -> 0x005e }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r1
            r6.f38216f = r7     // Catch:{ all -> 0x005e }
            te.d[] r8 = r6.m()     // Catch:{ all -> 0x005e }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
        L_0x002e:
            se.l0[] r8 = (se.l0[]) r8
            if (r8 == 0) goto L_0x0040
            int r0 = r8.length
            r3 = 0
        L_0x0034:
            if (r3 >= r0) goto L_0x0040
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003d
            r4.g()
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0040:
            monitor-enter(r6)
            int r8 = r6.f38216f     // Catch:{ all -> 0x0055 }
            if (r8 != r7) goto L_0x004a
            int r7 = r7 + r1
            r6.f38216f = r7     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r1
        L_0x004a:
            te.d[] r7 = r6.m()     // Catch:{ all -> 0x0055 }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002e
        L_0x0055:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f38216f = r7     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r1
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: se.j0.p(java.lang.Object, java.lang.Object):boolean");
    }

    public boolean a(T t10, T t11) {
        if (t10 == null) {
            t10 = s.f38707a;
        }
        if (t11 == null) {
            t11 = s.f38707a;
        }
        return p(t10, t11);
    }

    public void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public boolean c(T t10) {
        setValue(t10);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: se.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: se.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2 A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(se.f<? super T> r11, xd.d<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof se.j0.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            se.j0$a r0 = (se.j0.a) r0
            int r1 = r0.f38224i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38224i = r1
            goto L_0x0018
        L_0x0013:
            se.j0$a r0 = new se.j0$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f38222g
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38224i
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.f38221f
            java.lang.Object r2 = r0.f38220d
            pe.c2 r2 = (pe.c2) r2
            java.lang.Object r6 = r0.f38219c
            se.l0 r6 = (se.l0) r6
            java.lang.Object r7 = r0.f38218b
            se.f r7 = (se.f) r7
            java.lang.Object r8 = r0.f38217a
            se.j0 r8 = (se.j0) r8
            sd.p.b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.f38221f
            java.lang.Object r2 = r0.f38220d
            pe.c2 r2 = (pe.c2) r2
            java.lang.Object r6 = r0.f38219c
            se.l0 r6 = (se.l0) r6
            java.lang.Object r7 = r0.f38218b
            se.f r7 = (se.f) r7
            java.lang.Object r8 = r0.f38217a
            se.j0 r8 = (se.j0) r8
            sd.p.b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d4
        L_0x0061:
            java.lang.Object r11 = r0.f38219c
            r6 = r11
            se.l0 r6 = (se.l0) r6
            java.lang.Object r11 = r0.f38218b
            se.f r11 = (se.f) r11
            java.lang.Object r2 = r0.f38217a
            r8 = r2
            se.j0 r8 = (se.j0) r8
            sd.p.b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00f0
        L_0x0076:
            sd.p.b(r12)
            te.d r12 = r10.h()
            se.l0 r12 = (se.l0) r12
            boolean r2 = r11 instanceof se.m0     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            se.m0 r2 = (se.m0) r2     // Catch:{ all -> 0x00ed }
            r0.f38217a = r10     // Catch:{ all -> 0x00ed }
            r0.f38218b = r11     // Catch:{ all -> 0x00ed }
            r0.f38219c = r12     // Catch:{ all -> 0x00ed }
            r0.f38224i = r6     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r2.d(r0)     // Catch:{ all -> 0x00ed }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            xd.g r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            pe.c2$b r2 = pe.c2.B1     // Catch:{ all -> 0x0073 }
            xd.g$b r12 = r12.get(r2)     // Catch:{ all -> 0x0073 }
            pe.c2 r12 = (pe.c2) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f38215g     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00b1
            pe.g2.i(r2)     // Catch:{ all -> 0x0073 }
        L_0x00b1:
            if (r11 == 0) goto L_0x00b9
            boolean r9 = kotlin.jvm.internal.m.a(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d4
        L_0x00b9:
            ue.l0 r11 = te.s.f38707a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bf
            r11 = r3
            goto L_0x00c0
        L_0x00bf:
            r11 = r12
        L_0x00c0:
            r0.f38217a = r8     // Catch:{ all -> 0x0073 }
            r0.f38218b = r7     // Catch:{ all -> 0x0073 }
            r0.f38219c = r6     // Catch:{ all -> 0x0073 }
            r0.f38220d = r2     // Catch:{ all -> 0x0073 }
            r0.f38221f = r12     // Catch:{ all -> 0x0073 }
            r0.f38224i = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r11 = r12
        L_0x00d4:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.f38217a = r8     // Catch:{ all -> 0x0073 }
            r0.f38218b = r7     // Catch:{ all -> 0x0073 }
            r0.f38219c = r6     // Catch:{ all -> 0x0073 }
            r0.f38220d = r2     // Catch:{ all -> 0x0073 }
            r0.f38221f = r11     // Catch:{ all -> 0x0073 }
            r0.f38224i = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00ed:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00f0:
            r8.k(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: se.j0.collect(se.f, xd.d):java.lang.Object");
    }

    public e<T> d(g gVar, int i10, re.a aVar) {
        return k0.d(this, gVar, i10, aVar);
    }

    public Object emit(T t10, xd.d<? super w> dVar) {
        setValue(t10);
        return w.f38141a;
    }

    public T getValue() {
        T t10 = s.f38707a;
        T t11 = f38215g.get(this);
        if (t11 == t10) {
            return null;
        }
        return t11;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public l0 i() {
        return new l0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public l0[] j(int i10) {
        return new l0[i10];
    }

    public void setValue(T t10) {
        if (t10 == null) {
            t10 = s.f38707a;
        }
        p((Object) null, t10);
    }
}
