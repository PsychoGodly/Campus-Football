package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.q;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import pe.c2;
import pe.t0;
import sd.w;
import ue.k0;
import xd.g;

/* compiled from: Errors.kt */
final /* synthetic */ class n {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f38258b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: se.n$a$a  reason: collision with other inner class name */
        /* compiled from: SafeCollector.common.kt */
        public static final class C0434a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f38259a;

            /* renamed from: b  reason: collision with root package name */
            int f38260b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f38261c;

            /* renamed from: d  reason: collision with root package name */
            Object f38262d;

            /* renamed from: f  reason: collision with root package name */
            Object f38263f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0434a(a aVar, xd.d dVar) {
                super(dVar);
                this.f38261c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38259a = obj;
                this.f38260b |= RecyclerView.UNDEFINED_DURATION;
                return this.f38261c.collect((f) null, this);
            }
        }

        public a(e eVar, q qVar) {
            this.f38257a = eVar;
            this.f38258b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(se.f<? super T> r6, xd.d<? super sd.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof se.n.a.C0434a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                se.n$a$a r0 = (se.n.a.C0434a) r0
                int r1 = r0.f38260b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38260b = r1
                goto L_0x0018
            L_0x0013:
                se.n$a$a r0 = new se.n$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f38259a
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38260b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                sd.p.b(r7)
                goto L_0x006f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.f38263f
                se.f r6 = (se.f) r6
                java.lang.Object r2 = r0.f38262d
                se.n$a r2 = (se.n.a) r2
                sd.p.b(r7)
                goto L_0x0053
            L_0x0040:
                sd.p.b(r7)
                se.e r7 = r5.f38257a
                r0.f38262d = r5
                r0.f38263f = r6
                r0.f38260b = r4
                java.lang.Object r7 = se.g.g(r7, r6, r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r2 = r5
            L_0x0053:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x006f
                fe.q r2 = r2.f38258b
                r4 = 0
                r0.f38262d = r4
                r0.f38263f = r4
                r0.f38260b = r3
                r3 = 6
                kotlin.jvm.internal.l.a(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.l.a(r7)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                sd.w r6 = sd.w.f38141a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: se.n.a.collect(se.f, xd.d):java.lang.Object");
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    /* compiled from: Errors.kt */
    static final class b<T> extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f38264a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38265b;

        /* renamed from: c  reason: collision with root package name */
        int f38266c;

        b(xd.d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38265b = obj;
            this.f38266c |= RecyclerView.UNDEFINED_DURATION;
            return g.g((e) null, (f) null, this);
        }
    }

    /* compiled from: Errors.kt */
    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f<T> f38267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z<Throwable> f38268b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        /* compiled from: Errors.kt */
        static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            Object f38269a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f38270b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c<T> f38271c;

            /* renamed from: d  reason: collision with root package name */
            int f38272d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c<? super T> cVar, xd.d<? super a> dVar) {
                super(dVar);
                this.f38271c = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38270b = obj;
                this.f38272d |= RecyclerView.UNDEFINED_DURATION;
                return this.f38271c.emit(null, this);
            }
        }

        c(f<? super T> fVar, z<Throwable> zVar) {
            this.f38267a = fVar;
            this.f38268b = zVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r5, xd.d<? super sd.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof se.n.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                se.n$c$a r0 = (se.n.c.a) r0
                int r1 = r0.f38272d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38272d = r1
                goto L_0x0018
            L_0x0013:
                se.n$c$a r0 = new se.n$c$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f38270b
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38272d
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f38269a
                se.n$c r5 = (se.n.c) r5
                sd.p.b(r6)     // Catch:{ all -> 0x002d }
                goto L_0x0047
            L_0x002d:
                r6 = move-exception
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                sd.p.b(r6)
                se.f<T> r6 = r4.f38267a     // Catch:{ all -> 0x004a }
                r0.f38269a = r4     // Catch:{ all -> 0x004a }
                r0.f38272d = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
                if (r5 != r1) goto L_0x0047
                return r1
            L_0x0047:
                sd.w r5 = sd.w.f38141a
                return r5
            L_0x004a:
                r6 = move-exception
                r5 = r4
            L_0x004c:
                kotlin.jvm.internal.z<java.lang.Throwable> r5 = r5.f38268b
                r5.f36055a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: se.n.c.emit(java.lang.Object, xd.d):java.lang.Object");
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar, q<? super f<? super T>, ? super Throwable, ? super xd.d<? super w>, ? extends Object> qVar) {
        return new a(eVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(se.e<? extends T> r4, se.f<? super T> r5, xd.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof se.n.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            se.n$b r0 = (se.n.b) r0
            int r1 = r0.f38266c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38266c = r1
            goto L_0x0018
        L_0x0013:
            se.n$b r0 = new se.n$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f38265b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38266c
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.f38264a
            kotlin.jvm.internal.z r4 = (kotlin.jvm.internal.z) r4
            sd.p.b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            sd.p.b(r6)
            kotlin.jvm.internal.z r6 = new kotlin.jvm.internal.z
            r6.<init>()
            se.n$c r2 = new se.n$c     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.f38264a = r6     // Catch:{ all -> 0x0051 }
            r0.f38266c = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.f36055a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L_0x0076
            xd.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            sd.b.a(r4, r5)
            throw r4
        L_0x0072:
            sd.b.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.n.b(se.e, se.f, xd.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, g gVar) {
        c2 c2Var = (c2) gVar.get(c2.B1);
        if (c2Var == null || !c2Var.isCancelled()) {
            return false;
        }
        return d(th, c2Var.L());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (t0.d()) {
                th2 = k0.l(th2);
            }
            if (t0.d()) {
                th = k0.l(th);
            }
            if (m.a(th2, th)) {
                return true;
            }
        }
        return false;
    }
}
