package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import fe.q;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import sd.w;

/* compiled from: Limit.kt */
final /* synthetic */ class o {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f38279b;

        public a(e eVar, p pVar) {
            this.f38278a = eVar;
            this.f38279b = pVar;
        }

        public Object collect(f<? super T> fVar, xd.d<? super w> dVar) {
            Object collect = this.f38278a.collect(new b(new v(), fVar, this.f38279b), dVar);
            if (collect == d.c()) {
                return collect;
            }
            return w.f38141a;
        }
    }

    /* compiled from: Limit.kt */
    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f38280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f<T> f38281b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<T, xd.d<? super Boolean>, Object> f38282c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* compiled from: Limit.kt */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f38283a;

            /* renamed from: b  reason: collision with root package name */
            Object f38284b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f38285c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b<T> f38286d;

            /* renamed from: f  reason: collision with root package name */
            int f38287f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b<? super T> bVar, xd.d<? super a> dVar) {
                super(dVar);
                this.f38286d = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38285c = obj;
                this.f38287f |= RecyclerView.UNDEFINED_DURATION;
                return this.f38286d.emit(null, this);
            }
        }

        b(v vVar, f<? super T> fVar, p<? super T, ? super xd.d<? super Boolean>, ? extends Object> pVar) {
            this.f38280a = vVar;
            this.f38281b = fVar;
            this.f38282c = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r7, xd.d<? super sd.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof se.o.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                se.o$b$a r0 = (se.o.b.a) r0
                int r1 = r0.f38287f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38287f = r1
                goto L_0x0018
            L_0x0013:
                se.o$b$a r0 = new se.o$b$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f38285c
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38287f
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                sd.p.b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f38284b
                java.lang.Object r2 = r0.f38283a
                se.o$b r2 = (se.o.b) r2
                sd.p.b(r8)
                goto L_0x006c
            L_0x0041:
                sd.p.b(r8)
                goto L_0x0059
            L_0x0045:
                sd.p.b(r8)
                kotlin.jvm.internal.v r8 = r6.f38280a
                boolean r8 = r8.f36051a
                if (r8 == 0) goto L_0x005c
                se.f<T> r8 = r6.f38281b
                r0.f38287f = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                sd.w r7 = sd.w.f38141a
                return r7
            L_0x005c:
                fe.p<T, xd.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f38282c
                r0.f38283a = r6
                r0.f38284b = r7
                r0.f38287f = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                kotlin.jvm.internal.v r8 = r2.f38280a
                r8.f36051a = r5
                se.f<T> r8 = r2.f38281b
                r2 = 0
                r0.f38283a = r2
                r0.f38284b = r2
                r0.f38287f = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                sd.w r7 = sd.w.f38141a
                return r7
            L_0x008b:
                sd.w r7 = sd.w.f38141a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: se.o.b.emit(java.lang.Object, xd.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
    /* compiled from: Limit.kt */
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38288a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38289b;

        /* renamed from: c  reason: collision with root package name */
        int f38290c;

        c(xd.d<? super c> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38289b = obj;
            this.f38290c |= RecyclerView.UNDEFINED_DURATION;
            return o.c((f) null, null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class d implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38292b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
        /* compiled from: SafeCollector.common.kt */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f38293a;

            /* renamed from: b  reason: collision with root package name */
            int f38294b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f38295c;

            /* renamed from: d  reason: collision with root package name */
            Object f38296d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, xd.d dVar2) {
                super(dVar2);
                this.f38295c = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38293a = obj;
                this.f38294b |= RecyclerView.UNDEFINED_DURATION;
                return this.f38295c.collect((f) null, this);
            }
        }

        public d(e eVar, int i10) {
            this.f38291a = eVar;
            this.f38292b = i10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(se.f<? super T> r7, xd.d<? super sd.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof se.o.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                se.o$d$a r0 = (se.o.d.a) r0
                int r1 = r0.f38294b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38294b = r1
                goto L_0x0018
            L_0x0013:
                se.o$d$a r0 = new se.o$d$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f38293a
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38294b
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.f38296d
                se.f r7 = (se.f) r7
                sd.p.b(r8)     // Catch:{ a -> 0x0051 }
                goto L_0x0055
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                sd.p.b(r8)
                kotlin.jvm.internal.x r8 = new kotlin.jvm.internal.x
                r8.<init>()
                se.e r2 = r6.f38291a     // Catch:{ a -> 0x0051 }
                se.o$e r4 = new se.o$e     // Catch:{ a -> 0x0051 }
                int r5 = r6.f38292b     // Catch:{ a -> 0x0051 }
                r4.<init>(r8, r5, r7)     // Catch:{ a -> 0x0051 }
                r0.f38296d = r7     // Catch:{ a -> 0x0051 }
                r0.f38294b = r3     // Catch:{ a -> 0x0051 }
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch:{ a -> 0x0051 }
                if (r7 != r1) goto L_0x0055
                return r1
            L_0x0051:
                r8 = move-exception
                te.o.a(r8, r7)
            L_0x0055:
                sd.w r7 = sd.w.f38141a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: se.o.d.collect(se.f, xd.d):java.lang.Object");
        }
    }

    /* compiled from: Limit.kt */
    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f38297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f38299c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
        /* compiled from: Limit.kt */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f38300a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e<T> f38301b;

            /* renamed from: c  reason: collision with root package name */
            int f38302c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e<? super T> eVar, xd.d<? super a> dVar) {
                super(dVar);
                this.f38301b = eVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38300a = obj;
                this.f38302c |= RecyclerView.UNDEFINED_DURATION;
                return this.f38301b.emit(null, this);
            }
        }

        e(x xVar, int i10, f<? super T> fVar) {
            this.f38297a = xVar;
            this.f38298b = i10;
            this.f38299c = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, xd.d<? super sd.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof se.o.e.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                se.o$e$a r0 = (se.o.e.a) r0
                int r1 = r0.f38302c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38302c = r1
                goto L_0x0018
            L_0x0013:
                se.o$e$a r0 = new se.o$e$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f38300a
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38302c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                sd.p.b(r7)
                goto L_0x005f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                sd.p.b(r7)
                goto L_0x0051
            L_0x0038:
                sd.p.b(r7)
                kotlin.jvm.internal.x r7 = r5.f38297a
                int r2 = r7.f36053a
                int r2 = r2 + r4
                r7.f36053a = r2
                int r7 = r5.f38298b
                if (r2 >= r7) goto L_0x0054
                se.f<T> r7 = r5.f38299c
                r0.f38302c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                sd.w r6 = sd.w.f38141a
                return r6
            L_0x0054:
                se.f<T> r7 = r5.f38299c
                r0.f38302c = r3
                java.lang.Object r6 = se.o.c(r7, r6, r0)
                if (r6 != r1) goto L_0x005f
                return r1
            L_0x005f:
                sd.w r6 = sd.w.f38141a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: se.o.e.emit(java.lang.Object, xd.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    /* compiled from: Limit.kt */
    static final class f extends l implements p<f<? super R>, xd.d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38303a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38304b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f38305c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<f<? super R>, T, xd.d<? super Boolean>, Object> f38306d;

        /* compiled from: Limit.kt */
        public static final class a implements f<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f38307a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f38308b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {142}, m = "emit")
            /* renamed from: se.o$f$a$a  reason: collision with other inner class name */
            /* compiled from: Limit.kt */
            public static final class C0435a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f38309a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f38310b;

                /* renamed from: c  reason: collision with root package name */
                int f38311c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a f38312d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0435a(a aVar, xd.d dVar) {
                    super(dVar);
                    this.f38312d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f38310b = obj;
                    this.f38311c |= RecyclerView.UNDEFINED_DURATION;
                    return this.f38312d.emit(null, this);
                }
            }

            public a(q qVar, f fVar) {
                this.f38307a = qVar;
                this.f38308b = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(T r5, xd.d<? super sd.w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof se.o.f.a.C0435a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    se.o$f$a$a r0 = (se.o.f.a.C0435a) r0
                    int r1 = r0.f38311c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f38311c = r1
                    goto L_0x0018
                L_0x0013:
                    se.o$f$a$a r0 = new se.o$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f38310b
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.f38311c
                    r3 = 1
                    if (r2 == 0) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    java.lang.Object r5 = r0.f38309a
                    se.o$f$a r5 = (se.o.f.a) r5
                    sd.p.b(r6)
                    goto L_0x0050
                L_0x002d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0035:
                    sd.p.b(r6)
                    fe.q r6 = r4.f38307a
                    se.f r2 = r4.f38308b
                    r0.f38309a = r4
                    r0.f38311c = r3
                    r3 = 6
                    kotlin.jvm.internal.l.a(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.l.a(r5)
                    if (r6 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    r5 = r4
                L_0x0050:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L_0x005b
                    sd.w r5 = sd.w.f38141a
                    return r5
                L_0x005b:
                    te.a r6 = new te.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: se.o.f.a.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e<? extends T> eVar, q<? super f<? super R>, ? super T, ? super xd.d<? super Boolean>, ? extends Object> qVar, xd.d<? super f> dVar) {
            super(2, dVar);
            this.f38305c = eVar;
            this.f38306d = qVar;
        }

        public final xd.d<w> create(Object obj, xd.d<?> dVar) {
            f fVar = new f(this.f38305c, this.f38306d, dVar);
            fVar.f38304b = obj;
            return fVar;
        }

        public final Object invoke(f<? super R> fVar, xd.d<? super w> dVar) {
            return ((f) create(fVar, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object c10 = d.c();
            int i10 = this.f38303a;
            if (i10 == 0) {
                sd.p.b(obj);
                e<T> eVar = this.f38305c;
                a aVar2 = new a(this.f38306d, (f) this.f38304b);
                try {
                    this.f38304b = aVar2;
                    this.f38303a = 1;
                    if (eVar.collect(aVar2, this) == c10) {
                        return c10;
                    }
                } catch (te.a e10) {
                    e = e10;
                    aVar = aVar2;
                    te.o.a(e, aVar);
                    return w.f38141a;
                }
            } else if (i10 == 1) {
                aVar = (a) this.f38304b;
                try {
                    sd.p.b(obj);
                } catch (te.a e11) {
                    e = e11;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return w.f38141a;
        }
    }

    public static final <T> e<T> b(e<? extends T> eVar, p<? super T, ? super xd.d<? super Boolean>, ? extends Object> pVar) {
        return new a(eVar, pVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(se.f<? super T> r4, T r5, xd.d<? super sd.w> r6) {
        /*
            boolean r0 = r6 instanceof se.o.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            se.o$c r0 = (se.o.c) r0
            int r1 = r0.f38290c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38290c = r1
            goto L_0x0018
        L_0x0013:
            se.o$c r0 = new se.o$c
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f38289b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38290c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.f38288a
            se.f r4 = (se.f) r4
            sd.p.b(r6)
            goto L_0x0043
        L_0x0035:
            sd.p.b(r6)
            r0.f38288a = r4
            r0.f38290c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            te.a r5 = new te.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.o.c(se.f, java.lang.Object, xd.d):java.lang.Object");
    }

    public static final <T> e<T> d(e<? extends T> eVar, int i10) {
        if (i10 > 0) {
            return new d(eVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T, R> e<R> e(e<? extends T> eVar, q<? super f<? super R>, ? super T, ? super xd.d<? super Boolean>, ? extends Object> qVar) {
        return g.r(new f(eVar, qVar, (xd.d<? super f>) null));
    }
}
