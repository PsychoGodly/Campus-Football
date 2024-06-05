package te;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import re.r;
import sd.w;
import se.e;
import xd.d;
import xd.e;

/* compiled from: ChannelFlow.kt */
public abstract class g<S, T> extends e<T> {

    /* renamed from: d  reason: collision with root package name */
    protected final e<S> f38659d;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class a extends l implements p<se.f<? super T>, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38660a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g<S, T> f38662c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g<S, T> gVar, d<? super a> dVar) {
            super(2, dVar);
            this.f38662c = gVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38662c, dVar);
            aVar.f38661b = obj;
            return aVar;
        }

        public final Object invoke(se.f<? super T> fVar, d<? super w> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38660a;
            if (i10 == 0) {
                sd.p.b(obj);
                g<S, T> gVar = this.f38662c;
                this.f38660a = 1;
                if (gVar.q((se.f) this.f38661b, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return w.f38141a;
        }
    }

    public g(e<? extends S> eVar, xd.g gVar, int i10, re.a aVar) {
        super(gVar, i10, aVar);
        this.f38659d = eVar;
    }

    static /* synthetic */ <S, T> Object n(g<S, T> gVar, se.f<? super T> fVar, d<? super w> dVar) {
        if (gVar.f38650b == -3) {
            xd.g context = dVar.getContext();
            xd.g plus = context.plus(gVar.f38649a);
            if (m.a(plus, context)) {
                Object q10 = gVar.q(fVar, dVar);
                return q10 == d.c() ? q10 : w.f38141a;
            }
            e.b bVar = xd.e.E1;
            if (m.a(plus.get(bVar), context.get(bVar))) {
                Object p10 = gVar.p(fVar, plus, dVar);
                return p10 == d.c() ? p10 : w.f38141a;
            }
        }
        Object collect = super.collect(fVar, dVar);
        return collect == d.c() ? collect : w.f38141a;
    }

    static /* synthetic */ <S, T> Object o(g<S, T> gVar, r<? super T> rVar, d<? super w> dVar) {
        Object q10 = gVar.q(new w(rVar), dVar);
        return q10 == d.c() ? q10 : w.f38141a;
    }

    private final Object p(se.f<? super T> fVar, xd.g gVar, d<? super w> dVar) {
        Object c10 = f.c(gVar, f.d(fVar, dVar.getContext()), (Object) null, new a(this, (d<? super a>) null), dVar, 4, (Object) null);
        return c10 == d.c() ? c10 : w.f38141a;
    }

    public Object collect(se.f<? super T> fVar, d<? super w> dVar) {
        return n(this, fVar, dVar);
    }

    /* access modifiers changed from: protected */
    public Object h(r<? super T> rVar, d<? super w> dVar) {
        return o(this, rVar, dVar);
    }

    /* access modifiers changed from: protected */
    public abstract Object q(se.f<? super T> fVar, d<? super w> dVar);

    public String toString() {
        return this.f38659d + " -> " + super.toString();
    }
}
