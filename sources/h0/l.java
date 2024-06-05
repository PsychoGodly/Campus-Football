package h0;

import com.google.android.gms.common.api.a;
import fe.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.c2;
import pe.p0;
import pe.r0;
import re.g;
import re.h;
import sd.w;
import xd.d;

/* compiled from: SimpleActor.kt */
public final class l<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final p0 f18457a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<T, d<? super w>, Object> f18458b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final re.d<T> f18459c = g.b(a.e.API_PRIORITY_OTHER, (re.a) null, (fe.l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f18460d = new AtomicInteger(0);

    /* compiled from: SimpleActor.kt */
    static final class a extends n implements fe.l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fe.l<Throwable, w> f18461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<T> f18462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, w> f18463c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(fe.l<? super Throwable, w> lVar, l<T> lVar2, p<? super T, ? super Throwable, w> pVar) {
            super(1);
            this.f18461a = lVar;
            this.f18462b = lVar2;
            this.f18463c = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            w wVar;
            this.f18461a.invoke(th);
            this.f18462b.f18459c.e(th);
            do {
                Object f10 = h.f(this.f18462b.f18459c.a());
                if (f10 == null) {
                    wVar = null;
                    continue;
                } else {
                    this.f18463c.invoke(f10, th);
                    wVar = w.f38141a;
                    continue;
                }
            } while (wVar != null);
        }
    }

    @f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    /* compiled from: SimpleActor.kt */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f18464a;

        /* renamed from: b  reason: collision with root package name */
        int f18465b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<T> f18466c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, d<? super b> dVar) {
            super(2, dVar);
            this.f18466c = lVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new b(this.f18466c, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((b) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r7.f18465b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                sd.p.b(r8)
                r8 = r7
                goto L_0x006e
            L_0x0013:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001b:
                java.lang.Object r1 = r7.f18464a
                fe.p r1 = (fe.p) r1
                sd.p.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L_0x0060
            L_0x0026:
                sd.p.b(r8)
                h0.l<T> r8 = r7.f18466c
                java.util.concurrent.atomic.AtomicInteger r8 = r8.f18460d
                int r8 = r8.get()
                if (r8 <= 0) goto L_0x0037
                r8 = 1
                goto L_0x0038
            L_0x0037:
                r8 = 0
            L_0x0038:
                if (r8 == 0) goto L_0x007d
                r8 = r7
            L_0x003b:
                h0.l<T> r1 = r8.f18466c
                pe.p0 r1 = r1.f18457a
                pe.q0.f(r1)
                h0.l<T> r1 = r8.f18466c
                fe.p r1 = r1.f18458b
                h0.l<T> r4 = r8.f18466c
                re.d r4 = r4.f18459c
                r8.f18464a = r1
                r8.f18465b = r3
                java.lang.Object r4 = r4.b(r8)
                if (r4 != r0) goto L_0x005b
                return r0
            L_0x005b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L_0x0060:
                r5 = 0
                r0.f18464a = r5
                r0.f18465b = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L_0x006c
                return r1
            L_0x006c:
                r8 = r0
                r0 = r1
            L_0x006e:
                h0.l<T> r1 = r8.f18466c
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f18460d
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L_0x003b
                sd.w r8 = sd.w.f38141a
                return r8
            L_0x007d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l(p0 p0Var, fe.l<? super Throwable, w> lVar, p<? super T, ? super Throwable, w> pVar, p<? super T, ? super d<? super w>, ? extends Object> pVar2) {
        m.e(p0Var, "scope");
        m.e(lVar, "onComplete");
        m.e(pVar, "onUndeliveredElement");
        m.e(pVar2, "consumeMessage");
        this.f18457a = p0Var;
        this.f18458b = pVar2;
        c2 c2Var = (c2) p0Var.getCoroutineContext().get(c2.B1);
        if (c2Var != null) {
            c2Var.u(new a(lVar, this, pVar));
        }
    }

    public final void e(T t10) {
        Object g10 = this.f18459c.g(t10);
        if (g10 instanceof h.a) {
            Throwable e10 = h.e(g10);
            if (e10 == null) {
                e10 = new re.n("Channel was closed normally");
            }
            throw e10;
        } else if (!h.i(g10)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f18460d.getAndIncrement() == 0) {
            c2 unused = k.d(this.f18457a, (xd.g) null, (r0) null, new b(this, (d<? super b>) null), 3, (Object) null);
        }
    }
}
