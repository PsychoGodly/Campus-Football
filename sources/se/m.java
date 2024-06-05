package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import fe.q;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

/* compiled from: Emitters.kt */
final /* synthetic */ class m {

    @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
    /* compiled from: Emitters.kt */
    static final class a<T> extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f38232a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38233b;

        /* renamed from: c  reason: collision with root package name */
        int f38234c;

        a(xd.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38233b = obj;
            this.f38234c |= RecyclerView.UNDEFINED_DURATION;
            return m.c((f) null, (q) null, (Throwable) null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class b implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f38236b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
        /* compiled from: SafeCollector.common.kt */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f38237a;

            /* renamed from: b  reason: collision with root package name */
            int f38238b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f38239c;

            /* renamed from: d  reason: collision with root package name */
            Object f38240d;

            /* renamed from: f  reason: collision with root package name */
            Object f38241f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, xd.d dVar) {
                super(dVar);
                this.f38239c = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38237a = obj;
                this.f38238b |= RecyclerView.UNDEFINED_DURATION;
                return this.f38239c.collect((f) null, this);
            }
        }

        public b(e eVar, q qVar) {
            this.f38235a = eVar;
            this.f38236b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(se.f<? super T> r9, xd.d<? super sd.w> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof se.m.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                se.m$b$a r0 = (se.m.b.a) r0
                int r1 = r0.f38238b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38238b = r1
                goto L_0x0018
            L_0x0013:
                se.m$b$a r0 = new se.m$b$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f38237a
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38238b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0054
                if (r2 == r5) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r9 = r0.f38240d
                te.t r9 = (te.t) r9
                sd.p.b(r10)     // Catch:{ all -> 0x0034 }
                goto L_0x0088
            L_0x0034:
                r10 = move-exception
                goto L_0x0092
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.f38240d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                sd.p.b(r10)
                goto L_0x00ac
            L_0x0046:
                java.lang.Object r9 = r0.f38241f
                se.f r9 = (se.f) r9
                java.lang.Object r2 = r0.f38240d
                se.m$b r2 = (se.m.b) r2
                sd.p.b(r10)     // Catch:{ all -> 0x0052 }
                goto L_0x0067
            L_0x0052:
                r9 = move-exception
                goto L_0x0098
            L_0x0054:
                sd.p.b(r10)
                se.e r10 = r8.f38235a     // Catch:{ all -> 0x0096 }
                r0.f38240d = r8     // Catch:{ all -> 0x0096 }
                r0.f38241f = r9     // Catch:{ all -> 0x0096 }
                r0.f38238b = r5     // Catch:{ all -> 0x0096 }
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch:{ all -> 0x0096 }
                if (r10 != r1) goto L_0x0066
                return r1
            L_0x0066:
                r2 = r8
            L_0x0067:
                te.t r10 = new te.t
                xd.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                fe.q r9 = r2.f38236b     // Catch:{ all -> 0x008e }
                r0.f38240d = r10     // Catch:{ all -> 0x008e }
                r0.f38241f = r6     // Catch:{ all -> 0x008e }
                r0.f38238b = r3     // Catch:{ all -> 0x008e }
                r2 = 6
                kotlin.jvm.internal.l.a(r2)     // Catch:{ all -> 0x008e }
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch:{ all -> 0x008e }
                r0 = 7
                kotlin.jvm.internal.l.a(r0)     // Catch:{ all -> 0x008e }
                if (r9 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r9 = r10
            L_0x0088:
                r9.releaseIntercepted()
                sd.w r9 = sd.w.f38141a
                return r9
            L_0x008e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L_0x0092:
                r9.releaseIntercepted()
                throw r10
            L_0x0096:
                r9 = move-exception
                r2 = r8
            L_0x0098:
                se.o0 r10 = new se.o0
                r10.<init>(r9)
                fe.q r2 = r2.f38236b
                r0.f38240d = r9
                r0.f38241f = r6
                r0.f38238b = r4
                java.lang.Object r10 = se.m.c(r10, r2, r9, r0)
                if (r10 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: se.m.b.collect(se.f, xd.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class c implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f38242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f38243b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        /* compiled from: SafeCollector.common.kt */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f38244a;

            /* renamed from: b  reason: collision with root package name */
            int f38245b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f38246c;

            /* renamed from: d  reason: collision with root package name */
            Object f38247d;

            /* renamed from: f  reason: collision with root package name */
            Object f38248f;

            /* renamed from: g  reason: collision with root package name */
            Object f38249g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, xd.d dVar) {
                super(dVar);
                this.f38246c = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38244a = obj;
                this.f38245b |= RecyclerView.UNDEFINED_DURATION;
                return this.f38246c.collect((f) null, this);
            }
        }

        public c(p pVar, e eVar) {
            this.f38242a = pVar;
            this.f38243b = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(se.f<? super T> r7, xd.d<? super sd.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof se.m.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                se.m$c$a r0 = (se.m.c.a) r0
                int r1 = r0.f38245b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38245b = r1
                goto L_0x0018
            L_0x0013:
                se.m$c$a r0 = new se.m$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f38244a
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38245b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                sd.p.b(r8)
                goto L_0x0083
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                java.lang.Object r7 = r0.f38249g
                te.t r7 = (te.t) r7
                java.lang.Object r2 = r0.f38248f
                se.f r2 = (se.f) r2
                java.lang.Object r4 = r0.f38247d
                se.m$c r4 = (se.m.c) r4
                sd.p.b(r8)     // Catch:{ all -> 0x0044 }
                goto L_0x006e
            L_0x0044:
                r8 = move-exception
                goto L_0x008a
            L_0x0046:
                sd.p.b(r8)
                te.t r8 = new te.t
                xd.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                fe.p r2 = r6.f38242a     // Catch:{ all -> 0x0086 }
                r0.f38247d = r6     // Catch:{ all -> 0x0086 }
                r0.f38248f = r7     // Catch:{ all -> 0x0086 }
                r0.f38249g = r8     // Catch:{ all -> 0x0086 }
                r0.f38245b = r4     // Catch:{ all -> 0x0086 }
                r4 = 6
                kotlin.jvm.internal.l.a(r4)     // Catch:{ all -> 0x0086 }
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch:{ all -> 0x0086 }
                r4 = 7
                kotlin.jvm.internal.l.a(r4)     // Catch:{ all -> 0x0086 }
                if (r2 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x006e:
                r7.releaseIntercepted()
                se.e r7 = r4.f38243b
                r8 = 0
                r0.f38247d = r8
                r0.f38248f = r8
                r0.f38249g = r8
                r0.f38245b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x0083:
                sd.w r7 = sd.w.f38141a
                return r7
            L_0x0086:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x008a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: se.m.c.collect(se.f, xd.d):java.lang.Object");
        }
    }

    public static final void b(f<?> fVar) {
        if (fVar instanceof o0) {
            throw ((o0) fVar).f38313a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(se.f<? super T> r4, fe.q<? super se.f<? super T>, ? super java.lang.Throwable, ? super xd.d<? super sd.w>, ? extends java.lang.Object> r5, java.lang.Throwable r6, xd.d<? super sd.w> r7) {
        /*
            boolean r0 = r7 instanceof se.m.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            se.m$a r0 = (se.m.a) r0
            int r1 = r0.f38234c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38234c = r1
            goto L_0x0018
        L_0x0013:
            se.m$a r0 = new se.m$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f38233b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38234c
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f38232a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            sd.p.b(r7)     // Catch:{ all -> 0x0047 }
            goto L_0x0044
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            sd.p.b(r7)
            r0.f38232a = r6     // Catch:{ all -> 0x0047 }
            r0.f38234c = r3     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x0047 }
            if (r4 != r1) goto L_0x0044
            return r1
        L_0x0044:
            sd.w r4 = sd.w.f38141a
            return r4
        L_0x0047:
            r4 = move-exception
            if (r6 == 0) goto L_0x004f
            if (r6 == r4) goto L_0x004f
            sd.b.a(r4, r6)
        L_0x004f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.m.c(se.f, fe.q, java.lang.Throwable, xd.d):java.lang.Object");
    }

    public static final <T> e<T> d(e<? extends T> eVar, q<? super f<? super T>, ? super Throwable, ? super xd.d<? super w>, ? extends Object> qVar) {
        return new b(eVar, qVar);
    }

    public static final <T> e<T> e(e<? extends T> eVar, p<? super f<? super T>, ? super xd.d<? super w>, ? extends Object> pVar) {
        return new c(pVar, eVar);
    }
}
