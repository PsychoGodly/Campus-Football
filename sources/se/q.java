package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.jvm.internal.z;
import sd.w;
import te.s;

/* compiled from: Reduce.kt */
final /* synthetic */ class q {

    /* compiled from: Limit.kt */
    public static final class a implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f38319a;

        public a(z zVar) {
            this.f38319a = zVar;
        }

        public Object emit(T t10, xd.d<? super w> dVar) {
            this.f38319a.f36055a = t10;
            throw new te.a(this);
        }
    }

    /* compiled from: Limit.kt */
    public static final class b implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f38320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f38321b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
        /* compiled from: Limit.kt */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f38322a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f38323b;

            /* renamed from: c  reason: collision with root package name */
            int f38324c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f38325d;

            /* renamed from: f  reason: collision with root package name */
            Object f38326f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, xd.d dVar) {
                super(dVar);
                this.f38325d = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38323b = obj;
                this.f38324c |= RecyclerView.UNDEFINED_DURATION;
                return this.f38325d.emit(null, this);
            }
        }

        public b(p pVar, z zVar) {
            this.f38320a = pVar;
            this.f38321b = zVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r5, xd.d<? super sd.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof se.q.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                se.q$b$a r0 = (se.q.b.a) r0
                int r1 = r0.f38324c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38324c = r1
                goto L_0x0018
            L_0x0013:
                se.q$b$a r0 = new se.q$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f38323b
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38324c
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f38326f
                java.lang.Object r0 = r0.f38322a
                se.q$b r0 = (se.q.b) r0
                sd.p.b(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                sd.p.b(r6)
                fe.p r6 = r4.f38320a
                r0.f38322a = r4
                r0.f38326f = r5
                r0.f38324c = r3
                r2 = 6
                kotlin.jvm.internal.l.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.l.a(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x005f
                kotlin.jvm.internal.z r6 = r0.f38321b
                r6.f36055a = r5
                r3 = 0
            L_0x005f:
                if (r3 == 0) goto L_0x0064
                sd.w r5 = sd.w.f38141a
                return r5
            L_0x0064:
                te.a r5 = new te.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: se.q.b.emit(java.lang.Object, xd.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* compiled from: Reduce.kt */
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38327a;

        /* renamed from: b  reason: collision with root package name */
        Object f38328b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f38329c;

        /* renamed from: d  reason: collision with root package name */
        int f38330d;

        c(xd.d<? super c> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38329c = obj;
            this.f38330d |= RecyclerView.UNDEFINED_DURATION;
            return g.q((e) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* compiled from: Reduce.kt */
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38331a;

        /* renamed from: b  reason: collision with root package name */
        Object f38332b;

        /* renamed from: c  reason: collision with root package name */
        Object f38333c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f38334d;

        /* renamed from: f  reason: collision with root package name */
        int f38335f;

        d(xd.d<? super d> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38334d = obj;
            this.f38335f |= RecyclerView.UNDEFINED_DURATION;
            return g.p((e) null, (p) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {57}, m = "single")
    /* compiled from: Reduce.kt */
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38336a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38337b;

        /* renamed from: c  reason: collision with root package name */
        int f38338c;

        e(xd.d<? super e> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38337b = obj;
            this.f38338c |= RecyclerView.UNDEFINED_DURATION;
            return g.B((e) null, this);
        }
    }

    /* compiled from: Reduce.kt */
    static final class f<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z<Object> f38339a;

        f(z<Object> zVar) {
            this.f38339a = zVar;
        }

        public final Object emit(T t10, xd.d<? super w> dVar) {
            z<Object> zVar = this.f38339a;
            if (zVar.f36055a == s.f38707a) {
                zVar.f36055a = t10;
                return w.f38141a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(se.e<? extends T> r4, fe.p<? super T, ? super xd.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, xd.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof se.q.d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            se.q$d r0 = (se.q.d) r0
            int r1 = r0.f38335f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38335f = r1
            goto L_0x0018
        L_0x0013:
            se.q$d r0 = new se.q$d
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f38334d
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38335f
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.f38333c
            se.q$b r4 = (se.q.b) r4
            java.lang.Object r5 = r0.f38332b
            kotlin.jvm.internal.z r5 = (kotlin.jvm.internal.z) r5
            java.lang.Object r0 = r0.f38331a
            fe.p r0 = (fe.p) r0
            sd.p.b(r6)     // Catch:{ a -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            sd.p.b(r6)
            kotlin.jvm.internal.z r6 = new kotlin.jvm.internal.z
            r6.<init>()
            ue.l0 r2 = te.s.f38707a
            r6.f36055a = r2
            se.q$b r2 = new se.q$b
            r2.<init>(r5, r6)
            r0.f38331a = r5     // Catch:{ a -> 0x0062 }
            r0.f38332b = r6     // Catch:{ a -> 0x0062 }
            r0.f38333c = r2     // Catch:{ a -> 0x0062 }
            r0.f38335f = r3     // Catch:{ a -> 0x0062 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ a -> 0x0062 }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
            r5 = r6
            goto L_0x006a
        L_0x0062:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0067:
            te.o.a(r6, r4)
        L_0x006a:
            T r4 = r5.f36055a
            ue.l0 r5 = te.s.f38707a
            if (r4 == r5) goto L_0x0071
            return r4
        L_0x0071:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.q.a(se.e, fe.p, xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(se.e<? extends T> r4, xd.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof se.q.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            se.q$c r0 = (se.q.c) r0
            int r1 = r0.f38330d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38330d = r1
            goto L_0x0018
        L_0x0013:
            se.q$c r0 = new se.q$c
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f38329c
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38330d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f38328b
            se.q$a r4 = (se.q.a) r4
            java.lang.Object r0 = r0.f38327a
            kotlin.jvm.internal.z r0 = (kotlin.jvm.internal.z) r0
            sd.p.b(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            sd.p.b(r5)
            kotlin.jvm.internal.z r5 = new kotlin.jvm.internal.z
            r5.<init>()
            ue.l0 r2 = te.s.f38707a
            r5.f36055a = r2
            se.q$a r2 = new se.q$a
            r2.<init>(r5)
            r0.f38327a = r5     // Catch:{ a -> 0x005b }
            r0.f38328b = r2     // Catch:{ a -> 0x005b }
            r0.f38330d = r3     // Catch:{ a -> 0x005b }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ a -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            te.o.a(r5, r4)
        L_0x0062:
            T r4 = r0.f36055a
            ue.l0 r5 = te.s.f38707a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.q.b(se.e, xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(se.e<? extends T> r4, xd.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof se.q.e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            se.q$e r0 = (se.q.e) r0
            int r1 = r0.f38338c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38338c = r1
            goto L_0x0018
        L_0x0013:
            se.q$e r0 = new se.q$e
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f38337b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38338c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f38336a
            kotlin.jvm.internal.z r4 = (kotlin.jvm.internal.z) r4
            sd.p.b(r5)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            sd.p.b(r5)
            kotlin.jvm.internal.z r5 = new kotlin.jvm.internal.z
            r5.<init>()
            ue.l0 r2 = te.s.f38707a
            r5.f36055a = r2
            se.q$f r2 = new se.q$f
            r2.<init>(r5)
            r0.f38336a = r5
            r0.f38338c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r4 = r5
        L_0x0052:
            T r4 = r4.f36055a
            ue.l0 r5 = te.s.f38707a
            if (r4 == r5) goto L_0x0059
            return r4
        L_0x0059:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.q.c(se.e, xd.d):java.lang.Object");
    }
}
