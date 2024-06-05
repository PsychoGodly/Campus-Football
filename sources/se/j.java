package se;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.c2;
import pe.p0;
import pe.r0;
import sd.w;
import te.r;
import xd.d;
import xd.g;

/* compiled from: Collect.kt */
final /* synthetic */ class j {

    @f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* compiled from: Collect.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e<T> f38214b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e<? extends T> eVar, d<? super a> dVar) {
            super(2, dVar);
            this.f38214b = eVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new a(this.f38214b, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38213a;
            if (i10 == 0) {
                sd.p.b(obj);
                e<T> eVar = this.f38214b;
                this.f38213a = 1;
                if (g.i(eVar, this) == c10) {
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

    public static final Object a(e<?> eVar, d<? super w> dVar) {
        Object collect = eVar.collect(r.f38706a, dVar);
        return collect == d.c() ? collect : w.f38141a;
    }

    public static final <T> Object b(e<? extends T> eVar, p<? super T, ? super d<? super w>, ? extends Object> pVar, d<? super w> dVar) {
        Object i10 = g.i(k.b(g.v(eVar, pVar), 0, (re.a) null, 2, (Object) null), dVar);
        return i10 == d.c() ? i10 : w.f38141a;
    }

    public static final <T> Object c(f<? super T> fVar, e<? extends T> eVar, d<? super w> dVar) {
        g.o(fVar);
        Object collect = eVar.collect(fVar, dVar);
        return collect == d.c() ? collect : w.f38141a;
    }

    public static final <T> c2 d(e<? extends T> eVar, p0 p0Var) {
        return k.d(p0Var, (g) null, (r0) null, new a(eVar, (d<? super a>) null), 3, (Object) null);
    }
}
