package te;

import fe.p;
import fe.q;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.g2;
import sd.o;
import sd.w;
import se.f;
import xd.g;
import xd.h;

/* compiled from: SafeCollector.kt */
public final class t<T> extends d implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f38710a;

    /* renamed from: b  reason: collision with root package name */
    public final g f38711b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38712c;

    /* renamed from: d  reason: collision with root package name */
    private g f38713d;

    /* renamed from: f  reason: collision with root package name */
    private xd.d<? super w> f38714f;

    /* compiled from: SafeCollector.kt */
    static final class a extends n implements p<Integer, g.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38715a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public t(f<? super T> fVar, g gVar) {
        super(q.f38704a, h.f39347a);
        this.f38710a = fVar;
        this.f38711b = gVar;
        this.f38712c = ((Number) gVar.fold(0, a.f38715a)).intValue();
    }

    private final void d(g gVar, g gVar2, T t10) {
        if (gVar2 instanceof l) {
            g((l) gVar2, t10);
        }
        v.a(this, gVar);
    }

    private final Object f(xd.d<? super w> dVar, T t10) {
        g context = dVar.getContext();
        g2.j(context);
        g gVar = this.f38713d;
        if (gVar != context) {
            d(context, gVar, t10);
            this.f38713d = context;
        }
        this.f38714f = dVar;
        q a10 = u.f38716a;
        f<T> fVar = this.f38710a;
        m.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        m.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a10.invoke(fVar, t10, this);
        if (!m.a(invoke, d.c())) {
            this.f38714f = null;
        }
        return invoke;
    }

    private final void g(l lVar, Object obj) {
        throw new IllegalStateException(h.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f38702a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t10, xd.d<? super w> dVar) {
        try {
            Object f10 = f(dVar, t10);
            if (f10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return f10 == d.c() ? f10 : w.f38141a;
        } catch (Throwable th) {
            this.f38713d = new l(th, dVar.getContext());
            throw th;
        }
    }

    public e getCallerFrame() {
        xd.d<? super w> dVar = this.f38714f;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        g gVar = this.f38713d;
        return gVar == null ? h.f39347a : gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable d10 = o.d(obj);
        if (d10 != null) {
            this.f38713d = new l(d10, getContext());
        }
        xd.d<? super w> dVar = this.f38714f;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return d.c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
