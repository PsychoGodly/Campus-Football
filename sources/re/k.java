package re;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import re.h;
import sd.o;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: Channels.kt */
final /* synthetic */ class k {

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    /* compiled from: Channels.kt */
    static final class a extends l implements p<p0, d<? super h<? extends w>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38011a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u<E> f38013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E f38014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u<? super E> uVar, E e10, d<? super a> dVar) {
            super(2, dVar);
            this.f38013c = uVar;
            this.f38014d = e10;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38013c, this.f38014d, dVar);
            aVar.f38012b = obj;
            return aVar;
        }

        public final Object invoke(p0 p0Var, d<? super h<w>> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object c10 = d.c();
            int i10 = this.f38011a;
            if (i10 == 0) {
                sd.p.b(obj);
                p0 p0Var = (p0) this.f38012b;
                u<E> uVar = this.f38013c;
                E e10 = this.f38014d;
                o.a aVar = o.f38128b;
                this.f38011a = 1;
                if (uVar.c(e10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    sd.p.b(obj);
                } catch (Throwable th) {
                    o.a aVar2 = o.f38128b;
                    obj2 = o.b(sd.p.a(th));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = o.b(w.f38141a);
            if (o.g(obj2)) {
                obj3 = h.f38005b.c(w.f38141a);
            } else {
                obj3 = h.f38005b.a(o.d(obj2));
            }
            return h.b(obj3);
        }
    }

    public static final <E> Object a(u<? super E> uVar, E e10) {
        Object g10 = uVar.g(e10);
        if (g10 instanceof h.c) {
            return ((h) j.b((g) null, new a(uVar, e10, (d<? super a>) null), 1, (Object) null)).k();
        }
        w wVar = (w) g10;
        return h.f38005b.c(w.f38141a);
    }
}
